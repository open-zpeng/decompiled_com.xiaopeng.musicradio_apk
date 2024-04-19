package com.to.aboomy.banner;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes.dex */
public interface Indicator extends ViewPager.f {
    RelativeLayout.LayoutParams getParams();

    View getView();

    void initIndicatorCount(int i);
}
