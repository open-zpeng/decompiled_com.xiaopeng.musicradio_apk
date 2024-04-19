package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
import defpackage.nx;
import defpackage.qb;
import java.util.List;
/* compiled from: EllipseContent.java */
/* renamed from: nj  reason: default package */
/* loaded from: classes3.dex */
public class nj implements no, nq, nx.a {
    private final Path a = new Path();
    private final String b;
    private final f c;
    private final nx<?, PointF> d;
    private final nx<?, PointF> e;
    private final pl f;
    private nw g;
    private boolean h;

    public nj(f fVar, qc qcVar, pl plVar) {
        this.b = plVar.a();
        this.c = fVar;
        this.d = plVar.c().a();
        this.e = plVar.b().a();
        this.f = plVar;
        qcVar.a(this.d);
        qcVar.a(this.e);
        this.d.a(this);
        this.e.a(this);
    }

    @Override // defpackage.nx.a
    public void a() {
        c();
    }

    private void c() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < list.size(); i++) {
            ng ngVar = list.get(i);
            if (ngVar instanceof nw) {
                nw nwVar = (nw) ngVar;
                if (nwVar.c() == qb.a.Simultaneously) {
                    this.g = nwVar;
                    this.g.a(this);
                }
            }
        }
    }

    @Override // defpackage.ng
    public String b() {
        return this.b;
    }

    @Override // defpackage.nq
    public Path e() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        PointF e = this.d.e();
        float f = e.x / 2.0f;
        float f2 = e.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.d()) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF e2 = this.e.e();
        this.a.offset(e2.x, e2.y);
        this.a.close();
        sc.a(this.a, this.g);
        this.h = true;
        return this.a;
    }

    @Override // defpackage.ou
    public void a(ot otVar, int i, List<ot> list, ot otVar2) {
        sb.a(otVar, i, list, otVar2, this);
    }

    @Override // defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        if (t == j.g) {
            this.d.a((sf<PointF>) sfVar);
        } else if (t == j.h) {
            this.e.a((sf<PointF>) sfVar);
        }
    }
}
