package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import defpackage.nx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* compiled from: RepeaterContent.java */
/* renamed from: nt  reason: default package */
/* loaded from: classes3.dex */
public class nt implements ni, nn, no, nq, nx.a {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final f c;
    private final qc d;
    private final String e;
    private final nx<Float, Float> f;
    private final nx<Float, Float> g;
    private final ol h;
    private nh i;

    public nt(f fVar, qc qcVar, pv pvVar) {
        this.c = fVar;
        this.d = qcVar;
        this.e = pvVar.a();
        this.f = pvVar.b().a();
        qcVar.a(this.f);
        this.f.a(this);
        this.g = pvVar.c().a();
        qcVar.a(this.g);
        this.g.a(this);
        this.h = pvVar.d().h();
        this.h.a(qcVar);
        this.h.a(this);
    }

    @Override // defpackage.nn
    public void a(ListIterator<ng> listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new nh(this.c, this.d, "Repeater", arrayList, null);
    }

    @Override // defpackage.ng
    public String b() {
        return this.e;
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        this.i.a(list, list2);
    }

    @Override // defpackage.nq
    public Path e() {
        Path e = this.i.e();
        this.b.reset();
        float floatValue = this.f.e().floatValue();
        float floatValue2 = this.g.e().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.a.set(this.h.b(i + floatValue2));
            this.b.addPath(e, this.a);
        }
        return this.b;
    }

    @Override // defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f.e().floatValue();
        float floatValue2 = this.g.e().floatValue();
        float floatValue3 = this.h.b().e().floatValue() / 100.0f;
        float floatValue4 = this.h.c().e().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.h.b(f + floatValue2));
            this.i.a(canvas, this.a, (int) (i * sb.a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        this.i.a(rectF, matrix);
    }

    @Override // defpackage.nx.a
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        if (this.h.a(t, sfVar)) {
            return;
        }
        if (t == j.m) {
            this.f.a((sf<Float>) sfVar);
        } else if (t == j.n) {
            this.g.a((sf<Float>) sfVar);
        }
    }
}
