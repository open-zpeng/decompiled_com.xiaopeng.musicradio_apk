package com.xiaopeng.musicradio.music.rank.rank.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.RankMusicResult;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.music.rank.rank.view.a;
import defpackage.amp;
import java.util.List;
/* loaded from: classes.dex */
public class MsRankPresenter extends MusicBasePresenter<a> implements amp.a, amp.b {
    private boolean c = false;
    private n<Boolean> d;
    private long e;

    @Override // defpackage.amp.a
    public void p_() {
        Log.i("MsRankPresenter", "msrank--onDataFetch");
        this.d.a((n<Boolean>) true);
    }

    @Override // defpackage.amp.b
    public void q_() {
        Log.i("MsRankPresenter", "msrank--onErrorRetry");
        this.d.a((n<Boolean>) true);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRankPresenter", "onCreate");
        if (iVar != null) {
            if (this.e != amp.a().b()) {
                d();
            }
            this.e = amp.a().b();
            amp.a().a(this);
            if (this.d == null) {
                this.d = new n<>();
            }
            this.d.a(iVar, new o<Boolean>() { // from class: com.xiaopeng.musicradio.music.rank.rank.presenter.MsRankPresenter.1
                @Override // androidx.lifecycle.o
                public void a(Boolean bool) {
                    if (bool == null || !bool.booleanValue() || MsRankPresenter.this.e == amp.a().b()) {
                        return;
                    }
                    Log.i("MsRankPresenter", "msrank--observe--onChanged");
                    MsRankPresenter.this.d();
                }
            });
            d();
        }
        if (this.c) {
            j();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        Log.i("MsRankPresenter", "onDestroy");
        this.d.a(iVar);
        amp.a().b(this);
        this.e = amp.a().b();
    }

    public void d() {
        if (a() != null) {
            a().r_();
        }
        amp.a().a(this, false);
        aqz.a().g(new avc<RankMusicResult>() { // from class: com.xiaopeng.musicradio.music.rank.rank.presenter.MsRankPresenter.2
            @Override // defpackage.avc
            public void a(RankMusicResult rankMusicResult) {
                if (MsRankPresenter.this.a() != null && rankMusicResult != null && rankMusicResult.getData().getList() != null) {
                    List<MusicRadioItem> list = rankMusicResult.getData().getList();
                    if (list.size() == 0) {
                        if (MsRankPresenter.this.a() != null) {
                            MsRankPresenter.this.a().b("");
                            return;
                        }
                        return;
                    }
                    for (MusicRadioItem musicRadioItem : list) {
                        musicRadioItem.setType(ListSignBean.LISTSIGN_RANK_MUSIC);
                        musicRadioItem.setTitle(musicRadioItem.getRankName());
                        musicRadioItem.setName(musicRadioItem.getRankName());
                        musicRadioItem.setId(musicRadioItem.getRankId());
                        musicRadioItem.setLogoUrl(musicRadioItem.getImgUrl());
                        atj.a().a(musicRadioItem.getRankId(), musicRadioItem.getImgUrl());
                    }
                    if (MsRankPresenter.this.a() != null) {
                        MsRankPresenter.this.a().a(list);
                        MsRankPresenter.this.k();
                    }
                    MsRankPresenter.this.c = true;
                    return;
                }
                amp.a().a(MsRankPresenter.this, true);
                if (MsRankPresenter.this.a() != null) {
                    MsRankPresenter.this.a().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                amp.a().a(MsRankPresenter.this, true);
                if (MsRankPresenter.this.a() != null) {
                    MsRankPresenter.this.a().a(str);
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_RADIO_SING_EXTRA) && str.contains(ListSignBean.LISTSIGN_RANK_MUSIC);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) || this.c) {
            return;
        }
        d();
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().e();
        }
    }
}
