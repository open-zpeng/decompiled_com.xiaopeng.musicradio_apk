package defpackage;

import java.util.ListIterator;
/* compiled from: UnmodifiableListIterator.java */
/* renamed from: zp  reason: default package */
/* loaded from: classes3.dex */
public abstract class zp<E> extends zo<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
