package defpackage;
/* compiled from: DataDirtyModelFactory.java */
/* renamed from: alr  reason: default package */
/* loaded from: classes2.dex */
public class alr {
    private aln a;
    private alv b;
    private aly c;

    /* compiled from: DataDirtyModelFactory.java */
    /* renamed from: alr$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final alr a = new alr();
    }

    public static alr a() {
        return a.a;
    }

    private alr() {
        this.a = new aln(false);
        this.b = new alv(false);
        this.c = new aly(false);
    }

    public com.xiaopeng.musicradio.datalist.a a(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.a;
        }
        return new aln(true);
    }

    public com.xiaopeng.musicradio.datalist.a b(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.b;
        }
        return new alv(true);
    }

    public aly c(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.c;
        }
        return new aly(true);
    }
}
