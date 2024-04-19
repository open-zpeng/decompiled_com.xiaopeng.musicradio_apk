package com.xiaopeng.musicradio.commonui.lifecycle;

import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.EventBus;
/* loaded from: classes.dex */
public abstract class BasePresenter<UIInterface> implements a {
    protected Reference<UIInterface> a;

    @p(a = f.a.ON_CREATE)
    public void onCreate(i iVar) {
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause(i iVar) {
    }

    @p(a = f.a.ON_RESUME)
    public void onResume(i iVar) {
    }

    @p(a = f.a.ON_START)
    public void onStart(i iVar) {
    }

    @p(a = f.a.ON_STOP)
    public void onStop(i iVar) {
    }

    public void a(UIInterface uiinterface) {
        this.a = new WeakReference(uiinterface);
    }

    public UIInterface a() {
        Reference<UIInterface> reference = this.a;
        if (reference == null) {
            Log.e("BasePresenter", getClass().getSimpleName() + "getView: mViewRef is null");
            return null;
        }
        if (reference.get() == null) {
            Log.e("BasePresenter", getClass().getSimpleName() + "getView: uiInterface is null");
        }
        return this.a.get();
    }

    public boolean b() {
        Reference<UIInterface> reference = this.a;
        return (reference == null || reference.get() == null) ? false : true;
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.a
    @p(a = f.a.ON_DESTROY)
    public void onDestroy(i iVar) {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }
}
