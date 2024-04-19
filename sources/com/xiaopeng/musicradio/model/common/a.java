package com.xiaopeng.musicradio.model.common;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.KeepLiveService;
import com.xiaopeng.musicradio.common.e;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.utils.ah;
import com.xiaopeng.musicradio.utils.ar;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.bf;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import defpackage.age;
import defpackage.agg;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: AppLogic.java */
/* loaded from: classes.dex */
public class a {
    private Context a;
    private int b;
    private AudioManager c;
    private ComponentName d;
    private MediaSession e;
    private Handler f = new Handler(new Handler.Callback() { // from class: com.xiaopeng.musicradio.model.common.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            if (bf.c()) {
                a.a(a.this);
                if (a.this.b < 10) {
                    a.this.f.sendEmptyMessageDelayed(1, 1000L);
                }
            } else {
                Log.i("AppLogic", "handleMessage: stop musicservice");
                a.this.e();
            }
            return true;
        }
    });
    private boolean g = false;
    private ContentObserver h = new ContentObserver(new Handler()) { // from class: com.xiaopeng.musicradio.model.common.a.7
        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            u.c(new agg.i());
        }
    };

    /* compiled from: AppLogic.java */
    /* renamed from: com.xiaopeng.musicradio.model.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0141a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* compiled from: AppLogic.java */
    /* loaded from: classes.dex */
    private static class b {
        static final a a = new a();
    }

    static /* synthetic */ int a(a aVar) {
        int i = aVar.b;
        aVar.b = i + 1;
        return i;
    }

    public static a a() {
        return b.a;
    }

    public a() {
        Log.i("AppLogic", "AppLogic: ===========");
        this.a = com.xiaopeng.musicradio.a.a;
        u.a(this);
        b();
    }

    private void b() {
        c();
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.model.common.a.2
            @Override // java.lang.Runnable
            public void run() {
                aov.a().b();
            }
        }, 2000L);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.common.a.3
            @Override // java.lang.Runnable
            public void run() {
                aou.a().b();
            }
        });
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.common.a.4
            @Override // java.lang.Runnable
            public void run() {
                com.xiaopeng.musicradio.model.bluetooth.a.i();
                l.c();
            }
        });
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.common.a.5
            @Override // java.lang.Runnable
            public void run() {
                agr.a();
            }
        });
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.common.a.6
            @Override // java.lang.Runnable
            public void run() {
                e.b().a();
            }
        });
        d();
    }

    private void c() {
        this.c = (AudioManager) this.a.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.d = new ComponentName(this.a, C0141a.class);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(this.d);
        PendingIntent broadcast = PendingIntent.getBroadcast(com.xiaopeng.musicradio.a.a, 0, intent, 0);
        Context context = this.a;
        this.e = new MediaSession(context, "MediaSessionHelper-" + broadcast.getCreatorPackage());
        this.e.setActive(true);
        this.e.setFlags(1);
        this.e.setMediaButtonReceiver(broadcast);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if (!this.g && w.f() == 2) {
            Log.i("AppLogic", "dealPlayState: ========");
            if (lVar.a() == 2 || lVar.a() == 1) {
                this.g = true;
                KeepLiveService.a(com.xiaopeng.musicradio.a.a);
            }
        }
        a(lVar.a());
    }

    private void a(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 6;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 7;
                break;
            default:
                i2 = 0;
                break;
        }
        this.e.setPlaybackState(new PlaybackState.Builder().setState(i2, aei.a().e() != null ? aei.a().e().getPosition() : 0, 1.0f).build());
    }

    private void d() {
        this.a.getContentResolver().registerContentObserver(Settings.System.getUriFor("XpMainDriverMode"), true, this.h);
    }

    public void a(String str) {
        LogUtils.i("AppLogic", "receive -》" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("com.xiaopeng.MUSIC_REPLAY")) {
            if (this.f.hasMessages(1)) {
                this.f.removeMessages(1);
                f();
            }
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.model.common.a.8
                @Override // java.lang.Runnable
                public void run() {
                    aei.a().a(false);
                }
            }, 2000L);
        } else if (str.equals("com.xiaopeng.MUSIC_EXIT")) {
            if (aei.a().c() == 3) {
                axn.i().q();
            }
            aek e = aei.a().e();
            if (e != null && e.getPlayState() == 2 && aei.a().c() != 2 && aei.a().c() != 4) {
                bci.b();
            }
            try {
                ar.c(axn.i().r());
            } catch (Exception e2) {
                LogUtils.i("AppLogic", "error = %s", e2.toString());
            }
            ah.b(apk.i().u());
            ah.c();
            this.f.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtils.i("AppLogic", "killSelf: ");
        aw.a((ActivityManager) this.a.getSystemService("activity"), "forceStopPackage", String.class, "com.xiaopeng.musicradio");
    }

    private void f() {
        Log.i("AppLogic", "killSelfAndRestart() called");
        com.xiaopeng.musicradio.utils.a.a().b();
        PendingIntent broadcast = PendingIntent.getBroadcast(com.xiaopeng.musicradio.a.a, 1, new Intent("com.xiaopeng.ACTION_KEEP_ALIVE"), 134217728);
        AlarmManager alarmManager = (AlarmManager) com.xiaopeng.musicradio.a.a.getSystemService("alarm");
        if (alarmManager != null) {
            alarmManager.set(1, System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L), broadcast);
        }
        System.exit(0);
    }
}
