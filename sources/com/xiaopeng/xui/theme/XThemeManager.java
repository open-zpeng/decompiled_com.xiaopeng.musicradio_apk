package com.xiaopeng.xui.theme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class XThemeManager {
    public static void setWindowBackgroundResource(Configuration configuration, Window window, int i) {
        acs.a(configuration, window, i);
    }

    public static void setWindowBackgroundDrawable(Configuration configuration, Window window, Drawable drawable) {
        acs.a(configuration, window, drawable);
    }

    public static boolean isThemeChanged(Configuration configuration) {
        return acs.b(configuration);
    }

    public static void onConfigurationChanged(Configuration configuration, Context context, View view, String str, List<acu> list) {
        acs.a(context, view, str, list).a(configuration);
    }

    public static int getDatNightMode(Context context) {
        return acs.b(context);
    }

    public static boolean isNight(Context context) {
        return isNightMode(context);
    }

    public static boolean isNight(Configuration configuration) {
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    public static HashMap<String, Integer> resolveAttribute(Context context, AttributeSet attributeSet) {
        return acs.a(context, attributeSet);
    }

    public static void updateAttribute(View view, HashMap<String, Integer> hashMap) {
        acs.a(view, hashMap);
    }

    public static int getThemeMode(Context context) {
        return acs.a(context);
    }

    public static boolean isNightMode(Context context) {
        return acs.d(context);
    }

    public static String getThemeStyle() {
        String systemProperties = getSystemProperties("persist.sys.theme.style");
        return systemProperties == null ? "" : systemProperties;
    }

    @SuppressLint({"PrivateApi"})
    private static String getSystemProperties(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
