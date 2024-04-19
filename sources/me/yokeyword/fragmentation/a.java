package me.yokeyword.fragmentation;
/* compiled from: Fragmentation.java */
/* loaded from: classes2.dex */
public class a {
    static volatile a a;
    private boolean b;
    private int c;
    private bje d;

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(new C0192a());
                }
            }
        }
        return a;
    }

    a(C0192a c0192a) {
        this.c = 2;
        this.b = c0192a.a;
        if (!this.b) {
            this.c = 0;
        } else {
            this.c = c0192a.b;
        }
        this.d = c0192a.c;
    }

    public bje b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public static C0192a d() {
        return new C0192a();
    }

    /* compiled from: Fragmentation.java */
    /* renamed from: me.yokeyword.fragmentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0192a {
        private boolean a;
        private int b;
        private bje c;

        public C0192a a(boolean z) {
            this.a = z;
            return this;
        }

        public C0192a a(int i) {
            this.b = i;
            return this;
        }

        public a a() {
            a.a = new a(this);
            return a.a;
        }
    }
}
