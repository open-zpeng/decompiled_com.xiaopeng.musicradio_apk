package com.xiaopeng.musicradio.music.player.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicMatchBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.music.player.view.e;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.v;
import com.xiaopeng.musicradio.utils.w;
import defpackage.age;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MusicLrcPresenter extends BasePresenter<e> {
    private boolean b = false;
    private String c = "";

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        this.b = false;
        Log.i("MusicLrcPresenter", "onResume: ======");
        if (iVar != null) {
            c();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStop(i iVar) {
        super.onStop(iVar);
        this.b = true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealBtMusicPos(age.m mVar) {
        if (a() != null) {
            if (com.xiaopeng.musicradio.utils.b.a(com.xiaopeng.musicradio.a.a) || w.i()) {
                if ((aei.a().c() == 0 || aei.a().c() == 2) && !this.b) {
                    a().a(mVar.c() + mVar.d());
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void refreshLrc(age.h hVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealInfo(age.c cVar) {
        c();
    }

    public void c() {
        BtMusicBean d;
        if (aei.a().c() == 0) {
            MusicInfo u = apk.i().u();
            if (u != null) {
                a(u.getLrcData());
                a(u.getSong(), u.getSinger());
                if (be.a((CharSequence) u.getLrcData()) && (u.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX) || u.getHash().startsWith(ListSignBean.LOCAL_PREFIX))) {
                    a(u);
                }
            } else {
                this.c = "";
                a("", 0);
            }
            if (a() != null) {
                a().a(true);
            }
        } else if (aei.a().c() != 2 || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null) {
        } else {
            a(d.getSong(), d.getSinger());
            String lrcContent = d.getLrcContent();
            if (lrcContent == null) {
                a(d);
            } else {
                a(lrcContent);
            }
            if (a() != null) {
                a().a(false);
            }
        }
    }

    private void a(String str, String str2) {
        if (a() != null) {
            a().a_(str, str2);
        }
    }

    private void a(BtMusicBean btMusicBean) {
        final MusicInfo a = l.c().a(btMusicBean.getSong(), btMusicBean.getSinger());
        if (a != null) {
            String lrcData = a.getLrcData();
            if (!be.a((CharSequence) lrcData)) {
                a(lrcData);
                return;
            } else {
                ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicLrcPresenter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String hash = a.getHash();
                        byte[] a2 = v.a("/mnt/sdcard/xiaopengmusic/lrc/" + hash);
                        if (a2 != null) {
                            final String str = new String(a2);
                            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicLrcPresenter.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    MusicLrcPresenter.this.a(str);
                                }
                            });
                            return;
                        }
                        MusicLrcPresenter.this.a("");
                    }
                });
                return;
            }
        }
        a("");
    }

    public void a(String str) {
        aek e = aei.a().e();
        if (a() == null || e == null) {
            return;
        }
        LogUtils.i("MusicLrcPresenter", "refreshLrc: " + str);
        if (TextUtils.isEmpty(str)) {
            if (a() != null) {
                this.c = "";
                a(str, e.getPosition() + e.getStartPosition());
            }
        } else if (TextUtils.equals(str, this.c)) {
            a().a(e.getPosition() + e.getStartPosition());
        } else {
            this.c = str;
            a(str, e.getPosition() + e.getStartPosition());
        }
    }

    private void a(String str, int i) {
        if (a() != null) {
            if (str == null && !apx.a().d()) {
                str = "";
            }
            a().a(str, i);
        }
    }

    public void d() {
        this.c = null;
    }

    private void a(final MusicInfo musicInfo) {
        if (apx.a().d()) {
            aqz.a().a(musicInfo.getSinger(), musicInfo.getSong(), new avc<MusicMatchBean>() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicLrcPresenter.2
                private String c;

                {
                    this.c = musicInfo.getHash();
                }

                @Override // defpackage.avc
                public void a(MusicMatchBean musicMatchBean) {
                    MusicInfo d = apk.i().d();
                    String str = this.c;
                    if (str == null || d == null || str.equalsIgnoreCase(d.getHash())) {
                        String lyricContent = musicMatchBean.getData().getLyricContent();
                        if (TextUtils.isEmpty(lyricContent)) {
                            MusicLrcPresenter.this.a("");
                            LogUtils.i("MusicLrcPresenter", "getLocalLrc lrcContent is empty");
                            return;
                        }
                        musicInfo.setLrcData(lyricContent);
                        anv.a().b(musicInfo, true);
                        u.c(new age.h());
                    }
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    MusicLrcPresenter.this.a("");
                    LogUtils.i("MusicLrcPresenter", "call getLocalLrc error: " + i + " msg=" + str);
                }
            });
        }
    }

    public void a(int i) {
        if (aei.a().c() == 0) {
            MusicInfo d = apk.i().d();
            if (d != null && d.getIsShortListen().booleanValue() && i > apk.i().getDuration()) {
                ak.a(com.xiaopeng.musicradio.a.a, "歌曲片段试听中，QQ音乐vip会员可畅听完整版");
            } else {
                apk.i().seekTo(i);
            }
        }
    }
}
