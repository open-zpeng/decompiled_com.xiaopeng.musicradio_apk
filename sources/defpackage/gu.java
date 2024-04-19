package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
/* compiled from: GravityCompat.java */
/* renamed from: gu  reason: default package */
/* loaded from: classes3.dex */
public final class gu {
    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static int a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }
}
