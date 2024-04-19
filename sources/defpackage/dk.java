package defpackage;

import defpackage.Cdo;
import defpackage.cp;
import defpackage.cq;
import defpackage.de;
/* compiled from: HorizontalWidgetRun.java */
/* renamed from: dk  reason: default package */
/* loaded from: classes3.dex */
public class dk extends Cdo {
    private static int[] a = new int[2];

    public dk(cq cqVar) {
        super(cqVar);
        this.j.e = de.a.LEFT;
        this.k.e = de.a.RIGHT;
        this.h = 0;
    }

    public String toString() {
        return "HorizontalRun " + this.d.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void c() {
        this.e = null;
        this.j.a();
        this.k.a();
        this.g.a();
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void d() {
        this.i = false;
        this.j.a();
        this.j.j = false;
        this.k.a();
        this.k.j = false;
        this.g.j = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public boolean a() {
        return this.f != cq.a.MATCH_CONSTRAINT || this.d.m == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void f() {
        cq A;
        int i;
        cq A2;
        if (this.d.b) {
            this.g.a(this.d.F());
        }
        if (!this.g.j) {
            this.f = this.d.X();
            if (this.f != cq.a.MATCH_CONSTRAINT) {
                if (this.f == cq.a.MATCH_PARENT && (A2 = this.d.A()) != null && (A2.X() == cq.a.FIXED || A2.X() == cq.a.MATCH_PARENT)) {
                    int F = (A2.F() - this.d.z.j()) - this.d.B.j();
                    a(this.j, A2.f.j, this.d.z.j());
                    a(this.k, A2.f.k, -this.d.B.j());
                    this.g.a(F);
                    return;
                } else if (this.f == cq.a.FIXED) {
                    this.g.a(this.d.F());
                }
            }
        } else if (this.f == cq.a.MATCH_PARENT && (A = this.d.A()) != null && (A.X() == cq.a.FIXED || A.X() == cq.a.MATCH_PARENT)) {
            a(this.j, A.f.j, this.d.z.j());
            a(this.k, A.f.k, -this.d.B.j());
            return;
        }
        if (this.g.j && this.d.b) {
            if (this.d.H[0].c != null && this.d.H[1].c != null) {
                if (this.d.Z()) {
                    this.j.f = this.d.H[0].j();
                    this.k.f = -this.d.H[1].j();
                    return;
                }
                de a2 = a(this.d.H[0]);
                if (a2 != null) {
                    a(this.j, a2, this.d.H[0].j());
                }
                de a3 = a(this.d.H[1]);
                if (a3 != null) {
                    a(this.k, a3, -this.d.H[1].j());
                }
                this.j.b = true;
                this.k.b = true;
                return;
            } else if (this.d.H[0].c != null) {
                de a4 = a(this.d.H[0]);
                if (a4 != null) {
                    a(this.j, a4, this.d.H[0].j());
                    a(this.k, this.j, this.g.g);
                    return;
                }
                return;
            } else if (this.d.H[1].c != null) {
                de a5 = a(this.d.H[1]);
                if (a5 != null) {
                    a(this.k, a5, -this.d.H[1].j());
                    a(this.j, this.k, -this.g.g);
                    return;
                }
                return;
            } else if ((this.d instanceof cu) || this.d.A() == null || this.d.a(cp.a.CENTER).c != null) {
                return;
            } else {
                a(this.j, this.d.A().f.j, this.d.D());
                a(this.k, this.j, this.g.g);
                return;
            }
        }
        if (this.f == cq.a.MATCH_CONSTRAINT && (i = this.d.m) != 0) {
            switch (i) {
                case 2:
                    cq A3 = this.d.A();
                    if (A3 != null) {
                        df dfVar = A3.g.g;
                        this.g.l.add(dfVar);
                        dfVar.k.add(this.g);
                        this.g.b = true;
                        this.g.k.add(this.j);
                        this.g.k.add(this.k);
                        break;
                    }
                    break;
                case 3:
                    if (this.d.n == 3) {
                        this.j.a = this;
                        this.k.a = this;
                        this.d.g.j.a = this;
                        this.d.g.k.a = this;
                        this.g.a = this;
                        if (this.d.aa()) {
                            this.g.l.add(this.d.g.g);
                            this.d.g.g.k.add(this.g);
                            this.d.g.g.a = this;
                            this.g.l.add(this.d.g.j);
                            this.g.l.add(this.d.g.k);
                            this.d.g.j.k.add(this.g);
                            this.d.g.k.k.add(this.g);
                            break;
                        } else if (this.d.Z()) {
                            this.d.g.g.l.add(this.g);
                            this.g.k.add(this.d.g.g);
                            break;
                        } else {
                            this.d.g.g.l.add(this.g);
                            break;
                        }
                    } else {
                        df dfVar2 = this.d.g.g;
                        this.g.l.add(dfVar2);
                        dfVar2.k.add(this.g);
                        this.d.g.j.k.add(this.g);
                        this.d.g.k.k.add(this.g);
                        this.g.b = true;
                        this.g.k.add(this.j);
                        this.g.k.add(this.k);
                        this.j.l.add(this.g);
                        this.k.l.add(this.g);
                        break;
                    }
            }
        }
        if (this.d.H[0].c != null && this.d.H[1].c != null) {
            if (this.d.Z()) {
                this.j.f = this.d.H[0].j();
                this.k.f = -this.d.H[1].j();
                return;
            }
            de a6 = a(this.d.H[0]);
            de a7 = a(this.d.H[1]);
            if (a6 != null) {
                a6.b(this);
            }
            if (a7 != null) {
                a7.b(this);
            }
            this.l = Cdo.a.CENTER;
        } else if (this.d.H[0].c != null) {
            de a8 = a(this.d.H[0]);
            if (a8 != null) {
                a(this.j, a8, this.d.H[0].j());
                a(this.k, this.j, 1, this.g);
            }
        } else if (this.d.H[1].c != null) {
            de a9 = a(this.d.H[1]);
            if (a9 != null) {
                a(this.k, a9, -this.d.H[1].j());
                a(this.j, this.k, -1, this.g);
            }
        } else if ((this.d instanceof cu) || this.d.A() == null) {
        } else {
            a(this.j, this.d.A().f.j, this.d.D());
            a(this.k, this.j, 1, this.g);
        }
    }

    private void a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        switch (i5) {
            case -1:
                int i8 = (int) ((i7 * f) + 0.5f);
                int i9 = (int) ((i6 / f) + 0.5f);
                if (i8 <= i6 && i7 <= i7) {
                    iArr[0] = i8;
                    iArr[1] = i7;
                    return;
                } else if (i6 > i6 || i9 > i7) {
                    return;
                } else {
                    iArr[0] = i6;
                    iArr[1] = i9;
                    return;
                }
            case 0:
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            case 1:
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.Cdo, defpackage.dc
    public void a(dc dcVar) {
        int S;
        switch (this.l) {
            case START:
                b(dcVar);
                break;
            case END:
                c(dcVar);
                break;
            case CENTER:
                a(dcVar, this.d.z, this.d.B, 0);
                return;
        }
        if (!this.g.j && this.f == cq.a.MATCH_CONSTRAINT) {
            switch (this.d.m) {
                case 2:
                    cq A = this.d.A();
                    if (A != null && A.f.g.j) {
                        this.g.a((int) ((A.f.g.g * this.d.r) + 0.5f));
                        break;
                    }
                    break;
                case 3:
                    if (this.d.n == 0 || this.d.n == 3) {
                        de deVar = this.d.g.j;
                        de deVar2 = this.d.g.k;
                        boolean z = this.d.z.c != null;
                        boolean z2 = this.d.A.c != null;
                        boolean z3 = this.d.B.c != null;
                        boolean z4 = this.d.C.c != null;
                        int T = this.d.T();
                        if (!z || !z2 || !z3 || !z4) {
                            if (!z || !z3) {
                                if (z2 && z4) {
                                    if (deVar.c && deVar2.c) {
                                        float S2 = this.d.S();
                                        int i = deVar.l.get(0).g + deVar.f;
                                        int i2 = deVar2.l.get(0).g - deVar2.f;
                                        switch (T) {
                                            case -1:
                                            case 1:
                                                int a2 = a(i2 - i, 1);
                                                int i3 = (int) ((a2 / S2) + 0.5f);
                                                int a3 = a(i3, 0);
                                                if (i3 != a3) {
                                                    a2 = (int) ((a3 * S2) + 0.5f);
                                                }
                                                this.g.a(a3);
                                                this.d.g.g.a(a2);
                                                break;
                                            case 0:
                                                int a4 = a(i2 - i, 1);
                                                int i4 = (int) ((a4 * S2) + 0.5f);
                                                int a5 = a(i4, 0);
                                                if (i4 != a5) {
                                                    a4 = (int) ((a5 / S2) + 0.5f);
                                                }
                                                this.g.a(a5);
                                                this.d.g.g.a(a4);
                                                break;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } else if (this.j.c && this.k.c) {
                                float S3 = this.d.S();
                                int i5 = this.j.l.get(0).g + this.j.f;
                                int i6 = this.k.l.get(0).g - this.k.f;
                                switch (T) {
                                    case -1:
                                    case 0:
                                        int a6 = a(i6 - i5, 0);
                                        int i7 = (int) ((a6 * S3) + 0.5f);
                                        int a7 = a(i7, 1);
                                        if (i7 != a7) {
                                            a6 = (int) ((a7 / S3) + 0.5f);
                                        }
                                        this.g.a(a6);
                                        this.d.g.g.a(a7);
                                        break;
                                    case 1:
                                        int a8 = a(i6 - i5, 0);
                                        int i8 = (int) ((a8 / S3) + 0.5f);
                                        int a9 = a(i8, 1);
                                        if (i8 != a9) {
                                            a8 = (int) ((a9 * S3) + 0.5f);
                                        }
                                        this.g.a(a8);
                                        this.d.g.g.a(a9);
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            float S4 = this.d.S();
                            if (deVar.j && deVar2.j) {
                                if (this.j.c && this.k.c) {
                                    a(a, this.j.l.get(0).g + this.j.f, this.k.l.get(0).g - this.k.f, deVar.g + deVar.f, deVar2.g - deVar2.f, S4, T);
                                    this.g.a(a[0]);
                                    this.d.g.g.a(a[1]);
                                    return;
                                }
                                return;
                            }
                            if (this.j.j && this.k.j) {
                                if (!deVar.c || !deVar2.c) {
                                    return;
                                }
                                a(a, this.j.g + this.j.f, this.k.g - this.k.f, deVar.l.get(0).g + deVar.f, deVar2.l.get(0).g - deVar2.f, S4, T);
                                this.g.a(a[0]);
                                this.d.g.g.a(a[1]);
                            }
                            if (this.j.c && this.k.c && deVar.c && deVar2.c) {
                                a(a, this.j.l.get(0).g + this.j.f, this.k.l.get(0).g - this.k.f, deVar.l.get(0).g + deVar.f, deVar2.l.get(0).g - deVar2.f, S4, T);
                                this.g.a(a[0]);
                                this.d.g.g.a(a[1]);
                                break;
                            } else {
                                return;
                            }
                        }
                    } else {
                        switch (this.d.T()) {
                            case -1:
                                S = (int) ((this.d.g.g.g * this.d.S()) + 0.5f);
                                break;
                            case 0:
                                S = (int) ((this.d.g.g.g / this.d.S()) + 0.5f);
                                break;
                            case 1:
                                S = (int) ((this.d.g.g.g * this.d.S()) + 0.5f);
                                break;
                            default:
                                S = 0;
                                break;
                        }
                        this.g.a(S);
                        break;
                    }
                    break;
            }
        }
        if (this.j.c && this.k.c) {
            if (this.j.j && this.k.j && this.g.j) {
                return;
            }
            if (!this.g.j && this.f == cq.a.MATCH_CONSTRAINT && this.d.m == 0 && !this.d.Z()) {
                int i9 = this.j.l.get(0).g + this.j.f;
                int i10 = this.k.l.get(0).g + this.k.f;
                this.j.a(i9);
                this.k.a(i10);
                this.g.a(i10 - i9);
                return;
            }
            if (!this.g.j && this.f == cq.a.MATCH_CONSTRAINT && this.c == 1 && this.j.l.size() > 0 && this.k.l.size() > 0) {
                int min = Math.min((this.k.l.get(0).g + this.k.f) - (this.j.l.get(0).g + this.j.f), this.g.m);
                int i11 = this.d.q;
                int max = Math.max(this.d.p, min);
                if (i11 > 0) {
                    max = Math.min(i11, max);
                }
                this.g.a(max);
            }
            if (this.g.j) {
                de deVar3 = this.j.l.get(0);
                de deVar4 = this.k.l.get(0);
                int i12 = deVar3.g + this.j.f;
                int i13 = deVar4.g + this.k.f;
                float N = this.d.N();
                if (deVar3 == deVar4) {
                    i12 = deVar3.g;
                    i13 = deVar4.g;
                    N = 0.5f;
                }
                this.j.a((int) (i12 + 0.5f + (((i13 - i12) - this.g.g) * N)));
                this.k.a(this.j.g + this.g.g);
            }
        }
    }

    @Override // defpackage.Cdo
    public void e() {
        if (this.j.j) {
            this.d.o(this.j.g);
        }
    }
}
