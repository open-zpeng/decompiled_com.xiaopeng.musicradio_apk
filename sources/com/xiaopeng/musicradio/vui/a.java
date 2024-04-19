package com.xiaopeng.musicradio.vui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
/* compiled from: VuiDialog.java */
/* loaded from: classes2.dex */
public class a extends Dialog implements bie {
    public String c;

    public View i() {
        return null;
    }

    @Override // defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
    }

    public a(Context context, int i) {
        super(context, i);
        this.c = "";
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Log.i("VuiDialog", "onStart scenceId:" + this.c + ",mRootView:" + i());
        if (TextUtils.isEmpty(this.c) || i() == null) {
            return;
        }
        VuiEngine.getInstance(getContext()).addVuiSceneListener(this.c, i(), this);
        Log.i("VuiDialog", "onStart: enterScene =======");
        VuiEngine.getInstance(getContext()).enterScene(this.c);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        Log.i("VuiDialog", "onStop scenceId:" + this.c + ",mRootView:" + i());
        if (TextUtils.isEmpty(this.c) || i() == null) {
            return;
        }
        VuiEngine.getInstance(getContext()).exitScene(this.c);
        Log.i("VuiDialog", "onStop: exitScene");
        VuiEngine.getInstance(getContext()).removeVuiSceneListener(this.c, this);
    }

    @Override // defpackage.bie
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        if (view == null || view.getVisibility() == 8) {
            return false;
        }
        VuiFloatingLayerManager.show(view);
        return false;
    }

    @Override // defpackage.bie
    public void onBuildScene() {
        Log.i("VuiDialog", "onBuildScene: " + this.c + " rootView = " + i());
        if (TextUtils.isEmpty(this.c) || i() == null) {
            return;
        }
        Log.i("VuiDialog", "onBuildScene: buildScene========");
        VuiEngine.getInstance(getContext()).buildScene(this.c, i());
    }
}
