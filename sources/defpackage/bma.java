package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
/* compiled from: WebSocketReceiver.java */
/* renamed from: bma  reason: default package */
/* loaded from: classes3.dex */
public class bma implements Runnable {
    private static final String a = "bma";
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private InputStream f;
    private volatile boolean h;
    private boolean c = false;
    private boolean d = false;
    private Object e = new Object();
    private Thread g = null;
    private PipedOutputStream i = new PipedOutputStream();

    public bma(InputStream inputStream, PipedInputStream pipedInputStream) {
        this.f = inputStream;
        pipedInputStream.connect(this.i);
    }

    public void a(String str) {
        b.fine(a, "start", "855");
        synchronized (this.e) {
            if (!this.c) {
                this.c = true;
                this.g = new Thread(this, str);
                this.g.start();
            }
        }
    }

    public void a() {
        boolean z = true;
        this.d = true;
        synchronized (this.e) {
            b.fine(a, "stop", "850");
            if (this.c) {
                this.c = false;
                this.h = false;
                b();
            } else {
                z = false;
            }
        }
        if (z && !Thread.currentThread().equals(this.g)) {
            try {
                this.g.join();
            } catch (InterruptedException unused) {
            }
        }
        this.g = null;
        b.fine(a, "stop", "851");
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.c && this.f != null) {
            try {
                b.fine(a, "run", "852");
                this.h = this.f.available() > 0;
                blx blxVar = new blx(this.f);
                if (!blxVar.b()) {
                    for (int i = 0; i < blxVar.a().length; i++) {
                        this.i.write(blxVar.a()[i]);
                    }
                    this.i.flush();
                } else if (!this.d) {
                    throw new IOException("Server sent a WebSocket Frame with the Stop OpCode");
                    break;
                }
                this.h = false;
            } catch (IOException unused) {
                a();
            }
        }
    }

    private void b() {
        try {
            this.i.close();
        } catch (IOException unused) {
        }
    }
}
