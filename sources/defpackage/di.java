package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* renamed from: di  reason: default package */
/* loaded from: classes3.dex */
public class di extends Cdo {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public boolean a() {
        return false;
    }

    public di(cq cqVar) {
        super(cqVar);
        cqVar.f.c();
        cqVar.g.c();
        this.h = ((ct) cqVar).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void c() {
        this.j.a();
    }

    @Override // defpackage.Cdo
    void d() {
        this.j.j = false;
        this.k.j = false;
    }

    private void a(de deVar) {
        this.j.k.add(deVar);
        deVar.l.add(this.j);
    }

    @Override // defpackage.Cdo, defpackage.dc
    public void a(dc dcVar) {
        if (this.j.c && !this.j.j) {
            this.j.a((int) ((this.j.l.get(0).g * ((ct) this.d).f()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void f() {
        ct ctVar = (ct) this.d;
        int g = ctVar.g();
        int h = ctVar.h();
        ctVar.f();
        if (ctVar.c() == 1) {
            if (g != -1) {
                this.j.l.add(this.d.K.f.j);
                this.d.K.f.j.k.add(this.j);
                this.j.f = g;
            } else if (h != -1) {
                this.j.l.add(this.d.K.f.k);
                this.d.K.f.k.k.add(this.j);
                this.j.f = -h;
            } else {
                this.j.b = true;
                this.j.l.add(this.d.K.f.k);
                this.d.K.f.k.k.add(this.j);
            }
            a(this.d.f.j);
            a(this.d.f.k);
            return;
        }
        if (g != -1) {
            this.j.l.add(this.d.K.g.j);
            this.d.K.g.j.k.add(this.j);
            this.j.f = g;
        } else if (h != -1) {
            this.j.l.add(this.d.K.g.k);
            this.d.K.g.k.k.add(this.j);
            this.j.f = -h;
        } else {
            this.j.b = true;
            this.j.l.add(this.d.K.g.k);
            this.d.K.g.k.k.add(this.j);
        }
        a(this.d.g.j);
        a(this.d.g.k);
    }

    @Override // defpackage.Cdo
    public void e() {
        if (((ct) this.d).c() == 1) {
            this.d.o(this.j.g);
        } else {
            this.d.p(this.j.g);
        }
    }
}
