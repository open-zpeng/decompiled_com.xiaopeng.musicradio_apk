package defpackage;

import com.nforetek.bt.aidl.l;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: AbstractConnection.java */
/* renamed from: abc  reason: default package */
/* loaded from: classes2.dex */
public abstract class abc {
    private LinkedList<Runnable> a = new LinkedList<>();

    /* compiled from: AbstractConnection.java */
    /* renamed from: abc$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(l lVar);

    public void b(l lVar) {
        a(lVar);
        b();
    }

    void b() {
        Iterator<Runnable> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().run();
            it.remove();
        }
    }
}
