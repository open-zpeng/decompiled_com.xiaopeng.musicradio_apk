package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
/* compiled from: EaseCubicInterpolator.java */
/* renamed from: bdt  reason: default package */
/* loaded from: classes2.dex */
public class bdt implements Interpolator {
    private int a;
    private final PointF b;
    private final PointF c;

    public static double a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        return (d4 * d4 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d);
    }

    public bdt() {
        this(0.2f, 0.0f, 0.2f, 1.0f);
    }

    public bdt(float f, float f2, float f3, float f4) {
        this.a = 0;
        this.b = new PointF();
        this.c = new PointF();
        PointF pointF = this.b;
        pointF.x = f;
        pointF.y = f2;
        PointF pointF2 = this.c;
        pointF2.x = f3;
        pointF2.y = f4;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f == 0.0f) {
            this.a = 0;
        }
        int i = this.a;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = i * 2.4414062E-4f;
            if (a(f2, this.b.x, this.c.x) >= f) {
                this.a = i;
                break;
            }
            i++;
        }
        double a = a(f2, this.b.y, this.c.y);
        if (f == 1.0f) {
            this.a = 0;
        }
        return (float) a;
    }
}
