package com.xiaopeng.speech.vui.observer;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.LogUtils;
/* loaded from: classes2.dex */
public class VuiLifecycleObserver implements h {
    private static final String TAG = "VuiLifecycleObserver";
    private Context mContext;
    private bib mElementChangedListener;
    private boolean mKeepCache;
    private f mLifeCycle;
    private bie mListener;
    private boolean mNeedBuild;
    private View mRootView;
    private String mSceneId;

    public VuiLifecycleObserver(Context context, f fVar, String str, View view, bie bieVar, bib bibVar, boolean z, boolean z2) {
        this.mSceneId = str;
        this.mListener = bieVar;
        this.mContext = context;
        this.mLifeCycle = fVar;
        this.mRootView = view;
        this.mElementChangedListener = bibVar;
        this.mKeepCache = z2;
        this.mNeedBuild = z;
    }

    @p(a = f.a.ON_CREATE)
    public void onCreate() {
        LogUtils.d(TAG, "onCreate: " + this.mSceneId + ",rootView:" + this.mRootView);
        if (this.mContext == null || TextUtils.isEmpty(this.mSceneId) || this.mRootView == null) {
            return;
        }
        VuiEngine.getInstance(this.mContext).addVuiSceneListener(this.mSceneId, this.mRootView, this.mListener, this.mElementChangedListener, this.mNeedBuild);
    }

    @p(a = f.a.ON_RESUME)
    public void onResume() {
        LogUtils.d(TAG, "onResume: " + this.mSceneId);
        if (this.mContext == null || TextUtils.isEmpty(this.mSceneId) || this.mSceneId.contains("Local") || this.mSceneId.contains("local")) {
            return;
        }
        VuiEngine.getInstance(this.mContext).enterScene(this.mSceneId);
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause() {
        LogUtils.d(TAG, "onPause: " + this.mSceneId);
        if (this.mContext == null || TextUtils.isEmpty(this.mSceneId) || this.mSceneId.contains("Local") || this.mSceneId.contains("local")) {
            return;
        }
        VuiEngine.getInstance(this.mContext).exitScene(this.mSceneId);
    }

    @p(a = f.a.ON_DESTROY)
    public void onDestroy() {
        LogUtils.d(TAG, "onDestroy: " + this.mSceneId);
        if (this.mContext != null && !TextUtils.isEmpty(this.mSceneId)) {
            VuiEngine.getInstance(this.mContext).removeVuiSceneListener(this.mSceneId, this.mListener, this.mKeepCache);
        }
        f fVar = this.mLifeCycle;
        if (fVar != null) {
            fVar.b(this);
        }
    }
}
