package defpackage;
/* compiled from: MarkerEdgeTreatment.java */
/* renamed from: xo  reason: default package */
/* loaded from: classes3.dex */
public final class xo extends xn {
    private final float a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.xn
    public boolean e() {
        return true;
    }

    public xo(float f) {
        this.a = f - 0.001f;
    }

    @Override // defpackage.xn
    public void a(float f, float f2, float f3, xw xwVar) {
        float sqrt = (float) ((this.a * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.a, 2.0d) - Math.pow(sqrt, 2.0d));
        xwVar.a(f2 - sqrt, ((float) (-((this.a * Math.sqrt(2.0d)) - this.a))) + sqrt2);
        xwVar.b(f2, (float) (-((this.a * Math.sqrt(2.0d)) - this.a)));
        xwVar.b(f2 + sqrt, ((float) (-((this.a * Math.sqrt(2.0d)) - this.a))) + sqrt2);
    }
}
