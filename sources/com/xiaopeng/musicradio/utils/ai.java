package com.xiaopeng.musicradio.utils;

import com.xiaopeng.lib.framework.configuration.ConfigurationModuleEntry;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.lib.framework.moduleinterface.configurationmodule.IConfiguration;
/* compiled from: ModuleApiUtil.java */
/* loaded from: classes2.dex */
public class ai {
    public static IConfiguration a() {
        try {
            return (IConfiguration) Module.get(ConfigurationModuleEntry.class).get(IConfiguration.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String str2) {
        try {
            return a().getConfiguration(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }
}
