package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.UserHandle;
import com.xiaopeng.lib.utils.config.RemoteControlConfig;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.d;
import com.xiaopeng.speech.common.util.e;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.bew;
import java.util.Random;
/* compiled from: ConnectManager.java */
/* renamed from: bep  reason: default package */
/* loaded from: classes2.dex */
public class bep extends BroadcastReceiver implements ServiceConnection {
    private volatile bew b;
    private Context c;
    private e e;
    private d<a> d = new d<>();
    private Runnable f = new Runnable() { // from class: bep.5
        @Override // java.lang.Runnable
        public void run() {
            bep.this.b();
        }
    };
    private Random a = new Random();

    /* compiled from: ConnectManager.java */
    /* renamed from: bep$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(bew bewVar);
    }

    public bep(Context context) {
        this.c = context;
    }

    public void a(e eVar) {
        this.a = new Random();
        this.e = eVar;
    }

    public void a() {
        if (this.c == null) {
            return;
        }
        c.b("ConnectManager", "registerReceiver");
        this.c.registerReceiver(this, new IntentFilter(VuiConstants.INTENT_ACTION_CARSPEECH_START));
    }

    public void b() {
        this.e.a(new Runnable() { // from class: bep.1
            @Override // java.lang.Runnable
            public void run() {
                c.a("connect ");
                if (bep.this.b != null) {
                    c.a("connected,return");
                    return;
                }
                Intent intent = new Intent("carspeechservice.SpeechServer");
                intent.setPackage("com.xiaopeng.carspeechservice");
                bep.this.c.bindServiceAsUser(intent, bep.this, 1, UserHandle.CURRENT);
            }
        });
    }

    public void a(a aVar) {
        this.d.a(aVar);
    }

    private void a(IBinder iBinder) {
        c.a("queryBinder");
        this.b = bew.a.a(iBinder);
        if (this.b == null) {
            c.b("mSpeechEngine == null");
        } else {
            this.e.a(new Runnable() { // from class: bep.2
                @Override // java.lang.Runnable
                public void run() {
                    Object[] a2 = bep.this.d.a();
                    if (a2 != null) {
                        for (Object obj : a2) {
                            if (bep.this.b != null) {
                                ((a) obj).a(bep.this.b);
                            }
                        }
                    }
                    bgr.c().a();
                }
            });
        }
    }

    private void c() {
        c.b("SpeechProxy binderDied");
        this.b = null;
        this.e.a(new Runnable() { // from class: bep.3
            @Override // java.lang.Runnable
            public void run() {
                Object[] a2 = bep.this.d.a();
                if (a2 != null) {
                    for (Object obj : a2) {
                        ((a) obj).a();
                    }
                }
                bgr.c().b();
                bep.this.d();
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        c();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(VuiConstants.INTENT_ACTION_CARSPEECH_START)) {
            c.a("onReceive SPEECH_SERVER_ACTION_START");
            if (this.b == null) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.e.a(new Runnable() { // from class: bep.4
            @Override // java.lang.Runnable
            public void run() {
                long a2 = bep.this.a(1500, RemoteControlConfig.SERVICE_TYPE_TRANSPORT_MODE_BEGIN);
                bep.this.e.removeCallbacks(bep.this.f);
                bep.this.e.postDelayed(bep.this.f, a2);
                c.b(this, "reconnect delay:%d", Long.valueOf(a2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(int i, int i2) {
        return i >= i2 ? i : (int) ((this.a.nextFloat() * (i2 - i)) + i);
    }
}
