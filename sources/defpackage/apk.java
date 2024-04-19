package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ToastUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import com.xiaopeng.musicradio.bean.player.PlayerSelector;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.player.h;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.af;
import com.xiaopeng.musicradio.utils.ah;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.bh;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.agg;
import defpackage.ags;
import defpackage.ave;
import defpackage.bck;
import java.io.File;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicControlModel.java */
/* renamed from: apk  reason: default package */
/* loaded from: classes2.dex */
public class apk implements aek, h.a {
    ags a;
    int b;
    private boolean c;
    private Boolean d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private PlayerSelector i;
    private ape j;
    private apl k;
    private apn l;
    private api m;
    private ags.a n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicControlModel.java */
    /* renamed from: apk$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final apk a = new apk();
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void b(boolean z) {
    }

    @Override // defpackage.aek
    public boolean enablePlayMode() {
        return true;
    }

    static /* synthetic */ int e(apk apkVar) {
        int i = apkVar.f;
        apkVar.f = i + 1;
        return i;
    }

    public static apk i() {
        return a.a;
    }

    private apk() {
        this.c = false;
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = true;
        this.h = false;
        this.b = -1;
        this.n = new ags.a() { // from class: apk.8
            @Override // defpackage.ags.a
            public void focusPause() {
                LogUtils.i("MusicControlModel", "focusPause: " + apk.this.b);
                if (apk.this.b == 2 || apk.this.b == 1) {
                    apk.this.pause();
                }
            }

            @Override // defpackage.ags.a
            public void lowerVolume() {
                apk.this.a.a(new ags.c() { // from class: apk.8.1
                    @Override // defpackage.ags.c
                    public void updateSoundVolume(float f) {
                        apk.this.setVolume(f);
                    }
                });
            }

            @Override // defpackage.ags.a
            public void riseVolume() {
                apk.this.a.b(new ags.c() { // from class: apk.8.2
                    @Override // defpackage.ags.c
                    public void updateSoundVolume(float f) {
                        apk.this.setVolume(f);
                    }
                });
            }

            @Override // defpackage.ags.a
            public void focusPlay() {
                apk.this.c(false);
            }
        };
        this.i = new PlayerSelector(0);
        this.i.setPlayListener(this);
        A();
        this.a = ags.a();
        this.m = new atg(this);
    }

    private void A() {
        this.l = new apn();
        this.k = new apl();
        if (ay.b("data_provider", 0) == 0) {
            l();
        } else {
            m();
        }
    }

    public void j() {
        if (ad.a(x()) || ad.b(x())) {
            return;
        }
        this.l.t();
    }

    public void k() {
        ban.g(new Runnable() { // from class: apk.1
            @Override // java.lang.Runnable
            public void run() {
                if (ad.a(apk.this.x()) || ad.b(apk.this.x())) {
                    return;
                }
                apk.this.l.s();
                apk.this.k.r();
                apk.this.i.reset();
            }
        });
    }

    public void l() {
        if (r()) {
            return;
        }
        ape apeVar = this.j;
        if (apeVar != null) {
            apeVar.n();
            this.j.k();
        }
        this.j = this.l;
        ay.a("data_provider", 0);
        u.c(new age.p(0));
        a(c());
        this.l.q();
        Log.i("MusicControlModel", "try2UserProvider: ==============");
    }

    public void m() {
        if (s()) {
            return;
        }
        ape apeVar = this.j;
        if (apeVar != null) {
            apeVar.n();
            this.j.k();
        }
        this.j = this.k;
        ay.a("data_provider", 1);
        u.c(new age.p(0));
        this.k.q();
        Log.i("MusicControlModel", "try2NormalProvider: =============");
    }

    public ape n() {
        return this.j;
    }

    public apn o() {
        return this.l;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNetValid(agg.p pVar) {
        if (w()) {
            d(false);
            B();
        }
    }

    @Override // defpackage.aek
    public void register() {
        this.a.a(this, this.n);
        u.a(this);
    }

    @Override // defpackage.aek
    public void unregister() {
        ape apeVar = this.j;
        if (apeVar != null) {
            apeVar.q();
        }
        this.h = false;
        this.a.a(this);
        u.b(this);
    }

    protected void p() {
        LogUtils.i("MusicControlModel", "changeToMusic");
        if (aei.a().c() != 0) {
            aei.a().a(0);
        }
    }

    public void a(List<MusicInfo> list, String str) {
        LogUtils.i("MusicControlModel", "play:" + str);
        af.a();
        if (y() || list.size() == 0) {
            return;
        }
        this.f = 0;
        bcj.a().d();
        bcj.a().f();
        ah.a(0);
        this.d = false;
        p();
        l();
        this.l.a(list, str);
        a(v(), 0);
    }

    public void a(List<MusicInfo> list, MusicInfo musicInfo, String str) {
        a(list, musicInfo, str, true);
    }

    public void a(List<MusicInfo> list, MusicInfo musicInfo, String str, boolean z) {
        LogUtils.i("MusicControlModel", "play:" + str + " musicInfo=" + musicInfo);
        af.a();
        if (z && y()) {
            return;
        }
        bcj.a().d();
        bcj.a().f();
        ah.a(0);
        this.f = 0;
        this.d = false;
        p();
        l();
        this.l.a(list, musicInfo, str);
        a(v(), 0, z);
    }

    public List<MusicInfo> q() {
        return this.j.e();
    }

    @Override // defpackage.aek
    public void play() {
        af.a();
        LogUtils.i("MusicControlModel", "precheck play: ");
        if (y()) {
            return;
        }
        boolean z = false;
        ListSignBean listSignBean = (ListSignBean) z.a(x(), (Class<Object>) ListSignBean.class);
        if (listSignBean != null && (TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_LOCAL_RM_MUSIC) || TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_USB_MUSIC))) {
            z = true;
        }
        p();
        if (z || !apx.a().e()) {
            LogUtils.i("MusicControlModel", "can play: ");
            ags.a().b(new ags.d() { // from class: apk.2
                @Override // defpackage.ags.d
                public void updateSoundVolume(float f) {
                    apk.this.setVolume(f);
                }

                @Override // defpackage.ags.d
                public void changeState() {
                    if (apk.this.j.g() != -1) {
                        apk.this.c(true);
                    } else if (apk.this.j.e().size() <= 0) {
                        apk.this.j.a(true);
                    } else {
                        apk.this.a();
                    }
                }
            });
        }
    }

    public void a(MusicInfo musicInfo, boolean z) {
        LogUtils.i("MusicControlModel", "play " + musicInfo + " playWhenReady" + z);
        a(false, musicInfo, z, true);
    }

    public void a(MusicInfo musicInfo) {
        a(musicInfo, true);
    }

    public void a(MusicInfo musicInfo, String str) {
        a(true, musicInfo, true, true);
    }

    public void a(MusicInfo musicInfo, String str, boolean z) {
        a(true, musicInfo, z, true);
    }

    public void b(MusicInfo musicInfo) {
        if (this.m.a(musicInfo)) {
            a(false, musicInfo, true, false);
        }
    }

    private void a(boolean z, MusicInfo musicInfo, boolean z2, boolean z3) {
        Log.i("MusicControlModel", "play:useNormalProvider=" + z + "playWhenReady=" + z2 + ",switchProvider=" + z3 + ",musicInfo=" + musicInfo);
        af.a();
        if (aei.a().c() == 0 && u() != null && this.b == 2 && u().equals(musicInfo)) {
            return;
        }
        af.a();
        Log.i("MusicControlModel", "play: igon ===== " + com.xiaopeng.musicradio.model.car.a.a().f());
        if (y()) {
            return;
        }
        p();
        if (z3 && this.j != null) {
            if (z) {
                m();
            } else {
                l();
            }
        }
        this.j.c(musicInfo);
        a(this.j.g(), 0, z2);
    }

    @Override // defpackage.aek
    public void rebootPlay(boolean z) {
        LogUtils.i("MusicControlModel", "rebootPlay: ");
        p();
        af.a();
        if (this.d.booleanValue()) {
            LogUtils.i("MusicControlModel", "mNeedRebootPlay: " + this.d);
            this.j.a(z);
        }
    }

    private void B() {
        LogUtils.i("MusicControlModel", "netRePlay");
        if (this.j.e().size() <= 0 || this.j.g() == -1) {
            return;
        }
        a(this.j.g(), this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        int i;
        LogUtils.i("MusicControlModel", "rePlay,resumeVolume:" + z);
        af.a();
        if (this.j.g() == -1 || (i = this.b) == 2) {
            return;
        }
        if (i == 3 && !this.i.isIdle()) {
            d(1);
            if (this.i.getPlaybackState() == 4) {
                a();
                return;
            }
            this.i.start();
            u.c(new age.c(0));
            return;
        }
        a(this.j.g(), this.e);
        u.c(new age.c(0));
    }

    @Override // defpackage.aek
    public void pause() {
        LogUtils.i("MusicControlModel", "pause");
        if (u() != null) {
            bck.b(u(), new bck.c() { // from class: apk.3
                @Override // defpackage.bck.c
                public boolean a() {
                    return apb.a().c(apk.this.u());
                }
            });
        }
        af.a();
        d(false);
        this.d = false;
        this.j.n();
        if (this.j.e().size() > 0) {
            this.e = this.i.getCurrentPosition();
            d(3);
            ags.a().a(new ags.d() { // from class: apk.4
                @Override // defpackage.ags.d
                public void updateSoundVolume(float f) {
                    apk.this.setVolume(f);
                }

                @Override // defpackage.ags.d
                public void changeState() {
                    apk.this.i.pause();
                }
            });
            return;
        }
        d(-1);
    }

    @Override // defpackage.aek
    public void e() {
        LogUtils.i("MusicControlModel", "forcePause");
        af.a();
        d(false);
        this.d = false;
        this.j.n();
        if (this.j.e().size() > 0) {
            d(3);
            this.e = this.i.getCurrentPosition();
            this.i.pause();
            return;
        }
        d(-1);
    }

    @Override // defpackage.aek
    public void f() {
        play();
    }

    public boolean r() {
        return this.j instanceof apn;
    }

    public boolean s() {
        return this.j instanceof apl;
    }

    @Override // defpackage.aek
    public void b() {
        LogUtils.i("MusicControlModel", "prev");
        af.a();
        if (y()) {
            return;
        }
        this.j.m();
        this.g = false;
        a(this.j.g(), 0);
    }

    @Override // defpackage.aek
    public void a() {
        LogUtils.i("MusicControlModel", "next");
        a(true);
    }

    public void a(boolean z) {
        LogUtils.i("MusicControlModel", "next = " + z);
        af.a();
        if (y()) {
            return;
        }
        this.g = true;
        this.j.l();
        a(v(), 0, z);
    }

    @Override // defpackage.aek
    public void seekTo(int i) {
        LogUtils.i("MusicControlModel", "seekTo: " + i);
        PlayerSelector playerSelector = this.i;
        if (playerSelector != null) {
            playerSelector.seekTo(i);
        }
    }

    @Override // defpackage.aek
    public int getPosition() {
        PlayerSelector playerSelector = this.i;
        if (playerSelector != null) {
            return playerSelector.getCurrentPosition();
        }
        return 0;
    }

    @Override // defpackage.aek
    public int getSecondPosition() {
        return this.i.getSecondPosition();
    }

    @Override // defpackage.aek
    public int getDuration() {
        int duration;
        af.a();
        MusicInfo d = d();
        if (d != null && d.getShortDurationS().intValue() > 0 && d.getIsShortListen().booleanValue()) {
            duration = d.getShortDurationS().intValue();
        } else {
            duration = this.j.g() == -1 ? 0 : this.i.getDuration();
        }
        return (duration > 0 || d == null) ? duration : (int) d.getDuration();
    }

    @Override // defpackage.aek
    public int getStartPosition() {
        return this.m.a();
    }

    @Override // defpackage.aek
    public int getPlayState() {
        return this.b;
    }

    @Override // defpackage.aek
    public void a(int i) {
        Log.i("MusicControlModel", "setPlayMode: oldMode = " + c() + " newMode = " + i);
        this.k.b(i);
        this.l.b(i);
    }

    @Override // defpackage.aek
    /* renamed from: t */
    public MusicInfo d() {
        return u();
    }

    @Override // defpackage.aek
    public boolean setVolume(float f) {
        if (f == 0.0f || f == 1.0f) {
            LogUtils.d("MusicControlModel", "setVolume() called with: volume = [" + f + "]");
        }
        this.i.setVolume(f, f);
        return true;
    }

    @Override // defpackage.aek
    public int c() {
        return this.l.h();
    }

    public MusicInfo u() {
        return this.j.f();
    }

    public int v() {
        return this.j.g();
    }

    private void a(int i, int i2, boolean z) {
        a(i, i2, z, false);
    }

    private void a(int i, int i2, boolean z, boolean z2) {
        LogUtils.i("MusicControlModel", "prepare:" + i + " second=" + i2);
        af.a();
        ah.b(u());
        if (i2 == 0) {
            this.i.reset();
        }
        if (i == -1) {
            return;
        }
        MusicInfo a2 = this.j.a(i);
        Log.i("MusicControlModel", "prepare: " + a2 + " playWhenReady = " + z + " igon = " + com.xiaopeng.musicradio.model.car.a.a().f());
        this.j.d(a2);
        boolean z3 = false;
        d(false);
        String data = a2.getData();
        if (TextUtils.isEmpty(data)) {
            z3 = true;
        } else {
            File file = new File(data);
            Log.i("MusicControlModel", "File   localData" + data);
            if (file.exists() || f(data)) {
                Log.i("MusicControlModel", "localData" + data);
                this.i.seekTo(i2);
                this.i.setData(null);
                if (f(data)) {
                    this.i.prepareData(data, false, true, z);
                } else {
                    this.i.prepareData(Uri.fromFile(file).toString(), false, true, z);
                }
            } else if (a2.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX)) {
                b(com.xiaopeng.musicradio.a.a.getResources().getString(b.f.no_usb_file_exist));
                a(0, data);
                return;
            } else {
                z3 = true;
            }
        }
        if (z) {
            d(1);
        }
        if (z3) {
            a(a2, i2, x(), z, z2);
        }
    }

    private boolean f(String str) {
        return str.startsWith("file:///android_asset");
    }

    void a(int i, int i2) {
        a(i, i2, true);
    }

    public void a(final MusicInfo musicInfo, final int i, String str, final boolean z, boolean z2) {
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
            Log.i("MusicControlModel", "playNet cache: igon = " + com.xiaopeng.musicradio.model.car.a.a().f());
            if (a(musicInfo, i, str, z)) {
                return;
            }
        }
        Log.i("MusicControlModel", "playNet: " + z + " listsing = " + str);
        u.c(new age.m(0, i, this.i.getSecondPosition()));
        if (((bcu) c.a().b(bcu.class)).isXpVip()) {
            musicInfo.setQuality(amu.a().b());
        }
        bck.a(musicInfo, new bck.c() { // from class: apk.5
            @Override // defpackage.bck.c
            public boolean a() {
                return apb.a().c(musicInfo);
            }
        });
        bck.a(musicInfo, str, new bck.c() { // from class: apk.6
            @Override // defpackage.bck.c
            public boolean a() {
                return apb.a().c(musicInfo);
            }
        });
        this.m.a(musicInfo, str, z, z2, new aph() { // from class: apk.7
            @Override // defpackage.aph
            public void a(MusicInfo musicInfo2, boolean z3, String str2) {
                MusicInfo musicInfo3 = musicInfo;
                Bundle a2 = ave.a(musicInfo.getHash(), musicInfo.getSong(), musicInfo.getAlbumName(), 0, 0, musicInfo3.getQualitySize(musicInfo3.getQuality()));
                musicInfo2.setTempNetUrl(str2);
                apk.this.i.setData(a2);
                Log.i("MusicControlModel", "playNet cache: igon = " + com.xiaopeng.musicradio.model.car.a.a().f());
                ags.a().h();
                apk.this.i.prepareData(str2, false, true, z3);
                apk.this.i.seekTo(i);
            }

            @Override // defpackage.aph
            public void a(MusicInfo musicInfo2, String str2, int i2, String str3) {
                Log.i("MusicControlModel", "error: " + i2);
                if (!TextUtils.equals(apk.this.x(), str2)) {
                    Log.i("MusicControlModel", "error: getListSign = " + apk.this.x() + " listSign = " + str2);
                    return;
                }
                MusicInfo u = apk.this.u();
                if (u != null && !TextUtils.equals(u.getHash(), musicInfo.getHash())) {
                    Log.i("MusicControlModel", "error: playing = " + u.getHash() + " hash = " + musicInfo.getHash());
                } else if (i2 == 5000002 || i2 == 5000009) {
                    if (!TextUtils.isEmpty(str3) && musicInfo.getTryFileInfo() == null) {
                        apk.this.b(str3);
                    }
                    if (u != null) {
                        u.setHasCopyright(false);
                    }
                    apk.e(apk.this);
                    if (apk.this.f < apk.this.j.e().size()) {
                        if (apk.this.g) {
                            apk.this.a();
                            return;
                        } else {
                            apk.this.b();
                            return;
                        }
                    }
                    apk.this.pause();
                    if (TextUtils.isEmpty(str3) || musicInfo.getTryFileInfo() == null) {
                        return;
                    }
                    apk.this.b(str3);
                } else {
                    String e = apk.e(musicInfo.getHash());
                    if (TextUtils.isEmpty(e)) {
                        apk.this.b(bj.a(i2, str3));
                        apk.this.pause();
                        apk.this.d(true);
                        apk.this.j.j();
                        return;
                    }
                    Log.i("MusicControlModel", "error: playState = " + apk.this.b);
                    if (apk.this.b == 1) {
                        MusicInfo musicInfo3 = musicInfo;
                        apk.this.i.setData(ave.a(musicInfo.getHash(), musicInfo.getSong(), musicInfo.getAlbumName(), 0, 0, musicInfo3.getQualitySize(musicInfo3.getQuality())));
                        apk.this.i.prepareData(e, false, true, z);
                        apk.this.i.seekTo(i);
                        return;
                    }
                    apk.this.pause();
                }
            }
        });
    }

    public boolean a(String str) {
        return aei.a().c() == 0 && this.j.g() != -1 && TextUtils.equals(x(), str);
    }

    private void C() {
        if (getPlayState() == 3) {
            return;
        }
        if (this.j.h() == 3) {
            a(this.j.g(), 0);
        } else {
            a();
        }
    }

    @Override // defpackage.aek
    public void h() {
        a(this.j.g(), getPosition(), getPlayState() == 2, true);
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void playState(int i) {
        LogUtils.i("MusicControlModel", "playState: " + i);
        this.m.a(i);
        if (i == -1) {
            d(-1);
        } else if (i == 5) {
            MusicInfo d = d();
            if (d != null && !d.getIsShortListen().booleanValue() && getPosition() < getDuration() - 5) {
                ToastUtils.showToast(com.xiaopeng.musicradio.a.a, com.xiaopeng.musicradio.a.a.getResources().getString(b.f.music_source_err_next));
            }
            ah.e(d());
            C();
            ah.c(u());
        } else {
            switch (i) {
                case 1:
                    d(1);
                    ah.b(u());
                    return;
                case 2:
                    this.f = 0;
                    d(2);
                    return;
                case 3:
                    d(3);
                    return;
                default:
                    return;
            }
        }
    }

    void b(int i) {
        Log.i("MusicControlModel", "savePlayState: " + i);
        ay.a("music_play_state", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        Log.i("MusicControlModel", "setNetAutoReplay: " + z);
        this.c = z;
        if (this.c) {
            b(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w() {
        return !ags.a().e() && this.c && com.xiaopeng.musicradio.model.car.a.a().f();
    }

    public String x() {
        return this.j.o();
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void a(int i, String str) {
        apl aplVar;
        LogUtils.i("MusicControlModel", "onPlayError: " + i);
        if (!this.m.a(i, str) && i <= 10) {
            if (i == 0) {
                pause();
                if (!ad.b(x())) {
                    d(true);
                }
                if (u() != null && u().getMusicFrom() == 61) {
                    if (((bas) c.a().b(bas.class)).hasMountedUsbDisk()) {
                        c(b.f.usb_play_error);
                    } else {
                        c(b.f.no_usb_file_exist);
                    }
                } else if (str != null && !str.startsWith("/")) {
                    b(bj.a());
                }
                this.j.j();
            } else if (i == 3) {
                b(bj.a(com.xiaopeng.musicradio.a.a.getResources().getString(b.f.music_source_err_next)));
                this.f++;
                if (this.f >= this.j.e().size()) {
                    pause();
                } else {
                    a();
                }
            } else {
                ape apeVar = this.j;
                if (apeVar != null && (apeVar instanceof apl) && (aplVar = this.k) != null && aplVar.o_() != null && this.k.o_().w()) {
                    pause();
                    return;
                }
                b(com.xiaopeng.musicradio.a.a.getString(b.f.tip_music_play_error_next));
                this.f++;
                if (this.f >= this.j.e().size()) {
                    pause();
                } else if (this.g) {
                    a();
                } else {
                    b();
                }
            }
        }
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onPlayPosition(int i, int i2) {
        if (this.b != -1) {
            this.e = i;
        }
        MusicInfo u = u();
        if (u != null) {
            int intValue = u.getShortDurationS().intValue() > 0 ? u.getShortDurationS().intValue() : 60;
            if (u.getIsShortListen().booleanValue()) {
                age.m mVar = new age.m(0, i, i2, intValue);
                mVar.a(this.m.a());
                u.c(mVar);
            } else {
                age.m mVar2 = new age.m(0, i, i2);
                mVar2.a(this.m.a());
                u.c(mVar2);
            }
            if (u.getIsShortListen() == null || !u.getIsShortListen().booleanValue() || i <= intValue) {
                return;
            }
            C();
            return;
        }
        u.c(new age.m(0, i, i2));
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onTimeLineChange() {
        u.c(new age.t(0));
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onDownloaded(String str, long j) {
        LogUtils.i("MusicControlModel", "onDownloaded: " + str + " length=" + j);
    }

    public void a(ahp<MusicInfo> ahpVar) {
        LogUtils.i("MusicControlModel", "play: mediaSource");
        af.a();
        if (y()) {
            return;
        }
        if (ahpVar.c() && ahpVar.d() != null && ahpVar.d().size() >= 1 && ahpVar.e() >= 0 && ahpVar.e() < ahpVar.d().size()) {
            if (!this.m.a(ahpVar.d().get(ahpVar.e())) && ahpVar.d().size() == 1) {
                return;
            }
        }
        this.f = 0;
        p();
        m();
        bcj.a().d();
        this.i.reset();
        if (!ahpVar.w()) {
            d(1);
        }
        this.k.a(ahpVar);
        if (ahpVar.x()) {
            u.c(new agg.v());
        }
    }

    public void c(int i) {
        String string = com.xiaopeng.musicradio.a.a.getString(i);
        ak.a(com.xiaopeng.musicradio.a.a, string);
        u.f(new agg.ab(string));
    }

    public void b(String str) {
        ak.a(com.xiaopeng.musicradio.a.a, str);
        u.f(new agg.ab(str));
    }

    public boolean y() {
        if (ags.a().g()) {
            c(b.f.tips_can_not_play_music);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        if (i == -1 && this.j.e().size() > 0) {
            this.b = 3;
        }
        this.j.d(i);
        if (this.b == i) {
            return;
        }
        this.b = i;
        LogUtils.i("MusicControlModel", "dealPlayState: " + this.b);
        u.f(new age.l(0, this.b, this.j.p()));
        MusicInfo f = this.j.f();
        if (f != null) {
            if (i == 2 || i == 1) {
                b(2);
            } else if (i == 3) {
                b(3);
            }
        }
        if (f != null) {
            if (f.getDuration() == 0) {
                f.setDuration(this.i.getDuration());
            }
            int i2 = this.b;
            if (i2 == 3) {
                ah.b(f);
                ah.e(f);
            } else if (i2 == 2) {
                ah.a(f);
                ah.d(f);
            }
        }
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void onSetData(Bundle bundle) {
        ave.a a2 = new ave().a(bundle);
        if (a2 instanceof avf) {
            a2.b();
        }
    }

    @Override // defpackage.aek
    public void stop() {
        d(-1);
        this.i.stop();
        ah.b(u());
    }

    public void c(String str) {
        this.i.removeCache(str);
    }

    public boolean d(String str) {
        return this.i.isCacheComplete(str);
    }

    public void e(int i) {
        a(bh.a(i), "");
    }

    public static String e(String str) {
        MusicUrlInfo a2 = anz.a().a(str);
        return (a2 == null || TextUtils.isEmpty(a2.getUrl())) ? "" : a2.getUrl();
    }

    private boolean a(MusicInfo musicInfo, int i, String str, boolean z) {
        String e = e(musicInfo.getHash());
        Log.i("MusicControlModel", "playNet: " + musicInfo + " cacheUrl = " + e);
        if (TextUtils.isEmpty(e) || !d(e)) {
            return false;
        }
        Bundle a2 = ave.a(musicInfo.getHash(), musicInfo.getSong(), musicInfo.getAlbumName(), 0, 0, musicInfo.getQualitySize(musicInfo.getQuality()));
        Log.i("MusicControlModel", "playNet: playCache");
        this.i.setData(a2);
        this.i.prepareData(e, false, true, z);
        this.i.seekTo(i);
        return true;
    }

    @Override // defpackage.aek
    public boolean g() {
        Log.i("MusicControlModel", "mNetAutoReplay, needRebootPlay = " + this.c + ags.a().i());
        return ags.a().i();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSongQualityChangeEvent(agg.ag agVar) {
        if (agVar == null || !agVar.a()) {
            return;
        }
        f(agVar.b());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbDetached(agg.ae.a aVar) {
        MusicInfo d;
        if (aei.a().c() == 0 && (d = d()) != null && d.getHash().startsWith(ListSignBean.LOCAL_USB_PREFIX)) {
            stop();
        }
    }

    private void f(int i) {
        Log.i("MusicControlModel", "rePlayWhenChangeQuality: ========== " + i);
        this.m.a(i, u());
    }

    public void z() {
        if (this.j.g() != -1) {
            int g = this.j.g();
            int i = this.e;
            boolean z = true;
            if (getPlayState() != 2 && getPlayState() != 1) {
                z = false;
            }
            a(g, i, z);
            u.c(new age.c(0));
        }
    }
}
