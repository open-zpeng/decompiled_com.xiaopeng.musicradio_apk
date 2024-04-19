package defpackage;

import defpackage.cp;
import defpackage.cq;
import defpackage.da;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: Direct.java */
/* renamed from: dg  reason: default package */
/* loaded from: classes3.dex */
public class dg {
    private static da.a a = new da.a();
    private static int b = 0;
    private static int c = 0;

    public static void a(cr crVar, da.b bVar) {
        cq.a X = crVar.X();
        cq.a Y = crVar.Y();
        b = 0;
        c = 0;
        crVar.n();
        ArrayList<cq> ah = crVar.ah();
        int size = ah.size();
        for (int i = 0; i < size; i++) {
            ah.get(i).n();
        }
        boolean ad = crVar.ad();
        if (X == cq.a.FIXED) {
            crVar.a(0, crVar.F());
        } else {
            crVar.d(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            cq cqVar = ah.get(i2);
            if (cqVar instanceof ct) {
                ct ctVar = (ct) cqVar;
                if (ctVar.c() == 1) {
                    if (ctVar.g() != -1) {
                        ctVar.B(ctVar.g());
                    } else if (ctVar.h() != -1 && crVar.d()) {
                        ctVar.B(crVar.F() - ctVar.h());
                    } else if (crVar.d()) {
                        ctVar.B((int) ((ctVar.f() * crVar.F()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((cqVar instanceof cm) && ((cm) cqVar).h() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                cq cqVar2 = ah.get(i3);
                if (cqVar2 instanceof ct) {
                    ct ctVar2 = (ct) cqVar2;
                    if (ctVar2.c() == 1) {
                        a(0, ctVar2, bVar, ad);
                    }
                }
            }
        }
        a(0, crVar, bVar, ad);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                cq cqVar3 = ah.get(i4);
                if (cqVar3 instanceof cm) {
                    cm cmVar = (cm) cqVar3;
                    if (cmVar.h() == 0) {
                        a(0, cmVar, bVar, 0, ad);
                    }
                }
            }
        }
        if (Y == cq.a.FIXED) {
            crVar.b(0, crVar.G());
        } else {
            crVar.e(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            cq cqVar4 = ah.get(i5);
            if (cqVar4 instanceof ct) {
                ct ctVar3 = (ct) cqVar4;
                if (ctVar3.c() == 0) {
                    if (ctVar3.g() != -1) {
                        ctVar3.B(ctVar3.g());
                    } else if (ctVar3.h() != -1 && crVar.e()) {
                        ctVar3.B(crVar.G() - ctVar3.h());
                    } else if (crVar.e()) {
                        ctVar3.B((int) ((ctVar3.f() * crVar.G()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((cqVar4 instanceof cm) && ((cm) cqVar4).h() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                cq cqVar5 = ah.get(i6);
                if (cqVar5 instanceof ct) {
                    ct ctVar4 = (ct) cqVar5;
                    if (ctVar4.c() == 0) {
                        a(1, ctVar4, bVar);
                    }
                }
            }
        }
        a(0, crVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                cq cqVar6 = ah.get(i7);
                if (cqVar6 instanceof cm) {
                    cm cmVar2 = (cm) cqVar6;
                    if (cmVar2.h() == 1) {
                        a(0, cmVar2, bVar, 1, ad);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            cq cqVar7 = ah.get(i8);
            if (cqVar7.t() && a(0, cqVar7)) {
                cr.a(0, cqVar7, bVar, a, da.a.a);
                if (cqVar7 instanceof ct) {
                    if (((ct) cqVar7).c() == 0) {
                        a(0, cqVar7, bVar);
                    } else {
                        a(0, cqVar7, bVar, ad);
                    }
                } else {
                    a(0, cqVar7, bVar, ad);
                    a(0, cqVar7, bVar);
                }
            }
        }
    }

    private static void a(int i, cm cmVar, da.b bVar, int i2, boolean z) {
        if (cmVar.i()) {
            if (i2 == 0) {
                a(i + 1, cmVar, bVar, z);
            } else {
                a(i + 1, cmVar, bVar);
            }
        }
    }

    private static void a(int i, cq cqVar, da.b bVar, boolean z) {
        if (cqVar.j()) {
            return;
        }
        b++;
        if (!(cqVar instanceof cr) && cqVar.t()) {
            int i2 = i + 1;
            if (a(i2, cqVar)) {
                cr.a(i2, cqVar, bVar, new da.a(), da.a.a);
            }
        }
        cp a2 = cqVar.a(cp.a.LEFT);
        cp a3 = cqVar.a(cp.a.RIGHT);
        int d = a2.d();
        int d2 = a3.d();
        if (a2.a() != null && a2.f()) {
            Iterator<cp> it = a2.a().iterator();
            while (it.hasNext()) {
                cp next = it.next();
                cq cqVar2 = next.a;
                int i3 = i + 1;
                boolean a4 = a(i3, cqVar2);
                if (cqVar2.t() && a4) {
                    cr.a(i3, cqVar2, bVar, new da.a(), da.a.a);
                }
                if (cqVar2.X() != cq.a.MATCH_CONSTRAINT || a4) {
                    if (!cqVar2.t()) {
                        if (next == cqVar2.z && cqVar2.B.c == null) {
                            int j = cqVar2.z.j() + d;
                            cqVar2.a(j, cqVar2.F() + j);
                            a(i3, cqVar2, bVar, z);
                        } else if (next == cqVar2.B && cqVar2.z.c == null) {
                            int j2 = d - cqVar2.B.j();
                            cqVar2.a(j2 - cqVar2.F(), j2);
                            a(i3, cqVar2, bVar, z);
                        } else if (next == cqVar2.z && cqVar2.B.c != null && cqVar2.B.c.f() && !cqVar2.Z()) {
                            a(i3, bVar, cqVar2, z);
                        }
                    }
                } else if (cqVar2.X() == cq.a.MATCH_CONSTRAINT && cqVar2.q >= 0 && cqVar2.p >= 0 && (cqVar2.B() == 8 || (cqVar2.m == 0 && cqVar2.S() == 0.0f))) {
                    if (!cqVar2.Z() && !cqVar2.p()) {
                        if (((next == cqVar2.z && cqVar2.B.c != null && cqVar2.B.c.f()) || (next == cqVar2.B && cqVar2.z.c != null && cqVar2.z.c.f())) && !cqVar2.Z()) {
                            a(i3, cqVar, bVar, cqVar2, z);
                        }
                    }
                }
            }
        }
        if (cqVar instanceof ct) {
            return;
        }
        if (a3.a() != null && a3.f()) {
            Iterator<cp> it2 = a3.a().iterator();
            while (it2.hasNext()) {
                cp next2 = it2.next();
                cq cqVar3 = next2.a;
                int i4 = i + 1;
                boolean a5 = a(i4, cqVar3);
                if (cqVar3.t() && a5) {
                    cr.a(i4, cqVar3, bVar, new da.a(), da.a.a);
                }
                boolean z2 = (next2 == cqVar3.z && cqVar3.B.c != null && cqVar3.B.c.f()) || (next2 == cqVar3.B && cqVar3.z.c != null && cqVar3.z.c.f());
                if (cqVar3.X() != cq.a.MATCH_CONSTRAINT || a5) {
                    if (!cqVar3.t()) {
                        if (next2 == cqVar3.z && cqVar3.B.c == null) {
                            int j3 = cqVar3.z.j() + d2;
                            cqVar3.a(j3, cqVar3.F() + j3);
                            a(i4, cqVar3, bVar, z);
                        } else if (next2 == cqVar3.B && cqVar3.z.c == null) {
                            int j4 = d2 - cqVar3.B.j();
                            cqVar3.a(j4 - cqVar3.F(), j4);
                            a(i4, cqVar3, bVar, z);
                        } else if (z2 && !cqVar3.Z()) {
                            a(i4, bVar, cqVar3, z);
                        }
                    }
                } else if (cqVar3.X() == cq.a.MATCH_CONSTRAINT && cqVar3.q >= 0 && cqVar3.p >= 0 && (cqVar3.B() == 8 || (cqVar3.m == 0 && cqVar3.S() == 0.0f))) {
                    if (!cqVar3.Z() && !cqVar3.p() && z2 && !cqVar3.Z()) {
                        a(i4, cqVar, bVar, cqVar3, z);
                    }
                }
            }
        }
        cqVar.l();
    }

    private static void a(int i, cq cqVar, da.b bVar) {
        if (cqVar.k()) {
            return;
        }
        c++;
        if (!(cqVar instanceof cr) && cqVar.t()) {
            int i2 = i + 1;
            if (a(i2, cqVar)) {
                cr.a(i2, cqVar, bVar, new da.a(), da.a.a);
            }
        }
        cp a2 = cqVar.a(cp.a.TOP);
        cp a3 = cqVar.a(cp.a.BOTTOM);
        int d = a2.d();
        int d2 = a3.d();
        if (a2.a() != null && a2.f()) {
            Iterator<cp> it = a2.a().iterator();
            while (it.hasNext()) {
                cp next = it.next();
                cq cqVar2 = next.a;
                int i3 = i + 1;
                boolean a4 = a(i3, cqVar2);
                if (cqVar2.t() && a4) {
                    cr.a(i3, cqVar2, bVar, new da.a(), da.a.a);
                }
                if (cqVar2.Y() != cq.a.MATCH_CONSTRAINT || a4) {
                    if (!cqVar2.t()) {
                        if (next == cqVar2.A && cqVar2.C.c == null) {
                            int j = cqVar2.A.j() + d;
                            cqVar2.b(j, cqVar2.G() + j);
                            a(i3, cqVar2, bVar);
                        } else if (next == cqVar2.C && cqVar2.C.c == null) {
                            int j2 = d - cqVar2.C.j();
                            cqVar2.b(j2 - cqVar2.G(), j2);
                            a(i3, cqVar2, bVar);
                        } else if (next == cqVar2.A && cqVar2.C.c != null && cqVar2.C.c.f()) {
                            a(i3, bVar, cqVar2);
                        }
                    }
                } else if (cqVar2.Y() == cq.a.MATCH_CONSTRAINT && cqVar2.t >= 0 && cqVar2.s >= 0 && (cqVar2.B() == 8 || (cqVar2.n == 0 && cqVar2.S() == 0.0f))) {
                    if (!cqVar2.aa() && !cqVar2.p()) {
                        if (((next == cqVar2.A && cqVar2.C.c != null && cqVar2.C.c.f()) || (next == cqVar2.C && cqVar2.A.c != null && cqVar2.A.c.f())) && !cqVar2.aa()) {
                            a(i3, cqVar, bVar, cqVar2);
                        }
                    }
                }
            }
        }
        if (cqVar instanceof ct) {
            return;
        }
        if (a3.a() != null && a3.f()) {
            Iterator<cp> it2 = a3.a().iterator();
            while (it2.hasNext()) {
                cp next2 = it2.next();
                cq cqVar3 = next2.a;
                int i4 = i + 1;
                boolean a5 = a(i4, cqVar3);
                if (cqVar3.t() && a5) {
                    cr.a(i4, cqVar3, bVar, new da.a(), da.a.a);
                }
                boolean z = (next2 == cqVar3.A && cqVar3.C.c != null && cqVar3.C.c.f()) || (next2 == cqVar3.C && cqVar3.A.c != null && cqVar3.A.c.f());
                if (cqVar3.Y() != cq.a.MATCH_CONSTRAINT || a5) {
                    if (!cqVar3.t()) {
                        if (next2 == cqVar3.A && cqVar3.C.c == null) {
                            int j3 = cqVar3.A.j() + d2;
                            cqVar3.b(j3, cqVar3.G() + j3);
                            a(i4, cqVar3, bVar);
                        } else if (next2 == cqVar3.C && cqVar3.A.c == null) {
                            int j4 = d2 - cqVar3.C.j();
                            cqVar3.b(j4 - cqVar3.G(), j4);
                            a(i4, cqVar3, bVar);
                        } else if (z && !cqVar3.aa()) {
                            a(i4, bVar, cqVar3);
                        }
                    }
                } else if (cqVar3.Y() == cq.a.MATCH_CONSTRAINT && cqVar3.t >= 0 && cqVar3.s >= 0 && (cqVar3.B() == 8 || (cqVar3.n == 0 && cqVar3.S() == 0.0f))) {
                    if (!cqVar3.aa() && !cqVar3.p() && z && !cqVar3.aa()) {
                        a(i4, cqVar, bVar, cqVar3);
                    }
                }
            }
        }
        cp a6 = cqVar.a(cp.a.BASELINE);
        if (a6.a() != null && a6.f()) {
            int d3 = a6.d();
            Iterator<cp> it3 = a6.a().iterator();
            while (it3.hasNext()) {
                cp next3 = it3.next();
                cq cqVar4 = next3.a;
                int i5 = i + 1;
                boolean a7 = a(i5, cqVar4);
                if (cqVar4.t() && a7) {
                    cr.a(i5, cqVar4, bVar, new da.a(), da.a.a);
                }
                if (cqVar4.Y() != cq.a.MATCH_CONSTRAINT || a7) {
                    if (!cqVar4.t() && next3 == cqVar4.D) {
                        cqVar4.f(next3.j() + d3);
                        a(i5, cqVar4, bVar);
                    }
                }
            }
        }
        cqVar.m();
    }

    private static void a(int i, da.b bVar, cq cqVar, boolean z) {
        float N = cqVar.N();
        int d = cqVar.z.c.d();
        int d2 = cqVar.B.c.d();
        int j = cqVar.z.j() + d;
        int j2 = d2 - cqVar.B.j();
        if (d == d2) {
            N = 0.5f;
        } else {
            d = j;
            d2 = j2;
        }
        int F = cqVar.F();
        int i2 = (d2 - d) - F;
        if (d > d2) {
            i2 = (d - d2) - F;
        }
        int i3 = (i2 > 0 ? (int) ((N * i2) + 0.5f) : (int) (N * i2)) + d;
        int i4 = i3 + F;
        if (d > d2) {
            i4 = i3 - F;
        }
        cqVar.a(i3, i4);
        a(i + 1, cqVar, bVar, z);
    }

    private static void a(int i, da.b bVar, cq cqVar) {
        float O = cqVar.O();
        int d = cqVar.A.c.d();
        int d2 = cqVar.C.c.d();
        int j = cqVar.A.j() + d;
        int j2 = d2 - cqVar.C.j();
        if (d == d2) {
            O = 0.5f;
        } else {
            d = j;
            d2 = j2;
        }
        int G = cqVar.G();
        int i2 = (d2 - d) - G;
        if (d > d2) {
            i2 = (d - d2) - G;
        }
        int i3 = i2 > 0 ? (int) ((O * i2) + 0.5f) : (int) (O * i2);
        int i4 = d + i3;
        int i5 = i4 + G;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - G;
        }
        cqVar.b(i4, i5);
        a(i + 1, cqVar, bVar);
    }

    private static void a(int i, cq cqVar, da.b bVar, cq cqVar2, boolean z) {
        int F;
        float N = cqVar2.N();
        int d = cqVar2.z.c.d() + cqVar2.z.j();
        int d2 = cqVar2.B.c.d() - cqVar2.B.j();
        if (d2 >= d) {
            int F2 = cqVar2.F();
            if (cqVar2.B() != 8) {
                if (cqVar2.m == 2) {
                    if (cqVar instanceof cr) {
                        F = cqVar.F();
                    } else {
                        F = cqVar.A().F();
                    }
                    F2 = (int) (cqVar2.N() * 0.5f * F);
                } else if (cqVar2.m == 0) {
                    F2 = d2 - d;
                }
                F2 = Math.max(cqVar2.p, F2);
                if (cqVar2.q > 0) {
                    F2 = Math.min(cqVar2.q, F2);
                }
            }
            int i2 = d + ((int) ((N * ((d2 - d) - F2)) + 0.5f));
            cqVar2.a(i2, F2 + i2);
            a(i + 1, cqVar2, bVar, z);
        }
    }

    private static void a(int i, cq cqVar, da.b bVar, cq cqVar2) {
        int G;
        float O = cqVar2.O();
        int d = cqVar2.A.c.d() + cqVar2.A.j();
        int d2 = cqVar2.C.c.d() - cqVar2.C.j();
        if (d2 >= d) {
            int G2 = cqVar2.G();
            if (cqVar2.B() != 8) {
                if (cqVar2.n == 2) {
                    if (cqVar instanceof cr) {
                        G = cqVar.G();
                    } else {
                        G = cqVar.A().G();
                    }
                    G2 = (int) (O * 0.5f * G);
                } else if (cqVar2.n == 0) {
                    G2 = d2 - d;
                }
                G2 = Math.max(cqVar2.s, G2);
                if (cqVar2.t > 0) {
                    G2 = Math.min(cqVar2.t, G2);
                }
            }
            int i2 = d + ((int) ((O * ((d2 - d) - G2)) + 0.5f));
            cqVar2.b(i2, G2 + i2);
            a(i + 1, cqVar2, bVar);
        }
    }

    private static boolean a(int i, cq cqVar) {
        cq.a X = cqVar.X();
        cq.a Y = cqVar.Y();
        cr crVar = cqVar.A() != null ? (cr) cqVar.A() : null;
        if (crVar != null) {
            crVar.X();
            cq.a aVar = cq.a.FIXED;
        }
        if (crVar != null) {
            crVar.Y();
            cq.a aVar2 = cq.a.FIXED;
        }
        boolean z = X == cq.a.FIXED || cqVar.d() || X == cq.a.WRAP_CONTENT || (X == cq.a.MATCH_CONSTRAINT && cqVar.m == 0 && cqVar.N == 0.0f && cqVar.g(0)) || (X == cq.a.MATCH_CONSTRAINT && cqVar.m == 1 && cqVar.c(0, cqVar.F()));
        boolean z2 = Y == cq.a.FIXED || cqVar.e() || Y == cq.a.WRAP_CONTENT || (Y == cq.a.MATCH_CONSTRAINT && cqVar.n == 0 && cqVar.N == 0.0f && cqVar.g(1)) || (X == cq.a.MATCH_CONSTRAINT && cqVar.n == 1 && cqVar.c(1, cqVar.G()));
        if (cqVar.N <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }
}
