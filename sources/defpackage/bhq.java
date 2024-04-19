package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import defpackage.bep;
import defpackage.bey;
/* compiled from: WindowEngineProxy.java */
/* renamed from: bhq  reason: default package */
/* loaded from: classes2.dex */
public class bhq extends bey.a implements bep.a {
    private bey a;
    private b<bey> b = new b<>("WindowEngineProxy");

    @Override // defpackage.bey
    public int b() {
        bey beyVar = this.a;
        if (beyVar != null) {
            try {
                return beyVar.b();
            } catch (RemoteException e) {
                c.c("WindowEngineProxy", e.getMessage());
                return 0;
            }
        }
        return 0;
    }

    @Override // defpackage.bey
    public boolean a(int i) {
        bey beyVar = this.a;
        if (beyVar != null) {
            try {
                return beyVar.a(i);
            } catch (RemoteException e) {
                c.c("WindowEngineProxy", e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bey
    public void b(int i) {
        bey beyVar = this.a;
        if (beyVar != null) {
            try {
                beyVar.b(i);
            } catch (RemoteException e) {
                c.c("WindowEngineProxy", e.getMessage());
            }
        }
    }

    @Override // defpackage.bey
    public void c(final int i) {
        this.b.a((b<bey>) new b.a<bey, Object>() { // from class: bhq.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bey beyVar) {
                beyVar.c(i);
                return null;
            }
        });
    }

    @Override // defpackage.bey
    public void d(final int i) {
        this.b.a((b<bey>) new b.a<bey, Object>() { // from class: bhq.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bey beyVar) {
                beyVar.d(i);
                return null;
            }
        });
    }

    @Override // defpackage.bey
    public void a(int i, boolean z) {
        bey beyVar = this.a;
        if (beyVar != null) {
            try {
                beyVar.a(i, z);
            } catch (RemoteException e) {
                c.c("WindowEngineProxy", e.getMessage());
            }
        }
    }

    @Override // defpackage.bey
    public void a(final int i, final int i2) {
        this.b.a((b<bey>) new b.a<bey, Object>() { // from class: bhq.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bey beyVar) {
                beyVar.a(i, i2);
                return null;
            }
        });
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        if (bewVar != null) {
            try {
                this.a = bewVar.l();
                this.b.c(this.a);
                this.b.b();
            } catch (RemoteException e) {
                c.c("WindowEngineProxy", e.getMessage());
            }
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.b.c(null);
        this.a = null;
    }
}
