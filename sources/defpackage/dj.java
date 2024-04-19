package defpackage;

import defpackage.de;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* renamed from: dj  reason: default package */
/* loaded from: classes3.dex */
public class dj extends Cdo {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public boolean a() {
        return false;
    }

    public dj(cq cqVar) {
        super(cqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void c() {
        this.e = null;
        this.j.a();
    }

    @Override // defpackage.Cdo
    void d() {
        this.j.j = false;
    }

    private void a(de deVar) {
        this.j.k.add(deVar);
        deVar.l.add(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void f() {
        if (this.d instanceof cm) {
            this.j.b = true;
            cm cmVar = (cm) this.d;
            int b = cmVar.b();
            boolean c = cmVar.c();
            int i = 0;
            switch (b) {
                case 0:
                    this.j.e = de.a.LEFT;
                    while (i < cmVar.ay) {
                        cq cqVar = cmVar.ax[i];
                        if (c || cqVar.B() != 8) {
                            de deVar = cqVar.f.j;
                            deVar.k.add(this.j);
                            this.j.l.add(deVar);
                        }
                        i++;
                    }
                    a(this.d.f.j);
                    a(this.d.f.k);
                    return;
                case 1:
                    this.j.e = de.a.RIGHT;
                    while (i < cmVar.ay) {
                        cq cqVar2 = cmVar.ax[i];
                        if (c || cqVar2.B() != 8) {
                            de deVar2 = cqVar2.f.k;
                            deVar2.k.add(this.j);
                            this.j.l.add(deVar2);
                        }
                        i++;
                    }
                    a(this.d.f.j);
                    a(this.d.f.k);
                    return;
                case 2:
                    this.j.e = de.a.TOP;
                    while (i < cmVar.ay) {
                        cq cqVar3 = cmVar.ax[i];
                        if (c || cqVar3.B() != 8) {
                            de deVar3 = cqVar3.g.j;
                            deVar3.k.add(this.j);
                            this.j.l.add(deVar3);
                        }
                        i++;
                    }
                    a(this.d.g.j);
                    a(this.d.g.k);
                    return;
                case 3:
                    this.j.e = de.a.BOTTOM;
                    while (i < cmVar.ay) {
                        cq cqVar4 = cmVar.ax[i];
                        if (c || cqVar4.B() != 8) {
                            de deVar4 = cqVar4.g.k;
                            deVar4.k.add(this.j);
                            this.j.l.add(deVar4);
                        }
                        i++;
                    }
                    a(this.d.g.j);
                    a(this.d.g.k);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // defpackage.Cdo, defpackage.dc
    public void a(dc dcVar) {
        cm cmVar = (cm) this.d;
        int b = cmVar.b();
        int i = 0;
        int i2 = -1;
        for (de deVar : this.j.l) {
            int i3 = deVar.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (b == 0 || b == 2) {
            this.j.a(i2 + cmVar.g());
        } else {
            this.j.a(i + cmVar.g());
        }
    }

    @Override // defpackage.Cdo
    public void e() {
        if (this.d instanceof cm) {
            int b = ((cm) this.d).b();
            if (b == 0 || b == 1) {
                this.d.o(this.j.g);
            } else {
                this.d.p(this.j.g);
            }
        }
    }
}
