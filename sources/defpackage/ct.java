package defpackage;

import defpackage.cp;
import defpackage.cq;
import java.util.HashMap;
/* compiled from: Guideline.java */
/* renamed from: ct  reason: default package */
/* loaded from: classes3.dex */
public class ct extends cq {
    private boolean aC;
    protected float a = -1.0f;
    protected int ax = -1;
    protected int ay = -1;
    private cp az = this.A;
    private int aA = 0;
    private int aB = 0;

    @Override // defpackage.cq
    public boolean a() {
        return true;
    }

    public ct() {
        this.I.clear();
        this.I.add(this.az);
        int length = this.H.length;
        for (int i = 0; i < length; i++) {
            this.H[i] = this.az;
        }
    }

    @Override // defpackage.cq
    public void a(cq cqVar, HashMap<cq, cq> hashMap) {
        super.a(cqVar, hashMap);
        ct ctVar = (ct) cqVar;
        this.a = ctVar.a;
        this.ax = ctVar.ax;
        this.ay = ctVar.ay;
        a(ctVar.aA);
    }

    public void a(int i) {
        if (this.aA == i) {
            return;
        }
        this.aA = i;
        this.I.clear();
        if (this.aA == 1) {
            this.az = this.z;
        } else {
            this.az = this.A;
        }
        this.I.add(this.az);
        int length = this.H.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.H[i2] = this.az;
        }
    }

    public cp b() {
        return this.az;
    }

    public int c() {
        return this.aA;
    }

    @Override // defpackage.cq
    public cp a(cp.a aVar) {
        switch (aVar) {
            case LEFT:
            case RIGHT:
                if (this.aA == 1) {
                    return this.az;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.aA == 0) {
                    return this.az;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        return null;
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.ax = -1;
            this.ay = -1;
        }
    }

    public void b(int i) {
        if (i > -1) {
            this.a = -1.0f;
            this.ax = i;
            this.ay = -1;
        }
    }

    public void A(int i) {
        if (i > -1) {
            this.a = -1.0f;
            this.ax = -1;
            this.ay = i;
        }
    }

    public float f() {
        return this.a;
    }

    public int g() {
        return this.ax;
    }

    public int h() {
        return this.ay;
    }

    public void B(int i) {
        this.az.a(i);
        this.aC = true;
    }

    @Override // defpackage.cq
    public boolean d() {
        return this.aC;
    }

    @Override // defpackage.cq
    public boolean e() {
        return this.aC;
    }

    @Override // defpackage.cq
    public void a(bq bqVar, boolean z) {
        cr crVar = (cr) A();
        if (crVar == null) {
            return;
        }
        cp a = crVar.a(cp.a.LEFT);
        cp a2 = crVar.a(cp.a.RIGHT);
        boolean z2 = this.K != null && this.K.f158J[0] == cq.a.WRAP_CONTENT;
        if (this.aA == 0) {
            a = crVar.a(cp.a.TOP);
            a2 = crVar.a(cp.a.BOTTOM);
            z2 = this.K != null && this.K.f158J[1] == cq.a.WRAP_CONTENT;
        }
        if (this.aC && this.az.f()) {
            bu a3 = bqVar.a(this.az);
            bqVar.a(a3, this.az.d());
            if (this.ax != -1) {
                if (z2) {
                    bqVar.a(bqVar.a(a2), a3, 0, 5);
                }
            } else if (this.ay != -1 && z2) {
                bu a4 = bqVar.a(a2);
                bqVar.a(a3, bqVar.a(a), 0, 5);
                bqVar.a(a4, a3, 0, 5);
            }
            this.aC = false;
        } else if (this.ax != -1) {
            bu a5 = bqVar.a(this.az);
            bqVar.c(a5, bqVar.a(a), this.ax, 8);
            if (z2) {
                bqVar.a(bqVar.a(a2), a5, 0, 5);
            }
        } else if (this.ay != -1) {
            bu a6 = bqVar.a(this.az);
            bu a7 = bqVar.a(a2);
            bqVar.c(a6, a7, -this.ay, 8);
            if (z2) {
                bqVar.a(a6, bqVar.a(a), 0, 5);
                bqVar.a(a7, a6, 0, 5);
            }
        } else if (this.a != -1.0f) {
            bqVar.a(bq.a(bqVar, bqVar.a(this.az), bqVar.a(a2), this.a));
        }
    }

    @Override // defpackage.cq
    public void b(bq bqVar, boolean z) {
        if (A() == null) {
            return;
        }
        int b = bqVar.b(this.az);
        if (this.aA == 1) {
            o(b);
            p(0);
            r(A().G());
            q(0);
            return;
        }
        o(0);
        p(b);
        q(A().F());
        r(0);
    }
}
