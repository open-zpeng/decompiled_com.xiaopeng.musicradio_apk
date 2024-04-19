package com.xiaopeng.musicradio.proxy;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class MusicCommonPresenter extends BasePresenter<a> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChange(age.l lVar) {
        c();
    }

    public void c() {
        Log.i("MusicCommonPresenter", "refreshPlayState: =========");
        aek e = aei.a().e();
        if (e != null) {
            if (a() != null) {
                a().a(aei.a().c(), e.getPlayState());
            }
        } else if (a() != null) {
            a().a(-1, -1);
        }
    }

    public void a(MusicInfo musicInfo) {
        if (musicInfo.enableLove()) {
            anc.a().a(musicInfo);
        }
    }

    public void a(MusicSongBean musicSongBean) {
        MusicInfo a = ab.a(musicSongBean, 40, "搜索");
        if (a.enableLove()) {
            anc.a().a(a);
        }
    }

    public void a(MusicRadioItem musicRadioItem) {
        if (ant.a().a(musicRadioItem.getId())) {
            anc.a().a(ab.a(musicRadioItem));
        } else {
            anc.a().b(ab.a(musicRadioItem));
        }
    }

    public void a(RdAlbumBean rdAlbumBean) {
        if (rdAlbumBean != null) {
            axh.a().a(aq.a(rdAlbumBean, System.currentTimeMillis()), false);
        }
    }

    public void d() {
        NetRadioProgramInfo d = aps.i().d();
        if (d == null || d.getParentInfo() == null) {
            return;
        }
        ane.a().a(d.getParentInfo());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onShowToast(agg.ab abVar) {
        if (a() != null) {
            a().a(abVar.a);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onShowXmlaDialog(agg.an anVar) {
        if (a() != null) {
            a().b(anVar.a);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioTypeChange(agg.g gVar) {
        if (a() != null) {
            a().a(gVar.a());
        }
    }
}
