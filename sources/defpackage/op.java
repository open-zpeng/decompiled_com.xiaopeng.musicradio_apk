package defpackage;

import android.graphics.PointF;
/* compiled from: CubicCurveData.java */
/* renamed from: op  reason: default package */
/* loaded from: classes3.dex */
public class op {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public op() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public op(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public void a(float f, float f2) {
        this.a.set(f, f2);
    }

    public PointF a() {
        return this.a;
    }

    public void b(float f, float f2) {
        this.b.set(f, f2);
    }

    public PointF b() {
        return this.b;
    }

    public void c(float f, float f2) {
        this.c.set(f, f2);
    }

    public PointF c() {
        return this.c;
    }
}
