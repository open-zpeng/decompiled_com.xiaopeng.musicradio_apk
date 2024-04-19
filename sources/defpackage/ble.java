package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: CommsSender.java */
/* renamed from: ble  reason: default package */
/* loaded from: classes3.dex */
public class ble implements Runnable {
    private static final String a = "ble";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private blb e;
    private bmi f;
    private bla g;
    private blf h;
    private String j;
    private Future l;
    private boolean c = false;
    private Object d = new Object();
    private Thread i = null;
    private final Semaphore k = new Semaphore(1);

    public ble(bla blaVar, blb blbVar, blf blfVar, OutputStream outputStream) {
        this.e = null;
        this.g = null;
        this.h = null;
        this.f = new bmi(blbVar, outputStream);
        this.g = blaVar;
        this.e = blbVar;
        this.h = blfVar;
        b.setResourceName(blaVar.h().b());
    }

    public void a(String str, ExecutorService executorService) {
        this.j = str;
        synchronized (this.d) {
            if (!this.c) {
                this.c = true;
                this.l = executorService.submit(this);
            }
        }
    }

    public void a() {
        Semaphore semaphore;
        synchronized (this.d) {
            if (this.l != null) {
                this.l.cancel(true);
            }
            b.fine(a, "stop", "800");
            if (this.c) {
                this.c = false;
                if (!Thread.currentThread().equals(this.i)) {
                    while (this.c) {
                        try {
                            this.e.h();
                            this.k.tryAcquire(100L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                            semaphore = this.k;
                        } catch (Throwable th) {
                            this.k.release();
                            throw th;
                        }
                    }
                    semaphore = this.k;
                    semaphore.release();
                }
            }
            this.i = null;
            b.fine(a, "stop", "801");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.i = Thread.currentThread();
        this.i.setName(this.j);
        try {
            this.k.acquire();
            bmw bmwVar = null;
            while (this.c && this.f != null) {
                try {
                    try {
                        bmwVar = this.e.e();
                        if (bmwVar != null) {
                            b.fine(a, "run", "802", new Object[]{bmwVar.e(), bmwVar});
                            if (bmwVar instanceof bmd) {
                                this.f.a(bmwVar);
                                this.f.flush();
                            } else {
                                bky a2 = this.h.a(bmwVar);
                                if (a2 != null) {
                                    synchronized (a2) {
                                        this.f.a(bmwVar);
                                        try {
                                            this.f.flush();
                                        } catch (IOException e) {
                                            if (!(bmwVar instanceof bmg)) {
                                                throw e;
                                                break;
                                            }
                                        }
                                        this.e.c(bmwVar);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            b.fine(a, "run", "803");
                            this.c = false;
                        }
                    } catch (bks e2) {
                        a(bmwVar, e2);
                    } catch (Exception e3) {
                        a(bmwVar, e3);
                    }
                } catch (Throwable th) {
                    this.c = false;
                    this.k.release();
                    throw th;
                }
            }
            this.c = false;
            this.k.release();
            b.fine(a, "run", "805");
        } catch (InterruptedException unused) {
            this.c = false;
        }
    }

    private void a(bmw bmwVar, Exception exc) {
        bks bksVar;
        b.fine(a, "handleRunException", "804", null, exc);
        if (!(exc instanceof bks)) {
            bksVar = new bks(32109, exc);
        } else {
            bksVar = (bks) exc;
        }
        this.c = false;
        this.g.a((bky) null, bksVar);
    }
}
