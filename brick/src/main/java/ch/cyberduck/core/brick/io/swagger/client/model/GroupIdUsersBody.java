/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.brick.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import org.joda.time.DateTime;
/**
 * GroupIdUsersBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-12T12:23:43.971535+02:00[Europe/Paris]")
public class GroupIdUsersBody {
  @JsonProperty("avatar_file")
  private File avatarFile = null;

  @JsonProperty("avatar_delete")
  private Boolean avatarDelete = null;

  @JsonProperty("change_password")
  private String changePassword = null;

  @JsonProperty("change_password_confirmation")
  private String changePasswordConfirmation = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("grant_permission")
  private String grantPermission = null;

  @JsonProperty("group_ids")
  private String groupIds = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("password_confirmation")
  private String passwordConfirmation = null;

  @JsonProperty("announcements_read")
  private Boolean announcementsRead = null;

  @JsonProperty("allowed_ips")
  private String allowedIps = null;

  @JsonProperty("attachments_permission")
  private Boolean attachmentsPermission = null;

  @JsonProperty("authenticate_until")
  private DateTime authenticateUntil = null;

  /**
   * How is this user authenticated?
   */
  public enum AuthenticationMethodEnum {
    PASSWORD("password"),
    UNUSED_FORMER_LDAP("unused_former_ldap"),
    SSO("sso"),
    NONE("none"),
    EMAIL_SIGNUP("email_signup");

    private String value;

    AuthenticationMethodEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static AuthenticationMethodEnum fromValue(String text) {
      for (AuthenticationMethodEnum b : AuthenticationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("authentication_method")
  private AuthenticationMethodEnum authenticationMethod = null;

  @JsonProperty("billing_permission")
  private Boolean billingPermission = null;

  @JsonProperty("bypass_inactive_disable")
  private Boolean bypassInactiveDisable = null;

  @JsonProperty("bypass_site_allowed_ips")
  private Boolean bypassSiteAllowedIps = null;

  @JsonProperty("dav_permission")
  private Boolean davPermission = null;

  @JsonProperty("disabled")
  private Boolean disabled = null;

  @JsonProperty("ftp_permission")
  private Boolean ftpPermission = null;

  @JsonProperty("header_text")
  private String headerText = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("notification_daily_send_time")
  private Integer notificationDailySendTime = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("office_integration_enabled")
  private Boolean officeIntegrationEnabled = null;

  @JsonProperty("password_validity_days")
  private Integer passwordValidityDays = null;

  @JsonProperty("receive_admin_alerts")
  private Boolean receiveAdminAlerts = null;

  @JsonProperty("require_password_change")
  private Boolean requirePasswordChange = null;

  @JsonProperty("restapi_permission")
  private Boolean restapiPermission = null;

  @JsonProperty("self_managed")
  private Boolean selfManaged = null;

  @JsonProperty("sftp_permission")
  private Boolean sftpPermission = null;

  @JsonProperty("site_admin")
  private Boolean siteAdmin = null;

  @JsonProperty("skip_welcome_screen")
  private Boolean skipWelcomeScreen = null;

  /**
   * SSL required setting
   */
  public enum SslRequiredEnum {
    USE_SYSTEM_SETTING("use_system_setting"),
    ALWAYS_REQUIRE("always_require"),
    NEVER_REQUIRE("never_require");

    private String value;

    SslRequiredEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static SslRequiredEnum fromValue(String text) {
      for (SslRequiredEnum b : SslRequiredEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("ssl_required")
  private SslRequiredEnum sslRequired = null;

  @JsonProperty("sso_strategy_id")
  private Integer ssoStrategyId = null;

  @JsonProperty("subscribe_to_newsletter")
  private Boolean subscribeToNewsletter = null;

  /**
   * 2FA required setting
   */
  public enum Require2faEnum {
    USE_SYSTEM_SETTING("use_system_setting"),
    ALWAYS_REQUIRE("always_require"),
    NEVER_REQUIRE("never_require");

    private String value;

    Require2faEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static Require2faEnum fromValue(String text) {
      for (Require2faEnum b : Require2faEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("require_2fa")
  private Require2faEnum require2fa = null;

  @JsonProperty("time_zone")
  private String timeZone = null;

  @JsonProperty("user_root")
  private String userRoot = null;

  @JsonProperty("username")
  private String username = null;

  public GroupIdUsersBody avatarFile(File avatarFile) {
    this.avatarFile = avatarFile;
    return this;
  }

   /**
   * An image file for your user avatar.
   * @return avatarFile
  **/
  @Schema(description = "An image file for your user avatar.")
  public File getAvatarFile() {
    return avatarFile;
  }

  public void setAvatarFile(File avatarFile) {
    this.avatarFile = avatarFile;
  }

  public GroupIdUsersBody avatarDelete(Boolean avatarDelete) {
    this.avatarDelete = avatarDelete;
    return this;
  }

   /**
   * If true, the avatar will be deleted.
   * @return avatarDelete
  **/
  @Schema(description = "If true, the avatar will be deleted.")
  public Boolean isAvatarDelete() {
    return avatarDelete;
  }

  public void setAvatarDelete(Boolean avatarDelete) {
    this.avatarDelete = avatarDelete;
  }

  public GroupIdUsersBody changePassword(String changePassword) {
    this.changePassword = changePassword;
    return this;
  }

   /**
   * Used for changing a password on an existing user.
   * @return changePassword
  **/
  @Schema(description = "Used for changing a password on an existing user.")
  public String getChangePassword() {
    return changePassword;
  }

  public void setChangePassword(String changePassword) {
    this.changePassword = changePassword;
  }

  public GroupIdUsersBody changePasswordConfirmation(String changePasswordConfirmation) {
    this.changePasswordConfirmation = changePasswordConfirmation;
    return this;
  }

   /**
   * Optional, but if provided, we will ensure that it matches the value sent in &#x60;change_password&#x60;.
   * @return changePasswordConfirmation
  **/
  @Schema(description = "Optional, but if provided, we will ensure that it matches the value sent in `change_password`.")
  public String getChangePasswordConfirmation() {
    return changePasswordConfirmation;
  }

  public void setChangePasswordConfirmation(String changePasswordConfirmation) {
    this.changePasswordConfirmation = changePasswordConfirmation;
  }

  public GroupIdUsersBody email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#x27;s email.
   * @return email
  **/
  @Schema(description = "User's email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GroupIdUsersBody grantPermission(String grantPermission) {
    this.grantPermission = grantPermission;
    return this;
  }

   /**
   * Permission to grant on the user root.  Can be blank or &#x60;full&#x60;, &#x60;read&#x60;, &#x60;write&#x60;, &#x60;list&#x60;, or &#x60;history&#x60;.
   * @return grantPermission
  **/
  @Schema(description = "Permission to grant on the user root.  Can be blank or `full`, `read`, `write`, `list`, or `history`.")
  public String getGrantPermission() {
    return grantPermission;
  }

  public void setGrantPermission(String grantPermission) {
    this.grantPermission = grantPermission;
  }

  public GroupIdUsersBody groupIds(String groupIds) {
    this.groupIds = groupIds;
    return this;
  }

   /**
   * A list of group ids to associate this user with.  Comma delimited.
   * @return groupIds
  **/
  @Schema(description = "A list of group ids to associate this user with.  Comma delimited.")
  public String getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(String groupIds) {
    this.groupIds = groupIds;
  }

  public GroupIdUsersBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * User password.
   * @return password
  **/
  @Schema(description = "User password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public GroupIdUsersBody passwordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
    return this;
  }

   /**
   * Optional, but if provided, we will ensure that it matches the value sent in &#x60;password&#x60;.
   * @return passwordConfirmation
  **/
  @Schema(description = "Optional, but if provided, we will ensure that it matches the value sent in `password`.")
  public String getPasswordConfirmation() {
    return passwordConfirmation;
  }

  public void setPasswordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }

  public GroupIdUsersBody announcementsRead(Boolean announcementsRead) {
    this.announcementsRead = announcementsRead;
    return this;
  }

   /**
   * Signifies that the user has read all the announcements in the UI.
   * @return announcementsRead
  **/
  @Schema(description = "Signifies that the user has read all the announcements in the UI.")
  public Boolean isAnnouncementsRead() {
    return announcementsRead;
  }

  public void setAnnouncementsRead(Boolean announcementsRead) {
    this.announcementsRead = announcementsRead;
  }

  public GroupIdUsersBody allowedIps(String allowedIps) {
    this.allowedIps = allowedIps;
    return this;
  }

   /**
   * A list of allowed IPs if applicable.  Newline delimited
   * @return allowedIps
  **/
  @Schema(example = "127.0.0.1", description = "A list of allowed IPs if applicable.  Newline delimited")
  public String getAllowedIps() {
    return allowedIps;
  }

  public void setAllowedIps(String allowedIps) {
    this.allowedIps = allowedIps;
  }

  public GroupIdUsersBody attachmentsPermission(Boolean attachmentsPermission) {
    this.attachmentsPermission = attachmentsPermission;
    return this;
  }

   /**
   * DEPRECATED: Can the user create Bundles (aka Share Links)? Use the bundle permission instead.
   * @return attachmentsPermission
  **/
  @Schema(example = "true", description = "DEPRECATED: Can the user create Bundles (aka Share Links)? Use the bundle permission instead.")
  public Boolean isAttachmentsPermission() {
    return attachmentsPermission;
  }

  public void setAttachmentsPermission(Boolean attachmentsPermission) {
    this.attachmentsPermission = attachmentsPermission;
  }

  public GroupIdUsersBody authenticateUntil(DateTime authenticateUntil) {
    this.authenticateUntil = authenticateUntil;
    return this;
  }

   /**
   * Scheduled Date/Time at which user will be deactivated
   * @return authenticateUntil
  **/
  @Schema(example = "2000-01-01T01:00Z", description = "Scheduled Date/Time at which user will be deactivated")
  public DateTime getAuthenticateUntil() {
    return authenticateUntil;
  }

  public void setAuthenticateUntil(DateTime authenticateUntil) {
    this.authenticateUntil = authenticateUntil;
  }

  public GroupIdUsersBody authenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * How is this user authenticated?
   * @return authenticationMethod
  **/
  @Schema(example = "password", description = "How is this user authenticated?")
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public GroupIdUsersBody billingPermission(Boolean billingPermission) {
    this.billingPermission = billingPermission;
    return this;
  }

   /**
   * Allow this user to perform operations on the account, payments, and invoices?
   * @return billingPermission
  **/
  @Schema(description = "Allow this user to perform operations on the account, payments, and invoices?")
  public Boolean isBillingPermission() {
    return billingPermission;
  }

  public void setBillingPermission(Boolean billingPermission) {
    this.billingPermission = billingPermission;
  }

  public GroupIdUsersBody bypassInactiveDisable(Boolean bypassInactiveDisable) {
    this.bypassInactiveDisable = bypassInactiveDisable;
    return this;
  }

   /**
   * Exempt this user from being disabled based on inactivity?
   * @return bypassInactiveDisable
  **/
  @Schema(description = "Exempt this user from being disabled based on inactivity?")
  public Boolean isBypassInactiveDisable() {
    return bypassInactiveDisable;
  }

  public void setBypassInactiveDisable(Boolean bypassInactiveDisable) {
    this.bypassInactiveDisable = bypassInactiveDisable;
  }

  public GroupIdUsersBody bypassSiteAllowedIps(Boolean bypassSiteAllowedIps) {
    this.bypassSiteAllowedIps = bypassSiteAllowedIps;
    return this;
  }

   /**
   * Allow this user to skip site-wide IP blacklists?
   * @return bypassSiteAllowedIps
  **/
  @Schema(description = "Allow this user to skip site-wide IP blacklists?")
  public Boolean isBypassSiteAllowedIps() {
    return bypassSiteAllowedIps;
  }

  public void setBypassSiteAllowedIps(Boolean bypassSiteAllowedIps) {
    this.bypassSiteAllowedIps = bypassSiteAllowedIps;
  }

  public GroupIdUsersBody davPermission(Boolean davPermission) {
    this.davPermission = davPermission;
    return this;
  }

   /**
   * Can the user connect with WebDAV?
   * @return davPermission
  **/
  @Schema(example = "true", description = "Can the user connect with WebDAV?")
  public Boolean isDavPermission() {
    return davPermission;
  }

  public void setDavPermission(Boolean davPermission) {
    this.davPermission = davPermission;
  }

  public GroupIdUsersBody disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Is user disabled? Disabled users cannot log in, and do not count for billing purposes.  Users can be automatically disabled after an inactivity period via a Site setting.
   * @return disabled
  **/
  @Schema(example = "true", description = "Is user disabled? Disabled users cannot log in, and do not count for billing purposes.  Users can be automatically disabled after an inactivity period via a Site setting.")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GroupIdUsersBody ftpPermission(Boolean ftpPermission) {
    this.ftpPermission = ftpPermission;
    return this;
  }

   /**
   * Can the user access with FTP/FTPS?
   * @return ftpPermission
  **/
  @Schema(example = "true", description = "Can the user access with FTP/FTPS?")
  public Boolean isFtpPermission() {
    return ftpPermission;
  }

  public void setFtpPermission(Boolean ftpPermission) {
    this.ftpPermission = ftpPermission;
  }

  public GroupIdUsersBody headerText(String headerText) {
    this.headerText = headerText;
    return this;
  }

   /**
   * Text to display to the user in the header of the UI
   * @return headerText
  **/
  @Schema(example = "User-specific message.", description = "Text to display to the user in the header of the UI")
  public String getHeaderText() {
    return headerText;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public GroupIdUsersBody language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Preferred language
   * @return language
  **/
  @Schema(example = "en", description = "Preferred language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public GroupIdUsersBody notificationDailySendTime(Integer notificationDailySendTime) {
    this.notificationDailySendTime = notificationDailySendTime;
    return this;
  }

   /**
   * Hour of the day at which daily notifications should be sent. Can be in range 0 to 23
   * @return notificationDailySendTime
  **/
  @Schema(example = "18", description = "Hour of the day at which daily notifications should be sent. Can be in range 0 to 23")
  public Integer getNotificationDailySendTime() {
    return notificationDailySendTime;
  }

  public void setNotificationDailySendTime(Integer notificationDailySendTime) {
    this.notificationDailySendTime = notificationDailySendTime;
  }

  public GroupIdUsersBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User&#x27;s full name
   * @return name
  **/
  @Schema(example = "John Doe", description = "User's full name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupIdUsersBody company(String company) {
    this.company = company;
    return this;
  }

   /**
   * User&#x27;s company
   * @return company
  **/
  @Schema(example = "ACME Corp.", description = "User's company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public GroupIdUsersBody notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Any internal notes on the user
   * @return notes
  **/
  @Schema(example = "Internal notes on this user.", description = "Any internal notes on the user")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public GroupIdUsersBody officeIntegrationEnabled(Boolean officeIntegrationEnabled) {
    this.officeIntegrationEnabled = officeIntegrationEnabled;
    return this;
  }

   /**
   * Enable integration with Office for the web?
   * @return officeIntegrationEnabled
  **/
  @Schema(example = "true", description = "Enable integration with Office for the web?")
  public Boolean isOfficeIntegrationEnabled() {
    return officeIntegrationEnabled;
  }

  public void setOfficeIntegrationEnabled(Boolean officeIntegrationEnabled) {
    this.officeIntegrationEnabled = officeIntegrationEnabled;
  }

  public GroupIdUsersBody passwordValidityDays(Integer passwordValidityDays) {
    this.passwordValidityDays = passwordValidityDays;
    return this;
  }

   /**
   * Number of days to allow user to use the same password
   * @return passwordValidityDays
  **/
  @Schema(example = "1", description = "Number of days to allow user to use the same password")
  public Integer getPasswordValidityDays() {
    return passwordValidityDays;
  }

  public void setPasswordValidityDays(Integer passwordValidityDays) {
    this.passwordValidityDays = passwordValidityDays;
  }

  public GroupIdUsersBody receiveAdminAlerts(Boolean receiveAdminAlerts) {
    this.receiveAdminAlerts = receiveAdminAlerts;
    return this;
  }

   /**
   * Should the user receive admin alerts such a certificate expiration notifications and overages?
   * @return receiveAdminAlerts
  **/
  @Schema(example = "true", description = "Should the user receive admin alerts such a certificate expiration notifications and overages?")
  public Boolean isReceiveAdminAlerts() {
    return receiveAdminAlerts;
  }

  public void setReceiveAdminAlerts(Boolean receiveAdminAlerts) {
    this.receiveAdminAlerts = receiveAdminAlerts;
  }

  public GroupIdUsersBody requirePasswordChange(Boolean requirePasswordChange) {
    this.requirePasswordChange = requirePasswordChange;
    return this;
  }

   /**
   * Is a password change required upon next user login?
   * @return requirePasswordChange
  **/
  @Schema(example = "true", description = "Is a password change required upon next user login?")
  public Boolean isRequirePasswordChange() {
    return requirePasswordChange;
  }

  public void setRequirePasswordChange(Boolean requirePasswordChange) {
    this.requirePasswordChange = requirePasswordChange;
  }

  public GroupIdUsersBody restapiPermission(Boolean restapiPermission) {
    this.restapiPermission = restapiPermission;
    return this;
  }

   /**
   * Can this user access the REST API?
   * @return restapiPermission
  **/
  @Schema(example = "true", description = "Can this user access the REST API?")
  public Boolean isRestapiPermission() {
    return restapiPermission;
  }

  public void setRestapiPermission(Boolean restapiPermission) {
    this.restapiPermission = restapiPermission;
  }

  public GroupIdUsersBody selfManaged(Boolean selfManaged) {
    this.selfManaged = selfManaged;
    return this;
  }

   /**
   * Does this user manage it&#x27;s own credentials or is it a shared/bot user?
   * @return selfManaged
  **/
  @Schema(example = "true", description = "Does this user manage it's own credentials or is it a shared/bot user?")
  public Boolean isSelfManaged() {
    return selfManaged;
  }

  public void setSelfManaged(Boolean selfManaged) {
    this.selfManaged = selfManaged;
  }

  public GroupIdUsersBody sftpPermission(Boolean sftpPermission) {
    this.sftpPermission = sftpPermission;
    return this;
  }

   /**
   * Can the user access with SFTP?
   * @return sftpPermission
  **/
  @Schema(example = "true", description = "Can the user access with SFTP?")
  public Boolean isSftpPermission() {
    return sftpPermission;
  }

  public void setSftpPermission(Boolean sftpPermission) {
    this.sftpPermission = sftpPermission;
  }

  public GroupIdUsersBody siteAdmin(Boolean siteAdmin) {
    this.siteAdmin = siteAdmin;
    return this;
  }

   /**
   * Is the user an administrator for this site?
   * @return siteAdmin
  **/
  @Schema(example = "true", description = "Is the user an administrator for this site?")
  public Boolean isSiteAdmin() {
    return siteAdmin;
  }

  public void setSiteAdmin(Boolean siteAdmin) {
    this.siteAdmin = siteAdmin;
  }

  public GroupIdUsersBody skipWelcomeScreen(Boolean skipWelcomeScreen) {
    this.skipWelcomeScreen = skipWelcomeScreen;
    return this;
  }

   /**
   * Skip Welcome page in the UI?
   * @return skipWelcomeScreen
  **/
  @Schema(example = "true", description = "Skip Welcome page in the UI?")
  public Boolean isSkipWelcomeScreen() {
    return skipWelcomeScreen;
  }

  public void setSkipWelcomeScreen(Boolean skipWelcomeScreen) {
    this.skipWelcomeScreen = skipWelcomeScreen;
  }

  public GroupIdUsersBody sslRequired(SslRequiredEnum sslRequired) {
    this.sslRequired = sslRequired;
    return this;
  }

   /**
   * SSL required setting
   * @return sslRequired
  **/
  @Schema(example = "always_require", description = "SSL required setting")
  public SslRequiredEnum getSslRequired() {
    return sslRequired;
  }

  public void setSslRequired(SslRequiredEnum sslRequired) {
    this.sslRequired = sslRequired;
  }

  public GroupIdUsersBody ssoStrategyId(Integer ssoStrategyId) {
    this.ssoStrategyId = ssoStrategyId;
    return this;
  }

   /**
   * SSO (Single Sign On) strategy ID for the user, if applicable.
   * @return ssoStrategyId
  **/
  @Schema(example = "1", description = "SSO (Single Sign On) strategy ID for the user, if applicable.")
  public Integer getSsoStrategyId() {
    return ssoStrategyId;
  }

  public void setSsoStrategyId(Integer ssoStrategyId) {
    this.ssoStrategyId = ssoStrategyId;
  }

  public GroupIdUsersBody subscribeToNewsletter(Boolean subscribeToNewsletter) {
    this.subscribeToNewsletter = subscribeToNewsletter;
    return this;
  }

   /**
   * Is the user subscribed to the newsletter?
   * @return subscribeToNewsletter
  **/
  @Schema(example = "true", description = "Is the user subscribed to the newsletter?")
  public Boolean isSubscribeToNewsletter() {
    return subscribeToNewsletter;
  }

  public void setSubscribeToNewsletter(Boolean subscribeToNewsletter) {
    this.subscribeToNewsletter = subscribeToNewsletter;
  }

  public GroupIdUsersBody require2fa(Require2faEnum require2fa) {
    this.require2fa = require2fa;
    return this;
  }

   /**
   * 2FA required setting
   * @return require2fa
  **/
  @Schema(example = "always_require", description = "2FA required setting")
  public Require2faEnum getRequire2fa() {
    return require2fa;
  }

  public void setRequire2fa(Require2faEnum require2fa) {
    this.require2fa = require2fa;
  }

  public GroupIdUsersBody timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * User time zone
   * @return timeZone
  **/
  @Schema(example = "Pacific Time (US & Canada)", description = "User time zone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public GroupIdUsersBody userRoot(String userRoot) {
    this.userRoot = userRoot;
    return this;
  }

   /**
   * Root folder for FTP (and optionally SFTP if the appropriate site-wide setting is set.)  Note that this is not used for API, Desktop, or Web interface.
   * @return userRoot
  **/
  @Schema(description = "Root folder for FTP (and optionally SFTP if the appropriate site-wide setting is set.)  Note that this is not used for API, Desktop, or Web interface.")
  public String getUserRoot() {
    return userRoot;
  }

  public void setUserRoot(String userRoot) {
    this.userRoot = userRoot;
  }

  public GroupIdUsersBody username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User&#x27;s username
   * @return username
  **/
  @Schema(example = "user", description = "User's username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupIdUsersBody groupIdUsersBody = (GroupIdUsersBody) o;
    return Objects.equals(this.avatarFile, groupIdUsersBody.avatarFile) &&
        Objects.equals(this.avatarDelete, groupIdUsersBody.avatarDelete) &&
        Objects.equals(this.changePassword, groupIdUsersBody.changePassword) &&
        Objects.equals(this.changePasswordConfirmation, groupIdUsersBody.changePasswordConfirmation) &&
        Objects.equals(this.email, groupIdUsersBody.email) &&
        Objects.equals(this.grantPermission, groupIdUsersBody.grantPermission) &&
        Objects.equals(this.groupIds, groupIdUsersBody.groupIds) &&
        Objects.equals(this.password, groupIdUsersBody.password) &&
        Objects.equals(this.passwordConfirmation, groupIdUsersBody.passwordConfirmation) &&
        Objects.equals(this.announcementsRead, groupIdUsersBody.announcementsRead) &&
        Objects.equals(this.allowedIps, groupIdUsersBody.allowedIps) &&
        Objects.equals(this.attachmentsPermission, groupIdUsersBody.attachmentsPermission) &&
        Objects.equals(this.authenticateUntil, groupIdUsersBody.authenticateUntil) &&
        Objects.equals(this.authenticationMethod, groupIdUsersBody.authenticationMethod) &&
        Objects.equals(this.billingPermission, groupIdUsersBody.billingPermission) &&
        Objects.equals(this.bypassInactiveDisable, groupIdUsersBody.bypassInactiveDisable) &&
        Objects.equals(this.bypassSiteAllowedIps, groupIdUsersBody.bypassSiteAllowedIps) &&
        Objects.equals(this.davPermission, groupIdUsersBody.davPermission) &&
        Objects.equals(this.disabled, groupIdUsersBody.disabled) &&
        Objects.equals(this.ftpPermission, groupIdUsersBody.ftpPermission) &&
        Objects.equals(this.headerText, groupIdUsersBody.headerText) &&
        Objects.equals(this.language, groupIdUsersBody.language) &&
        Objects.equals(this.notificationDailySendTime, groupIdUsersBody.notificationDailySendTime) &&
        Objects.equals(this.name, groupIdUsersBody.name) &&
        Objects.equals(this.company, groupIdUsersBody.company) &&
        Objects.equals(this.notes, groupIdUsersBody.notes) &&
        Objects.equals(this.officeIntegrationEnabled, groupIdUsersBody.officeIntegrationEnabled) &&
        Objects.equals(this.passwordValidityDays, groupIdUsersBody.passwordValidityDays) &&
        Objects.equals(this.receiveAdminAlerts, groupIdUsersBody.receiveAdminAlerts) &&
        Objects.equals(this.requirePasswordChange, groupIdUsersBody.requirePasswordChange) &&
        Objects.equals(this.restapiPermission, groupIdUsersBody.restapiPermission) &&
        Objects.equals(this.selfManaged, groupIdUsersBody.selfManaged) &&
        Objects.equals(this.sftpPermission, groupIdUsersBody.sftpPermission) &&
        Objects.equals(this.siteAdmin, groupIdUsersBody.siteAdmin) &&
        Objects.equals(this.skipWelcomeScreen, groupIdUsersBody.skipWelcomeScreen) &&
        Objects.equals(this.sslRequired, groupIdUsersBody.sslRequired) &&
        Objects.equals(this.ssoStrategyId, groupIdUsersBody.ssoStrategyId) &&
        Objects.equals(this.subscribeToNewsletter, groupIdUsersBody.subscribeToNewsletter) &&
        Objects.equals(this.require2fa, groupIdUsersBody.require2fa) &&
        Objects.equals(this.timeZone, groupIdUsersBody.timeZone) &&
        Objects.equals(this.userRoot, groupIdUsersBody.userRoot) &&
        Objects.equals(this.username, groupIdUsersBody.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(avatarFile), avatarDelete, changePassword, changePasswordConfirmation, email, grantPermission, groupIds, password, passwordConfirmation, announcementsRead, allowedIps, attachmentsPermission, authenticateUntil, authenticationMethod, billingPermission, bypassInactiveDisable, bypassSiteAllowedIps, davPermission, disabled, ftpPermission, headerText, language, notificationDailySendTime, name, company, notes, officeIntegrationEnabled, passwordValidityDays, receiveAdminAlerts, requirePasswordChange, restapiPermission, selfManaged, sftpPermission, siteAdmin, skipWelcomeScreen, sslRequired, ssoStrategyId, subscribeToNewsletter, require2fa, timeZone, userRoot, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupIdUsersBody {\n");
    
    sb.append("    avatarFile: ").append(toIndentedString(avatarFile)).append("\n");
    sb.append("    avatarDelete: ").append(toIndentedString(avatarDelete)).append("\n");
    sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
    sb.append("    changePasswordConfirmation: ").append(toIndentedString(changePasswordConfirmation)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    grantPermission: ").append(toIndentedString(grantPermission)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordConfirmation: ").append(toIndentedString(passwordConfirmation)).append("\n");
    sb.append("    announcementsRead: ").append(toIndentedString(announcementsRead)).append("\n");
    sb.append("    allowedIps: ").append(toIndentedString(allowedIps)).append("\n");
    sb.append("    attachmentsPermission: ").append(toIndentedString(attachmentsPermission)).append("\n");
    sb.append("    authenticateUntil: ").append(toIndentedString(authenticateUntil)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    billingPermission: ").append(toIndentedString(billingPermission)).append("\n");
    sb.append("    bypassInactiveDisable: ").append(toIndentedString(bypassInactiveDisable)).append("\n");
    sb.append("    bypassSiteAllowedIps: ").append(toIndentedString(bypassSiteAllowedIps)).append("\n");
    sb.append("    davPermission: ").append(toIndentedString(davPermission)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    ftpPermission: ").append(toIndentedString(ftpPermission)).append("\n");
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    notificationDailySendTime: ").append(toIndentedString(notificationDailySendTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    officeIntegrationEnabled: ").append(toIndentedString(officeIntegrationEnabled)).append("\n");
    sb.append("    passwordValidityDays: ").append(toIndentedString(passwordValidityDays)).append("\n");
    sb.append("    receiveAdminAlerts: ").append(toIndentedString(receiveAdminAlerts)).append("\n");
    sb.append("    requirePasswordChange: ").append(toIndentedString(requirePasswordChange)).append("\n");
    sb.append("    restapiPermission: ").append(toIndentedString(restapiPermission)).append("\n");
    sb.append("    selfManaged: ").append(toIndentedString(selfManaged)).append("\n");
    sb.append("    sftpPermission: ").append(toIndentedString(sftpPermission)).append("\n");
    sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
    sb.append("    skipWelcomeScreen: ").append(toIndentedString(skipWelcomeScreen)).append("\n");
    sb.append("    sslRequired: ").append(toIndentedString(sslRequired)).append("\n");
    sb.append("    ssoStrategyId: ").append(toIndentedString(ssoStrategyId)).append("\n");
    sb.append("    subscribeToNewsletter: ").append(toIndentedString(subscribeToNewsletter)).append("\n");
    sb.append("    require2fa: ").append(toIndentedString(require2fa)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    userRoot: ").append(toIndentedString(userRoot)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
