package defpackage;

import defpackage.cq;
import java.util.ArrayList;
/* compiled from: BasicMeasure.java */
/* renamed from: da  reason: default package */
/* loaded from: classes3.dex */
public class da {
    private final ArrayList<cq> a = new ArrayList<>();
    private a b = new a();
    private cr c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: da$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static int a = 0;
        public static int b = 1;
        public static int c = 2;
        public cq.a d;
        public cq.a e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public int m;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: da$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(cq cqVar, a aVar);
    }

    public void a(cr crVar) {
        this.a.clear();
        int size = crVar.aT.size();
        for (int i = 0; i < size; i++) {
            cq cqVar = crVar.aT.get(i);
            if (cqVar.X() == cq.a.MATCH_CONSTRAINT || cqVar.Y() == cq.a.MATCH_CONSTRAINT) {
                this.a.add(cqVar);
            }
        }
        crVar.b();
    }

    public da(cr crVar) {
        this.c = crVar;
    }

    private void b(cr crVar) {
        int size = crVar.aT.size();
        boolean b2 = crVar.b(64);
        b g = crVar.g();
        for (int i = 0; i < size; i++) {
            cq cqVar = crVar.aT.get(i);
            if (!(cqVar instanceof ct) && !(cqVar instanceof cm) && !cqVar.p() && (!b2 || cqVar.f == null || cqVar.g == null || !cqVar.f.g.j || !cqVar.g.g.j)) {
                cq.a x = cqVar.x(0);
                cq.a x2 = cqVar.x(1);
                boolean z = x == cq.a.MATCH_CONSTRAINT && cqVar.m != 1 && x2 == cq.a.MATCH_CONSTRAINT && cqVar.n != 1;
                if (!z && crVar.b(1) && !(cqVar instanceof cx)) {
                    if (x == cq.a.MATCH_CONSTRAINT && cqVar.m == 0 && x2 != cq.a.MATCH_CONSTRAINT && !cqVar.Z()) {
                        z = true;
                    }
                    if (x2 == cq.a.MATCH_CONSTRAINT && cqVar.n == 0 && x != cq.a.MATCH_CONSTRAINT && !cqVar.Z()) {
                        z = true;
                    }
                    if ((x == cq.a.MATCH_CONSTRAINT || x2 == cq.a.MATCH_CONSTRAINT) && cqVar.N > 0.0f) {
                        z = true;
                    }
                }
                if (!z) {
                    a(g, cqVar, a.a);
                    if (crVar.az != null) {
                        crVar.az.a++;
                    }
                }
            }
        }
        g.a();
    }

    private void a(cr crVar, String str, int i, int i2, int i3) {
        int H = crVar.H();
        int I = crVar.I();
        crVar.s(0);
        crVar.t(0);
        crVar.q(i2);
        crVar.r(i3);
        crVar.s(H);
        crVar.t(I);
        this.c.A(i);
        this.c.ae();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(defpackage.cr r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.a(cr, int, int, int, int, int, int, int, int, int):long");
    }

    private boolean a(b bVar, cq cqVar, int i) {
        this.b.d = cqVar.X();
        this.b.e = cqVar.Y();
        this.b.f = cqVar.F();
        this.b.g = cqVar.G();
        a aVar = this.b;
        aVar.l = false;
        aVar.m = i;
        boolean z = aVar.d == cq.a.MATCH_CONSTRAINT;
        boolean z2 = this.b.e == cq.a.MATCH_CONSTRAINT;
        boolean z3 = z && cqVar.N > 0.0f;
        boolean z4 = z2 && cqVar.N > 0.0f;
        if (z3 && cqVar.o[0] == 4) {
            this.b.d = cq.a.FIXED;
        }
        if (z4 && cqVar.o[1] == 4) {
            this.b.e = cq.a.FIXED;
        }
        bVar.a(cqVar, this.b);
        cqVar.q(this.b.h);
        cqVar.r(this.b.i);
        cqVar.c(this.b.k);
        cqVar.u(this.b.j);
        this.b.m = a.a;
        return this.b.l;
    }
}
