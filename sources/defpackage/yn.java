package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: AbstractMultimap.java */
/* renamed from: yn  reason: default package */
/* loaded from: classes3.dex */
abstract class yn<K, V> implements zd<K, V> {
    @MonotonicNonNullDecl
    private transient Map<K, Collection<V>> asMap;
    @MonotonicNonNullDecl
    private transient Collection<Map.Entry<K, V>> entries;
    @MonotonicNonNullDecl
    private transient Set<K> keySet;
    @MonotonicNonNullDecl
    private transient zf<K> keys;
    @MonotonicNonNullDecl
    private transient Collection<V> values;

    abstract Map<K, Collection<V>> b();

    @Override // defpackage.zd
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.asMap;
        if (map == null) {
            Map<K, Collection<V>> b = b();
            this.asMap = b;
            return b;
        }
        return map;
    }

    public boolean equals(@NullableDecl Object obj) {
        return ze.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
