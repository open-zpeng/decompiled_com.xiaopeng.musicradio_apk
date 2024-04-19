package defpackage;

import android.os.RemoteException;
import defpackage.bep;
import defpackage.bev;
/* compiled from: SoundLockStateProxy.java */
/* renamed from: bhk  reason: default package */
/* loaded from: classes2.dex */
public class bhk extends bev.a implements bep.a {
    private bev a;

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a = bewVar.h();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a = null;
    }

    @Override // defpackage.bev
    public int b() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.b();
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bev
    public void a(int i) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.a(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public void b(int i) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.b(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public int c() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.c();
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bev
    public boolean d() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.d();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bev
    public void a(boolean z) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.a(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public void b(boolean z) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.b(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public boolean e() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.e();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bev
    public int f() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.f();
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bev
    public void a(int i, int i2) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.a(i, i2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public void c(int i) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.c(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public int g() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.g();
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bev
    public void a(int i, long j, int i2) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.a(i, j, i2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public void c(boolean z) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.c(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public boolean h() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.h();
            } catch (RemoteException e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.bev
    public void d(int i) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.d(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public void e(int i) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.e(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public void f(int i) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.f(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public int i() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.i();
            } catch (RemoteException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bev
    public void d(boolean z) {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.d(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // defpackage.bev
    public boolean j() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                return bevVar.j();
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bev
    public void k() {
        bev bevVar = this.a;
        if (bevVar != null) {
            try {
                bevVar.k();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
