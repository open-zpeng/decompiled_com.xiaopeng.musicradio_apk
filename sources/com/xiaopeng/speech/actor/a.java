package com.xiaopeng.speech.actor;

import android.content.Context;
import android.os.RemoteException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
import defpackage.beq;
/* compiled from: ActorBridge.java */
/* loaded from: classes2.dex */
public class a extends beq.a implements bep.a {
    private Context a;
    private e b;
    private b<beq> c = new b<>("ActorBridge");

    public a(Context context) {
        this.a = context;
    }

    public void a(e eVar) {
        this.b = eVar;
        this.c.a(eVar);
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
        try {
            this.c.c(bewVar.a());
            this.c.b();
        } catch (RemoteException e) {
            c.a(this, "onConnect exception ", e);
        }
    }

    @Override // defpackage.bep.a
    public void a() {
        this.c.c(null);
    }

    @Override // defpackage.beq
    public void a(final Actor actor) {
        this.c.a((b<beq>) new b.a<beq, Object>() { // from class: com.xiaopeng.speech.actor.a.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(beq beqVar) {
                beqVar.a(actor);
                return null;
            }
        });
    }
}
