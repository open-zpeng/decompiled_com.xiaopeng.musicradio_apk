package com.xiaopeng.musicradio.netradio.player.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.netradio.player.presenter.NetRadioPlayListPresenter;
import com.xiaopeng.musicradio.netradio.player.view.d;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.beo;
import java.util.List;
/* loaded from: classes2.dex */
public class NetRadioPlayListLayout extends BaseFrameLayout<a, NetRadioPlayListPresenter> implements a {
    private BaseRecycleView c;
    private d d;
    private LoadingTipsView e;
    private Runnable f;

    public NetRadioPlayListLayout(Context context) {
        super(context);
        this.f = new Runnable() { // from class: com.xiaopeng.musicradio.netradio.player.view.NetRadioPlayListLayout.2
            @Override // java.lang.Runnable
            public void run() {
                NetRadioPlayListLayout.this.i();
            }
        };
    }

    public NetRadioPlayListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Runnable() { // from class: com.xiaopeng.musicradio.netradio.player.view.NetRadioPlayListLayout.2
            @Override // java.lang.Runnable
            public void run() {
                NetRadioPlayListLayout.this.i();
            }
        };
    }

    public NetRadioPlayListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new Runnable() { // from class: com.xiaopeng.musicradio.netradio.player.view.NetRadioPlayListLayout.2
            @Override // java.lang.Runnable
            public void run() {
                NetRadioPlayListLayout.this.i();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public NetRadioPlayListPresenter a() {
        return new NetRadioPlayListPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (BaseRecycleView) findViewById(beo.c.recyclerView);
        this.e = (LoadingTipsView) findViewById(beo.c.loading_tips);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c.addItemDecoration(new j(12, 0, 0));
        this.d = new d(getContext());
        this.c.setAdapter(this.d);
        this.c.initVuiAttr("PlayerMainRadio", VuiEngine.getInstance(getContext()));
        this.c.enableVuiInvisibleFeature(1);
        enableViewVuiMode(true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.a(new d.b() { // from class: com.xiaopeng.musicradio.netradio.player.view.NetRadioPlayListLayout.1
            @Override // com.xiaopeng.musicradio.netradio.player.view.d.b
            public void a(NetRadioProgramInfo netRadioProgramInfo) {
                ((NetRadioPlayListPresenter) NetRadioPlayListLayout.this.b).a(netRadioProgramInfo);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return beo.d.layout_netradio_playlist;
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void a(List<NetRadioProgramInfo> list) {
        this.d.a(list);
        if (list.size() == 0) {
            this.e.setState(3);
        } else {
            this.e.setState(0);
        }
        h();
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void R_() {
        this.e.setState(2);
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void a(int i, int i2) {
        Log.i("NetRadioPlayListLayout", "refreshState: pos = " + i + " playState = " + i2);
        this.d.e(i, i2);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int d = ((NetRadioPlayListPresenter) this.b).d();
        if (d >= 0) {
            this.c.d(d);
            this.c.updateVuiScene();
        }
    }

    public void h() {
        getHandler().removeCallbacks(this.f);
        getHandler().postDelayed(this.f, 200L);
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.a
    public void S_() {
        this.d.d();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.player.view.NetRadioPlayListLayout.3
            @Override // java.lang.Runnable
            public void run() {
                NetRadioPlayListLayout.this.S_();
            }
        }, 1000L);
    }
}
