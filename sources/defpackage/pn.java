package defpackage;
/* compiled from: GradientColor.java */
/* renamed from: pn  reason: default package */
/* loaded from: classes3.dex */
public class pn {
    private final float[] a;
    private final int[] b;

    public pn(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public float[] a() {
        return this.a;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.b.length;
    }

    public void a(pn pnVar, pn pnVar2, float f) {
        if (pnVar.b.length != pnVar2.b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + pnVar.b.length + " vs " + pnVar2.b.length + ")");
        }
        for (int i = 0; i < pnVar.b.length; i++) {
            this.a[i] = sb.a(pnVar.a[i], pnVar2.a[i], f);
            this.b[i] = ry.a(f, pnVar.b[i], pnVar2.b[i]);
        }
    }
}
