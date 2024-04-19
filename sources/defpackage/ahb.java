package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
/* compiled from: ActivityLoginBindingImpl.java */
/* renamed from: ahb  reason: default package */
/* loaded from: classes2.dex */
public class ahb extends aha {
    private static final ViewDataBinding.b c = null;
    private static final SparseIntArray d = null;
    private final FrameLayout e;
    private long f;

    public ahb(f fVar, View view) {
        this(fVar, view, a(fVar, view, 1, c, d));
    }

    private ahb(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0);
        this.f = -1L;
        this.e = (FrameLayout) objArr[0];
        this.e.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.f = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.f != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.f;
            this.f = 0L;
        }
    }
}
