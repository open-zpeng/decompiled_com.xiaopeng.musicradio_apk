package defpackage;
/* renamed from: bor  reason: default package */
/* loaded from: classes3.dex */
final class bor {
    private int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(bor borVar) {
        this.a = borVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        int i = this.a;
        this.a = i <= 3 ? 0 : i <= 9 ? i - 3 : i - 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.a = this.a >= 7 ? 10 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.a = this.a < 7 ? 8 : 11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.a = this.a < 7 ? 9 : 11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.a < 7;
    }
}
