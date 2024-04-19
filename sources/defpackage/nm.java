package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.f;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
/* compiled from: GradientStrokeContent.java */
/* renamed from: nm  reason: default package */
/* loaded from: classes3.dex */
public class nm extends nf {
    private final String b;
    private final bi<LinearGradient> c;
    private final bi<RadialGradient> d;
    private final RectF e;
    private final pq f;
    private final int g;
    private final nx<pn, pn> h;
    private final nx<PointF, PointF> i;
    private final nx<PointF, PointF> j;

    public nm(f fVar, qc qcVar, pp ppVar) {
        super(fVar, qcVar, ppVar.h().a(), ppVar.i().a(), ppVar.l(), ppVar.d(), ppVar.g(), ppVar.j(), ppVar.k());
        this.c = new bi<>();
        this.d = new bi<>();
        this.e = new RectF();
        this.b = ppVar.a();
        this.f = ppVar.b();
        this.g = (int) (fVar.r().c() / 32.0f);
        this.h = ppVar.c().a();
        this.h.a(this);
        qcVar.a(this.h);
        this.i = ppVar.e().a();
        this.i.a(this);
        qcVar.a(this.i);
        this.j = ppVar.f().a();
        this.j.a(this);
        qcVar.a(this.j);
    }

    @Override // defpackage.nf, defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        a(this.e, matrix);
        if (this.f == pq.Linear) {
            this.a.setShader(c());
        } else {
            this.a.setShader(d());
        }
        super.a(canvas, matrix, i);
    }

    @Override // defpackage.ng
    public String b() {
        return this.b;
    }

    private LinearGradient c() {
        long e = e();
        LinearGradient a = this.c.a(e);
        if (a != null) {
            return a;
        }
        PointF e2 = this.i.e();
        PointF e3 = this.j.e();
        pn e4 = this.h.e();
        LinearGradient linearGradient = new LinearGradient((int) (this.e.left + (this.e.width() / 2.0f) + e2.x), (int) (this.e.top + (this.e.height() / 2.0f) + e2.y), (int) (this.e.left + (this.e.width() / 2.0f) + e3.x), (int) (this.e.top + (this.e.height() / 2.0f) + e3.y), e4.b(), e4.a(), Shader.TileMode.CLAMP);
        this.c.b(e, linearGradient);
        return linearGradient;
    }

    private RadialGradient d() {
        int width;
        int height;
        long e = e();
        RadialGradient a = this.d.a(e);
        if (a != null) {
            return a;
        }
        PointF e2 = this.i.e();
        PointF e3 = this.j.e();
        pn e4 = this.h.e();
        int[] b = e4.b();
        float[] a2 = e4.a();
        RadialGradient radialGradient = new RadialGradient((int) (this.e.left + (this.e.width() / 2.0f) + e2.x), (int) (this.e.top + (this.e.height() / 2.0f) + e2.y), (float) Math.hypot(((int) ((this.e.left + (this.e.width() / 2.0f)) + e3.x)) - width, ((int) ((this.e.top + (this.e.height() / 2.0f)) + e3.y)) - height), b, a2, Shader.TileMode.CLAMP);
        this.d.b(e, radialGradient);
        return radialGradient;
    }

    private int e() {
        int round = Math.round(this.i.f() * this.g);
        int round2 = Math.round(this.j.f() * this.g);
        int round3 = Math.round(this.h.f() * this.g);
        int i = round != 0 ? IInputController.KEYCODE_KNOB_TALKING_BOOK * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
