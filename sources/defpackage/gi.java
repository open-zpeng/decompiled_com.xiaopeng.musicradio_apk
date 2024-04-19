package defpackage;

import java.util.Locale;
/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: gi  reason: default package */
/* loaded from: classes3.dex */
public final class gi {
    public static final gh a = new e(null, false);
    public static final gh b = new e(null, true);
    public static final gh c = new e(b.a, false);
    public static final gh d = new e(b.a, true);
    public static final gh e = new e(a.a, false);
    public static final gh f = f.a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: gi$c */
    /* loaded from: classes3.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                switch (i) {
                    case 14:
                    case 15:
                        return 1;
                    case 16:
                    case 17:
                        return 0;
                    default:
                        return 2;
                }
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: gi$d */
    /* loaded from: classes3.dex */
    private static abstract class d implements gh {
        private final c a;

        protected abstract boolean a();

        d(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.gh
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            if (this.a == null) {
                return a();
            }
            return b(charSequence, i, i2);
        }

        private boolean b(CharSequence charSequence, int i, int i2) {
            switch (this.a.a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return a();
            }
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: gi$e */
    /* loaded from: classes3.dex */
    private static class e extends d {
        private final boolean a;

        e(c cVar, boolean z) {
            super(cVar);
            this.a = z;
        }

        @Override // defpackage.gi.d
        protected boolean a() {
            return this.a;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: gi$b */
    /* loaded from: classes3.dex */
    private static class b implements c {
        static final b a = new b();

        @Override // defpackage.gi.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = gi.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }

        private b() {
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: gi$a */
    /* loaded from: classes3.dex */
    private static class a implements c {
        static final a a = new a(true);
        private final boolean b;

        @Override // defpackage.gi.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                switch (gi.a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (!this.b) {
                            z = true;
                            break;
                        } else {
                            return 0;
                        }
                    case 1:
                        if (this.b) {
                            z = true;
                            break;
                        } else {
                            return 1;
                        }
                }
                i++;
                z = z;
            }
            if (z) {
                return this.b ? 1 : 0;
            }
            return 2;
        }

        private a(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: gi$f */
    /* loaded from: classes3.dex */
    private static class f extends d {
        static final f a = new f();

        f() {
            super(null);
        }

        @Override // defpackage.gi.d
        protected boolean a() {
            return gj.a(Locale.getDefault()) == 1;
        }
    }
}
