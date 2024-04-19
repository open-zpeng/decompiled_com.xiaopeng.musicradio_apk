package defpackage;

import android.os.Build;
import android.view.ViewGroup;
/* compiled from: MarginLayoutParamsCompat.java */
/* renamed from: gy  reason: default package */
/* loaded from: classes3.dex */
public final class gy {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static void b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }
}
