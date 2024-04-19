package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import defpackage.nx;
import defpackage.qb;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseStrokeContent.java */
/* renamed from: nf  reason: default package */
/* loaded from: classes3.dex */
public abstract class nf implements ni, no, nx.a {
    private final f f;
    private final qc g;
    private final float[] i;
    private final nx<?, Float> j;
    private final nx<?, Integer> k;
    private final List<nx<?, Float>> l;
    private final nx<?, Float> m;
    private nx<ColorFilter, ColorFilter> n;
    private final PathMeasure b = new PathMeasure();
    private final Path c = new Path();
    private final Path d = new Path();
    private final RectF e = new RectF();
    private final List<a> h = new ArrayList();
    final Paint a = new Paint(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public nf(f fVar, qc qcVar, Paint.Cap cap, Paint.Join join, float f, pa paVar, oy oyVar, List<oy> list, oy oyVar2) {
        this.f = fVar;
        this.g = qcVar;
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeCap(cap);
        this.a.setStrokeJoin(join);
        this.a.setStrokeMiter(f);
        this.k = paVar.a();
        this.j = oyVar.a();
        if (oyVar2 == null) {
            this.m = null;
        } else {
            this.m = oyVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        qcVar.a(this.k);
        qcVar.a(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            qcVar.a(this.l.get(i2));
        }
        nx<?, Float> nxVar = this.m;
        if (nxVar != null) {
            qcVar.a(nxVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        nx<?, Float> nxVar2 = this.m;
        if (nxVar2 != null) {
            nxVar2.a(this);
        }
    }

    @Override // defpackage.nx.a
    public void a() {
        this.f.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        nw nwVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            ng ngVar = list.get(size);
            if (ngVar instanceof nw) {
                nw nwVar2 = (nw) ngVar;
                if (nwVar2.c() == qb.a.Individually) {
                    nwVar = nwVar2;
                }
            }
        }
        if (nwVar != null) {
            nwVar.a(this);
        }
        a aVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            ng ngVar2 = list2.get(size2);
            if (ngVar2 instanceof nw) {
                nw nwVar3 = (nw) ngVar2;
                if (nwVar3.c() == qb.a.Individually) {
                    if (aVar != null) {
                        this.h.add(aVar);
                    }
                    aVar = new a(nwVar3);
                    nwVar3.a(this);
                }
            }
            if (ngVar2 instanceof nq) {
                if (aVar == null) {
                    aVar = new a(nwVar);
                }
                aVar.a.add((nq) ngVar2);
            }
        }
        if (aVar != null) {
            this.h.add(aVar);
        }
    }

    @Override // defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        c.c("StrokeContent#draw");
        this.a.setAlpha(sb.a((int) ((((i / 255.0f) * this.k.e().intValue()) / 100.0f) * 255.0f), 0, 255));
        this.a.setStrokeWidth(this.j.e().floatValue() * sc.a(matrix));
        if (this.a.getStrokeWidth() <= 0.0f) {
            c.d("StrokeContent#draw");
            return;
        }
        a(matrix);
        nx<ColorFilter, ColorFilter> nxVar = this.n;
        if (nxVar != null) {
            this.a.setColorFilter(nxVar.e());
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            a aVar = this.h.get(i2);
            if (aVar.b != null) {
                a(canvas, aVar, matrix);
            } else {
                c.c("StrokeContent#buildPath");
                this.c.reset();
                for (int size = aVar.a.size() - 1; size >= 0; size--) {
                    this.c.addPath(((nq) aVar.a.get(size)).e(), matrix);
                }
                c.d("StrokeContent#buildPath");
                c.c("StrokeContent#drawPath");
                canvas.drawPath(this.c, this.a);
                c.d("StrokeContent#drawPath");
            }
        }
        c.d("StrokeContent#draw");
    }

    private void a(Canvas canvas, a aVar, Matrix matrix) {
        c.c("StrokeContent#applyTrimPath");
        if (aVar.b == null) {
            c.d("StrokeContent#applyTrimPath");
            return;
        }
        this.c.reset();
        for (int size = aVar.a.size() - 1; size >= 0; size--) {
            this.c.addPath(((nq) aVar.a.get(size)).e(), matrix);
        }
        this.b.setPath(this.c, false);
        float length = this.b.getLength();
        while (this.b.nextContour()) {
            length += this.b.getLength();
        }
        float floatValue = (aVar.b.f().e().floatValue() * length) / 360.0f;
        float floatValue2 = ((aVar.b.d().e().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((aVar.b.e().e().floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = aVar.a.size() - 1; size2 >= 0; size2--) {
            this.d.set(((nq) aVar.a.get(size2)).e());
            this.d.transform(matrix);
            this.b.setPath(this.d, false);
            float length2 = this.b.getLength();
            if (floatValue3 > length) {
                float f2 = floatValue3 - length;
                if (f2 < f + length2 && f < f2) {
                    sc.a(this.d, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f2 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.d, this.a);
                    f += length2;
                }
            }
            float f3 = f + length2;
            if (f3 >= floatValue2 && f <= floatValue3) {
                if (f3 <= floatValue3 && floatValue2 < f) {
                    canvas.drawPath(this.d, this.a);
                } else {
                    sc.a(this.d, floatValue2 < f ? 0.0f : (floatValue2 - f) / length2, floatValue3 <= f3 ? (floatValue3 - f) / length2 : 1.0f, 0.0f);
                    canvas.drawPath(this.d, this.a);
                }
            }
            f += length2;
        }
        c.d("StrokeContent#applyTrimPath");
    }

    @Override // defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        c.c("StrokeContent#getBounds");
        this.c.reset();
        for (int i = 0; i < this.h.size(); i++) {
            a aVar = this.h.get(i);
            for (int i2 = 0; i2 < aVar.a.size(); i2++) {
                this.c.addPath(((nq) aVar.a.get(i2)).e(), matrix);
            }
        }
        this.c.computeBounds(this.e, false);
        float floatValue = this.j.e().floatValue();
        RectF rectF2 = this.e;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, this.e.top - f, this.e.right + f, this.e.bottom + f);
        rectF.set(this.e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        c.d("StrokeContent#getBounds");
    }

    private void a(Matrix matrix) {
        c.c("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            c.d("StrokeContent#applyDashPattern");
            return;
        }
        float a2 = sc.a(matrix);
        for (int i = 0; i < this.l.size(); i++) {
            this.i[i] = this.l.get(i).e().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.i;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.i;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.i;
            fArr3[i] = fArr3[i] * a2;
        }
        nx<?, Float> nxVar = this.m;
        this.a.setPathEffect(new DashPathEffect(this.i, nxVar == null ? 0.0f : nxVar.e().floatValue()));
        c.d("StrokeContent#applyDashPattern");
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        if (t == j.d) {
            this.k.a((sf<Integer>) sfVar);
        } else if (t == j.k) {
            this.j.a((sf<Float>) sfVar);
        } else if (t == j.x) {
            if (sfVar == null) {
                this.n = null;
                return;
            }
            this.n = new om(sfVar);
            this.n.a(this);
            this.g.a(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseStrokeContent.java */
    /* renamed from: nf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<nq> a;
        private final nw b;

        private a(nw nwVar) {
            this.a = new ArrayList();
            this.b = nwVar;
        }
    }
}
