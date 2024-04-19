package com.xiaopeng.musicradio.model.car;

import android.util.Log;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.v2extend.IMcuController;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.f;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agf;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: IGManager.java */
/* loaded from: classes.dex */
public class a {
    private boolean a = false;
    private boolean b = true;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IGManager.java */
    /* renamed from: com.xiaopeng.musicradio.model.car.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0140a {
        static final a a = new a();
    }

    public static a a() {
        return C0140a.a;
    }

    public a() {
        u.a(this);
        Log.i("IGManager", "IGManager: ============");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCarApiConnected(agf.a aVar) {
        b();
    }

    public void b() {
        boolean b = bf.b();
        boolean i = h.i();
        Log.i("IGManager", "rebootPlayWhenCarConAndBootFin isComplete: " + b + " carconnected = " + i);
        if (b && i) {
            try {
                h();
            } catch (Exception e) {
                Log.e("IGManager", "rebootPlayWhenCarConAndBootFin: ====== ", e);
                this.a = true;
                if (aei.a().f()) {
                    return;
                }
                aei.a().a(j());
            }
        }
    }

    private void h() {
        int i;
        try {
            i = h.d().getIgStatusFromMcu();
        } catch (Exception e) {
            Log.e("IGManager", "rebootPlay getIgStatusFromMcu", e);
            i = 1;
        }
        Log.i("IGManager", "onCarApiConnected: " + i + " igOn = " + this.a);
        if (aei.a().f() || i != 1) {
            return;
        }
        this.a = true;
        aei.a().a(j());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGStateChange(IMcuController.McuIgStatusEventMsg mcuIgStatusEventMsg) {
        int intValue = mcuIgStatusEventMsg.getData().intValue();
        Log.i("IGManager", "onIGStateChange: " + mcuIgStatusEventMsg.getData());
        if (intValue == 0 || intValue == 2) {
            i();
        } else if (intValue == 1) {
            this.a = true;
            this.b = false;
            this.c = false;
            u.c(new agg.s(true));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if (this.a) {
            if (lVar.a() == 1 || lVar.a() == 2) {
                this.b = true;
                this.c = true;
            }
        }
    }

    private void i() {
        Log.i("IGManager", "igOff: " + this.c);
        u.c(new agg.s(false));
        if (this.c) {
            this.c = false;
            this.a = false;
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.car.a.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.i("IGManager", "run: ====== ");
                    a.this.e();
                    aek e = aei.a().e();
                    if (e != null) {
                        Log.i("IGManager", "run: state = " + e.getPlayState() + " getPlayWhenReady = " + e.getPlayWhenReady() + " type = " + aei.a().c());
                        boolean z = true;
                        if ((e.getPlayState() == 1 && e.getPlayWhenReady()) || e.getPlayState() == 2) {
                            a.this.b(true);
                            if (aei.a().c() == 0) {
                                if (!(e.d() instanceof MusicInfo) || ((MusicInfo) e.d()).getMusicFrom() != 61) {
                                    z = false;
                                }
                                if (z) {
                                    Log.i("IGManager", "stop player");
                                    e.stop();
                                } else {
                                    Log.i("IGManager", "pause player");
                                    e.pause();
                                }
                                Log.i("IGManager", "run: state playing");
                            } else {
                                Log.i("IGManager", "pause player");
                                e.pause();
                            }
                        } else if (e.g()) {
                            a.this.b(true);
                        }
                        if (aei.a().c() != 0 || e.d() == null) {
                            return;
                        }
                        e.seekTo(0);
                        return;
                    }
                    Log.i("IGManager", "run: model is null");
                }
            });
        }
    }

    public void c() {
        Log.i("IGManager", "igOn: ");
        if (this.a) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.car.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.b) {
                        return;
                    }
                    a.this.b = true;
                    a.this.c = true;
                    if (aei.a().f()) {
                        aek e = aei.a().e();
                        Log.i("IGManager", "run: model = " + e);
                        if (e != null) {
                            boolean d = a.this.d();
                            Log.i("IGManager", "run: " + d + " silence = " + f.c());
                            if (aei.a().c() == 0 && e.d() != null && e.getPlayState() != 2) {
                                e.seekTo(0);
                            }
                            if (d && !f.c()) {
                                e.f();
                            }
                            a.this.e();
                            return;
                        }
                        return;
                    }
                    boolean d2 = a.this.d();
                    Log.i("IGManager", "igOn run: " + d2);
                    aei.a().a(d2);
                    a.this.e();
                }
            });
        }
    }

    public void a(boolean z) {
        Log.i("IGManager", "setIgReplay: ====== " + z);
        b(z);
    }

    public void b(boolean z) {
        Log.i("IGManager", "setPlayValue: " + z);
        ay.b("SP_PLAY_BOOLEAN", z);
    }

    private boolean j() {
        return ay.c("SP_PLAY_BOOLEAN", false);
    }

    public boolean d() {
        return ay.c("SP_PLAY_BOOLEAN", false);
    }

    public void e() {
        ay.e("SP_PLAY_BOOLEAN");
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        return this.b;
    }
}
