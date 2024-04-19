package com.xiaopeng.musicradio.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
/* compiled from: AppUtils.java */
/* loaded from: classes2.dex */
public class c {
    private static String a;

    public static boolean a(Context context) {
        String str = context.getApplicationInfo().processName;
        if (a == null) {
            a = b(context);
        }
        return TextUtils.equals(str, a);
    }

    public static String b(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        if (a == null) {
            a = b(context);
        }
        String str = a;
        return str != null && str.contains(":player");
    }

    public static boolean d(Context context) {
        if (a == null) {
            a = b(context);
        }
        String str = a;
        return str != null && str.contains(":webview");
    }

    public static String e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean f(Context context) {
        String b = b(context);
        for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) context.getSystemService("activity")).getRunningTasks(100)) {
            if (runningTaskInfo.topActivity.getPackageName().equals(b) && runningTaskInfo.numActivities > 0) {
                return true;
            }
        }
        return false;
    }
}
