package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.f;
/* compiled from: RectangleShape.java */
/* renamed from: pu  reason: default package */
/* loaded from: classes3.dex */
public class pu implements pm {
    private final String a;
    private final pj<PointF, PointF> b;
    private final pc c;
    private final oy d;

    public pu(String str, pj<PointF, PointF> pjVar, pc pcVar, oy oyVar) {
        this.a = str;
        this.b = pjVar;
        this.c = pcVar;
        this.d = oyVar;
    }

    public String a() {
        return this.a;
    }

    public oy b() {
        return this.d;
    }

    public pc c() {
        return this.c;
    }

    public pj<PointF, PointF> d() {
        return this.b;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new ns(fVar, qcVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
