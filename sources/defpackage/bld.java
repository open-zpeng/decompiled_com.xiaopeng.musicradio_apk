package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
/* compiled from: CommsReceiver.java */
/* renamed from: bld  reason: default package */
/* loaded from: classes3.dex */
public class bld implements Runnable {
    private static final String a = "bld";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private blb e;
    private bla f;
    private bmh g;
    private blf h;
    private volatile boolean j;
    private String l;
    private Future m;
    private boolean c = false;
    private Object d = new Object();
    private Thread i = null;
    private final Semaphore k = new Semaphore(1);

    public bld(bla blaVar, blb blbVar, blf blfVar, InputStream inputStream) {
        this.e = null;
        this.f = null;
        this.h = null;
        this.g = new bmh(blbVar, inputStream);
        this.f = blaVar;
        this.e = blbVar;
        this.h = blfVar;
        b.setResourceName(blaVar.h().b());
    }

    public void a(String str, ExecutorService executorService) {
        this.l = str;
        b.fine(a, "start", "855");
        synchronized (this.d) {
            if (!this.c) {
                this.c = true;
                this.m = executorService.submit(this);
            }
        }
    }

    public void a() {
        Semaphore semaphore;
        synchronized (this.d) {
            if (this.m != null) {
                this.m.cancel(true);
            }
            b.fine(a, "stop", "850");
            if (this.c) {
                this.c = false;
                this.j = false;
                if (!Thread.currentThread().equals(this.i)) {
                    try {
                        this.k.acquire();
                        semaphore = this.k;
                    } catch (InterruptedException unused) {
                        semaphore = this.k;
                    }
                    semaphore.release();
                }
            }
        }
        this.i = null;
        b.fine(a, "stop", "851");
    }

    @Override // java.lang.Runnable
    public void run() {
        this.i = Thread.currentThread();
        this.i.setName(this.l);
        try {
            this.k.acquire();
            bky bkyVar = null;
            while (this.c && this.g != null) {
                try {
                    try {
                        b.fine(a, "run", "852");
                        this.j = this.g.available() > 0;
                        bmw a2 = this.g.a();
                        this.j = false;
                        if (a2 instanceof bmd) {
                            bkyVar = this.h.a(a2);
                            if (bkyVar != null) {
                                synchronized (bkyVar) {
                                    this.e.a((bmd) a2);
                                }
                            } else {
                                if (!(a2 instanceof bmo) && !(a2 instanceof bmn) && !(a2 instanceof bmm)) {
                                    throw new bks(6);
                                }
                                b.fine(a, "run", "857");
                            }
                        } else if (a2 != null) {
                            this.e.d(a2);
                        }
                    } catch (bks e) {
                        b.fine(a, "run", "856", null, e);
                        this.c = false;
                        this.f.a(bkyVar, e);
                    } catch (IOException e2) {
                        b.fine(a, "run", "853");
                        this.c = false;
                        if (!this.f.d()) {
                            this.f.a(bkyVar, new bks(32109, e2));
                        }
                    }
                } finally {
                    this.j = false;
                    this.k.release();
                }
            }
            b.fine(a, "run", "854");
        } catch (InterruptedException unused) {
            this.c = false;
        }
    }
}
