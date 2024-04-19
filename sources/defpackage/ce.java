package defpackage;
/* compiled from: Schlick.java */
/* renamed from: ce  reason: default package */
/* loaded from: classes3.dex */
public class ce extends by {
    double d;
    double e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ce(String str) {
        this.b = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.e = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double c(double d) {
        double d2 = this.e;
        if (d < d2) {
            return (d2 * d) / (d + (this.d * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.d * (d2 - d)));
    }

    private double d(double d) {
        double d2 = this.e;
        if (d < d2) {
            double d3 = this.d;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.d;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    @Override // defpackage.by
    public double b(double d) {
        return d(d);
    }

    @Override // defpackage.by
    public double a(double d) {
        return c(d);
    }
}
