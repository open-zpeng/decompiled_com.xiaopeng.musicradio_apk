package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ChainRun.java */
/* renamed from: db  reason: default package */
/* loaded from: classes3.dex */
public class db extends Cdo {
    ArrayList<Cdo> a;
    private int b;

    public db(cq cqVar, int i) {
        super(cqVar);
        this.a = new ArrayList<>();
        this.h = i;
        h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.h == 0 ? "horizontal : " : "vertical : ");
        Iterator<Cdo> it = this.a.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public boolean a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!this.a.get(i).a()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.Cdo
    public long b() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Cdo cdo = this.a.get(i);
            j = j + cdo.j.f + cdo.b() + cdo.k.f;
        }
        return j;
    }

    private void h() {
        cq cqVar = this.d;
        cq cqVar2 = cqVar;
        cq y = cqVar.y(this.h);
        while (y != null) {
            cqVar2 = y;
            y = y.y(this.h);
        }
        this.d = cqVar2;
        this.a.add(cqVar2.c(this.h));
        cq z = cqVar2.z(this.h);
        while (z != null) {
            this.a.add(z.c(this.h));
            z = z.z(this.h);
        }
        Iterator<Cdo> it = this.a.iterator();
        while (it.hasNext()) {
            Cdo next = it.next();
            if (this.h == 0) {
                next.d.d = this;
            } else if (this.h == 1) {
                next.d.e = this;
            }
        }
        if ((this.h == 0 && ((cr) this.d.A()).ad()) && this.a.size() > 1) {
            ArrayList<Cdo> arrayList = this.a;
            this.d = arrayList.get(arrayList.size() - 1).d;
        }
        this.b = this.h == 0 ? this.d.U() : this.d.V();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void c() {
        this.e = null;
        Iterator<Cdo> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // defpackage.Cdo
    void d() {
        this.j.j = false;
        this.k.j = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0402, code lost:
        r2 = r2 - r9;
     */
    @Override // defpackage.Cdo, defpackage.dc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.dc r24) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.a(dc):void");
    }

    @Override // defpackage.Cdo
    public void e() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).e();
        }
    }

    private cq i() {
        for (int i = 0; i < this.a.size(); i++) {
            Cdo cdo = this.a.get(i);
            if (cdo.d.B() != 8) {
                return cdo.d;
            }
        }
        return null;
    }

    private cq j() {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Cdo cdo = this.a.get(size);
            if (cdo.d.B() != 8) {
                return cdo.d;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.Cdo
    public void f() {
        Iterator<Cdo> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        int size = this.a.size();
        if (size < 1) {
            return;
        }
        cq cqVar = this.a.get(0).d;
        cq cqVar2 = this.a.get(size - 1).d;
        if (this.h == 0) {
            cp cpVar = cqVar.z;
            cp cpVar2 = cqVar2.B;
            de a = a(cpVar, 0);
            int j = cpVar.j();
            cq i = i();
            if (i != null) {
                j = i.z.j();
            }
            if (a != null) {
                a(this.j, a, j);
            }
            de a2 = a(cpVar2, 0);
            int j2 = cpVar2.j();
            cq j3 = j();
            if (j3 != null) {
                j2 = j3.B.j();
            }
            if (a2 != null) {
                a(this.k, a2, -j2);
            }
        } else {
            cp cpVar3 = cqVar.A;
            cp cpVar4 = cqVar2.C;
            de a3 = a(cpVar3, 1);
            int j4 = cpVar3.j();
            cq i2 = i();
            if (i2 != null) {
                j4 = i2.A.j();
            }
            if (a3 != null) {
                a(this.j, a3, j4);
            }
            de a4 = a(cpVar4, 1);
            int j5 = cpVar4.j();
            cq j6 = j();
            if (j6 != null) {
                j5 = j6.C.j();
            }
            if (a4 != null) {
                a(this.k, a4, -j5);
            }
        }
        this.j.a = this;
        this.k.a = this;
    }
}
