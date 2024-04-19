package defpackage;

import defpackage.bo;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: PriorityGoalRow.java */
/* renamed from: bt  reason: default package */
/* loaded from: classes3.dex */
public class bt extends bo {
    a g;
    bp h;
    private int i;
    private bu[] j;
    private bu[] k;
    private int l;

    /* compiled from: PriorityGoalRow.java */
    /* renamed from: bt$a */
    /* loaded from: classes3.dex */
    class a {
        bu a;
        bt b;

        public a(bt btVar) {
            this.b = btVar;
        }

        public void a(bu buVar) {
            this.a = buVar;
        }

        public boolean a(bu buVar, float f) {
            boolean z = true;
            if (!this.a.a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = buVar.h[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.a.h[i] = f3;
                    } else {
                        this.a.h[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.a.h;
                fArr[i2] = fArr[i2] + (buVar.h[i2] * f);
                if (Math.abs(this.a.h[i2]) < 1.0E-4f) {
                    this.a.h[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                bt.this.f(this.a);
            }
            return false;
        }

        public final boolean a() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.h[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(bu buVar) {
            for (int i = 8; i >= 0; i--) {
                float f = buVar.h[i];
                float f2 = this.a.h[i];
                if (f2 != f) {
                    return f2 < f;
                }
            }
            return false;
        }

        public void b() {
            Arrays.fill(this.a.h, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.a.h[i] + " ";
                }
            }
            return str + "] " + this.a;
        }
    }

    @Override // defpackage.bo, defpackage.bq.a
    public void f() {
        this.l = 0;
        this.b = 0.0f;
    }

    public bt(bp bpVar) {
        super(bpVar);
        this.i = 128;
        int i = this.i;
        this.j = new bu[i];
        this.k = new bu[i];
        this.l = 0;
        this.g = new a(this);
        this.h = bpVar;
    }

    @Override // defpackage.bo, defpackage.bq.a
    public boolean e() {
        return this.l == 0;
    }

    @Override // defpackage.bo, defpackage.bq.a
    public bu a(bq bqVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.l; i2++) {
            bu buVar = this.j[i2];
            if (!zArr[buVar.b]) {
                this.g.a(buVar);
                if (i == -1) {
                    if (!this.g.a()) {
                    }
                    i = i2;
                } else {
                    if (!this.g.b(this.j[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.j[i];
    }

    @Override // defpackage.bo, defpackage.bq.a
    public void d(bu buVar) {
        this.g.a(buVar);
        this.g.b();
        buVar.h[buVar.d] = 1.0f;
        e(buVar);
    }

    private final void e(bu buVar) {
        int i;
        int i2 = this.l + 1;
        bu[] buVarArr = this.j;
        if (i2 > buVarArr.length) {
            this.j = (bu[]) Arrays.copyOf(buVarArr, buVarArr.length * 2);
            bu[] buVarArr2 = this.j;
            this.k = (bu[]) Arrays.copyOf(buVarArr2, buVarArr2.length * 2);
        }
        bu[] buVarArr3 = this.j;
        int i3 = this.l;
        buVarArr3[i3] = buVar;
        this.l = i3 + 1;
        int i4 = this.l;
        if (i4 > 1 && buVarArr3[i4 - 1].b > buVar.b) {
            int i5 = 0;
            while (true) {
                i = this.l;
                if (i5 >= i) {
                    break;
                }
                this.k[i5] = this.j[i5];
                i5++;
            }
            Arrays.sort(this.k, 0, i, new Comparator<bu>() { // from class: bt.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(bu buVar2, bu buVar3) {
                    return buVar2.b - buVar3.b;
                }
            });
            for (int i6 = 0; i6 < this.l; i6++) {
                this.j[i6] = this.k[i6];
            }
        }
        buVar.a = true;
        buVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(bu buVar) {
        int i = 0;
        while (i < this.l) {
            if (this.j[i] == buVar) {
                while (true) {
                    int i2 = this.l;
                    if (i < i2 - 1) {
                        bu[] buVarArr = this.j;
                        int i3 = i + 1;
                        buVarArr[i] = buVarArr[i3];
                        i = i3;
                    } else {
                        this.l = i2 - 1;
                        buVar.a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.bo
    public void a(bq bqVar, bo boVar, boolean z) {
        bu buVar = boVar.a;
        if (buVar == null) {
            return;
        }
        bo.a aVar = boVar.e;
        int c = aVar.c();
        for (int i = 0; i < c; i++) {
            bu a2 = aVar.a(i);
            float b = aVar.b(i);
            this.g.a(a2);
            if (this.g.a(buVar, b)) {
                e(a2);
            }
            this.b += boVar.b * b;
        }
        f(buVar);
    }

    @Override // defpackage.bo
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.l; i++) {
            this.g.a(this.j[i]);
            str = str + this.g + " ";
        }
        return str;
    }
}
