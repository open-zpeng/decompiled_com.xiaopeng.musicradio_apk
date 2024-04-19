package com.xiaopeng.musicradio.commonui.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.bl;
import com.xiaopeng.musicradio.utils.p;
import com.xiaopeng.xui.theme.XThemeManager;
import defpackage.aem;
/* compiled from: BaseActivity.java */
/* loaded from: classes.dex */
public abstract class a<UIInterface, Presenter extends BasePresenter<UIInterface>> extends androidx.fragment.app.d {
    protected com.xiaopeng.musicradio.commonui.widget.a a;
    protected Presenter b;
    protected Handler c = new Handler();
    protected bl d = new bl();
    protected p e = new p();
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.xiaopeng.musicradio.commonui.base.a.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a.this.d.b();
            a.this.e.b();
        }
    };

    public abstract void T_();

    protected com.xiaopeng.musicradio.commonui.widget.a d() {
        return null;
    }

    protected abstract Presenter e();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f();

    public abstract void g();

    public abstract void i();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(aem.b.x_bg_app);
        aw.a((Object) getResources(), "setDrawableCacheEnabled", (Class<?>) Boolean.TYPE, (Object) true);
        requestWindowFeature(1);
        this.b = e();
        this.b.a(this);
        this.a = d();
        Log.i("MusicBaseActivity", "onCreate: addObserver");
        getLifecycle().a(this.b);
        aq_();
        g();
        T_();
        i();
        getLifecycle().a(this.b);
        Log.i("MusicBaseActivity", "onCreate: end =======");
    }

    protected void aq_() {
        Log.i("MusicBaseActivity", "onCreate: start ========");
        View inflate = LayoutInflater.from(this).inflate(f(), (ViewGroup) null);
        inflate.setTag(aem.c.tag_lifecycle_owner, getLifecycle());
        Log.i("MusicBaseActivity", "onCreate: second =======");
        setContentView(inflate);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        XThemeManager.setWindowBackgroundResource(configuration, getWindow(), aem.b.x_bg_app);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        n();
        super.onStop();
        this.d.b();
        this.e.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        afa.a(this);
    }

    public com.xiaopeng.musicradio.commonui.widget.a c() {
        return this.a;
    }

    public bl j() {
        return this.d;
    }

    public p k() {
        return this.e;
    }

    public boolean l() {
        return this.d.a() || this.e.a();
    }

    private void m() {
        try {
            jd.a(com.xiaopeng.musicradio.a.a()).a(this.f, new IntentFilter("action_exit_dialog"));
        } catch (Exception e) {
            LogUtils.e("MusicBaseActivity", "registerReceiver:" + e);
        }
    }

    private void n() {
        try {
            jd.a(com.xiaopeng.musicradio.a.a()).a(this.f);
        } catch (Exception e) {
            LogUtils.e("MusicBaseActivity", "unregisterReceiver:" + e);
        }
    }
}
