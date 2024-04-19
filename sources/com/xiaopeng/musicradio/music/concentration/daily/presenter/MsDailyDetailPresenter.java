package com.xiaopeng.musicradio.music.concentration.daily.presenter;

import android.util.Log;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.utils.ab;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsDailyDetailPresenter extends MsMusicDetailPresenter {
    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    public void c() {
        Log.i("MsDailyDetailPresenter", "playDailyMusic");
        if (apx.a().d()) {
            if (a() != null) {
                a().r_();
                this.j = System.currentTimeMillis();
                this.i = true;
            }
            d();
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    protected void d() {
        aqz.a().c(new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.concentration.daily.presenter.MsDailyDetailPresenter.1
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                MsDailyDetailPresenter.this.a(musicCollectSongListBean);
                ArrayList arrayList = new ArrayList();
                if (musicCollectSongListBean == null || musicCollectSongListBean.isFromCache() || musicCollectSongListBean.getData() == null || musicCollectSongListBean.getData().getList() == null || musicCollectSongListBean.getData().getList().size() <= 0) {
                    return;
                }
                for (MusicSongBean musicSongBean : musicCollectSongListBean.getData().getList()) {
                    MusicInfo a = ab.a(musicSongBean);
                    if (a != null) {
                        a.setHttpCache(true);
                        arrayList.add(a);
                    }
                }
                arp.a().a(arrayList);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsDailyDetailPresenter.this.g();
            }
        });
    }
}
