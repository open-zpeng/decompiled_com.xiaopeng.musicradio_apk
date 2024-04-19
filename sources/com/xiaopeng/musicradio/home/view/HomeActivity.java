package com.xiaopeng.musicradio.home.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.home.presenter.HomePresenter;
import com.xiaopeng.musicradio.main.view.MainLayout;
import com.xiaopeng.musicradio.playercomponent.small.SmallPlayerService;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.bm;
import com.xiaopeng.musicradio.utils.bn;
import com.xiaopeng.musicradio.utils.bo;
import com.xiaopeng.musicradio.utils.w;
import defpackage.aho;
@Route(path = "/home/home")
/* loaded from: classes.dex */
public class HomeActivity extends com.xiaopeng.musicradio.commonui.base.a<Object, HomePresenter> {
    private MainLayout f;
    private boolean h;
    private Handler g = new Handler(Looper.getMainLooper());
    private Runnable i = new Runnable() { // from class: com.xiaopeng.musicradio.home.view.HomeActivity.1
        @Override // java.lang.Runnable
        public void run() {
            SmallPlayerService.a();
        }
    };

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public HomePresenter e() {
        return new HomePresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aho.d.activity_home;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (MainLayout) findViewById(aho.c.layout_main);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        SmallPlayerService.a(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.h = true;
        Log.i("HomeActivity", "onWindowFocusChanged: " + z + " isComplete = " + bf.b());
        SmallPlayerService.a(true);
        ban.d(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        final View decorView;
        super.onResume();
        Log.i("HomeActivity", "onResume: isComplete = " + bf.b());
        if (bf.b()) {
            SmallPlayerService.a(true);
            ban.d(this.i);
        }
        if (w.f() == 1) {
            aqm.b();
        }
        if (getWindow() != null && (decorView = getWindow().getDecorView()) != null) {
            ban.i(new Runnable() { // from class: com.xiaopeng.musicradio.home.view.HomeActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    Log.i("HomeActivity", "handler: onResume focus = " + HomeActivity.this.h + " state = " + HomeActivity.this.getLifecycle().a());
                    if (!HomeActivity.this.h) {
                        HomeActivity.this.getWindow().getDecorView().requestFocus();
                    }
                    LogUtils.i("HomeActivity", "handler onResume visible = %d, width = %d, height = %d, mw = %d, mh = %d", Integer.valueOf(decorView.getVisibility()), Integer.valueOf(decorView.getWidth()), Integer.valueOf(decorView.getHeight()), Integer.valueOf(decorView.getMeasuredWidth()), Integer.valueOf(decorView.getMeasuredHeight()));
                }
            });
            LogUtils.i("HomeActivity", "onResume visible = %d, width = %d, height = %d, mw = %d, mh = %d", Integer.valueOf(decorView.getVisibility()), Integer.valueOf(decorView.getWidth()), Integer.valueOf(decorView.getHeight()), Integer.valueOf(decorView.getMeasuredWidth()), Integer.valueOf(decorView.getMeasuredHeight()));
        }
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            bcuVar.loadSaleData();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPause() {
        super.onPause();
        this.h = false;
        Log.i("HomeActivity", "onPause: =========== ");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    @Override // androidx.activity.b, android.app.Activity
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    private void a(final Intent intent) {
        if (intent == null) {
            return;
        }
        this.g.post(new Runnable() { // from class: com.xiaopeng.musicradio.home.view.HomeActivity.3
            @Override // java.lang.Runnable
            public void run() {
                String action = intent.getAction();
                Log.i("HomeActivity", "navigateFrom3rd: action = " + action + " extra = " + intent.getData());
                if (((HomePresenter) HomeActivity.this.b).a(intent.getData())) {
                    return;
                }
                HomeActivity.this.f.a(intent.getData());
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    protected com.xiaopeng.musicradio.commonui.widget.a d() {
        return new com.xiaopeng.musicradio.commonui.widget.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g.removeCallbacksAndMessages(null);
        bm.a().c();
        bn.a().c();
        bo.a().c();
    }
}
