package defpackage;
/* compiled from: AuthModel.java */
/* renamed from: apx  reason: default package */
/* loaded from: classes2.dex */
public class apx implements aqo {
    private aqo a;

    /* compiled from: AuthModel.java */
    /* renamed from: apx$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        boolean a(boolean z);
    }

    public static apx a() {
        return a.a;
    }

    /* compiled from: AuthModel.java */
    /* renamed from: apx$a */
    /* loaded from: classes2.dex */
    private static class a {
        private static apx a = new apx();
    }

    private apx() {
        this.a = new aqn();
    }

    public <T extends aqo> T b() {
        return (T) this.a;
    }

    @Override // defpackage.aqo
    public void c() {
        this.a.c();
    }

    @Override // defpackage.aqo
    public boolean d() {
        return this.a.d();
    }

    @Override // defpackage.aqo
    public void a(b bVar) {
        this.a.a(bVar);
    }

    @Override // defpackage.aqo
    public void b(b bVar) {
        this.a.b(bVar);
    }

    @Override // defpackage.aqo
    public boolean e() {
        return this.a.e();
    }

    @Override // defpackage.aqo
    public void f() {
        this.a.f();
    }
}
