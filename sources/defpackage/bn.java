package defpackage;

import defpackage.bo;
import java.util.Arrays;
/* compiled from: ArrayLinkedVariables.java */
/* renamed from: bn  reason: default package */
/* loaded from: classes3.dex */
public class bn implements bo.a {
    private static float l = 0.001f;
    protected final bp b;
    private final bo c;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;
    int a = 0;
    private int d = 8;
    private bu e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bn(bo boVar, bp bpVar) {
        int i = this.d;
        this.f = new int[i];
        this.g = new int[i];
        this.h = new float[i];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.c = boVar;
        this.b = bpVar;
    }

    @Override // defpackage.bo.a
    public final void a(bu buVar, float f) {
        if (f == 0.0f) {
            a(buVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            float[] fArr = this.h;
            int i2 = this.i;
            fArr[i2] = f;
            this.f[i2] = buVar.b;
            this.g[this.i] = -1;
            buVar.l++;
            buVar.a(this.c);
            this.a++;
            if (this.k) {
                return;
            }
            this.j++;
            int i3 = this.j;
            int[] iArr = this.f;
            if (i3 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i != -1 && i5 < this.a; i5++) {
            if (this.f[i] == buVar.b) {
                this.h[i] = f;
                return;
            }
            if (this.f[i] < buVar.b) {
                i4 = i;
            }
            i = this.g[i];
        }
        int i6 = this.j;
        int i7 = i6 + 1;
        if (this.k) {
            int[] iArr2 = this.f;
            if (iArr2[i6] != -1) {
                i6 = iArr2.length;
            }
        } else {
            i6 = i7;
        }
        int[] iArr3 = this.f;
        if (i6 >= iArr3.length && this.a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f;
                if (i8 >= iArr4.length) {
                    break;
                } else if (iArr4[i8] == -1) {
                    i6 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int[] iArr5 = this.f;
        if (i6 >= iArr5.length) {
            i6 = iArr5.length;
            this.d *= 2;
            this.k = false;
            this.j = i6 - 1;
            this.h = Arrays.copyOf(this.h, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i6] = buVar.b;
        this.h[i6] = f;
        if (i4 != -1) {
            int[] iArr6 = this.g;
            iArr6[i6] = iArr6[i4];
            iArr6[i4] = i6;
        } else {
            this.g[i6] = this.i;
            this.i = i6;
        }
        buVar.l++;
        buVar.a(this.c);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.f.length) {
            this.k = true;
        }
        int i9 = this.j;
        int[] iArr7 = this.f;
        if (i9 >= iArr7.length) {
            this.k = true;
            this.j = iArr7.length - 1;
        }
    }

    @Override // defpackage.bo.a
    public void a(bu buVar, float f, boolean z) {
        float f2 = l;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                float[] fArr = this.h;
                int i2 = this.i;
                fArr[i2] = f;
                this.f[i2] = buVar.b;
                this.g[this.i] = -1;
                buVar.l++;
                buVar.a(this.c);
                this.a++;
                if (this.k) {
                    return;
                }
                this.j++;
                int i3 = this.j;
                int[] iArr = this.f;
                if (i3 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i != -1 && i5 < this.a; i5++) {
                if (this.f[i] == buVar.b) {
                    float f3 = this.h[i] + f;
                    float f4 = l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.h[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr2 = this.g;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            buVar.b(this.c);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        buVar.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (this.f[i] < buVar.b) {
                    i4 = i;
                }
                i = this.g[i];
            }
            int i6 = this.j;
            int i7 = i6 + 1;
            if (this.k) {
                int[] iArr3 = this.f;
                if (iArr3[i6] != -1) {
                    i6 = iArr3.length;
                }
            } else {
                i6 = i7;
            }
            int[] iArr4 = this.f;
            if (i6 >= iArr4.length && this.a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f;
                    if (i8 >= iArr5.length) {
                        break;
                    } else if (iArr5[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr6 = this.f;
            if (i6 >= iArr6.length) {
                i6 = iArr6.length;
                this.d *= 2;
                this.k = false;
                this.j = i6 - 1;
                this.h = Arrays.copyOf(this.h, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i6] = buVar.b;
            this.h[i6] = f;
            if (i4 != -1) {
                int[] iArr7 = this.g;
                iArr7[i6] = iArr7[i4];
                iArr7[i4] = i6;
            } else {
                this.g[i6] = this.i;
                this.i = i6;
            }
            buVar.l++;
            buVar.a(this.c);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i9 = this.j;
            int[] iArr8 = this.f;
            if (i9 >= iArr8.length) {
                this.k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    @Override // defpackage.bo.a
    public float a(bo boVar, boolean z) {
        float b = b(boVar.a);
        a(boVar.a, z);
        bo.a aVar = boVar.e;
        int c = aVar.c();
        for (int i = 0; i < c; i++) {
            bu a = aVar.a(i);
            a(a, aVar.b(a) * b, z);
        }
        return b;
    }

    @Override // defpackage.bo.a
    public final float a(bu buVar, boolean z) {
        if (this.e == buVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == buVar.b) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    buVar.b(this.c);
                }
                buVar.l--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // defpackage.bo.a
    public final void a() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            bu buVar = this.b.d[this.f[i]];
            if (buVar != null) {
                buVar.b(this.c);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override // defpackage.bo.a
    public boolean a(bu buVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == buVar.b) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // defpackage.bo.a
    public void b() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    @Override // defpackage.bo.a
    public void a(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // defpackage.bo.a
    public int c() {
        return this.a;
    }

    @Override // defpackage.bo.a
    public bu a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // defpackage.bo.a
    public float b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // defpackage.bo.a
    public final float b(bu buVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == buVar.b) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    public String toString() {
        String str = "";
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.b.d[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
