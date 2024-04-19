package com.xiaopeng.musicradio.web;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
/* compiled from: WebServiceConnection.java */
/* loaded from: classes2.dex */
public class a implements ServiceConnection {
    private Messenger a;
    private volatile boolean b;
    private C0180a c;

    private a() {
    }

    public void a(int i, Bundle bundle) {
        if (this.a == null) {
            return;
        }
        Message message = new Message();
        message.what = i;
        message.setData(bundle);
        try {
            this.a.send(message);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.getBinder().unlinkToDeath(this.c, 0);
            this.a = null;
            this.b = false;
            u.b(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a = new Messenger(iBinder);
        this.c = new C0180a();
        try {
            this.a.getBinder().linkToDeath(this.c, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        u.a(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        a();
    }

    @Subscribe
    public void onFocusPlay(agg.j jVar) {
        a(2, null);
    }

    @Subscribe
    public void onPlayStateChanged(age.l lVar) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("audio_type", lVar.b());
        bundle.putInt("play_state", lVar.a());
        a(1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebServiceConnection.java */
    /* renamed from: com.xiaopeng.musicradio.web.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0180a implements IBinder.DeathRecipient {
        private C0180a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            if (a.this.a != null) {
                a.this.a();
            }
        }
    }
}
