package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import defpackage.nx;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FillContent.java */
/* renamed from: nk  reason: default package */
/* loaded from: classes3.dex */
public class nk implements ni, no, nx.a {
    private final qc c;
    private final String d;
    private final nx<Integer, Integer> f;
    private final nx<Integer, Integer> g;
    private nx<ColorFilter, ColorFilter> h;
    private final f i;
    private final Path a = new Path();
    private final Paint b = new Paint(1);
    private final List<nq> e = new ArrayList();

    public nk(f fVar, qc qcVar, px pxVar) {
        this.c = qcVar;
        this.d = pxVar.a();
        this.i = fVar;
        if (pxVar.b() == null || pxVar.c() == null) {
            this.f = null;
            this.g = null;
            return;
        }
        this.a.setFillType(pxVar.d());
        this.f = pxVar.b().a();
        this.f.a(this);
        qcVar.a(this.f);
        this.g = pxVar.c().a();
        this.g.a(this);
        qcVar.a(this.g);
    }

    @Override // defpackage.nx.a
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ng ngVar = list2.get(i);
            if (ngVar instanceof nq) {
                this.e.add((nq) ngVar);
            }
        }
    }

    @Override // defpackage.ng
    public String b() {
        return this.d;
    }

    @Override // defpackage.ni
    public void a(Canvas canvas, Matrix matrix, int i) {
        c.c("FillContent#draw");
        this.b.setColor(this.f.e().intValue());
        this.b.setAlpha(sb.a((int) ((((i / 255.0f) * this.g.e().intValue()) / 100.0f) * 255.0f), 0, 255));
        nx<ColorFilter, ColorFilter> nxVar = this.h;
        if (nxVar != null) {
            this.b.setColorFilter(nxVar.e());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            this.a.addPath(this.e.get(i2).e(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        c.d("FillContent#draw");
    }

    @Override // defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        this.a.reset();
        for (int i = 0; i < this.e.size(); i++) {
            this.a.addPath(this.e.get(i).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        if (t == j.a) {
            this.f.a((sf<Integer>) sfVar);
        } else if (t == j.d) {
            this.g.a((sf<Integer>) sfVar);
        } else if (t == j.x) {
            if (sfVar == null) {
                this.h = null;
                return;
            }
            this.h = new om(sfVar);
            this.h.a(this);
            this.c.a(this.h);
        }
    }
}
