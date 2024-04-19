package defpackage;
/* compiled from: SparseArrayCompat.java */
/* renamed from: bm  reason: default package */
/* loaded from: classes3.dex */
public class bm<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public bm() {
        this(10);
    }

    public bm(int i) {
        this.b = false;
        if (i == 0) {
            this.c = bh.a;
            this.d = bh.c;
            return;
        }
        int a2 = bh.a(i);
        this.c = new int[a2];
        this.d = new Object[a2];
    }

    /* renamed from: a */
    public bm<E> clone() {
        try {
            bm<E> bmVar = (bm) super.clone();
            bmVar.c = (int[]) this.c.clone();
            bmVar.d = (Object[]) this.d.clone();
            return bmVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E a(int i) {
        return a(i, null);
    }

    public E a(int i, E e) {
        int a2 = bh.a(this.c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != a) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void b(int i, E e) {
        int a2 = bh.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == a) {
                this.c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.b && this.e >= this.c.length) {
            d();
            i2 = ~bh.a(this.c, this.e, i);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int a3 = bh.a(i3 + 1);
            int[] iArr = new int[a3];
            Object[] objArr2 = new Object[a3];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public int b() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public int b(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public E c(int i) {
        if (this.b) {
            d();
        }
        return (E) this.d[i];
    }

    public int a(E e) {
        if (this.b) {
            d();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public void c(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.c[i2 - 1]) {
            b(i, e);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            d();
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int a2 = bh.a(i3 + 1);
            int[] iArr = new int[a2];
            Object[] objArr = new Object[a2];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
            sb.append('=');
            E c = c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
