package defpackage;
/* compiled from: MeanCalculator.java */
/* renamed from: sa  reason: default package */
/* loaded from: classes3.dex */
public class sa {
    private float a;
    private int b;

    public void a(float f) {
        this.a += f;
        this.b++;
        int i = this.b;
        if (i == Integer.MAX_VALUE) {
            this.a /= 2.0f;
            this.b = i / 2;
        }
    }
}
