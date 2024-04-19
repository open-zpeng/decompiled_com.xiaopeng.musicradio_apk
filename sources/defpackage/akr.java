package defpackage;
/* compiled from: DataDirtyModelFactory.java */
/* renamed from: akr  reason: default package */
/* loaded from: classes2.dex */
public class akr {
    private akp a;
    private aky b;
    private alc c;
    private ala d;

    /* compiled from: DataDirtyModelFactory.java */
    /* renamed from: akr$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final akr a = new akr();
    }

    public static akr a() {
        return a.a;
    }

    private akr() {
        this.a = new akp(false);
        this.b = new aky(false);
        this.c = new alc(false);
        this.d = new ala(false);
    }

    public com.xiaopeng.musicradio.datalist.a a(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.a;
        }
        return new akp(true);
    }

    public com.xiaopeng.musicradio.datalist.a b(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.b;
        }
        return new aky(true);
    }

    public alc c(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.c;
        }
        return new alc(true);
    }

    public ala d(String str) {
        if ("FROM_MAIN".equals(str)) {
            return this.d;
        }
        return new ala(true);
    }

    public void b() {
        this.b.a(true, false, new Object[0]);
        this.a.a(true, false, new Object[0]);
        this.c.a(true, false, new Object[0]);
        this.d.a(true, false, new Object[0]);
    }
}
