package com.xiaopeng.musicradio.mine.common.presenter;

import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.datalist.m;
/* loaded from: classes.dex */
public abstract class MineBasePresenter<UIInterface> extends BasePresenter<UIInterface> {
    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c() {
        if (a() instanceof m) {
            return ((m) a()).i_();
        }
        return a() != null;
    }
}
