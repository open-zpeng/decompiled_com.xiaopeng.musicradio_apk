package com.xiaopeng.musicradio.utils;

import android.content.Context;
/* compiled from: ReadingUtils.java */
/* loaded from: classes2.dex */
public class av {
    public static String a(Context context, double d) {
        if (d < 10000.0d) {
            return Double.toString(d);
        }
        long j = ((long) d) % 10000;
        double d2 = d / 10000.0d;
        if (d2 < 10000.0d) {
            return j >= 1000 ? String.format("%.1f万", Double.valueOf(d2)) : String.format("%.0f万", Double.valueOf(d2));
        }
        double d3 = d2 / 10000.0d;
        return ((long) d2) % 10000 >= 1000 ? String.format("%.1f亿", Double.valueOf(d3)) : String.format("%.0f亿", Double.valueOf(d3));
    }
}
