package defpackage;
/* compiled from: DataDirtyModelFactory.java */
/* renamed from: aia  reason: default package */
/* loaded from: classes2.dex */
public class aia {
    private ahx a;
    private aih b;
    private ail c;
    private aij d;

    /* compiled from: DataDirtyModelFactory.java */
    /* renamed from: aia$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aia a = new aia();
    }

    public static aia a() {
        return a.a;
    }

    private aia() {
        this.a = new ahx(false);
        this.b = new aih(false);
        this.c = new ail(false);
        this.d = new aij(false);
    }

    public com.xiaopeng.musicradio.datalist.a a(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.a;
        }
        return new ahx(true);
    }

    public com.xiaopeng.musicradio.datalist.a b(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.b;
        }
        return new aih(true);
    }

    public ail c(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.c;
        }
        return new ail(true);
    }

    public aij d(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.d;
        }
        return new aij(true);
    }

    public void b() {
        this.b.a(true, false, new Object[0]);
        this.a.a(true, false, new Object[0]);
        this.c.a(true, false, new Object[0]);
        this.d.a(true, false, new Object[0]);
    }
}
