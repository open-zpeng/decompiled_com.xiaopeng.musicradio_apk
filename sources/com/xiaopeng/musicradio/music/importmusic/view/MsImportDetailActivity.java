package com.xiaopeng.musicradio.music.importmusic.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.importmusic.presenter.MsImportDetailPresenter;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
@Route(path = "/music/activity/import_detail")
/* loaded from: classes.dex */
public class MsImportDetailActivity extends MsMusicDetailActivity {
    private int u;

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void r() {
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void u() {
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
            this.n = getIntent().getStringExtra("detail_LOGO");
            this.u = getIntent().getIntExtra("detail_type", 0);
            ((MsMusicDetailPresenter) this.b).a(this.o.longValue());
            if (this.b instanceof MsImportDetailPresenter) {
                ((MsImportDetailPresenter) this.b).a(this.u);
            }
            ((MsMusicDetailPresenter) this.b).c();
            this.f.setTitle(this.m);
            y.b(this, this.n, b.c.pic_covers_music_220, this.h);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    /* renamed from: q */
    public MsImportDetailPresenter t() {
        return new MsImportDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public ListSignBean s() {
        return au.c(this.o.longValue(), this.m, this.u);
    }
}
