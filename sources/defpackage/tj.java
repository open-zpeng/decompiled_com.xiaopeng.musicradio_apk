package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: BalancedPool.java */
/* renamed from: tj  reason: default package */
/* loaded from: classes3.dex */
public class tj {
    private static tj b = new tj();
    private Map<Class<? extends tk>, tl<? extends tk>> a = new HashMap();

    public static tj a() {
        return b;
    }

    private tj() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends defpackage.tk> T a(java.lang.Class<T> r2, java.lang.Object... r3) {
        /*
            r1 = this;
            tl r0 = r1.a(r2)
            tk r0 = r0.a()
            if (r0 != 0) goto L15
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L11
            tk r2 = (defpackage.tk) r2     // Catch: java.lang.Exception -> L11
            goto L16
        L11:
            r2 = move-exception
            defpackage.ti.a(r2)
        L15:
            r2 = r0
        L16:
            if (r2 == 0) goto L1b
            r2.a(r3)
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj.a(java.lang.Class, java.lang.Object[]):tk");
    }

    public <T extends tk> void a(T t) {
        if (t == null || (t instanceof tn) || (t instanceof tm)) {
            return;
        }
        a(t.getClass()).a(t);
    }

    private synchronized <T extends tk> tl<T> a(Class<T> cls) {
        tl<T> tlVar;
        tlVar = (tl<T>) this.a.get(cls);
        if (tlVar == null) {
            tlVar = new tl<>();
            this.a.put(cls, tlVar);
        }
        return tlVar;
    }
}
