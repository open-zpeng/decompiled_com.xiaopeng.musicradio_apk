package com.xiaopeng.musicradio.model.bluetooth;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.xiaopeng.lib.framework.moduleinterface.configurationmodule.ConfigurationChangeEvent;
import com.xiaopeng.lib.framework.moduleinterface.configurationmodule.IConfigurationData;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.utils.ai;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import defpackage.ags;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: BluetoothMusicModel.java */
/* loaded from: classes.dex */
public class a implements aek, h, i, j {
    public static String a;
    public static String b;
    private c c;
    private BluetoothService d;
    private long e;
    private Disposable i;
    private Disposable j;
    private Disposable k;
    private Disposable o;
    private ValueAnimator r;
    private final BtMusicBean f = new BtMusicBean();
    private long g = Long.MAX_VALUE;
    private boolean h = true;
    private Map<String, String> l = new ConcurrentHashMap();
    private int m = 0;
    private int n = 0;
    private ags.a p = new ags.a() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.3
        @Override // defpackage.ags.a
        public void focusPause() {
            LogUtils.i("BluetoothMusicModel", "focus_Pause: " + a.this.o());
            if (a.this.o()) {
                a.this.pause();
            }
            if ("com.xiaopeng.carcontrol".equalsIgnoreCase(amw.a().b())) {
                return;
            }
            a.this.H();
        }

        @Override // defpackage.ags.a
        public void lowerVolume() {
            a.this.G();
            ags.a().a(new ags.c() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.3.1
                @Override // defpackage.ags.c
                public void updateSoundVolume(float f) {
                    LogUtils.i("BluetoothMusicModel", "lowerVolume: " + f);
                    a.this.setVolume(f);
                }
            });
        }

        @Override // defpackage.ags.a
        public void riseVolume() {
            a.this.G();
            ags.a().b(new ags.c() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.3.2
                @Override // defpackage.ags.c
                public void updateSoundVolume(float f) {
                    LogUtils.i("BluetoothMusicModel", "riseVolume: " + f);
                    a.this.setVolume(f);
                }
            });
        }

        @Override // defpackage.ags.a
        public void focusPlay() {
            Log.d("BluetoothMusicModel", "focus_Play: " + a.this.o());
            if (a.this.o()) {
                a.this.c(false);
            }
            a.this.F();
        }
    };
    private int q = 0;
    private float s = 0.0f;

    @Override // defpackage.aek
    public void a(int i) {
    }

    @Override // defpackage.aek
    public int c() {
        return 0;
    }

    @Override // defpackage.aek
    public boolean enablePlayMode() {
        return false;
    }

    @Override // defpackage.aek
    public boolean g() {
        return false;
    }

    @Override // defpackage.aek
    public int getStartPosition() {
        return 0;
    }

    @Override // defpackage.aek
    public void h() {
    }

    @Override // defpackage.aek
    public void seekTo(int i) {
    }

    static /* synthetic */ int g(a aVar) {
        int i = aVar.n;
        aVar.n = i + 1;
        return i;
    }

    static /* synthetic */ int i(a aVar) {
        int i = aVar.m;
        aVar.m = i + 1;
        return i;
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BluetoothMusicModel.java */
    /* renamed from: com.xiaopeng.musicradio.model.bluetooth.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0135a {
        private static final a a = new a();
    }

    protected a() {
        a = com.xiaopeng.musicradio.a.a.getString(f.h.music_unknow_song);
        b = com.xiaopeng.musicradio.a.a.getString(f.h.music_unknow_singer);
        this.f.setSong(a);
        this.f.setSinger(b);
        this.f.setLrcContent("");
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.w();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.d = (BluetoothService) sp.a().a("/XPMusic/service/bluetooth/nfore").navigation();
        BluetoothService bluetoothService = this.d;
        if (bluetoothService == null) {
            return;
        }
        bluetoothService.a((h) this);
        this.d.a((i) this);
        this.d.a((j) this);
        this.d.a();
    }

    public static a i() {
        return C0135a.a;
    }

    public Map<String, String> j() {
        return this.l;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.h
    public void a(boolean z) {
        if (y()) {
            if (z) {
                C();
            } else {
                m();
            }
        }
        if (z) {
            r.c();
        }
        u.c(new agd.f(z));
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.i
    public void a(int i, boolean z) {
        if (i != 2) {
            if (i == 0) {
                u.c(new agd.c(z));
                return;
            }
            return;
        }
        if (z) {
            K();
            J();
            F();
            LogUtils.i("BluetoothMusicModel", "onConnectStateChanged connected!");
            if (!y()) {
                if (aei.a().c() == -1) {
                    x();
                }
            } else {
                x();
                BluetoothService bluetoothService = this.d;
                if (bluetoothService != null) {
                    bluetoothService.h();
                }
            }
        } else {
            if (y()) {
                s();
                LogUtils.i("BluetoothMusicModel", "bluetooth disconnected, but not reset to previous audio type :" + aei.a().c());
            }
            I();
        }
        u.c(new agd.b(z));
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.j
    public void a(e eVar) {
        Log.i("BluetoothMusicModel", "onMetaDataChanged() called with: metaData = [" + eVar + "]");
        E();
        String a2 = eVar.a();
        String b2 = eVar.b();
        if (!TextUtils.isEmpty(a2)) {
            this.f.setSong(a2);
        } else {
            this.f.setSong(a);
        }
        if (!TextUtils.isEmpty(b2)) {
            this.f.setSinger(b2);
        } else {
            this.f.setSinger(b);
        }
        this.f.setDuration((int) TimeUnit.MILLISECONDS.toSeconds(eVar.d()));
        this.f.setLrcContent("");
        this.f.refreshUuid();
        if (y()) {
            s();
            a(getPosition());
            u.c(new agd.h());
        }
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.j
    public void a(long j) {
        this.e = j;
        if (y()) {
            u.c(new age.m(2, getPosition(), getDuration()));
        }
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.j
    public void b(int i) {
        aej c;
        if (y()) {
            c(i);
            z();
            if (i == 2 && !q() && o() && ((c = aeh.a().c()) == null || (c != null && c.f()))) {
                LogUtils.d("BluetoothMusicModel", "unmute focus:" + amw.a().b());
                if (com.xiaopeng.musicradio.a.a.getPackageName().equalsIgnoreCase(amw.a().b())) {
                    m();
                }
            }
        } else if (bf.e() && i == 2) {
            r();
        }
        if (i == 2) {
            u.c(new agd.h());
        } else {
            C();
        }
    }

    @Override // defpackage.aek
    public int getPosition() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(this.e);
    }

    @Override // defpackage.aek
    public int getDuration() {
        return this.f.getDuration();
    }

    @Override // defpackage.aek
    public void play() {
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (aei.a().c() == 2 && !n()) {
            bcp.a();
            LogUtils.i("BluetoothMusicModel", "play->openSettingBlueDialog");
        } else if (B()) {
            LogUtils.i("BluetoothMusicModel", "play->isNotPlayable");
            u.c(new age.j());
        } else {
            r();
            BluetoothService bluetoothService = this.d;
            if (bluetoothService == null) {
                return;
            }
            bluetoothService.a("bt_pause");
            this.d.d();
            this.d.h();
        }
    }

    @Override // defpackage.aek
    public void pause() {
        Log.i("BluetoothMusicModel", "pause invoke...");
        if (p() && aei.a().c() == 2 && !n()) {
            bcp.a();
            return;
        }
        BluetoothService bluetoothService = this.d;
        if (bluetoothService == null) {
            return;
        }
        bluetoothService.a("bt_play");
        this.d.e();
        this.d.i();
    }

    @Override // defpackage.aek
    public void a() {
        BluetoothService bluetoothService;
        if (aei.a().c() == 2 && !n()) {
            bcp.a();
        } else if (B() || (bluetoothService = this.d) == null) {
        } else {
            bluetoothService.f();
        }
    }

    @Override // defpackage.aek
    public void b() {
        BluetoothService bluetoothService;
        if (!n()) {
            bcp.a();
        } else if (B() || (bluetoothService = this.d) == null) {
        } else {
            bluetoothService.g();
        }
    }

    @Override // defpackage.aek
    public int getSecondPosition() {
        return this.f.getDuration();
    }

    @Override // defpackage.aek
    public int getPlayState() {
        BluetoothService bluetoothService = this.d;
        if (bluetoothService == null) {
            return -1;
        }
        return bluetoothService.i();
    }

    @Override // defpackage.aek
    /* renamed from: k */
    public BtMusicBean d() {
        return this.f;
    }

    @Override // defpackage.aek
    public boolean setVolume(float f) {
        if (d(false)) {
            return false;
        }
        a(f);
        return true;
    }

    public void l() {
        Log.e("BluetoothMusicModel", "mu_te", new Throwable("mute"));
        d(1);
    }

    public void m() {
        Log.e("BluetoothMusicModel", "unmu_te: ", new Throwable("unmute"));
        d(0);
    }

    public boolean n() {
        BluetoothService bluetoothService = this.d;
        if (bluetoothService != null) {
            return bluetoothService.b() || this.d.c();
        }
        Log.i("BluetoothMusicModel", "isBtMusicConnect: mService is null");
        return false;
    }

    public boolean o() {
        BluetoothService bluetoothService = this.d;
        if (bluetoothService != null) {
            return bluetoothService.b();
        }
        return false;
    }

    public boolean p() {
        return getPlayState() == 2;
    }

    public boolean b(boolean z) {
        BluetoothService bluetoothService = this.d;
        if (bluetoothService == null) {
            return false;
        }
        boolean a2 = bluetoothService.a(z);
        if (a2) {
            Log.i("BluetoothMusicModel", "isInCall: " + a2);
        }
        return a2;
    }

    public boolean q() {
        return b(false);
    }

    @Override // defpackage.aek
    public void rebootPlay(boolean z) {
        aei.a().b(2);
        s();
        boolean z2 = (com.xiaopeng.musicradio.utils.f.b() || com.xiaopeng.musicradio.utils.f.f() || (A() != 2 && !ags.a().j())) ? false : true;
        if (!n() || !z2) {
            if (z2) {
                Log.i("BluetoothMusicModel", "rebootPlay() called: will delay execute");
                this.g = SystemClock.elapsedRealtime();
                return;
            }
            return;
        }
        Log.i("BluetoothMusicModel", "rebootPlay() called");
        if (MediaCenterModel.getInstance().getBtStatus() == 3) {
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtils.i("BluetoothMusicModel", "delay call rebootPlay() for 1 second as xui required");
                    a.this.play();
                }
            }, 1000L);
        } else {
            play();
        }
    }

    private void x() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        LogUtils.i("BluetoothMusicModel", "rebootPlayIfNeed:" + elapsedRealtime);
        if (elapsedRealtime > 0 && elapsedRealtime <= TimeUnit.MINUTES.toMillis(2L) && !com.xiaopeng.musicradio.utils.f.c() && (ags.a().m() > 0 || ags.a().m() == -3)) {
            play();
        }
        this.g = Long.MAX_VALUE;
    }

    public void r() {
        LogUtils.i("BluetoothMusicModel", "changeToBluetooth", new Throwable());
        if (!y()) {
            aei.a().b(2);
            s();
            z();
            c(getPlayState());
            u.c(new agd.h());
        }
        m();
        BluetoothService bluetoothService = this.d;
        if (bluetoothService != null) {
            bluetoothService.h();
        }
    }

    private boolean y() {
        return aei.a().c() == 2;
    }

    public void s() {
        if (y()) {
            u.c(new age.c(2));
        }
    }

    private void z() {
        if (y()) {
            LogUtils.i("BluetoothMusicModel", "notifyStateChanged");
            BluetoothService bluetoothService = this.d;
            u.f(new age.l(2, bluetoothService != null ? bluetoothService.i() : -1));
            return;
        }
        LogUtils.i("BluetoothMusicModel", "not bluetooth type, notifyStateChanged failed");
    }

    private int A() {
        return ay.b("bt_play_state", -1);
    }

    private void c(int i) {
        if (this.h || i == 2) {
            Log.i("BluetoothMusicModel", "savePlayState() called with: playState = [" + i + "]");
            if (y()) {
                ay.a("bt_play_state", i);
            } else {
                ay.a("bt_play_state", 3);
            }
        }
    }

    private boolean B() {
        return d(true);
    }

    private boolean d(boolean z) {
        if (ags.a().f()) {
            if (!(y() && p()) && z) {
                ak.b(com.xiaopeng.musicradio.a.a, f.h.tips_can_not_play_bt_music);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.aek
    public void register() {
        u.a(this);
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
        ags.a().a(this, this.p);
        m();
    }

    @Override // defpackage.aek
    public void unregister() {
        ags.a().a(this);
        l();
        BluetoothService bluetoothService = this.d;
        if (bluetoothService != null) {
            bluetoothService.b(3);
        }
        u.b(this);
        c cVar = this.c;
        if (cVar != null) {
            cVar.b();
        }
    }

    public String t() {
        return a;
    }

    public String u() {
        return b;
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onPowerStateChange(agg.s sVar) {
        this.h = sVar.a();
        if (y()) {
            if (this.h) {
                m();
            } else {
                l();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioPos(age.m mVar) {
        BluetoothService bluetoothService;
        if (this.q == mVar.c()) {
            return;
        }
        this.q = mVar.c();
        if (this.q % 5 == 0 && getPlayState() == 2 && (bluetoothService = this.d) != null) {
            bluetoothService.h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMediaCenterBtStatusChanged(agd.e eVar) {
        if (eVar.a() == 2 && y() && com.xiaopeng.musicradio.a.a.getPackageName().equalsIgnoreCase(amw.a().b())) {
            aej c = aeh.a().c();
            LogUtils.d("BluetoothMusicModel", "UNMUTE:" + amw.a().b());
            if (c == null || c.f()) {
                m();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onUserLogout(agq.v vVar) {
        Map<String, String> map = this.l;
        if (map != null) {
            map.clear();
        }
        if (this.f == null || apx.a().d()) {
            return;
        }
        this.f.setLogo("");
        u.c(new agq.a());
    }

    private void a(final float f) {
        C();
        if (q()) {
            return;
        }
        this.n = 0;
        this.i = Observable.interval(20L, 500L, TimeUnit.MILLISECONDS).takeUntil(new Predicate<Long>() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.4
            @Override // io.reactivex.functions.Predicate
            /* renamed from: a */
            public boolean test(Long l) {
                boolean a2 = a.this.d.a(f);
                LogUtils.i("BluetoothMusicModel", "setVolume: " + f);
                if (a.this.n > 10) {
                    Log.i("BluetoothMusicModel", "mSetVolumeRetryTime > 10 , stop retry");
                    return true;
                }
                a.g(a.this);
                return a2;
            }
        }).subscribeOn(Schedulers.newThread()).subscribe();
    }

    private void C() {
        axv.a(this.i);
    }

    private void d(final int i) {
        D();
        this.m = 0;
        this.j = Observable.interval(0L, 500L, TimeUnit.MILLISECONDS).takeUntil(new Predicate<Long>() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.5
            @Override // io.reactivex.functions.Predicate
            /* renamed from: a */
            public boolean test(Long l) {
                if (!a.this.n()) {
                    Log.i("BluetoothMusicModel", String.format("setStreamMode [%s] cancelled for disconnect, stop retry", Integer.valueOf(i)));
                    return true;
                } else if (a.this.m > 10) {
                    Log.i("BluetoothMusicModel", "mSetStreamRetryTime > 10");
                    return true;
                } else {
                    a.i(a.this);
                    return a.this.d.a(i);
                }
            }
        }).subscribeOn(Schedulers.newThread()).subscribe();
    }

    private void D() {
        axv.a(this.j);
    }

    private void E() {
        this.f.setSong(a);
        this.f.setSinger(b);
        this.f.setDuration(0);
        this.f.setLogo("");
        this.f.setLrcContent(null);
        this.f.refreshUuid();
    }

    @Override // defpackage.aek
    public void e() {
        pause();
    }

    @Override // defpackage.aek
    public void f() {
        rebootPlay(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        G();
        a(this.s, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.r.cancel();
        }
        Disposable disposable = this.k;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.k.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        G();
        a(this.s, 0.0f);
    }

    private void a(float f, float f2) {
        LogUtils.i("BluetoothMusicModel", "volumeChange start: " + f + ", end: " + f2);
        this.r = ValueAnimator.ofFloat(f, f2);
        this.r.setDuration(500L);
        this.r.setInterpolator(new LinearInterpolator());
        this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a aVar = a.this;
                aVar.b(aVar.s);
            }
        });
        this.r.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        if (q()) {
            LogUtils.i("BluetoothMusicModel", "setVolumeInternal failed, in call");
            return;
        }
        Disposable disposable = this.k;
        if (disposable != null && !disposable.isDisposed()) {
            this.k.dispose();
        }
        this.k = Observable.just(Float.valueOf(f)).subscribeOn(Schedulers.single()).subscribe(new Consumer<Float>() { // from class: com.xiaopeng.musicradio.model.bluetooth.a.7
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Float f2) {
                if (a.this.d != null) {
                    boolean a2 = a.this.d.a(f2.floatValue());
                    LogUtils.i("BluetoothMusicModel", "setVolumeInternal [" + f2 + "] result:" + a2);
                    return;
                }
                LogUtils.i("BluetoothMusicModel", "setVolumeInternal failed, service null");
            }
        });
    }

    @Override // defpackage.aek
    public void stop() {
        BluetoothService bluetoothService = this.d;
        if (bluetoothService != null) {
            bluetoothService.e();
        }
    }

    private void I() {
        J();
    }

    private void J() {
        Disposable disposable = this.o;
        if (disposable != null) {
            disposable.dispose();
            LogUtils.d("BluetoothMusicModel", "dispose mSwitchToMusicDisposable");
        }
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onConfigEvent(ConfigurationChangeEvent configurationChangeEvent) {
        if (configurationChangeEvent.getChangeList() != null) {
            for (IConfigurationData iConfigurationData : configurationChangeEvent.getChangeList()) {
                if (iConfigurationData.getKey().equalsIgnoreCase("white_list_singers")) {
                    Log.i("BluetoothMusicModel", "onConfigEvent ============ ");
                    K();
                    return;
                }
            }
        }
    }

    private void K() {
        String a2 = ai.a("white_list_singers", "");
        LogUtils.i("BluetoothMusicModel", "updateWhiteListSingers:" + a2);
        if (be.a((CharSequence) a2)) {
            return;
        }
        try {
            JsonArray asJsonArray = new JsonParser().parse(a2).getAsJsonArray();
            ArrayList<String> arrayList = new ArrayList<>();
            if (asJsonArray == null || asJsonArray.size() <= 0) {
                return;
            }
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
            if (this.d != null) {
                this.d.a(arrayList);
            }
        } catch (Exception unused) {
        }
    }

    public boolean v() {
        BluetoothService bluetoothService = this.d;
        if (bluetoothService != null) {
            return bluetoothService.j();
        }
        return false;
    }
}
