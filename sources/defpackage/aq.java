package defpackage;

import java.util.concurrent.Executor;
/* compiled from: ArchTaskExecutor.java */
/* renamed from: aq  reason: default package */
/* loaded from: classes2.dex */
public class aq extends as {
    private static volatile aq a;
    private static final Executor d = new Executor() { // from class: aq.1
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            aq.a().b(runnable);
        }
    };
    private static final Executor e = new Executor() { // from class: aq.2
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            aq.a().a(runnable);
        }
    };
    private as c = new ar();
    private as b = this.c;

    private aq() {
    }

    public static aq a() {
        if (a != null) {
            return a;
        }
        synchronized (aq.class) {
            if (a == null) {
                a = new aq();
            }
        }
        return a;
    }

    @Override // defpackage.as
    public void a(Runnable runnable) {
        this.b.a(runnable);
    }

    @Override // defpackage.as
    public void b(Runnable runnable) {
        this.b.b(runnable);
    }

    @Override // defpackage.as
    public boolean b() {
        return this.b.b();
    }
}
