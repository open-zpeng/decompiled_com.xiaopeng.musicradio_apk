package defpackage;
/* compiled from: CutCornerTreatment.java */
/* renamed from: xm  reason: default package */
/* loaded from: classes3.dex */
public class xm extends xl {
    float a = -1.0f;

    @Override // defpackage.xl
    public void a(xw xwVar, float f, float f2, float f3) {
        xwVar.a(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        xwVar.b((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
