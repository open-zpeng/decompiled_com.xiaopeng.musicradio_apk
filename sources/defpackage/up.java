package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
/* compiled from: AppInfoUtil.java */
/* renamed from: up  reason: default package */
/* loaded from: classes3.dex */
public class up {
    private static String a = "";
    private static String b;

    public static String d() {
        return "";
    }

    public static String e() {
        return "";
    }

    public static String a() {
        if (uc.c() == null) {
            return "";
        }
        try {
            String string = uc.c().getSharedPreferences("UTCommon", 0).getString("_lun", "");
            return !TextUtils.isEmpty(string) ? new String(uq.a(string.getBytes(), 2), "UTF-8") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b() {
        if (uc.c() == null) {
            return "";
        }
        try {
            String string = uc.c().getSharedPreferences("UTCommon", 0).getString("_luid", "");
            return !TextUtils.isEmpty(string) ? new String(uq.a(string.getBytes(), 2), "UTF-8") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        return a;
    }

    public static void a(String str) {
        uw.a("AppInfoUtil", "[setChannle]", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int indexOf = str.indexOf("@");
        if (indexOf == -1) {
            a = str;
        } else {
            a = str.substring(0, indexOf);
        }
    }

    public static String f() {
        return b;
    }

    public static void b(String str) {
        uw.a("AppInfoUtil", "set Appkey:", str);
        b = str;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.importance == 400) {
                        return false;
                    }
                    if (powerManager.isScreenOn()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }
}
