package defpackage;

import android.os.Handler;
import android.os.RemoteException;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import java.util.HashMap;
import java.util.Map;
/* compiled from: NodeManager.java */
/* renamed from: bez  reason: default package */
/* loaded from: classes2.dex */
public class bez implements bep.a {
    private volatile bfx a;
    private Map<Class<? extends bfc>, bfc> b = new HashMap();
    private e c;

    public void a(e eVar) {
        this.c = eVar;
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        c.a("onConnect " + bewVar);
        if (bewVar == null) {
            return;
        }
        try {
            this.a = bewVar.b();
            this.c.a(new Runnable() { // from class: bez.1
                @Override // java.lang.Runnable
                public void run() {
                    bez.this.a(true);
                }
            });
        } catch (RemoteException e) {
            c.a(this, e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.a = null;
    }

    public void a(final Class<? extends bfc> cls, final bes besVar) {
        this.c.a(new Runnable() { // from class: bez.2
            @Override // java.lang.Runnable
            public void run() {
                bfc a = bez.this.a(cls);
                if (a != null) {
                    a.a((bfc) besVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bfc a(Class<? extends bfc> cls) {
        bfc bfcVar;
        bfc bfcVar2 = this.b.get(cls);
        if (bfcVar2 != null) {
            return bfcVar2;
        }
        synchronized (this.b) {
            bfcVar = this.b.get(cls);
            if (bfcVar == null) {
                try {
                    bfcVar = cls.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                    c.b(String.format("create %s error", cls));
                }
                if (bfcVar != null) {
                    a(bfcVar);
                    bfcVar.a((Handler) this.c);
                }
            }
        }
        return bfcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(bfc bfcVar) {
        if (this.b.containsKey(bfcVar.getClass())) {
            c.b(String.format("node %s had register", bfcVar));
            return;
        }
        c.a(String.format("register node:%s", bfcVar));
        this.b.put(bfcVar.getClass(), bfcVar);
        this.c.a(new Runnable() { // from class: bez.3
            @Override // java.lang.Runnable
            public void run() {
                bez.this.a(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.a == null) {
            c.b("mSubscriber == null");
            return;
        }
        for (Map.Entry<Class<? extends bfc>, bfc> entry : this.b.entrySet()) {
            bfc value = entry.getValue();
            if (!value.a() || z) {
                c.a(String.format("do subscribe node:%s", value));
                if (value.d() == null || value.d().length <= 0) {
                    c.b("getSubscribeEvents.length == 0");
                } else {
                    try {
                        if (this.a != null) {
                            this.a.a(value.d(), value);
                            value.a(true);
                        }
                    } catch (RemoteException e) {
                        c.a(this, "subscribe error ", e);
                    }
                }
            }
        }
    }
}
