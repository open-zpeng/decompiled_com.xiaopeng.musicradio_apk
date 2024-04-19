package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import defpackage.yu;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: ImmutableMap.java */
/* renamed from: yw  reason: default package */
/* loaded from: classes3.dex */
public abstract class yw<K, V> implements Serializable, Map<K, V> {
    static final Map.Entry<?, ?>[] a = new Map.Entry[0];
    @LazyInit
    private transient yy<Map.Entry<K, V>> entrySet;
    @RetainedWith
    @LazyInit
    private transient yy<K> keySet;
    @LazyInit
    private transient yz<K, V> multimapView;
    @RetainedWith
    @LazyInit
    private transient yu<V> values;

    abstract yy<Map.Entry<K, V>> c();

    abstract yy<K> e();

    abstract yu<V> g();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    abstract boolean h();

    public static <K, V> yw<K, V> a() {
        return (yw<K, V>) zk.b;
    }

    /* compiled from: ImmutableMap.java */
    /* renamed from: yw$a */
    /* loaded from: classes3.dex */
    public static class a<K, V> {
        @MonotonicNonNullDecl
        Comparator<? super V> a;
        Object[] b;
        int c;
        boolean d;

        public a() {
            this(4);
        }

        a(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }

        private void a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, yu.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> a(K k, V v) {
            a(this.c + 1);
            yq.a(k, v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> a(Map.Entry<? extends K, ? extends V> entry) {
            return a(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                a(entry);
            }
            return this;
        }

        public yw<K, V> a() {
            b();
            this.d = true;
            return zk.a(this.c, this.b);
        }

        void b() {
            int i;
            if (this.a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, this.c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.c];
                int i2 = 0;
                while (true) {
                    i = this.c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, zh.a(this.a).a(zc.a()));
                for (int i4 = 0; i4 < this.c; i4++) {
                    int i5 = i4 * 2;
                    this.b[i5] = entryArr[i4].getKey();
                    this.b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }
    }

    public static <K, V> yw<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof yw) && !(map instanceof SortedMap)) {
            yw<K, V> ywVar = (yw) map;
            if (!ywVar.h()) {
                return ywVar;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> yw<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* renamed from: b */
    public yy<Map.Entry<K, V>> entrySet() {
        yy<Map.Entry<K, V>> yyVar = this.entrySet;
        if (yyVar == null) {
            yy<Map.Entry<K, V>> c = c();
            this.entrySet = c;
            return c;
        }
        return yyVar;
    }

    @Override // java.util.Map
    /* renamed from: d */
    public yy<K> keySet() {
        yy<K> yyVar = this.keySet;
        if (yyVar == null) {
            yy<K> e = e();
            this.keySet = e;
            return e;
        }
        return yyVar;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public yu<V> values() {
        yu<V> yuVar = this.values;
        if (yuVar == null) {
            yu<V> g = g();
            this.values = g;
            return g;
        }
        return yuVar;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return zc.a(this, obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zm.a(entrySet());
    }

    public String toString() {
        return zc.a(this);
    }
}
