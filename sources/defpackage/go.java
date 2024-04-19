package defpackage;
/* compiled from: Pools.java */
/* renamed from: go  reason: default package */
/* loaded from: classes3.dex */
public final class go {

    /* compiled from: Pools.java */
    /* renamed from: go$a */
    /* loaded from: classes3.dex */
    public interface a<T> {
        T acquire();

        boolean release(T t);
    }

    /* compiled from: Pools.java */
    /* renamed from: go$b */
    /* loaded from: classes3.dex */
    public static class b<T> implements a<T> {
        private final Object[] a;
        private int b;

        public b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.a = new Object[i];
        }

        @Override // defpackage.go.a
        public T acquire() {
            int i = this.b;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.a;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.b = i - 1;
                return t;
            }
            return null;
        }

        @Override // defpackage.go.a
        public boolean release(T t) {
            if (a(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i = this.b;
            Object[] objArr = this.a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.b = i + 1;
                return true;
            }
            return false;
        }

        private boolean a(T t) {
            for (int i = 0; i < this.b; i++) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Pools.java */
    /* renamed from: go$c */
    /* loaded from: classes3.dex */
    public static class c<T> extends b<T> {
        private final Object a;

        public c(int i) {
            super(i);
            this.a = new Object();
        }

        @Override // defpackage.go.b, defpackage.go.a
        public T acquire() {
            T t;
            synchronized (this.a) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // defpackage.go.b, defpackage.go.a
        public boolean release(T t) {
            boolean release;
            synchronized (this.a) {
                release = super.release(t);
            }
            return release;
        }
    }
}
