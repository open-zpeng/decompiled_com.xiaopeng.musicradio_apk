package com.xiaopeng.musicradio.music.importmusic.presenter;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
/* loaded from: classes.dex */
public class MsImportDetailPresenter extends MsMusicDetailPresenter {
    private int k;

    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    public void c() {
        if (a() != null && !this.g) {
            a().r_();
            this.j = System.currentTimeMillis();
            this.i = true;
        }
        if (f()) {
            d();
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    protected void d() {
        String a = ((aqr) apx.a().b()).a();
        if (TextUtils.isEmpty(a)) {
            g();
        } else {
            aqz.a().a(this.d, this.k, a, new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.importmusic.presenter.MsImportDetailPresenter.1
                @Override // defpackage.avc
                public void a(MusicCollectSongListBean musicCollectSongListBean) {
                    MsImportDetailPresenter.this.a(musicCollectSongListBean);
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    MsImportDetailPresenter.this.g();
                }
            });
        }
    }

    public void a(int i) {
        this.k = i;
    }
}
