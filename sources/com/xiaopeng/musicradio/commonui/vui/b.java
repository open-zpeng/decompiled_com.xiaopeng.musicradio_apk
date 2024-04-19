package com.xiaopeng.musicradio.commonui.vui;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import java.util.Collections;
import java.util.List;
/* compiled from: VuiFragment.java */
/* loaded from: classes.dex */
public abstract class b<UIInterface, Presenter extends BasePresenter<UIInterface>> extends com.xiaopeng.musicradio.commonui.base.b<UIInterface, Presenter> implements bie {
    public boolean n() {
        return true;
    }

    public String o() {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.d("VuiFragment", "onResume:" + o());
        q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.d("VuiFragment", "onPause:" + o());
        m();
    }

    public void m() {
        afd.b(o());
        if (TextUtils.isEmpty(o()) || !n()) {
            return;
        }
        VuiEngine.getInstance(getContext()).exitScene(o());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void c() {
        a(k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        b(k());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (!I_()) {
            a(false);
        } else {
            a(true);
        }
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

    public void onBuildScene() {
        if (TextUtils.isEmpty(o()) || k() == null) {
            return;
        }
        VuiEngine.getInstance(getContext()).buildScene(o(), k(), p(), n());
    }

    public List<String> p() {
        return Collections.emptyList();
    }

    public void q() {
        afd.a(o());
        if (TextUtils.isEmpty(o()) || !n()) {
            return;
        }
        VuiEngine.getInstance(getContext()).enterScene(o());
    }

    public void a(View view) {
        if (TextUtils.isEmpty(o()) || view == null) {
            return;
        }
        VuiEngine.getInstance(getContext()).addVuiSceneListener(o(), view, (bie) this, true);
    }

    public void b(View view) {
        if (TextUtils.isEmpty(o()) || view == null) {
            return;
        }
        VuiEngine.getInstance(getContext()).addVuiSceneListener(o(), view, (bie) this, false);
    }

    public void a(boolean z) {
        if (TextUtils.isEmpty(o())) {
            return;
        }
        VuiEngine.getInstance(getContext()).removeVuiSceneListener(o(), this, z);
    }
}
