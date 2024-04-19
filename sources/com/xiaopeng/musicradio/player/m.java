package com.xiaopeng.musicradio.player;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.xiaopeng.musicradio.player.c;
import com.xiaopeng.musicradio.player.e;
import com.xiaopeng.musicradio.player.k;
/* compiled from: PlayerClient.java */
/* loaded from: classes2.dex */
public class m implements ServiceConnection {
    private e a;
    private int d;
    private SparseArray<n> b = new SparseArray<>();
    private IBinder.DeathRecipient e = new IBinder.DeathRecipient() { // from class: com.xiaopeng.musicradio.player.m.7
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            Log.i("PlayerClient", "binderDied: mPlayerInterface = " + m.this.a);
            if (m.this.a == null) {
                return;
            }
            m.this.a.asBinder().unlinkToDeath(m.this.e, 0);
            m.this.a = null;
            if (com.xiaopeng.musicradio.utils.c.f(com.xiaopeng.musicradio.a.a)) {
                m.this.b();
            }
        }
    };
    private c f = new c.a() { // from class: com.xiaopeng.musicradio.player.m.8
        @Override // com.xiaopeng.musicradio.player.c
        public void a(int i, String str, int i2) {
            Log.i("PlayerClient", "onPlayState: type = " + i + " playState = " + i2);
            l n = m.this.n(i);
            if (n != null) {
                Log.i("PlayerClient", "enter onPlayState: type = " + i + " playState = " + i2);
                n.playState(str, i2);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c
        public void b(int i, String str, int i2) {
            Log.d("PlayerClient", "onPlayError: type = " + i + " errorCode = " + i2);
            l n = m.this.n(i);
            if (n != null) {
                n.onPlayError(str, i2);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c
        public void a(int i, String str, int i2, int i3) {
            l n = m.this.n(i);
            if (n != null) {
                n.onPlayPosition(str, i2, i3);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c
        public void a(int i, String str, boolean z) {
            Log.d("PlayerClient", "onLoadingChange: " + i + " isLoading = " + z);
            l n = m.this.n(i);
            if (n != null) {
                n.loadingChange(str, z);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c
        public void a(int i, String str) {
            Log.d("PlayerClient", "onTimeLineChange: " + i);
            l n = m.this.n(i);
            if (n != null) {
                n.onTimeLineChange(str);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c
        public void a(int i, String str, String str2, long j) {
            l n = m.this.n(i);
            if (n != null) {
                n.onDownloaded(str, str2, j);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c
        public void a(int i, String str, Bundle bundle) {
            Log.d("PlayerClient", "onSetData: type = " + i);
            l n = m.this.n(i);
            if (n != null) {
                n.onSetData(str, bundle);
            }
        }

        @Override // com.xiaopeng.musicradio.player.c.a, android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                return super.onTransact(i, parcel, parcel2, i2);
            } catch (Exception e) {
                Log.e("PlayerClient", "onTransact: ", e);
                throw e;
            }
        }
    };
    private k c = new k();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerClient.java */
    /* loaded from: classes2.dex */
    public static class a {
        static final m a = new m();
    }

    public static m a() {
        return a.a;
    }

    public void b() {
        Log.i("PlayerClient", "startService: ");
        com.xiaopeng.musicradio.a.a.bindService(new Intent(com.xiaopeng.musicradio.a.a, PlayerService.class), this, 1);
    }

    public void a(int i, n nVar) {
        this.b.put(i, nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i) {
        this.d = i;
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.1
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(final int i) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.9
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.c(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i, final String str) {
        this.d = i;
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.10
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                Log.d("PlayerClient", "prepare: uri = " + str);
                m.this.a.a(i, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i, final String str, final boolean z) {
        this.d = i;
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.11
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.a(i, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i, final String str, final boolean z, final boolean z2) {
        this.d = i;
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.12
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.a(i, str, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i, final String str, final boolean z, final boolean z2, final boolean z3) {
        this.d = i;
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.13
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                Log.d("PlayerClient", "preparePlayWhenReady: url = " + str);
                m.this.a.a(i, str, z, z2, z3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i, final int i2) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.14
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.a(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i, final float f, final float f2) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.15
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.a(i, f, f2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final int i) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.16
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.b(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(final int i) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.2
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.d(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(final int i) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.3
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.e(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(final int i) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.4
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.f(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.g(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "isIdle error = ", e);
            }
        }
        Log.i("PlayerClient", "isIdle: ");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i, String str) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.b(i, str);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "isCacheComplete error = ", e);
            }
        }
        Log.i("PlayerClient", "isCacheComplete: ");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final int i, final String str) {
        a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.5
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                m.this.a.c(i, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.h(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "getCurrentPosition error = ", e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.i(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "getSecondPosition error = ", e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.j(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "isPlaying error = ", e);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.k(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "getDuration error = ", e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.l(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "getPlaybackState error = ", e);
            }
        }
        Log.i("PlayerClient", "getPlaybackState: ");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                return eVar.m(i);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "getPlaybackState error = ", e);
            }
        }
        Log.i("PlayerClient", "getPlaybackState: ");
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, Bundle bundle) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                eVar.a(i, bundle);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "setData error = ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f) {
        e eVar = this.a;
        if (eVar != null) {
            try {
                eVar.a(i, f);
            } catch (RemoteException e) {
                Log.i("PlayerClient", "setData error = ", e);
            }
        }
    }

    private void a(final k.a aVar) {
        this.c.a(new k.a() { // from class: com.xiaopeng.musicradio.player.m.6
            @Override // com.xiaopeng.musicradio.player.k.a
            public void a() {
                if (m.this.a == null) {
                    m.this.b();
                } else {
                    aVar.a();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("PlayerClient", "onServiceConnected: ");
        this.a = e.a.a(iBinder);
        e eVar = this.a;
        if (eVar != null) {
            try {
                eVar.asBinder().linkToDeath(this.e, 0);
                this.a.a(this.f);
                c();
            } catch (RemoteException e) {
                Log.i("PlayerClient", "onServiceConnected: e = ", e);
            }
        }
    }

    private void c() {
        for (int i = 0; i < this.b.size(); i++) {
            int keyAt = this.b.keyAt(i);
            n nVar = this.b.get(keyAt);
            Log.i("PlayerClient", "recoveryPlayerData: type = " + keyAt + " start = " + nVar.a() + " state = " + nVar.f() + " pos = " + nVar.b());
            if (nVar != null && nVar.a()) {
                if (this.d == keyAt && (nVar.f() == 2 || nVar.f() == 1)) {
                    a(keyAt, nVar.g(), false, true, true);
                } else {
                    a(keyAt, nVar.g(), false, true, false);
                }
                a(keyAt, nVar.b());
                if (nVar.c() > 0.0f) {
                    a(keyAt, nVar.c());
                }
                a(keyAt, nVar.d(), nVar.e());
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("PlayerClient", "onServiceDisconnected: ");
        this.a = null;
        if (com.xiaopeng.musicradio.utils.c.f(com.xiaopeng.musicradio.a.a)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l n(int i) {
        return this.b.get(i);
    }
}
