package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfu;
/* compiled from: HotwordEngineProxy.java */
/* renamed from: bhg  reason: default package */
/* loaded from: classes2.dex */
public class bhg extends bfu.a implements bep.a {
    private b<bfu> a = new b<>("HotwordEngineProxy");
    private bfu b;

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            if (bewVar.n() != null) {
                this.b = bewVar.n();
                this.a.c(this.b);
                this.a.b();
            } else {
                c.c("HotwordEngineProxy", "mHotwordEngine = null");
            }
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
        this.b = null;
    }

    @Override // defpackage.bfu
    public void a(String str) {
        c.a("abandoned function: enjectHotwords.");
    }

    @Override // defpackage.bfu
    public void b() {
        c.a("abandoned function: removeHotwords.");
    }

    @Override // defpackage.bfu
    public int c() {
        bfu bfuVar = this.b;
        if (bfuVar != null) {
            try {
                return bfuVar.c();
            } catch (RemoteException e) {
                e.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    public void a(e eVar) {
        this.a.a(eVar);
    }

    @Override // defpackage.bfu
    public void b(final String str) {
        this.a.a((b<bfu>) new b.a<bfu, Object>() { // from class: bhg.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfu bfuVar) {
                bfuVar.b(str);
                return null;
            }
        });
    }

    @Override // defpackage.bfu
    public void a(final String str, final String str2) {
        this.a.a((b<bfu>) new b.a<bfu, Object>() { // from class: bhg.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfu bfuVar) {
                bfuVar.a(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfu
    public void a(final String str, final String str2, final IBinder iBinder) {
        this.a.a((b<bfu>) new b.a<bfu, Object>() { // from class: bhg.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfu bfuVar) {
                bfuVar.a(str, str2, iBinder);
                return null;
            }
        });
    }
}
