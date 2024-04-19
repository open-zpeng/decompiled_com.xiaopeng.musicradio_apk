package defpackage;

import java.util.Arrays;
/* compiled from: BitArray.java */
/* renamed from: zu  reason: default package */
/* loaded from: classes3.dex */
public final class zu implements Cloneable {
    private int[] a;
    private int b;

    public zu() {
        this.b = 0;
        this.a = new int[1];
    }

    zu(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return (this.b + 7) / 8;
    }

    private void b(int i) {
        if (i > this.a.length * 32) {
            int[] c = c(i);
            int[] iArr = this.a;
            System.arraycopy(iArr, 0, c, 0, iArr.length);
            this.a = c;
        }
    }

    public boolean a(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public void a(boolean z) {
        b(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public void a(zu zuVar) {
        int i = zuVar.b;
        b(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(zuVar.a(i2));
        }
    }

    public void b(zu zuVar) {
        if (this.a.length != zuVar.a.length) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ zuVar.a[i];
            i++;
        }
    }

    public void a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = 0;
            int i7 = i4;
            for (int i8 = 0; i8 < 8; i8++) {
                if (a(i7)) {
                    i6 |= 1 << (7 - i8);
                }
                i7++;
            }
            bArr[i2 + i5] = (byte) i6;
            i5++;
            i4 = i7;
        }
    }

    private static int[] c(int i) {
        return new int[(i + 31) / 32];
    }

    public boolean equals(Object obj) {
        if (obj instanceof zu) {
            zu zuVar = (zu) obj;
            return this.b == zuVar.b && Arrays.equals(this.a, zuVar.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: c */
    public zu clone() {
        return new zu((int[]) this.a.clone(), this.b);
    }
}
