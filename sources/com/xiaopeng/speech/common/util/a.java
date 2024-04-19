package com.xiaopeng.speech.common.util;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: AsyncRunner.java */
/* loaded from: classes2.dex */
public abstract class a<IFunc> {
    protected e b;
    protected String a = "AsyncRunner";
    private Queue<IFunc> c = new ArrayBlockingQueue(100);

    protected abstract boolean a();

    protected abstract <R> R b(IFunc ifunc);

    public a(String str) {
        this.a += "-" + str;
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    public void a(IFunc ifunc) {
        a(ifunc, null);
    }

    public synchronized <R> R a(IFunc ifunc, R r) {
        if (a()) {
            if (this.c.size() > 0) {
                this.c.offer(ifunc);
                b();
                c.b(this.a, "can run offer fun");
            } else {
                return (R) b(ifunc);
            }
        } else {
            this.c.offer(ifunc);
            c.b(this.a, "offer fun");
        }
        return r;
    }

    public void b() {
        c.b(this.a, "fetchAll fun:%d", Integer.valueOf(this.c.size()));
        e eVar = this.b;
        if (eVar != null) {
            eVar.post(new Runnable() { // from class: com.xiaopeng.speech.common.util.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.c();
                }
            });
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        while (this.c.size() > 0) {
            IFunc poll = this.c.poll();
            if (a() && poll != null) {
                b(poll);
            }
        }
    }
}
