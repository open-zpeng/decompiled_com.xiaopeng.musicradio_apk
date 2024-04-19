package defpackage;

import defpackage.nx;
import defpackage.qb;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TrimPathContent.java */
/* renamed from: nw  reason: default package */
/* loaded from: classes3.dex */
public class nw implements ng, nx.a {
    private final String a;
    private final List<nx.a> b = new ArrayList();
    private final qb.a c;
    private final nx<?, Float> d;
    private final nx<?, Float> e;
    private final nx<?, Float> f;

    @Override // defpackage.ng
    public void a(List<ng> list, List<ng> list2) {
    }

    public nw(qc qcVar, qb qbVar) {
        this.a = qbVar.a();
        this.c = qbVar.b();
        this.d = qbVar.d().a();
        this.e = qbVar.c().a();
        this.f = qbVar.e().a();
        qcVar.a(this.d);
        qcVar.a(this.e);
        qcVar.a(this.f);
        this.d.a(this);
        this.e.a(this);
        this.f.a(this);
    }

    @Override // defpackage.nx.a
    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).a();
        }
    }

    @Override // defpackage.ng
    public String b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(nx.a aVar) {
        this.b.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qb.a c() {
        return this.c;
    }

    public nx<?, Float> d() {
        return this.d;
    }

    public nx<?, Float> e() {
        return this.e;
    }

    public nx<?, Float> f() {
        return this.f;
    }
}
