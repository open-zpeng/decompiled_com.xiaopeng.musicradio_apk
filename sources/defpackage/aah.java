package defpackage;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MatrixUtil.java */
/* renamed from: aah  reason: default package */
/* loaded from: classes2.dex */
public final class aah {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, -1}, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, -1}, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, Opcodes.I2C, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, Opcodes.IFNE}, new int[]{6, 28, 54, 80, 106, Opcodes.IINC, Opcodes.IFLE}, new int[]{6, 32, 58, 84, 110, 136, Opcodes.IF_ICMPGE}, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, Opcodes.IF_ACMPNE}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static int a(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    private static boolean b(int i) {
        return i == -1;
    }

    static void a(aae aaeVar) {
        aaeVar.a((byte) -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(zu zuVar, aaa aaaVar, aac aacVar, int i, aae aaeVar) {
        a(aaeVar);
        a(aacVar, aaeVar);
        a(aaaVar, i, aaeVar);
        b(aacVar, aaeVar);
        a(zuVar, i, aaeVar);
    }

    static void a(aac aacVar, aae aaeVar) {
        d(aaeVar);
        c(aaeVar);
        c(aacVar, aaeVar);
        b(aaeVar);
    }

    static void a(aaa aaaVar, int i, aae aaeVar) {
        zu zuVar = new zu();
        a(aaaVar, i, zuVar);
        for (int i2 = 0; i2 < zuVar.a(); i2++) {
            boolean a2 = zuVar.a((zuVar.a() - 1) - i2);
            int[][] iArr = d;
            aaeVar.a(iArr[i2][0], iArr[i2][1], a2);
            if (i2 < 8) {
                aaeVar.a((aaeVar.b() - i2) - 1, 8, a2);
            } else {
                aaeVar.a(8, (aaeVar.a() - 7) + (i2 - 8), a2);
            }
        }
    }

    static void b(aac aacVar, aae aaeVar) {
        if (aacVar.a() < 7) {
            return;
        }
        zu zuVar = new zu();
        a(aacVar, zuVar);
        int i = 17;
        int i2 = 0;
        while (i2 < 6) {
            int i3 = i;
            for (int i4 = 0; i4 < 3; i4++) {
                boolean a2 = zuVar.a(i3);
                i3--;
                aaeVar.a(i2, (aaeVar.a() - 11) + i4, a2);
                aaeVar.a((aaeVar.a() - 11) + i4, i2, a2);
            }
            i2++;
            i = i3;
        }
    }

    static void a(zu zuVar, int i, aae aaeVar) {
        boolean z;
        int b2 = aaeVar.b() - 1;
        int a2 = aaeVar.a() - 1;
        int i2 = -1;
        int i3 = 0;
        while (b2 > 0) {
            if (b2 == 6) {
                b2--;
            }
            while (a2 >= 0 && a2 < aaeVar.a()) {
                int i4 = i3;
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = b2 - i5;
                    if (b(aaeVar.a(i6, a2))) {
                        if (i4 < zuVar.a()) {
                            z = zuVar.a(i4);
                            i4++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && aag.a(i, i6, a2)) {
                            z = !z;
                        }
                        aaeVar.a(i6, a2, z);
                    }
                }
                a2 += i2;
                i3 = i4;
            }
            i2 = -i2;
            a2 += i2;
            b2 -= 2;
        }
        if (i3 == zuVar.a()) {
            return;
        }
        throw new zt("Not all bits consumed: " + i3 + '/' + zuVar.a());
    }

    static int a(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int a2 = a(i2);
        int i3 = i << (a2 - 1);
        while (a(i3) >= a2) {
            i3 ^= i2 << (a(i3) - a2);
        }
        return i3;
    }

    static void a(aaa aaaVar, int i, zu zuVar) {
        if (!aai.b(i)) {
            throw new zt("Invalid mask pattern");
        }
        int a2 = (aaaVar.a() << 3) | i;
        zuVar.a(a2, 5);
        zuVar.a(a(a2, 1335), 10);
        zu zuVar2 = new zu();
        zuVar2.a(21522, 15);
        zuVar.b(zuVar2);
        if (zuVar.a() == 15) {
            return;
        }
        throw new zt("should not happen but we got: " + zuVar.a());
    }

    static void a(aac aacVar, zu zuVar) {
        zuVar.a(aacVar.a(), 6);
        zuVar.a(a(aacVar.a(), 7973), 12);
        if (zuVar.a() == 18) {
            return;
        }
        throw new zt("should not happen but we got: " + zuVar.a());
    }

    private static void b(aae aaeVar) {
        int i = 8;
        while (i < aaeVar.b() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (b(aaeVar.a(i, 6))) {
                aaeVar.a(i, 6, i3);
            }
            if (b(aaeVar.a(6, i))) {
                aaeVar.a(6, i, i3);
            }
            i = i2;
        }
    }

    private static void c(aae aaeVar) {
        if (aaeVar.a(8, aaeVar.a() - 8) == 0) {
            throw new zt();
        }
        aaeVar.a(8, aaeVar.a() - 8, 1);
    }

    private static void a(int i, int i2, aae aaeVar) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!b(aaeVar.a(i4, i2))) {
                throw new zt();
            }
            aaeVar.a(i4, i2, 0);
        }
    }

    private static void b(int i, int i2, aae aaeVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!b(aaeVar.a(i, i4))) {
                throw new zt();
            }
            aaeVar.a(i, i4, 0);
        }
    }

    private static void c(int i, int i2, aae aaeVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                aaeVar.a(i + i4, i2 + i3, b[i3][i4]);
            }
        }
    }

    private static void d(int i, int i2, aae aaeVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                aaeVar.a(i + i4, i2 + i3, a[i3][i4]);
            }
        }
    }

    private static void d(aae aaeVar) {
        int length = a[0].length;
        d(0, 0, aaeVar);
        d(aaeVar.b() - length, 0, aaeVar);
        d(0, aaeVar.b() - length, aaeVar);
        a(0, 7, aaeVar);
        a(aaeVar.b() - 8, 7, aaeVar);
        a(0, aaeVar.b() - 8, aaeVar);
        b(7, 0, aaeVar);
        b((aaeVar.a() - 7) - 1, 0, aaeVar);
        b(7, aaeVar.a() - 7, aaeVar);
    }

    private static void c(aac aacVar, aae aaeVar) {
        if (aacVar.a() < 2) {
            return;
        }
        int a2 = aacVar.a() - 1;
        int[][] iArr = c;
        int[] iArr2 = iArr[a2];
        int length = iArr[a2].length;
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArr2[i];
                int i4 = iArr2[i2];
                if (i4 != -1 && i3 != -1 && b(aaeVar.a(i4, i3))) {
                    c(i4 - 2, i3 - 2, aaeVar);
                }
            }
        }
    }
}
