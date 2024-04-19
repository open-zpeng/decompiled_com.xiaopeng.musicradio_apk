package com.to.aboomy.banner;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes.dex */
public class ScaleInTransformer implements ViewPager.g {
    private static final float DEFAULT_CENTER = 0.5f;
    private float mMinScale;

    public ScaleInTransformer() {
        this.mMinScale = 0.85f;
    }

    public ScaleInTransformer(float f) {
        this.mMinScale = 0.85f;
        this.mMinScale = f;
    }

    @Override // androidx.viewpager.widget.ViewPager.g
    public void transformPage(View view, float f) {
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2);
        view.setPivotX(width / 2);
        if (f < -1.0f) {
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            view.setPivotX(width);
        } else if (f > 1.0f) {
            view.setPivotX(0.0f);
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
        } else if (f < 0.0f) {
            float f2 = this.mMinScale;
            float f3 = ((f + 1.0f) * (1.0f - f2)) + f2;
            view.setScaleX(f3);
            view.setScaleY(f3);
            view.setPivotX(width * (((-f) * DEFAULT_CENTER) + DEFAULT_CENTER));
        } else {
            float f4 = 1.0f - f;
            float f5 = this.mMinScale;
            float f6 = ((1.0f - f5) * f4) + f5;
            view.setScaleX(f6);
            view.setScaleY(f6);
            view.setPivotX(width * f4 * DEFAULT_CENTER);
        }
    }
}
