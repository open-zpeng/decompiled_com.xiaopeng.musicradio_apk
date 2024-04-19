package com.xiaopeng.musicradio.utils;

import android.content.Context;
/* compiled from: LrcUtils.java */
/* loaded from: classes2.dex */
public class ag {
    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
