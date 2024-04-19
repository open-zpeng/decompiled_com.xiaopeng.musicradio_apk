package com.xiaopeng.musicradio.model.bluetooth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: NoDuplicateList.java */
/* loaded from: classes.dex */
public class g<E> extends ArrayList<E> {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        if (contains(e)) {
            return true;
        }
        return super.add(e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        if (contains(e)) {
            return;
        }
        super.add(i, e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        return super.addAll(a(collection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return super.addAll(i, a(collection));
    }

    private Collection<E> a(Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            if (contains(it.next())) {
                it.remove();
            }
        }
        return arrayList;
    }
}
