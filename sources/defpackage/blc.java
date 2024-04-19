package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
/* compiled from: CommsCallback.java */
/* renamed from: blc  reason: default package */
/* loaded from: classes3.dex */
public class blc implements Runnable {
    private static final String b = "blc";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b);
    private bkn d;
    private bko e;
    private bla g;
    private Thread l;
    private blb o;
    private String q;
    private Future s;
    public boolean a = false;
    private boolean j = false;
    private Object k = new Object();
    private Object m = new Object();
    private Object n = new Object();
    private boolean p = false;
    private final Semaphore r = new Semaphore(1);
    private Vector h = new Vector(10);
    private Vector i = new Vector(10);
    private Hashtable f = new Hashtable();

    /* JADX INFO: Access modifiers changed from: package-private */
    public blc(bla blaVar) {
        this.g = blaVar;
        c.setResourceName(blaVar.h().b());
    }

    public void a(blb blbVar) {
        this.o = blbVar;
    }

    public void a(String str, ExecutorService executorService) {
        this.q = str;
        synchronized (this.k) {
            if (!this.a) {
                this.h.clear();
                this.i.clear();
                this.a = true;
                this.j = false;
                this.s = executorService.submit(this);
            }
        }
    }

    public void a() {
        Semaphore semaphore;
        synchronized (this.k) {
            if (this.s != null) {
                this.s.cancel(true);
            }
            if (this.a) {
                c.fine(b, "stop", "700");
                this.a = false;
                if (!Thread.currentThread().equals(this.l)) {
                    try {
                        synchronized (this.m) {
                            c.fine(b, "stop", "701");
                            this.m.notifyAll();
                        }
                        this.r.acquire();
                        semaphore = this.r;
                    } catch (InterruptedException unused) {
                        semaphore = this.r;
                    } catch (Throwable th) {
                        this.r.release();
                        throw th;
                    }
                    semaphore.release();
                }
            }
            this.l = null;
            c.fine(b, "stop", "703");
        }
    }

    public void a(bkn bknVar) {
        this.d = bknVar;
    }

    public void a(bko bkoVar) {
        this.e = bkoVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bky bkyVar;
        bmq bmqVar;
        this.l = Thread.currentThread();
        this.l.setName(this.q);
        try {
            this.r.acquire();
            while (this.a) {
                try {
                    try {
                        synchronized (this.m) {
                            if (this.a && this.h.isEmpty() && this.i.isEmpty()) {
                                c.fine(b, "run", "704");
                                this.m.wait();
                            }
                        }
                    } catch (Throwable th) {
                        this.r.release();
                        synchronized (this.n) {
                            c.fine(b, "run", "706");
                            this.n.notifyAll();
                            throw th;
                        }
                    }
                } catch (InterruptedException unused) {
                }
                if (this.a) {
                    synchronized (this.i) {
                        if (this.i.isEmpty()) {
                            bkyVar = null;
                        } else {
                            bkyVar = (bky) this.i.elementAt(0);
                            this.i.removeElementAt(0);
                        }
                    }
                    if (bkyVar != null) {
                        c(bkyVar);
                    }
                    synchronized (this.h) {
                        if (this.h.isEmpty()) {
                            bmqVar = null;
                        } else {
                            bmqVar = (bmq) this.h.elementAt(0);
                            this.h.removeElementAt(0);
                        }
                    }
                    if (bmqVar != null) {
                        b(bmqVar);
                    }
                }
                if (this.j) {
                    this.o.f();
                }
                this.r.release();
                synchronized (this.n) {
                    c.fine(b, "run", "706");
                    this.n.notifyAll();
                }
            }
        } catch (InterruptedException unused2) {
            this.a = false;
        }
    }

    private void c(bky bkyVar) {
        synchronized (bkyVar) {
            c.fine(b, "handleActionComplete", "705", new Object[]{bkyVar.a.o()});
            if (bkyVar.h()) {
                this.o.a(bkyVar);
            }
            bkyVar.a.g();
            if (!bkyVar.a.p()) {
                if (this.d != null && (bkyVar instanceof bkr) && bkyVar.h()) {
                    this.d.deliveryComplete((bkr) bkyVar);
                }
                a(bkyVar);
            }
            if (bkyVar.h() && ((bkyVar instanceof bkr) || (bkyVar.d() instanceof bkh))) {
                bkyVar.a.a(true);
            }
        }
    }

    public void a(bks bksVar) {
        try {
            if (this.d != null && bksVar != null) {
                c.fine(b, "connectionLost", "708", new Object[]{bksVar});
                this.d.connectionLost(bksVar);
            }
            if (this.e == null || bksVar == null) {
                return;
            }
            this.e.connectionLost(bksVar);
        } catch (Throwable th) {
            c.fine(b, "connectionLost", "720", new Object[]{th});
        }
    }

    public void a(bky bkyVar) {
        bkh d;
        if (bkyVar == null || (d = bkyVar.d()) == null) {
            return;
        }
        if (bkyVar.b() == null) {
            c.fine(b, "fireActionEvent", "716", new Object[]{bkyVar.a.o()});
            d.onSuccess(bkyVar);
            return;
        }
        c.fine(b, "fireActionEvent", "716", new Object[]{bkyVar.a.o()});
        d.onFailure(bkyVar, bkyVar.b());
    }

    public void a(bmq bmqVar) {
        if (this.d != null || this.f.size() > 0) {
            synchronized (this.n) {
                while (this.a && !this.j && this.h.size() >= 10) {
                    try {
                        c.fine(b, "messageArrived", "709");
                        this.n.wait(200L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (this.j) {
                return;
            }
            this.h.addElement(bmqVar);
            synchronized (this.m) {
                c.fine(b, "messageArrived", "710");
                this.m.notifyAll();
            }
        }
    }

    public void b() {
        this.j = true;
        synchronized (this.n) {
            c.fine(b, "quiesce", "711");
            this.n.notifyAll();
        }
    }

    public boolean c() {
        return this.j && this.i.size() == 0 && this.h.size() == 0;
    }

    private void b(bmq bmqVar) {
        String g = bmqVar.g();
        c.fine(b, "handleMessage", "713", new Object[]{new Integer(bmqVar.j()), g});
        a(g, bmqVar.j(), bmqVar.h());
        if (this.p) {
            return;
        }
        if (bmqVar.h().c() == 1) {
            this.g.a(new bmm(bmqVar), new bky(this.g.h().b()));
        } else if (bmqVar.h().c() == 2) {
            this.g.a(bmqVar);
            bmn bmnVar = new bmn(bmqVar);
            bla blaVar = this.g;
            blaVar.a(bmnVar, new bky(blaVar.h().b()));
        }
    }

    public void b(bky bkyVar) {
        if (this.a) {
            this.i.addElement(bkyVar);
            synchronized (this.m) {
                c.fine(b, "asyncOperationComplete", "715", new Object[]{bkyVar.a.o()});
                this.m.notifyAll();
            }
            return;
        }
        try {
            c(bkyVar);
        } catch (Throwable th) {
            c.fine(b, "asyncOperationComplete", "719", null, th);
            this.g.a((bky) null, new bks(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Thread d() {
        return this.l;
    }

    public void a(String str) {
        this.f.remove(str);
    }

    public void e() {
        this.f.clear();
    }

    protected boolean a(String str, int i, bkt bktVar) {
        Enumeration keys = this.f.keys();
        boolean z = false;
        while (keys.hasMoreElements()) {
            String str2 = (String) keys.nextElement();
            if (bkz.a(str2, str)) {
                bktVar.c(i);
                ((bkk) this.f.get(str2)).a(str, bktVar);
                z = true;
            }
        }
        if (this.d == null || z) {
            return z;
        }
        bktVar.c(i);
        this.d.messageArrived(str, bktVar);
        return true;
    }
}
