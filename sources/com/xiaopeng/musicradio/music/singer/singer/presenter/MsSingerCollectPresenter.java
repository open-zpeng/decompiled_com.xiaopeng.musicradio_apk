package com.xiaopeng.musicradio.music.singer.singer.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.music.singer.singer.view.a;
import java.util.List;
/* loaded from: classes.dex */
public class MsSingerCollectPresenter extends MusicBasePresenter<a> {
    private String c = "0";
    private int d = 1;
    private boolean e = true;
    private boolean f = false;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsSingerCollectPresenter", "onCreateView");
        if (this.f) {
            j();
        }
    }

    public void d() {
        if (this.d == 1 && a() != null) {
            a().r_();
        }
        aqz.a().b(this.c, this.d, new avc<RecommentMusicResult>() { // from class: com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerCollectPresenter.1
            @Override // defpackage.avc
            public void a(RecommentMusicResult recommentMusicResult) {
                MsSingerCollectPresenter msSingerCollectPresenter = MsSingerCollectPresenter.this;
                msSingerCollectPresenter.a(recommentMusicResult, msSingerCollectPresenter.d);
                MsSingerCollectPresenter.this.k();
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (MsSingerCollectPresenter.this.a() != null) {
                    MsSingerCollectPresenter.this.a().a(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecommentMusicResult recommentMusicResult, int i) {
        if (recommentMusicResult.getData() != null && recommentMusicResult.getData().getList().size() >= 0) {
            List<MusicRadioItem> list = recommentMusicResult.getData().getList();
            if (list.size() != 0) {
                for (MusicRadioItem musicRadioItem : list) {
                    musicRadioItem.setType("listsign_singer_single_music");
                    musicRadioItem.setTitle(musicRadioItem.getName());
                    musicRadioItem.setName(musicRadioItem.getName());
                    musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
                }
                if (a() != null) {
                    if (i == 1) {
                        a().a(list);
                        if (!recommentMusicResult.isFromCache()) {
                            this.d++;
                        }
                    } else {
                        a().b(list);
                        this.d++;
                    }
                }
                this.f = true;
            } else if (i == 1) {
                if (a() != null) {
                    a().b("");
                }
            } else if (a() != null) {
                a().b(list);
            }
            if (this.d > recommentMusicResult.getData().getPage().getTotalPage()) {
                this.e = false;
            }
        } else if (this.d == 1 && a() != null) {
            a().a("");
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) || this.f) {
            return;
        }
        d();
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().e();
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_SINGER_EXTRA) && str.contains("listsign_singer_single_music");
    }

    public void b(String str) {
        this.c = str;
    }

    public boolean g() {
        return this.e;
    }

    public int i() {
        return this.d;
    }
}
