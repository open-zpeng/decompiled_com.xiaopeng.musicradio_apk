package defpackage;

import java.util.Iterator;
/* compiled from: TransformedIterator.java */
/* renamed from: zn  reason: default package */
/* loaded from: classes3.dex */
abstract class zn<F, T> implements Iterator<T> {
    final Iterator<? extends F> a;

    abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
