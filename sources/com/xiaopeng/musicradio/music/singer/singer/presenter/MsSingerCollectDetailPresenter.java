package com.xiaopeng.musicradio.music.singer.singer.presenter;

import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.utils.w;
/* loaded from: classes.dex */
public class MsSingerCollectDetailPresenter extends MsMusicDetailPresenter {
    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    public void c() {
        if (a() != null && !this.g) {
            a().r_();
            this.j = System.currentTimeMillis();
            this.i = true;
        }
        if (f()) {
            if (w.f() == 1) {
                this.e = -1;
            }
            d();
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    protected void d() {
        aqz.a().c(this.d, this.e, new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerCollectDetailPresenter.1
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                MsSingerCollectDetailPresenter.this.a(musicCollectSongListBean);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsSingerCollectDetailPresenter.this.g();
            }
        });
    }
}
