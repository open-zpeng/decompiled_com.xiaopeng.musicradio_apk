package defpackage;

import defpackage.cq;
import defpackage.da;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintWidgetContainer.java */
/* renamed from: cr  reason: default package */
/* loaded from: classes3.dex */
public class cr extends cy {
    static int aS;
    int aB;
    int aC;
    int aD;
    int aE;
    private int aU;
    public br az;
    da a = new da(this);
    public dd ax = new dd(this);
    protected da.b ay = null;
    private boolean aV = false;
    protected bq aA = new bq();
    public int aF = 0;
    public int aG = 0;
    co[] aH = new co[4];
    co[] aI = new co[4];
    public boolean aJ = false;
    public boolean aK = false;
    public boolean aL = false;
    public int aM = 0;
    public int aN = 0;
    private int aW = 257;
    public boolean aO = false;
    private boolean aX = false;
    private boolean aY = false;
    int aP = 0;
    private WeakReference<cp> aZ = null;
    private WeakReference<cp> ba = null;
    private WeakReference<cp> bb = null;
    private WeakReference<cp> bc = null;
    HashSet<cq> aQ = new HashSet<>();
    public da.a aR = new da.a();

    public boolean af() {
        return false;
    }

    public void b() {
        this.ax.b();
    }

    public void c() {
        this.ax.c();
    }

    public boolean a(boolean z) {
        return this.ax.a(z);
    }

    public boolean f(boolean z) {
        return this.ax.b(z);
    }

    public boolean a(boolean z, int i) {
        return this.ax.a(z, i);
    }

    public long a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.aB = i8;
        this.aC = i9;
        return this.a.a(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void f() {
        this.a.a(this);
    }

    public void a(da.b bVar) {
        this.ay = bVar;
        this.ax.a(bVar);
    }

    public da.b g() {
        return this.ay;
    }

    public void a(br brVar) {
        this.az = brVar;
        this.aA.a(brVar);
    }

    public void a(int i) {
        this.aW = i;
        bq bqVar = this.aA;
        bq.a = b(512);
    }

    public int h() {
        return this.aW;
    }

    public boolean b(int i) {
        return (this.aW & i) == i;
    }

    @Override // defpackage.cy, defpackage.cq
    public void w() {
        this.aA.b();
        this.aB = 0;
        this.aD = 0;
        this.aC = 0;
        this.aE = 0;
        this.aO = false;
        super.w();
    }

    public boolean i() {
        return this.aX;
    }

    public boolean ac() {
        return this.aY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(cp cpVar) {
        WeakReference<cp> weakReference = this.aZ;
        if (weakReference == null || weakReference.get() == null || cpVar.d() > this.aZ.get().d()) {
            this.aZ = new WeakReference<>(cpVar);
        }
    }

    public void b(cp cpVar) {
        WeakReference<cp> weakReference = this.ba;
        if (weakReference == null || weakReference.get() == null || cpVar.d() > this.ba.get().d()) {
            this.ba = new WeakReference<>(cpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(cp cpVar) {
        WeakReference<cp> weakReference = this.bb;
        if (weakReference == null || weakReference.get() == null || cpVar.d() > this.bb.get().d()) {
            this.bb = new WeakReference<>(cpVar);
        }
    }

    public void d(cp cpVar) {
        WeakReference<cp> weakReference = this.bc;
        if (weakReference == null || weakReference.get() == null || cpVar.d() > this.bc.get().d()) {
            this.bc = new WeakReference<>(cpVar);
        }
    }

    private void a(cp cpVar, bu buVar) {
        this.aA.a(this.aA.a(cpVar), buVar, 0, 5);
    }

    private void b(cp cpVar, bu buVar) {
        this.aA.a(buVar, this.aA.a(cpVar), 0, 5);
    }

    public boolean b(bq bqVar) {
        boolean b = b(64);
        a(bqVar, b);
        int size = this.aT.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            cq cqVar = this.aT.get(i);
            cqVar.a(0, false);
            cqVar.a(1, false);
            if (cqVar instanceof cm) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                cq cqVar2 = this.aT.get(i2);
                if (cqVar2 instanceof cm) {
                    ((cm) cqVar2).f();
                }
            }
        }
        this.aQ.clear();
        for (int i3 = 0; i3 < size; i3++) {
            cq cqVar3 = this.aT.get(i3);
            if (cqVar3.ab()) {
                if (cqVar3 instanceof cx) {
                    this.aQ.add(cqVar3);
                } else {
                    cqVar3.a(bqVar, b);
                }
            }
        }
        while (this.aQ.size() > 0) {
            int size2 = this.aQ.size();
            Iterator<cq> it = this.aQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cx cxVar = (cx) it.next();
                if (cxVar.a(this.aQ)) {
                    cxVar.a(bqVar, b);
                    this.aQ.remove(cxVar);
                    break;
                }
            }
            if (size2 == this.aQ.size()) {
                Iterator<cq> it2 = this.aQ.iterator();
                while (it2.hasNext()) {
                    it2.next().a(bqVar, b);
                }
                this.aQ.clear();
            }
        }
        if (bq.a) {
            HashSet<cq> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                cq cqVar4 = this.aT.get(i4);
                if (!cqVar4.ab()) {
                    hashSet.add(cqVar4);
                }
            }
            a(this, bqVar, hashSet, X() == cq.a.WRAP_CONTENT ? 0 : 1, false);
            Iterator<cq> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                cq next = it3.next();
                cw.a(this, bqVar, next);
                next.a(bqVar, b);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                cq cqVar5 = this.aT.get(i5);
                if (cqVar5 instanceof cr) {
                    cq.a aVar = cqVar5.f158J[0];
                    cq.a aVar2 = cqVar5.f158J[1];
                    if (aVar == cq.a.WRAP_CONTENT) {
                        cqVar5.a(cq.a.FIXED);
                    }
                    if (aVar2 == cq.a.WRAP_CONTENT) {
                        cqVar5.b(cq.a.FIXED);
                    }
                    cqVar5.a(bqVar, b);
                    if (aVar == cq.a.WRAP_CONTENT) {
                        cqVar5.a(aVar);
                    }
                    if (aVar2 == cq.a.WRAP_CONTENT) {
                        cqVar5.b(aVar2);
                    }
                } else {
                    cw.a(this, bqVar, cqVar5);
                    if (!cqVar5.ab()) {
                        cqVar5.a(bqVar, b);
                    }
                }
            }
        }
        if (this.aF > 0) {
            cn.a(this, bqVar, null, 0);
        }
        if (this.aG > 0) {
            cn.a(this, bqVar, null, 1);
        }
        return true;
    }

    public boolean a(bq bqVar, boolean[] zArr) {
        zArr[2] = false;
        boolean b = b(64);
        b(bqVar, b);
        int size = this.aT.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            cq cqVar = this.aT.get(i);
            cqVar.b(bqVar, b);
            if (cqVar.y()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.cq
    public void a(boolean z, boolean z2) {
        super.a(z, z2);
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            this.aT.get(i).a(z, z2);
        }
    }

    public void g(boolean z) {
        this.aV = z;
    }

    public boolean ad() {
        return this.aV;
    }

    public static boolean a(int i, cq cqVar, da.b bVar, da.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (cqVar.B() == 8 || (cqVar instanceof ct) || (cqVar instanceof cm)) {
            aVar.h = 0;
            aVar.i = 0;
            return false;
        }
        aVar.d = cqVar.X();
        aVar.e = cqVar.Y();
        aVar.f = cqVar.F();
        aVar.g = cqVar.G();
        aVar.l = false;
        aVar.m = i2;
        boolean z = aVar.d == cq.a.MATCH_CONSTRAINT;
        boolean z2 = aVar.e == cq.a.MATCH_CONSTRAINT;
        boolean z3 = z && cqVar.N > 0.0f;
        boolean z4 = z2 && cqVar.N > 0.0f;
        if (z && cqVar.g(0) && cqVar.m == 0 && !z3) {
            aVar.d = cq.a.WRAP_CONTENT;
            if (z2 && cqVar.n == 0) {
                aVar.d = cq.a.FIXED;
            }
            z = false;
        }
        if (z2 && cqVar.g(1) && cqVar.n == 0 && !z4) {
            aVar.e = cq.a.WRAP_CONTENT;
            if (z && cqVar.m == 0) {
                aVar.e = cq.a.FIXED;
            }
            z2 = false;
        }
        if (cqVar.d()) {
            aVar.d = cq.a.FIXED;
            z = false;
        }
        if (cqVar.e()) {
            aVar.e = cq.a.FIXED;
            z2 = false;
        }
        if (z3) {
            if (cqVar.o[0] == 4) {
                aVar.d = cq.a.FIXED;
            } else if (!z2) {
                if (aVar.e == cq.a.FIXED) {
                    i4 = aVar.g;
                } else {
                    aVar.d = cq.a.WRAP_CONTENT;
                    bVar.a(cqVar, aVar);
                    i4 = aVar.i;
                }
                aVar.d = cq.a.FIXED;
                aVar.f = (int) (cqVar.S() * i4);
            }
        }
        if (z4) {
            if (cqVar.o[1] == 4) {
                aVar.e = cq.a.FIXED;
            } else if (!z) {
                if (aVar.d == cq.a.FIXED) {
                    i3 = aVar.f;
                } else {
                    aVar.e = cq.a.WRAP_CONTENT;
                    bVar.a(cqVar, aVar);
                    i3 = aVar.h;
                }
                aVar.e = cq.a.FIXED;
                if (cqVar.T() == -1) {
                    aVar.g = (int) (i3 / cqVar.S());
                } else {
                    aVar.g = (int) (cqVar.S() * i3);
                }
            }
        }
        bVar.a(cqVar, aVar);
        cqVar.q(aVar.h);
        cqVar.r(aVar.i);
        cqVar.c(aVar.k);
        cqVar.u(aVar.j);
        aVar.m = da.a.a;
        return aVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033a  */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ae() {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.ae():void");
    }

    public bq ag() {
        return this.aA;
    }

    private void aj() {
        this.aF = 0;
        this.aG = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(cq cqVar, int i) {
        if (i == 0) {
            d(cqVar);
        } else if (i == 1) {
            e(cqVar);
        }
    }

    private void d(cq cqVar) {
        int i = this.aF + 1;
        co[] coVarArr = this.aI;
        if (i >= coVarArr.length) {
            this.aI = (co[]) Arrays.copyOf(coVarArr, coVarArr.length * 2);
        }
        this.aI[this.aF] = new co(cqVar, 0, ad());
        this.aF++;
    }

    private void e(cq cqVar) {
        int i = this.aG + 1;
        co[] coVarArr = this.aH;
        if (i >= coVarArr.length) {
            this.aH = (co[]) Arrays.copyOf(coVarArr, coVarArr.length * 2);
        }
        this.aH[this.aG] = new co(cqVar, 1, ad());
        this.aG++;
    }

    public void A(int i) {
        this.aU = i;
    }
}
