package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.vu;
/* compiled from: MaterialThemeOverlay.java */
/* renamed from: yc  reason: default package */
/* loaded from: classes3.dex */
public class yc {
    private static final int[] a = {16842752, vu.b.theme};
    private static final int[] b = {vu.b.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        int b2 = b(context, attributeSet, i, i2);
        boolean z = (context instanceof ak) && ((ak) context).getThemeResId() == b2;
        if (b2 == 0 || z) {
            return context;
        }
        ak akVar = new ak(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            akVar.getTheme().applyStyle(a2, true);
        }
        return akVar;
    }

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
