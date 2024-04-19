package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
/* compiled from: MaterialColors.java */
/* renamed from: wp  reason: default package */
/* loaded from: classes3.dex */
public class wp {
    public static int a(View view, int i) {
        return wz.a(view, i);
    }

    public static int a(Context context, int i, String str) {
        return wz.a(context, i, str);
    }

    public static int a(View view, int i, int i2) {
        return a(view.getContext(), i, i2);
    }

    public static int a(Context context, int i, int i2) {
        TypedValue a = wz.a(context, i);
        return a != null ? a.data : i2;
    }

    public static int a(View view, int i, int i2, float f) {
        return a(a(view, i), a(view, i2), f);
    }

    public static int a(int i, int i2, float f) {
        return a(i, fd.b(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int a(int i, int i2) {
        return fd.a(i2, i);
    }
}
