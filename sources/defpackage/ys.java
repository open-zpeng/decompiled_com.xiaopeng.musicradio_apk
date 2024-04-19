package defpackage;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: ComparatorOrdering.java */
/* renamed from: ys  reason: default package */
/* loaded from: classes3.dex */
final class ys<T> extends zh<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ys(Comparator<T> comparator) {
        this.a = (Comparator) yj.a(comparator);
    }

    @Override // defpackage.zh, java.util.Comparator
    public int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ys) {
            return this.a.equals(((ys) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
