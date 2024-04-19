package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
/* compiled from: SpeechClient.java */
/* renamed from: bfb  reason: default package */
/* loaded from: classes2.dex */
public class bfb implements bep.a {
    private Context a;
    private bez b;
    private com.xiaopeng.speech.actor.a c;
    private bep d;
    private bhn e;
    private bhp f;
    private bhg g;
    private bhm h;
    private bhd i;
    private bhe j;
    private bhl k;
    private bhk l;
    private bhc m;
    private bhj n;
    private bfa o;
    private bhi p;
    private bhq q;
    private bfo r;
    private bho s;
    private bhf t;
    private e u;

    @Override // defpackage.bep.a
    public void a() {
    }

    @Override // defpackage.bep.a
    public void a(bew bewVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpeechClient.java */
    /* renamed from: bfb$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final bfb a = new bfb();
    }

    public static final bfb b() {
        return a.a;
    }

    public void a(Context context) {
        a(context, null);
    }

    public void a(Context context, bep.a aVar) {
        c.b(this, "SpeechClient(%s) Start In %s, connectCallback: %s", "1.0", context.getPackageName(), aVar);
        HandlerThread handlerThread = new HandlerThread("NodeWorker");
        handlerThread.start();
        this.u = new e(handlerThread.getLooper());
        this.a = context;
        this.d = new bep(context);
        this.d.a(this.u);
        this.b = new bez();
        this.b.a(this.u);
        this.d.a(this.b);
        this.o = new bfa();
        this.o.a(this.u);
        this.d.a(this.o);
        this.c = new com.xiaopeng.speech.actor.a(context);
        this.c.a(this.u);
        this.d.a((bep.a) this.c);
        this.e = new bhn();
        this.e.a(this.u);
        this.d.a((bep.a) this.e);
        this.f = new bhp();
        this.f.a(this.u);
        this.d.a((bep.a) this.f);
        this.g = new bhg();
        this.g.a(this.u);
        this.d.a((bep.a) this.g);
        this.i = new bhd();
        this.i.a(this.u);
        this.d.a((bep.a) this.i);
        this.h = new bhm();
        this.h.a(this.u);
        this.d.a((bep.a) this.h);
        this.j = new bhe(context);
        this.j.a(this.u);
        this.d.a((bep.a) this.j);
        this.k = new bhl();
        this.d.a((bep.a) this.k);
        this.l = new bhk();
        this.d.a((bep.a) this.l);
        this.m = new bhc();
        this.m.a(this.u);
        this.d.a((bep.a) this.m);
        this.n = new bhj();
        this.n.a(this.u);
        this.d.a((bep.a) this.n);
        this.p = new bhi();
        this.p.a(this.u);
        this.d.a((bep.a) this.p);
        this.q = new bhq();
        this.d.a((bep.a) this.q);
        this.r = new bfo(this.u);
        this.d.a(this.r.c());
        this.t = new bhf();
        this.d.a((bep.a) this.t);
        this.s = new bho();
        this.s.a(this.u);
        this.d.a((bep.a) this.s);
        if (aVar == null) {
            this.d.a(this);
        } else {
            this.d.a(aVar);
        }
        this.d.b();
        this.d.a();
    }

    public void a(String... strArr) {
        for (String str : strArr) {
            f().a(this.a.getPackageName(), str);
        }
    }

    public com.xiaopeng.speech.actor.a c() {
        return this.c;
    }

    public bhn d() {
        return this.e;
    }

    public bhp e() {
        return this.f;
    }

    public bhe f() {
        return this.j;
    }

    public bhl g() {
        return this.k;
    }

    public bhi h() {
        return this.p;
    }

    public bfo i() {
        return this.r;
    }

    public bez j() {
        return this.b;
    }
}
