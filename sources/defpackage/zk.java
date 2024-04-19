package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableMap.java */
/* renamed from: zk  reason: default package */
/* loaded from: classes3.dex */
public final class zk<K, V> extends yw<K, V> {
    private static final int ABSENT = -1;
    static final yw<Object, Object> b = new zk(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    private final transient int[] hashTable;
    private final transient int size;

    @Override // defpackage.yw
    boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> zk<K, V> a(int i, Object[] objArr) {
        if (i == 0) {
            return (zk) b;
        }
        if (i == 1) {
            yq.a(objArr[0], objArr[1]);
            return new zk<>(null, objArr, 1);
        }
        yj.b(i, objArr.length >> 1);
        return new zk<>(a(objArr, i, yy.a(i), 0), objArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            defpackage.yq.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L79
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            defpackage.yq.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = defpackage.yt.a(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = " and "
            r12.append(r13)
            r13 = r10[r8]
            r12.append(r13)
            java.lang.String r13 = "="
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L79:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk.a(java.lang.Object[], int, int, int):int[]");
    }

    private zk(int[] iArr, Object[] objArr, int i) {
        this.hashTable = iArr;
        this.c = objArr;
        this.size = i;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // defpackage.yw, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) a(this.hashTable, this.c, this.size, 0, obj);
    }

    static Object a(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = yt.a(obj.hashCode());
            while (true) {
                int i3 = a2 & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a2 = i3 + 1;
            }
        }
    }

    @Override // defpackage.yw
    yy<Map.Entry<K, V>> c() {
        return new a(this, this.c, 0, this.size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegularImmutableMap.java */
    /* renamed from: zk$a */
    /* loaded from: classes3.dex */
    public static class a<K, V> extends yy<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient yw<K, V> map;
        private final transient int size;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.yu
        public boolean f() {
            return true;
        }

        a(yw<K, V> ywVar, Object[] objArr, int i, int i2) {
            this.map = ywVar;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i;
            this.size = i2;
        }

        @Override // defpackage.yy, defpackage.yu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: a */
        public zo<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        @Override // defpackage.yu
        int a(Object[] objArr, int i) {
            return e().a(objArr, i);
        }

        @Override // defpackage.yy
        yv<Map.Entry<K, V>> h() {
            return new yv<Map.Entry<K, V>>() { // from class: zk.a.1
                @Override // defpackage.yu
                public boolean f() {
                    return true;
                }

                @Override // java.util.List
                /* renamed from: b */
                public Map.Entry<K, V> get(int i) {
                    yj.a(i, a.this.size);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(a.this.alternatingKeysAndValues[a.this.keyOffset + i2], a.this.alternatingKeysAndValues[i2 + (a.this.keyOffset ^ 1)]);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return a.this.size;
                }
            };
        }

        @Override // defpackage.yu, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.map.get(key));
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }
    }

    @Override // defpackage.yw
    yy<K> e() {
        return new b(this, new c(this.c, 0, this.size));
    }

    /* compiled from: RegularImmutableMap.java */
    /* renamed from: zk$c */
    /* loaded from: classes3.dex */
    static final class c extends yv<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.yu
        public boolean f() {
            return true;
        }

        c(Object[] objArr, int i, int i2) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i;
            this.size = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            yj.a(i, this.size);
            return this.alternatingKeysAndValues[(i * 2) + this.offset];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* renamed from: zk$b */
    /* loaded from: classes3.dex */
    static final class b<K> extends yy<K> {
        private final transient yv<K> list;
        private final transient yw<K, ?> map;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.yu
        public boolean f() {
            return true;
        }

        b(yw<K, ?> ywVar, yv<K> yvVar) {
            this.map = ywVar;
            this.list = yvVar;
        }

        @Override // defpackage.yy, defpackage.yu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: a */
        public zo<K> iterator() {
            return e().iterator();
        }

        @Override // defpackage.yu
        int a(Object[] objArr, int i) {
            return e().a(objArr, i);
        }

        @Override // defpackage.yy, defpackage.yu
        public yv<K> e() {
            return this.list;
        }

        @Override // defpackage.yu, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }
    }

    @Override // defpackage.yw
    yu<V> g() {
        return new c(this.c, 1, this.size);
    }
}
