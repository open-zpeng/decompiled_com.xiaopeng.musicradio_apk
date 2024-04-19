package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfv;
/* compiled from: RecordEngineProxy.java */
/* renamed from: bhj  reason: default package */
/* loaded from: classes2.dex */
public class bhj extends bfv.a implements bep.a {
    private b<bfv> a = new b<>("RecordEngineProxy");

    public void a(e eVar) {
        this.a.a(eVar);
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a.c(bewVar.k());
            this.a.b();
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
    }

    @Override // defpackage.bfv
    public void a(final String str, final int i, final int i2) {
        this.a.a((b<bfv>) new b.a<bfv, Object>() { // from class: bhj.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfv bfvVar) {
                bfvVar.a(str, i, i2);
                return null;
            }
        });
    }

    @Override // defpackage.bfv
    public void b() {
        this.a.a((b<bfv>) new b.a<bfv, Object>() { // from class: bhj.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfv bfvVar) {
                bfvVar.b();
                return null;
            }
        });
    }

    @Override // defpackage.bfv
    public void a(final String str, final String str2) {
        this.a.a((b<bfv>) new b.a<bfv, String>() { // from class: bhj.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfv bfvVar) {
                bfvVar.a(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfv
    public boolean a(final String str, final String str2, final boolean z) {
        return ((Boolean) this.a.a(new b.a<bfv, Boolean>() { // from class: bhj.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfv bfvVar) {
                return Boolean.valueOf(bfvVar.a(str, str2, z));
            }
        }, false)).booleanValue();
    }
}
