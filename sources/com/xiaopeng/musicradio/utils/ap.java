package com.xiaopeng.musicradio.utils;
/* compiled from: NumberUtils.java */
/* loaded from: classes2.dex */
public class ap {
    public static int a(String str) {
        if (be.a((CharSequence) str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int a(String str, int i) {
        if (be.a((CharSequence) str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long b(String str) {
        if (be.a((CharSequence) str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static long a(String str, long j) {
        if (be.a((CharSequence) str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }
}
