package defpackage;
/* compiled from: LongSparseArray.java */
/* renamed from: bi  reason: default package */
/* loaded from: classes2.dex */
public class bi<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public bi() {
        this(10);
    }

    public bi(int i) {
        this.b = false;
        if (i == 0) {
            this.c = bh.b;
            this.d = bh.c;
            return;
        }
        int b = bh.b(i);
        this.c = new long[b];
        this.d = new Object[b];
    }

    /* renamed from: a */
    public bi<E> clone() {
        try {
            bi<E> biVar = (bi) super.clone();
            biVar.c = (long[]) this.c.clone();
            biVar.d = (Object[]) this.d.clone();
            return biVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E a(long j) {
        return a(j, null);
    }

    public E a(long j, E e) {
        int a2 = bh.a(this.c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != a) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public void b(long j) {
        int a2 = bh.a(this.c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a2];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.b = true;
            }
        }
    }

    public void a(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    private void e() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void b(long j, E e) {
        int a2 = bh.a(this.c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i = ~a2;
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == a) {
                this.c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.b && this.e >= this.c.length) {
            e();
            i = ~bh.a(this.c, this.e, j);
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int b = bh.b(i2 + 1);
            long[] jArr = new long[b];
            Object[] objArr2 = new Object[b];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    public int b() {
        if (this.b) {
            e();
        }
        return this.e;
    }

    public boolean c() {
        return b() == 0;
    }

    public long b(int i) {
        if (this.b) {
            e();
        }
        return this.c[i];
    }

    public E c(int i) {
        if (this.b) {
            e();
        }
        return (E) this.d[i];
    }

    public int c(long j) {
        if (this.b) {
            e();
        }
        return bh.a(this.c, this.e, j);
    }

    public void d() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public void c(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.c[i - 1]) {
            b(j, e);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            e();
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int b = bh.b(i2 + 1);
            long[] jArr = new long[b];
            Object[] objArr = new Object[b];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = jArr;
            this.d = objArr;
        }
        this.c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
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
