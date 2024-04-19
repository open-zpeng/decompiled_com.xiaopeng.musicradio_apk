package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import defpackage.bep;
import defpackage.ber;
/* compiled from: CarSystemPropertyProxy.java */
/* renamed from: bhf  reason: default package */
/* loaded from: classes2.dex */
public class bhf extends ber.a implements bep.a {
    private b<ber> a = new b<>("CarSystemPropertyProxy");

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            c.a("CarSystemPropertyProxy", "onConnect.");
            this.a.c(bewVar.o());
            this.a.b();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        c.a("CarSystemPropertyProxy", "onDisconnect.");
        this.a.c(null);
    }

    @Override // defpackage.ber
    public String b() {
        return (String) this.a.a(new b.a<ber, String>() { // from class: bhf.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(ber berVar) {
                return berVar.b();
            }
        }, "");
    }

    @Override // defpackage.ber
    public String c() {
        return (String) this.a.a(new b.a<ber, String>() { // from class: bhf.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(ber berVar) {
                return berVar.c();
            }
        }, "");
    }
}
