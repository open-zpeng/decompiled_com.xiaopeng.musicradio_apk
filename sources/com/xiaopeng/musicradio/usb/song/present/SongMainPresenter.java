package com.xiaopeng.musicradio.usb.song.present;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.bbf;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SongMainPresenter extends BasePresenter<bbz> {
    private List<MusicInfo> b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("SongMainPresenter", "onCreateView");
        u.a(this);
        int e = bbh.a().e();
        if (e == 2) {
            c();
        } else if (e == 3) {
            if (a() != null) {
                a().aw_();
            }
        } else if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicReleased(agg.ae.e eVar) {
        List<MusicInfo> list = this.b;
        if (list != null) {
            list.clear();
        }
        if (a() != null) {
            a().aw_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoading(agg.ae.d dVar) {
        if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoaded(agg.ae.c cVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (a() != null) {
            a().ax_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().ax_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealUsbInfo(bbf.b bVar) {
        List<MusicInfo> f = bbh.a().f();
        if (bVar == null || f.size() == 0 || TextUtils.isEmpty(bVar.a())) {
            return;
        }
        for (int i = 0; i < f.size(); i++) {
            MusicInfo musicInfo = f.get(i);
            if (TextUtils.equals(bVar.a(), musicInfo.getHash())) {
                if (a() != null) {
                    a().a(i, musicInfo);
                    return;
                }
                return;
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealDelNoAudio(bbf.a aVar) {
        if (aVar == null || this.b.size() == 0 || TextUtils.isEmpty(aVar.a())) {
            return;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (TextUtils.equals(aVar.a(), this.b.get(i).getHash())) {
                if (a() != null) {
                    a().m_(i);
                    this.b.remove(i);
                    return;
                }
                return;
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealUpdateSongLogo(agg.ad adVar) {
        if (a() != null) {
            a().ay_();
        }
    }

    private void c() {
        if (a() == null || bbh.a().e() != 2) {
            return;
        }
        this.b = new ArrayList(bbh.a().f());
        if (this.b.size() > 0) {
            a().a(this.b);
        } else {
            a().aw_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().j();
        }
    }
}
