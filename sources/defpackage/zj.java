package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableList.java */
/* renamed from: zj  reason: default package */
/* loaded from: classes3.dex */
public class zj<E> extends yv<E> {
    static final yv<Object> a = new zj(new Object[0], 0);
    final transient Object[] b;
    private final transient int size;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yu
    public int c() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yu
    public boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zj(Object[] objArr, int i) {
        this.b = objArr;
        this.size = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yu
    public Object[] b() {
        return this.b;
    }

    @Override // defpackage.yu
    int d() {
        return this.size;
    }

    @Override // defpackage.yv, defpackage.yu
    int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public E get(int i) {
        yj.a(i, this.size);
        return (E) this.b[i];
    }
}
