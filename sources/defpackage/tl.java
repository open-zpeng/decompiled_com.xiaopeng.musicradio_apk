package defpackage;

import defpackage.tk;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ReuseItemPool.java */
/* renamed from: tl  reason: default package */
/* loaded from: classes3.dex */
public class tl<T extends tk> {
    private static AtomicLong c = new AtomicLong(0);
    private static AtomicLong d = new AtomicLong(0);
    private final int f = 20;
    private Integer e = null;
    private AtomicLong a = new AtomicLong(0);
    private AtomicLong b = new AtomicLong(0);
    private ConcurrentLinkedQueue<T> g = new ConcurrentLinkedQueue<>();
    private Set<Integer> h = new HashSet();

    public T a() {
        c.getAndIncrement();
        this.a.getAndIncrement();
        T poll = this.g.poll();
        if (poll != null) {
            this.h.remove(Integer.valueOf(System.identityHashCode(poll)));
            this.b.getAndIncrement();
            d.getAndIncrement();
        }
        return poll;
    }

    public void a(T t) {
        t.d();
        if (this.g.size() < 20) {
            synchronized (this.h) {
                int identityHashCode = System.identityHashCode(t);
                if (!this.h.contains(Integer.valueOf(identityHashCode))) {
                    this.h.add(Integer.valueOf(identityHashCode));
                    this.g.offer(t);
                }
            }
        }
    }
}
