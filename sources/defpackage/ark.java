package defpackage;
/* compiled from: GlobalMusicEvent.java */
/* renamed from: ark  reason: default package */
/* loaded from: classes2.dex */
public class ark {

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$b */
    /* loaded from: classes2.dex */
    public static class b {
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$c */
    /* loaded from: classes2.dex */
    public static class c {
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$d */
    /* loaded from: classes2.dex */
    public static class d {
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$f */
    /* loaded from: classes2.dex */
    public static class f {
        private boolean a;

        public f(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$e */
    /* loaded from: classes2.dex */
    public static class e {
        private boolean a;

        public boolean a() {
            return this.a;
        }
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final int a;
        public final boolean b;

        public a(int i) {
            this(i, false);
        }

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean a() {
            return this.b || this.a == 1;
        }

        public String toString() {
            return "CollectedAlbumFetched{type=" + this.a + ", forceUpdateView=" + this.b + '}';
        }
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$i */
    /* loaded from: classes2.dex */
    public static class i {
        public final int a;
        public final boolean b;

        public i(int i) {
            this(i, false);
        }

        public i(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean a() {
            return this.b || this.a != 0;
        }

        public String toString() {
            return "MobileCustomFetched{type=" + this.a + ", forceUpdateView=" + this.b + '}';
        }
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$h */
    /* loaded from: classes2.dex */
    public static class h {
        public final int a;
        public final boolean b;

        public boolean a() {
            return this.b || this.a == 1;
        }

        public String toString() {
            return "MobileAlbumFetched{type=" + this.a + ", forceUpdateView=" + this.b + '}';
        }
    }

    /* compiled from: GlobalMusicEvent.java */
    /* renamed from: ark$g */
    /* loaded from: classes2.dex */
    public static class g {
        private final Object a;

        public g(Object obj) {
            this.a = obj;
        }
    }
}
