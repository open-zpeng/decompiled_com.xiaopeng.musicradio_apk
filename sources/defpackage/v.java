package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ContextAwareHelper.java */
/* renamed from: v  reason: default package */
/* loaded from: classes3.dex */
public final class v {
    private final Set<w> a = new CopyOnWriteArraySet();
    private volatile Context b;

    public Context a() {
        return this.b;
    }

    public void a(w wVar) {
        if (this.b != null) {
            wVar.a(this.b);
        }
        this.a.add(wVar);
    }

    public void b(w wVar) {
        this.a.remove(wVar);
    }

    public void a(Context context) {
        this.b = context;
        for (w wVar : this.a) {
            wVar.a(context);
        }
    }

    public void b() {
        this.b = null;
    }
}
