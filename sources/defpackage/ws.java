package defpackage;

import android.content.Context;
import android.graphics.Color;
import defpackage.vu;
/* compiled from: ElevationOverlayProvider.java */
/* renamed from: ws  reason: default package */
/* loaded from: classes3.dex */
public class ws {
    private final boolean a;
    private final int b;
    private final int c;
    private final float d;

    public ws(Context context) {
        this.a = wz.a(context, vu.b.elevationOverlayEnabled, false);
        this.b = wp.a(context, vu.b.elevationOverlayColor, 0);
        this.c = wp.a(context, vu.b.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public int a(int i, float f) {
        return (this.a && a(i)) ? b(i, f) : i;
    }

    public int b(int i, float f) {
        float a = a(f);
        return fd.b(wp.a(fd.b(i, 255), this.b, a), Color.alpha(i));
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean a() {
        return this.a;
    }

    private boolean a(int i) {
        return fd.b(i, 255) == this.c;
    }
}
