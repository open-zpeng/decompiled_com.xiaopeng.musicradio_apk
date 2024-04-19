package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import defpackage.aht;
/* compiled from: FragmentMineMainBindingImpl.java */
/* renamed from: ajx  reason: default package */
/* loaded from: classes2.dex */
public class ajx extends ajw {
    private static final ViewDataBinding.b e = null;
    private static final SparseIntArray f = new SparseIntArray();
    private final FrameLayout g;
    private long h;

    static {
        f.put(aht.c.tab_list_view, 1);
        f.put(aht.c.page_fragment_container, 2);
    }

    public ajx(f fVar, View view) {
        this(fVar, view, a(fVar, view, 3, e, f));
    }

    private ajx(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[2], (ListRecyclerView) objArr[1]);
        this.h = -1L;
        this.g = (FrameLayout) objArr[0];
        this.g.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.h = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.h != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.h;
            this.h = 0L;
        }
    }
}
