package defpackage;
/* compiled from: MaskUtil.java */
/* renamed from: aag  reason: default package */
/* loaded from: classes2.dex */
final class aag {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aae aaeVar) {
        return a(aaeVar, true) + a(aaeVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(aae aaeVar) {
        byte[][] c = aaeVar.c();
        int b = aaeVar.b();
        int a = aaeVar.a();
        int i = 0;
        int i2 = 0;
        while (i < a - 1) {
            int i3 = i2;
            int i4 = 0;
            while (i4 < b - 1) {
                byte b2 = c[i][i4];
                int i5 = i4 + 1;
                if (b2 == c[i][i5]) {
                    int i6 = i + 1;
                    if (b2 == c[i6][i4] && b2 == c[i6][i5]) {
                        i3++;
                    }
                }
                i4 = i5;
            }
            i++;
            i2 = i3;
        }
        return i2 * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(aae aaeVar) {
        byte[][] c = aaeVar.c();
        int b = aaeVar.b();
        int a = aaeVar.a();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            int i3 = i2;
            for (int i4 = 0; i4 < b; i4++) {
                byte[] bArr = c[i];
                int i5 = i4 + 6;
                if (i5 < b && bArr[i4] == 1 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1 && bArr[i4 + 3] == 1 && bArr[i4 + 4] == 1 && bArr[i4 + 5] == 0 && bArr[i5] == 1 && (a(bArr, i4 - 4, i4) || a(bArr, i4 + 7, i4 + 11))) {
                    i3++;
                }
                int i6 = i + 6;
                if (i6 < a && c[i][i4] == 1 && c[i + 1][i4] == 0 && c[i + 2][i4] == 1 && c[i + 3][i4] == 1 && c[i + 4][i4] == 1 && c[i + 5][i4] == 0 && c[i6][i4] == 1 && (a(c, i4, i - 4, i) || a(c, i4, i + 7, i + 11))) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        return i2 * 40;
    }

    private static boolean a(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (i >= 0 && i < bArr.length && bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (i2 >= 0 && i2 < bArr.length && bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(aae aaeVar) {
        byte[][] c = aaeVar.c();
        int b = aaeVar.b();
        int a = aaeVar.a();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            byte[] bArr = c[i];
            int i3 = i2;
            for (int i4 = 0; i4 < b; i4++) {
                if (bArr[i4] == 1) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        int a2 = aaeVar.a() * aaeVar.b();
        return ((Math.abs((i2 * 2) - a2) * 10) / a2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i, int i2, int i3) {
        int i4;
        switch (i) {
            case 0:
                i4 = (i3 + i2) & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i4 = ((i3 / 2) + (i2 / 3)) & 1;
                break;
            case 5:
                int i5 = i3 * i2;
                i4 = (i5 & 1) + (i5 % 3);
                break;
            case 6:
                int i6 = i3 * i2;
                i4 = ((i6 & 1) + (i6 % 3)) & 1;
                break;
            case 7:
                i4 = (((i3 * i2) % 3) + ((i3 + i2) & 1)) & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i);
        }
        return i4 == 0;
    }

    private static int a(aae aaeVar, boolean z) {
        int a = z ? aaeVar.a() : aaeVar.b();
        int b = z ? aaeVar.b() : aaeVar.a();
        byte[][] c = aaeVar.c();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            int i3 = i;
            byte b2 = -1;
            int i4 = 0;
            for (int i5 = 0; i5 < b; i5++) {
                byte b3 = z ? c[i2][i5] : c[i5][i2];
                if (b3 == b2) {
                    i4++;
                } else {
                    if (i4 >= 5) {
                        i3 += (i4 - 5) + 3;
                    }
                    i4 = 1;
                    b2 = b3;
                }
            }
            if (i4 >= 5) {
                i3 += (i4 - 5) + 3;
            }
            i = i3;
        }
        return i;
    }
}
