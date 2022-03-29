﻿using ch.cyberduck.core.cache;
using ch.cyberduck.core.local;
using Ch.Cyberduck.Core;
using java.util;
using org.apache.logging.log4j;
using System;
using System.Collections.Generic;
using System.IO;
using System.Runtime.InteropServices;
using Windows.Win32;
using Windows.Win32.Foundation;
using Windows.Win32.UI.Shell;
using static Windows.Win32.CorePInvoke;
using static Windows.Win32.UI.Shell.ASSOC_FILTER;

namespace Cyberduck.Core.Local
{
    public class ShellApplicationFinder : ApplicationFinder
    {
        private static readonly Logger Log = LogManager.getLogger(typeof(ShellApplicationFinder).FullName);

        private readonly LRUCache assocHandlerCache = LRUCache.build(25);
        private readonly LRUCache assocHandlerListCache = LRUCache.build(25);

        public Application find(string filename)
        {
            filename = Path.GetExtension(filename);
            if (assocHandlerCache.get(filename) is ShellApplication shellHandler)
            {
                return shellHandler;
            }
            HRESULT result;
            if ((result = SHAssocEnumHandlers(filename, ASSOC_FILTER_NONE, out var enumHandlers)).Failed)
            {
                Log.warn("find: Failure getting IEnumAssocHandler", Marshal.GetExceptionForHR(result.Value));
                return Application.notfound;
            }
            IAssocHandler[] passocHandler = new IAssocHandler[1];
            ref IAssocHandler assocHandler = ref passocHandler[0];
            try
            {
                while (enumHandlers.Next(passocHandler) > 0)
                {
                    if (/* HACK assocHandler.IsRecommended() */ true)
                    {
                        ShellApplication app = new(assocHandler);
                        assocHandlerCache.put(filename, app);
                        return app;
                    }
                }
            }
            catch (Exception e)
            {
                Log.warn("find: Failure enumerating IEnumAssocHandler", e);
            }
            return Application.notfound;
        }

        public List findAll(string filename)
        {
            filename = Path.GetExtension(filename);
            if (assocHandlerListCache.get(filename) is not List<Application> map)
            {
                map = new List<Application>();
                assocHandlerListCache.put(filename, map);

                HRESULT result;
                if ((result = SHAssocEnumHandlers(filename, ASSOC_FILTER_NONE, out var enumHandlers)).Succeeded)
                {
                    IAssocHandler[] passocHandler = new IAssocHandler[1];
                    ref IAssocHandler assocHandler = ref passocHandler[0];
                    try
                    {
                        while (enumHandlers.Next(passocHandler) > 0)
                        {
                            map.Add(new ShellApplication(assocHandler));
                        }
                    }
                    catch (Exception e)
                    {
                        Log.warn("findAll: Failure enumerating IEnumAssocHandler", e);
                    }
                }
                else
                {
                    Log.warn("findAll: Failure getting IEnumAssocHandler", Marshal.GetExceptionForHR(result.Value));
                }
            }

            return Utils.ConvertToJavaList(map);
        }

        public Application getDescription(string filename)
        {
            throw new NotImplementedException();
        }

        public bool isInstalled(Application application) => application is ShellApplication;

        public class ShellApplication : Application
        {
            private readonly IAssocHandler handler;

            public ShellApplication(in IAssocHandler handler) : base(handler.GetName(), handler.GetUIName())
            {
                this.handler = handler;
            }
        }
    }
}
