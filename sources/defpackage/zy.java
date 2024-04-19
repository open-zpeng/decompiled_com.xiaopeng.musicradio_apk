package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenericGFPoly.java */
/* renamed from: zy  reason: default package */
/* loaded from: classes3.dex */
public final class zy {
    private final zx a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zy(zx zxVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = zxVar;
        int length = iArr.length;
        if (length > 1 && iArr[0] == 0) {
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            this.b = new int[length - i];
            int[] iArr2 = this.b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a() {
        return this.b;
    }

    int b() {
        return this.b.length - 1;
    }

    boolean c() {
        return this.b[0] == 0;
    }

    int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    zy a(zy zyVar) {
        if (!this.a.equals(zyVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return zyVar;
        }
        if (zyVar.c()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = zyVar.b;
        if (iArr.length > iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr2.length];
        int length = iArr2.length - iArr.length;
        System.arraycopy(iArr2, 0, iArr3, 0, length);
        for (int i = length; i < iArr2.length; i++) {
            iArr3[i] = zx.b(iArr[i - length], iArr2[i]);
        }
        return new zy(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zy b(zy zyVar) {
        if (!this.a.equals(zyVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c() || zyVar.c()) {
            return this.a.a();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = zyVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = zx.b(iArr3[i4], this.a.c(i2, iArr2[i3]));
            }
        }
        return new zy(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zy a(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.a.a();
            }
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.c(this.b[i3], i2);
            }
            return new zy(this.a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zy[] c(zy zyVar) {
        if (!this.a.equals(zyVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (zyVar.c()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        zy a = this.a.a();
        int c = this.a.c(zyVar.a(zyVar.b()));
        zy zyVar2 = a;
        zy zyVar3 = this;
        while (zyVar3.b() >= zyVar.b() && !zyVar3.c()) {
            int b = zyVar3.b() - zyVar.b();
            int c2 = this.a.c(zyVar3.a(zyVar3.b()), c);
            zy a2 = zyVar.a(b, c2);
            zyVar2 = zyVar2.a(this.a.a(b, c2));
            zyVar3 = zyVar3.a(a2);
        }
        return new zy[]{zyVar2, zyVar3};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int a = a(b);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    int b2 = this.a.b(a);
                    if (b2 == 0) {
                        sb.append('1');
                    } else if (b2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(b2);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
