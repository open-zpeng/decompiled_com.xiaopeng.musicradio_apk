package defpackage;

import defpackage.bu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintAnchor.java */
/* renamed from: cp  reason: default package */
/* loaded from: classes3.dex */
public class cp {
    public final cq a;
    public final a b;
    public cp c;
    bu f;
    private int h;
    private boolean i;
    private HashSet<cp> g = null;
    public int d = 0;
    int e = Integer.MIN_VALUE;

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: cp$a */
    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public void a(int i, ArrayList<dn> arrayList, dn dnVar) {
        HashSet<cp> hashSet = this.g;
        if (hashSet != null) {
            Iterator<cp> it = hashSet.iterator();
            while (it.hasNext()) {
                dh.a(it.next().a, i, arrayList, dnVar);
            }
        }
    }

    public HashSet<cp> a() {
        return this.g;
    }

    public boolean b() {
        HashSet<cp> hashSet = this.g;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean c() {
        HashSet<cp> hashSet = this.g;
        if (hashSet == null) {
            return false;
        }
        Iterator<cp> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().n().m()) {
                return true;
            }
        }
        return false;
    }

    public void a(int i) {
        this.h = i;
        this.i = true;
    }

    public int d() {
        if (this.i) {
            return this.h;
        }
        return 0;
    }

    public void e() {
        this.i = false;
        this.h = 0;
    }

    public boolean f() {
        return this.i;
    }

    public cp(cq cqVar, a aVar) {
        this.a = cqVar;
        this.b = aVar;
    }

    public bu g() {
        return this.f;
    }

    public void a(bp bpVar) {
        bu buVar = this.f;
        if (buVar == null) {
            this.f = new bu(bu.a.UNRESTRICTED, null);
        } else {
            buVar.b();
        }
    }

    public cq h() {
        return this.a;
    }

    public a i() {
        return this.b;
    }

    public int j() {
        cp cpVar;
        if (this.a.B() == 8) {
            return 0;
        }
        if (this.e != Integer.MIN_VALUE && (cpVar = this.c) != null && cpVar.a.B() == 8) {
            return this.e;
        }
        return this.d;
    }

    public cp k() {
        return this.c;
    }

    public void l() {
        HashSet<cp> hashSet;
        cp cpVar = this.c;
        if (cpVar != null && (hashSet = cpVar.g) != null) {
            hashSet.remove(this);
            if (this.c.g.size() == 0) {
                this.c.g = null;
            }
        }
        this.g = null;
        this.c = null;
        this.d = 0;
        this.e = Integer.MIN_VALUE;
        this.i = false;
        this.h = 0;
    }

    public boolean a(cp cpVar, int i, int i2, boolean z) {
        if (cpVar == null) {
            l();
            return true;
        } else if (z || a(cpVar)) {
            this.c = cpVar;
            cp cpVar2 = this.c;
            if (cpVar2.g == null) {
                cpVar2.g = new HashSet<>();
            }
            HashSet<cp> hashSet = this.c.g;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.d = i;
            this.e = i2;
            return true;
        } else {
            return false;
        }
    }

    public boolean a(cp cpVar, int i) {
        return a(cpVar, i, Integer.MIN_VALUE, false);
    }

    public boolean m() {
        return this.c != null;
    }

    public boolean a(cp cpVar) {
        if (cpVar == null) {
            return false;
        }
        a i = cpVar.i();
        a aVar = this.b;
        if (i == aVar) {
            return aVar != a.BASELINE || (cpVar.h().P() && h().P());
        }
        switch (this.b) {
            case CENTER:
                return (i == a.BASELINE || i == a.CENTER_X || i == a.CENTER_Y) ? false : true;
            case LEFT:
            case RIGHT:
                boolean z = i == a.LEFT || i == a.RIGHT;
                return cpVar.h() instanceof ct ? z || i == a.CENTER_X : z;
            case TOP:
            case BOTTOM:
                boolean z2 = i == a.TOP || i == a.BOTTOM;
                return cpVar.h() instanceof ct ? z2 || i == a.CENTER_Y : z2;
            case BASELINE:
                return (i == a.LEFT || i == a.RIGHT) ? false : true;
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.b.name());
        }
    }

    public void b(int i) {
        if (m()) {
            this.e = i;
        }
    }

    public String toString() {
        return this.a.C() + ":" + this.b.toString();
    }

    public final cp n() {
        switch (this.b) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            case LEFT:
                return this.a.B;
            case RIGHT:
                return this.a.z;
            case TOP:
                return this.a.C;
            case BOTTOM:
                return this.a.A;
            default:
                throw new AssertionError(this.b.name());
        }
    }
}
