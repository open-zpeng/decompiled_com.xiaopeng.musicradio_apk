package com.xiaopeng.musicradio.commonui.vui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: VuiActivity.java */
/* loaded from: classes.dex */
public abstract class a<UIInterface, Presenter extends BasePresenter<UIInterface>> extends com.xiaopeng.musicradio.commonui.base.a<UIInterface, Presenter> implements bie {
    public String m() {
        return "";
    }

    public boolean o() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onCreateVuiScene(getWindow().getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("VuiActivity", "onNewIntent:" + m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.d("VuiActivity", "onResume:" + m());
        if (TextUtils.isEmpty(m()) || !o()) {
            return;
        }
        VuiEngine.getInstance(this).enterScene(m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        Log.d("VuiActivity", "onPause:" + m());
        if (TextUtils.isEmpty(m()) || !o()) {
            return;
        }
        VuiEngine.getInstance(this).exitScene(m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (TextUtils.isEmpty(m())) {
            return;
        }
        VuiEngine.getInstance(this).removeVuiSceneListener(m(), this);
    }

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

    public void onCreateVuiScene(View view) {
        if (TextUtils.isEmpty(m())) {
            return;
        }
        VuiEngine.getInstance(this).addVuiSceneListener(m(), view, this);
    }

    @Override // defpackage.bie
    public void onBuildScene() {
        if (TextUtils.isEmpty(m())) {
            return;
        }
        VuiEngine.getInstance(this).buildScene(m(), p(), n(), o());
    }

    public List<String> n() {
        return Collections.emptyList();
    }

    public List<View> p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getWindow().getDecorView());
        return arrayList;
    }
}
