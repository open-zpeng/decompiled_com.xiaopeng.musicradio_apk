package defpackage;

import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
/* compiled from: Base64.java */
/* renamed from: uq  reason: default package */
/* loaded from: classes3.dex */
public class uq {
    static final /* synthetic */ boolean a = !uq.class.desiredAssertionStatus();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Base64.java */
    /* renamed from: uq$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public byte[] a;
        public int b;

        a() {
        }
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, 0, bArr.length, i);
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3) {
        b bVar = new b(i3, new byte[(i2 * 3) / 4]);
        if (!bVar.a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (bVar.b == bVar.a.length) {
            return bVar.a;
        }
        byte[] bArr2 = new byte[bVar.b];
        System.arraycopy(bVar.a, 0, bArr2, 0, bVar.b);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Base64.java */
    /* renamed from: uq$b */
    /* loaded from: classes3.dex */
    public static class b extends a {
        private static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int e;
        private int f;
        private final int[] g;

        public b(int i, byte[] bArr) {
            this.a = bArr;
            this.g = (i & 8) == 0 ? c : d;
            this.e = 0;
            this.f = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r12, int r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.b.a(byte[], int, int, boolean):boolean");
        }
    }

    public static String b(byte[] bArr, int i) {
        try {
            return new String(c(bArr, i), C.ASCII_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] c(byte[] bArr, int i) {
        return b(bArr, 0, bArr.length, i);
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!cVar.d) {
            switch (i2 % 3) {
                case 1:
                    i4 += 2;
                    break;
                case 2:
                    i4 += 3;
                    break;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.e && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (cVar.f ? 2 : 1);
        }
        cVar.a = new byte[i4];
        cVar.a(bArr, i, i2, true);
        if (a || cVar.b == i4) {
            return cVar.a;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Base64.java */
    /* renamed from: uq$c */
    /* loaded from: classes3.dex */
    public static class c extends a {
        static final /* synthetic */ boolean g = !uq.class.desiredAssertionStatus();
        private static final byte[] h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte[] j;
        private int k;
        private final byte[] l;

        public c(int i2, byte[] bArr) {
            this.a = bArr;
            this.d = (i2 & 1) == 0;
            this.e = (i2 & 2) == 0;
            this.f = (i2 & 4) != 0;
            this.l = (i2 & 8) == 0 ? h : i;
            this.j = new byte[2];
            this.c = 0;
            this.k = this.e ? 19 : -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public boolean a(byte[] bArr, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            int i7;
            byte b;
            int i8;
            byte b2;
            int i9;
            byte b3;
            int i10;
            int i11;
            int i12;
            byte[] bArr2 = this.l;
            byte[] bArr3 = this.a;
            int i13 = this.k;
            int i14 = i3 + i2;
            int i15 = 0;
            switch (this.c) {
                case 0:
                default:
                    i4 = i2;
                    i5 = -1;
                    break;
                case 1:
                    if (i2 + 2 <= i14) {
                        int i16 = i2 + 1;
                        i4 = i16 + 1;
                        i5 = ((this.j[0] & 255) << 16) | ((bArr[i2] & 255) << 8) | (bArr[i16] & 255);
                        this.c = 0;
                        break;
                    }
                    i4 = i2;
                    i5 = -1;
                    break;
                case 2:
                    int i17 = i2 + 1;
                    if (i17 <= i14) {
                        byte[] bArr4 = this.j;
                        int i18 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i2] & 255);
                        this.c = 0;
                        i4 = i17;
                        i5 = i18;
                        break;
                    }
                    i4 = i2;
                    i5 = -1;
                    break;
            }
            if (i5 != -1) {
                bArr3[0] = bArr2[(i5 >> 18) & 63];
                bArr3[1] = bArr2[(i5 >> 12) & 63];
                bArr3[2] = bArr2[(i5 >> 6) & 63];
                bArr3[3] = bArr2[i5 & 63];
                i13--;
                if (i13 == 0) {
                    if (this.f) {
                        i12 = 5;
                        bArr3[4] = 13;
                    } else {
                        i12 = 4;
                    }
                    i6 = i12 + 1;
                    bArr3[i12] = 10;
                    i13 = 19;
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 0;
            }
            while (true) {
                int i19 = i4 + 3;
                if (i19 <= i14) {
                    int i20 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16) | (bArr[i4 + 2] & 255);
                    bArr3[i6] = bArr2[(i20 >> 18) & 63];
                    bArr3[i6 + 1] = bArr2[(i20 >> 12) & 63];
                    bArr3[i6 + 2] = bArr2[(i20 >> 6) & 63];
                    bArr3[i6 + 3] = bArr2[i20 & 63];
                    i6 += 4;
                    i13--;
                    if (i13 == 0) {
                        if (this.f) {
                            i11 = i6 + 1;
                            bArr3[i6] = 13;
                        } else {
                            i11 = i6;
                        }
                        i6 = i11 + 1;
                        bArr3[i11] = 10;
                        i4 = i19;
                        i13 = 19;
                    } else {
                        i4 = i19;
                    }
                } else {
                    if (z) {
                        int i21 = this.c;
                        if (i4 - i21 == i14 - 1) {
                            if (i21 > 0) {
                                b3 = this.j[0];
                                i15 = 1;
                            } else {
                                byte b4 = bArr[i4];
                                i4++;
                                b3 = b4;
                            }
                            int i22 = (b3 & 255) << 4;
                            this.c -= i15;
                            int i23 = i6 + 1;
                            bArr3[i6] = bArr2[(i22 >> 6) & 63];
                            i6 = i23 + 1;
                            bArr3[i23] = bArr2[i22 & 63];
                            if (this.d) {
                                int i24 = i6 + 1;
                                bArr3[i6] = 61;
                                i6 = i24 + 1;
                                bArr3[i24] = 61;
                            }
                            if (this.e) {
                                if (this.f) {
                                    i10 = i6 + 1;
                                    bArr3[i6] = 13;
                                } else {
                                    i10 = i6;
                                }
                                i6 = i10 + 1;
                                bArr3[i10] = 10;
                            }
                        } else if (i4 - i21 == i14 - 2) {
                            if (i21 > 1) {
                                b = this.j[0];
                                i15 = 1;
                            } else {
                                byte b5 = bArr[i4];
                                i4++;
                                b = b5;
                            }
                            int i25 = (b & 255) << 10;
                            if (this.c > 0) {
                                i8 = i15 + 1;
                                b2 = this.j[i15];
                            } else {
                                i8 = i15;
                                b2 = bArr[i4];
                                i4++;
                            }
                            int i26 = i25 | ((b2 & 255) << 2);
                            this.c -= i8;
                            int i27 = i6 + 1;
                            bArr3[i6] = bArr2[(i26 >> 12) & 63];
                            int i28 = i27 + 1;
                            bArr3[i27] = bArr2[(i26 >> 6) & 63];
                            int i29 = i28 + 1;
                            bArr3[i28] = bArr2[i26 & 63];
                            if (this.d) {
                                i9 = i29 + 1;
                                bArr3[i29] = 61;
                            } else {
                                i9 = i29;
                            }
                            if (this.e) {
                                if (this.f) {
                                    bArr3[i9] = 13;
                                    i9++;
                                }
                                bArr3[i9] = 10;
                                i9++;
                            }
                            i6 = i9;
                        } else if (this.e && i6 > 0 && i13 != 19) {
                            if (this.f) {
                                i7 = i6 + 1;
                                bArr3[i6] = 13;
                            } else {
                                i7 = i6;
                            }
                            i6 = i7 + 1;
                            bArr3[i7] = 10;
                        }
                        if (!g && this.c != 0) {
                            throw new AssertionError();
                        }
                        if (!g && i4 != i14) {
                            throw new AssertionError();
                        }
                    } else if (i4 == i14 - 1) {
                        byte[] bArr5 = this.j;
                        int i30 = this.c;
                        this.c = i30 + 1;
                        bArr5[i30] = bArr[i4];
                    } else if (i4 == i14 - 2) {
                        byte[] bArr6 = this.j;
                        int i31 = this.c;
                        this.c = i31 + 1;
                        bArr6[i31] = bArr[i4];
                        int i32 = this.c;
                        this.c = i32 + 1;
                        bArr6[i32] = bArr[i4 + 1];
                    }
                    this.b = i6;
                    this.k = i13;
                    return true;
                }
            }
        }
    }

    private uq() {
    }
}
