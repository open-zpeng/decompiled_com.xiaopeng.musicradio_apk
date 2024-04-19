package com.xiaopeng.musicradio.music.main.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.view.a;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.bb;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MsMusicDetailPresenter extends BaseDealNetValidPresenter<a> {
    protected boolean i;
    protected long j;
    public ArrayList<MusicInfo> b = new ArrayList<>();
    public HashMap<String, Boolean> c = new HashMap<>();
    protected long d = 3104910;
    protected int e = 1;
    private boolean k = false;
    public boolean f = false;
    private int l = 10;
    private boolean m = false;
    protected boolean g = false;
    private boolean n = true;
    protected int h = IInputController.KEYCODE_KNOB_WIND_SPD_UP;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NrAllRadioActPresenter", "onCreate");
    }

    public void c() {
        if (this.e == 1 && !this.g && a() != null) {
            a().r_();
            this.j = System.currentTimeMillis();
            this.i = true;
        }
        if (f()) {
            d();
        }
    }

    protected void d() {
        aqz.a().b(this.d, this.e, 50, 0, new avc<MusicCollectSongListBean>() { // from class: com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter.1
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
                MsMusicDetailPresenter.this.a(musicCollectSongListBean);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsMusicDetailPresenter.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final MusicCollectSongListBean musicCollectSongListBean) {
        if (this.i) {
            long currentTimeMillis = System.currentTimeMillis() - this.j;
            if (currentTimeMillis > this.h) {
                b(musicCollectSongListBean);
                return;
            } else {
                ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MsMusicDetailPresenter msMusicDetailPresenter = MsMusicDetailPresenter.this;
                        msMusicDetailPresenter.i = false;
                        msMusicDetailPresenter.b(musicCollectSongListBean);
                    }
                }, this.h - currentTimeMillis);
                return;
            }
        }
        b(musicCollectSongListBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MusicCollectSongListBean musicCollectSongListBean) {
        int i;
        this.f = false;
        List<MusicSongBean> list = (musicCollectSongListBean == null || musicCollectSongListBean.getData() == null) ? null : musicCollectSongListBean.getData().getList();
        if (musicCollectSongListBean.getData() != null && list != null && list.size() >= 0) {
            if (!musicCollectSongListBean.isFromCache()) {
                bb.a(list);
                for (MusicSongBean musicSongBean : list) {
                    Boolean bool = this.c.get(musicSongBean.getHash());
                    if (bool != null) {
                        musicSongBean.setHot(bool.booleanValue());
                    }
                }
            }
            PageBean page = musicCollectSongListBean.getData().getPage();
            if (page != null) {
                i = page.getPage();
                if (a() != null) {
                    a().a(page.getTotal());
                }
            } else {
                i = 1;
            }
            if (list.size() == 0) {
                if (i < 2) {
                    if (a() != null) {
                        a().b("");
                        return;
                    }
                    return;
                }
                this.n = false;
                if (a() != null) {
                    a().u_();
                    return;
                }
                return;
            }
            this.b.clear();
            for (MusicSongBean musicSongBean2 : list) {
                MusicInfo a = ab.a(musicSongBean2, musicCollectSongListBean.isFromCache());
                if (a != null) {
                    this.b.add(a);
                }
            }
            if (a() != null) {
                if (i < 2) {
                    a().a(this.b);
                } else {
                    a().b(this.b);
                }
                this.g = true;
            }
            if (page != null) {
                this.l = page.getTotalPage();
                if (musicCollectSongListBean.isFromCache()) {
                    return;
                }
                this.e = page.getPage() + 1;
                if (this.e > this.l) {
                    this.n = false;
                    if (a() != null) {
                        a().u_();
                        return;
                    }
                    return;
                }
                return;
            }
            this.l = 1;
        } else if (this.e == 1 && a() != null) {
            a().a("");
            this.g = false;
            a().a(0);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) || this.g) {
            return;
        }
        c();
    }

    public void a(long j) {
        this.d = j;
    }

    public void a(boolean z, MusicRadioItem musicRadioItem) {
        if (z) {
            anc.a().a(ab.a(musicRadioItem));
        } else {
            anc.a().b(ab.a(musicRadioItem));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void musicAlbumLoveEvent(agq.f fVar) {
        if (this.d != fVar.a() || a() == null) {
            return;
        }
        a().a(fVar.b());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        j();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        j();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicLove(agq.l lVar) {
        String a = lVar.a();
        boolean c = lVar.c();
        this.c.put(a, Boolean.valueOf(c));
        if (!TextUtils.isEmpty(a)) {
            Iterator<MusicInfo> it = this.b.iterator();
            while (it.hasNext()) {
                MusicInfo next = it.next();
                if (a.equals(next.getHash())) {
                    next.setHot(c);
                    LogUtils.i("NrAllRadioActPresenter", "dealMusicLove:" + lVar.a() + ListSignBean.COLLECTID_SUFFIX + lVar.c() + ",musicInfo=" + next.isHttpCache());
                }
            }
        }
        a a2 = a();
        if (a2 != null) {
            a2.a(a, c);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbLoadingEstimateTime(agg.ae.b bVar) {
        if (a() != null) {
            a().a(bVar.a());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbLoadingTimeout(agg.ae.f fVar) {
        if (a() != null) {
            a().a(-1.0d);
        }
    }

    private void j() {
        if (a() != null) {
            a().s_();
        }
    }

    public void a(List<MusicInfo> list, String str, int i, MusicInfo musicInfo) {
        MusicInfo d = apk.i().d();
        String x = apk.i().x();
        if (d != null && d.equals(musicInfo) && TextUtils.equals(str, x)) {
            if (apk.i().getPlayState() == 2) {
                apk.i().pause();
            } else {
                apk.i().play();
            }
        } else if (list == null || list.isEmpty()) {
        } else {
            int i2 = this.e - 1;
            amq amqVar = new amq(str, i2 == 0 ? 1 : i2, 50, new ArrayList(list), i) { // from class: com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter.3
                @Override // defpackage.ahp
                public boolean n() {
                    return true;
                }
            };
            amqVar.b(this.l);
            apk.i().a(amqVar);
        }
    }

    public void a(MusicInfo musicInfo) {
        if (musicInfo.enableLove()) {
            anc.a().a(musicInfo);
        } else {
            ak.a(com.xiaopeng.musicradio.a.a, f.h.tip_no_can_love);
        }
    }

    public boolean f() {
        if (!this.f && this.e <= this.l) {
            this.f = true;
            return true;
        }
        return false;
    }

    public void g() {
        if (a() != null) {
            a().a("");
        }
        if (this.e != 1) {
            ak.a(com.xiaopeng.musicradio.a.a, b.f.common_tips_loading_failed);
        } else {
            this.g = false;
            if (a() != null) {
                a().a(0);
            }
        }
        this.f = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().t_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveLogout(agq.v vVar) {
        if (com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a)) {
            axu.a();
        } else {
            this.m = true;
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (this.m) {
            this.m = false;
            axu.a();
        }
    }

    public boolean h() {
        return this.n;
    }

    public int i() {
        return this.e;
    }
}
