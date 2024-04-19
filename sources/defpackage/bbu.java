package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: RetrieverQueue.java */
/* renamed from: bbu  reason: default package */
/* loaded from: classes2.dex */
public class bbu<T> {
    private List<T> a = new ArrayList();

    public synchronized void a(T t) {
        if (t != null) {
            this.a.remove(t);
            this.a.add(t);
        }
    }

    public synchronized T a() {
        if (this.a.size() == 0) {
            return null;
        }
        T t = this.a.get(0);
        this.a.remove(0);
        return t;
    }

    public synchronized int b() {
        return this.a.size();
    }

    public synchronized void a(List<T> list) {
        for (T t : list) {
            b(t);
        }
    }

    public synchronized void b(T t) {
        if (this.a.remove(t)) {
            this.a.add(0, t);
        }
    }
}
