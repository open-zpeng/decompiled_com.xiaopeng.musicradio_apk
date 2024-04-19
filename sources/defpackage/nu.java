package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;
import defpackage.nx;
import defpackage.qb;
import java.util.List;
/* compiled from: ShapeContent.java */
/* renamed from: nu  reason: default package */
/* loaded from: classes3.dex */
public class nu implements nq, nx.a {
    private final Path a = new Path();
    private final String b;
    private final f c;
    private final nx<?, Path> d;
    private boolean e;
    private nw f;

    public nu(f fVar, qc qcVar, pz pzVar) {
        this.b = pzVar.a();
        this.c = fVar;
        this.d = pzVar.b().a();
        qcVar.a(this.d);
        this.d.a(this);
    }

    @Override // defpackage.nx.a
    public void a() {
        c();
    }

    private void c() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
        for (int i = 0; i < list.size(); i++) {
            ng ngVar = list.get(i);
            if (ngVar instanceof nw) {
                nw nwVar = (nw) ngVar;
                if (nwVar.c() == qb.a.Simultaneously) {
                    this.f = nwVar;
                    this.f.a(this);
                }
            }
        }
    }

    @Override // defpackage.nq
    public Path e() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        this.a.set(this.d.e());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        sc.a(this.a, this.f);
        this.e = true;
        return this.a;
    }

    @Override // defpackage.ng
    public String b() {
        return this.b;
    }
}
