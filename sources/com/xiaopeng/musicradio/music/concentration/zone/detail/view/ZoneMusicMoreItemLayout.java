package com.xiaopeng.musicradio.music.concentration.zone.detail.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.detail.presenter.ZomeMusicMoreItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public class ZoneMusicMoreItemLayout extends BaseFrameLayout implements c {
    private Context c;
    private XTextView d;
    private BaseRecycleView e;
    private VipMusicMoreInfo.ModuleBean f;
    private List<MusicRadioItem> g;
    private ase h;
    private GridLayoutManager i;
    private XLinearLayout j;
    private XImageView k;
    private XLinearLayout l;
    private XTextView m;
    private XImageView n;
    private String[] o;
    private boolean p;

    public ZoneMusicMoreItemLayout(Context context) {
        super(context);
        this.g = new ArrayList();
        this.o = new String[]{be.a(b.f.radom_listen), be.a(b.f.bt_pause)};
        this.p = false;
        this.c = context;
    }

    public ZoneMusicMoreItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList();
        this.o = new String[]{be.a(b.f.radom_listen), be.a(b.f.bt_pause)};
        this.p = false;
        this.c = context;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected BasePresenter a() {
        return new ZomeMusicMoreItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (XTextView) findViewById(b.d.zone_title);
        this.e = (BaseRecycleView) findViewById(b.d.zome_main_rv);
        this.j = (XLinearLayout) findViewById(b.d.play_radom);
        this.k = (XImageView) findViewById(b.d.zone_more);
        this.l = (XLinearLayout) findViewById(b.d.title_layout);
        this.m = (XTextView) findViewById(b.d.random_text);
        this.n = (XImageView) findViewById(b.d.play_radom_img);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.h = new ase(getContext(), 1);
        this.e.setItemAnimator(new androidx.recyclerview.widget.e());
        h hVar = new h(4, 40, false);
        hVar.a(26);
        this.e.addItemDecoration(hVar);
        this.i = new GridLayoutManager(getContext(), 4);
        this.e.setLayoutManager(this.i);
        this.e.setHasFixedSize(true);
        ((q) this.e.getItemAnimator()).a(false);
        this.e.setAdapter(this.h);
        this.e.initVuiAttr("MusicZoneDetail", VuiEngine.getInstance(getContext()), false, true, true);
        this.e.setVuiCanControlScroll(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.h.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicMoreItemLayout.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicRadioItem g = ZoneMusicMoreItemLayout.this.h.g(i2);
                if (g == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        if (apk.i().y()) {
                            return;
                        }
                        atf.a().a(au.b(g.getId(), g.getTitle()).toJson());
                        ams.a().a(g);
                        return;
                    case 1:
                        atz.a(g.getId(), g.getLogoUrl(), g.getName(), g.getDescription());
                        return;
                    default:
                        return;
                }
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicMoreItemLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ZoneMusicMoreItemLayout.this.g == null || ZoneMusicMoreItemLayout.this.g.size() == 0) {
                    return;
                }
                if (!TextUtils.equals(ZoneMusicMoreItemLayout.this.m.getText().toString(), be.a(b.f.bt_pause))) {
                    MusicRadioItem musicRadioItem = (MusicRadioItem) ZoneMusicMoreItemLayout.this.g.get(new Random().nextInt(ZoneMusicMoreItemLayout.this.g.size()));
                    atf.a().a(au.b(musicRadioItem.getId(), musicRadioItem.getTitle()).toJson());
                    ams.a().a(musicRadioItem);
                    return;
                }
                apk.i().pause();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_zone_music_more_item;
    }

    public void a(VipMusicMoreInfo.ModuleBean moduleBean, boolean z, int i, int i2) {
        this.f = moduleBean;
        this.g.clear();
        if (moduleBean.getCollectInfo() != null && moduleBean.getCollectInfo().getCollectList() != null) {
            for (VipMusicMoreInfo.CollectBean collectBean : moduleBean.getCollectInfo().getCollectList()) {
                MusicRadioItem collect = collectBean.getCollect();
                collect.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                collect.setTitle(collect.getName());
                collect.setName(collect.getName());
                collect.setLogoUrl(collect.getLogo());
                this.g.add(collect);
            }
        }
        this.h.i(i);
        this.h.a((List) this.g, true);
        BaseRecycleView baseRecycleView = this.e;
        baseRecycleView.setVuiElementId(this.e.getId() + "_" + i2);
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        vuiEngine.setVuiElementTag(this, "zone_music_more_item_" + i2);
        setVuiLabel(this.d.getText().toString());
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.detail.view.c
    public void a(boolean z) {
        if (z) {
            int o = this.h.o();
            if (o != -1) {
                this.h.c(o);
            }
            String x = apk.i().x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            List<MusicRadioItem> p = this.h.p();
            for (int i = 0; i < p.size(); i++) {
                if (a(x, p.get(i).getId())) {
                    this.h.c(i);
                }
            }
            return;
        }
        int o2 = this.h.o();
        if (o2 != -1) {
            this.h.c(o2);
            this.h.h(-1);
        }
    }

    public boolean a(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.detail.view.c
    public void e() {
        g();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        g();
    }

    private void g() {
        ase aseVar = this.h;
        if (aseVar == null || aseVar.a() <= 0) {
            return;
        }
        if (this.e.isComputingLayout()) {
            this.e.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicMoreItemLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    ZoneMusicMoreItemLayout.this.h.d();
                }
            });
        } else {
            this.h.d();
        }
    }

    public void setTitle(String str) {
        this.d.setText(str);
    }

    public void f() {
        this.k.setVisibility(0);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.view.ZoneMusicMoreItemLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sp.a().a("/music/activity/zone_child_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withString("module_info", z.a(ZoneMusicMoreItemLayout.this.f)).navigation();
            }
        });
    }

    private void setRandomPlayState(boolean z) {
        boolean z2 = false;
        if (z) {
            int playState = apk.i().getPlayState();
            if (playState == 1) {
                this.n.setImageResource(b.c.ic_btn_stop_text_color);
                this.m.setText(be.a(b.f.bt_pause));
            } else if (playState == 2) {
                this.n.setImageResource(b.c.ic_btn_stop_text_color);
                this.m.setText(be.a(b.f.bt_pause));
                z2 = true;
            } else if (playState == 3) {
                this.n.setImageResource(b.c.ic_btn_playall_text_color);
                this.m.setText(be.a(b.f.radom_listen));
            } else {
                this.n.setImageResource(b.c.ic_btn_playall_text_color);
                this.m.setText(be.a(b.f.radom_listen));
            }
        } else {
            this.n.setImageResource(b.c.ic_btn_playall_text_color);
            this.m.setText(be.a(b.f.radom_listen));
        }
        if (z2 != this.p) {
            com.xiaopeng.musicradio.vui.c.a(getContext(), this.j, z2, this.o);
            this.p = z2;
            VuiEngine.getInstance(getContext()).updateScene("MusicZoneDetail", this.j);
        }
    }
}
