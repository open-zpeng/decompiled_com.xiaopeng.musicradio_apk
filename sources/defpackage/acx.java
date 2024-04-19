package defpackage;

import java.util.Map;
/* compiled from: CustomQRCodeWriter.java */
/* renamed from: acx  reason: default package */
/* loaded from: classes2.dex */
public final class acx {
    public zv a(String str, zr zrVar, int i, int i2, Map<zs, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (zrVar != zr.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + zrVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            aaa aaaVar = aaa.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(zs.ERROR_CORRECTION)) {
                    aaaVar = aaa.valueOf(map.get(zs.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(zs.MARGIN)) {
                    i3 = Integer.parseInt(map.get(zs.MARGIN).toString());
                }
            }
            return a(aaf.a(str, aaaVar, map), i, i2, i3);
        }
    }

    private static zv a(aai aaiVar, int i, int i2, int i3) {
        aae a = aaiVar.a();
        if (a == null) {
            throw new IllegalStateException();
        }
        int b = a.b();
        int a2 = a.a();
        int i4 = i3 * 2;
        int i5 = b + i4;
        int i6 = i4 + a2;
        int min = Math.min(i, i2);
        int a3 = a(i5, min);
        if (a3 > 0) {
            int i7 = a3 * i5;
            int i8 = i7 + (((min - i7) / 4) * i3);
            if (i == i2) {
                i = i8;
                i2 = i;
            } else if (i > i2) {
                i = (i * i8) / i2;
                i2 = i8;
            } else {
                i2 = (i2 * i8) / i;
                i = i8;
            }
        }
        int max = Math.max(i, i5);
        int max2 = Math.max(i2, i6);
        int min2 = Math.min(max / i5, max2 / i6);
        int i9 = (max - (b * min2)) / 2;
        int i10 = (max2 - (a2 * min2)) / 2;
        zv zvVar = new zv(max, max2);
        int i11 = 0;
        while (i11 < a2) {
            int i12 = 0;
            int i13 = i9;
            while (i12 < b) {
                if (a.a(i12, i11) == 1) {
                    zvVar.a(i13, i10, min2, min2);
                }
                i12++;
                i13 += min2;
            }
            i11++;
            i10 += min2;
        }
        return zvVar;
    }

    private static int a(int i, int i2) {
        if (i >= i2) {
            return 0;
        }
        int i3 = i2 / i;
        if (i2 - (i * i3) < i2 * 0.04d) {
            return 0;
        }
        return i3;
    }
}
