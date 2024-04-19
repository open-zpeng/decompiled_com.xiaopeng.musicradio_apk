package defpackage;

import java.util.ArrayList;
/* compiled from: DisconnectedMessageBuffer.java */
/* renamed from: blh  reason: default package */
/* loaded from: classes3.dex */
public class blh implements Runnable {
    private static final bna a = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", "DisconnectedMessageBuffer");
    private bkg b;
    private blk e;
    private Object d = new Object();
    private ArrayList c = new ArrayList();

    public blh(bkg bkgVar) {
        this.b = bkgVar;
    }

    public void a(bmw bmwVar, bky bkyVar) {
        bkf bkfVar = new bkf(bmwVar, bkyVar);
        synchronized (this.d) {
            if (this.c.size() < this.b.a()) {
                this.c.add(bkfVar);
            } else if (this.b.d()) {
                this.c.remove(0);
                this.c.add(bkfVar);
            } else {
                throw new bks(32203);
            }
        }
    }

    public bkf a(int i) {
        bkf bkfVar;
        synchronized (this.d) {
            bkfVar = (bkf) this.c.get(i);
        }
        return bkfVar;
    }

    public void b(int i) {
        synchronized (this.d) {
            this.c.remove(i);
        }
    }

    public int a() {
        int size;
        synchronized (this.d) {
            size = this.c.size();
        }
        return size;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.fine("DisconnectedMessageBuffer", "run", "516");
        while (a() > 0) {
            try {
                this.e.a(a(0));
                b(0);
            } catch (bks unused) {
                a.warning("DisconnectedMessageBuffer", "run", "517");
                return;
            }
        }
    }

    public void a(blk blkVar) {
        this.e = blkVar;
    }

    public boolean b() {
        return this.b.c();
    }
}
