package defpackage;

import defpackage.cq;
/* compiled from: WidgetRun.java */
/* renamed from: do  reason: invalid class name and default package */
/* loaded from: classes3.dex */
public abstract class Cdo implements dc {
    public int c;
    cq d;
    dl e;
    protected cq.a f;
    df g = new df(this);
    public int h = 0;
    boolean i = false;
    public de j = new de(this);
    public de k = new de(this);
    protected a l = a.NONE;

    /* compiled from: WidgetRun.java */
    /* renamed from: do$a */
    /* loaded from: classes3.dex */
    enum a {
        NONE,
        START,
        END,
        CENTER
    }

    @Override // defpackage.dc
    public void a(dc dcVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(dc dcVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(dc dcVar) {
    }

    abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    public Cdo(cq cqVar) {
        this.d = cqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final de a(cp cpVar) {
        if (cpVar.c == null) {
            return null;
        }
        cq cqVar = cpVar.c.a;
        switch (cpVar.c.b) {
            case LEFT:
                return cqVar.f.j;
            case RIGHT:
                return cqVar.f.k;
            case TOP:
                return cqVar.g.j;
            case BASELINE:
                return cqVar.g.a;
            case BOTTOM:
                return cqVar.g.k;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(dc dcVar, cp cpVar, cp cpVar2, int i) {
        float O;
        de a2 = a(cpVar);
        de a3 = a(cpVar2);
        if (a2.j && a3.j) {
            int j = a2.g + cpVar.j();
            int j2 = a3.g - cpVar2.j();
            int i2 = j2 - j;
            if (!this.g.j && this.f == cq.a.MATCH_CONSTRAINT) {
                b(i, i2);
            }
            if (this.g.j) {
                if (this.g.g == i2) {
                    this.j.a(j);
                    this.k.a(j2);
                    return;
                }
                if (i == 0) {
                    O = this.d.N();
                } else {
                    O = this.d.O();
                }
                if (a2 == a3) {
                    j = a2.g;
                    j2 = a3.g;
                    O = 0.5f;
                }
                this.j.a((int) (j + 0.5f + (((j2 - j) - this.g.g) * O)));
                this.k.a(this.j.g + this.g.g);
            }
        }
    }

    private void b(int i, int i2) {
        int i3;
        switch (this.c) {
            case 0:
                this.g.a(a(i2, i));
                return;
            case 1:
                this.g.a(Math.min(a(this.g.m, i), i2));
                return;
            case 2:
                cq A = this.d.A();
                if (A != null) {
                    Cdo cdo = i == 0 ? A.f : A.g;
                    if (cdo.g.j) {
                        this.g.a(a((int) ((cdo.g.g * (i == 0 ? this.d.r : this.d.u)) + 0.5f), i));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (this.d.f.f == cq.a.MATCH_CONSTRAINT && this.d.f.c == 3 && this.d.g.f == cq.a.MATCH_CONSTRAINT && this.d.g.c == 3) {
                    return;
                }
                Cdo cdo2 = i == 0 ? this.d.g : this.d.f;
                if (cdo2.g.j) {
                    float S = this.d.S();
                    if (i == 1) {
                        i3 = (int) ((cdo2.g.g / S) + 0.5f);
                    } else {
                        i3 = (int) ((S * cdo2.g.g) + 0.5f);
                    }
                    this.g.a(i3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(int i, int i2) {
        if (i2 == 0) {
            int i3 = this.d.q;
            int max = Math.max(this.d.p, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            return max != i ? max : i;
        }
        int i4 = this.d.t;
        int min = i4 > 0 ? Math.min(i4, i) : Math.max(this.d.s, i);
        return min != i ? min : i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final de a(cp cpVar, int i) {
        if (cpVar.c == null) {
            return null;
        }
        cq cqVar = cpVar.c.a;
        Cdo cdo = i == 0 ? cqVar.f : cqVar.g;
        int i2 = AnonymousClass1.a[cpVar.c.b.ordinal()];
        if (i2 != 5) {
            switch (i2) {
                case 1:
                case 3:
                    return cdo.j;
                case 2:
                    break;
                default:
                    return null;
            }
        }
        return cdo.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(de deVar, de deVar2, int i) {
        deVar.l.add(deVar2);
        deVar.f = i;
        deVar2.k.add(deVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(de deVar, de deVar2, int i, df dfVar) {
        deVar.l.add(deVar2);
        deVar.l.add(this.g);
        deVar.h = i;
        deVar.i = dfVar;
        deVar2.k.add(deVar);
        dfVar.k.add(deVar);
    }

    public long b() {
        if (this.g.j) {
            return this.g.g;
        }
        return 0L;
    }

    public boolean g() {
        return this.i;
    }
}
