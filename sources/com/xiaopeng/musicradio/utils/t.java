package com.xiaopeng.musicradio.utils;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* compiled from: DrawableUtil.java */
/* loaded from: classes2.dex */
public class t {
    public static Drawable a(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            return drawable;
        }
        return null;
    }
}
