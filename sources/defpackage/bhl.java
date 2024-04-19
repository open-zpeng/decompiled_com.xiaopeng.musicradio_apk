package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import defpackage.bep;
import defpackage.bex;
/* compiled from: SpeechStateProxy.java */
/* renamed from: bhl  reason: default package */
/* loaded from: classes2.dex */
public class bhl extends bex.a implements bep.a {
    private bex a;
    private b<bex> b = new b<>("SpeechStateProxy");

    @Override // defpackage.bex
    public boolean b() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.b();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public void a(final int i) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.a(i);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public void a(final IBinder iBinder, final int i) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.a(iBinder, i);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public int c() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.c();
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bex
    public void a(final boolean z) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.a(z);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public boolean d() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.d();
            } catch (RemoteException e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            if (bewVar.g() != null) {
                this.a = bewVar.g();
                this.b.c(this.a);
                this.b.b();
            } else {
                c.c("SpeechStateProxy", "isInitOK false, speechEngine.getSpeechState() = null");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.b.c(null);
        this.a = null;
    }

    @Override // defpackage.bex
    public void b(final int i) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.b(i);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public int e() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.e();
            } catch (RemoteException e) {
                e.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    @Override // defpackage.bex
    public void b(final boolean z) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.b(z);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public boolean f() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.f();
            } catch (RemoteException e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.bex
    public boolean g() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.g();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public void a(final String str) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.6
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.a(str);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public String h() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.h();
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.bex
    public void a(final int i, final boolean z) {
        this.b.a((b<bex>) new b.a<bex, Object>() { // from class: bhl.7
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bex bexVar) {
                bexVar.a(i, z);
                return null;
            }
        });
    }

    @Override // defpackage.bex
    public boolean c(int i) {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.c(i);
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public boolean i() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.i();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public boolean j() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.j();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public boolean k() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.k();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public boolean l() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.l();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bex
    public boolean m() {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.m();
            } catch (RemoteException e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.bex
    public String b(String str) {
        bex bexVar = this.a;
        if (bexVar != null) {
            try {
                return bexVar.b(str);
            } catch (RemoteException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
