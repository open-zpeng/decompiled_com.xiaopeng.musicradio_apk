package com.xiaopeng.musicradio.music.player.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.player.view.f;
import com.xiaopeng.musicradio.music.player.view.k;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MusicPlayListPresenter extends BasePresenter<f> {
    private n<List<k.d>> b = new n<>();
    private boolean c = true;
    private boolean d = true;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        if (iVar != null) {
            a(iVar);
        } else {
            this.c = false;
        }
    }

    private void a(i iVar) {
        this.c = true;
        this.b.a(iVar, new o<List<k.d>>() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicPlayListPresenter.1
            @Override // androidx.lifecycle.o
            public void a(List<k.d> list) {
                if (MusicPlayListPresenter.this.a() != null) {
                    MusicPlayListPresenter.this.a().a(list, MusicPlayListPresenter.this.d);
                }
            }
        });
        a(true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.l lVar) {
        if (lVar.b() == aei.a().c()) {
            a(false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (cVar.a() == aei.a().c()) {
            a(true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onListRefresh(age.d dVar) {
        if (dVar.a() == aei.a().c()) {
            if (dVar.b()) {
                b(false);
            }
            a(false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoadFail(age.g gVar) {
        if (gVar.a() == 0) {
            b(true);
        }
    }

    private void b(boolean z) {
        if (a() != null) {
            a().a(2, z);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveEvent(agq.l lVar) {
        a(false);
    }

    public void a(boolean z) {
        List<MusicInfo> q = apk.i().q();
        MusicInfo d = apk.i().d();
        ArrayList arrayList = new ArrayList();
        for (MusicInfo musicInfo : q) {
            k.d dVar = new k.d();
            dVar.a = musicInfo.getHash();
            dVar.d = apb.a().c(musicInfo);
            if (d != null && be.a(musicInfo.getHash(), d.getHash()) && musicInfo.getAlbumId() == d.getAlbumId()) {
                dVar.b = apk.i().getPlayState();
            } else {
                dVar.b = -1;
            }
            dVar.c = musicInfo;
            dVar.e = musicInfo.getMusicFrom() == 61 || (au.a() && !TextUtils.isEmpty(musicInfo.getHash()) && musicInfo.getHash().startsWith(ListSignBean.LOCAL_PREFIX));
            arrayList.add(dVar);
        }
        this.d = z;
        this.b.b((n<List<k.d>>) arrayList);
        if (this.c || a() == null) {
            return;
        }
        a().a(arrayList, z);
    }

    public int c() {
        List<k.d> a = this.b.a();
        if (a != null && a.size() > 0) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).b != -1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void a(String str) {
        MusicInfo c = c(str);
        if (c != null) {
            a(c);
        }
    }

    public void b(String str) {
        MusicInfo c = c(str);
        if (c != null) {
            b(c);
        }
    }

    private MusicInfo c(String str) {
        List<k.d> a = this.b.a();
        if (a != null) {
            for (k.d dVar : a) {
                if (dVar.c != null && TextUtils.equals(dVar.c.getHash(), str)) {
                    return dVar.c;
                }
            }
            return null;
        }
        return null;
    }

    public void a(MusicInfo musicInfo) {
        if (musicInfo != null) {
            anc.a().b(musicInfo);
        }
    }

    public void b(MusicInfo musicInfo) {
        MusicInfo d = apk.i().d();
        if (d == null || !TextUtils.equals(musicInfo.getHash(), d.getHash()) || d.getAlbumId() != musicInfo.getAlbumId()) {
            apk.i().b(musicInfo);
            return;
        }
        int playState = apk.i().getPlayState();
        if (playState == 2) {
            apk.i().pause();
        } else if (playState == 3) {
            apk.i().play();
        }
    }

    public boolean d() {
        ape n;
        apj apjVar;
        if (ad.b(apk.i().x()) || (n = apk.i().n()) == null || n.p() != 2 || (apjVar = (apj) apk.i().n()) == null || apjVar.o_() == null) {
            return false;
        }
        return apjVar.o_().o();
    }

    public void e() {
        apj apjVar;
        ape n = apk.i().n();
        if (n == null || n.p() != 2 || (apjVar = (apj) apk.i().n()) == null || apjVar.o_() == null) {
            return;
        }
        apjVar.o_().s();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        this.b.a(iVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().C_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealUpdateSongLogo(agg.ad adVar) {
        if (a() != null) {
            a().D_();
        }
    }

    public boolean f() {
        return ad.b(apk.i().x());
    }
}
