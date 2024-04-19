package com.xiaopeng.musicradio.utils;

import android.content.Context;
/* compiled from: DensityUtil.java */
/* loaded from: classes2.dex */
public class o {
    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
