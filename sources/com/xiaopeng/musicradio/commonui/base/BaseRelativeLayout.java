package com.xiaopeng.musicradio.commonui.base;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.xui.widget.XRelativeLayout;
/* loaded from: classes.dex */
public abstract class BaseRelativeLayout<UIInterface, Presenter extends BasePresenter<UIInterface>> extends XRelativeLayout implements com.xiaopeng.musicradio.commonui.lifecycle.a {
    protected boolean a;
    protected Presenter b;

    protected abstract void a();

    protected abstract void b();

    protected abstract void c();

    public abstract int getContentViewId();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    private void d() {
        if (this.a) {
            return;
        }
        a();
        b();
        c();
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRelativeLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.b(this);
    }

    @p(a = f.a.ON_CREATE)
    public void onCreate(i iVar) {
        d();
        this.b.onCreate(iVar);
    }

    @p(a = f.a.ON_START)
    public void onStart(i iVar) {
        this.b.onStart(iVar);
    }

    @p(a = f.a.ON_RESUME)
    public void onResume(i iVar) {
        this.b.onResume(iVar);
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause(i iVar) {
        this.b.onPause(iVar);
    }

    @p(a = f.a.ON_STOP)
    public void onStop(i iVar) {
        this.b.onStop(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.a
    @p(a = f.a.ON_DESTROY)
    public void onDestroy(i iVar) {
        this.b.onDestroy(iVar);
    }

    public androidx.fragment.app.d getActivity() {
        return (androidx.fragment.app.d) getContext();
    }
}
