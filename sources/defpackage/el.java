package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MotionPaths.java */
/* renamed from: el  reason: default package */
/* loaded from: classes3.dex */
public class el implements Comparable<el> {
    static String[] a = {"position", "x", "y", "width", "height", "pathRotate"};
    by b;
    int c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;
    int l;
    int m;
    float n;
    eg o;
    LinkedHashMap<String, a> p;
    int q;
    int r;
    double[] s;
    double[] t;

    private static final float a(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float b(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    public el() {
        this.c = 0;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = dx.a;
        this.m = dx.a;
        this.n = Float.NaN;
        this.o = null;
        this.p = new LinkedHashMap<>();
        this.q = 0;
        this.s = new double[18];
        this.t = new double[18];
    }

    void a(eb ebVar, el elVar, el elVar2) {
        float f = ebVar.b / 100.0f;
        this.d = f;
        this.c = ebVar.i;
        float f2 = Float.isNaN(ebVar.j) ? f : ebVar.j;
        float f3 = Float.isNaN(ebVar.k) ? f : ebVar.k;
        float f4 = elVar2.h;
        float f5 = elVar.h;
        float f6 = elVar2.i;
        float f7 = elVar.i;
        this.e = this.d;
        float f8 = elVar.f;
        float f9 = elVar.g;
        float f10 = (elVar2.f + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (elVar2.g + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f = (int) ((f8 + (f10 * f)) - f13);
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.g = (int) ((f9 + (f11 * f)) - f15);
        this.h = (int) (f5 + f12);
        this.i = (int) (f7 + f14);
        float f16 = Float.isNaN(ebVar.l) ? f : ebVar.l;
        float f17 = Float.isNaN(ebVar.o) ? 0.0f : ebVar.o;
        if (!Float.isNaN(ebVar.m)) {
            f = ebVar.m;
        }
        float f18 = Float.isNaN(ebVar.n) ? 0.0f : ebVar.n;
        this.q = 0;
        this.f = (int) (((elVar.f + (f16 * f10)) + (f18 * f11)) - f13);
        this.g = (int) (((elVar.g + (f10 * f17)) + (f11 * f)) - f15);
        this.b = by.a(ebVar.g);
        this.l = ebVar.h;
    }

    public el(int i, int i2, eb ebVar, el elVar, el elVar2) {
        this.c = 0;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = dx.a;
        this.m = dx.a;
        this.n = Float.NaN;
        this.o = null;
        this.p = new LinkedHashMap<>();
        this.q = 0;
        this.s = new double[18];
        this.t = new double[18];
        if (elVar.m != dx.a) {
            a(i, i2, ebVar, elVar, elVar2);
            return;
        }
        switch (ebVar.p) {
            case 1:
                b(ebVar, elVar, elVar2);
                return;
            case 2:
                b(i, i2, ebVar, elVar, elVar2);
                return;
            default:
                a(ebVar, elVar, elVar2);
                return;
        }
    }

    void a(int i, int i2, eb ebVar, el elVar, el elVar2) {
        float min;
        float f;
        float f2 = ebVar.b / 100.0f;
        this.d = f2;
        this.c = ebVar.i;
        this.q = ebVar.p;
        float f3 = Float.isNaN(ebVar.j) ? f2 : ebVar.j;
        float f4 = Float.isNaN(ebVar.k) ? f2 : ebVar.k;
        float f5 = elVar2.h;
        float f6 = elVar.h;
        float f7 = elVar2.i;
        float f8 = elVar.i;
        this.e = this.d;
        this.h = (int) (f6 + ((f5 - f6) * f3));
        this.i = (int) (f8 + ((f7 - f8) * f4));
        switch (ebVar.p) {
            case 1:
                float f9 = Float.isNaN(ebVar.l) ? f2 : ebVar.l;
                float f10 = elVar2.f;
                float f11 = elVar.f;
                this.f = (f9 * (f10 - f11)) + f11;
                if (!Float.isNaN(ebVar.m)) {
                    f2 = ebVar.m;
                }
                float f12 = elVar2.g;
                float f13 = elVar.g;
                this.g = (f2 * (f12 - f13)) + f13;
                break;
            case 2:
                if (Float.isNaN(ebVar.l)) {
                    float f14 = elVar2.f;
                    float f15 = elVar.f;
                    min = ((f14 - f15) * f2) + f15;
                } else {
                    min = Math.min(f4, f3) * ebVar.l;
                }
                this.f = min;
                if (Float.isNaN(ebVar.m)) {
                    float f16 = elVar2.g;
                    float f17 = elVar.g;
                    f = (f2 * (f16 - f17)) + f17;
                } else {
                    f = ebVar.m;
                }
                this.g = f;
                break;
            default:
                float f18 = Float.isNaN(ebVar.l) ? f2 : ebVar.l;
                float f19 = elVar2.f;
                float f20 = elVar.f;
                this.f = (f18 * (f19 - f20)) + f20;
                if (!Float.isNaN(ebVar.m)) {
                    f2 = ebVar.m;
                }
                float f21 = elVar2.g;
                float f22 = elVar.g;
                this.g = (f2 * (f21 - f22)) + f22;
                break;
        }
        this.m = elVar.m;
        this.b = by.a(ebVar.g);
        this.l = ebVar.h;
    }

    public void a(eg egVar, el elVar) {
        double d = ((this.f + (this.h / 2.0f)) - elVar.f) - (elVar.h / 2.0f);
        double d2 = ((this.g + (this.i / 2.0f)) - elVar.g) - (elVar.i / 2.0f);
        this.o = egVar;
        this.f = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.n)) {
            this.g = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.g = (float) Math.toRadians(this.n);
        }
    }

    void b(int i, int i2, eb ebVar, el elVar, el elVar2) {
        float f = ebVar.b / 100.0f;
        this.d = f;
        this.c = ebVar.i;
        float f2 = Float.isNaN(ebVar.j) ? f : ebVar.j;
        float f3 = Float.isNaN(ebVar.k) ? f : ebVar.k;
        float f4 = elVar2.h;
        float f5 = elVar.h;
        float f6 = elVar2.i;
        float f7 = elVar.i;
        this.e = this.d;
        float f8 = elVar.f;
        float f9 = elVar.g;
        float f10 = elVar2.f + (f4 / 2.0f);
        float f11 = elVar2.g + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.g = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.h = (int) (f5 + f12);
        this.i = (int) (f7 + f13);
        this.q = 2;
        if (!Float.isNaN(ebVar.l)) {
            this.f = (int) (ebVar.l * ((int) (i - this.h)));
        }
        if (!Float.isNaN(ebVar.m)) {
            this.g = (int) (ebVar.m * ((int) (i2 - this.i)));
        }
        this.m = this.m;
        this.b = by.a(ebVar.g);
        this.l = ebVar.h;
    }

    void b(eb ebVar, el elVar, el elVar2) {
        float f;
        float f2;
        float f3 = ebVar.b / 100.0f;
        this.d = f3;
        this.c = ebVar.i;
        float f4 = Float.isNaN(ebVar.j) ? f3 : ebVar.j;
        float f5 = Float.isNaN(ebVar.k) ? f3 : ebVar.k;
        float f6 = elVar2.h - elVar.h;
        float f7 = elVar2.i - elVar.i;
        this.e = this.d;
        if (!Float.isNaN(ebVar.l)) {
            f3 = ebVar.l;
        }
        float f8 = elVar.f;
        float f9 = elVar.h;
        float f10 = elVar.g;
        float f11 = elVar.i;
        float f12 = (elVar2.f + (elVar2.h / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = (elVar2.g + (elVar2.i / 2.0f)) - ((f11 / 2.0f) + f10);
        float f14 = f12 * f3;
        float f15 = (f6 * f4) / 2.0f;
        this.f = (int) ((f8 + f14) - f15);
        float f16 = f3 * f13;
        float f17 = (f7 * f5) / 2.0f;
        this.g = (int) ((f10 + f16) - f17);
        this.h = (int) (f9 + f);
        this.i = (int) (f11 + f2);
        float f18 = Float.isNaN(ebVar.m) ? 0.0f : ebVar.m;
        this.q = 1;
        this.f = (int) ((elVar.f + f14) - f15);
        this.g = (int) ((elVar.g + f16) - f17);
        this.f += (-f13) * f18;
        this.g += f12 * f18;
        this.m = this.m;
        this.b = by.a(ebVar.g);
        this.l = ebVar.h;
    }

    private boolean a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(el elVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean a2 = a(this.f, elVar.f);
        boolean a3 = a(this.g, elVar.g);
        zArr[0] = zArr[0] | a(this.e, elVar.e);
        boolean z2 = a2 | a3 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | a(this.h, elVar.h);
        zArr[4] = a(this.i, elVar.i) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = this.i;
        float f6 = f4;
        float f7 = f3;
        float f8 = f2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f9 = (float) dArr[i2];
            switch (iArr[i2]) {
                case 1:
                    f8 = f9;
                    break;
                case 2:
                    f7 = f9;
                    break;
                case 3:
                    f6 = f9;
                    break;
                case 4:
                    f5 = f9;
                    break;
            }
        }
        eg egVar = this.o;
        if (egVar != null) {
            float[] fArr2 = new float[2];
            egVar.a(d, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d2 = f8;
            double d3 = f7;
            f = (float) ((f10 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            f7 = (float) ((f11 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
        } else {
            f = f8;
        }
        fArr[i] = f + (f6 / 2.0f) + 0.0f;
        fArr[i + 1] = f7 + (f5 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f;
        float f3 = f2;
        float f4 = this.g;
        float f5 = this.h;
        float f6 = this.i;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f11 = (float) dArr[i];
            float f12 = (float) dArr2[i];
            switch (iArr[i]) {
                case 1:
                    f3 = f11;
                    f7 = f12;
                    break;
                case 2:
                    f4 = f11;
                    f9 = f12;
                    break;
                case 3:
                    f5 = f11;
                    f8 = f12;
                    break;
                case 4:
                    f6 = f11;
                    f10 = f12;
                    break;
            }
        }
        float f13 = (f8 / 2.0f) + f7;
        float f14 = (f10 / 2.0f) + f9;
        eg egVar = this.o;
        if (egVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            egVar.a(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float sin = (float) ((f15 + (Math.sin(d3) * d2)) - (f5 / 2.0f));
            float cos = (float) ((f16 - (d2 * Math.cos(d3))) - (f6 / 2.0f));
            double d4 = f7;
            double d5 = f9;
            float sin2 = (float) (f17 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((f18 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f4 = cos;
            f3 = sin;
            f13 = sin2;
            f = 2.0f;
        } else {
            f = 2.0f;
        }
        fArr[0] = f3 + (f5 / f) + 0.0f;
        fArr[1] = f4 + (f6 / f) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        View view2 = view;
        float f3 = this.f;
        float f4 = this.g;
        float f5 = this.h;
        float f6 = this.i;
        if (iArr.length != 0 && this.s.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.s = new double[i];
            this.t = new double[i];
        }
        Arrays.fill(this.s, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.s[iArr[i2]] = dArr[i2];
            this.t[iArr[i2]] = dArr2[i2];
        }
        float f7 = Float.NaN;
        float f8 = f5;
        float f9 = f6;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = f4;
        float f15 = f3;
        int i3 = 0;
        while (true) {
            double[] dArr4 = this.s;
            if (i3 < dArr4.length) {
                if (!Double.isNaN(dArr4[i3]) || (dArr3 != null && dArr3[i3] != 0.0d)) {
                    double d = dArr3 != null ? dArr3[i3] : 0.0d;
                    if (!Double.isNaN(this.s[i3])) {
                        d = this.s[i3] + d;
                    }
                    float f16 = (float) d;
                    float f17 = (float) this.t[i3];
                    switch (i3) {
                        case 1:
                            f10 = f17;
                            f15 = f16;
                            continue;
                        case 2:
                            f11 = f17;
                            f14 = f16;
                            continue;
                        case 3:
                            f12 = f17;
                            f8 = f16;
                            continue;
                        case 4:
                            f13 = f17;
                            f9 = f16;
                            continue;
                        case 5:
                            f7 = f16;
                            continue;
                    }
                }
                i3++;
            } else {
                eg egVar = this.o;
                if (egVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    egVar.a(f, fArr, fArr2);
                    float f18 = fArr[0];
                    float f19 = fArr[1];
                    float f20 = fArr2[0];
                    float f21 = fArr2[1];
                    double d2 = f15;
                    double d3 = f14;
                    float sin = (float) ((f18 + (Math.sin(d3) * d2)) - (f8 / 2.0f));
                    double d4 = f20;
                    f2 = (float) ((f19 - (Math.cos(d3) * d2)) - (f9 / 2.0f));
                    double d5 = f10;
                    double d6 = f11;
                    float sin2 = (float) (d4 + (Math.sin(d3) * d5) + (Math.cos(d3) * d2 * d6));
                    float cos = (float) ((f21 - (d5 * Math.cos(d3))) + (d2 * Math.sin(d3) * d6));
                    if (dArr2.length >= 2) {
                        dArr2[0] = sin2;
                        dArr2[1] = cos;
                    }
                    if (Float.isNaN(f7)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (f7 + Math.toDegrees(Math.atan2(cos, sin2))));
                    }
                    f15 = sin;
                } else {
                    if (!Float.isNaN(f7)) {
                        view2.setRotation((float) (0.0f + f7 + Math.toDegrees(Math.atan2(f11 + (f13 / 2.0f), f10 + (f12 / 2.0f)))));
                    }
                    f2 = f14;
                }
                if (view2 instanceof dw) {
                    ((dw) view2).a(f15, f2, f8 + f15, f9 + f2);
                    return;
                }
                float f22 = f15 + 0.5f;
                int i4 = (int) f22;
                float f23 = f2 + 0.5f;
                int i5 = (int) f23;
                int i6 = (int) (f22 + f8);
                int i7 = (int) (f23 + f9);
                int i8 = i6 - i4;
                int i9 = i7 - i5;
                if ((i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight()) ? false : true) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                }
                view2.layout(i4, i5, i6, i7);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = this.i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            switch (iArr[i2]) {
                case 1:
                    f = f5;
                    break;
                case 2:
                    f2 = f5;
                    break;
                case 3:
                    f3 = f5;
                    break;
                case 4:
                    f4 = f5;
                    break;
            }
        }
        eg egVar = this.o;
        if (egVar != null) {
            float d = egVar.d();
            double d2 = f;
            double d3 = f2;
            f2 = (float) ((this.o.e() - (d2 * Math.cos(d3))) - (f4 / 2.0f));
            f = (float) ((d + (Math.sin(d3) * d2)) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i3 = i + 1;
        fArr[i] = f + 0.0f;
        int i4 = i3 + 1;
        fArr[i3] = f2 + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f6 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f2 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f6 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f7 + 0.0f;
        fArr[i8] = f + 0.0f;
        fArr[i8 + 1] = f7 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            switch (iArr[i]) {
                case 1:
                    f3 = f7;
                    break;
                case 2:
                    f5 = f7;
                    break;
                case 3:
                    f4 = f7;
                    break;
                case 4:
                    f6 = f7;
                    break;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double[] dArr, int[] iArr) {
        float[] fArr = {this.e, this.f, this.g, this.h, this.i, this.j};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < fArr.length) {
                dArr[i] = fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return this.p.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(String str) {
        a aVar = this.p.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str, double[] dArr, int i) {
        a aVar = this.p.get(str);
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.c() == 1) {
            dArr[i] = aVar.d();
            return 1;
        }
        int c = aVar.c();
        float[] fArr = new float[c];
        aVar.a(fArr);
        while (i2 < c) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float f3, float f4) {
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(el elVar) {
        return Float.compare(this.e, elVar.e);
    }

    public void a(d.a aVar) {
        this.b = by.a(aVar.d.d);
        this.l = aVar.d.e;
        this.m = aVar.d.b;
        this.j = aVar.d.i;
        this.c = aVar.d.f;
        this.r = aVar.d.c;
        this.k = aVar.c.e;
        this.n = aVar.e.C;
        for (String str : aVar.g.keySet()) {
            a aVar2 = aVar.g.get(str);
            if (aVar2 != null && aVar2.b()) {
                this.p.put(str, aVar2);
            }
        }
    }
}
