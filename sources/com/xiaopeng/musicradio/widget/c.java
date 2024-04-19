package com.xiaopeng.musicradio.widget;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.xui.theme.XThemeManager;
import java.util.Map;
import me.yokeyword.fragmentation.anim.DefaultNoAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
import me.yokeyword.fragmentation.h;
/* compiled from: BaseSubActivity.java */
/* loaded from: classes2.dex */
public abstract class c<UIInterface, Presenter extends BasePresenter<UIInterface>> extends com.xiaopeng.musicradio.commonui.vui.a<UIInterface, Presenter> implements me.yokeyword.fragmentation.b {
    @Autowired(name = "fragment_uri")
    protected String k;
    protected final me.yokeyword.fragmentation.f l = new me.yokeyword.fragmentation.f(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return f.g.activity_base_sub;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l.a(bundle);
        a(new DefaultNoAnimator());
        r();
        s();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        XThemeManager.setWindowBackgroundResource(configuration, getWindow(), f.e.x_bg_app);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        sp.a().a(this);
        if (getIntent() != null) {
            this.k = getIntent().getStringExtra("fragment_uri");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        LogUtils.d("BaseSubActivity", "handleFragmentUri:" + this.k);
        if (!be.a((CharSequence) this.k)) {
            try {
                Map<String, String> b = be.b(this.k);
                Bundle bundle = new Bundle();
                for (Map.Entry<String, String> entry : b.entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
                a(be.c(this.k), bundle);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                ak.a(com.xiaopeng.musicradio.a.a(), f.h.error_no_fragment_url);
                finish();
                return;
            }
        }
        ak.a(com.xiaopeng.musicradio.a.a(), f.h.error_no_fragment_url);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        r();
        s();
    }

    public void a(String str, Bundle bundle) {
        Fragment c = c(str);
        LogUtils.d("BaseSubActivity", "addFragment uri:" + str + ", params:" + bundle + ", fragment:" + c);
        if (bundle != null) {
            c.setArguments(bundle);
        }
        if (c instanceof me.yokeyword.fragmentation.c) {
            if (x() == null) {
                a(f.C0131f.container, (me.yokeyword.fragmentation.c) c);
            } else {
                a((me.yokeyword.fragmentation.c) c, true);
            }
        }
    }

    protected Fragment c(String str) {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(str);
        Log.i("BaseSubActivity", "genFragmentFromArouterUri: uri = " + str + " fragment = " + findFragmentByTag);
        return findFragmentByTag == null ? (Fragment) sp.a().a(str).navigation() : findFragmentByTag;
    }

    @Override // me.yokeyword.fragmentation.b
    public me.yokeyword.fragmentation.f t() {
        return this.l;
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.l.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        this.l.g();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.l.a(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.b, android.app.Activity
    public final void onBackPressed() {
        this.l.e();
    }

    @Override // me.yokeyword.fragmentation.b
    public void u() {
        this.l.f();
    }

    @Override // me.yokeyword.fragmentation.b
    public FragmentAnimator v() {
        return this.l.b();
    }

    public void a(FragmentAnimator fragmentAnimator) {
        this.l.a(fragmentAnimator);
    }

    @Override // me.yokeyword.fragmentation.b
    public FragmentAnimator w() {
        return this.l.c();
    }

    public void a(int i, me.yokeyword.fragmentation.c cVar) {
        this.l.a(i, cVar);
    }

    public void a(me.yokeyword.fragmentation.c cVar, boolean z) {
        this.l.a(cVar, z);
    }

    public me.yokeyword.fragmentation.c x() {
        return h.a(getSupportFragmentManager());
    }
}
