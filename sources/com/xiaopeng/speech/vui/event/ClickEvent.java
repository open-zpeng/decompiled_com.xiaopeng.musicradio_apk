package com.xiaopeng.speech.vui.event;

import android.view.View;
import com.xiaopeng.speech.vui.utils.LogUtils;
/* loaded from: classes2.dex */
public class ClickEvent extends BaseEvent {
    @Override // com.xiaopeng.speech.vui.event.IVuiEvent
    public <T extends View> T run(T t, bin binVar) {
        if (t != null) {
            boolean z = t instanceof bhz;
            if (z) {
                ((bhz) t).setPerformVuiAction(true);
            }
            boolean performClick = t.performClick();
            LogUtils.i("ClickEvent run :" + performClick);
            if (!performClick && z) {
                ((bhz) t).setPerformVuiAction(false);
            }
        }
        return t;
    }
}
