﻿//
// Copyright (c) 2021 iterate GmbH. All rights reserved.
// http://cyberduck.io/
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
//
// Bug fixes, suggestions and comments should be sent to:
// feedback@cyberduck.io
//

using ch.cyberduck.core;
using ch.cyberduck.core.exception;
using ch.cyberduck.core.preferences;
using Ch.Cyberduck.Core.CredentialManager;
using org.apache.logging.log4j;
using System;
using System.Net;
using System.Text;
using static Windows.Win32.Security.Credentials.CRED_PERSIST;
using static Windows.Win32.Security.Credentials.CRED_TYPE;

namespace Ch.Cyberduck.Core
{
    public class CredentialManagerPasswordStore : DefaultHostPasswordStore
    {
        private static Logger logger = LogManager.getLogger(typeof(CredentialManagerPasswordStore).FullName);

        private readonly HostUrlProvider hostUrlProvider = new HostUrlProvider();

        public override void addPassword(string serviceName, string user, string password)
        {
            var hostUrl = $"{serviceName} - {user}";
            if (!WinCredentialManager.SaveCredentials(hostUrl, new NetworkCredential(user, password)))
            {
                throw new LocalAccessDeniedException($"Could not save credentials for \"{hostUrl}\" to Windows Credential Manager.");
            }
        }

        public override void addPassword(Scheme scheme, int port, string hostName, string user, string password)
        {
            var hostUrl = hostUrlProvider.get(scheme, port, user, hostName, string.Empty);
            if (!WinCredentialManager.SaveCredentials(hostUrl, new NetworkCredential(user, password)))
            {
                throw new LocalAccessDeniedException($"Could not save credentials for \"{hostUrl}\" to Windows Credential Manager.");
            }
        }

        public override void delete(Host bookmark)
        {
            if (logger.isInfoEnabled())
            {
                logger.info(string.Format("Delete password for bookmark {0}", bookmark));
            }
            var target = ToUri(bookmark);
            if (!WinCredentialManager.RemoveCredentials(target.AbsoluteUri))
            {
                base.delete(bookmark);
            }
        }

        public override void deletePassword(string serviceName, string user)
        {
            if (!WinCredentialManager.RemoveCredentials($"{serviceName} - {user}"))
            {
                throw new NotfoundException($"Cannot delete {serviceName} - {user}");
            }
        }

        public override void deletePassword(Scheme scheme, int port, string hostName, string user)
        {
            var hostUrl = hostUrlProvider.get(scheme, port, user, hostName, string.Empty);
            if (!WinCredentialManager.RemoveCredentials(hostUrl))
            {
                throw new NotfoundException($"Cannot delete {hostUrl}");
            }
        }

        public override string findLoginPassword(Host bookmark)
        {
            var target = ToUri(bookmark);
            var cred = WinCredentialManager.GetCredentials(target.AbsoluteUri);
            if (!string.IsNullOrWhiteSpace(cred.Password))
            {
                return cred.Password;
            }
            return base.findLoginPassword(bookmark);
        }

        public override string findLoginToken(Host bookmark)
        {
            if (logger.isInfoEnabled())
            {
                logger.info(string.Format("Fetching login token from keychain for {0}", bookmark));
            }
            var target = ToUri(bookmark);
            var cred = WinCredentialManager.GetCredentials(target.AbsoluteUri);
            if (cred.Attributes?.TryGetValue("Token", out var token) ?? false && !string.IsNullOrWhiteSpace(token))
            {
                return token;
            }
            return base.findLoginToken(bookmark);
        }

        public override OAuthTokens findOAuthTokens(Host bookmark)
        {
            if (logger.isInfoEnabled())
            {
                logger.info(string.Format("Fetching OAuth tokens from keychain for {0}", bookmark));
            }
            var target = ToUri(bookmark);
            var cred = WinCredentialManager.GetCredentials(target.AbsoluteUri);
            if (cred.Attributes.TryGetValue("OAuth Access Token", out var accessToken) &&
                cred.Attributes.TryGetValue("OAuth Refresh Token", out var refreshToken))
            {
                long expiry = default;
                if (cred.Attributes.TryGetValue("OAuth Expiry", out var expiryValue))
                {
                    long.TryParse(expiryValue, out expiry);
                }
                return new(accessToken, refreshToken, new(expiry));
            }

            return base.findOAuthTokens(bookmark);
        }

        public override string findPrivateKeyPassphrase(Host bookmark)
        {
            if (logger.isInfoEnabled())
            {
                logger.info(string.Format("Fetching private key passphrase from keychain for {0}", bookmark));
            }
            var target = ToUri(bookmark);
            var cred = WinCredentialManager.GetCredentials(target.AbsoluteUri);
            if (cred.Attributes.TryGetValue("Private Key Passphrase", out var passphrase)
                && !string.IsNullOrWhiteSpace(passphrase))
            {
                return passphrase;
            }
            return base.findPrivateKeyPassphrase(bookmark);
        }

        public override string getPassword(string serviceName, string user) => WinCredentialManager.GetCredentials($"{serviceName} - {user}").Password;

        public override string getPassword(Scheme scheme, int port, string hostName, string user)
        {
            var hostUrl = hostUrlProvider.get(scheme, port, user, hostName, string.Empty);
            return WinCredentialManager.GetCredentials(hostUrl).Password;
        }

        public override void save(Host bookmark)
        {
            if (string.IsNullOrWhiteSpace(bookmark.getHostname()))
            {
                logger.warn("No hostname given.");
                return;
            }
            if (logger.isInfoEnabled())
            {
                logger.info(string.Format("Add password for bookmark {0}", bookmark));
            }
            var target = ToUri(bookmark);
            var protocol = bookmark.getProtocol();
            var credential = bookmark.getCredentials();

            var winCred = new WindowsCredentialManagerCredential(
                credential.getUsername(), credential.getPassword(),
                CRED_TYPE_GENERIC, 0, CRED_PERSIST_ENTERPRISE);

            if (protocol.isTokenConfigurable())
            {
                winCred.Attributes["Token"] = credential.getToken();
            }
            if (protocol.isOAuthConfigurable())
            {
                winCred.Attributes["OAuth Access Token"] = credential.getOauth().getAccessToken();
                winCred.Attributes["OAuth Refresh Token"] = credential.getOauth().getRefreshToken();
                if (credential.getOauth().getExpiryInMilliseconds() != null)
                {
                    winCred.Attributes["OAuth Expiry"] = credential.getOauth().getExpiryInMilliseconds().longValue().ToString();
                }
            }
            if (protocol.isPrivateKeyConfigurable())
            {
                winCred.Attributes["Private Key Passphrase"] = credential.getIdentityPassphrase();
            }
            if (credential.isPasswordAuthentication())
            {
                if (string.IsNullOrWhiteSpace(credential.getUsername()))
                {
                    logger.warn(string.Format("No username in credentials for bookmark {0}", bookmark.getHostname()));
                    return;
                }
                if (string.IsNullOrWhiteSpace(credential.getPassword()))
                {
                    logger.warn(string.Format("No password in credentials for bookmark {0}", bookmark.getHostname()));
                    return;
                }
            }
            if (!WinCredentialManager.SaveCredentials(target.AbsoluteUri, winCred))
            {
                base.save(bookmark);
            }
        }

        private static Uri ToUri(Host bookmark)
        {
            var protocol = bookmark.getProtocol();
            var credentials = bookmark.getCredentials();

            var targetBuilder = new UriBuilder(PreferencesFactory.get().getProperty("application.container.name"), string.Empty);
            var pathBuilder = new StringBuilder();
            pathBuilder.Append(protocol.getIdentifier());
            if (protocol.isHostnameConfigurable() || !(protocol.isTokenConfigurable() || protocol.isOAuthConfigurable()))
            {
                pathBuilder.Append(":" + bookmark.getHostname());
                if (protocol.isPortConfigurable() && !Equals(protocol.getDefaultPort(), bookmark.getPort()))
                {
                    pathBuilder.Append(":" + bookmark.getPort());
                }
            }
            targetBuilder.Path = pathBuilder.ToString();
            targetBuilder.Query = "user=" + credentials.getUsername();

            return targetBuilder.Uri;
        }
    }
}
