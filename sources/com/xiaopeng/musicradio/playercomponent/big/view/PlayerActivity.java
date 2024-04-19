package com.xiaopeng.musicradio.playercomponent.big.view;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.s;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerPresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.xui.theme.XThemeManager;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import defpackage.avp;
import defpackage.avw;
import java.util.ArrayList;
import java.util.List;
@Route(path = "/player/player")
/* loaded from: classes2.dex */
public class PlayerActivity extends com.xiaopeng.musicradio.commonui.vui.a<e, PlayerPresenter> implements e {
    private int f = -2;
    private XImageButton g;
    private XImageView h;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "PlayerSubTop";
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public boolean o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public PlayerPresenter e() {
        return new PlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    protected int f() {
        return avp.c.activity_player;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.g = (XImageButton) findViewById(avp.b.view_back);
        this.h = (XImageView) findViewById(avp.b.img_eff);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerActivity.1
            @Override // java.lang.Runnable
            public void run() {
                PlayerActivity.this.q();
            }
        }, 800L);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g s = PlayerActivity.this.s();
                if (s != null && s.r()) {
                    s.s();
                } else {
                    PlayerActivity.this.finish();
                }
            }
        });
    }

    public void q() {
        String str = r() ? "eff_player_bg_night.webp" : "eff_player_bg.webp";
        Log.i("PlayerActivity", "showEff: ====== res = " + str);
        android.support.rastermill.e.a(this.h).c(str).a(-1).b(1).a(new android.support.rastermill.f() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerActivity.3
            @Override // android.support.rastermill.f
            public void a(int i, String str2) {
                Log.e("PlayerActivity", "onFail: " + str2);
            }

            @Override // android.support.rastermill.f
            public void a(int i, String str2, android.support.rastermill.d dVar) {
                Log.i("PlayerActivity", "onReady: ======");
                if (((PlayerPresenter) PlayerActivity.this.b).d()) {
                    return;
                }
                PlayerActivity.this.U_();
            }
        }).b();
        this.h.setPivotX(0.0f);
        this.h.setPivotY(0.0f);
        this.h.setScaleX(1.34f);
        this.h.setScaleY(1.34f);
    }

    public boolean r() {
        return XThemeManager.isNight(com.xiaopeng.musicradio.a.a());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (acs.b(configuration)) {
            Log.i("PlayerActivity", "onConfigurationChanged: ========");
            q();
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void a(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        String a = avu.a().a(i);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(a);
        s beginTransaction = supportFragmentManager.beginTransaction();
        if (findFragmentByTag != null) {
            beginTransaction.c(findFragmentByTag);
        } else {
            beginTransaction.b(avp.b.layout_player, (Fragment) sp.a().a(a).navigation(), a);
        }
        beginTransaction.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g s() {
        if (this.f != -1) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(avu.a().a(this.f));
            if (findFragmentByTag == null || !(findFragmentByTag instanceof g)) {
                return null;
            }
            return (g) findFragmentByTag;
        }
        return null;
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void a(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void U_() {
        if (this.h.getDrawable() != null) {
            android.support.rastermill.e.c(this.h);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.e
    public void h() {
        if (this.h.getDrawable() == null) {
            q();
        } else {
            android.support.rastermill.e.d(this.h);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a, androidx.fragment.app.d, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    private void a(final Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        Log.i("PlayerActivity", "navigateFrom3rd: action = " + action + " extra = " + intent.getData());
        if (intent.getData() != null) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    String queryParameter = intent.getData().getQueryParameter("position");
                    Log.i("PlayerActivity", "run: ====== " + queryParameter);
                    if (TextUtils.isEmpty(queryParameter)) {
                        return;
                    }
                    u.e(new avw.a(queryParameter));
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public List<View> p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.g);
        return arrayList;
    }
}
