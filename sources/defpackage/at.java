package defpackage;

import defpackage.au;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FastSafeIterableMap.java */
/* renamed from: at  reason: default package */
/* loaded from: classes2.dex */
public class at<K, V> extends au<K, V> {
    private HashMap<K, au.c<K, V>> b = new HashMap<>();

    @Override // defpackage.au
    protected au.c<K, V> a(K k) {
        return this.b.get(k);
    }

    @Override // defpackage.au
    public V a(K k, V v) {
        au.c<K, V> a = a(k);
        if (a != null) {
            return a.b;
        }
        this.b.put(k, b(k, v));
        return null;
    }

    @Override // defpackage.au
    public V b(K k) {
        V v = (V) super.b(k);
        this.b.remove(k);
        return v;
    }

    public boolean c(K k) {
        return this.b.containsKey(k);
    }

    public Map.Entry<K, V> d(K k) {
        if (c(k)) {
            return this.b.get(k).d;
        }
        return null;
    }
}
