package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ScheduledThreadModel.java */
/* renamed from: bam  reason: default package */
/* loaded from: classes2.dex */
public class bam implements Runnable {
    private ScheduledExecutorService a;
    private boolean b = false;
    private a c;

    /* compiled from: ScheduledThreadModel.java */
    /* renamed from: bam$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public bam(a aVar) {
        this.c = aVar;
    }

    public void a(int i) {
        if (this.c == null || this.b) {
            return;
        }
        this.b = true;
        if (this.a == null) {
            this.a = new ScheduledThreadPoolExecutor(1);
        }
        this.a.scheduleAtFixedRate(this, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void a() {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.a = null;
        this.b = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
