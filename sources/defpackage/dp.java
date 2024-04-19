package defpackage;
/* compiled from: StopLogic.java */
/* renamed from: dp  reason: default package */
/* loaded from: classes3.dex */
public class dp extends ej {
    private cg b;
    private cj a = new cj();
    private ci c = this.a;

    public void a(float f, float f2, float f3, float f4, float f5, float f6) {
        cj cjVar = this.a;
        this.c = cjVar;
        cjVar.a(f, f2, f3, f4, f5, f6);
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.b == null) {
            this.b = new cg();
        }
        cg cgVar = this.b;
        this.c = cgVar;
        cgVar.a(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.c.a(f);
    }

    @Override // defpackage.ej
    public float a() {
        return this.c.a();
    }

    public boolean b() {
        return this.c.b();
    }
}
