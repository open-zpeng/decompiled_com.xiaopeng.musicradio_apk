package com.xiaopeng.musicradio.music.singer.singer.presenter;

import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
/* loaded from: classes.dex */
public class MsSingerDetailPresenter extends MsMusicDetailPresenter {
    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    protected void d() {
        aqz.a().b(this.d, this.e, 50, new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerDetailPresenter.1
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                MsSingerDetailPresenter.this.a(musicCollectSongListBean);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsSingerDetailPresenter.this.g();
            }
        });
    }
}
