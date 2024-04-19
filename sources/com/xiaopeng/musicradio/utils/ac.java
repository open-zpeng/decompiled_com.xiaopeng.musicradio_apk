package com.xiaopeng.musicradio.utils;

import android.view.View;
import com.xiaopeng.xui.utils.XTouchUtils;
import java.util.ArrayList;
/* compiled from: ItemClickUtil.java */
/* loaded from: classes2.dex */
public class ac {
    public static void a(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new XTouchUtils.TouchParams.TouchParamsBulider().setType(2).setAnimationType(1).setStartValue(1.0f).setEndValue(0.9f).setDuration(100).setInterpolator(XTouchUtils.DEFAULT_INTERPOLATOR).setTarget(view).build());
        XTouchUtils.wrapTouchAnim(view2, arrayList);
    }
}
