package com.xiaopeng.musicradio.music.concentration.daily.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.daily.view.a;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import defpackage.amp;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsDailyPresenter extends MusicBasePresenter<a> implements amp.a, amp.b {
    private n<Boolean> d;
    private String e;
    private long f;
    private ArrayList<MusicInfo> c = new ArrayList<>();
    private boolean g = false;

    @Override // defpackage.amp.a
    public void p_() {
        Log.i("MsDailyPresenter", "Daily--onDataFetch");
        this.d.a((n<Boolean>) true);
    }

    @Override // defpackage.amp.b
    public void q_() {
        Log.i("MsDailyPresenter", "Daily--onErrorRetry");
        this.d.a((n<Boolean>) true);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        if (iVar != null) {
            if (this.f != amp.a().b()) {
                d();
            }
            this.f = amp.a().b();
            amp.a().a(this);
            if (this.d == null) {
                this.d = new n<>();
            }
            this.d.a(iVar, new o<Boolean>() { // from class: com.xiaopeng.musicradio.music.concentration.daily.presenter.MsDailyPresenter.1
                @Override // androidx.lifecycle.o
                public void a(Boolean bool) {
                    if (bool == null || !bool.booleanValue() || MsDailyPresenter.this.f == amp.a().b()) {
                        return;
                    }
                    Log.i("MsDailyPresenter", "Daily--observe--onChanged");
                    MsDailyPresenter.this.d();
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        Log.i("MsDailyPresenter", "onDestroy");
        this.d.a(iVar);
        amp.a().b(this);
        this.f = amp.a().b();
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onCreate(iVar);
        if (iVar != null) {
            Log.i("MsDailyPresenter", "onResume");
            if (TextUtils.isEmpty(this.e)) {
                this.e = aqh.a().b();
            } else {
                String b = aqh.a().b();
                if (!this.e.equals(b) || this.c.size() == 0) {
                    this.e = b;
                    Log.i("MsDailyPresenter", "uid changeplayDailyMusic");
                    d();
                    return;
                }
            }
            Log.i("MsDailyPresenter", "firstplayDailyMusic");
            d();
        }
        if (this.c.size() > 0) {
            ArrayList<MusicInfo> b2 = arp.a().b();
            if (b2.size() > 0) {
                this.c.clear();
                this.c.addAll(b2);
                b2.clear();
            }
            if (a() != null) {
                a().a(this.c);
                return;
            }
            return;
        }
        j();
    }

    public void d() {
        if (!apx.a().d()) {
            if (a() != null) {
                a().a("");
                return;
            }
            return;
        }
        Log.i("MsDailyPresenter", "playDailyMusic");
        if (this.g) {
            return;
        }
        if (this.c.size() == 0 && a() != null) {
            a().r_();
        }
        this.g = true;
        amp.a().a(this, false);
        aqz.a().c(new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.concentration.daily.presenter.MsDailyPresenter.2
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                MsDailyPresenter.this.g = false;
                if (MsDailyPresenter.this.a() == null || musicCollectSongListBean == null || musicCollectSongListBean.getData() == null || musicCollectSongListBean.getData().getList() == null || musicCollectSongListBean.getData().getList().size() < 3) {
                    if (MsDailyPresenter.this.c.size() >= 3) {
                        if (MsDailyPresenter.this.a() != null) {
                            MsDailyPresenter.this.a().a(MsDailyPresenter.this.c);
                            MsDailyPresenter.this.j();
                            return;
                        }
                        return;
                    }
                    amp.a().a(MsDailyPresenter.this, true);
                    if (MsDailyPresenter.this.a() != null) {
                        MsDailyPresenter.this.a().b("");
                    }
                    MsDailyPresenter.this.c.clear();
                    return;
                }
                MsDailyPresenter.this.c.clear();
                for (MusicSongBean musicSongBean : musicCollectSongListBean.getData().getList()) {
                    MusicInfo a = ab.a(musicSongBean);
                    if (a != null) {
                        MsDailyPresenter.this.c.add(a);
                    }
                }
                if (MsDailyPresenter.this.a() != null) {
                    MsDailyPresenter.this.a().a(MsDailyPresenter.this.c);
                    MsDailyPresenter.this.j();
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsDailyPresenter.this.g = false;
                amp.a().a(MsDailyPresenter.this, true);
                if (MsDailyPresenter.this.a() != null) {
                    MsDailyPresenter.this.a().a(str);
                }
                MsDailyPresenter.this.c.clear();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_RADIO_SING_EXTRA) && str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC) && str.contains(String.valueOf(-1000L));
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    public void g() {
        atf.a().a(au.b(-1000L, be.a(b.f.daily_title) + bg.h(System.currentTimeMillis())).toJson());
        MusicRadioItem musicRadioItem = new MusicRadioItem();
        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        musicRadioItem.setTitle(be.a(b.f.daily_title));
        musicRadioItem.setName(be.a(b.f.daily_title));
        if (this.c.size() > 0) {
            musicRadioItem.setLogoUrl(this.c.get(0).getLogo());
        }
        musicRadioItem.setId(-1000L);
        ams.a().a(musicRadioItem);
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void h() {
        Log.i("MsDailyPresenter", "reloadDataplayDailyMusic");
        d();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && this.c.size() == 0) {
            d();
        }
    }
}
