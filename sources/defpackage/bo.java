package defpackage;

import defpackage.bq;
import defpackage.bu;
import java.util.ArrayList;
/* compiled from: ArrayRow.java */
/* renamed from: bo  reason: default package */
/* loaded from: classes3.dex */
public class bo implements bq.a {
    public a e;
    bu a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList<bu> d = new ArrayList<>();
    boolean f = false;

    /* compiled from: ArrayRow.java */
    /* renamed from: bo$a */
    /* loaded from: classes3.dex */
    public interface a {
        float a(bo boVar, boolean z);

        float a(bu buVar, boolean z);

        bu a(int i);

        void a();

        void a(float f);

        void a(bu buVar, float f);

        void a(bu buVar, float f, boolean z);

        boolean a(bu buVar);

        float b(int i);

        float b(bu buVar);

        void b();

        int c();
    }

    public bo() {
    }

    public bo(bp bpVar) {
        this.e = new bn(this, bpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        bu buVar = this.a;
        return buVar != null && (buVar.i == bu.a.UNRESTRICTED || this.b >= 0.0f);
    }

    public String toString() {
        return b();
    }

    String b() {
        boolean z;
        float b;
        int i;
        String str = (this.a == null ? "0" : "" + this.a) + " = ";
        if (this.b != 0.0f) {
            str = str + this.b;
            z = true;
        } else {
            z = false;
        }
        int c = this.e.c();
        for (int i2 = 0; i2 < c; i2++) {
            bu a2 = this.e.a(i2);
            if (a2 != null && (this.e.b(i2)) != 0.0f) {
                String buVar = a2.toString();
                if (z) {
                    if (i > 0) {
                        str = str + " + ";
                    } else {
                        str = str + " - ";
                        b *= -1.0f;
                    }
                } else if (b < 0.0f) {
                    str = str + "- ";
                    b *= -1.0f;
                }
                str = b == 1.0f ? str + buVar : str + b + " " + buVar;
                z = true;
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    public void c() {
        this.a = null;
        this.e.a();
        this.b = 0.0f;
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(bu buVar) {
        return this.e.a(buVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo a(bu buVar, int i) {
        this.a = buVar;
        float f = i;
        buVar.e = f;
        this.b = f;
        this.f = true;
        return this;
    }

    public bo b(bu buVar, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.a(buVar, 1.0f);
        } else {
            this.b = i;
            this.e.a(buVar, -1.0f);
        }
        return this;
    }

    public bo a(bu buVar, bu buVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.a(buVar, -1.0f);
            this.e.a(buVar2, 1.0f);
        } else {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo c(bu buVar, int i) {
        this.e.a(buVar, i);
        return this;
    }

    public bo a(bu buVar, bu buVar2, bu buVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.a(buVar, -1.0f);
            this.e.a(buVar2, 1.0f);
            this.e.a(buVar3, 1.0f);
        } else {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
            this.e.a(buVar3, -1.0f);
        }
        return this;
    }

    public bo b(bu buVar, bu buVar2, bu buVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.e.a(buVar, -1.0f);
            this.e.a(buVar2, 1.0f);
            this.e.a(buVar3, -1.0f);
        } else {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
            this.e.a(buVar3, 1.0f);
        }
        return this;
    }

    public bo a(float f, float f2, float f3, bu buVar, bu buVar2, bu buVar3, bu buVar4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
            this.e.a(buVar4, 1.0f);
            this.e.a(buVar3, -1.0f);
        } else if (f == 0.0f) {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.a(buVar3, 1.0f);
            this.e.a(buVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
            this.e.a(buVar4, f4);
            this.e.a(buVar3, -f4);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo a(bu buVar, bu buVar2, int i, float f, bu buVar3, bu buVar4, int i2) {
        if (buVar2 == buVar3) {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar4, 1.0f);
            this.e.a(buVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.a(buVar, 1.0f);
            this.e.a(buVar2, -1.0f);
            this.e.a(buVar3, -1.0f);
            this.e.a(buVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.a(buVar, -1.0f);
            this.e.a(buVar2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.e.a(buVar4, -1.0f);
            this.e.a(buVar3, 1.0f);
            this.b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.a(buVar, f2 * 1.0f);
            this.e.a(buVar2, f2 * (-1.0f));
            this.e.a(buVar3, (-1.0f) * f);
            this.e.a(buVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public bo a(bq bqVar, int i) {
        this.e.a(bqVar.a(i, "ep"), 1.0f);
        this.e.a(bqVar.a(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo a(bu buVar, bu buVar2, float f) {
        this.e.a(buVar, -1.0f);
        this.e.a(buVar2, f);
        return this;
    }

    public bo a(bu buVar, bu buVar2, bu buVar3, bu buVar4, float f) {
        this.e.a(buVar, -1.0f);
        this.e.a(buVar2, 1.0f);
        this.e.a(buVar3, f);
        this.e.a(buVar4, -f);
        return this;
    }

    public bo b(bu buVar, bu buVar2, bu buVar3, bu buVar4, float f) {
        this.e.a(buVar3, 0.5f);
        this.e.a(buVar4, 0.5f);
        this.e.a(buVar, -0.5f);
        this.e.a(buVar2, -0.5f);
        this.b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(bq bqVar) {
        boolean z;
        bu b = b(bqVar);
        if (b == null) {
            z = true;
        } else {
            b(b);
            z = false;
        }
        if (this.e.c() == 0) {
            this.f = true;
        }
        return z;
    }

    bu b(bq bqVar) {
        int c = this.e.c();
        bu buVar = null;
        bu buVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < c; i++) {
            float b = this.e.b(i);
            bu a2 = this.e.a(i);
            if (a2.i == bu.a.UNRESTRICTED) {
                if (buVar == null) {
                    z = a(a2, bqVar);
                    f = b;
                    buVar = a2;
                } else if (f > b) {
                    z = a(a2, bqVar);
                    f = b;
                    buVar = a2;
                } else if (!z && a(a2, bqVar)) {
                    f = b;
                    buVar = a2;
                    z = true;
                }
            } else if (buVar == null && b < 0.0f) {
                if (buVar2 == null) {
                    z2 = a(a2, bqVar);
                    f2 = b;
                    buVar2 = a2;
                } else if (f2 > b) {
                    z2 = a(a2, bqVar);
                    f2 = b;
                    buVar2 = a2;
                } else if (!z2 && a(a2, bqVar)) {
                    f2 = b;
                    buVar2 = a2;
                    z2 = true;
                }
            }
        }
        return buVar != null ? buVar : buVar2;
    }

    private boolean a(bu buVar, bq bqVar) {
        return buVar.l <= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(bu buVar) {
        bu buVar2 = this.a;
        if (buVar2 != null) {
            this.e.a(buVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float a2 = this.e.a(buVar, true) * (-1.0f);
        this.a = buVar;
        if (a2 == 1.0f) {
            return;
        }
        this.b /= a2;
        this.e.a(a2);
    }

    @Override // defpackage.bq.a
    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.c() == 0;
    }

    public void a(bq bqVar, bo boVar, boolean z) {
        this.b += boVar.b * this.e.a(boVar, z);
        if (z) {
            boVar.a.b(this);
        }
        if (bq.c && this.a != null && this.e.c() == 0) {
            this.f = true;
            bqVar.g = true;
        }
    }

    public void a(bq bqVar, bu buVar, boolean z) {
        if (buVar == null || !buVar.f) {
            return;
        }
        this.b += buVar.e * this.e.b(buVar);
        this.e.a(buVar, z);
        if (z) {
            buVar.b(this);
        }
        if (bq.c && this.e.c() == 0) {
            this.f = true;
            bqVar.g = true;
        }
    }

    public void b(bq bqVar, bu buVar, boolean z) {
        if (buVar == null || !buVar.m) {
            return;
        }
        float b = this.e.b(buVar);
        this.b += buVar.o * b;
        this.e.a(buVar, z);
        if (z) {
            buVar.b(this);
        }
        this.e.a(bqVar.n.d[buVar.n], b, z);
        if (bq.c && this.e.c() == 0) {
            this.f = true;
            bqVar.g = true;
        }
    }

    private bu a(boolean[] zArr, bu buVar) {
        int c = this.e.c();
        bu buVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < c; i++) {
            float b = this.e.b(i);
            if (b < 0.0f) {
                bu a2 = this.e.a(i);
                if ((zArr == null || !zArr[a2.b]) && a2 != buVar && ((a2.i == bu.a.SLACK || a2.i == bu.a.ERROR) && b < f)) {
                    f = b;
                    buVar2 = a2;
                }
            }
        }
        return buVar2;
    }

    public bu c(bu buVar) {
        return a((boolean[]) null, buVar);
    }

    @Override // defpackage.bq.a
    public bu a(bq bqVar, boolean[] zArr) {
        return a(zArr, (bu) null);
    }

    @Override // defpackage.bq.a
    public void f() {
        this.e.a();
        this.a = null;
        this.b = 0.0f;
    }

    @Override // defpackage.bq.a
    public void a(bq.a aVar) {
        if (aVar instanceof bo) {
            bo boVar = (bo) aVar;
            this.a = null;
            this.e.a();
            for (int i = 0; i < boVar.e.c(); i++) {
                this.e.a(boVar.e.a(i), boVar.e.b(i), true);
            }
        }
    }

    @Override // defpackage.bq.a
    public void d(bu buVar) {
        float f = 1.0f;
        if (buVar.d != 1) {
            if (buVar.d == 2) {
                f = 1000.0f;
            } else if (buVar.d == 3) {
                f = 1000000.0f;
            } else if (buVar.d == 4) {
                f = 1.0E9f;
            } else if (buVar.d == 5) {
                f = 1.0E12f;
            }
        }
        this.e.a(buVar, f);
    }

    @Override // defpackage.bq.a
    public bu g() {
        return this.a;
    }

    public void c(bq bqVar) {
        if (bqVar.i.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int c = this.e.c();
            for (int i = 0; i < c; i++) {
                bu a2 = this.e.a(i);
                if (a2.c != -1 || a2.f || a2.m) {
                    this.d.add(a2);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    bu buVar = this.d.get(i2);
                    if (buVar.f) {
                        a(bqVar, buVar, true);
                    } else if (buVar.m) {
                        b(bqVar, buVar, true);
                    } else {
                        a(bqVar, bqVar.i[buVar.c], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (bq.c && this.a != null && this.e.c() == 0) {
            this.f = true;
            bqVar.g = true;
        }
    }
}
