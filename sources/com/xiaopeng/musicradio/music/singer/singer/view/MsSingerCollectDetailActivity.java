package com.xiaopeng.musicradio.music.singer.singer.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity;
import com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerCollectDetailPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
@Route(path = "/music/activity/singer_collect_detail")
/* loaded from: classes.dex */
public class MsSingerCollectDetailActivity extends MsMusicDetailActivity {
    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void u() {
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        this.j.setVisibility(8);
        this.g.setNoResultText(b.f.copyright_restrict_hint);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void a() {
        if (getIntent() != null) {
            this.o = Long.valueOf(getIntent().getLongExtra("detail_id", 0L));
            this.m = getIntent().getStringExtra("detail_title");
            this.n = getIntent().getStringExtra("detail_LOGO");
            ((MsMusicDetailPresenter) this.b).a(this.o.longValue());
            ((MsMusicDetailPresenter) this.b).c();
            this.f.setTitle(this.m);
            y.b(this, this.n, b.c.pic_covers_music_220, this.h);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    /* renamed from: q */
    public MsSingerCollectDetailPresenter t() {
        return new MsSingerCollectDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public ListSignBean s() {
        return au.g(this.o.longValue(), this.m);
    }
}
