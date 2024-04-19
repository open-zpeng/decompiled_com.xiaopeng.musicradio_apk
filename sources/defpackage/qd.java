package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CompositionLayer.java */
/* renamed from: qd  reason: default package */
/* loaded from: classes3.dex */
public class qd extends qc {
    private nx<Float, Float> e;
    private final List<qc> f;
    private final RectF g;
    private final RectF h;

    public qd(f fVar, qf qfVar, List<qf> list, d dVar) {
        super(fVar, qfVar);
        qc qcVar;
        this.f = new ArrayList();
        this.g = new RectF();
        this.h = new RectF();
        oy u = qfVar.u();
        if (u != null) {
            this.e = u.a();
            a(this.e);
            this.e.a(this);
        } else {
            this.e = null;
        }
        bi biVar = new bi(dVar.g().size());
        int size = list.size() - 1;
        qc qcVar2 = null;
        while (true) {
            if (size >= 0) {
                qc a = qc.a(list.get(size), fVar, dVar);
                if (a != null) {
                    biVar.b(a.c().e(), a);
                    if (qcVar2 != null) {
                        qcVar2.a(a);
                        qcVar2 = null;
                    } else {
                        this.f.add(0, a);
                        switch (r4.l()) {
                            case Add:
                            case Invert:
                                qcVar2 = a;
                                continue;
                        }
                    }
                }
                size--;
            } else {
                for (int i = 0; i < biVar.b(); i++) {
                    qc qcVar3 = (qc) biVar.a(biVar.b(i));
                    if (qcVar3 != null && (qcVar = (qc) biVar.a(qcVar3.c().m())) != null) {
                        qcVar3.b(qcVar);
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.qc
    void b(Canvas canvas, Matrix matrix, int i) {
        c.c("CompositionLayer#draw");
        canvas.save();
        this.h.set(0.0f, 0.0f, this.c.h(), this.c.i());
        matrix.mapRect(this.h);
        for (int size = this.f.size() - 1; size >= 0; size--) {
            if (!this.h.isEmpty() ? canvas.clipRect(this.h) : true) {
                this.f.get(size).a(canvas, matrix, i);
            }
        }
        canvas.restore();
        c.d("CompositionLayer#draw");
    }

    @Override // defpackage.qc, defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f.size() - 1; size >= 0; size--) {
            this.f.get(size).a(this.g, this.a);
            if (rectF.isEmpty()) {
                rectF.set(this.g);
            } else {
                rectF.set(Math.min(rectF.left, this.g.left), Math.min(rectF.top, this.g.top), Math.max(rectF.right, this.g.right), Math.max(rectF.bottom, this.g.bottom));
            }
        }
    }

    @Override // defpackage.qc
    public void a(float f) {
        super.a(f);
        if (this.e != null) {
            f = (this.e.e().floatValue() * 1000.0f) / this.b.r().c();
        }
        if (this.c.b() != 0.0f) {
            f /= this.c.b();
        }
        float c = f - this.c.c();
        for (int size = this.f.size() - 1; size >= 0; size--) {
            this.f.get(size).a(c);
        }
    }

    @Override // defpackage.qc
    protected void b(ot otVar, int i, List<ot> list, ot otVar2) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.f.get(i2).a(otVar, i, list, otVar2);
        }
    }

    @Override // defpackage.qc, defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        super.a((qd) t, (sf<qd>) sfVar);
        if (t == j.w) {
            if (sfVar == null) {
                this.e = null;
                return;
            }
            this.e = new om(sfVar);
            a(this.e);
        }
    }
}
