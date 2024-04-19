package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: AnimationUtils.java */
/* renamed from: vv  reason: default package */
/* loaded from: classes3.dex */
public class vv {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new iv();
    public static final TimeInterpolator c = new iu();
    public static final TimeInterpolator d = new iw();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float a(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }
}
