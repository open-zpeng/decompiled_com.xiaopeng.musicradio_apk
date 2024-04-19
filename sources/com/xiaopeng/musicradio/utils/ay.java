package com.xiaopeng.musicradio.utils;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.xiaopeng.lib.utils.SharedPreferencesUtils;
/* compiled from: SPHelper.java */
/* loaded from: classes2.dex */
public class ay {
    private static volatile SharedPreferencesUtils a;
    private static volatile Handler b;

    public static void a(Context context, String str) {
        if (a == null) {
            synchronized (ay.class) {
                if (a == null) {
                    a = SharedPreferencesUtils.getInstance(context);
                }
            }
        }
    }

    public static Handler a() {
        if (b == null) {
            synchronized (ay.class) {
                if (b == null) {
                    HandlerThread handlerThread = new HandlerThread("SPHelper");
                    handlerThread.start();
                    b = new Handler(handlerThread.getLooper());
                }
            }
        }
        return b;
    }

    public ay() {
        az.a();
    }

    public static void a(final String str, final String str2) {
        a().post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ay.1
            @Override // java.lang.Runnable
            public void run() {
                ay.a.putString(str, str2);
            }
        });
    }

    public static void b(String str, String str2) {
        a.putString(str, str2);
    }

    public static String a(String str) {
        return c(str, "");
    }

    public static String c(String str, String str2) {
        return a.getString(str, str2);
    }

    public static void a(final String str, final int i) {
        a().post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ay.2
            @Override // java.lang.Runnable
            public void run() {
                ay.a.putInt(str, i);
            }
        });
    }

    public static int b(String str) {
        return b(str, -1);
    }

    public static int b(String str, int i) {
        return a.getInt(str, i);
    }

    public static void a(final String str, final long j) {
        a().post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ay.3
            @Override // java.lang.Runnable
            public void run() {
                ay.a.putLong(str, j);
            }
        });
    }

    public static long c(String str) {
        return b(str, -1L);
    }

    public static long b(String str, long j) {
        return a.getLong(str, j);
    }

    public static void a(final String str, final float f) {
        a().post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ay.4
            @Override // java.lang.Runnable
            public void run() {
                ay.a.putFloat(str, f);
            }
        });
    }

    public static float b(String str, float f) {
        return a.getFloat(str, f);
    }

    public static void a(final String str, final boolean z) {
        a().post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.ay.5
            @Override // java.lang.Runnable
            public void run() {
                ay.a.putBoolean(str, z);
            }
        });
    }

    public static void b(String str, boolean z) {
        a.putBoolean(str, z);
    }

    public static boolean d(String str) {
        return c(str, false);
    }

    public static boolean c(String str, boolean z) {
        return a.getBoolean(str, z);
    }

    public static void e(String str) {
        a.remove(str);
    }

    public static boolean f(String str) {
        return a.contains(str);
    }

    public static void b() {
        a.clear();
    }
}
