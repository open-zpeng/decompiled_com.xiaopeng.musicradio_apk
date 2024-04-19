package com.xiaopeng.musicradio.music.player.presenter;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.player.view.i;
import com.xiaopeng.musicradio.utils.e;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MusicTagsPresenter extends BasePresenter<i> {
    private boolean b;
    private boolean c;

    public MusicTagsPresenter() {
        u.a(this);
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicTagsPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                MusicTagsPresenter.this.d();
            }
        }, 200L);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(androidx.lifecycle.i iVar) {
        super.onResume(iVar);
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onQualityRefreshEvent(age.s sVar) {
        if (aei.a().c() != 0 || a() == null) {
            return;
        }
        a().g();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudio(agg.g gVar) {
        if (a() != null) {
            a().i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (aei.a().c() == 0) {
            MusicInfo d = apk.i().d();
            if (d != null) {
                if (a() != null) {
                    a().a(d.getSinger());
                    e();
                }
            } else if (a() != null) {
                a().f();
            }
        } else if (aei.a().c() == 2) {
            if (com.xiaopeng.musicradio.model.bluetooth.a.i().d() != null) {
                if (a() != null) {
                    e();
                }
            } else if (a() != null) {
                a().f();
            }
        } else if (aei.a().c() == 6 || aei.a().c() == 3 || a() == null) {
        } else {
            a().f();
        }
    }

    private void e() {
        if (!this.c || this.b) {
            return;
        }
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicTagsPresenter.2
            @Override // java.lang.Runnable
            public void run() {
                if (amu.a().e()) {
                    ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicTagsPresenter.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MusicTagsPresenter.this.a() != null) {
                                MusicTagsPresenter.this.a().h();
                            }
                        }
                    }, 200L);
                }
            }
        });
    }

    public boolean c() {
        return e.a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveLogout(agq.v vVar) {
        LogUtils.i("MusicTagsPresenter", "receiveLogout: ");
        if (a() != null) {
            a().j();
        }
    }
}
