package defpackage;

import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: VuiRecyclerViewGlobalLayoutListener.java */
/* renamed from: bem  reason: default package */
/* loaded from: classes2.dex */
public class bem implements ViewTreeObserver.OnGlobalLayoutListener {
    private AtomicInteger a = new AtomicInteger(0);
    private bel b;

    public bem(bel belVar) {
        this.b = null;
        this.b = belVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.a.get() <= 0 || this.b == null) {
            return;
        }
        this.a.decrementAndGet();
        this.b.b();
    }

    public void a() {
        this.a.incrementAndGet();
    }
}
