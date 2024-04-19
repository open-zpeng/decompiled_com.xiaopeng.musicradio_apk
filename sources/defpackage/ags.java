package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.media.AudioManager;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.f;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: AudioFocusModel.java */
/* renamed from: ags  reason: default package */
/* loaded from: classes2.dex */
public class ags {
    private Disposable d;
    private boolean e;
    private age.l g;
    private Disposable i;
    private Disposable j;
    private ConcurrentHashMap<aek, a> a = new ConcurrentHashMap<>();
    private int b = -2;
    private int c = -1;
    private e h = new e();
    private boolean k = false;
    private boolean l = true;
    private Runnable m = new Runnable() { // from class: ags.1
        @Override // java.lang.Runnable
        public void run() {
            arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
            final boolean isInCall = arfVar != null ? arfVar.isInCall(true) : false;
            LogUtils.i("AudioFocusModel", "onFocusGain, isInCall = " + isInCall + ",,,,isA2dpConnect,,," + com.xiaopeng.musicradio.model.bluetooth.a.i().o() + ",,,AudioType,,," + aei.a().c());
            ags.this.e = false;
            if (aei.a().c() == 2 && !com.xiaopeng.musicradio.model.bluetooth.a.i().o()) {
                com.xiaopeng.musicradio.model.bluetooth.a.i().m();
            }
            ban.g(new Runnable() { // from class: ags.1.1
                @Override // java.lang.Runnable
                public void run() {
                    a aVar;
                    if (!isInCall) {
                        if (!f.c()) {
                            ags.this.c(2);
                        } else {
                            LogUtils.i("AudioFocusModel", "pauseByVolume when audio gain, because [mute]");
                            if (ags.this.q()) {
                                aei.a().c();
                            }
                        }
                    }
                    aek y = ags.this.y();
                    if (y == null || (aVar = (a) ags.this.a.get(y)) == null) {
                        return;
                    }
                    aVar.riseVolume();
                }
            });
        }
    };
    private Runnable n = new Runnable() { // from class: ags.2
        @Override // java.lang.Runnable
        public void run() {
            final aek y = ags.this.y();
            aej c2 = aeh.a().c();
            if (y == null || !c2.e()) {
                return;
            }
            arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
            final boolean isInCall = arfVar != null ? arfVar.isInCall(true) : false;
            ban.g(new Runnable() { // from class: ags.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (isInCall && amw.a().d()) {
                        y.setVolume(ags.this.h.a());
                    } else {
                        y.setVolume(1.0f);
                    }
                    if (isInCall && !amw.a().d()) {
                        LogUtils.i("AudioFocusModel", "mFocusChangeListener.audioPause()");
                        ags.this.b(true);
                        ags.this.u();
                        return;
                    }
                    LogUtils.i("AudioFocusModel", "reset mNeedResume while in playing state");
                    ags.this.b(false);
                    if (ags.this.c == -1 || ags.this.c == -2) {
                        ags.this.b();
                    }
                    if (ags.this.l) {
                        amw.a().c();
                    }
                    ags.this.l = true;
                    y.setVolume(ags.this.h.g);
                }
            });
        }
    };
    private final AudioManager.OnAudioFocusChangeListener o = new AudioManager.OnAudioFocusChangeListener() { // from class: ags.5
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            ags.this.b(i);
            ags.this.i = Single.timer(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: ags.5.1
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    LogUtils.i("AudioFocusModel", "onAudioFocusChange:" + i + ", mFocusPaused: " + ags.this.e);
                    ags.this.b = i;
                    ags.this.k = false;
                    int i2 = i;
                    if (i2 != 1) {
                        switch (i2) {
                            case -3:
                                ags.this.s();
                                break;
                            case -2:
                            case -1:
                                ags.this.o();
                                break;
                        }
                    } else {
                        ags.this.p();
                    }
                    ags.this.c = i;
                }
            });
        }
    };
    private boolean f = ay.d("need_resume");

    /* compiled from: AudioFocusModel.java */
    /* renamed from: ags$a */
    /* loaded from: classes2.dex */
    public interface a {
        void focusPause();

        void focusPlay();

        void lowerVolume();

        void riseVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioFocusModel.java */
    /* renamed from: ags$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final ags a = new ags();
    }

    /* compiled from: AudioFocusModel.java */
    /* renamed from: ags$c */
    /* loaded from: classes2.dex */
    public interface c {
        void updateSoundVolume(float f);
    }

    /* compiled from: AudioFocusModel.java */
    /* renamed from: ags$d */
    /* loaded from: classes2.dex */
    public interface d {
        void changeState();

        void updateSoundVolume(float f);
    }

    private boolean a(int i) {
        return i == 1;
    }

    private boolean e(int i) {
        return i == 2 || i == 1;
    }

    public boolean i() {
        return false;
    }

    public ags() {
        ay.e("need_resume");
        u.a(this);
    }

    public static ags a() {
        return b.a;
    }

    public void b() {
        if (this.b == 1) {
            return;
        }
        int requestAudioFocus = f.a().requestAudioFocus(this.o, 3, 1);
        LogUtils.i("AudioFocusModel", "requestAudioFocus: " + requestAudioFocus);
        if (requestAudioFocus == 0) {
            b(-1);
            this.b = -1;
            if (amw.a().d()) {
                s();
            } else {
                o();
            }
            if (this.d == null) {
                this.d = Observable.interval(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: ags.3
                    @Override // io.reactivex.functions.Consumer
                    /* renamed from: a */
                    public void accept(Long l) {
                        ags.this.b();
                    }
                }, new Consumer<Throwable>() { // from class: ags.4
                    @Override // io.reactivex.functions.Consumer
                    /* renamed from: a */
                    public void accept(Throwable th) {
                        LogUtils.i("AudioFocusModel", "requestAudioFocus() called with: throwable = [" + th + "]");
                    }
                });
            }
        } else {
            b(1);
            this.b = 1;
            LogUtils.i("AudioFocusModel", "mFocusType: " + this.b);
            p();
        }
        this.c = this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        arf arfVar = (arf) com.xiaopeng.musicradio.service.c.a().b(arf.class);
        if (arfVar != null) {
            return arfVar.isInCall();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtils.d("AudioFocusModel", "onFocusLoss, isInCall = " + n());
        this.k = true;
        x();
        u();
        if (this.b == -1 && aei.a().c() == 2 && !"com.xiaopeng.carcontrol".equalsIgnoreCase(amw.a().b()) && !IpcConfig.App.CAR_BT_PHONE.equalsIgnoreCase(amw.a().b())) {
            com.xiaopeng.musicradio.model.bluetooth.a.i().l();
        }
        MediaCenterModel.getInstance().resetAudioInfoRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.k = false;
        r();
        aej c2 = aeh.a().c();
        if (c2 != null && !c2.e()) {
            LogUtils.i("AudioFocusModel", "onAudioFocusChange: ======= focus");
            return;
        }
        ban.b(this.m);
        ban.d(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (y() != null) {
            return a(y().getPlayState());
        }
        return false;
    }

    public boolean c() {
        return this.k;
    }

    private void r() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        aek y = y();
        if (this.c != 1 || y == null) {
            return;
        }
        t();
    }

    private void t() {
        aek y = y();
        if (y != null) {
            for (Map.Entry<aek, a> entry : this.a.entrySet()) {
                if (entry.getKey().equals(y)) {
                    entry.getValue().lowerVolume();
                } else {
                    entry.getKey().setVolume(this.h.a());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Disposable disposable = this.i;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.i.dispose();
        LogUtils.i("AudioFocusModel", "dispose handle focusChange, current focus:" + i);
    }

    public void a(aek aekVar, a aVar) {
        LogUtils.d("AudioFocusModel", "addAudioFocusChangeListener:" + aVar + ", @model:" + aekVar);
        this.a.put(aekVar, aVar);
    }

    public void a(aek aekVar) {
        LogUtils.d("AudioFocusModel", "removeAudioFocusChangeListener:" + aekVar);
        this.a.remove(aekVar);
    }

    public boolean d() {
        return this.b == 1;
    }

    public boolean e() {
        return this.e || f.c();
    }

    public boolean f() {
        if (amw.a().d()) {
            return false;
        }
        Log.i("AudioFocusModel", "isNotPlayable: " + com.xiaopeng.musicradio.model.car.a.a().f() + " iscall = " + n());
        return n() || !com.xiaopeng.musicradio.model.car.a.a().f();
    }

    public boolean g() {
        if (amw.a().d()) {
            return false;
        }
        return n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (!z() || aei.a().c() == 2) {
            if (!com.xiaopeng.musicradio.model.car.a.a().f()) {
                LogUtils.i("AudioFocusModel", "return as power off");
            } else if (e() && i != 4) {
                LogUtils.i("AudioFocusModel", "cancel play, mFocusPaused： " + this.e + ", isSilence: " + f.c());
            } else if (!this.f) {
                LogUtils.i("AudioFocusModel", "cancel play, mNeedResume: false");
            } else {
                LogUtils.i("AudioFocusModel", "notifyPlayMusic() called");
                if (i == 2) {
                    this.l = true;
                } else if (i == 3) {
                    this.l = true;
                    if (this.b < 0) {
                        LogUtils.i("AudioFocusModel", "cancel play, no focus and hand off play");
                        return;
                    }
                } else if (i == 1) {
                    this.l = false;
                }
                h();
                u.c(new agg.j());
                if (com.xiaopeng.musicradio.model.car.a.a().g()) {
                    Log.i("AudioFocusModel", "notifyPlayMusic: ========");
                    for (a aVar : this.a.values()) {
                        aVar.focusPlay();
                    }
                    return;
                }
                Log.i("AudioFocusModel", "notifyPlayMusic: igonplay");
                com.xiaopeng.musicradio.model.car.a.a().a(true);
            }
        }
    }

    public void h() {
        this.h.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.e = true;
        LogUtils.i("AudioFocusModel", "pauseByFocus() called");
        d(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (z() || aei.a().c() == 2) {
            LogUtils.i("AudioFocusModel", "pauseByVolume() called");
            d(1);
        }
    }

    private void d(int i) {
        LogUtils.i("AudioFocusModel", "notifyPauseMusic() called");
        if (i != 1) {
            w();
        } else {
            b(true);
        }
        k();
    }

    private void w() {
        if (this.f) {
            return;
        }
        aek y = y();
        if (y != null) {
            b(e(y.getPlayState()));
        } else {
            b(false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLogout(agq.v vVar) {
        this.h.c();
        this.h.b();
        this.h.d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCallStateChanged(agd.f fVar) {
        boolean a2 = fVar.a();
        LogUtils.i("AudioFocusModel", "onCallStateChanged:isInCall: " + a2 + ",mFocusPaused: " + this.e + ",mFocusType: " + this.b);
        if (a2) {
            if (amw.a().d()) {
                return;
            }
            w();
            k();
            return;
        }
        c(3);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onVolumeChanged(agg.d dVar) {
        final int a2 = dVar.a();
        LogUtils.i("AudioFocusModel", "onVolumeChanged muteFlag:" + a2);
        x();
        this.j = Single.timer(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: ags.6
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                aej c2 = aeh.a().c();
                if (c2 != null) {
                    LogUtils.i("AudioFocusModel", "onVolumeChanged, isInCall:" + ags.this.n() + ", driverJoyMode:" + amw.a().d() + " isSilence = " + f.c() + " focusChange = " + c2.e());
                } else {
                    LogUtils.i("AudioFocusModel", "onVolumeChanged, isInCall:" + ags.this.n() + ", driverJoyMode:" + amw.a().d() + " isSilence = " + f.c());
                }
                if (!ags.this.n() || amw.a().d()) {
                    if (c2 == null || c2.e()) {
                        if (f.c()) {
                            ags.this.v();
                        } else if (ags.this.e() || a2 != 0) {
                        } else {
                            LogUtils.i("AudioFocusModel", "onVolumeChanged notifyPlayMusic");
                            ags.this.c(1);
                        }
                    }
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDriverJoyModeUpdate(agg.i iVar) {
        if (n()) {
            if (amw.a().d()) {
                c(4);
                t();
                return;
            }
            d(4);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGChange(agg.s sVar) {
        if (sVar.a()) {
            return;
        }
        this.f = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        age.l lVar2 = this.g;
        if (lVar2 != null && lVar2.b() == lVar.b() && this.g.a() == lVar.a()) {
            return;
        }
        LogUtils.d("AudioFocusModel", "state ---- mLastFocusType: " + this.c + " ,audioType: " + lVar.b() + ", state =" + lVar.a());
        this.g = lVar;
        if (lVar.a() == 2 || lVar.a() == 1) {
            ban.b(this.n);
            ban.d(this.n);
        }
    }

    public void a(boolean z) {
        b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        LogUtils.i("AudioFocusModel", "setResumeWhenGainedAudio() called with: needResume = [" + z + "]");
        this.f = z;
        ay.a("need_resume", z);
    }

    private void x() {
        Disposable disposable = this.j;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aek y() {
        return aei.a().e();
    }

    private boolean z() {
        if (y() != null) {
            return e(y().getPlayState());
        }
        return false;
    }

    public boolean j() {
        return this.f;
    }

    public void k() {
        this.h.c();
        LogUtils.d("AudioFocusModel", "forcePauseAll start");
        for (a aVar : this.a.values()) {
            LogUtils.d("AudioFocusModel", "AudioFocusChangeListener focusPause call");
            aVar.focusPause();
        }
    }

    public void a(c cVar) {
        this.h.a(cVar);
    }

    public void b(c cVar) {
        this.h.b(cVar);
    }

    public void a(d dVar) {
        this.h.a(dVar);
    }

    public void b(d dVar) {
        this.h.b(dVar);
    }

    public void l() {
        this.h.d();
        for (Map.Entry<aek, a> entry : this.a.entrySet()) {
            entry.getKey().setVolume(1.0f);
        }
    }

    public int m() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioFocusModel.java */
    /* renamed from: ags$e */
    /* loaded from: classes2.dex */
    public class e {
        private AccelerateDecelerateInterpolator b;
        private ValueAnimator c;
        private ValueAnimator d;
        private ValueAnimator e;
        private float f;
        private float g;

        private e() {
            this.b = new AccelerateDecelerateInterpolator();
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = 1.0f;
            this.g = 1.0f;
        }

        void a(final c cVar) {
            b();
            float f = this.g;
            if (f >= 1.0f) {
                f = 1.0f;
            }
            final float a = a();
            LogUtils.i("AudioFocusModel", "lowerVolumeFlow() called: start = [" + f + "], end = [" + a + "]");
            if (f == a) {
                this.g = a;
                cVar.updateSoundVolume(a);
                return;
            }
            this.c = ValueAnimator.ofFloat(f, a);
            this.c.setDuration(300L);
            this.c.setInterpolator(this.b);
            this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ags.e.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.this.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    cVar.updateSoundVolume(e.this.g);
                }
            });
            this.c.addListener(new AnimatorListenerAdapter() { // from class: ags.e.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    e.this.g = a;
                }
            });
            this.c.start();
        }

        void b(final c cVar) {
            b();
            float max = Math.max(this.g, a());
            LogUtils.i("AudioFocusModel", "highVolumeFlow() called: start = [" + max + "], end = [1.0]");
            if (max == 1.0f) {
                this.g = 1.0f;
                cVar.updateSoundVolume(1.0f);
                return;
            }
            this.c = ValueAnimator.ofFloat(max, 1.0f);
            this.c.setDuration(300L);
            this.c.setInterpolator(this.b);
            this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ags.e.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.this.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (e.this.e == null || !e.this.e.isRunning()) {
                        cVar.updateSoundVolume(e.this.g);
                    }
                }
            });
            this.c.addListener(new AnimatorListenerAdapter() { // from class: ags.e.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    e.this.g = 1.0f;
                }
            });
            this.c.start();
        }

        float a() {
            float f;
            int b = f.b(3);
            try {
                int b2 = f.b(9);
                int b3 = f.b(10);
                int i = 0;
                if (b2 > 0 && b3 > 0) {
                    i = Math.min(b2, b3);
                } else if (b2 > 0) {
                    i = b2;
                } else if (b3 > 0) {
                    i = b3;
                }
                if (i > b) {
                    i = b;
                }
                LogUtils.i("AudioFocusModel", "导航(stream 9)音量: " + b2 + ", TTS(stream 10)播报音量: " + b3 + ", 当前音乐音量(stream 3)： " + b + ", minRef: " + i);
                if (i <= 0 || b <= 0) {
                    LogUtils.i("AudioFocusModel", "条件不满足，保持音乐音量");
                    f = 1.0f;
                } else {
                    f = (float) ((i * 0.3d) / b);
                }
            } catch (Exception e) {
                e.printStackTrace();
                f = 1.0f;
            }
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }

        void b() {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.c.cancel();
        }

        void c() {
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.d.cancel();
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                return;
            }
            this.e.cancel();
        }

        void a(final d dVar) {
            float min;
            c();
            float f = this.f;
            if (f > 0.0f && f < 1.0f) {
                min = Math.min(f, this.g);
            } else {
                min = Math.min(1.0f, this.g);
            }
            LogUtils.i("AudioFocusModel", "fadeVolumeDown() called: start = " + min + " end = 0.0");
            if (ags.this.n() || min == 0.0f) {
                dVar.updateSoundVolume(0.0f);
                dVar.changeState();
                return;
            }
            this.e = ValueAnimator.ofFloat(min, 0.0f);
            this.e.setDuration(500L);
            this.e.setInterpolator(this.b);
            this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ags.e.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.this.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    dVar.updateSoundVolume(e.this.f);
                }
            });
            this.e.addListener(new AnimatorListenerAdapter() { // from class: ags.e.6
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    dVar.changeState();
                }
            });
            this.e.start();
        }

        void b(final d dVar) {
            float min;
            c();
            float f = this.g;
            float f2 = this.f;
            if (f2 > 0.0f && f2 < 1.0f) {
                min = Math.min(f2, f);
            } else {
                min = Math.min(0.0f, this.g);
            }
            LogUtils.i("AudioFocusModel", "fadeVolumeUp() called: start = " + min + " end = " + f);
            if (min == f && f != 0.0f) {
                dVar.changeState();
                dVar.updateSoundVolume(min);
                return;
            }
            if (f == 0.0f) {
                f = 1.0f;
            }
            this.d = ValueAnimator.ofFloat(min, f);
            this.d.setDuration(800L);
            this.d.setInterpolator(this.b);
            this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ags.e.7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.this.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    dVar.updateSoundVolume(e.this.f);
                }
            });
            this.d.addListener(new AnimatorListenerAdapter() { // from class: ags.e.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    dVar.changeState();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ags.this.d()) {
                        e eVar = e.this;
                        eVar.f = eVar.g;
                        dVar.updateSoundVolume(e.this.f);
                    }
                }
            });
            this.d.start();
        }

        void d() {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.e;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.g = 1.0f;
            this.f = 1.0f;
        }
    }
}
