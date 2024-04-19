package defpackage;
/* compiled from: CurveFit.java */
/* renamed from: bx  reason: default package */
/* loaded from: classes3.dex */
public abstract class bx {
    public abstract double a(double d, int i);

    public abstract void a(double d, double[] dArr);

    public abstract void a(double d, float[] fArr);

    public abstract double[] a();

    public abstract void b(double d, double[] dArr);

    public static bx a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i == 2) {
                return new a(dArr[0], dArr2[0]);
            }
            return new cb(dArr, dArr2);
        }
        return new cc(dArr, dArr2);
    }

    public static bx a(int[] iArr, double[] dArr, double[][] dArr2) {
        return new bw(iArr, dArr, dArr2);
    }

    /* compiled from: CurveFit.java */
    /* renamed from: bx$a */
    /* loaded from: classes3.dex */
    static class a extends bx {
        double a;
        double[] b;

        a(double d, double[] dArr) {
            this.a = d;
            this.b = dArr;
        }

        @Override // defpackage.bx
        public void a(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // defpackage.bx
        public void a(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // defpackage.bx
        public double a(double d, int i) {
            return this.b[i];
        }

        @Override // defpackage.bx
        public void b(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // defpackage.bx
        public double[] a() {
            return new double[]{this.a};
        }
    }
}
