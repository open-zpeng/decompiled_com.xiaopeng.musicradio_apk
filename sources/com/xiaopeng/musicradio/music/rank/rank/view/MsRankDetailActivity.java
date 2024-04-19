package com.xiaopeng.musicradio.music.rank.rank.view;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity;
import com.xiaopeng.musicradio.music.rank.rank.presenter.MsRankDetailPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import defpackage.aep;
import java.util.ArrayList;
@Route(path = "/music/activity/rank_detail")
/* loaded from: classes.dex */
public class MsRankDetailActivity extends MsMusicDetailActivity {
    private int u;

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicRankDetail";
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        this.j.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void a() {
        if (getIntent() != null) {
            this.o = Long.valueOf(getIntent().getLongExtra("detail_id", 0L));
            this.m = getIntent().getStringExtra("detail_title");
            this.u = getIntent().getIntExtra("detail_type", 0);
            ((MsMusicDetailPresenter) this.b).a(this.o.longValue());
            if (this.b instanceof MsRankDetailPresenter) {
                ((MsRankDetailPresenter) this.b).a(this.u);
            }
            ((MsMusicDetailPresenter) this.b).c();
            this.f.setTitle(this.m);
            this.h.setImageResource(b.c.pic_covers_music_220);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.music.main.view.a
    public void a(ArrayList<MusicInfo> arrayList) {
        if (arrayList.size() > 0) {
            String logo = arrayList.get(0).getLogo();
            if (TextUtils.isEmpty(this.n) || !TextUtils.equals(logo, this.n)) {
                this.n = logo;
                this.h.setImageResource(0);
                y.b(this, this.n, b.c.pic_covers_music_220, this.h);
            }
        }
        super.a(arrayList);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void v() {
        this.l = new atl(this, b.e.music_item_rank_detail_list, 8, new aep.b() { // from class: com.xiaopeng.musicradio.music.rank.rank.view.MsRankDetailActivity.1
            @Override // defpackage.aep.b
            public void a() {
                if (MsRankDetailActivity.this.l.a() > 0) {
                    MsRankDetailActivity.this.l.d();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    /* renamed from: q */
    public MsRankDetailPresenter t() {
        return new MsRankDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void u() {
        MusicRadioItem musicRadioItem = new MusicRadioItem();
        musicRadioItem.setType(ListSignBean.LISTSIGN_RANK_MUSIC);
        musicRadioItem.setTitle(this.m);
        musicRadioItem.setName(this.m);
        musicRadioItem.setRankName(this.m);
        musicRadioItem.setRankId(this.o.longValue());
        musicRadioItem.setRankType(this.u);
        musicRadioItem.setLogoUrl(this.n);
        musicRadioItem.setImgUrl(this.n);
        musicRadioItem.setLogo(this.n);
        musicRadioItem.setId(this.o.longValue());
        ams.a().a(musicRadioItem);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public ListSignBean s() {
        return au.b(this.o.longValue(), this.m, this.u);
    }
}
