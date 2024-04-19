package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import defpackage.yu;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: ImmutableList.java */
/* renamed from: yv  reason: default package */
/* loaded from: classes3.dex */
public abstract class yv<E> extends yu<E> implements List<E>, RandomAccess {
    private static final zp<Object> EMPTY_ITR = new b(zj.a, 0);

    @Override // defpackage.yu
    public final yv<E> e() {
        return this;
    }

    public static <E> yv<E> g() {
        return (yv<E>) zj.a;
    }

    public static <E> yv<E> a(E e) {
        return c(e);
    }

    public static <E> yv<E> a(E e, E e2) {
        return c(e, e2);
    }

    public static <E> yv<E> a(Collection<? extends E> collection) {
        if (collection instanceof yu) {
            yv<E> e = ((yu) collection).e();
            return e.f() ? b(e.toArray()) : e;
        }
        return c(collection.toArray());
    }

    public static <E> yv<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return g();
        }
        return c((Object[]) eArr.clone());
    }

    private static <E> yv<E> c(Object... objArr) {
        return b(zg.a(objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> yv<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> yv<E> b(Object[] objArr, int i) {
        if (i == 0) {
            return g();
        }
        return new zj(objArr, i);
    }

    @Override // defpackage.yu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public zo<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: h */
    public zp<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: a */
    public zp<E> listIterator(int i) {
        yj.b(i, size());
        if (isEmpty()) {
            return (zp<E>) EMPTY_ITR;
        }
        return new b(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* renamed from: yv$b */
    /* loaded from: classes3.dex */
    public static class b<E> extends ym<E> {
        private final yv<E> a;

        b(yv<E> yvVar, int i) {
            super(yvVar.size(), i);
            this.a = yvVar;
        }

        @Override // defpackage.ym
        protected E a(int i) {
            return this.a.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return zb.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return zb.c(this, obj);
    }

    @Override // defpackage.yu, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: a */
    public yv<E> subList(int i, int i2) {
        yj.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return g();
        }
        return b(i, i2);
    }

    yv<E> b(int i, int i2) {
        return new c(i, i2 - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* renamed from: yv$c */
    /* loaded from: classes3.dex */
    public class c extends yv<E> {
        final transient int a;
        final transient int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.yu
        public boolean f() {
            return true;
        }

        @Override // defpackage.yv, defpackage.yu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // defpackage.yv, java.util.List
        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // defpackage.yv, java.util.List
        public /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.yu
        public Object[] b() {
            return yv.this.b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.yu
        public int c() {
            return yv.this.c() + this.a;
        }

        @Override // defpackage.yu
        int d() {
            return yv.this.c() + this.a + this.b;
        }

        @Override // java.util.List
        public E get(int i) {
            yj.a(i, this.b);
            return yv.this.get(i + this.a);
        }

        @Override // defpackage.yv, java.util.List
        /* renamed from: a */
        public yv<E> subList(int i, int i2) {
            yj.a(i, i2, this.b);
            yv yvVar = yv.this;
            int i3 = this.a;
            return yvVar.subList(i + i3, i2 + i3);
        }
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yu
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return zb.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public static <E> a<E> i() {
        return new a<>();
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: yv$a */
    /* loaded from: classes3.dex */
    public static final class a<E> extends yu.a<E> {
        public a() {
            this(4);
        }

        a(int i) {
            super(i);
        }

        @Override // defpackage.yu.a
        @CanIgnoreReturnValue
        /* renamed from: b */
        public a<E> a(E e) {
            super.a((a<E>) e);
            return this;
        }

        public yv<E> a() {
            this.c = true;
            return yv.b(this.a, this.b);
        }
    }
}
