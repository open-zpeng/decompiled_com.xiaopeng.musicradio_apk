package defpackage;
/* compiled from: DisconnectedBufferOptions.java */
/* renamed from: bkg  reason: default package */
/* loaded from: classes3.dex */
public class bkg {
    private int a = 5000;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;

    public int a() {
        return this.a;
    }

    public void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        this.a = i;
    }

    public boolean b() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean c() {
        return this.c;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public boolean d() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }
}
