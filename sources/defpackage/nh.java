package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import defpackage.nx;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ContentGroup.java */
/* renamed from: nh  reason: default package */
/* loaded from: classes3.dex */
public class nh implements ni, nq, nx.a, ou {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final List<ng> e;
    private final f f;
    private List<nq> g;
    private ol h;

    private static List<ng> a(f fVar, qc qcVar, List<pm> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ng a = list.get(i).a(fVar, qcVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    static pi a(List<pm> list) {
        for (int i = 0; i < list.size(); i++) {
            pm pmVar = list.get(i);
            if (pmVar instanceof pi) {
                return (pi) pmVar;
            }
        }
        return null;
    }

    public nh(f fVar, qc qcVar, py pyVar) {
        this(fVar, qcVar, pyVar.a(), a(fVar, qcVar, pyVar.b()), a(pyVar.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nh(f fVar, qc qcVar, String str, List<ng> list, pi piVar) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.f = fVar;
        this.e = list;
        if (piVar != null) {
            this.h = piVar.h();
            this.h.a(qcVar);
            this.h.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            ng ngVar = list.get(size);
            if (ngVar instanceof nn) {
                arrayList.add((nn) ngVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((nn) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    @Override // defpackage.nx.a
    public void a() {
        this.f.invalidateSelf();
    }

    @Override // defpackage.ng
    public String b() {
        return this.d;
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.e.size());
        arrayList.addAll(list);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ng ngVar = this.e.get(size);
            ngVar.a(arrayList, this.e.subList(0, size));
            arrayList.add(ngVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<nq> c() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.e.size(); i++) {
                ng ngVar = this.e.get(i);
                if (ngVar instanceof nq) {
                    this.g.add((nq) ngVar);
                }
            }
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix d() {
        ol olVar = this.h;
        if (olVar != null) {
            return olVar.d();
        }
        this.a.reset();
        return this.a;
    }

    @Override // defpackage.nq
    public Path e() {
        this.a.reset();
        ol olVar = this.h;
        if (olVar != null) {
            this.a.set(olVar.d());
        }
        this.b.reset();
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ng ngVar = this.e.get(size);
            if (ngVar instanceof nq) {
                this.b.addPath(((nq) ngVar).e(), this.a);
            }
        }
        return this.b;
    }

    @Override // defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        this.a.set(matrix);
        ol olVar = this.h;
        if (olVar != null) {
            this.a.preConcat(olVar.d());
            i = (int) ((((this.h.a().e().intValue() / 100.0f) * i) / 255.0f) * 255.0f);
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ng ngVar = this.e.get(size);
            if (ngVar instanceof ni) {
                ((ni) ngVar).a(canvas, this.a, i);
            }
        }
    }

    @Override // defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        ol olVar = this.h;
        if (olVar != null) {
            this.a.preConcat(olVar.d());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ng ngVar = this.e.get(size);
            if (ngVar instanceof ni) {
                ((ni) ngVar).a(this.c, this.a);
                if (rectF.isEmpty()) {
                    rectF.set(this.c);
                } else {
                    rectF.set(Math.min(rectF.left, this.c.left), Math.min(rectF.top, this.c.top), Math.max(rectF.right, this.c.right), Math.max(rectF.bottom, this.c.bottom));
                }
            }
        }
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
                int b = i + otVar.b(b(), i);
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    ng ngVar = this.e.get(i2);
                    if (ngVar instanceof ou) {
                        ((ou) ngVar).a(otVar, b, list, otVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        ol olVar = this.h;
        if (olVar != null) {
            olVar.a(t, sfVar);
        }
    }
}
