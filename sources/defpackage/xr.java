package defpackage;
/* compiled from: OffsetEdgeTreatment.java */
/* renamed from: xr  reason: default package */
/* loaded from: classes3.dex */
public final class xr extends xn {
    private final xn a;
    private final float b;

    public xr(xn xnVar, float f) {
        this.a = xnVar;
        this.b = f;
    }

    @Override // defpackage.xn
    public void a(float f, float f2, float f3, xw xwVar) {
        this.a.a(f, f2 - this.b, f3, xwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.xn
    public boolean e() {
        return this.a.e();
    }
}
