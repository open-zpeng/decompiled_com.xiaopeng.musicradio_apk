package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfq;
/* compiled from: ASREngineProxy.java */
/* renamed from: bhc  reason: default package */
/* loaded from: classes2.dex */
public class bhc extends bfq.a implements bep.a {
    private b<bfq> a = new b<>("ASREngineProxy");

    public void a(e eVar) {
        this.a.a(eVar);
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a.c(bewVar.i());
            this.a.b();
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
    }

    @Override // defpackage.bfq
    public void a(final boolean z) {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.a(z);
                return null;
            }
        });
    }

    @Override // defpackage.bfq
    public boolean b() {
        return ((Boolean) this.a.a(new b.a<bfq, Boolean>() { // from class: bhc.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfq bfqVar) {
                return Boolean.valueOf(bfqVar.b());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfq
    public boolean c() {
        return ((Boolean) this.a.a(new b.a<bfq, Boolean>() { // from class: bhc.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfq bfqVar) {
                return Boolean.valueOf(bfqVar.c());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfq
    public void b(final boolean z) {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.b(z);
                return null;
            }
        });
    }

    @Override // defpackage.bfq
    public void d() {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.d();
                return null;
            }
        });
    }

    @Override // defpackage.bfq
    public void e() {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.6
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.e();
                return null;
            }
        });
    }

    @Override // defpackage.bfq
    public void f() {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.7
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.f();
                return null;
            }
        });
    }

    @Override // defpackage.bfq
    public void a(final long j) {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.8
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.a(j);
                return null;
            }
        });
    }

    @Override // defpackage.bfq
    public void b(final long j) {
        this.a.a((b<bfq>) new b.a<bfq, Object>() { // from class: bhc.9
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfq bfqVar) {
                bfqVar.b(j);
                return null;
            }
        });
    }
}
