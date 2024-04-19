package com.xiaopeng.musicradio.commonui.base;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.xui.widget.XFrameLayout;
/* loaded from: classes.dex */
public abstract class BaseFrameLayout<UIInterface, Presenter extends BasePresenter<UIInterface>> extends XFrameLayout implements com.xiaopeng.musicradio.commonui.lifecycle.a {
    protected boolean a;
    protected Presenter b;

    protected abstract Presenter a();

    protected abstract void b();

    protected abstract void c();

    protected abstract void d();

    public abstract int getContentViewId();

    public BaseFrameLayout(Context context) {
        super(context);
        this.a = false;
        e();
    }

    public BaseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        e();
    }

    public BaseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        e();
    }

    private final void e() {
        this.b = a();
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.a(this);
        }
        a(LayoutInflater.from(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(LayoutInflater layoutInflater) {
        layoutInflater.inflate(getContentViewId(), this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    private void g() {
        if (this.a) {
            return;
        }
        b();
        c();
        d();
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.b(this);
    }

    @p(a = f.a.ON_CREATE)
    public void onCreate(i iVar) {
        g();
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.onCreate(iVar);
        }
    }

    @p(a = f.a.ON_START)
    public void onStart(i iVar) {
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.onStart(iVar);
        }
    }

    @p(a = f.a.ON_RESUME)
    public void onResume(i iVar) {
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.onResume(iVar);
        }
    }

    @p(a = f.a.ON_PAUSE)
    public void onPause(i iVar) {
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.onPause(iVar);
        }
    }

    @p(a = f.a.ON_STOP)
    public void onStop(i iVar) {
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.onStop(iVar);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.a
    @p(a = f.a.ON_DESTROY)
    public void onDestroy(i iVar) {
        Presenter presenter = this.b;
        if (presenter != null) {
            presenter.onDestroy(iVar);
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public androidx.fragment.app.d getActivity() {
        return (androidx.fragment.app.d) getContext();
    }
}
