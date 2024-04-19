package defpackage;

import android.os.RemoteException;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import java.util.HashMap;
import java.util.Map;
/* compiled from: QueryManager.java */
/* renamed from: bfa  reason: default package */
/* loaded from: classes2.dex */
public class bfa implements bep.a {
    private volatile bet a;
    private Map<Class<? extends bfd>, bfd> b = new HashMap();
    private e c;

    public void a(e eVar) {
        this.c = eVar;
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        c.b("QueryManager", "onConnect " + bewVar);
        if (bewVar == null) {
            return;
        }
        try {
            this.a = bewVar.j();
            this.c.a(new Runnable() { // from class: bfa.1
                @Override // java.lang.Runnable
                public void run() {
                    bfa.this.a(true);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.a == null) {
            c.b("mIQueryInjector == null");
            return;
        }
        for (Map.Entry<Class<? extends bfd>, bfd> entry : this.b.entrySet()) {
            bfd value = entry.getValue();
            if (!value.a() || z) {
                c.a(String.format("do inject query:%s", value));
                if (value.d() == null || value.d().length <= 0) {
                    c.b("getInjectEvents.length == 0");
                } else {
                    try {
                        if (this.a != null) {
                            this.a.a(value.d(), value);
                            value.a(true);
                        }
                    } catch (RemoteException e) {
                        c.a(this, "inject error ", e);
                    }
                }
            }
        }
    }
}
