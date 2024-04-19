package defpackage;

import defpackage.bu;
import defpackage.cp;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: LinearSystem.java */
/* renamed from: bq  reason: default package */
/* loaded from: classes3.dex */
public class bq {
    public static boolean a = false;
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = false;
    public static br o = null;
    public static long p = 0;
    public static long q = 0;
    private static int r = 1000;
    private a A;
    bo[] i;
    public boolean j;
    public boolean k;
    int l;
    int m;
    final bp n;
    private a t;
    private int v;
    private boolean[] w;
    private int x;
    private bu[] y;
    private int z;
    public boolean g = false;
    int h = 0;
    private HashMap<String, bu> s = null;
    private int u = 32;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: bq$a */
    /* loaded from: classes3.dex */
    public interface a {
        bu a(bq bqVar, boolean[] zArr);

        void a(a aVar);

        void d(bu buVar);

        boolean e();

        void f();

        bu g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* renamed from: bq$b */
    /* loaded from: classes3.dex */
    public class b extends bo {
        public b(bp bpVar) {
            this.e = new bv(this, bpVar);
        }
    }

    public bq() {
        int i = this.u;
        this.v = i;
        this.i = null;
        this.j = false;
        this.k = false;
        this.w = new boolean[i];
        this.l = 1;
        this.m = 0;
        this.x = i;
        this.y = new bu[r];
        this.z = 0;
        this.i = new bo[i];
        i();
        this.n = new bp();
        this.t = new bt(this.n);
        if (f) {
            this.A = new b(this.n);
        } else {
            this.A = new bo(this.n);
        }
    }

    public void a(br brVar) {
        o = brVar;
    }

    public static br a() {
        return o;
    }

    private void h() {
        this.u *= 2;
        this.i = (bo[]) Arrays.copyOf(this.i, this.u);
        bp bpVar = this.n;
        bpVar.d = (bu[]) Arrays.copyOf(bpVar.d, this.u);
        int i = this.u;
        this.w = new boolean[i];
        this.v = i;
        this.x = i;
        br brVar = o;
        if (brVar != null) {
            brVar.d++;
            br brVar2 = o;
            brVar2.o = Math.max(brVar2.o, this.u);
            br brVar3 = o;
            brVar3.x = brVar3.o;
        }
    }

    private void i() {
        int i = 0;
        if (f) {
            while (i < this.m) {
                bo boVar = this.i[i];
                if (boVar != null) {
                    this.n.a.a(boVar);
                }
                this.i[i] = null;
                i++;
            }
            return;
        }
        while (i < this.m) {
            bo boVar2 = this.i[i];
            if (boVar2 != null) {
                this.n.b.a(boVar2);
            }
            this.i[i] = null;
            i++;
        }
    }

    public void b() {
        for (int i = 0; i < this.n.d.length; i++) {
            bu buVar = this.n.d[i];
            if (buVar != null) {
                buVar.b();
            }
        }
        this.n.c.a(this.y, this.z);
        this.z = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap<String, bu> hashMap = this.s;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.h = 0;
        this.t.f();
        this.l = 1;
        for (int i2 = 0; i2 < this.m; i2++) {
            bo[] boVarArr = this.i;
            if (boVarArr[i2] != null) {
                boVarArr[i2].c = false;
            }
        }
        i();
        this.m = 0;
        if (f) {
            this.A = new b(this.n);
        } else {
            this.A = new bo(this.n);
        }
    }

    public bu a(Object obj) {
        bu buVar = null;
        if (obj == null) {
            return null;
        }
        if (this.l + 1 >= this.v) {
            h();
        }
        if (obj instanceof cp) {
            cp cpVar = (cp) obj;
            buVar = cpVar.g();
            if (buVar == null) {
                cpVar.a(this.n);
                buVar = cpVar.g();
            }
            if (buVar.b == -1 || buVar.b > this.h || this.n.d[buVar.b] == null) {
                if (buVar.b != -1) {
                    buVar.b();
                }
                this.h++;
                this.l++;
                buVar.b = this.h;
                buVar.i = bu.a.UNRESTRICTED;
                this.n.d[this.h] = buVar;
            }
        }
        return buVar;
    }

    public bo c() {
        bo a2;
        if (f) {
            a2 = this.n.a.a();
            if (a2 == null) {
                a2 = new b(this.n);
                q++;
            } else {
                a2.c();
            }
        } else {
            a2 = this.n.b.a();
            if (a2 == null) {
                a2 = new bo(this.n);
                p++;
            } else {
                a2.c();
            }
        }
        bu.a();
        return a2;
    }

    public bu d() {
        br brVar = o;
        if (brVar != null) {
            brVar.m++;
        }
        if (this.l + 1 >= this.v) {
            h();
        }
        bu a2 = a(bu.a.SLACK, (String) null);
        this.h++;
        this.l++;
        a2.b = this.h;
        this.n.d[this.h] = a2;
        return a2;
    }

    public bu e() {
        br brVar = o;
        if (brVar != null) {
            brVar.n++;
        }
        if (this.l + 1 >= this.v) {
            h();
        }
        bu a2 = a(bu.a.SLACK, (String) null);
        this.h++;
        this.l++;
        a2.b = this.h;
        this.n.d[this.h] = a2;
        return a2;
    }

    void a(bo boVar, int i, int i2) {
        boVar.c(a(i2, (String) null), i);
    }

    public bu a(int i, String str) {
        br brVar = o;
        if (brVar != null) {
            brVar.l++;
        }
        if (this.l + 1 >= this.v) {
            h();
        }
        bu a2 = a(bu.a.ERROR, str);
        this.h++;
        this.l++;
        a2.b = this.h;
        a2.d = i;
        this.n.d[this.h] = a2;
        this.t.d(a2);
        return a2;
    }

    private bu a(bu.a aVar, String str) {
        bu a2 = this.n.c.a();
        if (a2 == null) {
            a2 = new bu(aVar, str);
            a2.a(aVar, str);
        } else {
            a2.b();
            a2.a(aVar, str);
        }
        int i = this.z;
        int i2 = r;
        if (i >= i2) {
            r = i2 * 2;
            this.y = (bu[]) Arrays.copyOf(this.y, r);
        }
        bu[] buVarArr = this.y;
        int i3 = this.z;
        this.z = i3 + 1;
        buVarArr[i3] = a2;
        return a2;
    }

    public int b(Object obj) {
        bu g = ((cp) obj).g();
        if (g != null) {
            return (int) (g.e + 0.5f);
        }
        return 0;
    }

    public void f() {
        br brVar = o;
        if (brVar != null) {
            brVar.e++;
        }
        if (this.t.e()) {
            j();
        } else if (this.j || this.k) {
            br brVar2 = o;
            if (brVar2 != null) {
                brVar2.q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.m) {
                    z = true;
                    break;
                } else if (!this.i[i].f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                a(this.t);
                return;
            }
            br brVar3 = o;
            if (brVar3 != null) {
                brVar3.p++;
            }
            j();
        } else {
            a(this.t);
        }
    }

    void a(a aVar) {
        br brVar = o;
        if (brVar != null) {
            brVar.t++;
            br brVar2 = o;
            brVar2.u = Math.max(brVar2.u, this.l);
            br brVar3 = o;
            brVar3.v = Math.max(brVar3.v, this.m);
        }
        b(aVar);
        a(aVar, false);
        j();
    }

    public void a(bo boVar) {
        bu c2;
        if (boVar == null) {
            return;
        }
        br brVar = o;
        if (brVar != null) {
            brVar.f++;
            if (boVar.f) {
                o.g++;
            }
        }
        if (this.m + 1 >= this.x || this.l + 1 >= this.v) {
            h();
        }
        boolean z = false;
        if (!boVar.f) {
            boVar.c(this);
            if (boVar.e()) {
                return;
            }
            boVar.d();
            if (boVar.a(this)) {
                bu e2 = e();
                boVar.a = e2;
                int i = this.m;
                b(boVar);
                if (this.m == i + 1) {
                    this.A.a(boVar);
                    a(this.A, true);
                    if (e2.c == -1) {
                        if (boVar.a == e2 && (c2 = boVar.c(e2)) != null) {
                            br brVar2 = o;
                            if (brVar2 != null) {
                                brVar2.j++;
                            }
                            boVar.b(c2);
                        }
                        if (!boVar.f) {
                            boVar.a.a(this, boVar);
                        }
                        if (f) {
                            this.n.a.a(boVar);
                        } else {
                            this.n.b.a(boVar);
                        }
                        this.m--;
                    }
                    z = true;
                }
            }
            if (!boVar.a()) {
                return;
            }
        }
        if (z) {
            return;
        }
        b(boVar);
    }

    private final void b(bo boVar) {
        int i;
        if (c && boVar.f) {
            boVar.a.a(this, boVar.b);
        } else {
            this.i[this.m] = boVar;
            bu buVar = boVar.a;
            int i2 = this.m;
            buVar.c = i2;
            this.m = i2 + 1;
            boVar.a.a(this, boVar);
        }
        if (c && this.g) {
            int i3 = 0;
            while (i3 < this.m) {
                if (this.i[i3] == null) {
                    System.out.println("WTF");
                }
                bo[] boVarArr = this.i;
                if (boVarArr[i3] != null && boVarArr[i3].f) {
                    bo boVar2 = this.i[i3];
                    boVar2.a.a(this, boVar2.b);
                    if (f) {
                        this.n.a.a(boVar2);
                    } else {
                        this.n.b.a(boVar2);
                    }
                    this.i[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.m;
                        if (i4 >= i) {
                            break;
                        }
                        bo[] boVarArr2 = this.i;
                        int i6 = i4 - 1;
                        boVarArr2[i6] = boVarArr2[i4];
                        if (boVarArr2[i6].a.c == i4) {
                            this.i[i6].a.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.i[i5] = null;
                    }
                    this.m--;
                    i3--;
                }
                i3++;
            }
            this.g = false;
        }
    }

    private final int a(a aVar, boolean z) {
        br brVar = o;
        if (brVar != null) {
            brVar.h++;
        }
        for (int i = 0; i < this.l; i++) {
            this.w[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            br brVar2 = o;
            if (brVar2 != null) {
                brVar2.i++;
            }
            i2++;
            if (i2 >= this.l * 2) {
                return i2;
            }
            if (aVar.g() != null) {
                this.w[aVar.g().b] = true;
            }
            bu a2 = aVar.a(this, this.w);
            if (a2 != null) {
                if (this.w[a2.b]) {
                    return i2;
                }
                this.w[a2.b] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.m; i4++) {
                    bo boVar = this.i[i4];
                    if (boVar.a.i != bu.a.UNRESTRICTED && !boVar.f && boVar.a(a2)) {
                        float b2 = boVar.e.b(a2);
                        if (b2 < 0.0f) {
                            float f3 = (-boVar.b) / b2;
                            if (f3 < f2) {
                                i3 = i4;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    bo boVar2 = this.i[i3];
                    boVar2.a.c = -1;
                    br brVar3 = o;
                    if (brVar3 != null) {
                        brVar3.j++;
                    }
                    boVar2.b(a2);
                    boVar2.a.c = i3;
                    boVar2.a.a(this, boVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    private int b(a aVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.m) {
                z = false;
                break;
            } else if (this.i[i].a.i != bu.a.UNRESTRICTED && this.i[i].b < 0.0f) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                br brVar = o;
                if (brVar != null) {
                    brVar.k++;
                }
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < this.m; i6++) {
                    bo boVar = this.i[i6];
                    if (boVar.a.i != bu.a.UNRESTRICTED && !boVar.f && boVar.b < 0.0f) {
                        int i7 = 9;
                        if (e) {
                            int c2 = boVar.e.c();
                            int i8 = i5;
                            float f3 = f2;
                            int i9 = i4;
                            int i10 = i3;
                            int i11 = 0;
                            while (i11 < c2) {
                                bu a2 = boVar.e.a(i11);
                                float b2 = boVar.e.b(a2);
                                if (b2 > 0.0f) {
                                    int i12 = i8;
                                    int i13 = 0;
                                    while (i13 < i7) {
                                        float f4 = a2.g[i13] / b2;
                                        if ((f4 < f3 && i13 == i12) || i13 > i12) {
                                            i10 = i6;
                                            i9 = a2.b;
                                            f3 = f4;
                                            i12 = i13;
                                        }
                                        i13++;
                                        i7 = 9;
                                    }
                                    i8 = i12;
                                }
                                i11++;
                                i7 = 9;
                            }
                            i3 = i10;
                            i4 = i9;
                            f2 = f3;
                            i5 = i8;
                        } else {
                            for (int i14 = 1; i14 < this.l; i14++) {
                                bu buVar = this.n.d[i14];
                                float b3 = boVar.e.b(buVar);
                                if (b3 > 0.0f) {
                                    for (int i15 = 0; i15 < 9; i15++) {
                                        float f5 = buVar.g[i15] / b3;
                                        if ((f5 < f2 && i15 == i5) || i15 > i5) {
                                            i4 = i14;
                                            i3 = i6;
                                            i5 = i15;
                                            f2 = f5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    bo boVar2 = this.i[i3];
                    boVar2.a.c = -1;
                    br brVar2 = o;
                    if (brVar2 != null) {
                        brVar2.j++;
                    }
                    boVar2.b(this.n.d[i4]);
                    boVar2.a.c = i3;
                    boVar2.a.a(this, boVar2);
                } else {
                    z2 = true;
                }
                if (i2 > this.l / 2) {
                    z2 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    private void j() {
        for (int i = 0; i < this.m; i++) {
            bo boVar = this.i[i];
            boVar.a.e = boVar.b;
        }
    }

    public bp g() {
        return this.n;
    }

    public void a(bu buVar, bu buVar2, int i, int i2) {
        bo c2 = c();
        bu d2 = d();
        d2.d = 0;
        c2.a(buVar, buVar2, d2, i);
        if (i2 != 8) {
            a(c2, (int) (c2.e.b(d2) * (-1.0f)), i2);
        }
        a(c2);
    }

    public void a(bu buVar, bu buVar2, int i, boolean z) {
        bo c2 = c();
        bu d2 = d();
        d2.d = 0;
        c2.a(buVar, buVar2, d2, i);
        a(c2);
    }

    public void b(bu buVar, bu buVar2, int i, int i2) {
        bo c2 = c();
        bu d2 = d();
        d2.d = 0;
        c2.b(buVar, buVar2, d2, i);
        if (i2 != 8) {
            a(c2, (int) (c2.e.b(d2) * (-1.0f)), i2);
        }
        a(c2);
    }

    public void b(bu buVar, bu buVar2, int i, boolean z) {
        bo c2 = c();
        bu d2 = d();
        d2.d = 0;
        c2.b(buVar, buVar2, d2, i);
        a(c2);
    }

    public void a(bu buVar, bu buVar2, int i, float f2, bu buVar3, bu buVar4, int i2, int i3) {
        bo c2 = c();
        c2.a(buVar, buVar2, i, f2, buVar3, buVar4, i2);
        if (i3 != 8) {
            c2.a(this, i3);
        }
        a(c2);
    }

    public void a(bu buVar, bu buVar2, bu buVar3, bu buVar4, float f2, int i) {
        bo c2 = c();
        c2.a(buVar, buVar2, buVar3, buVar4, f2);
        if (i != 8) {
            c2.a(this, i);
        }
        a(c2);
    }

    public bo c(bu buVar, bu buVar2, int i, int i2) {
        if (b && i2 == 8 && buVar2.f && buVar.c == -1) {
            buVar.a(this, buVar2.e + i);
            return null;
        }
        bo c2 = c();
        c2.a(buVar, buVar2, i);
        if (i2 != 8) {
            c2.a(this, i2);
        }
        a(c2);
        return c2;
    }

    public void a(bu buVar, int i) {
        if (b && buVar.c == -1) {
            float f2 = i;
            buVar.a(this, f2);
            for (int i2 = 0; i2 < this.h + 1; i2++) {
                bu buVar2 = this.n.d[i2];
                if (buVar2 != null && buVar2.m && buVar2.n == buVar.b) {
                    buVar2.a(this, buVar2.o + f2);
                }
            }
            return;
        }
        int i3 = buVar.c;
        if (buVar.c != -1) {
            bo boVar = this.i[i3];
            if (boVar.f) {
                boVar.b = i;
                return;
            } else if (boVar.e.c() == 0) {
                boVar.f = true;
                boVar.b = i;
                return;
            } else {
                bo c2 = c();
                c2.b(buVar, i);
                a(c2);
                return;
            }
        }
        bo c3 = c();
        c3.a(buVar, i);
        a(c3);
    }

    public static bo a(bq bqVar, bu buVar, bu buVar2, float f2) {
        return bqVar.c().a(buVar, buVar2, f2);
    }

    public void a(cq cqVar, cq cqVar2, float f2, int i) {
        bu a2 = a(cqVar.a(cp.a.LEFT));
        bu a3 = a(cqVar.a(cp.a.TOP));
        bu a4 = a(cqVar.a(cp.a.RIGHT));
        bu a5 = a(cqVar.a(cp.a.BOTTOM));
        bu a6 = a(cqVar2.a(cp.a.LEFT));
        bu a7 = a(cqVar2.a(cp.a.TOP));
        bu a8 = a(cqVar2.a(cp.a.RIGHT));
        bu a9 = a(cqVar2.a(cp.a.BOTTOM));
        bo c2 = c();
        double d2 = f2;
        double d3 = i;
        c2.b(a3, a5, a7, a9, (float) (Math.sin(d2) * d3));
        a(c2);
        bo c3 = c();
        c3.b(a2, a4, a6, a8, (float) (Math.cos(d2) * d3));
        a(c3);
    }
}
