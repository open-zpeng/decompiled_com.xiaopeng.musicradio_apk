package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import defpackage.nx;
import defpackage.qb;
import java.util.List;
/* compiled from: RectangleContent.java */
/* renamed from: ns  reason: default package */
/* loaded from: classes3.dex */
public class ns implements no, nq, nx.a {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final f d;
    private final nx<?, PointF> e;
    private final nx<?, PointF> f;
    private final nx<?, Float> g;
    private nw h;
    private boolean i;

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
    }

    public ns(f fVar, qc qcVar, pu puVar) {
        this.c = puVar.a();
        this.d = fVar;
        this.e = puVar.d().a();
        this.f = puVar.c().a();
        this.g = puVar.b().a();
        qcVar.a(this.e);
        qcVar.a(this.f);
        qcVar.a(this.g);
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
    }

    @Override // defpackage.ng
    public String b() {
        return this.c;
    }

    @Override // defpackage.nx.a
    public void a() {
        c();
    }

    private void c() {
        this.i = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < list.size(); i++) {
            ng ngVar = list.get(i);
            if (ngVar instanceof nw) {
                nw nwVar = (nw) ngVar;
                if (nwVar.c() == qb.a.Simultaneously) {
                    this.h = nwVar;
                    this.h.a(this);
                }
            }
        }
    }

    @Override // defpackage.nq
    public Path e() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        PointF e = this.f.e();
        float f = e.x / 2.0f;
        float f2 = e.y / 2.0f;
        nx<?, Float> nxVar = this.g;
        float floatValue = nxVar == null ? 0.0f : nxVar.e().floatValue();
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF e2 = this.e.e();
        this.a.moveTo(e2.x + f, (e2.y - f2) + floatValue);
        this.a.lineTo(e2.x + f, (e2.y + f2) - floatValue);
        int i = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
        if (i > 0) {
            float f3 = floatValue * 2.0f;
            this.b.set((e2.x + f) - f3, (e2.y + f2) - f3, e2.x + f, e2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((e2.x - f) + floatValue, e2.y + f2);
        if (i > 0) {
            float f4 = floatValue * 2.0f;
            this.b.set(e2.x - f, (e2.y + f2) - f4, (e2.x - f) + f4, e2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(e2.x - f, (e2.y - f2) + floatValue);
        if (i > 0) {
            float f5 = floatValue * 2.0f;
            this.b.set(e2.x - f, e2.y - f2, (e2.x - f) + f5, (e2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((e2.x + f) - floatValue, e2.y - f2);
        if (i > 0) {
            float f6 = floatValue * 2.0f;
            this.b.set((e2.x + f) - f6, e2.y - f2, e2.x + f, (e2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        sc.a(this.a, this.h);
        this.i = true;
        return this.a;
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }
}
