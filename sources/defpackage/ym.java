package defpackage;

import java.util.NoSuchElementException;
/* compiled from: AbstractIndexedListIterator.java */
/* renamed from: ym  reason: default package */
/* loaded from: classes3.dex */
abstract class ym<E> extends zp<E> {
    private final int a;
    private int b;

    protected abstract E a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public ym(int i, int i2) {
        yj.b(i2, i);
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
