package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import defpackage.nx;
import defpackage.pt;
import defpackage.qb;
import java.util.List;
/* compiled from: PolystarContent.java */
/* renamed from: nr  reason: default package */
/* loaded from: classes3.dex */
public class nr implements no, nq, nx.a {
    private final Path a = new Path();
    private final String b;
    private final f c;
    private final pt.a d;
    private final nx<?, Float> e;
    private final nx<?, PointF> f;
    private final nx<?, Float> g;
    private final nx<?, Float> h;
    private final nx<?, Float> i;
    private final nx<?, Float> j;
    private final nx<?, Float> k;
    private nw l;
    private boolean m;

    public nr(f fVar, qc qcVar, pt ptVar) {
        this.c = fVar;
        this.b = ptVar.a();
        this.d = ptVar.b();
        this.e = ptVar.c().a();
        this.f = ptVar.d().a();
        this.g = ptVar.e().a();
        this.i = ptVar.g().a();
        this.k = ptVar.i().a();
        if (this.d == pt.a.Star) {
            this.h = ptVar.f().a();
            this.j = ptVar.h().a();
        } else {
            this.h = null;
            this.j = null;
        }
        qcVar.a(this.e);
        qcVar.a(this.f);
        qcVar.a(this.g);
        qcVar.a(this.i);
        qcVar.a(this.k);
        if (this.d == pt.a.Star) {
            qcVar.a(this.h);
            qcVar.a(this.j);
        }
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
        this.i.a(this);
        this.k.a(this);
        if (this.d == pt.a.Star) {
            this.h.a(this);
            this.j.a(this);
        }
    }

    @Override // defpackage.nx.a
    public void a() {
        c();
    }

    private void c() {
        this.m = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < list.size(); i++) {
            ng ngVar = list.get(i);
            if (ngVar instanceof nw) {
                nw nwVar = (nw) ngVar;
                if (nwVar.c() == qb.a.Simultaneously) {
                    this.l = nwVar;
                    this.l.a(this);
                }
            }
        }
    }

    @Override // defpackage.nq
    public Path e() {
        if (this.m) {
            return this.a;
        }
        this.a.reset();
        switch (this.d) {
            case Star:
                d();
                break;
            case Polygon:
                f();
                break;
        }
        this.a.close();
        sc.a(this.a, this.l);
        this.m = true;
        return this.a;
    }

    @Override // defpackage.ng
    public String b() {
        return this.b;
    }

    private void d() {
        nx<?, Float> nxVar;
        double d;
        int i;
        double d2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float floatValue = this.e.e().floatValue();
        double radians = Math.toRadians((this.g == null ? 0.0d : nxVar.e().floatValue()) - 90.0d);
        double d3 = floatValue;
        float f13 = (float) (6.283185307179586d / d3);
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((int) floatValue);
        int i2 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f15) * f14;
        }
        float floatValue2 = this.i.e().floatValue();
        float floatValue3 = this.h.e().floatValue();
        nx<?, Float> nxVar2 = this.j;
        float floatValue4 = nxVar2 != null ? nxVar2.e().floatValue() / 100.0f : 0.0f;
        nx<?, Float> nxVar3 = this.k;
        float floatValue5 = nxVar3 != null ? nxVar3.e().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f15) + floatValue3;
            i = i2;
            double d4 = f3;
            d = d3;
            f = (float) (d4 * Math.cos(radians));
            f2 = (float) (d4 * Math.sin(radians));
            this.a.moveTo(f, f2);
            d2 = radians + ((f13 * f15) / 2.0f);
        } else {
            d = d3;
            i = i2;
            double d5 = floatValue2;
            float cos = (float) (Math.cos(radians) * d5);
            float sin = (float) (d5 * Math.sin(radians));
            this.a.moveTo(cos, sin);
            d2 = radians + f14;
            f = cos;
            f2 = sin;
            f3 = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        boolean z = false;
        double d6 = d2;
        float f16 = f14;
        int i3 = 0;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                float f17 = z ? floatValue2 : floatValue3;
                int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f16;
                } else {
                    f4 = f16;
                    f16 = (f13 * f15) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f5 = f13;
                    f6 = floatValue3;
                    f7 = f17;
                    f8 = floatValue2;
                } else {
                    f5 = f13;
                    f8 = floatValue2;
                    f6 = floatValue3;
                    f7 = f3;
                }
                double d8 = f7;
                float f18 = f16;
                float cos2 = (float) (d8 * Math.cos(d6));
                float sin2 = (float) (d8 * Math.sin(d6));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.a.lineTo(cos2, sin2);
                    f12 = sin2;
                    f9 = floatValue4;
                    f10 = floatValue5;
                    f11 = f3;
                } else {
                    f9 = floatValue4;
                    f10 = floatValue5;
                    double atan2 = (float) (Math.atan2(f2, f) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f11 = f3;
                    f12 = sin2;
                    float f19 = f;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f20 = z ? f9 : f10;
                    float f21 = z ? f10 : f9;
                    float f22 = (z ? f6 : f8) * f20 * 0.47829f;
                    float f23 = cos3 * f22;
                    float f24 = f22 * sin3;
                    float f25 = (z ? f8 : f6) * f21 * 0.47829f;
                    float f26 = cos4 * f25;
                    float f27 = f25 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f23 *= f15;
                            f24 *= f15;
                        } else if (d7 == ceil - 1.0d) {
                            f26 *= f15;
                            f27 *= f15;
                        }
                    }
                    this.a.cubicTo(f19 - f23, f2 - f24, cos2 + f26, f12 + f27, cos2, f12);
                }
                d6 += f18;
                z = !z;
                i3++;
                f = cos2;
                f3 = f11;
                floatValue2 = f8;
                f13 = f5;
                f16 = f4;
                floatValue3 = f6;
                floatValue4 = f9;
                floatValue5 = f10;
                f2 = f12;
            } else {
                PointF e = this.f.e();
                this.a.offset(e.x, e.y);
                this.a.close();
                return;
            }
        }
    }

    private void f() {
        nx<?, Float> nxVar;
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor(this.e.e().floatValue());
        double radians = Math.toRadians((this.g == null ? 0.0d : nxVar.e().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.k.e().floatValue() / 100.0f;
        float floatValue2 = this.i.e().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF e = this.f.e();
        this.a.offset(e.x, e.y);
        this.a.close();
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        nx<?, Float> nxVar;
        nx<?, Float> nxVar2;
        if (t == j.o) {
            this.e.a((sf<Float>) sfVar);
        } else if (t == j.p) {
            this.g.a((sf<Float>) sfVar);
        } else if (t == j.h) {
            this.f.a((sf<PointF>) sfVar);
        } else if (t == j.q && (nxVar2 = this.h) != null) {
            nxVar2.a((sf<Float>) sfVar);
        } else if (t == j.r) {
            this.i.a((sf<Float>) sfVar);
        } else if (t == j.s && (nxVar = this.j) != null) {
            nxVar.a((sf<Float>) sfVar);
        } else if (t == j.t) {
            this.k.a((sf<Float>) sfVar);
        }
    }
}
