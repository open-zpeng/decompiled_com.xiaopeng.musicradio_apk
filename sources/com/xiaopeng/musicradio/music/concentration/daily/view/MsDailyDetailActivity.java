package com.xiaopeng.musicradio.music.concentration.daily.view;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.daily.presenter.MsDailyDetailPresenter;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.y;
import java.util.ArrayList;
@Route(path = "/music/activity/daily_detail")
/* loaded from: classes.dex */
public class MsDailyDetailActivity extends MsMusicDetailActivity {
    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicTodayRecommended";
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void r() {
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        super.g();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        this.j.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void a() {
        ((MsMusicDetailPresenter) this.b).c();
        this.o = -1000L;
        this.m = be.a(b.f.daily_title);
        this.f.setTitle(this.m);
        this.h.setImageResource(b.c.pic_covers_music_220);
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
    /* renamed from: q */
    public MsDailyDetailPresenter t() {
        return new MsDailyDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public ListSignBean s() {
        long longValue = this.o.longValue();
        return au.b(longValue, this.m + bg.h(System.currentTimeMillis()));
    }
}
