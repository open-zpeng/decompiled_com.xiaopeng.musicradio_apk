package com.xiaopeng.musicradio.music.player.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.presenter.MusicPlayerPresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout;
import com.xiaopeng.musicradio.playercomponent.big.view.ShareButtonLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MusicPlayerFragment.java */
@Route(path = "/music/fragment/player")
/* loaded from: classes.dex */
public class m extends com.xiaopeng.musicradio.playercomponent.big.view.g<g, MusicPlayerPresenter> implements g {
    public static final String[] d = {com.xiaopeng.musicradio.a.a.getString(b.f.vui_random), com.xiaopeng.musicradio.a.a.getString(b.f.vui_single), com.xiaopeng.musicradio.a.a.getString(b.f.vui_list)};
    private PlayerCommonLayout e;
    private XImageView f;
    private XImageView g;
    private MusicLrcLayout h;
    private View i;
    private View j;
    private BtNoConnectLayout k;
    private XTextView l;
    private PlayerMusicTagsLayout m;
    private XImageView n;
    private XTextView o;
    private XImageView q;
    private XImageView r;
    private ShareButtonLayout s;
    private boolean p = false;
    private boolean t = false;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "PlayerMainMusic";
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("lrc_show", this.n.isSelected());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.fragment_music_player;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = (PlayerCommonLayout) a(b.d.layout_player_base);
        this.f = (XImageView) a(b.d.img_love);
        this.g = (XImageView) a(b.d.img_mode);
        this.i = a(b.d.view_touch_lrc);
        this.l = (XTextView) a(b.d.tv_bt_playing);
        this.m = (PlayerMusicTagsLayout) a(b.d.layout_music_tag);
        this.n = (XImageView) a(b.d.img_lrc);
        this.o = (XTextView) a(b.d.tv_vip_tip);
        this.q = (XImageView) a(b.d.img_logo);
        this.r = (XImageView) a(b.d.img_bt_lrc);
        this.s = (ShareButtonLayout) a(b.d.view_share);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        y();
        this.e.setSceneId(o());
        l();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                awd.b();
                ((MusicPlayerPresenter) m.this.b).i();
            }
        });
        com.xiaopeng.musicradio.vui.c.c(this.f);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MusicPlayerPresenter) m.this.b).j();
            }
        });
        this.e.setPlayListClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewStub viewStub;
                if (m.this.r.getVisibility() == 0) {
                    return;
                }
                VuiEngine.getInstance(m.this.getContext()).updateScene(m.this.o(), view);
                m.this.t = view.isSelected();
                if (m.this.t) {
                    m.this.f.setVisibility(8);
                    m.this.g.setVisibility(8);
                    m.this.i.setVisibility(8);
                    m.this.m.setVisibility(8);
                    m.this.s.setVisibility(8);
                    if (m.this.n.isSelected()) {
                        m.this.h.setVisibility(8);
                        m.this.n.setSelected(false);
                        m.this.x();
                    }
                    if (m.this.j == null && (viewStub = (ViewStub) m.this.a(b.d.view_stub_play_list_holder)) != null) {
                        m.this.j = viewStub.inflate();
                        VuiEngine.getInstance(m.this.getContext()).updateScene(m.this.o(), m.this.j);
                    }
                    m.this.j.setVisibility(0);
                    m.this.z();
                    return;
                }
                m.this.f.setVisibility(0);
                m.this.g.setVisibility(0);
                m.this.i.setVisibility(0);
                m.this.j.setVisibility(8);
                m.this.l();
                if (m.this.n.isSelected()) {
                    m.this.h.setVisibility(0);
                } else {
                    m.this.m.setVisibility(0);
                }
                m.this.z();
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.this.t();
                awd.c();
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.this.t();
                awd.c();
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m.this.t();
                awd.c();
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    awd.f();
                    bcg.a(m.this.getContext(), m.this.getResources().getString(b.f.vip_from_label));
                }
            }
        });
        Log.i("MusicPlayerFragment", "setListener: =========");
        ban.i(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.m.8
            @Override // java.lang.Runnable
            public void run() {
                m.this.w();
                Log.i("MusicPlayerFragment", "run: ==========createlrc");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (((MusicPlayerPresenter) this.b).h() == null) {
            return;
        }
        if (this.n.getVisibility() == 0) {
            XImageView xImageView = this.n;
            xImageView.setSelected(!xImageView.isSelected());
            VuiEngine.getInstance(getContext()).updateScene(o(), this.n);
        }
        if (this.r.getVisibility() == 0) {
            XImageView xImageView2 = this.r;
            xImageView2.setSelected(!xImageView2.isSelected());
            VuiEngine.getInstance(getContext()).updateScene(o(), this.r);
        }
        Log.i("MusicPlayerFragment", "clickLrc: ==========" + this.n.isSelected());
        u();
    }

    private void u() {
        boolean isSelected = this.n.isSelected();
        if (this.r.getVisibility() == 0) {
            isSelected = this.r.isSelected();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("refreshLrc: bt = ");
        sb.append(this.r.getVisibility() == 0);
        sb.append(" selected = ");
        sb.append(isSelected);
        Log.i("MusicPlayerFragment", sb.toString());
        if (isSelected) {
            v();
        } else {
            x();
        }
    }

    private void v() {
        this.e.k();
        this.m.setVisibility(8);
        w();
        this.h.setVisibility(0);
        if (this.e.q()) {
            this.e.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        View inflate;
        if (this.h == null) {
            ViewStub viewStub = (ViewStub) a(b.d.view_stub_lrc);
            if (viewStub != null && (inflate = viewStub.inflate()) != null) {
                this.h = (MusicLrcLayout) inflate;
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.m.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        m.this.t();
                    }
                });
                this.h.setVisibility(8);
            }
            if (this.c != null) {
                if (this.c.getBoolean("lrc_show", false)) {
                    t();
                }
                this.c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        MusicLrcLayout musicLrcLayout = this.h;
        int i = 8;
        if (musicLrcLayout != null) {
            musicLrcLayout.setVisibility(8);
        }
        this.e.j();
        if (!((MusicPlayerPresenter) this.b).p()) {
            PlayerMusicTagsLayout playerMusicTagsLayout = this.m;
            if (((MusicPlayerPresenter) this.b).s() && !this.e.q()) {
                i = 0;
            }
            playerMusicTagsLayout.setVisibility(i);
            return;
        }
        b(((MusicPlayerPresenter) this.b).m(), true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public MusicPlayerPresenter ao_() {
        return new MusicPlayerPresenter();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void b(String str, String str2) {
        if (aei.a().c() == 0) {
            this.e.a(str, "");
        } else if (aei.a().c() == 2) {
            this.e.a(str, str2);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.b
    public void F_() {
        Log.i("MusicPlayerFragment", "setDefault: ========");
        this.e.f();
        this.e.a(b.c.pic_covers_music_220);
        this.m.setVisibility(8);
        this.o.setVisibility(8);
        c(false);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void a(int i, boolean z) {
        int i2;
        switch (i) {
            case 2:
                i2 = b.c.ic_120_allcycles;
                break;
            case 3:
                i2 = b.c.ic_120_single;
                break;
            case 4:
                i2 = b.c.ic_120_random;
                break;
            default:
                i2 = b.c.ic_120_allcycles;
                break;
        }
        this.g.setEnabled(z);
        this.g.setClickable(z);
        this.g.setImageResource(i2);
        if (z) {
            this.g.setAlpha(1.0f);
        } else {
            this.g.setAlpha(0.15f);
        }
        y();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void a(boolean z, boolean z2) {
        this.f.setSelected(z);
        this.f.setEnabled(z2);
        d(z2);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.f);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void b_(boolean z) {
        ViewStub viewStub;
        View inflate;
        this.i.setClickable(true);
        BtNoConnectLayout btNoConnectLayout = this.k;
        if (btNoConnectLayout != null) {
            btNoConnectLayout.setVisibility(8);
        }
        this.l.setVisibility(8);
        MusicLrcLayout musicLrcLayout = this.h;
        if (musicLrcLayout != null) {
            musicLrcLayout.a(z);
        }
        if (z) {
            this.r.setVisibility(8);
            this.n.setVisibility(0);
            if (!this.e.q()) {
                this.g.setVisibility(0);
                u();
            }
            if (((MusicPlayerPresenter) this.b).s()) {
                this.e.c(true);
                this.e.a(true);
                d(!((MusicPlayerPresenter) this.b).t());
                c(true);
            } else {
                this.e.a(false);
                d(false);
                c(false);
                a(2, false);
            }
            if (((MusicPlayerPresenter) this.b).e()) {
                this.q.setImageResource(b.c.ic_logo_usbmusic);
            } else {
                this.q.setImageResource(b.c.ic_logo_kugou);
            }
            this.e.o();
        } else {
            this.m.setVisibility(8);
            this.e.a(false);
            this.e.p();
            this.g.setVisibility(8);
            this.r.setVisibility(0);
            this.n.setVisibility(8);
            if (((MusicPlayerPresenter) this.b).q() && !((MusicPlayerPresenter) this.b).r()) {
                if (!this.r.isSelected()) {
                    this.e.j();
                    this.l.setVisibility(0);
                    MusicLrcLayout musicLrcLayout2 = this.h;
                    if (musicLrcLayout2 != null) {
                        musicLrcLayout2.setVisibility(8);
                    }
                }
                this.e.c(true);
                c(true);
                d(((MusicPlayerPresenter) this.b).f());
            } else {
                if (this.k == null && (viewStub = (ViewStub) a(b.d.view_sub_bt_no_connect)) != null && (inflate = viewStub.inflate()) != null) {
                    this.k = (BtNoConnectLayout) inflate;
                }
                this.k.setVisibility(0);
                this.k.a(((MusicPlayerPresenter) this.b).r());
                this.e.k();
                this.e.l();
                this.e.c(false);
                MusicLrcLayout musicLrcLayout3 = this.h;
                if (musicLrcLayout3 != null) {
                    musicLrcLayout3.setVisibility(8);
                }
                this.r.setSelected(false);
                c(false);
                this.i.setClickable(false);
                d(false);
            }
            a(2, false);
            this.o.setVisibility(8);
            this.q.setImageResource(b.c.ic_logo_bluetoothmusic);
        }
        VuiEngine.getInstance(getContext()).updateScene(o(), k());
    }

    private void c(boolean z) {
        if (this.n.getVisibility() == 0) {
            this.n.setEnabled(z);
            this.n.setClickable(z);
            if (z) {
                this.n.setAlpha(1.0f);
                return;
            } else {
                this.n.setAlpha(0.15f);
                return;
            }
        }
        this.r.setEnabled(z);
        this.r.setClickable(z);
        if (z) {
            this.r.setAlpha(1.0f);
        } else {
            this.r.setAlpha(0.15f);
        }
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void l() {
        if (((MusicPlayerPresenter) this.b).s() && !((MusicPlayerPresenter) this.b).e() && !((MusicPlayerPresenter) this.b).p() && !((MusicPlayerPresenter) this.b).t() && !this.t) {
            this.s.setVisibility(0);
            VuiEngine.getInstance(getContext()).updateScene(o(), this.s);
            return;
        }
        this.s.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void G_() {
        this.e.a(false);
        this.l.setVisibility(8);
        this.e.c(false);
        c(false);
        d(false);
        a(2, false);
    }

    private void d(boolean z) {
        this.f.setClickable(z);
        this.f.setEnabled(z);
        if (z) {
            this.f.setAlpha(1.0f);
        } else {
            this.f.setAlpha(0.15f);
        }
        if (z) {
            return;
        }
        this.f.setSelected(false);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void b(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
        this.p = z;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void h() {
        if (this.e.q()) {
            this.e.g();
        }
        if (this.n.getVisibility() == 0 && !this.n.isSelected()) {
            t();
        } else if (this.r.getVisibility() != 0 || this.r.isSelected()) {
        } else {
            t();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        super.onVuiEvent(view, bioVar);
        a(view, bioVar);
    }

    public void a(View view, bio bioVar) {
        if (view == null || view.getId() != this.g.getId()) {
            return;
        }
        VuiFloatingLayerManager.show(view);
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(d);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0) {
            ((MusicPlayerPresenter) this.b).a(4);
        } else if (indexOf == 1) {
            ((MusicPlayerPresenter) this.b).a(3);
        } else {
            ((MusicPlayerPresenter) this.b).a(2);
        }
    }

    private void y() {
        this.g.setVuiMode(bij.NORMAL);
        int k = ((MusicPlayerPresenter) this.b).k();
        VuiUtils.setStatefulButtonAttr(this.g, k == 4 ? 0 : k == 3 ? 1 : 2, d, null);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.g);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("PlayerSubTop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e.getUpdateViews());
        arrayList.addAll(Arrays.asList(this.n, this.f, this.g));
        VuiEngine.getInstance(getContext()).updateScene(o(), arrayList);
        if (this.j != null) {
            VuiEngine.getInstance(getContext()).updateElementAttribute(o(), this.j);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.g
    public boolean r() {
        return this.n.getVisibility() == 0 ? this.n.isSelected() || this.e.q() : this.r.isSelected() || this.e.q();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.g
    public void s() {
        if ((this.n.getVisibility() == 0 && this.n.isSelected()) || (this.r.getVisibility() == 0 && this.r.isSelected())) {
            t();
        } else if (this.e.q()) {
            this.e.g();
        }
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void H_() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.xiaopeng.musicradio.music.player.view.g
    public void b(int i, boolean z) {
        if (z) {
            if (i == 2) {
                this.l.setVisibility(0);
            } else {
                this.l.setVisibility(8);
            }
        }
    }
}
