package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaopeng.speech.common.bean.DisableInfoBean;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bgb;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: WakeupEngineProxy.java */
/* renamed from: bhp  reason: default package */
/* loaded from: classes2.dex */
public class bhp extends bgb.a implements bep.a {
    private b<bgb> a = new b<>("WakeupEngineProxy");
    private Map<String, DisableInfoBean> b = new ConcurrentHashMap();

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.a.c(bewVar.d());
            this.a.b();
            c.b("WakeupEngineProxy", "reset:   onConnect");
            x();
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a.c(null);
    }

    @Override // defpackage.bgb
    public void b() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.b();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void c() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.12
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.c();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final String str) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.23
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.a(str);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void d() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.34
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.d();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void e() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.45
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.e();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void f() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.47
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.f();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void g() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.48
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.g();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public String[] h() {
        return (String[]) this.a.a(new b.a<bgb, String[]>() { // from class: bhp.49
            @Override // com.xiaopeng.speech.common.util.b.a
            public String[] a(bgb bgbVar) {
                return bgbVar.h();
            }
        }, new String[0]);
    }

    @Override // defpackage.bgb
    public void a(final String str, final String str2, final String str3, final String[] strArr) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.50
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.a(str, str2, str3, strArr);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public String i() {
        return (String) this.a.a(new b.a<bgb, String>() { // from class: bhp.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bgb bgbVar) {
                return bgbVar.i();
            }
        }, null);
    }

    @Override // defpackage.bgb
    public void a(final String[] strArr, final String[] strArr2, final String[] strArr3, final String[] strArr4, final String[] strArr5) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.a(strArr, strArr2, strArr3, strArr4, strArr5);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void j() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.j();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void b(final String[] strArr, final String[] strArr2, final String[] strArr3, final String[] strArr4, final String[] strArr5) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.b(strArr, strArr2, strArr3, strArr4, strArr5);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final String[] strArr) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.6
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.a(strArr);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final String[] strArr, final String[] strArr2, final String[] strArr3) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.7
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.a(strArr, strArr2, strArr3);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void k() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.8
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.k();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void b(final String[] strArr, final String[] strArr2, final String[] strArr3) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.9
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.b(strArr, strArr2, strArr3);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void b(final String[] strArr) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.10
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.b(strArr);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void l() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.11
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.l();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void m() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.13
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.m();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public boolean n() {
        return ((Boolean) this.a.a(new b.a<bgb, Boolean>() { // from class: bhp.14
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bgb bgbVar) {
                return Boolean.valueOf(bgbVar.n());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bgb
    public boolean o() {
        return ((Boolean) this.a.a(new b.a<bgb, Boolean>() { // from class: bhp.15
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bgb bgbVar) {
                return Boolean.valueOf(bgbVar.o());
            }
        }, true)).booleanValue();
    }

    @Override // defpackage.bgb
    public void a(final boolean z) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.16
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.a(z);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.17
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder());
                    return null;
                }
                bgbVar.a(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void b(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.18
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.b(bgbVar.asBinder());
                    return null;
                }
                bgbVar.b(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public boolean p() {
        return ((Boolean) this.a.a(new b.a<bgb, Boolean>() { // from class: bhp.19
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bgb bgbVar) {
                return Boolean.valueOf(bgbVar.p());
            }
        }, true)).booleanValue();
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder, final boolean z) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.20
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder(), z);
                    return null;
                }
                bgbVar.a(iBinder2, z);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public boolean q() {
        return ((Boolean) this.a.a(new b.a<bgb, Boolean>() { // from class: bhp.21
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bgb bgbVar) {
                return Boolean.valueOf(bgbVar.q());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bgb
    public void b(final boolean z) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.22
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.b(z);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void r() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.24
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.r();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void s() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.25
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.s();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public boolean t() {
        return ((Boolean) this.a.a(new b.a<bgb, Boolean>() { // from class: bhp.26
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bgb bgbVar) {
                return Boolean.valueOf(bgbVar.t());
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bgb
    public void c(final boolean z) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.27
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.c(z);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void u() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.28
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.u();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void v() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.29
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.v();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void w() {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.30
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.w();
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void b(final String str) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.31
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.b(str);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void c(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.32
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.c(bgbVar.asBinder());
                    return null;
                }
                bgbVar.c(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void d(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.33
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.d(bgbVar.asBinder());
                    return null;
                }
                bgbVar.d(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void e(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.35
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.e(bgbVar.asBinder());
                    return null;
                }
                bgbVar.e(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void f(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.36
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.f(bgbVar.asBinder());
                    return null;
                }
                bgbVar.f(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void g(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.37
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.g(bgbVar.asBinder());
                    return null;
                }
                bgbVar.g(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void h(final IBinder iBinder) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.38
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.h(bgbVar.asBinder());
                    return null;
                }
                bgbVar.h(iBinder2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void c(final String str) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.39
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                bgbVar.c(str);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder, final int i, final String str, final String str2, final int i2) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.40
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder(), i, str, str2, i2);
                } else {
                    bgbVar.a(iBinder2, i, str, str2, i2);
                }
                bhp bhpVar = bhp.this;
                IBinder iBinder3 = iBinder;
                bhpVar.b(iBinder3 == null ? bgbVar.asBinder() : iBinder3, i, str, str2, i2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder, final int i, final String str, final int i2) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.41
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder(), i, str, i2);
                } else {
                    bgbVar.a(iBinder2, i, str, i2);
                }
                bhp bhpVar = bhp.this;
                IBinder iBinder3 = iBinder;
                if (iBinder3 == null) {
                    iBinder3 = bgbVar.asBinder();
                }
                bhpVar.a(iBinder3, i, str);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder, final String str, final String str2, final int i) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.42
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder(), str, str2, i);
                } else {
                    bgbVar.a(iBinder2, str, str2, i);
                }
                bhp bhpVar = bhp.this;
                IBinder iBinder3 = iBinder;
                bhpVar.b(iBinder3 == null ? bgbVar.asBinder() : iBinder3, -1, str, str2, i);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder, final String str, final int i) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.43
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder(), str, i);
                } else {
                    bgbVar.a(iBinder2, str, i);
                }
                bhp bhpVar = bhp.this;
                IBinder iBinder3 = iBinder;
                if (iBinder3 == null) {
                    iBinder3 = bgbVar.asBinder();
                }
                bhpVar.a(iBinder3, -1, str);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void a(final IBinder iBinder, final String str, final String str2) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.44
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.a(bgbVar.asBinder(), str, str2);
                    return null;
                }
                bgbVar.a(iBinder2, str, str2);
                return null;
            }
        });
    }

    @Override // defpackage.bgb
    public void b(final IBinder iBinder, final String str, final String str2) {
        this.a.a((b<bgb>) new b.a<bgb, Object>() { // from class: bhp.46
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bgb bgbVar) {
                IBinder iBinder2 = iBinder;
                if (iBinder2 == null) {
                    bgbVar.b(bgbVar.asBinder(), str, str2);
                    return null;
                }
                bgbVar.b(iBinder2, str, str2);
                return null;
            }
        });
    }

    public void a(e eVar) {
        this.a.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IBinder iBinder, int i, String str, String str2, int i2) {
        String b = b(iBinder, i, str);
        c.b("WakeupEngineProxy", "setDisableInfoCache :  " + b);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        DisableInfoBean disableInfoBean = new DisableInfoBean(iBinder, i, str, str2, i2);
        if (this.b.containsKey(b)) {
            return;
        }
        c.b("WakeupEngineProxy", "put data  :  " + b + ": " + disableInfoBean.toString());
        this.b.put(b, disableInfoBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBinder iBinder, int i, String str) {
        String b = b(iBinder, i, str);
        c.b("WakeupEngineProxy", "removeDisableInfoCache :  " + b);
        if (TextUtils.isEmpty(b) || !this.b.containsKey(b)) {
            return;
        }
        c.b("WakeupEngineProxy", "remove  :  " + b + ": " + this.b.size());
        this.b.remove(b);
        c.b("WakeupEngineProxy", "remove after :  " + b + ": " + this.b.size());
    }

    private String b(IBinder iBinder, int i, String str) {
        if (iBinder != null) {
            String obj = iBinder.toString();
            if (i == -1) {
                return obj + "_" + str;
            }
            return obj + "_" + i + "_" + str;
        }
        return null;
    }

    private void x() {
        c.b("WakeupEngineProxy", "resumeCarSpeechStatus  disableInfoCache size " + this.b.size());
        if (this.b.size() > 0) {
            for (Map.Entry<String, DisableInfoBean> entry : this.b.entrySet()) {
                DisableInfoBean value = entry.getValue();
                if (value != null) {
                    c.b("WakeupEngineProxy", "disable from cache:    = ====  " + value.toString());
                    if (value.b() == -1) {
                        a(value.a(), value.c(), value.d(), value.e());
                    } else {
                        a(value.a(), value.b(), value.c(), value.d(), value.e());
                    }
                }
            }
        }
    }
}
