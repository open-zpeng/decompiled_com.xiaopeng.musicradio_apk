package defpackage;

import defpackage.cq;
/* compiled from: Optimizer.java */
/* renamed from: cw  reason: default package */
/* loaded from: classes3.dex */
public class cw {
    static boolean[] a = new boolean[3];

    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(cr crVar, bq bqVar, cq cqVar) {
        cqVar.k = -1;
        cqVar.l = -1;
        if (crVar.f158J[0] != cq.a.WRAP_CONTENT && cqVar.f158J[0] == cq.a.MATCH_PARENT) {
            int i = cqVar.z.d;
            int F = crVar.F() - cqVar.B.d;
            cqVar.z.f = bqVar.a(cqVar.z);
            cqVar.B.f = bqVar.a(cqVar.B);
            bqVar.a(cqVar.z.f, i);
            bqVar.a(cqVar.B.f, F);
            cqVar.k = 2;
            cqVar.f(i, F);
        }
        if (crVar.f158J[1] == cq.a.WRAP_CONTENT || cqVar.f158J[1] != cq.a.MATCH_PARENT) {
            return;
        }
        int i2 = cqVar.A.d;
        int G = crVar.G() - cqVar.C.d;
        cqVar.A.f = bqVar.a(cqVar.A);
        cqVar.C.f = bqVar.a(cqVar.C);
        bqVar.a(cqVar.A.f, i2);
        bqVar.a(cqVar.C.f, G);
        if (cqVar.V > 0 || cqVar.B() == 8) {
            cqVar.D.f = bqVar.a(cqVar.D);
            bqVar.a(cqVar.D.f, cqVar.V + i2);
        }
        cqVar.l = 2;
        cqVar.g(i2, G);
    }
}
