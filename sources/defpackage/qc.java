package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import defpackage.nx;
import defpackage.pr;
import defpackage.qf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: BaseLayer.java */
/* renamed from: qc  reason: default package */
/* loaded from: classes3.dex */
public abstract class qc implements ni, nx.a, ou {
    final f b;
    final qf c;
    final ol d;
    private final String p;
    private od q;
    private qc r;
    private qc s;
    private List<qc> t;
    private final Path e = new Path();
    private final Matrix f = new Matrix();
    private final Paint g = new Paint(1);
    private final Paint h = new Paint(1);
    private final Paint i = new Paint(1);
    private final Paint j = new Paint(1);
    private final Paint k = new Paint();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    final Matrix a = new Matrix();
    private final List<nx<?, ?>> u = new ArrayList();
    private boolean v = true;

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
    }

    abstract void b(Canvas canvas, Matrix matrix, int i);

    void b(ot otVar, int i, List<ot> list, ot otVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qc a(qf qfVar, f fVar, d dVar) {
        switch (qfVar.k()) {
            case Shape:
                return new qh(fVar, qfVar);
            case PreComp:
                return new qd(fVar, qfVar, dVar.b(qfVar.g()), dVar);
            case Solid:
                return new qi(fVar, qfVar);
            case Image:
                return new qe(fVar, qfVar);
            case Null:
                return new qg(fVar, qfVar);
            case Text:
                return new qj(fVar, qfVar);
            default:
                c.b("Unknown layer type " + qfVar.k());
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qc(f fVar, qf qfVar) {
        this.b = fVar;
        this.c = qfVar;
        this.p = qfVar.f() + "#draw";
        this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (qfVar.l() == qf.b.Invert) {
            this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.d = qfVar.o().h();
        this.d.a((nx.a) this);
        if (qfVar.j() != null && !qfVar.j().isEmpty()) {
            this.q = new od(qfVar.j());
            for (nx<pw, Path> nxVar : this.q.b()) {
                nxVar.a(this);
            }
            for (nx<Integer, Integer> nxVar2 : this.q.c()) {
                a(nxVar2);
                nxVar2.a(this);
            }
        }
        f();
    }

    @Override // defpackage.nx.a
    public void a() {
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qf c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(qc qcVar) {
        this.r = qcVar;
    }

    boolean d() {
        return this.r != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(qc qcVar) {
        this.s = qcVar;
    }

    private void f() {
        if (!this.c.d().isEmpty()) {
            final nz nzVar = new nz(this.c.d());
            nzVar.a();
            nzVar.a(new nx.a() { // from class: qc.1
                @Override // defpackage.nx.a
                public void a() {
                    qc.this.a(nzVar.e().floatValue() == 1.0f);
                }
            });
            a(nzVar.e().floatValue() == 1.0f);
            a(nzVar);
            return;
        }
        a(true);
    }

    private void g() {
        this.b.invalidateSelf();
    }

    @SuppressLint({"WrongConstant"})
    private void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    public void a(nx<?, ?> nxVar) {
        this.u.add(nxVar);
    }

    @Override // defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        this.a.preConcat(this.d.d());
    }

    @Override // defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        c.c(this.p);
        if (!this.v) {
            c.d(this.p);
            return;
        }
        h();
        c.c("Layer#parentMatrix");
        this.f.reset();
        this.f.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.f.preConcat(this.t.get(size).d.d());
        }
        c.d("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * this.d.a().e().intValue()) / 100.0f) * 255.0f);
        if (!d() && !e()) {
            this.f.preConcat(this.d.d());
            c.c("Layer#drawLayer");
            b(canvas, this.f, intValue);
            c.d("Layer#drawLayer");
            b(c.d(this.p));
            return;
        }
        c.c("Layer#computeBounds");
        this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
        a(this.l, this.f);
        c(this.l, this.f);
        this.f.preConcat(this.d.d());
        b(this.l, this.f);
        this.l.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        c.d("Layer#computeBounds");
        c.c("Layer#saveLayer");
        a(canvas, this.l, this.g, true);
        c.d("Layer#saveLayer");
        a(canvas);
        c.c("Layer#drawLayer");
        b(canvas, this.f, intValue);
        c.d("Layer#drawLayer");
        if (e()) {
            a(canvas, this.f);
        }
        if (d()) {
            c.c("Layer#drawMatte");
            c.c("Layer#saveLayer");
            a(canvas, this.l, this.j, false);
            c.d("Layer#saveLayer");
            a(canvas);
            this.r.a(canvas, matrix, intValue);
            c.c("Layer#restoreLayer");
            canvas.restore();
            c.d("Layer#restoreLayer");
            c.d("Layer#drawMatte");
        }
        c.c("Layer#restoreLayer");
        canvas.restore();
        c.d("Layer#restoreLayer");
        b(c.d(this.p));
    }

    private void b(float f) {
        this.b.r().a().a(this.c.f(), f);
    }

    private void a(Canvas canvas) {
        c.c("Layer#clearLayer");
        canvas.drawRect(this.l.left - 1.0f, this.l.top - 1.0f, this.l.right + 1.0f, this.l.bottom + 1.0f, this.k);
        c.d("Layer#clearLayer");
    }

    private void b(RectF rectF, Matrix matrix) {
        this.m.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (e()) {
            int size = this.q.a().size();
            for (int i = 0; i < size; i++) {
                this.e.set(this.q.b().get(i).e());
                this.e.transform(matrix);
                switch (this.q.a().get(i).a()) {
                    case MaskModeSubtract:
                        return;
                    case MaskModeIntersect:
                        return;
                    default:
                        this.e.computeBounds(this.o, false);
                        if (i == 0) {
                            this.m.set(this.o);
                        } else {
                            RectF rectF2 = this.m;
                            rectF2.set(Math.min(rectF2.left, this.o.left), Math.min(this.m.top, this.o.top), Math.max(this.m.right, this.o.right), Math.max(this.m.bottom, this.o.bottom));
                        }
                }
            }
            rectF.set(Math.max(rectF.left, this.m.left), Math.max(rectF.top, this.m.top), Math.min(rectF.right, this.m.right), Math.min(rectF.bottom, this.m.bottom));
        }
    }

    private void c(RectF rectF, Matrix matrix) {
        if (d() && this.c.l() != qf.b.Invert) {
            this.r.a(this.n, matrix);
            rectF.set(Math.max(rectF.left, this.n.left), Math.max(rectF.top, this.n.top), Math.min(rectF.right, this.n.right), Math.min(rectF.bottom, this.n.bottom));
        }
    }

    private void a(Canvas canvas, Matrix matrix) {
        a(canvas, matrix, pr.a.MaskModeAdd);
        a(canvas, matrix, pr.a.MaskModeIntersect);
        a(canvas, matrix, pr.a.MaskModeSubtract);
    }

    private void a(Canvas canvas, Matrix matrix, pr.a aVar) {
        Paint paint;
        boolean z = true;
        if (AnonymousClass2.b[aVar.ordinal()] == 1) {
            paint = this.i;
        } else {
            paint = this.h;
        }
        int size = this.q.a().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (this.q.a().get(i).a() == aVar) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            c.c("Layer#drawMask");
            c.c("Layer#saveLayer");
            a(canvas, this.l, paint, false);
            c.d("Layer#saveLayer");
            a(canvas);
            for (int i2 = 0; i2 < size; i2++) {
                if (this.q.a().get(i2).a() == aVar) {
                    this.e.set(this.q.b().get(i2).e());
                    this.e.transform(matrix);
                    int alpha = this.g.getAlpha();
                    this.g.setAlpha((int) (this.q.c().get(i2).e().intValue() * 2.55f));
                    canvas.drawPath(this.e, this.g);
                    this.g.setAlpha(alpha);
                }
            }
            c.c("Layer#restoreLayer");
            canvas.restore();
            c.d("Layer#restoreLayer");
            c.d("Layer#drawMask");
        }
    }

    boolean e() {
        od odVar = this.q;
        return (odVar == null || odVar.b().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        this.d.a(f);
        if (this.q != null) {
            for (int i = 0; i < this.q.b().size(); i++) {
                this.q.b().get(i).a(f);
            }
        }
        if (this.c.b() != 0.0f) {
            f /= this.c.b();
        }
        qc qcVar = this.r;
        if (qcVar != null) {
            this.r.a(qcVar.c.b() * f);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            this.u.get(i2).a(f);
        }
    }

    private void h() {
        if (this.t != null) {
            return;
        }
        if (this.s == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        for (qc qcVar = this.s; qcVar != null; qcVar = qcVar.s) {
            this.t.add(qcVar);
        }
    }

    @Override // defpackage.ng
    public String b() {
        return this.c.f();
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        if (otVar.a(b(), i)) {
            if (!"__container".equals(b())) {
                otVar2 = otVar2.a(b());
                if (otVar.c(b(), i)) {
                    list.add(otVar2.a(this));
                }
            }
            if (otVar.d(b(), i)) {
                b(otVar, i + otVar.b(b(), i), list, otVar2);
            }
        }
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        this.d.a(t, sfVar);
    }
}
