package defpackage;

import android.os.Build;
import android.view.View;
/* compiled from: BottomScalePageTransformer.java */
/* renamed from: bei  reason: default package */
/* loaded from: classes2.dex */
public class bei extends beh {
    private float a = 1.0f;
    private float b = 0.85f;

    @Override // androidx.viewpager.widget.ViewPager.g
    public void transformPage(View view, float f) {
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = f < 0.0f ? f + 1.0f : 1.0f - f;
        float f3 = this.a;
        float f4 = this.b;
        float f5 = f4 + (f2 * ((f3 - f4) / 1.0f));
        view.setScaleX(f5);
        view.setScaleY(f5);
        if (Build.VERSION.SDK_INT < 19) {
            view.getParent().requestLayout();
        }
    }
}
