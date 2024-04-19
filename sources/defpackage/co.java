package defpackage;

import defpackage.cq;
import java.util.ArrayList;
/* compiled from: ChainHead.java */
/* renamed from: co  reason: default package */
/* loaded from: classes3.dex */
public class co {
    protected cq a;
    protected cq b;
    protected cq c;
    protected cq d;
    protected cq e;
    protected cq f;
    protected cq g;
    protected ArrayList<cq> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    boolean o;
    protected boolean p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private int t;
    private boolean u;
    private boolean v;

    public co(cq cqVar, int i, boolean z) {
        this.u = false;
        this.a = cqVar;
        this.t = i;
        this.u = z;
    }

    private static boolean a(cq cqVar, int i) {
        return cqVar.B() != 8 && cqVar.f158J[i] == cq.a.MATCH_CONSTRAINT && (cqVar.o[i] == 0 || cqVar.o[i] == 3);
    }

    private void b() {
        int i = this.t * 2;
        cq cqVar = this.a;
        boolean z = true;
        this.o = true;
        cq cqVar2 = cqVar;
        cq cqVar3 = cqVar2;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            cq cqVar4 = null;
            cqVar2.as[this.t] = null;
            cqVar2.ar[this.t] = null;
            if (cqVar2.B() != 8) {
                this.l++;
                if (cqVar2.x(this.t) != cq.a.MATCH_CONSTRAINT) {
                    this.m += cqVar2.m(this.t);
                }
                this.m += cqVar2.H[i].j();
                int i2 = i + 1;
                this.m += cqVar2.H[i2].j();
                this.n += cqVar2.H[i].j();
                this.n += cqVar2.H[i2].j();
                if (this.b == null) {
                    this.b = cqVar2;
                }
                this.d = cqVar2;
                if (cqVar2.f158J[this.t] == cq.a.MATCH_CONSTRAINT) {
                    if (cqVar2.o[this.t] == 0 || cqVar2.o[this.t] == 3 || cqVar2.o[this.t] == 2) {
                        this.j++;
                        float f = cqVar2.aq[this.t];
                        if (f > 0.0f) {
                            this.k += cqVar2.aq[this.t];
                        }
                        if (a(cqVar2, this.t)) {
                            if (f < 0.0f) {
                                this.p = true;
                            } else {
                                this.q = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(cqVar2);
                        }
                        if (this.f == null) {
                            this.f = cqVar2;
                        }
                        cq cqVar5 = this.g;
                        if (cqVar5 != null) {
                            cqVar5.ar[this.t] = cqVar2;
                        }
                        this.g = cqVar2;
                    }
                    if (this.t == 0) {
                        if (cqVar2.m != 0) {
                            this.o = false;
                        } else if (cqVar2.p != 0 || cqVar2.q != 0) {
                            this.o = false;
                        }
                    } else if (cqVar2.n != 0) {
                        this.o = false;
                    } else if (cqVar2.s != 0 || cqVar2.t != 0) {
                        this.o = false;
                    }
                    if (cqVar2.N != 0.0f) {
                        this.o = false;
                        this.s = true;
                    }
                }
            }
            if (cqVar3 != cqVar2) {
                cqVar3.as[this.t] = cqVar2;
            }
            cp cpVar = cqVar2.H[i + 1].c;
            if (cpVar != null) {
                cq cqVar6 = cpVar.a;
                if (cqVar6.H[i].c != null && cqVar6.H[i].c.a == cqVar2) {
                    cqVar4 = cqVar6;
                }
            }
            if (cqVar4 == null) {
                z2 = true;
                cqVar4 = cqVar2;
            }
            cqVar3 = cqVar2;
            cqVar2 = cqVar4;
        }
        cq cqVar7 = this.b;
        if (cqVar7 != null) {
            this.m -= cqVar7.H[i].j();
        }
        cq cqVar8 = this.d;
        if (cqVar8 != null) {
            this.m -= cqVar8.H[i + 1].j();
        }
        this.c = cqVar2;
        if (this.t == 0 && this.u) {
            this.e = this.c;
        } else {
            this.e = this.a;
        }
        if (!this.q || !this.p) {
            z = false;
        }
        this.r = z;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
