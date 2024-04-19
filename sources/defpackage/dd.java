package defpackage;

import defpackage.cq;
import defpackage.da;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: DependencyGraph.java */
/* renamed from: dd  reason: default package */
/* loaded from: classes3.dex */
public class dd {
    private cr b;
    private cr e;
    private boolean c = true;
    private boolean d = true;
    private ArrayList<Cdo> f = new ArrayList<>();
    private ArrayList<dl> g = new ArrayList<>();
    private da.b h = null;
    private da.a i = new da.a();
    ArrayList<dl> a = new ArrayList<>();

    public dd(cr crVar) {
        this.b = crVar;
        this.e = crVar;
    }

    public void a(da.b bVar) {
        this.h = bVar;
    }

    private int a(cr crVar, int i) {
        int size = this.a.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.a.get(i2).a(crVar, i));
        }
        return (int) j;
    }

    public boolean a(boolean z) {
        boolean z2;
        boolean z3 = z & true;
        boolean z4 = false;
        if (this.c || this.d) {
            Iterator<cq> it = this.b.aT.iterator();
            while (it.hasNext()) {
                cq next = it.next();
                next.z();
                next.b = false;
                next.f.d();
                next.g.d();
            }
            this.b.z();
            cr crVar = this.b;
            crVar.b = false;
            crVar.f.d();
            this.b.g.d();
            this.d = false;
        }
        if (a(this.e)) {
            return false;
        }
        this.b.o(0);
        this.b.p(0);
        cq.a x = this.b.x(0);
        cq.a x2 = this.b.x(1);
        if (this.c) {
            d();
        }
        int D = this.b.D();
        int E = this.b.E();
        this.b.f.j.a(D);
        this.b.g.j.a(E);
        a();
        if (x == cq.a.WRAP_CONTENT || x2 == cq.a.WRAP_CONTENT) {
            if (z3) {
                Iterator<Cdo> it2 = this.f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().a()) {
                        z3 = false;
                        break;
                    }
                }
            }
            if (z3 && x == cq.a.WRAP_CONTENT) {
                this.b.a(cq.a.FIXED);
                cr crVar2 = this.b;
                crVar2.q(a(crVar2, 0));
                this.b.f.g.a(this.b.F());
            }
            if (z3 && x2 == cq.a.WRAP_CONTENT) {
                this.b.b(cq.a.FIXED);
                cr crVar3 = this.b;
                crVar3.r(a(crVar3, 1));
                this.b.g.g.a(this.b.G());
            }
        }
        if (this.b.f158J[0] == cq.a.FIXED || this.b.f158J[0] == cq.a.MATCH_PARENT) {
            int F = this.b.F() + D;
            this.b.f.k.a(F);
            this.b.f.g.a(F - D);
            a();
            if (this.b.f158J[1] == cq.a.FIXED || this.b.f158J[1] == cq.a.MATCH_PARENT) {
                int G = this.b.G() + E;
                this.b.g.k.a(G);
                this.b.g.g.a(G - E);
            }
            a();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<Cdo> it3 = this.f.iterator();
        while (it3.hasNext()) {
            Cdo next2 = it3.next();
            if (next2.d != this.b || next2.i) {
                next2.e();
            }
        }
        Iterator<Cdo> it4 = this.f.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            Cdo next3 = it4.next();
            if (z2 || next3.d != this.b) {
                if (!next3.j.j) {
                    break;
                }
                if (!next3.k.j) {
                    if (!(next3 instanceof di)) {
                        break;
                    }
                }
                if (!next3.g.j && !(next3 instanceof db) && !(next3 instanceof di)) {
                    break;
                }
            }
        }
        this.b.a(x);
        this.b.b(x2);
        return z4;
    }

    public boolean b(boolean z) {
        if (this.c) {
            Iterator<cq> it = this.b.aT.iterator();
            while (it.hasNext()) {
                cq next = it.next();
                next.z();
                next.b = false;
                next.f.g.j = false;
                next.f.i = false;
                next.f.d();
                next.g.g.j = false;
                next.g.i = false;
                next.g.d();
            }
            this.b.z();
            cr crVar = this.b;
            crVar.b = false;
            crVar.f.g.j = false;
            this.b.f.i = false;
            this.b.f.d();
            this.b.g.g.j = false;
            this.b.g.i = false;
            this.b.g.d();
            d();
        }
        if (a(this.e)) {
            return false;
        }
        this.b.o(0);
        this.b.p(0);
        this.b.f.j.a(0);
        this.b.g.j.a(0);
        return true;
    }

    public boolean a(boolean z, int i) {
        boolean z2;
        boolean z3 = z & true;
        boolean z4 = false;
        cq.a x = this.b.x(0);
        cq.a x2 = this.b.x(1);
        int D = this.b.D();
        int E = this.b.E();
        if (z3 && (x == cq.a.WRAP_CONTENT || x2 == cq.a.WRAP_CONTENT)) {
            Iterator<Cdo> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Cdo next = it.next();
                if (next.h == i && !next.a()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && x == cq.a.WRAP_CONTENT) {
                    this.b.a(cq.a.FIXED);
                    cr crVar = this.b;
                    crVar.q(a(crVar, 0));
                    this.b.f.g.a(this.b.F());
                }
            } else if (z3 && x2 == cq.a.WRAP_CONTENT) {
                this.b.b(cq.a.FIXED);
                cr crVar2 = this.b;
                crVar2.r(a(crVar2, 1));
                this.b.g.g.a(this.b.G());
            }
        }
        if (i == 0) {
            if (this.b.f158J[0] == cq.a.FIXED || this.b.f158J[0] == cq.a.MATCH_PARENT) {
                int F = this.b.F() + D;
                this.b.f.k.a(F);
                this.b.f.g.a(F - D);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.b.f158J[1] == cq.a.FIXED || this.b.f158J[1] == cq.a.MATCH_PARENT) {
                int G = this.b.G() + E;
                this.b.g.k.a(G);
                this.b.g.g.a(G - E);
                z2 = true;
            }
            z2 = false;
        }
        a();
        Iterator<Cdo> it2 = this.f.iterator();
        while (it2.hasNext()) {
            Cdo next2 = it2.next();
            if (next2.h == i && (next2.d != this.b || next2.i)) {
                next2.e();
            }
        }
        Iterator<Cdo> it3 = this.f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            Cdo next3 = it3.next();
            if (next3.h == i && (z2 || next3.d != this.b)) {
                if (!next3.j.j) {
                    break;
                } else if (!next3.k.j) {
                    break;
                } else if (!(next3 instanceof db) && !next3.g.j) {
                    break;
                }
            }
        }
        this.b.a(x);
        this.b.b(x2);
        return z4;
    }

    private void a(cq cqVar, cq.a aVar, int i, cq.a aVar2, int i2) {
        da.a aVar3 = this.i;
        aVar3.d = aVar;
        aVar3.e = aVar2;
        aVar3.f = i;
        aVar3.g = i2;
        this.h.a(cqVar, aVar3);
        cqVar.q(this.i.h);
        cqVar.r(this.i.i);
        cqVar.c(this.i.k);
        cqVar.u(this.i.j);
    }

    private boolean a(cr crVar) {
        int i;
        cq.a aVar;
        int i2;
        Iterator<cq> it = crVar.aT.iterator();
        while (it.hasNext()) {
            cq next = it.next();
            cq.a aVar2 = next.f158J[0];
            cq.a aVar3 = next.f158J[1];
            if (next.B() == 8) {
                next.b = true;
            } else {
                if (next.r < 1.0f && aVar2 == cq.a.MATCH_CONSTRAINT) {
                    next.m = 2;
                }
                if (next.u < 1.0f && aVar3 == cq.a.MATCH_CONSTRAINT) {
                    next.n = 2;
                }
                if (next.S() > 0.0f) {
                    if (aVar2 == cq.a.MATCH_CONSTRAINT && (aVar3 == cq.a.WRAP_CONTENT || aVar3 == cq.a.FIXED)) {
                        next.m = 3;
                    } else if (aVar3 == cq.a.MATCH_CONSTRAINT && (aVar2 == cq.a.WRAP_CONTENT || aVar2 == cq.a.FIXED)) {
                        next.n = 3;
                    } else if (aVar2 == cq.a.MATCH_CONSTRAINT && aVar3 == cq.a.MATCH_CONSTRAINT) {
                        if (next.m == 0) {
                            next.m = 3;
                        }
                        if (next.n == 0) {
                            next.n = 3;
                        }
                    }
                }
                cq.a aVar4 = (aVar2 == cq.a.MATCH_CONSTRAINT && next.m == 1 && (next.z.c == null || next.B.c == null)) ? cq.a.WRAP_CONTENT : aVar2;
                cq.a aVar5 = (aVar3 == cq.a.MATCH_CONSTRAINT && next.n == 1 && (next.A.c == null || next.C.c == null)) ? cq.a.WRAP_CONTENT : aVar3;
                next.f.f = aVar4;
                next.f.c = next.m;
                next.g.f = aVar5;
                next.g.c = next.n;
                if ((aVar4 == cq.a.MATCH_PARENT || aVar4 == cq.a.FIXED || aVar4 == cq.a.WRAP_CONTENT) && (aVar5 == cq.a.MATCH_PARENT || aVar5 == cq.a.FIXED || aVar5 == cq.a.WRAP_CONTENT)) {
                    int F = next.F();
                    if (aVar4 == cq.a.MATCH_PARENT) {
                        i = (crVar.F() - next.z.d) - next.B.d;
                        aVar4 = cq.a.FIXED;
                    } else {
                        i = F;
                    }
                    int G = next.G();
                    if (aVar5 == cq.a.MATCH_PARENT) {
                        i2 = (crVar.G() - next.A.d) - next.C.d;
                        aVar = cq.a.FIXED;
                    } else {
                        aVar = aVar5;
                        i2 = G;
                    }
                    a(next, aVar4, i, aVar, i2);
                    next.f.g.a(next.F());
                    next.g.g.a(next.G());
                    next.b = true;
                } else {
                    if (aVar4 == cq.a.MATCH_CONSTRAINT && (aVar5 == cq.a.WRAP_CONTENT || aVar5 == cq.a.FIXED)) {
                        if (next.m == 3) {
                            if (aVar5 == cq.a.WRAP_CONTENT) {
                                a(next, cq.a.WRAP_CONTENT, 0, cq.a.WRAP_CONTENT, 0);
                            }
                            int G2 = next.G();
                            a(next, cq.a.FIXED, (int) ((G2 * next.N) + 0.5f), cq.a.FIXED, G2);
                            next.f.g.a(next.F());
                            next.g.g.a(next.G());
                            next.b = true;
                        } else if (next.m == 1) {
                            a(next, cq.a.WRAP_CONTENT, 0, aVar5, 0);
                            next.f.g.m = next.F();
                        } else if (next.m == 2) {
                            if (crVar.f158J[0] == cq.a.FIXED || crVar.f158J[0] == cq.a.MATCH_PARENT) {
                                a(next, cq.a.FIXED, (int) ((next.r * crVar.F()) + 0.5f), aVar5, next.G());
                                next.f.g.a(next.F());
                                next.g.g.a(next.G());
                                next.b = true;
                            }
                        } else if (next.H[0].c == null || next.H[1].c == null) {
                            a(next, cq.a.WRAP_CONTENT, 0, aVar5, 0);
                            next.f.g.a(next.F());
                            next.g.g.a(next.G());
                            next.b = true;
                        }
                    }
                    if (aVar5 == cq.a.MATCH_CONSTRAINT && (aVar4 == cq.a.WRAP_CONTENT || aVar4 == cq.a.FIXED)) {
                        if (next.n == 3) {
                            if (aVar4 == cq.a.WRAP_CONTENT) {
                                a(next, cq.a.WRAP_CONTENT, 0, cq.a.WRAP_CONTENT, 0);
                            }
                            int F2 = next.F();
                            float f = next.N;
                            if (next.T() == -1) {
                                f = 1.0f / f;
                            }
                            a(next, cq.a.FIXED, F2, cq.a.FIXED, (int) ((F2 * f) + 0.5f));
                            next.f.g.a(next.F());
                            next.g.g.a(next.G());
                            next.b = true;
                        } else if (next.n == 1) {
                            a(next, aVar4, 0, cq.a.WRAP_CONTENT, 0);
                            next.g.g.m = next.G();
                        } else if (next.n == 2) {
                            if (crVar.f158J[1] == cq.a.FIXED || crVar.f158J[1] == cq.a.MATCH_PARENT) {
                                a(next, aVar4, next.F(), cq.a.FIXED, (int) ((next.u * crVar.G()) + 0.5f));
                                next.f.g.a(next.F());
                                next.g.g.a(next.G());
                                next.b = true;
                            }
                        } else if (next.H[2].c == null || next.H[3].c == null) {
                            a(next, cq.a.WRAP_CONTENT, 0, aVar5, 0);
                            next.f.g.a(next.F());
                            next.g.g.a(next.G());
                            next.b = true;
                        }
                    }
                    if (aVar4 == cq.a.MATCH_CONSTRAINT && aVar5 == cq.a.MATCH_CONSTRAINT) {
                        if (next.m == 1 || next.n == 1) {
                            a(next, cq.a.WRAP_CONTENT, 0, cq.a.WRAP_CONTENT, 0);
                            next.f.g.m = next.F();
                            next.g.g.m = next.G();
                        } else if (next.n == 2 && next.m == 2 && crVar.f158J[0] == cq.a.FIXED && crVar.f158J[1] == cq.a.FIXED) {
                            a(next, cq.a.FIXED, (int) ((next.r * crVar.F()) + 0.5f), cq.a.FIXED, (int) ((next.u * crVar.G()) + 0.5f));
                            next.f.g.a(next.F());
                            next.g.g.a(next.G());
                            next.b = true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void a() {
        Iterator<cq> it = this.b.aT.iterator();
        while (it.hasNext()) {
            cq next = it.next();
            if (!next.b) {
                boolean z = false;
                cq.a aVar = next.f158J[0];
                cq.a aVar2 = next.f158J[1];
                int i = next.m;
                int i2 = next.n;
                boolean z2 = aVar == cq.a.WRAP_CONTENT || (aVar == cq.a.MATCH_CONSTRAINT && i == 1);
                if (aVar2 == cq.a.WRAP_CONTENT || (aVar2 == cq.a.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                boolean z3 = next.f.g.j;
                boolean z4 = next.g.g.j;
                if (z3 && z4) {
                    a(next, cq.a.FIXED, next.f.g.g, cq.a.FIXED, next.g.g.g);
                    next.b = true;
                } else if (z3 && z) {
                    a(next, cq.a.FIXED, next.f.g.g, cq.a.WRAP_CONTENT, next.g.g.g);
                    if (aVar2 == cq.a.MATCH_CONSTRAINT) {
                        next.g.g.m = next.G();
                    } else {
                        next.g.g.a(next.G());
                        next.b = true;
                    }
                } else if (z4 && z2) {
                    a(next, cq.a.WRAP_CONTENT, next.f.g.g, cq.a.FIXED, next.g.g.g);
                    if (aVar == cq.a.MATCH_CONSTRAINT) {
                        next.f.g.m = next.F();
                    } else {
                        next.f.g.a(next.F());
                        next.b = true;
                    }
                }
                if (next.b && next.g.b != null) {
                    next.g.b.a(next.Q());
                }
            }
        }
    }

    public void b() {
        this.c = true;
    }

    public void c() {
        this.d = true;
    }

    public void d() {
        a(this.f);
        this.a.clear();
        dl.a = 0;
        a(this.b.f, 0, this.a);
        a(this.b.g, 1, this.a);
        this.c = false;
    }

    public void a(ArrayList<Cdo> arrayList) {
        arrayList.clear();
        this.e.f.c();
        this.e.g.c();
        arrayList.add(this.e.f);
        arrayList.add(this.e.g);
        Iterator<cq> it = this.e.aT.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            cq next = it.next();
            if (next instanceof ct) {
                arrayList.add(new di(next));
            } else {
                if (next.Z()) {
                    if (next.d == null) {
                        next.d = new db(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.d);
                } else {
                    arrayList.add(next.f);
                }
                if (next.aa()) {
                    if (next.e == null) {
                        next.e = new db(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.e);
                } else {
                    arrayList.add(next.g);
                }
                if (next instanceof cv) {
                    arrayList.add(new dj(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<Cdo> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
        Iterator<Cdo> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Cdo next2 = it3.next();
            if (next2.d != this.e) {
                next2.f();
            }
        }
    }

    private void a(de deVar, int i, int i2, de deVar2, ArrayList<dl> arrayList, dl dlVar) {
        Cdo cdo = deVar.d;
        if (cdo.e != null || cdo == this.b.f || cdo == this.b.g) {
            return;
        }
        if (dlVar == null) {
            dlVar = new dl(cdo, i2);
            arrayList.add(dlVar);
        }
        cdo.e = dlVar;
        dlVar.a(cdo);
        for (dc dcVar : cdo.j.k) {
            if (dcVar instanceof de) {
                a((de) dcVar, i, 0, deVar2, arrayList, dlVar);
            }
        }
        for (dc dcVar2 : cdo.k.k) {
            if (dcVar2 instanceof de) {
                a((de) dcVar2, i, 1, deVar2, arrayList, dlVar);
            }
        }
        if (i == 1 && (cdo instanceof dm)) {
            for (dc dcVar3 : ((dm) cdo).a.k) {
                if (dcVar3 instanceof de) {
                    a((de) dcVar3, i, 2, deVar2, arrayList, dlVar);
                }
            }
        }
        for (de deVar3 : cdo.j.l) {
            if (deVar3 == deVar2) {
                dlVar.c = true;
            }
            a(deVar3, i, 0, deVar2, arrayList, dlVar);
        }
        for (de deVar4 : cdo.k.l) {
            if (deVar4 == deVar2) {
                dlVar.c = true;
            }
            a(deVar4, i, 1, deVar2, arrayList, dlVar);
        }
        if (i == 1 && (cdo instanceof dm)) {
            for (de deVar5 : ((dm) cdo).a.l) {
                a(deVar5, i, 2, deVar2, arrayList, dlVar);
            }
        }
    }

    private void a(Cdo cdo, int i, ArrayList<dl> arrayList) {
        for (dc dcVar : cdo.j.k) {
            if (dcVar instanceof de) {
                a((de) dcVar, i, 0, cdo.k, arrayList, null);
            } else if (dcVar instanceof Cdo) {
                a(((Cdo) dcVar).j, i, 0, cdo.k, arrayList, null);
            }
        }
        for (dc dcVar2 : cdo.k.k) {
            if (dcVar2 instanceof de) {
                a((de) dcVar2, i, 1, cdo.j, arrayList, null);
            } else if (dcVar2 instanceof Cdo) {
                a(((Cdo) dcVar2).k, i, 1, cdo.j, arrayList, null);
            }
        }
        if (i == 1) {
            for (dc dcVar3 : ((dm) cdo).a.k) {
                if (dcVar3 instanceof de) {
                    a((de) dcVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }
}
