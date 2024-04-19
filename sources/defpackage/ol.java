package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.j;
import defpackage.nx;
/* compiled from: TransformKeyframeAnimation.java */
/* renamed from: ol  reason: default package */
/* loaded from: classes3.dex */
public class ol {
    private final Matrix a = new Matrix();
    private final nx<PointF, PointF> b;
    private final nx<?, PointF> c;
    private final nx<sg, sg> d;
    private final nx<Float, Float> e;
    private final nx<Integer, Integer> f;
    private final nx<?, Float> g;
    private final nx<?, Float> h;

    public ol(pi piVar) {
        this.b = piVar.a().a();
        this.c = piVar.b().a();
        this.d = piVar.c().a();
        this.e = piVar.d().a();
        this.f = piVar.e().a();
        if (piVar.f() != null) {
            this.g = piVar.f().a();
        } else {
            this.g = null;
        }
        if (piVar.g() != null) {
            this.h = piVar.g().a();
        } else {
            this.h = null;
        }
    }

    public void a(qc qcVar) {
        qcVar.a(this.b);
        qcVar.a(this.c);
        qcVar.a(this.d);
        qcVar.a(this.e);
        qcVar.a(this.f);
        nx<?, Float> nxVar = this.g;
        if (nxVar != null) {
            qcVar.a(nxVar);
        }
        nx<?, Float> nxVar2 = this.h;
        if (nxVar2 != null) {
            qcVar.a(nxVar2);
        }
    }

    public void a(nx.a aVar) {
        this.b.a(aVar);
        this.c.a(aVar);
        this.d.a(aVar);
        this.e.a(aVar);
        this.f.a(aVar);
        nx<?, Float> nxVar = this.g;
        if (nxVar != null) {
            nxVar.a(aVar);
        }
        nx<?, Float> nxVar2 = this.h;
        if (nxVar2 != null) {
            nxVar2.a(aVar);
        }
    }

    public void a(float f) {
        this.b.a(f);
        this.c.a(f);
        this.d.a(f);
        this.e.a(f);
        this.f.a(f);
        nx<?, Float> nxVar = this.g;
        if (nxVar != null) {
            nxVar.a(f);
        }
        nx<?, Float> nxVar2 = this.h;
        if (nxVar2 != null) {
            nxVar2.a(f);
        }
    }

    public nx<?, Integer> a() {
        return this.f;
    }

    public nx<?, Float> b() {
        return this.g;
    }

    public nx<?, Float> c() {
        return this.h;
    }

    public Matrix d() {
        this.a.reset();
        PointF e = this.c.e();
        if (e.x != 0.0f || e.y != 0.0f) {
            this.a.preTranslate(e.x, e.y);
        }
        float floatValue = this.e.e().floatValue();
        if (floatValue != 0.0f) {
            this.a.preRotate(floatValue);
        }
        sg e2 = this.d.e();
        if (e2.a() != 1.0f || e2.b() != 1.0f) {
            this.a.preScale(e2.a(), e2.b());
        }
        PointF e3 = this.b.e();
        if (e3.x != 0.0f || e3.y != 0.0f) {
            this.a.preTranslate(-e3.x, -e3.y);
        }
        return this.a;
    }

    public Matrix b(float f) {
        PointF e = this.c.e();
        PointF e2 = this.b.e();
        sg e3 = this.d.e();
        float floatValue = this.e.e().floatValue();
        this.a.reset();
        this.a.preTranslate(e.x * f, e.y * f);
        double d = f;
        this.a.preScale((float) Math.pow(e3.a(), d), (float) Math.pow(e3.b(), d));
        this.a.preRotate(floatValue * f, e2.x, e2.y);
        return this.a;
    }

    public <T> boolean a(T t, sf<T> sfVar) {
        nx<?, Float> nxVar;
        nx<?, Float> nxVar2;
        if (t == j.e) {
            this.b.a((sf<PointF>) sfVar);
            return true;
        } else if (t == j.f) {
            this.c.a((sf<PointF>) sfVar);
            return true;
        } else if (t == j.i) {
            this.d.a((sf<sg>) sfVar);
            return true;
        } else if (t == j.j) {
            this.e.a((sf<Float>) sfVar);
            return true;
        } else if (t == j.c) {
            this.f.a((sf<Integer>) sfVar);
            return true;
        } else if (t == j.u && (nxVar2 = this.g) != null) {
            nxVar2.a((sf<Float>) sfVar);
            return true;
        } else if (t != j.v || (nxVar = this.h) == null) {
            return false;
        } else {
            nxVar.a((sf<Float>) sfVar);
            return true;
        }
    }
}
