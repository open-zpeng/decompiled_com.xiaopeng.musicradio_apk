package com.xiaopeng.musicradio.music.rank.rank.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.rank.rank.presenter.MsRankPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.List;
/* loaded from: classes.dex */
public class MsRankLayout extends BaseFrameLayout<a, MsRankPresenter> implements a {
    private LoadingTipsView c;
    private BaseRecycleView d;
    private atk e;
    private GridLayoutManager f;
    private Context g;
    private acv h;

    public MsRankLayout(Context context) {
        super(context);
        this.g = context;
    }

    public MsRankLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        this.h = acv.a(context, attributeSet);
    }

    public MsRankLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = context;
        this.h = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsRankPresenter a() {
        return new MsRankPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_rank;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (LoadingTipsView) findViewById(b.d.netradio_loading_item_category);
        this.c.setAutoClickLoadingEnable(false);
        this.d = (BaseRecycleView) findViewById(b.d.netradio_rv_category);
        this.d.setHasFixedSize(true);
        this.d.setItemViewCacheSize(15);
        this.d.initVuiAttr("MusicRank", VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        i();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.rank.rank.view.MsRankLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MsRankLayout.this.c.getState() == 3 || MsRankLayout.this.c.getState() == 2) {
                    MsRankLayout.this.g();
                }
            }
        });
        this.e.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.rank.rank.view.MsRankLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicRadioItem musicRadioItem = MsRankLayout.this.e.o().get(i2);
                if (apk.i().y() || musicRadioItem == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        atv.i();
                        atf.a().a(au.b(musicRadioItem.getId(), musicRadioItem.getTitle(), musicRadioItem.getRankType()).toJson());
                        ams.a().a(musicRadioItem);
                        return;
                    case 1:
                        sp.a().a("/music/activity/fav_rank_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", musicRadioItem.getRankId()).withString("detail_LOGO", musicRadioItem.getImgUrl()).withString("detail_title", musicRadioItem.getRankName()).withInt("detail_type", musicRadioItem.getRankType()).withLong("detail_showTime", musicRadioItem.getShowTime()).navigation();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    private void i() {
        this.e = new atk(this.g);
        this.d.setItemAnimator(new e());
        h hVar = new h(2, 20, false);
        hVar.a(30);
        hVar.c(100);
        this.d.addItemDecoration(hVar);
        this.f = new GridLayoutManager(this.g, 2);
        this.d.setHasFixedSize(true);
        this.d.setLayoutManager(this.f);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.e);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.d.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.d.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.d.setVisibility(8);
        a(3);
    }

    @Override // com.xiaopeng.musicradio.music.rank.rank.view.a
    public void a(List<MusicRadioItem> list) {
        a(0);
        this.d.setVisibility(0);
        if (this.e.a() != list.size()) {
            this.e.a((List) list, true);
        } else {
            this.e.a((List) list, false);
            this.e.a(0, list.size());
        }
        list.clear();
    }

    private void a(int i) {
        this.c.setState(i);
        if (i == 1) {
            this.c.setClickable(false);
        } else {
            this.c.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.music.rank.rank.view.a
    public void a(boolean z) {
        if (z) {
            int l = this.e.l();
            if (l != -1) {
                this.e.a(l, "payload_playstate");
            }
            String x = apk.i().x();
            if (TextUtils.isEmpty(x)) {
                return;
            }
            List<MusicRadioItem> o = this.e.o();
            for (int i = 0; i < o.size(); i++) {
                MusicRadioItem musicRadioItem = o.get(i);
                if (x.contains(ListSignBean.LISTSIGN_RANK_MUSIC)) {
                    if (x.contains(ListSignBean.COLLECTID_PREFIX + musicRadioItem.getId() + ListSignBean.COLLECTID_SUFFIX)) {
                        this.e.a(i, "payload_playstate");
                    }
                }
            }
            return;
        }
        int l2 = this.e.l();
        if (l2 != -1) {
            this.e.a(l2, "payload_playstate");
        }
    }

    @Override // com.xiaopeng.musicradio.music.rank.rank.view.a
    public void e() {
        j();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        j();
    }

    private void j() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.rank.rank.view.MsRankLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    if (MsRankLayout.this.e == null || MsRankLayout.this.e.a() <= 0) {
                        return;
                    }
                    MsRankLayout.this.e.a(0, MsRankLayout.this.e.a(), "payload");
                    MsRankLayout.this.e.a(0, MsRankLayout.this.e.a(), "payload_song_name");
                }
            });
            return;
        }
        atk atkVar = this.e;
        if (atkVar == null || atkVar.a() <= 0) {
            return;
        }
        atk atkVar2 = this.e;
        atkVar2.a(0, atkVar2.a(), "payload");
        atk atkVar3 = this.e;
        atkVar3.a(0, atkVar3.a(), "payload_song_name");
    }

    public void g() {
        ((MsRankPresenter) this.b).d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h.a(this, configuration);
        if (acs.b(configuration)) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.b(this);
    }
}
