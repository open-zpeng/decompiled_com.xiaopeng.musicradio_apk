package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.xiaopeng.speech.common.bean.SliceData;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfr;
/* compiled from: AgentProxy.java */
/* renamed from: bhd  reason: default package */
/* loaded from: classes2.dex */
public class bhd extends bfr.a implements bep.a {
    private volatile bfr b;
    private b<bfr> a = new b<>("AgentProxy");
    private final String c = "AgentProxy";

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            bfr e = bewVar.e();
            this.b = e;
            this.a.c(e);
            this.a.b();
        } catch (RemoteException e2) {
            c.a(this, "onConnect exception ", e2);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.b = null;
        this.a.c(null);
    }

    @Override // defpackage.bfr
    public void a(final String str) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(str);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final String str2) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.12
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void b(final String str, final String str2) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.23
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.b(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void b(final String str) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.26
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.b(str);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final String str2, final String str3, final String str4) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.27
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(str, str2, str3, str4);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final String[] strArr, final boolean z) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.28
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(str, strArr, z);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void c(final String str, final String str2) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.29
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.c(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    @Deprecated
    public void a(final boolean z) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.30
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(z);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    @Deprecated
    public boolean b() {
        return ((Boolean) this.a.a(new b.a<bfr, Boolean>() { // from class: bhd.31
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfr bfrVar) {
                return Boolean.valueOf(bfrVar.b());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfr
    public void c(final String str) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.c(str);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    @Deprecated
    public boolean c() {
        return ((Boolean) this.a.a(new b.a<bfr, Boolean>() { // from class: bhd.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfr bfrVar) {
                return Boolean.valueOf(bfrVar.c());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfr
    @Deprecated
    public void b(final boolean z) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.b(z);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void c(final boolean z) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.c(z);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public boolean d() {
        return ((Boolean) this.a.a(new b.a<bfr, Boolean>() { // from class: bhd.6
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfr bfrVar) {
                return Boolean.valueOf(bfrVar.d());
            }
        }, false)).booleanValue();
    }

    public void a(e eVar) {
        this.a.a(eVar);
    }

    @Override // defpackage.bfr
    public void d(final String str) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.7
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.d(str);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void d(final String str, final String str2) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.8
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.d(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final IBinder iBinder, final boolean z) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.9
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.a(iBinder, z);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public boolean e() {
        bfr bfrVar = this.b;
        if (bfrVar != null) {
            try {
                return bfrVar.e();
            } catch (Throwable th) {
                c.a("AgentProxy", "remote error: ", th);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bfr
    public String e(final String str) {
        return (String) this.a.a(new b.a<bfr, String>() { // from class: bhd.10
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                return bfrVar.e(str);
            }
        }, "");
    }

    @Override // defpackage.bfr
    public String f(final String str) {
        return (String) this.a.a(new b.a<bfr, String>() { // from class: bhd.11
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                return bfrVar.f(str);
            }
        }, "");
    }

    @Override // defpackage.bfr
    public void g(final String str) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.13
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.g(str);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public String h(final String str) {
        return (String) this.a.a(new b.a<bfr, String>() { // from class: bhd.14
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                return bfrVar.h(str);
            }
        }, "");
    }

    @Override // defpackage.bfr
    public void e(final String str, final String str2) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.15
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.e(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final int i, final String str) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.16
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(i, str);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void f(final String str, final String str2) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.17
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.f(str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public String g(final String str, final String str2) {
        return (String) this.a.a(new b.a<bfr, String>() { // from class: bhd.18
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                return bfrVar.g(str, str2);
            }
        }, "");
    }

    @Override // defpackage.bfr
    public void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.19
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.a(str, str2, str3, str4, str5);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final int i) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.20
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.a(str, i);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final String str2, final int i) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.21
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.a(str, str2, i);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final SliceData sliceData, final int i) {
        this.a.a((b<bfr>) new b.a<bfr, String>() { // from class: bhd.22
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfr bfrVar) {
                bfrVar.a(str, sliceData, i);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final IBinder iBinder, final String str, final String str2, final String str3, final String str4) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.24
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(iBinder, str, str2, str3, str4);
                return null;
            }
        });
    }

    @Override // defpackage.bfr
    public void a(final String str, final String str2, final bfw bfwVar) {
        this.a.a((b<bfr>) new b.a<bfr, Object>() { // from class: bhd.25
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfr bfrVar) {
                bfrVar.a(str, str2, bfwVar);
                return null;
            }
        });
    }
}
