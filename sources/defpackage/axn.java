package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.db.XpCacheInfo;
import com.xiaopeng.musicradio.bean.player.PlayerSelector;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.reading.HeadSpeechHistoryRecord;
import com.xiaopeng.musicradio.bean.reading.OneKeyReadingHistoryRecord;
import com.xiaopeng.musicradio.bean.xpbean.PlayInfoBean;
import com.xiaopeng.musicradio.bean.xpbean.PlayTrackInfoBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.common.b;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.player.h;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.af;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.ar;
import com.xiaopeng.musicradio.utils.at;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.age;
import defpackage.agg;
import defpackage.agh;
import defpackage.ago;
import defpackage.agq;
import defpackage.ags;
import defpackage.ahq;
import defpackage.ave;
import defpackage.axm;
import defpackage.bck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ProgramModel.java */
/* renamed from: axn  reason: default package */
/* loaded from: classes2.dex */
public class axn implements aek {
    private int d;
    private int e;
    private String h;
    private boolean n;
    private LruCache<String, List<RdAlbumBean>> p;
    private ael q;
    private Call<PlayInfoBean> u;
    private int v;
    private ahp<ProgramBean> y;
    private List<ProgramBean> a = new ArrayList();
    private List<Integer> b = new ArrayList();
    private volatile int c = -1;
    private int f = -1;
    private boolean g = false;
    private boolean i = true;
    private boolean j = true;
    private int l = 0;
    private boolean m = false;
    private int o = 0;
    private int r = 812;
    private long s = 0;
    private h.a t = new h.a() { // from class: axn.1
        @Override // com.xiaopeng.musicradio.player.h.a
        public void b(boolean z) {
        }

        @Override // com.xiaopeng.musicradio.player.h.a
        public void onDownloaded(String str, long j) {
        }

        @Override // com.xiaopeng.musicradio.player.h.a
        public void playState(int i) {
            LogUtils.i("ProgramModel", "playState: " + i);
            if (i == 5) {
                axn.this.H();
                ar.a(axn.this.r());
                return;
            }
            axn.this.b(i);
        }

        @Override // com.xiaopeng.musicradio.player.h.a
        public void a(int i, String str) {
            LogUtils.i("ProgramModel", "onPlayError：" + i + ", url:" + str);
            if (!axn.this.q.a(i, str) && i <= 10) {
                if (i == 0) {
                    axn.this.pause();
                    axn.this.a(true);
                    axn.this.b(bj.a());
                    return;
                }
                axn.this.b(com.xiaopeng.musicradio.a.a.getString(f.h.tip_music_play_error_stop));
                axn.this.pause();
            }
        }

        @Override // com.xiaopeng.musicradio.player.h.a
        public void onPlayPosition(int i, int i2) {
            axn.this.e = i;
            int i3 = i % 30;
            if (i != 0 && i3 >= 0 && i3 <= 5 && System.currentTimeMillis() - axn.this.s > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                ban.g(new Runnable() { // from class: axn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        axn.this.s = System.currentTimeMillis();
                        axn.this.q();
                    }
                });
            }
            u.c(new age.m(3, i, i2));
        }

        @Override // com.xiaopeng.musicradio.player.h.a
        public void onTimeLineChange() {
            u.c(new age.t(3));
        }

        @Override // com.xiaopeng.musicradio.player.h.a
        public void onSetData(Bundle bundle) {
            ave.a a2 = new ave().a(bundle);
            if (a2 instanceof avf) {
                a2.b();
            }
        }
    };
    private ags.a w = new ags.a() { // from class: axn.15
        @Override // defpackage.ags.a
        public void focusPause() {
            if (axn.this.f == 2 || axn.this.f == 1) {
                axn.this.pause();
            }
        }

        @Override // defpackage.ags.a
        public void lowerVolume() {
            ags.a().a(new ags.c() { // from class: axn.15.1
                @Override // defpackage.ags.c
                public void updateSoundVolume(float f) {
                    axn.this.setVolume(f);
                }
            });
        }

        @Override // defpackage.ags.a
        public void riseVolume() {
            ags.a().b(new ags.c() { // from class: axn.15.2
                @Override // defpackage.ags.c
                public void updateSoundVolume(float f) {
                    axn.this.setVolume(f);
                }
            });
        }

        @Override // defpackage.ags.a
        public void focusPlay() {
            if (!axn.this.i) {
                if (!axn.this.m) {
                    axn.this.b(false);
                    return;
                } else {
                    axn.this.f();
                    return;
                }
            }
            axn.this.rebootPlay(false);
        }
    };
    private boolean x = true;
    private ahq.a<ProgramBean> z = new ahq.a<ProgramBean>() { // from class: axn.11
        @Override // defpackage.ahq.a
        public void a(List<ProgramBean> list) {
            bcj.a().g();
            Log.i("ProgramModel", "onList: ");
            if (!axn.this.y.v()) {
                if (!axn.this.y.i()) {
                    if (!axn.this.y.A()) {
                        if (axn.this.y.g() == 1) {
                            Log.i("ProgramModel", "onList: 4=======");
                            axn axnVar = axn.this;
                            axnVar.a(list, axnVar.y.b());
                        } else {
                            Log.i("ProgramModel", "onList: 5=======");
                            u.c(new ago.a(list));
                            axn.this.b(list);
                        }
                    } else {
                        Log.i("ProgramModel", "onList: 3=======");
                        axn.this.y.e(false);
                        axn.this.a(list, list.get(0), axn.this.y.b());
                    }
                } else {
                    Log.i("ProgramModel", "onList: 2=======");
                    ProgramBean r = axn.this.r();
                    if (r != null) {
                        for (ProgramBean programBean : list) {
                            programBean.setFromSource(r.getFromSource());
                        }
                        axn axnVar2 = axn.this;
                        axnVar2.b(list, axnVar2.y.b());
                        axn axnVar3 = axn.this;
                        axnVar3.c = axnVar3.a(r);
                        axn.this.y.f();
                    }
                    if (axn.this.y.b() != null && axn.this.y.b().contains("headspeech")) {
                        axn axnVar4 = axn.this;
                        axnVar4.a(list, axnVar4.y.b());
                    }
                }
            } else {
                Log.i("ProgramModel", "onList: 1=========");
                List d = axn.this.y.d();
                if (d != null && d.size() > axn.this.y.e() && axn.this.y.e() > -1) {
                    axn axnVar5 = axn.this;
                    axnVar5.a(axnVar5.y.d(), (ProgramBean) d.get(axn.this.y.e()), axn.this.y.b());
                }
                axn.this.y.f();
            }
            if (axn.this.y != null) {
                axn.this.y.a(false);
            }
            axn.this.l = 0;
        }

        @Override // defpackage.ahq.a
        public void a(int i, String str) {
            Log.i("ProgramModel", "onError: code = " + i + " msg = " + str);
            axn.this.b(str);
            if (axn.this.y.m()) {
                Log.i("ProgramModel", "onError: " + axn.this.y.i());
                if (!axn.this.y.i()) {
                    if (axn.this.a.isEmpty()) {
                        axn.this.F();
                        u.c(new age.g(3, i));
                        return;
                    }
                    return;
                }
                Log.i("ProgramModel", "onError: " + axn.this.l + " isNet = " + NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a));
                if (axn.this.l < 5) {
                    axn.this.G();
                    axn.r(axn.this);
                    return;
                }
                axn.this.y.a(false);
                if (axn.this.f != 2) {
                    axn.this.F();
                }
                u.c(new age.g(3, i));
            }
        }

        @Override // defpackage.ahq.a
        public void b(List<ProgramBean> list) {
            u.c(new ago.c(list));
            axn.this.a(list);
        }

        @Override // defpackage.ahq.a
        public void b(int i, String str) {
            if (axn.this.d == 4) {
                axn.this.k();
            }
            axn.this.a(axn.this.D(), 0);
        }
    };
    private PlayerSelector k = new PlayerSelector(3);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProgramModel.java */
    /* renamed from: axn$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final axn a = new axn();
    }

    @Override // defpackage.aek
    public boolean enablePlayMode() {
        return true;
    }

    @Override // defpackage.aek
    public int getStartPosition() {
        return 0;
    }

    static /* synthetic */ int r(axn axnVar) {
        int i = axnVar.l;
        axnVar.l = i + 1;
        return i;
    }

    public static axn i() {
        return a.a;
    }

    public axn() {
        this.d = 2;
        this.k.setPlayListener(this.t);
        this.d = 2;
        this.h = "";
        this.q = new ael(this);
        ban.a(new Runnable() { // from class: axn.12
            @Override // java.lang.Runnable
            public void run() {
                float e = axl.a().e();
                Log.i("ProgramModel", "speed = run: =======" + e);
                axn.this.a(e);
            }
        }, 500L);
        this.p = new LruCache<>(20);
    }

    public void a(String str, List<RdAlbumBean> list) {
        this.p.put(str, list);
    }

    public List<RdAlbumBean> a(String str) {
        return this.p.get(str);
    }

    private void d(String str) {
        ay.a("program_list_sign", str);
    }

    private void B() {
        final ArrayList arrayList = new ArrayList(this.a);
        this.v = arrayList.size();
        avt.a().a(new Runnable() { // from class: axn.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Log.i("ProgramModel", "savePlayList run: " + arrayList.size() + " currentSize = " + axn.this.v);
                    if (axn.this.v == arrayList.size()) {
                        String a2 = afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST_COUNT);
                        int i = 0;
                        if (!TextUtils.isEmpty(a2)) {
                            int parseInt = Integer.parseInt(a2);
                            Log.i("ProgramModel", "savePlayList run: ========== lastCount = " + parseInt);
                            for (int i2 = 0; i2 < parseInt; i2++) {
                                if (i2 == 0) {
                                    afk.a().b(XpCacheInfo.KEY_PROGRAM_PLAY_LIST);
                                } else {
                                    afk a3 = afk.a();
                                    a3.b(XpCacheInfo.KEY_PROGRAM_PLAY_LIST + i2);
                                }
                            }
                        }
                        String a4 = z.a(arrayList);
                        int length = a4.getBytes().length;
                        int max = (Math.max(0, length - 1) / 524288) + 1;
                        Log.i("ProgramModel", "savePlayList run: byteCount = " + length + " count = " + max);
                        if (max > 1) {
                            afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST_COUNT, String.valueOf(max));
                            int size = arrayList.size() / max;
                            while (i < max) {
                                int i3 = i + 1;
                                String a5 = z.a(arrayList.subList(size * i, Math.min(arrayList.size(), size * i3)));
                                if (i == 0) {
                                    afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST, a5);
                                } else {
                                    afk a6 = afk.a();
                                    a6.a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST + i, a5);
                                }
                                i = i3;
                            }
                            return;
                        }
                        afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST, a4);
                        afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST_COUNT, "1");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // defpackage.aek
    public void register() {
        ags.a().a(this, this.w);
        u.a(this);
    }

    @Override // defpackage.aek
    public void unregister() {
        ags.a().a(this);
        u.b(this);
    }

    public void a(final RdAlbumBean rdAlbumBean) {
        if (rdAlbumBean != null) {
            if (rdAlbumBean.getChannelId() > 0) {
                long channelId = rdAlbumBean.getChannelId();
                at.a(new axm.a().a(ad.a(channelId).toJson()).b(true).c(0).b(10).a(channelId).b(0L).a(1).b("timeDesc").a());
            } else if (rdAlbumBean.getCardId() > 0) {
                int cardId = rdAlbumBean.getCardId();
                at.a(new axm.a().a(ad.b(cardId).toJson()).b(true).c(0).b(10).e(cardId).a(1).b("timeDesc").a());
            } else {
                axm.a a2 = new axm.a().a("reading_album_" + rdAlbumBean.getId()).a(true).a(rdAlbumBean.getChannelId()).b(10).a(rdAlbumBean);
                ReadingInfo a3 = axk.a().a(rdAlbumBean.getId());
                if (a3 != null) {
                    a2.b(a3.getSort());
                }
                at.a(a2.a());
            }
        }
        ban.e(new Runnable() { // from class: axn.16
            @Override // java.lang.Runnable
            public void run() {
                afk.a().a("key_cache_albumbena", z.a(rdAlbumBean));
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadReloadAlbum(agq.p pVar) {
        q();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadStatusUpdate(agq.q qVar) {
        q();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingUnbinded(agq.s sVar) {
        q();
        ProgramBean r = r();
        if (r != null) {
            r.setAuthorized(false);
            if (r.getPaymentType() != 0) {
                stop();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingBinded(agq.r rVar) {
        ProgramBean r = r();
        Log.i("ProgramModel", "onReadingBinded: " + r);
        if (r != null) {
            axp.a().b(r.getTrackId(), r.getAlbumId(), new avc<PlayTrackInfoBean>() { // from class: axn.17
                @Override // defpackage.avc
                public void a(int i, String str) {
                }

                @Override // defpackage.avc
                public void a(PlayTrackInfoBean playTrackInfoBean) {
                    ProgramBean r2 = axn.this.r();
                    if (r2 != null) {
                        Log.i("ProgramModel", "onReadingBinded response: " + playTrackInfoBean);
                        if (playTrackInfoBean.getData() != null && playTrackInfoBean.getData().getTrackId() == r2.getTrackId() && playTrackInfoBean.getData().isTrackAuthorized()) {
                            r2.setAuthorized(true);
                            r2.setPaymentType(playTrackInfoBean.getData().getPaymentType());
                            u.c(new agq.q(playTrackInfoBean.getData().getTrackId(), playTrackInfoBean.getData().getPaymentType(), true));
                        }
                    }
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        LogUtils.i("ProgramModel", "dealNetValid: ");
        if (com.xiaopeng.musicradio.model.car.a.a().f()) {
            if (this.i && !ags.a().e()) {
                rebootPlay(false);
            } else if (K()) {
                a(false);
                b(false);
            }
            G();
        }
    }

    public List<ProgramBean> j() {
        return this.a;
    }

    public void k() {
        af.a();
        this.b.clear();
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(Integer.valueOf(i));
        }
        if (this.d == 4) {
            Collections.shuffle(this.b);
        } else {
            Collections.sort(this.b);
        }
        u.c(new age.b(3));
    }

    public List<Integer> l() {
        return this.b;
    }

    public int m() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(ProgramBean programBean) {
        af.a();
        if (programBean == null || this.a.size() == 0) {
            return -1;
        }
        for (int i = 0; i < this.b.size(); i++) {
            ProgramBean programBean2 = this.a.get(this.b.get(i).intValue());
            if (programBean2.getTrackId() == programBean.getTrackId() && programBean2.getAlbumId() == programBean.getAlbumId()) {
                return i;
            }
        }
        return -1;
    }

    private int C() {
        af.a();
        if (this.a.size() == 0) {
            return -1;
        }
        int i = this.c + 1;
        if (i >= this.b.size()) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D() {
        af.a();
        if (this.a.size() == 0) {
            return -1;
        }
        int i = this.c - 1;
        return i < 0 ? this.b.size() - 1 : i;
    }

    @Override // defpackage.aek
    public void a(int i) {
        af.a();
        this.d = i;
        if (this.c != -1) {
            k();
            this.c = a(this.a.get(this.b.get(this.c).intValue()));
        }
        ay.a("program_play_mode", i);
        u.c(new age.a(3));
    }

    @Override // defpackage.aek
    public BaseInfo d() {
        return r();
    }

    @Override // defpackage.aek
    public boolean setVolume(float f) {
        LogUtils.d("ProgramModel", "setVolume() called with: volume = [" + f + "]");
        this.k.setVolume(f, f);
        return true;
    }

    @Override // defpackage.aek
    public int c() {
        return this.d;
    }

    private void E() {
        if (aei.a().c() != 3) {
            aei.a().a(3);
        }
    }

    private void e(String str) {
        LogUtils.i("ProgramModel", "bufferList: ");
        E();
        n();
        this.h = str;
        b(1);
        u.c(new age.c(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        LogUtils.i("ProgramModel", "cancelBufferList: ");
        b(-1);
    }

    public void n() {
        LogUtils.i("ProgramModel", "resetPlayList: ");
        ar.c(r());
        this.k.reset();
        this.a.clear();
        this.o = 0;
        this.c = -1;
        this.h = "";
        k();
        u.c(new age.c(3));
    }

    @Override // defpackage.aek
    public void play() {
        LogUtils.i("ProgramModel", "play: ");
        af.a();
        ProgramBean r = r();
        Log.i("ProgramModel", "play: " + r);
        if (r != null && r.isOff() && System.currentTimeMillis() - r.getOffTime() < 3600000) {
            b(bj.b(9005006, r.getOffMsg()));
        } else if (v()) {
        } else {
            E();
            if (r() != null) {
                bck.a(r(), new bck.c() { // from class: axn.18
                    @Override // defpackage.bck.c
                    public boolean a() {
                        return axj.a().c(axn.this.r().getOriginalAlbumId() > 0 ? axn.this.r().getOriginalAlbumId() : axn.this.r().getAlbumId());
                    }
                });
                bck.a(r(), s(), getPosition(), new bck.c() { // from class: axn.19
                    @Override // defpackage.bck.c
                    public boolean a() {
                        return axj.a().c(axn.this.r().getOriginalAlbumId() > 0 ? axn.this.r().getOriginalAlbumId() : axn.this.r().getAlbumId());
                    }
                });
            }
            ags.a().b(new ags.d() { // from class: axn.20
                @Override // defpackage.ags.d
                public void updateSoundVolume(float f) {
                    axn.this.setVolume(f);
                }

                @Override // defpackage.ags.d
                public void changeState() {
                    if (axn.this.c != -1) {
                        if (axn.this.k.getPlaybackState() != 4 || !axn.this.y()) {
                            axn.this.b(true);
                        } else {
                            axn.this.a();
                        }
                    } else if (axn.this.a.size() <= 0) {
                        axn.this.L();
                    } else {
                        axn.this.a();
                    }
                }
            });
        }
    }

    @Override // defpackage.aek
    public void a() {
        LogUtils.i("ProgramModel", "next");
        af.a();
        if (v()) {
            return;
        }
        if (!y()) {
            b("暂无下一首");
            return;
        }
        ahp<ProgramBean> ahpVar = this.y;
        if (ahpVar != null) {
            ahpVar.y();
            I();
            return;
        }
        if (this.d == 4 && this.c != -1 && this.c == this.b.size() - 1) {
            k();
        }
        d(C());
    }

    @Override // defpackage.aek
    public int getSecondPosition() {
        return this.k.getSecondPosition();
    }

    public boolean o() {
        return r() != null && this.k.isCacheComplete(r().getListenUrl());
    }

    @Override // defpackage.aek
    public int getPlayState() {
        return this.f;
    }

    @Override // defpackage.aek
    public void b() {
        LogUtils.i("ProgramModel", "pre");
        af.a();
        if (v()) {
            return;
        }
        if (!z()) {
            b("暂无上一首");
        } else if (this.y != null) {
            J();
        } else {
            if (this.d == 4 && this.c != -1 && this.c == this.b.size() - 1) {
                k();
            }
            d(D());
        }
    }

    @Override // defpackage.aek
    public void pause() {
        LogUtils.i("ProgramModel", "pause: ");
        af.a();
        a(false);
        if (this.a.size() > 0) {
            final ProgramBean r = r();
            if (r != null) {
                bck.b(r, new bck.c() { // from class: axn.2
                    @Override // defpackage.bck.c
                    public boolean a() {
                        return axj.a().c(r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId());
                    }
                });
            }
            this.e = this.k.getCurrentPosition();
            b(3);
            ags.a().a(new ags.d() { // from class: axn.3
                @Override // defpackage.ags.d
                public void updateSoundVolume(float f) {
                    axn.this.setVolume(f);
                }

                @Override // defpackage.ags.d
                public void changeState() {
                    axn.this.k.pause();
                }
            });
        } else {
            b(-1);
        }
        ahp<ProgramBean> ahpVar = this.y;
        if (ahpVar != null) {
            ahpVar.a();
        }
    }

    public int p() {
        return this.e;
    }

    @Override // defpackage.aek
    public void e() {
        LogUtils.i("ProgramModel", "forcePause: ");
        af.a();
        a(false);
        if (this.a.size() > 0) {
            this.e = this.k.getCurrentPosition();
            this.k.pause();
            b(3);
        } else {
            b(-1);
        }
        ahp<ProgramBean> ahpVar = this.y;
        if (ahpVar != null) {
            ahpVar.a();
        }
    }

    @Override // defpackage.aek
    public void f() {
        long j;
        long j2;
        Log.i("ProgramModel", "replayWhenIgOn");
        if (s() != null && s().contains("headspeech")) {
            n();
            int i = 0;
            a(true);
            ahp<ProgramBean> ahpVar = this.y;
            if (ahpVar instanceof axm) {
                axm axmVar = (axm) ahpVar;
                j = axmVar.B();
                j2 = axmVar.D();
                i = axmVar.C();
                this.y.a();
                this.y = null;
            } else {
                j = 0;
                j2 = 0;
            }
            LogUtils.i("ProgramModel", "igonPlay channelId:" + j + ", relativeId:" + j2 + "cardId" + i);
            axm a2 = j > 0 ? new axm.a().a(ad.a(j).toJson()).a(j).b(j2).a(1).b(10).b(true).a() : null;
            if (i > 0) {
                a2 = new axm.a().a(ad.b(i).toJson()).e(i).a(1).b(10).b(true).a();
            }
            if (a2 != null) {
                a((ahp<ProgramBean>) a2);
            }
            this.m = true;
            return;
        }
        play();
    }

    public void q() {
        this.e = this.k.getCurrentPosition();
        ProgramBean r = r();
        if (r != null) {
            b(r);
        }
    }

    private void b(ProgramBean programBean) {
        String str;
        String str2;
        String str3;
        if (programBean == null) {
            return;
        }
        int i = this.e;
        if (programBean != null && (str3 = this.h) != null && !str3.contains("headspeech") && !this.h.startsWith("reading_album_onkey_")) {
            axh.a().a(programBean, i, x());
        } else if (programBean != null && (str2 = this.h) != null && str2.contains("headspeech")) {
            HeadSpeechHistoryRecord a2 = aq.a(programBean, this.e, this.y.h());
            String a3 = z.a(a2);
            LogUtils.i("ProgramModel", "saveHistory trackid=" + a2.getTrackId());
            afk.a().b("key_cache_headspeach_record", a3);
            ListSignBean listSignBean = (ListSignBean) z.a(this.h, (Class<Object>) ListSignBean.class);
            if (listSignBean != null) {
                if (programBean.getCardId() > 0) {
                    programBean.setCardId((int) listSignBean.collectId);
                }
                if (programBean.getChannelId() > 0) {
                    programBean.setChannelId((int) listSignBean.collectId);
                }
            }
            axh.a().a(programBean, i, x());
        } else if (programBean == null || (str = this.h) == null || !str.contains("reading_album_onkey_")) {
        } else {
            OneKeyReadingHistoryRecord oneKeyReadingHistoryRecord = new OneKeyReadingHistoryRecord();
            oneKeyReadingHistoryRecord.setTitle(programBean.getTitle());
            oneKeyReadingHistoryRecord.setAlbumId(programBean.getAlbumId());
            oneKeyReadingHistoryRecord.setOrder(x());
            oneKeyReadingHistoryRecord.setTrackId(programBean.getTrackId());
            oneKeyReadingHistoryRecord.setSeek(this.e);
            String a4 = z.a(oneKeyReadingHistoryRecord);
            LogUtils.i("ProgramModel", "saveHistory trackid=" + oneKeyReadingHistoryRecord.getTrackId());
            afk.a().b("key_cache_one_album_record", a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        LogUtils.i("ProgramModel", "replay, resumeVolume:" + z);
        int i = this.f;
        if (i == 2 || i == 1) {
            return;
        }
        if ((i == 3 || i == 5) && !this.k.isIdle()) {
            if (this.k.getPlaybackState() == 4) {
                this.k.seekTo(0);
            }
            u.c(new age.c(3));
            b(1);
            this.k.start();
            return;
        }
        a(this.c, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ahp<ProgramBean> ahpVar = this.y;
        if (ahpVar == null || !ahpVar.i()) {
            return;
        }
        this.y.k();
    }

    @Override // defpackage.aek
    public void rebootPlay(final boolean z) {
        LogUtils.i("ProgramModel", "rebootPlay: ");
        af.a();
        E();
        ban.a(new Runnable() { // from class: axn.4
            @Override // java.lang.Runnable
            public void run() {
                String a2;
                final String a3 = ay.a("program_list_sign");
                final long b = ay.b("program_play_album_id", -1L);
                int b2 = ay.b("program_play_state", -1);
                final boolean z2 = z || !(com.xiaopeng.musicradio.utils.f.b() || com.xiaopeng.musicradio.utils.f.f() || (b2 != 2 && !ags.a().j()));
                final ArrayList arrayList = new ArrayList();
                String a4 = afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST_COUNT);
                Log.i("ProgramModel", "rebootPlay run: countVal = " + a4);
                if (!TextUtils.isEmpty(a4)) {
                    int parseInt = Integer.parseInt(a4);
                    ArrayList<String> arrayList2 = new ArrayList();
                    for (int i = 0; i < parseInt; i++) {
                        if (i == 0) {
                            a2 = afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST);
                        } else {
                            afk a5 = afk.a();
                            a2 = a5.a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST + i);
                        }
                        if (!TextUtils.isEmpty(a2)) {
                            arrayList2.add(a2);
                        }
                    }
                    for (String str : arrayList2) {
                        List list = (List) z.a(str, new TypeToken<List<ProgramBean>>() { // from class: axn.4.1
                        }.getType());
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                    }
                    Log.i("ProgramModel", "run: reboot listsize = " + arrayList.size());
                } else {
                    List list2 = (List) z.a(afk.a().a(XpCacheInfo.KEY_MUSIC_PLAY_LIST), new TypeToken<List<ProgramBean>>() { // from class: axn.4.2
                    }.getType());
                    if (list2 != null) {
                        arrayList.addAll(list2);
                    }
                }
                Log.i("ProgramModel", "run: playState = " + b2 + " replay = " + z2);
                ban.g(new Runnable() { // from class: axn.4.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String json;
                        Log.i("ProgramModel", "rebootplay  run: listSign = " + a3 + " mNeedRebootPlaySpeech = " + axn.this.i);
                        String str2 = a3;
                        if (str2 != null && str2.contains("headspeech")) {
                            if (axn.this.i) {
                                HeadSpeechHistoryRecord headSpeechHistoryRecord = (HeadSpeechHistoryRecord) z.a(afk.a().a("key_cache_headspeach_record"), (Class<Object>) HeadSpeechHistoryRecord.class);
                                if (headSpeechHistoryRecord == null) {
                                    json = ad.b(axn.this.r).toJson();
                                } else if (headSpeechHistoryRecord.getChannelId() > 0) {
                                    json = ad.a(headSpeechHistoryRecord.getChannelId()).toJson();
                                } else {
                                    json = headSpeechHistoryRecord.getCardId() > 0 ? ad.b(headSpeechHistoryRecord.getCardId()).toJson() : ad.b(axn.this.r).toJson();
                                }
                                axm axmVar = new axm(new axm.a().a(json).b(true).a(1).b(10)) { // from class: axn.4.3.1
                                    @Override // defpackage.ahp
                                    public void a(boolean z3, int i2, int i3, List<ProgramBean> list3) {
                                        agh.c cVar = new agh.c();
                                        cVar.a(e());
                                        u.c(cVar);
                                        super.a(z3, i2, i3, list3);
                                    }
                                };
                                axmVar.c(!z2);
                                axmVar.d(true);
                                bcj.a().c();
                                HashMap hashMap = new HashMap();
                                hashMap.put(VuiConstants.ELEMENT_TYPE, "news");
                                hashMap.put("source", "continue");
                                bci.d(hashMap);
                                if (headSpeechHistoryRecord == null) {
                                    axmVar.c(axn.this.r);
                                } else if (headSpeechHistoryRecord.getChannelId() > 0) {
                                    axmVar.a(headSpeechHistoryRecord.getChannelId());
                                } else if (headSpeechHistoryRecord.getCardId() <= 0) {
                                    axmVar.c(axn.this.r);
                                } else {
                                    axmVar.c(headSpeechHistoryRecord.getCardId());
                                }
                                axn.this.a((ahp<ProgramBean>) axmVar);
                                axn.this.j = false;
                                axn.this.i = false;
                                return;
                            }
                            return;
                        }
                        String str3 = a3;
                        if (str3 != null && str3.startsWith("reading_album_onkey_")) {
                            OneKeyReadingHistoryRecord oneKeyReadingHistoryRecord = (OneKeyReadingHistoryRecord) z.a(afk.a().a("key_cache_one_album_record"), (Class<Object>) OneKeyReadingHistoryRecord.class);
                            RdAlbumBean rdAlbumBean = new RdAlbumBean();
                            rdAlbumBean.setId(b);
                            rdAlbumBean.setTitle(oneKeyReadingHistoryRecord.getTitle());
                            int i2 = 0;
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    i2 = -1;
                                    break;
                                } else if (((ProgramBean) arrayList.get(i2)).getTrackId() == oneKeyReadingHistoryRecord.getTrackId()) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            Log.i("ProgramModel", "TRACKS_ONEKEY run: " + i2);
                            if (i2 != -1) {
                                axm a6 = new axm.a().a(a3).b(oneKeyReadingHistoryRecord.getOrder()).a(true).b(10).a(rdAlbumBean).a(arrayList).c(i2).c(b.p).b(20).a();
                                a6.c(!z2);
                                a6.d(true);
                                bcj.a().c();
                                axn.this.a((ahp<ProgramBean>) a6);
                                axn.this.j = false;
                                axn.this.i = false;
                                return;
                            }
                            return;
                        }
                        Log.i("ProgramModel", "rebootplay run:mNeedRebootPlayRead = " + axn.this.j);
                        if (axn.this.j) {
                            if (arrayList == null) {
                                axn.this.j = false;
                                return;
                            }
                            ReadHistoryInfo a7 = axi.a().a(b);
                            long trackId = a7 != null ? a7.getTrackId() : -1L;
                            Log.i("ProgramModel", "rebootplay run:trackId = " + trackId);
                            if (trackId != -1) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayList.size()) {
                                        i3 = -1;
                                        break;
                                    }
                                    ProgramBean programBean = (ProgramBean) arrayList.get(i3);
                                    programBean.setFromSource("continue");
                                    if (programBean.getTrackId() == trackId) {
                                        break;
                                    }
                                    i3++;
                                }
                                Log.i("ProgramModel", "rebootplay run:index = " + i3);
                                if (i3 != -1) {
                                    RdAlbumBean a8 = aq.a(a7);
                                    a8.setFromSource("continue");
                                    axm a9 = new axm.a().a(a3).b(a7.getSort()).a(a8).a(arrayList).c(i3).a(true).b(true).a();
                                    a9.c(!z2);
                                    a9.d(true);
                                    bcj.a().c();
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put(VuiConstants.ELEMENT_TYPE, "reading");
                                    hashMap2.put("source", "continue");
                                    bci.d(hashMap2);
                                    axn.this.a((ahp<ProgramBean>) a9);
                                    axn.this.G();
                                }
                            }
                            axn.this.j = false;
                            axn.this.i = false;
                        }
                    }
                });
            }
        });
    }

    public void b(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        if (i == -1 && this.a.size() > 0) {
            this.f = 3;
        }
        LogUtils.i("ProgramModel", "dealPlayState: " + this.f);
        u.f(new age.l(3, this.f));
        ProgramBean r = r();
        if (r == null) {
            return;
        }
        if (r != null && r.getDuration() <= 0) {
            r.setDuration(getDuration());
        }
        switch (i) {
            case 1:
                e(2);
                if (r != null) {
                    ay.a("program_play_album_id", r.getAlbumId());
                    b(r);
                    break;
                }
                break;
            case 2:
                this.e = this.k.getCurrentPosition();
                e(2);
                if (r != null) {
                    ay.a("program_play_album_id", r.getAlbumId());
                    b(r);
                    break;
                }
                break;
            case 3:
                e(3);
                break;
        }
        int i2 = this.f;
        if (i2 == 3) {
            c(r);
            ar.c(r);
        } else if (i2 == 2) {
            ar.b(r);
        } else if (i2 == 1) {
            ar.c(r);
        }
    }

    private void c(ProgramBean programBean) {
        HashMap hashMap = new HashMap();
        String fromSource = programBean.getFromSource();
        if (TextUtils.isEmpty(fromSource)) {
            fromSource = "near";
        }
        hashMap.put("source", fromSource);
        hashMap.put("album", programBean.getAlbumName());
        hashMap.put("albumid", Long.valueOf(programBean.getAlbumId()));
        hashMap.put("albumclass", programBean.getCategoryName());
        hashMap.put("program", programBean.getTitle());
        hashMap.put("programtime", Integer.valueOf(programBean.getDuration()));
        hashMap.put("playtime", Integer.valueOf(this.e));
        hashMap.put(VuiConstants.ELEMENT_TYPE, this.k.getCurrentPosition() >= programBean.getDuration() ? "complete" : "incomplete");
        bci.g(hashMap);
    }

    private void a(int i, final int i2, final boolean z) {
        LogUtils.i("ProgramModel", "prepare：" + i + " position=" + i2);
        ar.c(r());
        if (i == -1) {
            return;
        }
        Log.i("ProgramModel", "prepare: " + this.a.get(this.b.get(i).intValue()));
        this.m = false;
        this.c = i;
        b(1);
        u.c(new age.c(3));
        this.k.reset();
        final ProgramBean r = r();
        Call<PlayInfoBean> call = this.u;
        if (call != null && call.isExecuted()) {
            this.u.cancel();
        }
        if (r != null) {
            r.b();
            Bundle a2 = ave.a(r.getTrackId() + "", r.getTitle(), r.getAlbumName(), 3, 0, 0);
            if (!this.n) {
                this.n = true;
                a(axl.a().e());
            }
            this.k.setData(a2);
            if (r() != null) {
                bck.a(r(), new bck.c() { // from class: axn.5
                    @Override // defpackage.bck.c
                    public boolean a() {
                        return axj.a().c(axn.this.r().getOriginalAlbumId() > 0 ? axn.this.r().getOriginalAlbumId() : axn.this.r().getAlbumId());
                    }
                });
                bck.a(r(), s(), i2, new bck.c() { // from class: axn.6
                    @Override // defpackage.bck.c
                    public boolean a() {
                        return axj.a().c(axn.this.r().getOriginalAlbumId() > 0 ? axn.this.r().getOriginalAlbumId() : axn.this.r().getAlbumId());
                    }
                });
            }
            if (TextUtils.isEmpty(r.getListenUrl()) || "null".equalsIgnoreCase(r.getListenUrl())) {
                if (!aqh.a().e() && (r.getPaymentType() == 1 || r.getPaymentType() == 2)) {
                    if (r.getPaymentType() == 1) {
                        axh.a().a(com.xiaopeng.musicradio.a.a.getString(b.f.play_vip_no_login_hint), r.getPaymentType());
                    } else if (r.getPaymentType() == 2) {
                        axh.a().a(com.xiaopeng.musicradio.a.a.getString(b.f.play_payment_no_login_hint), r.getPaymentType());
                    }
                    ban.b(new Runnable() { // from class: axn.7
                        @Override // java.lang.Runnable
                        public void run() {
                            axn.this.pause();
                        }
                    }, 500L);
                    return;
                }
                final ProgramBean r2 = r();
                this.u = axp.a().a(r.getTrackId(), r.getAlbumId(), new avc<PlayInfoBean>() { // from class: axn.8
                    @Override // defpackage.avc
                    public void a(PlayInfoBean playInfoBean) {
                        ProgramBean r3 = axn.this.r();
                        if (r3 != null && r3.getAlbumId() == r2.getAlbumId() && r3.getTrackId() == r2.getTrackId() && aei.a().c() == 3) {
                            r3.setOff(false);
                            if (playInfoBean.getData() != null && !TextUtils.isEmpty(playInfoBean.getData().getUrl())) {
                                LogUtils.i("ProgramModel", "getPlayingInfo albumPaymentType:" + r.getAlbumPaymentType() + ", authorize:" + r.isAuthorized() + ", albumAuthorize:" + r.isAlbumAuthorized() + ", updated playinginfo albumAuthorized:" + playInfoBean.getData().isAlbumAuthorized() + ", track Authorized:" + playInfoBean.getData().isTrackAuthorized());
                                axn.this.k.prepareData(playInfoBean.getData().getUrl(), true, true, z);
                                axn.this.k.seekTo(i2);
                                if (axn.this.x) {
                                    axn.this.x = false;
                                    float e = axl.a().e();
                                    if (e > 0.0f) {
                                        axn.this.a(e);
                                    }
                                }
                                if (r.getAlbumPaymentType() == 2 && !r.isAuthorized() && playInfoBean.getData().isTrackAuthorized()) {
                                    r.setAuthorized(true);
                                    LogUtils.i("ProgramModel", "update authorized to true for trackId:" + r.getTrackId());
                                    u.c(new agq.q(r.getTrackId(), r.getAlbumPaymentType(), true));
                                }
                                if (r.getPaymentType() == 2 && !r.isAlbumAuthorized() && playInfoBean.getData().isAlbumAuthorized() && playInfoBean.getData().isAlbumAuthorized()) {
                                    u.c(new agq.p(r.getAlbumId()));
                                    return;
                                }
                                return;
                            }
                            if (r.getPaymentType() == 1) {
                                axn.this.c(b.f.vip_hint);
                            } else if (r.getPaymentType() == 2) {
                                axn.this.c(b.f.payment_hint);
                                r.setAuthorized(false);
                                LogUtils.i("ProgramModel", "update authorized to false for trackId:" + r.getTrackId());
                                u.c(new agq.q(r.getTrackId(), r.getAlbumPaymentType(), false));
                            }
                            axn.this.pause();
                        }
                    }

                    @Override // defpackage.avc
                    public void a(int i3, String str) {
                        axn.this.pause();
                        if (i3 == 9000001) {
                            if (r.getPaymentType() == 1) {
                                axh.a().a(com.xiaopeng.musicradio.a.a.getString(b.f.play_vip_no_login_hint), r.getPaymentType());
                            } else if (r.getPaymentType() == 2) {
                                axh.a().a(com.xiaopeng.musicradio.a.a.getString(b.f.play_payment_no_login_hint), r.getPaymentType());
                            } else {
                                axn.this.b(bj.b(i3, str));
                            }
                            r.setOff(false);
                            return;
                        }
                        if (i3 == 9005006) {
                            r.setOff(true);
                            r.setOffTime(System.currentTimeMillis());
                            r.setOffMsg(str);
                        } else {
                            r.setOff(false);
                        }
                        axn.this.b(bj.b(i3, str));
                    }
                });
            } else {
                this.u = axp.a().a(r.getTrackId(), r.getAlbumId(), new avc<PlayInfoBean>() { // from class: axn.9
                    @Override // defpackage.avc
                    public void a(PlayInfoBean playInfoBean) {
                        r.setOff(false);
                    }

                    @Override // defpackage.avc
                    public void a(int i3, String str) {
                        if (i3 == 9005006) {
                            axn.this.pause();
                            axn.this.b(bj.b(i3, str));
                            r.setOff(true);
                            r.setOffTime(System.currentTimeMillis());
                            r.setOffMsg(str);
                            return;
                        }
                        r.setOff(false);
                    }
                });
                this.k.prepareData(this.a.get(this.b.get(i).intValue()).getListenUrl(), true, true, z);
                this.k.seekTo(i2);
            }
            ban.a(new Runnable() { // from class: axn.10
                @Override // java.lang.Runnable
                public void run() {
                    afk.a().a("key_cache_albumbena", z.a(aq.b(r)));
                    u.c(new age.q());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        a(i, i2, true);
    }

    private void d(int i) {
        a(i, 0);
    }

    public ProgramBean r() {
        if (this.c != -1 && this.c < this.b.size() && this.b.get(this.c).intValue() < this.a.size()) {
            return this.a.get(this.b.get(this.c).intValue());
        }
        return null;
    }

    @Override // defpackage.aek
    public void seekTo(int i) {
        this.k.seekTo(i);
    }

    @Override // defpackage.aek
    public int getPosition() {
        return this.k.getCurrentPosition();
    }

    @Override // defpackage.aek
    public int getDuration() {
        af.a();
        if (this.c == -1) {
            return 0;
        }
        int duration = this.a.get(this.b.get(this.c).intValue()).getDuration();
        return duration == 0 ? this.k.getDuration() : duration;
    }

    public String s() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (getPlayState() == 3) {
            return;
        }
        if (this.d == 3) {
            d(this.c);
        } else if (t() && !y()) {
            b(5);
        } else {
            a();
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

    public void a(ahp<ProgramBean> ahpVar) {
        af.a();
        if (v()) {
            return;
        }
        if (a((ahq<ProgramBean>) ahpVar) && this.a.size() > 0 && this.c != -1) {
            play();
            return;
        }
        bcj.a().e();
        ahp<ProgramBean> ahpVar2 = this.y;
        if (ahpVar2 != null) {
            ahpVar2.a();
        }
        this.y = ahpVar;
        this.y.a(this.z);
        if (this.y.c()) {
            bcj.a().g();
            if (!this.y.w() && this.y.x()) {
                bci.a();
            }
            this.y.d(false);
            a(this.y.d(), this.y.d().get(this.y.e()), this.y.b());
            this.y.f();
        } else {
            e(this.y.b());
            this.y.k();
            this.j = false;
        }
        u.c(new age.f(3, this.y.u()));
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(this.h) || !this.h.equals(str)) {
            return false;
        }
        int i = this.f;
        return i == 1 || i == 2;
    }

    public void a(List<ProgramBean> list) {
        LogUtils.i("ProgramModel", "playPrePage");
        af.a();
        this.c += list.size() - 1;
        this.a.addAll(0, list);
        this.o++;
        if (this.d == 4) {
            a(list, false);
        } else {
            k();
        }
        LogUtils.d("ProgramModel", "mPlayList.size=" + this.a.size() + "mIndexes.size=" + this.b.size());
        LogUtils.d("ProgramModel", "mPlayingIndex = " + this.c + " playListCount=" + this.o);
        b();
        B();
    }

    public void b(List<ProgramBean> list) {
        LogUtils.i("ProgramModel", "playNextPage");
        af.a();
        this.a.addAll(list);
        this.o++;
        if (this.d == 4) {
            a(list, true);
        } else {
            k();
        }
        LogUtils.d("ProgramModel", "mPlayList.size=" + this.a.size() + "mIndexes.size=" + this.b.size());
        LogUtils.d("ProgramModel", "mPlayingIndex = " + this.c + " playListCount=" + this.o);
        a();
        B();
    }

    private void a(List<ProgramBean> list, boolean z) {
        af.a();
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.b.size();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Integer.valueOf(size + i));
        }
        Collections.shuffle(arrayList);
        if (z) {
            this.b.addAll(arrayList);
        } else {
            this.b.addAll(0, arrayList);
        }
        u.c(new age.b(3));
    }

    private void I() {
        LogUtils.i("ProgramModel", "nextWithSrc");
        af.a();
        if (t() && this.y != null) {
            LogUtils.i("ProgramModel", "nextPage");
            if (this.y.s()) {
                this.y.y();
                return;
            }
            LogUtils.i("ProgramModel", "nextPage no more data");
            pause();
            return;
        }
        a(C(), 0);
    }

    public boolean t() {
        af.a();
        return this.c != -1 && this.c == this.b.size() - 1;
    }

    private void J() {
        LogUtils.i("ProgramModel", "preWithSrc");
        af.a();
        if (u() && this.y != null) {
            LogUtils.i("ProgramModel", "prePage");
            if (this.y.q()) {
                return;
            }
            LogUtils.i("ProgramModel", "nextPage no more data");
            if (this.d == 4) {
                k();
            }
        }
        a(D(), 0);
    }

    public boolean u() {
        af.a();
        return this.c != -1 && this.c == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<ProgramBean> list, String str) {
        LogUtils.i("ProgramModel", "play: " + str);
        af.a();
        this.m = false;
        this.j = false;
        this.i = false;
        E();
        b(list, str);
        if (v()) {
            return;
        }
        a(C(), 0, !this.y.w());
        this.y.c(false);
        d(str);
        if (TextUtils.equals(str, "headspeech")) {
            return;
        }
        B();
    }

    private boolean c(List<ProgramBean> list) {
        if (list == null || this.a == null || list.size() != this.a.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i) != list.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<ProgramBean> list, String str) {
        boolean c = c(list);
        this.a.clear();
        this.a.addAll(list);
        this.c = -1;
        this.o = 0;
        this.h = str;
        if (!c) {
            k();
        }
        u.c(new age.d(3, str));
        u.c(new age.e(3, str));
        u.c(new age.c(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<ProgramBean> list, ProgramBean programBean, String str) {
        int seek;
        int i;
        LogUtils.i("ProgramModel", "play: " + str + " programBean=" + programBean + " listSzie = " + list.size());
        af.a();
        this.j = false;
        this.i = false;
        E();
        b(list, str);
        if (this.y.v()) {
            if (TextUtils.equals(s(), "headspeech")) {
                HeadSpeechHistoryRecord headSpeechHistoryRecord = (HeadSpeechHistoryRecord) z.a(afk.a().a("key_cache_headspeach_record"), (Class<Object>) HeadSpeechHistoryRecord.class);
                if (headSpeechHistoryRecord != null && headSpeechHistoryRecord.getTrackId() == programBean.getTrackId() && headSpeechHistoryRecord.getAlbumId() == programBean.getAlbumId()) {
                    i = (int) headSpeechHistoryRecord.getSeek();
                    programBean.setChannelId(headSpeechHistoryRecord.getChannelId());
                    LogUtils.i("ProgramModel", "HEADSPEECH SEECK=" + i);
                } else {
                    i = 0;
                }
                seek = i;
            } else if (s().startsWith("reading_album_onkey_")) {
                OneKeyReadingHistoryRecord oneKeyReadingHistoryRecord = (OneKeyReadingHistoryRecord) z.a(afk.a().a("key_cache_one_album_record"), (Class<Object>) OneKeyReadingHistoryRecord.class);
                seek = (oneKeyReadingHistoryRecord != null && oneKeyReadingHistoryRecord.getTrackId() == programBean.getTrackId() && oneKeyReadingHistoryRecord.getAlbumId() == programBean.getAlbumId()) ? (int) oneKeyReadingHistoryRecord.getSeek() : 0;
            } else {
                ReadHistoryInfo a2 = axi.a().a(programBean.getAlbumId());
                seek = a2 != null ? (int) a2.getSeek() : 0;
            }
            a(a(programBean), seek, !this.y.w());
            this.y.b(false);
            this.y.c(false);
        } else {
            a(a(programBean), 0, !this.y.w());
            this.y.c(false);
        }
        d(str);
        if (TextUtils.equals(str, "headspeech")) {
            return;
        }
        B();
    }

    public boolean v() {
        if (ags.a().g()) {
            c(f.h.tips_can_not_play_reading);
            return true;
        }
        return false;
    }

    public ahq<ProgramBean> w() {
        return this.y;
    }

    public boolean a(ahq<ProgramBean> ahqVar) {
        return (((ahp) ahqVar).A() || this.y == null || !ahqVar.b().equals(this.y.b()) || ahqVar.c()) ? false : true;
    }

    public void a(boolean z) {
        this.g = z;
        if (z) {
            e(2);
        }
    }

    private boolean K() {
        return !ags.a().e() && this.g;
    }

    private void e(int i) {
        ay.a("program_play_state", i);
    }

    public void b(ahp<ProgramBean> ahpVar) {
        af.a();
        ahp<ProgramBean> ahpVar2 = this.y;
        if (ahpVar2 != null) {
            ahpVar2.a();
        }
        ProgramBean r = r();
        this.y = ahpVar;
        b(ahpVar.d(), ahpVar.b());
        if (r != null) {
            this.c = a(r);
            u.c(new age.f(3, ahpVar.u()));
            this.y.f();
            this.y.a(this.z);
            q();
            B();
        }
    }

    @ReadingInfo.SORT
    public String x() {
        ahp<ProgramBean> ahpVar = this.y;
        return ahpVar != null ? ahpVar.u() : "timeAsc";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        LogUtils.i("ProgramModel", "playFromLocalList: ");
        af.a();
        E();
        ban.a(new Runnable() { // from class: axn.13
            @Override // java.lang.Runnable
            public void run() {
                final String a2 = ay.a("program_list_sign");
                final long b = ay.b("program_play_album_id", -1L);
                final List list = (List) z.a(afk.a().a(XpCacheInfo.KEY_PROGRAM_PLAY_LIST), new TypeToken<List<ProgramBean>>() { // from class: axn.13.1
                }.getType());
                ban.g(new Runnable() { // from class: axn.13.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TextUtils.equals(a2, "headspeech")) {
                            axn.this.a((ahp<ProgramBean>) new axm.a().a("headspeech").a(true).b(10).a());
                        } else if (list == null) {
                            u.c(new age.c(3));
                        } else {
                            ReadHistoryInfo a3 = axi.a().a(b);
                            long trackId = a3 != null ? a3.getTrackId() : -1L;
                            if (trackId != -1) {
                                int i = 0;
                                while (true) {
                                    if (i >= list.size()) {
                                        i = -1;
                                        break;
                                    } else if (((ProgramBean) list.get(i)).getTrackId() == trackId) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                if (i != -1) {
                                    RdAlbumBean rdAlbumBean = new RdAlbumBean();
                                    rdAlbumBean.setId(b);
                                    rdAlbumBean.setTitle(a3 != null ? a3.getAlbumName() : "");
                                    axn.this.a((ahp<ProgramBean>) new axm.a().a(a2).b(a3.getSort()).a(rdAlbumBean).a(list).c(i).a(true).b(true).a());
                                    axn.this.G();
                                    return;
                                }
                            }
                            LogUtils.i("ProgramModel", "not find history, and play nothing!");
                            u.c(new age.c(3));
                        }
                    }
                });
            }
        });
    }

    public void a(float f) {
        axl.a().a(f);
        this.k.setPlaySpeed(f);
        u.c(new age.n(f));
    }

    public boolean y() {
        if (this.a.size() <= 0) {
            return false;
        }
        int C = C();
        LogUtils.i("ProgramModel", "findNextIndex index:" + C + ", mPlayingIndex:" + this.c);
        if (C <= this.c) {
            ahp<ProgramBean> ahpVar = this.y;
            if (ahpVar != null) {
                return ahpVar.o() || this.y.h() == -1;
            }
            return false;
        }
        return true;
    }

    public boolean z() {
        if (this.a.size() <= 0) {
            return false;
        }
        if (D() >= this.c) {
            ahp<ProgramBean> ahpVar = this.y;
            if (ahpVar != null) {
                return ahpVar.p();
            }
            return false;
        }
        return true;
    }

    public void A() {
        ProgramBean r = r();
        if (r != null) {
            r.setListenUrl("");
            pause();
            play();
        }
    }

    @Override // defpackage.aek
    public void h() {
        A();
    }

    @Override // defpackage.aek
    public boolean g() {
        Log.i("ProgramModel", "mNetAutoRePlay, needRebootPlay = " + this.g + ags.a().i());
        return ags.a().i();
    }

    @Override // defpackage.aek
    public void stop() {
        this.k.stop();
    }
}
