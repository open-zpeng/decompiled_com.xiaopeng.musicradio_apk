package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import defpackage.nx;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GradientFillContent.java */
/* renamed from: nl  reason: default package */
/* loaded from: classes3.dex */
public class nl implements ni, no, nx.a {
    private final String a;
    private final qc b;
    private final bi<LinearGradient> c = new bi<>();
    private final bi<RadialGradient> d = new bi<>();
    private final Matrix e = new Matrix();
    private final Path f = new Path();
    private final Paint g = new Paint(1);
    private final RectF h = new RectF();
    private final List<nq> i = new ArrayList();
    private final pq j;
    private final nx<pn, pn> k;
    private final nx<Integer, Integer> l;
    private final nx<PointF, PointF> m;
    private final nx<PointF, PointF> n;
    private nx<ColorFilter, ColorFilter> o;
    private final f p;
    private final int q;

    public nl(f fVar, qc qcVar, po poVar) {
        this.b = qcVar;
        this.a = poVar.a();
        this.p = fVar;
        this.j = poVar.b();
        this.f.setFillType(poVar.c());
        this.q = (int) (fVar.r().c() / 32.0f);
        this.k = poVar.d().a();
        this.k.a(this);
        qcVar.a(this.k);
        this.l = poVar.e().a();
        this.l.a(this);
        qcVar.a(this.l);
        this.m = poVar.f().a();
        this.m.a(this);
        qcVar.a(this.m);
        this.n = poVar.g().a();
        this.n.a(this);
        qcVar.a(this.n);
    }

    @Override // defpackage.nx.a
    public void a() {
        this.p.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ng ngVar = list2.get(i);
            if (ngVar instanceof nq) {
                this.i.add((nq) ngVar);
            }
        }
    }

    @Override // defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        Shader d;
        c.c("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).e(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.j == pq.Linear) {
            d = c();
        } else {
            d = d();
        }
        this.e.set(matrix);
        d.setLocalMatrix(this.e);
        this.g.setShader(d);
        nx<ColorFilter, ColorFilter> nxVar = this.o;
        if (nxVar != null) {
            this.g.setColorFilter(nxVar.e());
        }
        this.g.setAlpha(sb.a((int) ((((i / 255.0f) * this.l.e().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        c.d("GradientFillContent#draw");
    }

    @Override // defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).e(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.ng
    public String b() {
        return this.a;
    }

    private LinearGradient c() {
        long e = e();
        LinearGradient a = this.c.a(e);
        if (a != null) {
            return a;
        }
        PointF e2 = this.m.e();
        PointF e3 = this.n.e();
        pn e4 = this.k.e();
        LinearGradient linearGradient = new LinearGradient(e2.x, e2.y, e3.x, e3.y, e4.b(), e4.a(), Shader.TileMode.CLAMP);
        this.c.b(e, linearGradient);
        return linearGradient;
    }

    private RadialGradient d() {
        float f;
        float f2;
        long e = e();
        RadialGradient a = this.d.a(e);
        if (a != null) {
            return a;
        }
        PointF e2 = this.m.e();
        PointF e3 = this.n.e();
        pn e4 = this.k.e();
        int[] b = e4.b();
        float[] a2 = e4.a();
        RadialGradient radialGradient = new RadialGradient(e2.x, e2.y, (float) Math.hypot(e3.x - f, e3.y - f2), b, a2, Shader.TileMode.CLAMP);
        this.d.b(e, radialGradient);
        return radialGradient;
    }

    private int e() {
        int round = Math.round(this.m.f() * this.q);
        int round2 = Math.round(this.n.f() * this.q);
        int round3 = Math.round(this.k.f() * this.q);
        int i = round != 0 ? IInputController.KEYCODE_KNOB_TALKING_BOOK * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        if (t == j.x) {
            if (sfVar == null) {
                this.o = null;
                return;
            }
            this.o = new om(sfVar);
            this.o.a(this);
            this.b.a(this.o);
        }
    }
}
