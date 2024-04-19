package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ArrayMap.java */
/* renamed from: bf  reason: default package */
/* loaded from: classes2.dex */
public class bf<K, V> extends bl<K, V> implements Map<K, V> {
    bk<K, V> mCollections;

    public bf() {
    }

    public bf(int i) {
        super(i);
    }

    public bf(bl blVar) {
        super(blVar);
    }

    private bk<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new bk<K, V>() { // from class: bf.1
                @Override // defpackage.bk
                protected int a() {
                    return bf.this.mSize;
                }

                @Override // defpackage.bk
                protected Object a(int i, int i2) {
                    return bf.this.mArray[(i << 1) + i2];
                }

                @Override // defpackage.bk
                protected int a(Object obj) {
                    return bf.this.indexOfKey(obj);
                }

                @Override // defpackage.bk
                protected int b(Object obj) {
                    return bf.this.indexOfValue(obj);
                }

                @Override // defpackage.bk
                protected Map<K, V> b() {
                    return bf.this;
                }

                @Override // defpackage.bk
                protected void a(K k, V v) {
                    bf.this.put(k, v);
                }

                @Override // defpackage.bk
                protected V a(int i, V v) {
                    return bf.this.setValueAt(i, v);
                }

                @Override // defpackage.bk
                protected void a(int i) {
                    bf.this.removeAt(i);
                }

                @Override // defpackage.bk
                protected void c() {
                    bf.this.clear();
                }
            };
        }
        return this.mCollections;
    }

    public boolean containsAll(Collection<?> collection) {
        return bk.a((Map) this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        return bk.b(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return bk.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return getCollection().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return getCollection().e();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return getCollection().f();
    }
}
