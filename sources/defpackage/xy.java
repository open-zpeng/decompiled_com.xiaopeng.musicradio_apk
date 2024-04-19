package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ElasticTabIndicatorInterpolator.java */
/* renamed from: xy  reason: default package */
/* loaded from: classes3.dex */
public class xy extends xz {
    private static float a(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    private static float b(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.xz
    public void a(yb ybVar, View view, View view2, float f, Drawable drawable) {
        float a;
        float b;
        RectF a2 = a(ybVar, view);
        RectF a3 = a(ybVar, view2);
        if (a2.left < a3.left) {
            a = b(f);
            b = a(f);
        } else {
            a = a(f);
            b = b(f);
        }
        drawable.setBounds(vv.a((int) a2.left, (int) a3.left, a), drawable.getBounds().top, vv.a((int) a2.right, (int) a3.right, b), drawable.getBounds().bottom);
    }
}
