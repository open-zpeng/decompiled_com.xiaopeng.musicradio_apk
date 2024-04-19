package com.xiaopeng.musicradio.widget.mvpbase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class VuiBaseFrameLayout<UIInterface, Presenter extends e<UIInterface>> extends c<UIInterface, Presenter> implements bie {
    public boolean isCanBuild;
    public boolean needBuild;

    protected abstract String getScene();

    protected abstract List<String> getSubSceneList();

    @Override // defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
    }

    public VuiBaseFrameLayout(Context context) {
        super(context);
        this.isCanBuild = true;
        this.needBuild = false;
    }

    public VuiBaseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isCanBuild = true;
        this.needBuild = false;
    }

    public VuiBaseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isCanBuild = true;
        this.needBuild = false;
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
        if (this.isCanBuild) {
            this.needBuild = false;
            setVuiMode(bij.NORMAL);
            setVuiElementType(bih.GROUP);
            setVuiLabel("");
            VuiEngine.getInstance(getContext()).buildScene(getScene(), (View) this, getSubSceneList(), true);
            return;
        }
        this.needBuild = true;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreateView() {
        super.onCreateView();
        VuiEngine.getInstance(getContext()).addVuiSceneListener(getScene(), this, this);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroyView() {
        super.onDestroyView();
        VuiEngine.getInstance(getContext()).removeVuiSceneListener(getScene(), this);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportVisible() {
        super.onSupportVisible();
        VuiEngine.getInstance(getContext()).enterScene(getScene());
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportInvisible() {
        super.onSupportInvisible();
        VuiEngine.getInstance(getContext()).exitScene(getScene());
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c, com.xiaopeng.musicradio.widget.lifecycle.d, com.xiaopeng.musicradio.widget.lifecycle.h
    public void onPause() {
        super.onPause();
        VuiEngine.getInstance(getContext()).exitScene(getScene());
    }
}
