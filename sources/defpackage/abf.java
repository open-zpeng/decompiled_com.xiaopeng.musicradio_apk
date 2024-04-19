package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.nforetek.bt.aidl.l;
import java.util.LinkedList;
import java.util.List;
/* compiled from: BtBoxesUtil.java */
/* renamed from: abf  reason: default package */
/* loaded from: classes2.dex */
public class abf {
    private static final String a = "abf";
    private Context b;
    private l c;
    private ServiceConnection e = new ServiceConnection() { // from class: abf.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            abf.this.c = l.a.a(iBinder);
            String str = abf.a;
            Log.i(str, "ready  onServiceConnected from : " + abf.this.c());
            if (abf.this.c != null) {
                try {
                    abf.this.c.asBinder().linkToDeath(abf.this.f, 0);
                    abf.this.a(abf.this.c);
                    return;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return;
                }
            }
            String str2 = abf.a;
            Log.i(str2, "mBtService is null!! from : " + abf.this.c());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            String str = abf.a;
            Log.i(str, " onServiceDisconnected from : " + abf.this.c());
            abf.this.d();
            abf.this.c = null;
        }
    };
    private IBinder.DeathRecipient f = new IBinder.DeathRecipient() { // from class: abf.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            String str = abf.a;
            Log.i(str, "binderDied.nForeService = " + abf.this.c + " from : " + abf.this.c());
            if (abf.this.c == null) {
                return;
            }
            abf.this.c.asBinder().unlinkToDeath(this, 0);
            abf.this.c = null;
            abf.this.a();
        }
    };
    private List<abc> d = new LinkedList();

    public abf(Context context) {
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        Context context = this.b;
        return context == null ? "" : context.getPackageName();
    }

    public void a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.xiaopeng.bt.ui.service", "com.xiaopeng.bt.ui.service.XpBtService"));
        try {
            String str = a;
            Log.d(str, "connectBluetooth " + SystemClock.uptimeMillis() + " from : " + c());
            this.b.bindService(intent, this.e, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l lVar) {
        String str = a;
        Log.d(str, "notifyConnected  from : " + c() + " callback.size = " + this.d.size());
        synchronized (this.d) {
            for (abc abcVar : this.d) {
                abcVar.b(lVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.d) {
            String str = a;
            Log.d(str, "notifyDisconnected from : " + c());
            for (abc abcVar : this.d) {
                abcVar.a();
            }
        }
    }

    public void a(aba abaVar) {
        a(abaVar.d);
    }

    private void a(abc abcVar) {
        synchronized (this.d) {
            this.d.add(abcVar);
            Log.d(a, "mConnectionCallbacks.add");
        }
        String str = a;
        Log.d(str, "registerCallback " + this.c + " from : " + c());
        l lVar = this.c;
        if (lVar != null) {
            abcVar.a(lVar);
        }
    }
}
