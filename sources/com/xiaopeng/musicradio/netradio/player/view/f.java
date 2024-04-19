package com.xiaopeng.musicradio.netradio.player.view;

import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.netradio.player.presenter.NetRadioPlayerPresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.beo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: NetRadioPlayerFragment.java */
@Route(path = "/netradio/fragment/player")
/* loaded from: classes2.dex */
public class f extends com.xiaopeng.musicradio.playercomponent.big.view.g<b, NetRadioPlayerPresenter> implements b {
    private PlayerCommonLayout d;
    private XImageView e;
    private XImageView f;
    private View g;
    private boolean h = false;
    private XImageView i;
    private XTextView j;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "PlayerMainRadio";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return beo.d.fragment_netradio_player;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (PlayerCommonLayout) a(beo.c.layout_player_base);
        this.e = (XImageView) a(beo.c.img_love);
        this.f = (XImageView) a(beo.c.img_listen_live);
        this.j = (XTextView) a(beo.c.tv_radio_playing);
        this.i = (XImageView) a(beo.c.img_listen_back);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.d.setSceneId(o());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.player.view.f.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(beo.c.img_love, 1000)) {
                    awd.i();
                    ((NetRadioPlayerPresenter) f.this.b).e();
                }
            }
        });
        com.xiaopeng.musicradio.vui.c.c(this.e);
        this.d.setPlayListClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.player.view.f.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewStub viewStub;
                VuiEngine.getInstance(f.this.getContext()).updateScene(f.this.o(), view);
                f.this.h = view.isSelected();
                if (f.this.h) {
                    f.this.e.setVisibility(8);
                    f.this.j.setVisibility(8);
                    f.this.f.setVisibility(8);
                    f.this.i.setVisibility(8);
                    if (f.this.g == null && (viewStub = (ViewStub) f.this.a(beo.c.view_stub_play_list_holder)) != null) {
                        f.this.g = viewStub.inflate();
                        VuiEngine.getInstance(f.this.getContext()).updateScene(f.this.o(), f.this.g);
                    }
                    f.this.g.setVisibility(0);
                    f.this.t();
                    return;
                }
                f.this.e.setVisibility(0);
                f.this.g.setVisibility(8);
                if (((NetRadioPlayerPresenter) f.this.b).h()) {
                    f.this.j.setVisibility(0);
                    f.this.i.setVisibility(0);
                } else {
                    f.this.f.setVisibility(0);
                    f.this.i.setVisibility(8);
                }
                f.this.t();
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.player.view.f.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((NetRadioPlayerPresenter) f.this.b).f();
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.player.view.f.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f.this.d.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public NetRadioPlayerPresenter ao_() {
        return new NetRadioPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void b(String str, String str2) {
        this.d.a(str, str2);
        this.d.c(true);
        c(true);
        d(true);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void F_() {
        this.d.f();
        this.d.a(beo.b.pic_netradio_cover_240);
        c(false);
        d(false);
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.b
    public void d_(boolean z) {
        if (!this.h) {
            this.j.setVisibility(z ? 0 : 8);
            this.f.setVisibility(z ? 8 : 0);
            this.i.setVisibility(z ? 0 : 8);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f);
            arrayList.add(this.i);
            VuiEngine.getInstance(getContext()).updateScene(o(), arrayList);
        }
        if (z) {
            this.d.p();
        } else {
            this.d.o();
        }
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.b
    public void b(boolean z) {
        Log.i("NetRadioPlayerFragment", "updateLove: " + z);
        this.e.setSelected(z);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.e);
    }

    public void c(boolean z) {
        this.e.setClickable(z);
        this.e.setEnabled(z);
        if (z) {
            this.e.setAlpha(1.0f);
        } else {
            this.e.setAlpha(0.15f);
        }
    }

    private void d(boolean z) {
        this.f.setClickable(z);
        this.f.setEnabled(z);
        if (z) {
            this.f.setAlpha(1.0f);
        } else {
            this.f.setAlpha(0.15f);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("PlayerSubTop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d.getUpdateViews());
        arrayList.addAll(Arrays.asList(this.e, this.f, this.i));
        VuiEngine.getInstance(getContext()).updateScene(o(), arrayList);
        if (this.g != null) {
            VuiEngine.getInstance(getContext()).updateElementAttribute(o(), this.g);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.g
    public boolean r() {
        return this.d.q();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.g
    public void s() {
        this.d.g();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        Log.i("NetRadioPlayerFragment", "onInterceptVuiEvent: View ID is: " + view.getId() + "LoveView ID is " + this.e.getId());
        if (this.e != null && view.getId() == this.e.getId() && !aqf.a().e()) {
            VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("收藏电台需要先登录喜马拉雅账号").build());
        }
        return super.onInterceptVuiEvent(view, bioVar);
    }
}
