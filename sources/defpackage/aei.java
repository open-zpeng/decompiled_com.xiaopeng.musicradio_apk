package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
/* compiled from: AudioTypeControlModel.java */
/* renamed from: aei  reason: default package */
/* loaded from: classes2.dex */
public class aei {
    private static String b = "AudioTypeControlModel";
    Handler a;
    private volatile int c;
    private int d;
    private boolean e;
    private SparseArray<aek> f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioTypeControlModel.java */
    /* renamed from: aei$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aei a = new aei();
    }

    public static aei a() {
        return a.a;
    }

    private aei() {
        this.c = -1;
        this.d = -1;
        this.e = false;
        this.f = new SparseArray<>();
        j();
    }

    private void j() {
        HandlerThread handlerThread = new HandlerThread("xiaopengmusic-player");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public void a(int i, aek aekVar) {
        this.f.put(i, aekVar);
    }

    public void a(int i) {
        boolean z;
        MusicInfo musicInfo;
        if (i == this.c) {
            return;
        }
        LogUtils.i(b, "changeAudioType:newAudioType=" + i + " mAudioType=" + this.c);
        this.d = this.c;
        this.c = i;
        aek aekVar = null;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            int keyAt = this.f.keyAt(i2);
            aek aekVar2 = this.f.get(keyAt);
            if (keyAt == i) {
                aekVar2.register();
                aekVar = aekVar2;
            } else if (this.d != -1) {
                aekVar2.unregister();
                boolean z2 = true;
                if (keyAt == 2) {
                    z = this.d == 2;
                    LogUtils.d(b, "old:" + this.d + ", new:" + this.c + ", shouldPause:" + z);
                } else {
                    z = true;
                }
                if ((keyAt == 0 && (musicInfo = (MusicInfo) aekVar2.d()) != null && musicInfo.getMusicFrom() == 61) ? false : false) {
                    aekVar2.stop();
                } else if (z) {
                    aekVar2.pause();
                }
            }
        }
        ay.a("msg_type", i);
        u.c(new agg.g(i, this.d));
        if (aekVar != null) {
            Log.i(b, "changeAudioTypeInternal: " + aekVar.getPlayState());
            u.f(new age.l(i, aekVar.getPlayState()));
        }
    }

    public void b(final int i) {
        String str = b;
        LogUtils.d(str, "changeAudioType to:" + i, new Throwable());
        ban.g(new Runnable() { // from class: aei.1
            @Override // java.lang.Runnable
            public void run() {
                aei.this.a(i);
            }
        });
    }

    public void b() {
        MediaCenterModel.getInstance().dealPlayState(new age.l(this.c, 3));
        int i = this.d;
        if (i == -1) {
            b(0);
        } else {
            b(i);
        }
    }

    public synchronized int c() {
        return this.c;
    }

    public synchronized int d() {
        if (this.e) {
            return this.c;
        }
        return ay.b("msg_type", -1);
    }

    public void a(boolean z) {
        String str = b;
        Log.i(str, "rebootPlay: " + com.xiaopeng.musicradio.model.car.a.a().f() + " pm = " + bf.c() + " shouldPlay = " + z);
        if (!bf.c() || !com.xiaopeng.musicradio.model.car.a.a().f()) {
            LogUtils.e(b, "want to rebootPlay,but pm is not normal");
            return;
        }
        String str2 = b;
        LogUtils.i(str2, "rebootPlay: + " + this.e);
        if (!ay.f("music_cache_url_start")) {
            ay.a("music_cache_url_start", System.currentTimeMillis());
        }
        long c = ay.c("music_cache_url_start");
        if (!ay.f("music_cache_url_invalid") && System.currentTimeMillis() - c > 604800000) {
            ay.a("music_cache_url_invalid", true);
            afk.a().b();
        }
        if (this.e) {
            return;
        }
        int b2 = ay.b("msg_type", -1);
        String str3 = b;
        LogUtils.i(str3, "msgType=" + b2);
        if (com.xiaopeng.musicradio.model.car.a.a().f()) {
            this.e = true;
            aek aekVar = this.f.get(b2);
            if (aekVar != null) {
                aekVar.rebootPlay(z);
            } else {
                LogUtils.i(b, "skip rebootplay as control model is null");
            }
        } else {
            LogUtils.i(b, "skip rebootplay as ig off");
        }
        u.c(new agg.e());
    }

    public aek c(int i) {
        return this.f.get(i);
    }

    public aek e() {
        return c(c());
    }

    public boolean f() {
        return this.e;
    }

    public void g() {
        Log.i(b, "stopAllMedia: ");
        ags.a().l();
        b(-1);
        for (int i = 0; i < this.f.size(); i++) {
            aek valueAt = this.f.valueAt(i);
            valueAt.unregister();
            valueAt.e();
            valueAt.setVolume(1.0f);
        }
    }

    public void h() {
        aek aekVar = this.f.get(this.c);
        if (aekVar != null) {
            aekVar.b();
        }
    }

    public void i() {
        aek aekVar = this.f.get(this.c);
        if (aekVar != null) {
            aekVar.a();
        }
    }
}
