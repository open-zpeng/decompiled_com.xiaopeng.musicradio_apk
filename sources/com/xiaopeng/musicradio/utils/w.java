package com.xiaopeng.musicradio.utils;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
/* compiled from: FlavorUtils.java */
/* loaded from: classes2.dex */
public class w {
    private static String a;
    private static int b;
    private static String c;
    private static int d;
    private static String e;

    public static boolean a() {
        return TextUtils.equals(h(), "vertical");
    }

    public static boolean b() {
        return TextUtils.equals(h(), "horizontal");
    }

    public static boolean c() {
        return "d55".equals("d20");
    }

    public static boolean d() {
        return "d55".equals("d21");
    }

    public static boolean e() {
        return "d55".equals("e28");
    }

    public static int f() {
        int i = b;
        if (i != 0) {
            return i;
        }
        if ("qq".equalsIgnoreCase(g())) {
            b = 2;
        } else {
            b = 1;
        }
        return b;
    }

    public static String g() {
        String str = a;
        if (str != null) {
            return str;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = com.xiaopeng.musicradio.a.a.getPackageManager().getApplicationInfo(com.xiaopeng.musicradio.a.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        if (applicationInfo == null) {
            a = "kugou";
        } else {
            a = applicationInfo.metaData.getString("source");
        }
        return a;
    }

    public static String h() {
        String str = c;
        if (str != null) {
            return str;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = com.xiaopeng.musicradio.a.a.getPackageManager().getApplicationInfo(com.xiaopeng.musicradio.a.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        if (applicationInfo == null) {
            d = 1;
        } else {
            c = applicationInfo.metaData.getString("orientation");
        }
        return c;
    }

    private static String k() {
        String str = e;
        if (str != null) {
            return str;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = com.xiaopeng.musicradio.a.a.getPackageManager().getApplicationInfo(com.xiaopeng.musicradio.a.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        if (applicationInfo == null) {
            e = "2d";
        } else {
            e = applicationInfo.metaData.getString("dim");
        }
        return e;
    }

    public static boolean i() {
        return TextUtils.equals(k(), "3d");
    }

    public static String j() {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = com.xiaopeng.musicradio.a.a.getPackageManager().getApplicationInfo(com.xiaopeng.musicradio.a.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return null;
        }
        return applicationInfo.metaData.getString("productName");
    }
}
