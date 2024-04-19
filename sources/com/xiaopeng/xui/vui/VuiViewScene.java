package com.xiaopeng.xui.vui;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.xiaopeng.xui.Xui;
import com.xiaopeng.xui.utils.XLogUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class VuiViewScene implements bie, IVuiViewScene {
    private View mRootView;
    private bie mVuiSceneListener;
    private bid mVuiEngine = null;
    private String mSceneId = "";
    private bic mVuiElementListener = null;
    private List<Integer> customViewIds = null;
    private Handler mHandler = new Handler();
    private View.OnAttachStateChangeListener mOnAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.xiaopeng.xui.vui.VuiViewScene.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (Xui.isVuiEnable()) {
                VuiViewScene.this.createVuiScene();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (Xui.isVuiEnable()) {
                VuiViewScene.this.destroyVuiScene();
            }
        }
    };
    bib mListener = new bib() { // from class: com.xiaopeng.xui.vui.-$$Lambda$VuiViewScene$vN8nVEsgpSQJlHcaOOUvdB2WGO0
        @Override // defpackage.bib
        public final void onVuiElementChaned(View view, bil bilVar) {
            VuiViewScene.lambda$new$1(VuiViewScene.this, view, bilVar);
        }
    };
    private boolean isUseNewProtocol = false;

    protected abstract void onBuildScenePrepare();

    /* JADX INFO: Access modifiers changed from: protected */
    public void setVuiView(View view) {
        log("initVui");
        if (Xui.isVuiEnable()) {
            View view2 = this.mRootView;
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this.mOnAttachStateChangeListener);
            }
            this.mRootView = view;
            view.addOnAttachStateChangeListener(this.mOnAttachStateChangeListener);
        }
    }

    @Override // defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        log("VuiViewScene onVuiEvent");
        if (view == null) {
            return;
        }
        bic bicVar = this.mVuiElementListener;
        if (bicVar != null) {
            bicVar.onVuiElementEvent(view, bioVar);
        } else {
            VuiFloatingLayerManager.show(view);
        }
    }

    @Override // defpackage.bie
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        log("onInterceptVuiEvent");
        if (view == null) {
            return false;
        }
        bic bicVar = this.mVuiElementListener;
        if (bicVar != null) {
            return bicVar.onVuiElementEvent(view, bioVar);
        }
        VuiFloatingLayerManager.show(view);
        return false;
    }

    @Override // defpackage.bie
    public void onBuildScene() {
        this.mHandler.post(new Runnable() { // from class: com.xiaopeng.xui.vui.-$$Lambda$VuiViewScene$bhRg6IeHfpBu4ffKtyCCDOAoC1Q
            @Override // java.lang.Runnable
            public final void run() {
                VuiViewScene.lambda$onBuildScene$0(VuiViewScene.this);
            }
        });
    }

    public static /* synthetic */ void lambda$onBuildScene$0(VuiViewScene vuiViewScene) {
        bid bidVar = vuiViewScene.mVuiEngine;
        String str = vuiViewScene.mSceneId;
        View view = vuiViewScene.mRootView;
        if (bidVar == null || str == null || view == null) {
            return;
        }
        int vuiDisplayLocation = vuiViewScene.getVuiDisplayLocation();
        vuiViewScene.log("onBuildScene:" + vuiDisplayLocation);
        vuiViewScene.onBuildScenePrepare();
        bidVar.buildScene(str, view, vuiViewScene.customViewIds, vuiViewScene.mVuiElementListener, String.valueOf(vuiDisplayLocation), vuiViewScene);
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public void setVuiSceneId(String str) {
        this.mSceneId = str;
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public void setVuiEngine(bid bidVar) {
        this.mVuiEngine = bidVar;
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public void setVuiElementListener(bic bicVar) {
        this.mVuiElementListener = bicVar;
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public void setCustomViewIdList(List<Integer> list) {
        this.customViewIds = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVuiScene() {
        bid bidVar = this.mVuiEngine;
        String str = this.mSceneId;
        View view = this.mRootView;
        if (bidVar == null || str == null || view == null) {
            return;
        }
        log("createVuiScene");
        try {
            if (this.isUseNewProtocol) {
                bidVar.addVuiSceneListener(str, view, this, this.mListener);
            } else {
                bidVar.addVuiSceneListener(str, view, this);
            }
        } catch (AbstractMethodError unused) {
            bidVar.addVuiSceneListener(str, view, this);
        }
        bidVar.enterScene(str, String.valueOf(getVuiDisplayLocation()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyVuiScene() {
        if (this.mVuiEngine != null && this.mSceneId != null) {
            log("destroyVuiScene");
            this.mVuiEngine.exitScene(this.mSceneId, String.valueOf(getVuiDisplayLocation()), this);
            this.mVuiEngine.removeVuiSceneListener(this.mSceneId, this);
            this.mVuiEngine = null;
        }
        if (this.mVuiElementListener != null) {
            this.mVuiElementListener = null;
        }
        if (this.mVuiSceneListener != null) {
            this.mVuiSceneListener = null;
        }
    }

    private void log(String str) {
        XLogUtils.d("VuiViewScene", " mSceneId " + this.mSceneId + "  " + str + " hashcode " + hashCode() + " name " + getClass().getSimpleName());
    }

    public static /* synthetic */ void lambda$new$1(VuiViewScene vuiViewScene, View view, bil bilVar) {
        bid bidVar = vuiViewScene.mVuiEngine;
        String str = vuiViewScene.mSceneId;
        if (bidVar == null || TextUtils.isEmpty(str) || view == null) {
            return;
        }
        if (bil.UPDATE_VIEW.equals(bilVar)) {
            bidVar.updateScene(str, view);
        } else {
            bidVar.updateElementAttribute(str, view);
        }
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public void initVuiScene(String str, bid bidVar) {
        this.mSceneId = str;
        this.mVuiEngine = bidVar;
        this.isUseNewProtocol = true;
    }

    @Override // com.xiaopeng.xui.vui.IVuiViewScene
    public void initVuiScene(String str, bid bidVar, bie bieVar) {
        this.mSceneId = str;
        this.mVuiEngine = bidVar;
        this.isUseNewProtocol = true;
        this.mVuiSceneListener = bieVar;
    }

    @Override // defpackage.bie
    public void onVuiStateChanged() {
        bie bieVar = this.mVuiSceneListener;
        if (bieVar != null) {
            bieVar.onVuiStateChanged();
        }
    }
}
