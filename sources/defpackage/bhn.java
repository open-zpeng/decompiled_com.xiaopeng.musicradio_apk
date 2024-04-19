package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.bfy;
import defpackage.bfz;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: TTSEngineProxy.java */
/* renamed from: bhn  reason: default package */
/* loaded from: classes2.dex */
public class bhn extends bfz.a implements bep.a {
    private e c;
    private Map<String, bhh> a = new ConcurrentHashMap();
    private volatile boolean b = false;
    private b<bfz> d = new b<>("TTSEngineProxy");
    private bfy e = new bfy.a() { // from class: bhn.1
        @Override // defpackage.bfy
        public void a(final String str, final String str2) {
            bhn.this.c.a(new Runnable() { // from class: bhn.1.1
                @Override // java.lang.Runnable
                public void run() {
                    bhh bhhVar = (bhh) bhn.this.a.get(str);
                    if (bhhVar != null) {
                        bhhVar.a(str, str2);
                    }
                }
            });
        }

        @Override // defpackage.bfy
        public void a(final byte[] bArr) {
            bhn.this.c.a(new Runnable() { // from class: bhn.1.2
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry : bhn.this.a.entrySet()) {
                        ((bhh) entry.getValue()).a(bArr);
                    }
                }
            });
        }

        @Override // defpackage.bfy
        public void a(final String str, final int i, final String str2) {
            bhn.this.c.a(new Runnable() { // from class: bhn.1.3
                @Override // java.lang.Runnable
                public void run() {
                    bhh bhhVar = (bhh) bhn.this.a.get(str);
                    if (bhhVar != null) {
                        bhhVar.a(str, i, str2);
                        bhn.this.a.remove(str);
                    }
                }
            });
        }

        @Override // defpackage.bfy
        public void b(final String str, final String str2) {
            bhn.this.c.a(new Runnable() { // from class: bhn.1.4
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = bhn.this.a.entrySet().iterator();
                    while (it.hasNext()) {
                        ((bhh) ((Map.Entry) it.next()).getValue()).b(str, str2);
                        it.remove();
                    }
                }
            });
        }
    };

    public void a(e eVar) {
        this.c = eVar;
        this.d.a(this.c);
    }

    public String c(final String str) {
        this.c.a(new Runnable() { // from class: bhn.12
            @Override // java.lang.Runnable
            public void run() {
                bhn.this.a(str, 1, 3, -1, null);
            }
        }, 50L);
        return "";
    }

    public String a(String str, int i, int i2, int i3, bhh bhhVar) {
        String uuid = UUID.randomUUID().toString();
        a(str, i, uuid, i2, i3, bfp.a, bfp.d);
        g();
        if (bhhVar != null) {
            this.a.put(uuid, bhhVar);
            c.a("speak callback size:" + this.a.size());
        }
        return uuid;
    }

    @Override // defpackage.bfz
    public boolean a(final String str, final int i, final String str2, final int i2, final int i3, final int i4, final long j) {
        return ((Boolean) this.d.a(new b.a<bfz, Boolean>() { // from class: bhn.14
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfz bfzVar) {
                try {
                    return Boolean.valueOf(bfzVar.a(str, i, str2, i2, i3, i4, j));
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return false;
                }
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfz
    public boolean a(final String str, final int i, final String str2, final int i2) {
        return ((Boolean) this.d.a(new b.a<bfz, Boolean>() { // from class: bhn.15
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfz bfzVar) {
                try {
                    return Boolean.valueOf(bfzVar.a(str, i, str2, i2));
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return false;
                }
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfz
    public void a(final String str) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.16
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(str);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public String b() {
        return (String) this.d.a(new b.a<bfz, String>() { // from class: bhn.17
            @Override // com.xiaopeng.speech.common.util.b.a
            public String a(bfz bfzVar) {
                try {
                    return bfzVar.b();
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        }, null);
    }

    @Override // defpackage.bfz
    public void a(final float f) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.18
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(f);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public float c() {
        return ((Float) this.d.a(new b.a<bfz, Float>() { // from class: bhn.19
            @Override // com.xiaopeng.speech.common.util.b.a
            public Float a(bfz bfzVar) {
                try {
                    return Float.valueOf(bfzVar.c());
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return Float.valueOf(0.0f);
                }
            }
        }, Float.valueOf(0.0f))).floatValue();
    }

    @Override // defpackage.bfz
    public void a(final int i) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.20
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(i);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public int d() {
        return ((Integer) this.d.a(new b.a<bfz, Integer>() { // from class: bhn.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Integer a(bfz bfzVar) {
                try {
                    return Integer.valueOf(bfzVar.d());
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return 0;
                }
            }
        }, 0)).intValue();
    }

    @Override // defpackage.bfz
    public void b(final int i) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.b(i);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public void a(final boolean z) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(z);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public void a(final String str, final String str2) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(str, str2);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public void b(final String str) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.6
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.b(str);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public void a(final bfy bfyVar) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.7
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(bfyVar);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public void b(final bfy bfyVar) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.8
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.b(bfyVar);
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public void a(final boolean z, final IBinder iBinder) {
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.9
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    if (iBinder == null) {
                        bfzVar.a(z, bfzVar.asBinder());
                    } else {
                        bfzVar.a(z, iBinder);
                    }
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bfz
    public boolean e() {
        return ((Boolean) this.d.a(new b.a<bfz, Boolean>() { // from class: bhn.10
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfz bfzVar) {
                try {
                    return Boolean.valueOf(bfzVar.e());
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return false;
                }
            }
        }, false)).booleanValue();
    }

    @Override // defpackage.bfz
    public boolean f() {
        return ((Boolean) this.d.a(new b.a<bfz, Boolean>() { // from class: bhn.11
            @Override // com.xiaopeng.speech.common.util.b.a
            public Boolean a(bfz bfzVar) {
                try {
                    return Boolean.valueOf(bfzVar.f());
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return false;
                }
            }
        }, false)).booleanValue();
    }

    private synchronized void g() {
        if (this.b) {
            return;
        }
        this.d.a((b<bfz>) new b.a<bfz, Object>() { // from class: bhn.13
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfz bfzVar) {
                try {
                    bfzVar.a(bhn.this.e);
                    bhn.this.b = true;
                    return null;
                } catch (Throwable th) {
                    c.b("IPC Excption:" + th.getMessage());
                    return null;
                }
            }
        });
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.d.c(bewVar.c());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        this.d.b();
    }

    @Override // defpackage.bep.a
    public void a() {
        this.b = false;
        this.d.c(null);
    }
}
