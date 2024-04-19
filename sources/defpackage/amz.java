package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.nforetek.bt.aidl.NfHfpClientCall;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.model.bluetooth.BluetoothService;
import com.xiaopeng.musicradio.model.bluetooth.a;
import com.xiaopeng.musicradio.model.bluetooth.b;
import com.xiaopeng.musicradio.model.bluetooth.d;
import com.xiaopeng.musicradio.model.bluetooth.e;
import com.xiaopeng.musicradio.model.bluetooth.f;
import com.xiaopeng.musicradio.model.bluetooth.h;
import com.xiaopeng.musicradio.model.bluetooth.i;
import com.xiaopeng.musicradio.model.bluetooth.j;
import com.xiaopeng.musicradio.model.bluetooth.k;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.u;
import defpackage.abc;
import defpackage.agd;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: BluetoothServiceNforeImpl.java */
@Route(path = "/XPMusic/service/bluetooth/nfore")
/* renamed from: amz  reason: default package */
/* loaded from: classes2.dex */
public class amz implements BluetoothService, d, k.a {
    private Context a;
    private abf b;
    private abe g;
    private aaw h;
    private aav i;
    private abd j;
    private boolean k;
    private volatile boolean m;
    private volatile boolean n;
    private volatile boolean o;
    private Disposable t;
    private Disposable u;
    private Disposable v;
    private amy x;
    private final Set<h> c = new HashSet();
    private final Set<i> d = new HashSet();
    private final Set<j> e = new HashSet();
    private String f = "00:00:00:00:00:00";
    private int l = -1;
    private k p = new k();
    private f q = new f();
    private int r = 0;
    private e s = new e();
    private int w = 120;
    private boolean y = false;
    private aaz z = new aaz() { // from class: amz.13
        @Override // defpackage.aaz
        public void a(String str, String str2, int i, int i2) {
            super.a(str, str2, i, i2);
            LogUtils.i("BluetoothMusicService", "onDeviceBondStateChanged prevState:" + i + ", newState:" + i2 + ", name:" + str2);
            if (i == 331 && i2 == 332 && amz.this.m) {
                u.c(new agd.g(str2));
            }
        }

        @Override // defpackage.aaz
        public void a(String str, int i, int i2) {
            super.a(str, i, i2);
            LogUtils.i("BluetoothMusicService", "onBtAutoConnectStateChanged prevState:" + i + ", newState:" + i2);
            if (i2 == 110 && amz.this.m) {
                u.c(new agd.g(amz.this.j.b()));
            }
        }

        @Override // defpackage.aaz
        public void a() {
            super.a();
        }
    };
    private abb A = new abb() { // from class: amz.14
        @Override // defpackage.abb
        public void a(String str, int i, int i2) {
            Log.i("BluetoothMusicService", "Hfp#onStateChanged(): address = [" + str + "], prevState = [" + ana.a(i) + "], newState = [" + ana.a(i2) + "]");
            amz.this.d(i2 == 140, str);
        }

        @Override // defpackage.abb
        public void a(String str, int i, int i2, String str2, boolean z, boolean z2) {
            Log.i("BluetoothMusicService", "Hfp#onCallChanged(): call = [" + i2 + "]");
            amz amzVar = amz.this;
            amzVar.b(amzVar.e(i2));
        }

        @Override // defpackage.abb
        public void b(String str, int i, int i2) {
            super.b(str, i, i2);
            Log.i("BluetoothMusicService", "Hfp#onHfpAudioStateChanged(): state = [" + i2 + "]");
        }

        @Override // defpackage.abb
        public void a() {
            Log.i("BluetoothMusicService", "Hfp#onServiceReady() called");
        }
    };
    private aax B = new aax() { // from class: amz.15
        @Override // defpackage.aax
        public void a(String str, int i, int i2) {
            Log.i("BluetoothMusicService", "A2dp#onStateChanged(): address = [" + str + "], prevState = [" + ana.a(i) + "], newState = [" + ana.a(i2) + "]");
            boolean z = i2 == 140 || i2 == 150;
            amz.this.w = i2;
            u.c(new agd.a(amz.this.w));
            if (i2 != 150) {
                amz.this.x();
            }
            amz.this.a(z, str);
        }

        @Override // defpackage.aax
        public void a() {
            Log.i("BluetoothMusicService", "A2dp#onServiceReady() called");
            amz amzVar = amz.this;
            amzVar.a(amzVar.i.b(), amz.this.i.c());
        }
    };
    private aay C = new aay() { // from class: amz.16
        private long b = Long.MIN_VALUE;

        @Override // defpackage.aay
        public void a(String str, int i, int i2) {
            Log.i("BluetoothMusicService", "Avrcp#onStateChanged(): address = [" + str + "], prevState = [" + ana.a(i) + "], newState = [" + ana.a(i2) + "]");
            boolean z = i2 == 140 || i2 == 145;
            if (z) {
                amz.this.s.f();
            }
            amz.this.c(z, str);
        }

        @Override // defpackage.aay
        public void a(int[] iArr, String[] strArr) {
            Log.i("BluetoothMusicService", "Avrcp#onElementAttributesPlayingResponse(): ids = " + Arrays.toString(iArr) + ", texts = " + Arrays.toString(strArr));
            e eVar = new e();
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                String str = strArr[i];
                if (i2 != 7) {
                    switch (i2) {
                        case 1:
                            eVar.a(str);
                            continue;
                        case 2:
                            eVar.b(str);
                            continue;
                        case 3:
                            eVar.c(str);
                            continue;
                    }
                } else {
                    try {
                        eVar.a(Integer.parseInt(str));
                    } catch (Exception unused) {
                        eVar.a(0L);
                    }
                }
            }
            if (eVar.e()) {
                if (amz.this.q.a(eVar.a()) && amz.this.q.a(eVar.b()) && !amz.this.q.a(eVar.a(), eVar.b())) {
                    return;
                }
                if (amz.this.s.d() > 0 && amz.this.s.d() == eVar.d()) {
                    if ((eVar.a().equalsIgnoreCase(amz.this.s.a()) || eVar.b().equalsIgnoreCase(amz.this.s.b())) && eVar.c().equalsIgnoreCase(amz.this.s.c())) {
                        return;
                    }
                    if (amz.this.q.a(amz.this.s.a()) && amz.this.s.a().contains(eVar.b()) && amz.this.s.a().contains(eVar.a())) {
                        return;
                    }
                    if (amz.this.q.a(amz.this.s.b()) && amz.this.s.b().contains(eVar.b()) && amz.this.s.b().contains(eVar.a())) {
                        return;
                    }
                    if (amz.this.q.a(eVar.a()) && eVar.a().contains(amz.this.s.b()) && eVar.a().contains(amz.this.s.a())) {
                        return;
                    }
                    if (amz.this.q.a(eVar.b()) && eVar.b().contains(amz.this.s.b()) && eVar.b().contains(amz.this.s.a())) {
                        return;
                    }
                }
                if (Math.abs(amz.this.s.d() - eVar.d()) < 1000 && eVar.c().equalsIgnoreCase(amz.this.s.c()) && eVar.b().equalsIgnoreCase(amz.this.s.b())) {
                    return;
                }
                amz.this.s.a(eVar);
                amz.this.a(eVar);
                this.b = Long.MIN_VALUE;
            }
        }

        @Override // defpackage.aay
        public void b(long j) {
            Log.i("BluetoothMusicService", "Avrcp#onPlaybackPosChanged(): songPos = [" + j + "]");
            amz amzVar = amz.this;
            amzVar.a(j, amzVar.q.b().d());
        }

        @Override // defpackage.aay
        public void a(byte b) {
            Log.i("BluetoothMusicService", "Avrcp#onRegisterEventWatcherSuccess(): eventId = [" + ((int) b) + "]");
        }

        @Override // defpackage.aay
        public void b(byte b) {
            Log.i("BluetoothMusicService", "Avrcp#onRegisterEventWatcherFail(): eventId = [" + ((int) b) + "]");
        }

        @Override // defpackage.aay
        public void a(long j, long j2, byte b) {
            Log.i("BluetoothMusicService", "Avrcp#onPlayStatusResponse(): songLen = [" + j + "], songPos = [" + j2 + "], state = [" + ana.b(b) + "]");
            amz.this.c(b);
            amz.this.a(j2, j);
        }

        @Override // defpackage.aay
        public void c(byte b) {
            Log.i("BluetoothMusicService", "Avrcp#onPlaybackStatusChanged(): state = [" + ana.b(b) + "]");
            amz.this.c(b);
            amz.this.z();
        }

        @Override // defpackage.aay
        public void a(long j) {
            Log.i("BluetoothMusicService", "Avrcp#onTrackChanged(): elementId = [" + j + "]");
            amz.this.z();
            amz.this.h();
        }

        @Override // defpackage.aay
        public void a() {
            Log.i("BluetoothMusicService", "Avrcp#onServiceReady() called");
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i) {
        return i != 1 ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        this.a = context;
        this.b = new abf(context);
        this.x = new amy(this);
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void a() {
        Log.i("BluetoothMusicService", "bind()");
        this.i = new aav(this.a, this.B);
        this.h = new aaw(this.a, this.C);
        this.g = new abe(this.a, this.A);
        this.j = new abd(this.a, this.z);
        this.b.a(this.i);
        this.b.a(this.h);
        this.b.a(this.g);
        this.b.a(this.j);
        this.g.d.a(new abc.a() { // from class: amz.1
            @Override // defpackage.abc.a
            public void a() {
                amz amzVar = amz.this;
                amzVar.b(amzVar.l());
                amz amzVar2 = amz.this;
                amzVar2.d(amzVar2.g.b(), amz.this.g.b("BluetoothMusicService"));
            }
        });
        this.i.d.a(new abc.a() { // from class: amz.10
            @Override // defpackage.abc.a
            public void a() {
                amz amzVar = amz.this;
                amzVar.a(amzVar.i.b(), amz.this.i.c());
            }
        });
        this.h.d.a(new abc.a() { // from class: amz.11
            @Override // defpackage.abc.a
            public void a() {
                amz amzVar = amz.this;
                amzVar.c(amzVar.h.b(), amz.this.h.c());
            }
        });
        this.j.d.a(new abc.a() { // from class: amz.12
            @Override // defpackage.abc.a
            public void a() {
                if (amz.this.b()) {
                    u.c(new agd.g(amz.this.j.b()));
                }
            }
        });
        this.b.a();
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void a(String str) {
        this.x.a(str);
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean j() {
        return this.y;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        f fVar = this.q;
        f.a.clear();
        f fVar2 = this.q;
        f.a.addAll(arrayList);
    }

    private void b(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str) {
        if (this.m == z) {
            return;
        }
        Log.i("BluetoothMusicService", "setA2dpConnected(): isConnected = [" + z + "], address: [" + str + "], deviceName:[" + this.j.b() + "]");
        b(z, str);
    }

    private void b(boolean z, String str) {
        this.m = z;
        this.w = this.i.a(str);
        u.c(new agd.a(this.w));
        u.c(new agd.e(MediaCenterModel.getInstance().getBtStatus()));
        if (z) {
            b(str);
            m();
            z();
            u.c(new agd.g(this.j.b()));
            ban.a(new Runnable() { // from class: amz.17
                @Override // java.lang.Runnable
                public void run() {
                    if (amz.this.h == null || amz.this.h.b()) {
                        return;
                    }
                    amz.this.h.a(amz.this.f);
                }
            }, 1000L);
        } else {
            n();
            b((String) null);
            u.c(new agd.g(""));
        }
        a(2, z);
    }

    private void m() {
        aav aavVar = this.i;
        if (aavVar != null) {
            aavVar.a(3);
        }
    }

    private void n() {
        this.q.a();
        for (final j jVar : this.e) {
            ban.j(new Runnable() { // from class: amz.2
                @Override // java.lang.Runnable
                public void run() {
                    jVar.a(amz.this.q.b());
                }
            });
        }
        b("00:00:00:00:00:00");
        u.c(new agd.g(""));
        Disposable disposable = this.u;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.u.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, String str) {
        if (this.n == z) {
            return;
        }
        Log.i("BluetoothMusicService", "setAvrcpConnected(): isConnected = [" + z + "], address = [" + str + "]");
        this.n = z;
        if (z) {
            o();
        } else {
            p();
        }
        a(3, z);
    }

    private void o() {
        aaw aawVar = this.h;
        if (aawVar != null) {
            aawVar.a((byte) 2, 0L);
            this.h.a((byte) 1, 0L);
            this.h.a((byte) 5, 5L);
            this.r = 0;
            h();
            z();
        }
        if (bcp.a) {
            bcp.a = false;
            a.i().play();
        }
        this.p.a(this);
    }

    private void p() {
        this.x.a();
        aaw aawVar = this.h;
        if (aawVar != null) {
            aawVar.a((byte) 2);
            this.h.a((byte) 5);
            this.h.a((byte) 1);
        }
        this.p.a((k.a) null);
        this.p.b();
        this.q.a();
        c(0);
        a(this.q.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, String str) {
        if (this.o == z) {
            return;
        }
        Log.i("BluetoothMusicService", "setHfpConnected(): isConnected = [" + z + "], address = [" + str + "]");
        this.o = z;
        if (z) {
            q();
        } else {
            r();
        }
        a(0, z);
    }

    private void q() {
        b(l());
    }

    public boolean l() {
        List<NfHfpClientCall> c;
        abe abeVar = this.g;
        if (abeVar == null || (c = abeVar.c()) == null) {
            return false;
        }
        LogUtils.i("BluetoothMusicService", "isIncall getCallList:" + c);
        for (NfHfpClientCall nfHfpClientCall : c) {
            boolean e = e(nfHfpClientCall.b());
            LogUtils.i("BluetoothMusicService", "iterate call list:" + nfHfpClientCall);
            if (e) {
                return true;
            }
        }
        return false;
    }

    private void r() {
        b(false);
    }

    private void a(final int i, final boolean z) {
        for (final i iVar : this.d) {
            ban.j(new Runnable() { // from class: amz.3
                @Override // java.lang.Runnable
                public void run() {
                    iVar.a(i, z);
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean b() {
        return this.m;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean c() {
        return this.o;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean a(boolean z) {
        List<NfHfpClientCall> c;
        if (z) {
            abe abeVar = this.g;
            if (abeVar != null && (c = abeVar.c()) != null) {
                LogUtils.i("BluetoothMusicService", "isIncall getCallList:" + c);
                for (NfHfpClientCall nfHfpClientCall : c) {
                    LogUtils.i("BluetoothMusicService", "iterate call list:" + nfHfpClientCall);
                    if (e(nfHfpClientCall.b())) {
                        b(true);
                        return true;
                    }
                }
            }
            b(false);
            return false;
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z) {
        if (this.k == z) {
            return;
        }
        this.k = z;
        Log.i("BluetoothMusicService", "setInCall: " + z);
        for (final h hVar : this.c) {
            ban.j(new Runnable() { // from class: amz.4
                @Override // java.lang.Runnable
                public void run() {
                    hVar.a(z);
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean d() {
        this.x.a(new b("bt_play"));
        return true;
    }

    private boolean s() {
        boolean z = true;
        if (this.l == 2) {
            Log.i("BluetoothMusicService", "play() called canceled as is playing");
            return true;
        }
        aaw aawVar = this.h;
        z = (aawVar == null || !aawVar.d()) ? false : false;
        Log.i("BluetoothMusicService", "play() called: result = [" + z + "]");
        return z;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean e() {
        this.x.a(new b("bt_pause"));
        return true;
    }

    private boolean t() {
        aaw aawVar = this.h;
        boolean z = aawVar != null && aawVar.e();
        Log.i("BluetoothMusicService", "pause() called: result = [" + z + "]");
        return z;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean f() {
        this.x.a(new b("bt_next"));
        return true;
    }

    private boolean u() {
        aaw aawVar = this.h;
        boolean z = aawVar != null && aawVar.f();
        Log.i("BluetoothMusicService", "next() called: result = [" + z + "]");
        return z;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean g() {
        this.x.a(new b("bt_prev"));
        return true;
    }

    private boolean v() {
        aaw aawVar = this.h;
        boolean z = aawVar != null && aawVar.g();
        Log.i("BluetoothMusicService", "previous() called: result = [" + z + "]");
        return z;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean a(float f) {
        boolean a2dpVolume = MediaCenterModel.getInstance().setA2dpVolume(f);
        LogUtils.i("BluetoothMusicService", "setA2dpVolume: " + f);
        return a2dpVolume;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public boolean a(int i) {
        String str;
        boolean z = false;
        if (this.i != null) {
            if (i == 1) {
                str = "MUTE";
                z = MediaCenterModel.getInstance().pauseBtRender();
            } else {
                str = "UNMUTE";
                z = MediaCenterModel.getInstance().startBtRender();
            }
            Log.i("BluetoothMusicService", "setStreamMode(): mode = [" + str + "], result = [" + z + "]");
            A();
        } else {
            Log.i("BluetoothMusicService", "setStreamMode() called : mA2dp is null, result = [false]");
        }
        return z;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public int i() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        Disposable disposable = this.u;
        if (disposable != null && !disposable.isDisposed()) {
            this.u.dispose();
        }
        ban.j(new Runnable() { // from class: amz.5
            @Override // java.lang.Runnable
            public void run() {
                if (aei.a().c() == 2) {
                    int d = amz.this.d(i);
                    if (i != 0) {
                        if (amz.this.l == d) {
                            return;
                        }
                    } else {
                        amz.this.u = Observable.timer(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: amz.5.1
                            @Override // io.reactivex.functions.Consumer
                            /* renamed from: a */
                            public void accept(Long l) {
                                if (com.xiaopeng.musicradio.model.car.a.a().f() && amz.this.b()) {
                                    LogUtils.i("BluetoothMusicService", "play state is stopped, maybe there's no player running in the phone, just update playstate to pause and meta data to unknown singer & song");
                                    amz.this.y = true;
                                    ak.a(com.xiaopeng.musicradio.a.a, f.h.bt_no_player_error);
                                    u.c(new agd.d());
                                }
                            }
                        });
                    }
                    Log.i("BluetoothMusicService", "setPlayState(): state = [" + d + "]");
                    amz.this.y = false;
                    amz.this.l = d;
                    amz.this.w();
                    for (j jVar : amz.this.e) {
                        jVar.b(d);
                    }
                    return;
                }
                LogUtils.i("BluetoothMusicService", "don't update playstate as not bluetooth music type");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        switch (this.l) {
            case 2:
                z();
                h();
                this.p.b();
                this.p.a();
                x();
                return;
            case 3:
                this.p.b();
                if (this.w == 150) {
                    this.v = Observable.timer(10000L, TimeUnit.MILLISECONDS).subscribe(new Consumer<Long>() { // from class: amz.6
                        @Override // io.reactivex.functions.Consumer
                        /* renamed from: a */
                        public void accept(Long l) {
                            if (amz.this.w == 150 && amz.this.l == 3) {
                                LogUtils.i("BluetoothMusicService", "reset playstate to playing as a2dp state is streaming though playstate is paused, but now deprecated");
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Disposable disposable = this.v;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        LogUtils.i("BluetoothMusicService", "cancel disposeA2dpStremingCompatibility");
        this.v.dispose();
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void a(h hVar) {
        this.c.add(hVar);
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void a(i iVar) {
        this.d.add(iVar);
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void a(j jVar) {
        this.e.add(jVar);
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void b(int i) {
        this.l = i;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.k.a
    public void a(final long j) {
        for (final j jVar : this.e) {
            ban.j(new Runnable() { // from class: amz.7
                @Override // java.lang.Runnable
                public void run() {
                    jVar.a(j);
                }
            });
        }
    }

    private boolean y() {
        if (this.h != null && this.n) {
            aaw aawVar = this.h;
            return aawVar != null && aawVar.h();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        this.x.a(new b("bt_get_meta"));
        return true;
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.BluetoothService
    public void h() {
        this.x.a(new b("bt_get_play_status"));
    }

    private boolean A() {
        this.x.a(new b("bt_get_play_status"));
        return true;
    }

    private boolean B() {
        boolean z = true;
        if (this.h != null && this.n) {
            aaw aawVar = this.h;
            z = (aawVar == null || !aawVar.i()) ? false : false;
            Log.i("BluetoothMusicService", "getPlayStatus() called: result = [" + z + "], address: " + this.f);
            return z;
        }
        return true;
    }

    private void C() {
        Disposable disposable = this.t;
        if (disposable != null) {
            disposable.dispose();
        }
        this.t = Observable.timer(10L, TimeUnit.SECONDS).subscribe(new Consumer<Long>() { // from class: amz.8
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                if (amz.this.i() != 2 || amz.this.q.b().d() <= 0) {
                    return;
                }
                amz.this.p.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2) {
        this.p.a(j, i(), j2);
        if (i() == 2) {
            this.p.a();
        }
        if (j2 > 0) {
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final e eVar) {
        ban.g(new Runnable() { // from class: amz.9
            @Override // java.lang.Runnable
            public void run() {
                if (amz.this.q.a(eVar)) {
                    amz.this.a(0L, eVar.d());
                    for (final j jVar : amz.this.e) {
                        ban.j(new Runnable() { // from class: amz.9.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jVar.a(eVar);
                            }
                        });
                    }
                } else if (eVar.d() == 0) {
                    if (TextUtils.isEmpty(eVar.b()) || TextUtils.isEmpty(eVar.a())) {
                        amz.this.q.a();
                        for (final j jVar2 : amz.this.e) {
                            ban.j(new Runnable() { // from class: amz.9.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    jVar2.a(amz.this.q.b());
                                }
                            });
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.musicradio.model.bluetooth.d
    public boolean a(String str, HashMap<String, Object> hashMap) {
        char c;
        switch (str.hashCode()) {
            case -1700128249:
                if (str.equals("bt_get_play_status")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -82800961:
                if (str.equals("bt_get_position")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 193141440:
                if (str.equals("bt_next")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 193207041:
                if (str.equals("bt_play")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 193212928:
                if (str.equals("bt_prev")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 738674331:
                if (str.equals("bt_get_meta")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1694142409:
                if (str.equals("bt_pause")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return y();
            case 1:
            case 2:
                return B();
            case 3:
                return u();
            case 4:
                return s();
            case 5:
                return v();
            case 6:
                return t();
            default:
                return false;
        }
    }

    @Override // com.xiaopeng.musicradio.model.bluetooth.d
    public boolean k() {
        return this.m || this.o;
    }
}
