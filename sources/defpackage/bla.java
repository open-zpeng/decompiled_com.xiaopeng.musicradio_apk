package defpackage;

import com.lzy.okgo.model.HttpHeaders;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ClientComms.java */
/* renamed from: bla  reason: default package */
/* loaded from: classes3.dex */
public class bla {
    public static String a = "${project.version}";
    public static String b = "L${build.level}";
    private static final String c = "bla";
    private static final bna d = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", c);
    private bki e;
    private int f;
    private bln[] g;
    private bld h;
    private ble i;
    private blc j;
    private blb k;
    private bkq l;
    private bkp m;
    private bkw n;
    private blf o;
    private byte q;
    private blh u;
    private ExecutorService v;
    private boolean p = false;
    private Object r = new Object();
    private boolean s = false;
    private boolean t = false;

    public bla(bki bkiVar, bkp bkpVar, bkw bkwVar, ExecutorService executorService) {
        this.q = (byte) 3;
        this.q = (byte) 3;
        this.e = bkiVar;
        this.m = bkpVar;
        this.n = bkwVar;
        this.n.a(this);
        this.v = executorService;
        this.o = new blf(h().b());
        this.j = new blc(this);
        this.k = new blb(bkpVar, this.o, this.j, this, bkwVar);
        this.j.a(this.k);
        d.setResourceName(h().b());
    }

    private void m() {
        this.v.shutdown();
        try {
            if (this.v.awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            this.v.shutdownNow();
            if (this.v.awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            d.fine(c, "shutdownExecutorService", "executorService did not terminate");
        } catch (InterruptedException unused) {
            this.v.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(bmw bmwVar, bky bkyVar) {
        d.fine(c, "internalSend", "200", new Object[]{bmwVar.e(), bmwVar, bkyVar});
        if (bkyVar.c() == null) {
            bkyVar.a.a(h());
            try {
                this.k.a(bmwVar, bkyVar);
                return;
            } catch (bks e) {
                if (bmwVar instanceof bmq) {
                    this.k.a((bmq) bmwVar);
                }
                throw e;
            }
        }
        d.fine(c, "internalSend", "213", new Object[]{bmwVar.e(), bmwVar, bkyVar});
        throw new bks(32201);
    }

    public void b(bmw bmwVar, bky bkyVar) {
        if (a() || ((!a() && (bmwVar instanceof bmf)) || (d() && (bmwVar instanceof bmg)))) {
            blh blhVar = this.u;
            if (blhVar != null && blhVar.a() != 0) {
                d.fine(c, "sendNoWait", "507", new Object[]{bmwVar.e()});
                if (this.u.b()) {
                    this.k.a(bmwVar);
                }
                this.u.a(bmwVar, bkyVar);
                return;
            }
            a(bmwVar, bkyVar);
        } else if (this.u != null) {
            d.fine(c, "sendNoWait", "508", new Object[]{bmwVar.e()});
            if (this.u.b()) {
                this.k.a(bmwVar);
            }
            this.u.a(bmwVar, bkyVar);
        } else {
            d.fine(c, "sendNoWait", "208");
            throw bli.a(32104);
        }
    }

    public void a(boolean z) {
        synchronized (this.r) {
            if (!e()) {
                if (!c() || z) {
                    d.fine(c, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE, "224");
                    if (b()) {
                        throw new bks(32110);
                    }
                    if (a()) {
                        throw bli.a(32100);
                    }
                    if (d()) {
                        this.s = true;
                        return;
                    }
                }
                this.q = (byte) 4;
                m();
                this.k.k();
                this.k = null;
                this.j = null;
                this.m = null;
                this.i = null;
                this.n = null;
                this.h = null;
                this.g = null;
                this.l = null;
                this.o = null;
            }
        }
    }

    public void a(bkq bkqVar, bky bkyVar) {
        synchronized (this.r) {
            if (c() && !this.s) {
                d.fine(c, "connect", "214");
                this.q = (byte) 1;
                this.l = bkqVar;
                bmf bmfVar = new bmf(this.e.b(), this.l.d(), this.l.l(), this.l.c(), this.l.b(), this.l.a(), this.l.i(), this.l.h());
                this.k.a(this.l.c());
                this.k.a(this.l.l());
                this.k.a(this.l.e());
                this.o.a();
                new a(this, bkyVar, bmfVar, this.v).a();
            } else {
                d.fine(c, "connect", "207", new Object[]{new Byte(this.q)});
                if (e() || this.s) {
                    throw new bks(32111);
                }
                if (b()) {
                    throw new bks(32110);
                }
                if (d()) {
                    throw new bks(32102);
                }
                throw bli.a(32100);
            }
        }
    }

    public void a(bme bmeVar, bks bksVar) {
        int aB_ = bmeVar.aB_();
        synchronized (this.r) {
            if (aB_ == 0) {
                d.fine(c, "connectComplete", "215");
                this.q = (byte) 0;
                return;
            }
            d.fine(c, "connectComplete", "204", new Object[]{new Integer(aB_)});
            throw bksVar;
        }
    }

    public void a(bky bkyVar, bks bksVar) {
        blc blcVar;
        bln blnVar;
        synchronized (this.r) {
            if (!this.p && !this.s && !e()) {
                this.p = true;
                d.fine(c, "shutdownConnection", "216");
                boolean z = a() || d();
                this.q = (byte) 2;
                if (bkyVar != null && !bkyVar.h()) {
                    bkyVar.a.a(bksVar);
                }
                blc blcVar2 = this.j;
                if (blcVar2 != null) {
                    blcVar2.a();
                }
                bld bldVar = this.h;
                if (bldVar != null) {
                    bldVar.a();
                }
                try {
                    if (this.g != null && (blnVar = this.g[this.f]) != null) {
                        blnVar.d();
                    }
                } catch (Exception unused) {
                }
                this.o.a(new bks(32102));
                bky b2 = b(bkyVar, bksVar);
                try {
                    this.k.b(bksVar);
                    if (this.k.b()) {
                        this.j.e();
                    }
                } catch (Exception unused2) {
                }
                ble bleVar = this.i;
                if (bleVar != null) {
                    bleVar.a();
                }
                bkw bkwVar = this.n;
                if (bkwVar != null) {
                    bkwVar.b();
                }
                try {
                    if (this.u == null && this.m != null) {
                        this.m.close();
                    }
                } catch (Exception unused3) {
                }
                synchronized (this.r) {
                    d.fine(c, "shutdownConnection", "217");
                    this.q = (byte) 3;
                    this.p = false;
                }
                if ((b2 != null) & (this.j != null)) {
                    this.j.b(b2);
                }
                if (z && (blcVar = this.j) != null) {
                    blcVar.a(bksVar);
                }
                synchronized (this.r) {
                    if (this.s) {
                        try {
                            a(true);
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
        }
    }

    private bky b(bky bkyVar, bks bksVar) {
        d.fine(c, "handleOldTokens", "222");
        bky bkyVar2 = null;
        if (bkyVar != null) {
            try {
                if (this.o.a(bkyVar.a.o()) == null) {
                    this.o.a(bkyVar, bkyVar.a.o());
                }
            } catch (Exception unused) {
            }
        }
        Enumeration elements = this.k.a(bksVar).elements();
        while (elements.hasMoreElements()) {
            bky bkyVar3 = (bky) elements.nextElement();
            if (!bkyVar3.a.o().equals("Disc") && !bkyVar3.a.o().equals("Con")) {
                this.j.b(bkyVar3);
            }
            bkyVar2 = bkyVar3;
        }
        return bkyVar2;
    }

    public void a(bmg bmgVar, long j, bky bkyVar) {
        synchronized (this.r) {
            if (e()) {
                d.fine(c, "disconnect", "223");
                throw bli.a(32111);
            } else if (c()) {
                d.fine(c, "disconnect", "211");
                throw bli.a(32101);
            } else if (d()) {
                d.fine(c, "disconnect", "219");
                throw bli.a(32102);
            } else if (Thread.currentThread() == this.j.d()) {
                d.fine(c, "disconnect", "210");
                throw bli.a(32107);
            } else {
                d.fine(c, "disconnect", "218");
                this.q = (byte) 2;
                new b(bmgVar, j, bkyVar, this.v).a();
            }
        }
    }

    public void a(long j, long j2, boolean z) {
        blb blbVar = this.k;
        if (blbVar != null) {
            blbVar.b(j);
        }
        bky bkyVar = new bky(this.e.b());
        if (z) {
            try {
                a(new bmg(), bkyVar);
                bkyVar.a(j2);
            } catch (Exception unused) {
            } catch (Throwable th) {
                bkyVar.a.a(null, null);
                a(bkyVar, (bks) null);
                throw th;
            }
        }
        bkyVar.a.a(null, null);
        a(bkyVar, (bks) null);
    }

    public boolean a() {
        boolean z;
        synchronized (this.r) {
            z = this.q == 0;
        }
        return z;
    }

    public boolean b() {
        boolean z;
        synchronized (this.r) {
            z = true;
            if (this.q != 1) {
                z = false;
            }
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.r) {
            z = this.q == 3;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.r) {
            z = this.q == 2;
        }
        return z;
    }

    public boolean e() {
        boolean z;
        synchronized (this.r) {
            z = this.q == 4;
        }
        return z;
    }

    public void a(bkn bknVar) {
        this.j.a(bknVar);
    }

    public void a(bko bkoVar) {
        this.j.a(bkoVar);
    }

    public void a(String str) {
        this.j.a(str);
    }

    public void a(int i) {
        this.f = i;
    }

    public int f() {
        return this.f;
    }

    public bln[] g() {
        return this.g;
    }

    public void a(bln[] blnVarArr) {
        this.g = blnVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(bmq bmqVar) {
        this.k.b(bmqVar);
    }

    public bki h() {
        return this.e;
    }

    public long i() {
        return this.k.a();
    }

    /* compiled from: ClientComms.java */
    /* renamed from: bla$a */
    /* loaded from: classes3.dex */
    private class a implements Runnable {
        bla a;
        bky b;
        bmf c;
        private String e;

        a(bla blaVar, bky bkyVar, bmf bmfVar, ExecutorService executorService) {
            this.a = null;
            this.a = blaVar;
            this.b = bkyVar;
            this.c = bmfVar;
            this.e = "MQTT Con: " + bla.this.h().b();
        }

        void a() {
            bla.this.v.execute(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName(this.e);
            bla.d.fine(bla.c, "connectBG:run", "220");
            bks e = null;
            try {
                for (bkr bkrVar : bla.this.o.b()) {
                    bkrVar.a.a((bks) null);
                }
                bla.this.o.a(this.b, this.c);
                bln blnVar = bla.this.g[bla.this.f];
                blnVar.a();
                bla.this.h = new bld(this.a, bla.this.k, bla.this.o, blnVar.b());
                bla.this.h.a("MQTT Rec: " + bla.this.h().b(), bla.this.v);
                bla.this.i = new ble(this.a, bla.this.k, bla.this.o, blnVar.c());
                bla.this.i.a("MQTT Snd: " + bla.this.h().b(), bla.this.v);
                bla.this.j.a("MQTT Call: " + bla.this.h().b(), bla.this.v);
                bla.this.a(this.c, this.b);
            } catch (bks e2) {
                e = e2;
                bla.d.fine(bla.c, "connectBG:run", "212", null, e);
            } catch (Exception e3) {
                bla.d.fine(bla.c, "connectBG:run", "209", null, e3);
                e = bli.a(e3);
            }
            if (e != null) {
                bla.this.a(this.b, e);
            }
        }
    }

    /* compiled from: ClientComms.java */
    /* renamed from: bla$b */
    /* loaded from: classes3.dex */
    private class b implements Runnable {
        bmg a;
        long b;
        bky c;
        private String e;

        b(bmg bmgVar, long j, bky bkyVar, ExecutorService executorService) {
            this.a = bmgVar;
            this.b = j;
            this.c = bkyVar;
        }

        void a() {
            this.e = "MQTT Disc: " + bla.this.h().b();
            bla.this.v.execute(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName(this.e);
            bla.d.fine(bla.c, "disconnectBG:run", "221");
            bla.this.k.b(this.b);
            try {
                bla.this.a(this.a, this.c);
                this.c.a.h();
            } catch (bks unused) {
            } catch (Throwable th) {
                this.c.a.a(null, null);
                bla.this.a(this.c, (bks) null);
                throw th;
            }
            this.c.a.a(null, null);
            bla.this.a(this.c, (bks) null);
        }
    }

    public bky a(bkh bkhVar) {
        try {
            return this.k.a(bkhVar);
        } catch (bks e) {
            a(e);
            return null;
        } catch (Exception e2) {
            a(e2);
            return null;
        }
    }

    private void a(Exception exc) {
        bks bksVar;
        d.fine(c, "handleRunException", "804", null, exc);
        if (!(exc instanceof bks)) {
            bksVar = new bks(32109, exc);
        } else {
            bksVar = (bks) exc;
        }
        a((bky) null, bksVar);
    }

    public void b(boolean z) {
        this.t = z;
    }

    public void a(blh blhVar) {
        this.u = blhVar;
    }

    public void j() {
        if (this.u != null) {
            d.fine(c, "notifyConnect", "509");
            this.u.a(new c("notifyConnect"));
            this.v.execute(this.u);
        }
    }

    /* compiled from: ClientComms.java */
    /* renamed from: bla$c */
    /* loaded from: classes3.dex */
    class c implements blk {
        final String a;

        c(String str) {
            this.a = str;
        }

        @Override // defpackage.blk
        public void a(bkf bkfVar) {
            if (!bla.this.a()) {
                bla.d.fine(bla.c, this.a, "208");
                throw bli.a(32104);
            }
            while (bla.this.k.i() >= bla.this.k.j() - 1) {
                Thread.yield();
            }
            bla.d.fine(bla.c, this.a, "510", new Object[]{bkfVar.a().e()});
            bla.this.a(bkfVar.a(), bkfVar.b());
            bla.this.k.b(bkfVar.a());
        }
    }
}
