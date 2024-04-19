package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.template.ILogger;
/* compiled from: PackageUtils.java */
/* renamed from: sx  reason: default package */
/* loaded from: classes3.dex */
public class sx {
    private static String a;
    private static int b;

    public static boolean a(Context context) {
        PackageInfo c = c(context);
        if (c != null) {
            String str = c.versionName;
            int i = c.versionCode;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SP_AROUTER_CACHE", 0);
            if (str.equals(sharedPreferences.getString("LAST_VERSION_NAME", null)) && i == sharedPreferences.getInt("LAST_VERSION_CODE", -1)) {
                return false;
            }
            a = str;
            b = i;
            return true;
        }
        return true;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(a) || b == 0) {
            return;
        }
        context.getSharedPreferences("SP_AROUTER_CACHE", 0).edit().putString("LAST_VERSION_NAME", a).putInt("LAST_VERSION_CODE", b).apply();
    }

    private static PackageInfo c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            sp.a.error(ILogger.defaultTag, "Get package info error.");
            return null;
        }
    }
}
