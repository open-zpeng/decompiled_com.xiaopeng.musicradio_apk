package defpackage;
/* compiled from: DocumentData.java */
/* renamed from: oq  reason: default package */
/* loaded from: classes3.dex */
public class oq {
    public final String a;
    public final String b;
    public final double c;
    final int d;
    public final int e;
    final double f;
    public final double g;
    public final int h;
    public final int i;
    public final double j;
    public final boolean k;

    public oq(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, double d4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = i;
        this.e = i2;
        this.f = d2;
        this.g = d3;
        this.h = i3;
        this.i = i4;
        this.j = d4;
        this.k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c)) * 31) + this.d) * 31) + this.e;
        long doubleToLongBits = Double.doubleToLongBits(this.f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.h;
    }
}
