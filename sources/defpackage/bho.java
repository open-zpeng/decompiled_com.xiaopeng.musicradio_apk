package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bga;
/* compiled from: VADEngineProxy.java */
/* renamed from: bho  reason: default package */
/* loaded from: classes2.dex */
public class bho extends bga.a implements bep.a {
    private b<bga> a = new b<>("VADEngineProxy");

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a.c(bewVar.p());
            this.a.b();
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
    }

    @Override // defpackage.bga
    public void a(final String str) {
        this.a.a((b<bga>) new b.a<bga, Object>() { // from class: bho.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bga bgaVar) {
                bgaVar.a(str);
                return null;
            }
        });
    }

    @Override // defpackage.bga
    public void b() {
        this.a.a((b<bga>) new b.a<bga, Object>() { // from class: bho.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bga bgaVar) {
                bgaVar.b();
                return null;
            }
        });
    }

    @Override // defpackage.bga
    public void c() {
        this.a.a((b<bga>) new b.a<bga, Object>() { // from class: bho.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bga bgaVar) {
                bgaVar.c();
                return null;
            }
        });
    }

    public void a(e eVar) {
        this.a.a(eVar);
    }
}
