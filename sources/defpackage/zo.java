package defpackage;

import java.util.Iterator;
/* compiled from: UnmodifiableIterator.java */
/* renamed from: zo  reason: default package */
/* loaded from: classes3.dex */
public abstract class zo<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
