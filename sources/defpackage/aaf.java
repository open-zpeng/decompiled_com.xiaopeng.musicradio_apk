package defpackage;

import defpackage.aac;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: Encoder.java */
/* renamed from: aaf  reason: default package */
/* loaded from: classes2.dex */
public final class aaf {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static int a(aae aaeVar) {
        return aag.a(aaeVar) + aag.b(aaeVar) + aag.c(aaeVar) + aag.d(aaeVar);
    }

    public static aai a(String str, aaa aaaVar, Map<zs, ?> map) {
        zw a2;
        String str2 = map == null ? null : (String) map.get(zs.CHARACTER_SET);
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        aab a3 = a(str, str2);
        zu zuVar = new zu();
        if (a3 == aab.BYTE && !"ISO-8859-1".equals(str2) && (a2 = zw.a(str2)) != null) {
            a(a2, zuVar);
        }
        a(a3, zuVar);
        zu zuVar2 = new zu();
        a(str, a3, zuVar2, str2);
        aac a4 = a(zuVar.a() + a3.a(a(zuVar.a() + a3.a(aac.a(1)) + zuVar2.a(), aaaVar)) + zuVar2.a(), aaaVar);
        zu zuVar3 = new zu();
        zuVar3.a(zuVar);
        a(a3 == aab.BYTE ? zuVar2.b() : str.length(), a4, a3, zuVar3);
        zuVar3.a(zuVar2);
        aac.b a5 = a4.a(aaaVar);
        int b = a4.b() - a5.c();
        a(b, zuVar3);
        zu a6 = a(zuVar3, a4.b(), b, a5.b());
        aai aaiVar = new aai();
        aaiVar.a(aaaVar);
        aaiVar.a(a3);
        aaiVar.a(a4);
        int c = a4.c();
        aae aaeVar = new aae(c, c);
        int a7 = a(a6, aaaVar, a4, aaeVar);
        aaiVar.a(a7);
        aah.a(a6, aaaVar, a4, a7, aaeVar);
        aaiVar.a(aaeVar);
        return aaiVar;
    }

    static int a(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static aab a(String str, String str2) {
        if ("Shift_JIS".equals(str2)) {
            return a(str) ? aab.KANJI : aab.BYTE;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (a(charAt) == -1) {
                return aab.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return aab.ALPHANUMERIC;
        }
        if (z2) {
            return aab.NUMERIC;
        }
        return aab.BYTE;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int a(zu zuVar, aaa aaaVar, aac aacVar, aae aaeVar) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            aah.a(zuVar, aaaVar, aacVar, i3, aaeVar);
            int a2 = a(aaeVar);
            if (a2 < i) {
                i2 = i3;
                i = a2;
            }
        }
        return i2;
    }

    private static aac a(int i, aaa aaaVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            aac a2 = aac.a(i2);
            if (a2.b() - a2.a(aaaVar).c() >= (i + 7) / 8) {
                return a2;
            }
        }
        throw new zt("Data too big");
    }

    static void a(int i, zu zuVar) {
        int i2 = i * 8;
        if (zuVar.a() > i2) {
            throw new zt("data bits cannot fit in the QR Code" + zuVar.a() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && zuVar.a() < i2; i3++) {
            zuVar.a(false);
        }
        int a2 = zuVar.a() & 7;
        if (a2 > 0) {
            while (a2 < 8) {
                zuVar.a(false);
                a2++;
            }
        }
        int b = i - zuVar.b();
        for (int i4 = 0; i4 < b; i4++) {
            zuVar.a((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (zuVar.a() != i2) {
            throw new zt("Bits size does not equal capacity");
        }
    }

    static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 >= i3) {
            throw new zt("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new zt("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new zt("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new zt("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
            return;
        }
        iArr[0] = i10;
        iArr2[0] = i12;
    }

    static zu a(zu zuVar, int i, int i2, int i3) {
        if (zuVar.b() != i2) {
            throw new zt("Number of bits and data bytes does not match");
        }
        ArrayList<aad> arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            a(i, i2, i3, i7, iArr, iArr2);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            zuVar.a(i4 * 8, bArr, 0, i8);
            byte[] a2 = a(bArr, iArr2[0]);
            arrayList.add(new aad(bArr, a2));
            i5 = Math.max(i5, i8);
            i6 = Math.max(i6, a2.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new zt("Data bytes does not match offset");
        }
        zu zuVar2 = new zu();
        for (int i9 = 0; i9 < i5; i9++) {
            for (aad aadVar : arrayList) {
                byte[] a3 = aadVar.a();
                if (i9 < a3.length) {
                    zuVar2.a(a3[i9], 8);
                }
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            for (aad aadVar2 : arrayList) {
                byte[] b = aadVar2.b();
                if (i10 < b.length) {
                    zuVar2.a(b[i10], 8);
                }
            }
        }
        if (i == zuVar2.b()) {
            return zuVar2;
        }
        throw new zt("Interleaving error: " + i + " and " + zuVar2.b() + " differ.");
    }

    static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new zz(zx.e).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void a(aab aabVar, zu zuVar) {
        zuVar.a(aabVar.a(), 4);
    }

    static void a(int i, aac aacVar, aab aabVar, zu zuVar) {
        int a2 = aabVar.a(aacVar);
        int i2 = 1 << a2;
        if (i >= i2) {
            throw new zt(i + " is bigger than " + (i2 - 1));
        }
        zuVar.a(i, a2);
    }

    static void a(String str, aab aabVar, zu zuVar, String str2) {
        switch (aabVar) {
            case NUMERIC:
                a((CharSequence) str, zuVar);
                return;
            case ALPHANUMERIC:
                b(str, zuVar);
                return;
            case BYTE:
                a(str, zuVar, str2);
                return;
            case KANJI:
                a(str, zuVar);
                return;
            default:
                throw new zt("Invalid mode: " + aabVar);
        }
    }

    static void a(CharSequence charSequence, zu zuVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                zuVar.a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    zuVar.a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    zuVar.a(charAt, 4);
                }
            }
        }
    }

    static void b(CharSequence charSequence, zu zuVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a2 = a(charSequence.charAt(i));
            if (a2 == -1) {
                throw new zt();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int a3 = a(charSequence.charAt(i2));
                if (a3 == -1) {
                    throw new zt();
                }
                zuVar.a((a2 * 45) + a3, 11);
                i += 2;
            } else {
                zuVar.a(a2, 6);
                i = i2;
            }
        }
    }

    static void a(String str, zu zuVar, String str2) {
        try {
            for (byte b : str.getBytes(str2)) {
                zuVar.a(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new zt(e);
        }
    }

    static void a(String str, zu zuVar) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i = 0; i < length; i += 2) {
                int i2 = ((bytes[i] & 255) << 8) | (bytes[i + 1] & 255);
                int i3 = (i2 < 33088 || i2 > 40956) ? (i2 < 57408 || i2 > 60351) ? -1 : i2 - 49472 : i2 - 33088;
                if (i3 == -1) {
                    throw new zt("Invalid byte sequence");
                }
                zuVar.a(((i3 >> 8) * 192) + (i3 & 255), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new zt(e);
        }
    }

    private static void a(zw zwVar, zu zuVar) {
        zuVar.a(aab.ECI.a(), 4);
        zuVar.a(zwVar.a(), 8);
    }
}
