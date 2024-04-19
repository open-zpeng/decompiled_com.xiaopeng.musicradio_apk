package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: ByFunctionOrdering.java */
/* renamed from: yp  reason: default package */
/* loaded from: classes3.dex */
final class yp<F, T> extends zh<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final yh<F, ? extends T> a;
    final zh<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp(yh<F, ? extends T> yhVar, zh<T> zhVar) {
        this.a = (yh) yj.a(yhVar);
        this.b = (zh) yj.a(zhVar);
    }

    @Override // defpackage.zh, java.util.Comparator
    public int compare(F f, F f2) {
        return this.b.compare(this.a.a(f), this.a.a(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yp) {
            yp ypVar = (yp) obj;
            return this.a.equals(ypVar.a) && this.b.equals(ypVar.b);
        }
        return false;
    }

    public int hashCode() {
        return yi.a(this.a, this.b);
    }

    public String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
