package com.xiaopeng.speech.vui.observer;

import android.text.TextUtils;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import com.xiaopeng.speech.vui.listener.IXpVuiSceneListener;
import com.xiaopeng.speech.vui.utils.LogUtils;
/* loaded from: classes2.dex */
public class XpVuiLifecycleObserver implements h {
    private static final String TAG = "VuiLifecycleObserver";
    private f mLifeCycle;
    private IXpVuiSceneListener mListener;
    private String mSceneId;

    public XpVuiLifecycleObserver(String str, IXpVuiSceneListener iXpVuiSceneListener, f fVar) {
        this.mSceneId = str;
        this.mListener = iXpVuiSceneListener;
        this.mLifeCycle = fVar;
    }

    @p(a = f.a.ON_CREATE)
    public void onCreate() {
        LogUtils.d(TAG, "onCreate: " + this.mSceneId);
        if (TextUtils.isEmpty(this.mSceneId)) {
            return;
        }
        bff.a(this.mSceneId, this.mListener);
    }

    @p(a = f.a.ON_RESUME)
    public void onResume() {
        LogUtils.d(TAG, "onResume: " + this.mSceneId);
        if (TextUtils.isEmpty(this.mSceneId)) {
            return;
        }
        bff.a(this.mSceneId);
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause() {
        LogUtils.d(TAG, "onPause: " + this.mSceneId);
        if (TextUtils.isEmpty(this.mSceneId)) {
            return;
        }
        bff.b(this.mSceneId);
    }

    @p(a = f.a.ON_DESTROY)
    public void onDestroy() {
        LogUtils.d(TAG, "onDestroy: " + this.mSceneId);
        if (!TextUtils.isEmpty(this.mSceneId)) {
            bff.b(this.mSceneId, this.mListener);
        }
        f fVar = this.mLifeCycle;
        if (fVar != null) {
            fVar.b(this);
        }
    }
}
