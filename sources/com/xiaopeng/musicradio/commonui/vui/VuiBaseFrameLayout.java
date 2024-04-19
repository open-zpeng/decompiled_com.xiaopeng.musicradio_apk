package com.xiaopeng.musicradio.commonui.vui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class VuiBaseFrameLayout<UIInterface, Presenter extends BasePresenter<UIInterface>> extends BaseFrameLayout<UIInterface, Presenter> implements bie {
    private boolean c;

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public String getSceneId() {
        return "";
    }

    public boolean getVuiVisible() {
        return true;
    }

    public VuiBaseFrameLayout(Context context) {
        super(context);
        this.c = false;
    }

    public VuiBaseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
    }

    public VuiBaseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (TextUtils.isEmpty(getSceneId())) {
            return;
        }
        VuiEngine.getInstance(getContext()).addVuiSceneListener(getSceneId(), (View) this, (bie) this, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        Log.d("VuiBaseFrameLayout", "onResume:" + getSceneId() + ",vuiVisible:" + getVuiVisible());
        if (!TextUtils.isEmpty(getSceneId()) && e() && getVuiVisible()) {
            if (this.c && f()) {
                VuiEngine.getInstance(getContext()).addVuiSceneListener(getSceneId(), (View) this, (bie) this, false);
                this.c = false;
            }
            VuiEngine.getInstance(getContext()).enterScene(getSceneId());
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onPause(i iVar) {
        super.onPause(iVar);
        Log.d("VuiBaseFrameLayout", "onPause:" + getSceneId());
        if (TextUtils.isEmpty(getSceneId()) || !e()) {
            return;
        }
        VuiEngine.getInstance(getContext()).exitScene(getSceneId());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        this.c = true;
        if (TextUtils.isEmpty(getSceneId())) {
            return;
        }
        VuiEngine.getInstance(getContext()).removeVuiSceneListener(getSceneId(), this, f());
    }

    @Override // defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null) {
            return;
        }
        VuiFloatingLayerManager.show(view);
    }

    @Override // defpackage.bie
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        if (view != null) {
            VuiFloatingLayerManager.show(view);
            return false;
        }
        return false;
    }

    @Override // defpackage.bie
    public void onBuildScene() {
        if (TextUtils.isEmpty(getSceneId())) {
            return;
        }
        VuiEngine.getInstance(getContext()).buildScene(getSceneId(), getBuildViewList(), getSubSceneList(), e());
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
