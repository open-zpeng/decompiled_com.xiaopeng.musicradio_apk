package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: Flow.java */
/* renamed from: cs  reason: default package */
/* loaded from: classes3.dex */
public class cs extends cx {
    private cq[] aX;
    private int aA = -1;
    private int aB = -1;
    private int aC = -1;
    private int aD = -1;
    private int aE = -1;
    private int aF = -1;
    private float aG = 0.5f;
    private float aH = 0.5f;
    private float aI = 0.5f;
    private float aJ = 0.5f;
    private float aK = 0.5f;
    private float aL = 0.5f;
    private int aM = 0;
    private int aN = 0;
    private int aO = 2;
    private int aP = 2;
    private int aQ = 0;
    private int aR = -1;
    private int aS = 0;
    private ArrayList<a> aT = new ArrayList<>();
    private cq[] aU = null;
    private cq[] aV = null;
    private int[] aW = null;
    private int aY = 0;

    @Override // defpackage.cv, defpackage.cq
    public void a(cq cqVar, HashMap<cq, cq> hashMap) {
        super.a(cqVar, hashMap);
        cs csVar = (cs) cqVar;
        this.aA = csVar.aA;
        this.aB = csVar.aB;
        this.aC = csVar.aC;
        this.aD = csVar.aD;
        this.aE = csVar.aE;
        this.aF = csVar.aF;
        this.aG = csVar.aG;
        this.aH = csVar.aH;
        this.aI = csVar.aI;
        this.aJ = csVar.aJ;
        this.aK = csVar.aK;
        this.aL = csVar.aL;
        this.aM = csVar.aM;
        this.aN = csVar.aN;
        this.aO = csVar.aO;
        this.aP = csVar.aP;
        this.aQ = csVar.aQ;
        this.aR = csVar.aR;
        this.aS = csVar.aS;
    }

    /* compiled from: Flow.java */
    /* renamed from: cs$a */
    /* loaded from: classes3.dex */
    private class a {
        final /* synthetic */ cs a;
        private int b;
        private cq c;
        private cp d;
        private cp e;
        private cp f;
        private cp g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        public void a(boolean z, int i, boolean z2) {
            cq cqVar;
            char c;
            int i2 = this.m;
            for (int i3 = 0; i3 < i2 && this.l + i3 < this.a.aY; i3++) {
                cq cqVar2 = this.a.aX[this.l + i3];
                if (cqVar2 != null) {
                    cqVar2.W();
                }
            }
            if (i2 == 0 || this.c == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.l + i7 >= this.a.aY) {
                    break;
                }
                if (this.a.aX[this.l + i7].B() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            if (this.b == 0) {
                cq cqVar3 = this.c;
                cqVar3.w(this.a.aB);
                int i8 = this.i;
                if (i > 0) {
                    i8 += this.a.aN;
                }
                cqVar3.A.a(this.e, i8);
                if (z2) {
                    cqVar3.C.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.a.C.a(cqVar3.A, 0);
                }
                if (this.a.aP == 3 && !cqVar3.P()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.l + i10 >= this.a.aY) {
                            break;
                        }
                        cqVar = this.a.aX[this.l + i10];
                        if (cqVar.P()) {
                            break;
                        }
                    }
                }
                cqVar = cqVar3;
                cq cqVar4 = null;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.l + i12 >= this.a.aY) {
                        return;
                    }
                    cq cqVar5 = this.a.aX[this.l + i12];
                    if (i11 == 0) {
                        cqVar5.a(cqVar5.z, this.d, this.h);
                    }
                    if (i12 == 0) {
                        int i13 = this.a.aA;
                        float f = z ? 1.0f - this.a.aG : this.a.aG;
                        if (this.l != 0 || this.a.aC == -1) {
                            if (z2 && this.a.aE != -1) {
                                i13 = this.a.aE;
                                f = z ? 1.0f - this.a.aK : this.a.aK;
                            }
                        } else {
                            i13 = this.a.aC;
                            f = z ? 1.0f - this.a.aI : this.a.aI;
                        }
                        cqVar5.v(i13);
                        cqVar5.a(f);
                    }
                    if (i11 == i2 - 1) {
                        cqVar5.a(cqVar5.B, this.f, this.j);
                    }
                    if (cqVar4 != null) {
                        cqVar5.z.a(cqVar4.B, this.a.aM);
                        if (i11 == i4) {
                            cqVar5.z.b(this.h);
                        }
                        cqVar4.B.a(cqVar5.z, 0);
                        if (i11 == i5 + 1) {
                            cqVar4.B.b(this.j);
                        }
                    }
                    if (cqVar5 != cqVar3) {
                        c = 3;
                        if (this.a.aP == 3 && cqVar.P() && cqVar5 != cqVar && cqVar5.P()) {
                            cqVar5.D.a(cqVar.D, 0);
                        } else {
                            switch (this.a.aP) {
                                case 0:
                                    cqVar5.A.a(cqVar3.A, 0);
                                    continue;
                                case 1:
                                    cqVar5.C.a(cqVar3.C, 0);
                                    continue;
                                default:
                                    if (z3) {
                                        cqVar5.A.a(this.e, this.i);
                                        cqVar5.C.a(this.g, this.k);
                                        continue;
                                    } else {
                                        cqVar5.A.a(cqVar3.A, 0);
                                        cqVar5.C.a(cqVar3.C, 0);
                                        break;
                                    }
                            }
                        }
                    } else {
                        c = 3;
                    }
                    i11++;
                    cqVar4 = cqVar5;
                }
                return;
            }
            cq cqVar6 = this.c;
            cqVar6.v(this.a.aA);
            int i14 = this.h;
            if (i > 0) {
                i14 += this.a.aM;
            }
            if (z) {
                cqVar6.B.a(this.f, i14);
                if (z2) {
                    cqVar6.z.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.a.z.a(cqVar6.B, 0);
                }
            } else {
                cqVar6.z.a(this.d, i14);
                if (z2) {
                    cqVar6.B.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.a.B.a(cqVar6.z, 0);
                }
            }
            cq cqVar7 = null;
            int i15 = 0;
            while (i15 < i2 && this.l + i15 < this.a.aY) {
                cq cqVar8 = this.a.aX[this.l + i15];
                if (i15 == 0) {
                    cqVar8.a(cqVar8.A, this.e, this.i);
                    int i16 = this.a.aB;
                    float f2 = this.a.aH;
                    if (this.l != 0 || this.a.aD == -1) {
                        if (z2 && this.a.aF != -1) {
                            i16 = this.a.aF;
                            f2 = this.a.aL;
                        }
                    } else {
                        i16 = this.a.aD;
                        f2 = this.a.aJ;
                    }
                    cqVar8.w(i16);
                    cqVar8.b(f2);
                }
                if (i15 == i2 - 1) {
                    cqVar8.a(cqVar8.C, this.g, this.k);
                }
                if (cqVar7 != null) {
                    cqVar8.A.a(cqVar7.C, this.a.aN);
                    if (i15 == i4) {
                        cqVar8.A.b(this.i);
                    }
                    cqVar7.C.a(cqVar8.A, 0);
                    if (i15 == i5 + 1) {
                        cqVar7.C.b(this.k);
                    }
                }
                if (cqVar8 != cqVar6) {
                    if (z) {
                        switch (this.a.aO) {
                            case 0:
                                cqVar8.B.a(cqVar6.B, 0);
                                continue;
                            case 1:
                                cqVar8.z.a(cqVar6.z, 0);
                                continue;
                            case 2:
                                cqVar8.z.a(cqVar6.z, 0);
                                cqVar8.B.a(cqVar6.B, 0);
                                continue;
                        }
                    } else {
                        switch (this.a.aO) {
                            case 0:
                                cqVar8.z.a(cqVar6.z, 0);
                                continue;
                            case 1:
                                cqVar8.B.a(cqVar6.B, 0);
                                continue;
                            case 2:
                                if (z3) {
                                    cqVar8.z.a(this.d, this.h);
                                    cqVar8.B.a(this.f, this.j);
                                    continue;
                                } else {
                                    cqVar8.z.a(cqVar6.z, 0);
                                    cqVar8.B.a(cqVar6.B, 0);
                                    break;
                                }
                        }
                    }
                }
                i15++;
                cqVar7 = cqVar8;
            }
        }
    }

    private void f(boolean z) {
        cq cqVar;
        float f;
        int i;
        if (this.aW == null || this.aV == null || this.aU == null) {
            return;
        }
        for (int i2 = 0; i2 < this.aY; i2++) {
            this.aX[i2].W();
        }
        int[] iArr = this.aW;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.aG;
        cq cqVar2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.aG;
            } else {
                f = f2;
                i = i5;
            }
            cq cqVar3 = this.aV[i];
            if (cqVar3 != null && cqVar3.B() != 8) {
                if (i5 == 0) {
                    cqVar3.a(cqVar3.z, this.z, f());
                    cqVar3.v(this.aA);
                    cqVar3.a(f);
                }
                if (i5 == i3 - 1) {
                    cqVar3.a(cqVar3.B, this.B, g());
                }
                if (i5 > 0 && cqVar2 != null) {
                    cqVar3.a(cqVar3.z, cqVar2.B, this.aM);
                    cqVar2.a(cqVar2.B, cqVar3.z, 0);
                }
                cqVar2 = cqVar3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            cq cqVar4 = this.aU[i6];
            if (cqVar4 != null && cqVar4.B() != 8) {
                if (i6 == 0) {
                    cqVar4.a(cqVar4.A, this.A, b());
                    cqVar4.w(this.aB);
                    cqVar4.b(this.aH);
                }
                if (i6 == i4 - 1) {
                    cqVar4.a(cqVar4.C, this.C, c());
                }
                if (i6 > 0 && cqVar2 != null) {
                    cqVar4.a(cqVar4.A, cqVar2.C, this.aN);
                    cqVar2.a(cqVar2.C, cqVar4.A, 0);
                }
                cqVar2 = cqVar4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.aS == 1) {
                    i9 = (i7 * i4) + i8;
                }
                cq[] cqVarArr = this.aX;
                if (i9 < cqVarArr.length && (cqVar = cqVarArr[i9]) != null && cqVar.B() != 8) {
                    cq cqVar5 = this.aV[i7];
                    cq cqVar6 = this.aU[i8];
                    if (cqVar != cqVar5) {
                        cqVar.a(cqVar.z, cqVar5.z, 0);
                        cqVar.a(cqVar.B, cqVar5.B, 0);
                    }
                    if (cqVar != cqVar6) {
                        cqVar.a(cqVar.A, cqVar6.A, 0);
                        cqVar.a(cqVar.C, cqVar6.C, 0);
                    }
                }
            }
        }
    }

    @Override // defpackage.cq
    public void a(bq bqVar, boolean z) {
        super.a(bqVar, z);
        boolean z2 = A() != null && ((cr) A()).ad();
        switch (this.aQ) {
            case 0:
                if (this.aT.size() > 0) {
                    this.aT.get(0).a(z2, 0, true);
                    break;
                }
                break;
            case 1:
                int size = this.aT.size();
                int i = 0;
                while (i < size) {
                    this.aT.get(i).a(z2, i, i == size + (-1));
                    i++;
                }
                break;
            case 2:
                f(z2);
                break;
        }
        a(false);
    }
}
