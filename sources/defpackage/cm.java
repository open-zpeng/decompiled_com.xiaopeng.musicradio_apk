package defpackage;

import defpackage.cp;
import defpackage.cq;
import java.util.HashMap;
/* compiled from: Barrier.java */
/* renamed from: cm  reason: default package */
/* loaded from: classes3.dex */
public class cm extends cv {
    private int az = 0;
    private boolean aA = true;
    private int aB = 0;
    boolean a = false;

    @Override // defpackage.cq
    public boolean a() {
        return true;
    }

    public int b() {
        return this.az;
    }

    public void a(int i) {
        this.az = i;
    }

    public void a(boolean z) {
        this.aA = z;
    }

    public boolean c() {
        return this.aA;
    }

    @Override // defpackage.cq
    public boolean d() {
        return this.a;
    }

    @Override // defpackage.cq
    public boolean e() {
        return this.a;
    }

    @Override // defpackage.cv, defpackage.cq
    public void a(cq cqVar, HashMap<cq, cq> hashMap) {
        super.a(cqVar, hashMap);
        cm cmVar = (cm) cqVar;
        this.az = cmVar.az;
        this.aA = cmVar.aA;
        this.aB = cmVar.aB;
    }

    @Override // defpackage.cq
    public String toString() {
        String str = "[Barrier] " + C() + " {";
        for (int i = 0; i < this.ay; i++) {
            cq cqVar = this.ax[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + cqVar.C();
        }
        return str + "}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        for (int i = 0; i < this.ay; i++) {
            cq cqVar = this.ax[i];
            if (this.aA || cqVar.a()) {
                int i2 = this.az;
                if (i2 == 0 || i2 == 1) {
                    cqVar.a(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    cqVar.a(1, true);
                }
            }
        }
    }

    @Override // defpackage.cq
    public void a(bq bqVar, boolean z) {
        boolean z2;
        this.H[0] = this.z;
        this.H[2] = this.A;
        this.H[1] = this.B;
        this.H[3] = this.C;
        for (int i = 0; i < this.H.length; i++) {
            this.H[i].f = bqVar.a(this.H[i]);
        }
        int i2 = this.az;
        if (i2 < 0 || i2 >= 4) {
            return;
        }
        cp cpVar = this.H[this.az];
        if (!this.a) {
            i();
        }
        if (this.a) {
            this.a = false;
            int i3 = this.az;
            if (i3 == 0 || i3 == 1) {
                bqVar.a(this.z.f, this.P);
                bqVar.a(this.B.f, this.P);
                return;
            } else if (i3 == 2 || i3 == 3) {
                bqVar.a(this.A.f, this.Q);
                bqVar.a(this.C.f, this.Q);
                return;
            } else {
                return;
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.ay) {
                z2 = false;
                break;
            }
            cq cqVar = this.ax[i4];
            if (this.aA || cqVar.a()) {
                int i5 = this.az;
                if ((i5 == 0 || i5 == 1) && cqVar.X() == cq.a.MATCH_CONSTRAINT && cqVar.z.c != null && cqVar.B.c != null) {
                    z2 = true;
                    break;
                }
                int i6 = this.az;
                if ((i6 == 2 || i6 == 3) && cqVar.Y() == cq.a.MATCH_CONSTRAINT && cqVar.A.c != null && cqVar.C.c != null) {
                    z2 = true;
                    break;
                }
            }
            i4++;
        }
        boolean z3 = this.z.c() || this.B.c();
        boolean z4 = this.A.c() || this.C.c();
        int i7 = !z2 && ((this.az == 0 && z3) || ((this.az == 2 && z4) || ((this.az == 1 && z3) || (this.az == 3 && z4)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.ay; i8++) {
            cq cqVar2 = this.ax[i8];
            if (this.aA || cqVar2.a()) {
                bu a = bqVar.a(cqVar2.H[this.az]);
                cqVar2.H[this.az].f = a;
                int i9 = (cqVar2.H[this.az].c == null || cqVar2.H[this.az].c.a != this) ? 0 : cqVar2.H[this.az].d + 0;
                int i10 = this.az;
                if (i10 == 0 || i10 == 2) {
                    bqVar.b(cpVar.f, a, this.aB - i9, z2);
                } else {
                    bqVar.a(cpVar.f, a, this.aB + i9, z2);
                }
                bqVar.c(cpVar.f, a, this.aB + i9, i7);
            }
        }
        int i11 = this.az;
        if (i11 == 0) {
            bqVar.c(this.B.f, this.z.f, 0, 8);
            bqVar.c(this.z.f, this.K.B.f, 0, 4);
            bqVar.c(this.z.f, this.K.z.f, 0, 0);
        } else if (i11 == 1) {
            bqVar.c(this.z.f, this.B.f, 0, 8);
            bqVar.c(this.z.f, this.K.z.f, 0, 4);
            bqVar.c(this.z.f, this.K.B.f, 0, 0);
        } else if (i11 == 2) {
            bqVar.c(this.C.f, this.A.f, 0, 8);
            bqVar.c(this.A.f, this.K.C.f, 0, 4);
            bqVar.c(this.A.f, this.K.A.f, 0, 0);
        } else if (i11 == 3) {
            bqVar.c(this.A.f, this.C.f, 0, 8);
            bqVar.c(this.A.f, this.K.A.f, 0, 4);
            bqVar.c(this.A.f, this.K.C.f, 0, 0);
        }
    }

    public void b(int i) {
        this.aB = i;
    }

    public int g() {
        return this.aB;
    }

    public int h() {
        switch (this.az) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            default:
                return -1;
        }
    }

    public boolean i() {
        boolean z = true;
        for (int i = 0; i < this.ay; i++) {
            cq cqVar = this.ax[i];
            if (this.aA || cqVar.a()) {
                int i2 = this.az;
                if ((i2 == 0 || i2 == 1) && !cqVar.d()) {
                    z = false;
                } else {
                    int i3 = this.az;
                    if ((i3 == 2 || i3 == 3) && !cqVar.e()) {
                        z = false;
                    }
                }
            }
        }
        if (!z || this.ay <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.ay; i5++) {
            cq cqVar2 = this.ax[i5];
            if (this.aA || cqVar2.a()) {
                if (!z2) {
                    int i6 = this.az;
                    if (i6 == 0) {
                        i4 = cqVar2.a(cp.a.LEFT).d();
                    } else if (i6 == 1) {
                        i4 = cqVar2.a(cp.a.RIGHT).d();
                    } else if (i6 == 2) {
                        i4 = cqVar2.a(cp.a.TOP).d();
                    } else if (i6 == 3) {
                        i4 = cqVar2.a(cp.a.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i7 = this.az;
                if (i7 == 0) {
                    i4 = Math.min(i4, cqVar2.a(cp.a.LEFT).d());
                } else if (i7 == 1) {
                    i4 = Math.max(i4, cqVar2.a(cp.a.RIGHT).d());
                } else if (i7 == 2) {
                    i4 = Math.min(i4, cqVar2.a(cp.a.TOP).d());
                } else if (i7 == 3) {
                    i4 = Math.max(i4, cqVar2.a(cp.a.BOTTOM).d());
                }
            }
        }
        int i8 = i4 + this.aB;
        int i9 = this.az;
        if (i9 == 0 || i9 == 1) {
            a(i8, i8);
        } else {
            b(i8, i8);
        }
        this.a = true;
        return true;
    }
}
