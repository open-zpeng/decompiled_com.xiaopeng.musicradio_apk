package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfx;
/* compiled from: SubscriberProxy.java */
/* renamed from: bhm  reason: default package */
/* loaded from: classes2.dex */
public class bhm extends bfx.a implements bep.a {
    private b<bfx> a = new b<>("SubscriberProxy");

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a.c(bewVar.b());
            this.a.b();
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
    }

    @Override // defpackage.bfx
    public void a(final String[] strArr, final bft bftVar) {
        this.a.a((b<bfx>) new b.a<bfx, Object>() { // from class: bhm.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfx bfxVar) {
                bfxVar.a(strArr, bftVar);
                return null;
            }
        });
    }

    @Override // defpackage.bfx
    public void a(final bft bftVar) {
        this.a.a((b<bfx>) new b.a<bfx, Object>() { // from class: bhm.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfx bfxVar) {
                bfxVar.a(bftVar);
                return null;
            }
        });
    }

    @Override // defpackage.bfx
    public boolean a(final String str) {
        return ((Boolean) this.a.a(new b.a<bfx, Boolean>() { // from class: bhm.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfx bfxVar) {
                return Boolean.valueOf(bfxVar.a(str));
            }
        }, false)).booleanValue();
    }

    public void a(e eVar) {
        this.a.a(eVar);
    }
}
