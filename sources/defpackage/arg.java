package defpackage;
/* compiled from: BtMusicServiceBean.java */
/* renamed from: arg  reason: default package */
/* loaded from: classes2.dex */
public class arg {
    private String a;
    private String b = "";
    private String c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.c = str;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public boolean e() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public void d(String str) {
        this.f = str;
    }

    public String f() {
        return this.g;
    }

    public String toString() {
        return String.format("{song:%s, singer:%s,logo:%s, uuid:%s}", this.a, this.b, this.c, this.g);
    }

    public void e(String str) {
        this.g = str;
    }
}
