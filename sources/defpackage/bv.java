package defpackage;

import defpackage.bo;
import java.util.Arrays;
/* compiled from: SolverVariableValues.java */
/* renamed from: bv  reason: default package */
/* loaded from: classes3.dex */
public class bv implements bo.a {
    private static float j = 0.001f;
    int[] a;
    int[] b;
    int[] c;
    float[] d;
    int[] e;
    int[] f;
    int g;
    int h;
    protected final bp i;
    private final int k = -1;
    private int l = 16;
    private int m = 16;
    private final bo n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bv(bo boVar, bp bpVar) {
        int i = this.l;
        this.a = new int[i];
        this.b = new int[i];
        this.c = new int[i];
        this.d = new float[i];
        this.e = new int[i];
        this.f = new int[i];
        this.g = 0;
        this.h = -1;
        this.n = boVar;
        this.i = bpVar;
        a();
    }

    @Override // defpackage.bo.a
    public int c() {
        return this.g;
    }

    @Override // defpackage.bo.a
    public bu a(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.i.d[this.c[i3]];
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // defpackage.bo.a
    public float b(int i) {
        int i2 = this.g;
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.d[i3];
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // defpackage.bo.a
    public boolean a(bu buVar) {
        return c(buVar) != -1;
    }

    public int c(bu buVar) {
        if (this.g == 0 || buVar == null) {
            return -1;
        }
        int i = buVar.b;
        int i2 = this.a[i % this.m];
        if (i2 == -1) {
            return -1;
        }
        if (this.c[i2] == i) {
            return i2;
        }
        while (true) {
            int[] iArr = this.b;
            if (iArr[i2] == -1 || this.c[iArr[i2]] == i) {
                break;
            }
            i2 = iArr[i2];
        }
        int[] iArr2 = this.b;
        if (iArr2[i2] != -1 && this.c[iArr2[i2]] == i) {
            return iArr2[i2];
        }
        return -1;
    }

    @Override // defpackage.bo.a
    public float b(bu buVar) {
        int c = c(buVar);
        if (c != -1) {
            return this.d[c];
        }
        return 0.0f;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            bu a = a(i2);
            if (a != null) {
                String str2 = str + a + " = " + b(i2) + " ";
                int c = c(a);
                String str3 = str2 + "[p: ";
                String str4 = (this.e[c] != -1 ? str3 + this.i.d[this.c[this.e[c]]] : str3 + "none") + ", n: ";
                str = (this.f[c] != -1 ? str4 + this.i.d[this.c[this.f[c]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // defpackage.bo.a
    public void a() {
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            bu a = a(i2);
            if (a != null) {
                a.b(this.n);
            }
        }
        for (int i3 = 0; i3 < this.l; i3++) {
            this.c[i3] = -1;
            this.b[i3] = -1;
        }
        for (int i4 = 0; i4 < this.m; i4++) {
            this.a[i4] = -1;
        }
        this.g = 0;
        this.h = -1;
    }

    private void d() {
        int i = this.l * 2;
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
        this.e = Arrays.copyOf(this.e, i);
        this.f = Arrays.copyOf(this.f, i);
        this.b = Arrays.copyOf(this.b, i);
        for (int i2 = this.l; i2 < i; i2++) {
            this.c[i2] = -1;
            this.b[i2] = -1;
        }
        this.l = i;
    }

    private void a(bu buVar, int i) {
        int[] iArr;
        int i2 = buVar.b % this.m;
        int[] iArr2 = this.a;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.b;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.b[i] = -1;
    }

    private void d(bu buVar) {
        int i = buVar.b % this.m;
        int i2 = this.a[i];
        if (i2 == -1) {
            return;
        }
        int i3 = buVar.b;
        if (this.c[i2] == i3) {
            int[] iArr = this.a;
            int[] iArr2 = this.b;
            iArr[i] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        while (true) {
            int[] iArr3 = this.b;
            if (iArr3[i2] == -1 || this.c[iArr3[i2]] == i3) {
                break;
            }
            i2 = iArr3[i2];
        }
        int[] iArr4 = this.b;
        int i4 = iArr4[i2];
        if (i4 == -1 || this.c[i4] != i3) {
            return;
        }
        iArr4[i2] = iArr4[i4];
        iArr4[i4] = -1;
    }

    private void a(int i, bu buVar, float f) {
        this.c[i] = buVar.b;
        this.d[i] = f;
        this.e[i] = -1;
        this.f[i] = -1;
        buVar.a(this.n);
        buVar.l++;
        this.g++;
    }

    private int e() {
        for (int i = 0; i < this.l; i++) {
            if (this.c[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void b(int i, bu buVar, float f) {
        int e = e();
        a(e, buVar, f);
        if (i != -1) {
            this.e[e] = i;
            int[] iArr = this.f;
            iArr[e] = iArr[i];
            iArr[i] = e;
        } else {
            this.e[e] = -1;
            if (this.g > 0) {
                this.f[e] = this.h;
                this.h = e;
            } else {
                this.f[e] = -1;
            }
        }
        int[] iArr2 = this.f;
        if (iArr2[e] != -1) {
            this.e[iArr2[e]] = e;
        }
        a(buVar, e);
    }

    @Override // defpackage.bo.a
    public void a(bu buVar, float f) {
        float f2 = j;
        if (f > (-f2) && f < f2) {
            a(buVar, true);
            return;
        }
        if (this.g == 0) {
            a(0, buVar, f);
            a(buVar, 0);
            this.h = 0;
            return;
        }
        int c = c(buVar);
        if (c != -1) {
            this.d[c] = f;
            return;
        }
        if (this.g + 1 >= this.l) {
            d();
        }
        int i = this.g;
        int i2 = this.h;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.c[i2] == buVar.b) {
                this.d[i2] = f;
                return;
            }
            if (this.c[i2] < buVar.b) {
                i3 = i2;
            }
            i2 = this.f[i2];
            if (i2 == -1) {
                break;
            }
        }
        b(i3, buVar, f);
    }

    @Override // defpackage.bo.a
    public float a(bu buVar, boolean z) {
        int c = c(buVar);
        if (c == -1) {
            return 0.0f;
        }
        d(buVar);
        float f = this.d[c];
        if (this.h == c) {
            this.h = this.f[c];
        }
        this.c[c] = -1;
        int[] iArr = this.e;
        if (iArr[c] != -1) {
            int[] iArr2 = this.f;
            iArr2[iArr[c]] = iArr2[c];
        }
        int[] iArr3 = this.f;
        if (iArr3[c] != -1) {
            int[] iArr4 = this.e;
            iArr4[iArr3[c]] = iArr4[c];
        }
        this.g--;
        buVar.l--;
        if (z) {
            buVar.b(this.n);
        }
        return f;
    }

    @Override // defpackage.bo.a
    public void a(bu buVar, float f, boolean z) {
        float f2 = j;
        if (f <= (-f2) || f >= f2) {
            int c = c(buVar);
            if (c == -1) {
                a(buVar, f);
                return;
            }
            float[] fArr = this.d;
            fArr[c] = fArr[c] + f;
            float f3 = fArr[c];
            float f4 = j;
            if (f3 <= (-f4) || fArr[c] >= f4) {
                return;
            }
            fArr[c] = 0.0f;
            a(buVar, z);
        }
    }

    @Override // defpackage.bo.a
    public float a(bo boVar, boolean z) {
        float b = b(boVar.a);
        a(boVar.a, z);
        bv bvVar = (bv) boVar.e;
        int c = bvVar.c();
        int i = bvVar.h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < c) {
            if (bvVar.c[i3] != -1) {
                a(this.i.d[bvVar.c[i3]], bvVar.d[i3] * b, z);
                i2++;
            }
            i3++;
        }
        return b;
    }

    @Override // defpackage.bo.a
    public void b() {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // defpackage.bo.a
    public void a(float f) {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }
}
