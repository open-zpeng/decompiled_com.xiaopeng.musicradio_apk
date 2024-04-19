package defpackage;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
/* compiled from: RippleUtils.java */
/* renamed from: xf  reason: default package */
/* loaded from: classes3.dex */
public class xf {
    public static final boolean a;
    static final String b;
    private static final int[] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;

    static {
        a = Build.VERSION.SDK_INT >= 21;
        c = new int[]{16842919};
        d = new int[]{16843623, 16842908};
        e = new int[]{16842908};
        f = new int[]{16843623};
        g = new int[]{16842913, 16842919};
        h = new int[]{16842913, 16843623, 16842908};
        i = new int[]{16842913, 16842908};
        j = new int[]{16842913, 16843623};
        k = new int[]{16842913};
        l = new int[]{16842910, 16842919};
        b = xf.class.getSimpleName();
    }

    private xf() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (a) {
            return new ColorStateList(new int[][]{k, StateSet.NOTHING}, new int[]{a(colorStateList, g), a(colorStateList, c)});
        }
        int[] iArr = g;
        int[] iArr2 = h;
        int[] iArr3 = i;
        int[] iArr4 = j;
        int[] iArr5 = c;
        int[] iArr6 = d;
        int[] iArr7 = e;
        int[] iArr8 = f;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, k, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{a(colorStateList, iArr), a(colorStateList, iArr2), a(colorStateList, iArr3), a(colorStateList, iArr4), 0, a(colorStateList, iArr5), a(colorStateList, iArr6), a(colorStateList, iArr7), a(colorStateList, iArr8), 0});
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(l, 0)) != 0) {
                Log.w(b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908) {
                z2 = true;
            } else if (i2 == 16842919) {
                z2 = true;
            } else if (i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? a(colorForState) : colorForState;
    }

    @TargetApi(21)
    private static int a(int i2) {
        return fd.b(i2, Math.min(Color.alpha(i2) * 2, 255));
    }
}
