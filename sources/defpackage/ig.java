package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
/* compiled from: PathInterpolatorCompat.java */
/* renamed from: ig  reason: default package */
/* loaded from: classes3.dex */
public final class ig {
    public static Interpolator a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new Cif(f, f2, f3, f4);
    }
}
