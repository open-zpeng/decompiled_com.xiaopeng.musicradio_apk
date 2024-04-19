package com.xiaopeng.musicradio.music.rank.rank.presenter;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.utils.ab;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsRankDetailPresenter extends MsMusicDetailPresenter {
    private int k;

    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    protected void d() {
        aqz.a().e(this.d, this.k, this.e, 50, new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.rank.rank.presenter.MsRankDetailPresenter.1
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                if (musicCollectSongListBean != null && musicCollectSongListBean.getData() != null && musicCollectSongListBean.getData().getList() != null) {
                    if (musicCollectSongListBean.getData().getList().size() >= 3 && MsRankDetailPresenter.this.e == 1) {
                        List<MusicSongBean> list = musicCollectSongListBean.getData().getList();
                        ArrayList arrayList = new ArrayList();
                        int size = list.size();
                        int i = size < 3 ? size : 3;
                        for (int i2 = 0; i2 < i; i2++) {
                            MusicSongBean musicSongBean = list.get(i2);
                            MusicRadioItem.SongInfo songInfo = new MusicRadioItem.SongInfo();
                            songInfo.setSongName(musicSongBean.getSingers() + " - " + musicSongBean.getSongName());
                            arrayList.add(songInfo);
                        }
                        atj.a().a(MsRankDetailPresenter.this.d, arrayList);
                        atj.a().a(MsRankDetailPresenter.this.d, ab.a(list.get(0)).getLogo());
                    }
                }
                MsRankDetailPresenter.this.a(musicCollectSongListBean);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsRankDetailPresenter.this.g();
            }
        });
    }

    public void a(int i) {
        this.k = i;
    }
}
