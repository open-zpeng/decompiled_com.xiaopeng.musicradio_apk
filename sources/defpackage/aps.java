package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.player.PlayerControlModel;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ao;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.app;
import defpackage.apu;
import defpackage.beo;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: NetRadioModel.java */
/* renamed from: aps  reason: default package */
/* loaded from: classes2.dex */
public class aps extends PlayerControlModel {
    private apu a;
    private app b;
    private int c;
    private boolean d;

    /* compiled from: NetRadioModel.java */
    /* renamed from: aps$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aps a = new aps();
    }

    @Override // defpackage.aek
    public void a(int i) {
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void b(boolean z) {
    }

    @Override // defpackage.aek
    public int c() {
        return 0;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public boolean enablePlayMode() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected int getPlayerType() {
        return 6;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public int getStartPosition() {
        return 0;
    }

    public static aps i() {
        return a.a;
    }

    private aps() {
        this.d = false;
        this.b = new app();
        this.a = this.b;
    }

    public boolean j() {
        if (ags.a().g()) {
            b(beo.e.tips_can_not_play_reading);
            return true;
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public void play() {
        NetRadioProgramInfo d = d();
        if (d != null && d.getParentInfo() != null) {
            Log.i("NetRadioModel", "play: " + d.getParentInfo());
            if (d.getParentInfo().isOff() && System.currentTimeMillis() - d.getParentInfo().getOffTime() < 3600000) {
                a(bj.b(9005006, d.getParentInfo().getOffMsg()));
                return;
            }
        }
        super.play();
    }

    public void a(NetRadioProgramInfo netRadioProgramInfo) {
        a(netRadioProgramInfo, true);
    }

    public void a(final NetRadioProgramInfo netRadioProgramInfo, boolean z) {
        if (j()) {
            return;
        }
        Log.i("NetRadioModel", "playBack: " + netRadioProgramInfo.getId());
        if (this.b == null) {
            this.b = new app();
        }
        a(this.b);
        this.b.a(netRadioProgramInfo, new app.b() { // from class: aps.1
            @Override // defpackage.app.b
            public void a(NetRadioInfo netRadioInfo) {
                netRadioInfo.setOff(false);
            }

            @Override // defpackage.app.b
            public void a(int i, String str) {
                if (i == 9005006) {
                    netRadioProgramInfo.getParentInfo().setOff(true);
                    netRadioProgramInfo.getParentInfo().setOffTime(System.currentTimeMillis());
                    netRadioProgramInfo.getParentInfo().setOffMsg(str);
                    aps.this.pause();
                    aps.this.a(bj.b(i, str));
                    return;
                }
                netRadioProgramInfo.getParentInfo().setOff(false);
            }
        });
        a(netRadioProgramInfo, true, z);
    }

    public void a(String str, final boolean z) {
        if (j()) {
            return;
        }
        Log.i("NetRadioModel", "playLive: " + str);
        if (this.b == null) {
            this.b = new app();
        }
        setPlayWhenReady(z);
        a(this.b);
        dealPlayState(1);
        postInfoEvent();
        this.b.a(str, new app.b() { // from class: aps.2
            @Override // defpackage.app.b
            public void a(NetRadioInfo netRadioInfo) {
                Log.i("NetRadioModel", "onSuccess: " + aps.this.mPlayState);
                if (netRadioInfo == null || netRadioInfo.getPlayingInfo() == null || TextUtils.isEmpty(netRadioInfo.getPlayingInfo().getPlayUrl())) {
                    aps.this.mPlayer.reset();
                    ak.b(com.xiaopeng.musicradio.a.a, beo.e.netradio_no_program);
                    aps.this.dealPlayState(4);
                } else {
                    apr.a().a(netRadioInfo);
                    aps apsVar = aps.this;
                    NetRadioProgramInfo playingInfo = netRadioInfo.getPlayingInfo();
                    boolean z2 = true;
                    if (!z || (aps.this.mPlayState != 2 && aps.this.mPlayState != 1)) {
                        z2 = false;
                    }
                    apsVar.a(playingInfo, false, z2);
                }
                u.c(new agg.v());
            }

            @Override // defpackage.app.b
            public void a(int i, String str2) {
                aps.this.pause();
                aps.this.a(bj.b(i, str2));
                Log.e("NetRadioModel", "onFail: " + i);
            }
        });
    }

    public void b(int i) {
        String string = com.xiaopeng.musicradio.a.a.getString(i);
        ak.a(com.xiaopeng.musicradio.a.a, string);
        u.f(new agg.ab(string));
    }

    public void a(String str) {
        Log.i("NetRadioModel", "toastPlayError: " + str);
        ak.a(com.xiaopeng.musicradio.a.a, str);
        u.f(new agg.ab(str));
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public int getDuration() {
        if (m() == 1) {
            return 0;
        }
        return super.getDuration();
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public int getPosition() {
        if (m() == 1) {
            return 0;
        }
        return super.getPosition();
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public int getSecondPosition() {
        return super.getSecondPosition();
    }

    public void a(NetRadioInfo netRadioInfo) {
        a(netRadioInfo, true);
    }

    public void a(final NetRadioInfo netRadioInfo, boolean z) {
        if (j()) {
            return;
        }
        apr.a().a(netRadioInfo);
        Log.i("NetRadioModel", "playLive: " + netRadioInfo);
        if (this.b == null) {
            this.b = new app();
        }
        a(this.b);
        this.b.a(netRadioInfo, new app.b() { // from class: aps.3
            @Override // defpackage.app.b
            public void a(NetRadioInfo netRadioInfo2) {
                netRadioInfo2.setOff(false);
                u.c(new agg.v());
            }

            @Override // defpackage.app.b
            public void a(int i, String str) {
                if (i == 9005006) {
                    netRadioInfo.setOff(true);
                    netRadioInfo.setOffTime(System.currentTimeMillis());
                    netRadioInfo.setOffMsg(str);
                    aps.this.pause();
                    aps.this.a(bj.b(i, str));
                    return;
                }
                netRadioInfo.setOff(false);
            }
        });
        a(netRadioInfo.getPlayingInfo(), false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetRadioProgramInfo netRadioProgramInfo, boolean z, boolean z2) {
        this.mPlayer.reset();
        if (netRadioProgramInfo == null || be.a((CharSequence) netRadioProgramInfo.getPlayUrl())) {
            dealPlayState(4);
            return;
        }
        String name = netRadioProgramInfo.getParentInfo() == null ? "" : netRadioProgramInfo.getParentInfo().getName();
        this.mPlayer.setData(ave.a(netRadioProgramInfo.getId() + "", netRadioProgramInfo.getName(), name, 6, 0, 0));
        prepare(netRadioProgramInfo.getPlayUrl(), false, z, z2);
    }

    private void a(apu apuVar) {
        changePlayer();
        n();
        this.a = apuVar;
    }

    private void n() {
        apu apuVar = this.a;
        if (apuVar != null) {
            apuVar.d();
        }
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected void playCurrent() {
        if (j()) {
            return;
        }
        playCurrentWithPos(0);
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected void playCurrentWithPos(int i) {
        if (j()) {
            return;
        }
        Log.i("NetRadioModel", "playCurrent: " + aei.a().c());
        if (this.a == null || aei.a().c() != 6) {
            return;
        }
        NetRadioProgramInfo e = this.a.e();
        Log.i("NetRadioModel", "playCurrent: " + e);
        a(e, i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetRadioProgramInfo netRadioProgramInfo, int i, boolean z) {
        if (j() || netRadioProgramInfo == null) {
            return;
        }
        Log.i("NetRadioModel", "play: " + netRadioProgramInfo.getPlayUrl());
        if (b(netRadioProgramInfo) == 2) {
            Log.i("NetRadioModel", "play: =====");
            a(netRadioProgramInfo, z);
            seekTo(i);
            u.c(new agg.v());
        } else if (netRadioProgramInfo.getId() == -1) {
            a(String.valueOf(netRadioProgramInfo.getParentInfo().getHz()), z);
        } else {
            a(netRadioProgramInfo.getParentInfo(), z);
        }
    }

    public int b(NetRadioProgramInfo netRadioProgramInfo) {
        return netRadioProgramInfo.getType() == 2 ? 1 : 2;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public void rebootPlay(final boolean z) {
        Log.i("NetRadioModel", "rebootPlay: ");
        a(new app());
        apu apuVar = this.a;
        if (apuVar != null) {
            apuVar.a(new apu.a() { // from class: aps.4
                @Override // defpackage.apu.a
                public void a(NetRadioProgramInfo netRadioProgramInfo) {
                    int j = aps.this.a.j();
                    boolean z2 = true;
                    if (!z && j != 1 && j != 2) {
                        z2 = false;
                    }
                    Log.i("NetRadioModel", "onSuccess: " + j + " info = " + netRadioProgramInfo + " playState = " + j);
                    aps apsVar = aps.this;
                    apsVar.a(netRadioProgramInfo, apsVar.a.g(), z2);
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, defpackage.aek
    public void pause() {
        super.pause();
        a(false);
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected void pauseInner() {
        if (this.a == null || m() == 2) {
            this.mPlayer.pause();
        } else {
            this.mPlayer.stop();
        }
    }

    @Override // defpackage.aek
    public void a() {
        apu apuVar;
        if (j() || (apuVar = this.a) == null || !apuVar.a()) {
            return;
        }
        playCurrent();
    }

    @Override // defpackage.aek
    public void b() {
        apu apuVar;
        if (j() || (apuVar = this.a) == null || !apuVar.b()) {
            return;
        }
        playCurrent();
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, com.xiaopeng.musicradio.player.h.a
    public void onPlayPosition(int i, int i2) {
        super.onPlayPosition(i, i2);
        if ((System.currentTimeMillis() / 1000) % 3 != 0 || this.a == null) {
            return;
        }
        if (m() == 1) {
            this.a.a(0);
        } else {
            this.a.a(i);
        }
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected boolean hasPlayingInfo() {
        apu apuVar = this.a;
        if (apuVar != null) {
            return apuVar.l();
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected boolean hasPlayingList() {
        apu apuVar = this.a;
        if (apuVar != null) {
            return apuVar.m();
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected void dealPlayState(int i) {
        super.dealPlayState(i);
        if (this.mPlayState == 3) {
            ao.b(d());
        } else if (this.mPlayState == 2) {
            ao.a(d());
        }
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel, com.xiaopeng.musicradio.player.h.a
    public void playState(int i) {
        super.playState(i);
        Log.i("NetRadioModel", "playState: " + i);
        if (this.mPlayState == 2) {
            this.c = 0;
        } else if (this.mPlayState == 5) {
            ao.c(d());
        }
    }

    @Override // defpackage.aek
    /* renamed from: k */
    public NetRadioProgramInfo d() {
        apu apuVar = this.a;
        if (apuVar != null) {
            return apuVar.e();
        }
        return null;
    }

    public List<NetRadioProgramInfo> l() {
        app appVar = this.b;
        if (appVar != null) {
            return appVar.n();
        }
        return null;
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected void postStateEvent() {
        if (this.a != null) {
            u.f(new age.l(6, this.mPlayState, m()));
        }
    }

    @Override // com.xiaopeng.musicradio.bean.player.PlayerControlModel
    protected void savePlayState(int i) {
        apu apuVar = this.a;
        if (apuVar != null) {
            apuVar.b(i);
        }
    }

    @Override // com.xiaopeng.musicradio.player.h.a
    public void a(int i, String str) {
        Log.i("NetRadioModel", "onPlayError: " + i + " tryCount = " + this.c);
        if (i > 10) {
            return;
        }
        this.c++;
        Log.i("NetRadioModel", "onPlayError: " + NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a));
        if (this.c > 3 || !NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
            pause();
            a(true);
            a(bj.a());
            return;
        }
        playCurrentWithPos(this.mPlayingPosition);
    }

    public int m() {
        app appVar = this.b;
        if (appVar == null || appVar.e() == null) {
            return -1;
        }
        return this.b.e().getType() == 2 ? 1 : 2;
    }

    @Override // defpackage.aek
    public void e() {
        pause();
    }

    @Override // defpackage.aek
    public void f() {
        play();
    }

    @Override // defpackage.aek
    public boolean g() {
        Log.i("NetRadioModel", "mNetAutoReplay, needRebootPlay = " + this.d + ags.a().i());
        return ags.a().i();
    }

    @Override // defpackage.aek
    public void h() {
        a(d(), getPosition(), true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNetValid(agg.p pVar) {
        if (o()) {
            a(false);
            replay(false);
        }
    }

    private boolean o() {
        return !ags.a().e() && this.d && com.xiaopeng.musicradio.model.car.a.a().f();
    }

    private void a(boolean z) {
        Log.i("NetRadioModel", "setNetAutoReplay: " + z);
        this.d = z;
        if (this.d) {
            savePlayState(2);
        }
    }
}
