package com.xiaopeng.musicradio.commonui.vui;

import android.text.TextUtils;
import android.view.View;
import com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class VuiBaseConstraintLayout<UIInterface, Presenter extends BasePresenter<UIInterface>> extends BaseConstraintLayout<UIInterface, Presenter> implements bie {
    public String getSceneId() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (TextUtils.isEmpty(getSceneId())) {
            return;
        }
        VuiEngine.getInstance(getContext()).addVuiSceneListener(getSceneId(), this, this);
    }

    public List<String> getSubSceneList() {
        return Collections.emptyList();
    }

    public List<View> getBuildViewList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        return arrayList;
    }
}
