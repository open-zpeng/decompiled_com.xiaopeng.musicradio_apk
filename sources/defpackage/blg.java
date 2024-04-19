package defpackage;
/* compiled from: ConnectActionListener.java */
/* renamed from: blg  reason: default package */
/* loaded from: classes3.dex */
public class blg implements bkh {
    private bkp a;
    private bkm b;
    private bla c;
    private bkq d;
    private bky e;
    private Object f;
    private bkh g;
    private int h;
    private bko i;
    private boolean j;

    public blg(bkm bkmVar, bkp bkpVar, bla blaVar, bkq bkqVar, bky bkyVar, Object obj, bkh bkhVar, boolean z) {
        this.a = bkpVar;
        this.b = bkmVar;
        this.c = blaVar;
        this.d = bkqVar;
        this.e = bkyVar;
        this.f = obj;
        this.g = bkhVar;
        this.h = bkqVar.d();
        this.j = z;
    }

    @Override // defpackage.bkh
    public void onSuccess(bkl bklVar) {
        if (this.h == 0) {
            this.d.c(0);
        }
        this.e.a.a(bklVar.g(), null);
        this.e.a.g();
        this.e.a.a((bki) this.b);
        this.c.j();
        if (this.g != null) {
            this.e.a(this.f);
            this.g.onSuccess(this.e);
        }
        if (this.i != null) {
            this.i.connectComplete(this.j, this.c.g()[this.c.f()].e());
        }
    }

    @Override // defpackage.bkh
    public void onFailure(bkl bklVar, Throwable th) {
        bks bksVar;
        int length = this.c.g().length;
        int f = this.c.f() + 1;
        if (f < length || (this.h == 0 && this.d.d() == 4)) {
            if (this.h == 0) {
                if (this.d.d() == 4) {
                    this.d.c(3);
                } else {
                    this.d.c(4);
                    this.c.a(f);
                }
            } else {
                this.c.a(f);
            }
            try {
                a();
                return;
            } catch (bkv e) {
                onFailure(bklVar, e);
                return;
            }
        }
        if (this.h == 0) {
            this.d.c(0);
        }
        if (th instanceof bks) {
            bksVar = (bks) th;
        } else {
            bksVar = new bks(th);
        }
        this.e.a.a(null, bksVar);
        this.e.a.g();
        this.e.a.a((bki) this.b);
        if (this.g != null) {
            this.e.a(this.f);
            this.g.onFailure(this.e, th);
        }
    }

    public void a() {
        bky bkyVar = new bky(this.b.b());
        bkyVar.a((bkh) this);
        bkyVar.a((Object) this);
        this.a.open(this.b.b(), this.b.c());
        if (this.d.l()) {
            this.a.clear();
        }
        if (this.d.d() == 0) {
            this.d.c(4);
        }
        try {
            this.c.a(this.d, bkyVar);
        } catch (bks e) {
            onFailure(bkyVar, e);
        }
    }

    public void a(bko bkoVar) {
        this.i = bkoVar;
    }
}
