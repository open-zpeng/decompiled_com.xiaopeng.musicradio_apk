package com.xiaopeng.speech.vui.event;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.VuiUtils;
/* loaded from: classes2.dex */
public class ScrollByXEvent extends BaseEvent {
    @Override // com.xiaopeng.speech.vui.event.IVuiEvent
    public <T extends View> T run(T t, bin binVar) {
        String str;
        ViewPager viewPager;
        int extraPage;
        int extraPage2;
        if (t == null || binVar == null || binVar.getResultActions() == null || binVar.getResultActions().isEmpty() || !big.SCROLLBYX.a().equals(binVar.getResultActions().get(0)) || (str = (String) VuiUtils.getValueByName(binVar, VuiConstants.EVENT_VALUE_DIRECTION)) == null) {
            return t;
        }
        boolean z = t instanceof bhz;
        if (z) {
            ((bhz) t).setPerformVuiAction(true);
        }
        LogUtils.i("ScrollByXEvent run direction:" + str);
        if (binVar.type.equals(bih.VIEWPAGER.a())) {
            if (!(t instanceof ViewPager)) {
                viewPager = VuiUtils.findViewPager(t);
            } else {
                viewPager = (ViewPager) t;
            }
            if (viewPager != null) {
                boolean canScrollHorizontally = viewPager.canScrollHorizontally(-1);
                boolean canScrollHorizontally2 = viewPager.canScrollHorizontally(1);
                int currentItem = viewPager.getCurrentItem();
                if ("left".equals(str)) {
                    int i = currentItem - 1;
                    if (canScrollHorizontally) {
                        viewPager.setCurrentItem(i, false);
                    } else if (canScrollHorizontally2 && (extraPage2 = VuiUtils.getExtraPage(binVar)) != -1) {
                        viewPager.setCurrentItem((viewPager.getAdapter().getCount() - 1) - extraPage2, false);
                    }
                } else {
                    int i2 = currentItem + 1;
                    if (canScrollHorizontally2) {
                        viewPager.setCurrentItem(i2, false);
                    } else if (canScrollHorizontally && (extraPage = VuiUtils.getExtraPage(binVar)) != -1) {
                        viewPager.setCurrentItem(extraPage, false);
                    }
                }
            }
        } else {
            binVar.type.equals(bih.SCROLLVIEW.a());
        }
        if (z) {
            ((bhz) t).setPerformVuiAction(false);
        }
        return t;
    }
}
