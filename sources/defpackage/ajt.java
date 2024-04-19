package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import com.xiaopeng.xui.widget.XFrameLayout;
import defpackage.aht;
/* compiled from: FragmentMineCollectBindingImpl.java */
/* renamed from: ajt  reason: default package */
/* loaded from: classes2.dex */
public class ajt extends ajs {
    private static final ViewDataBinding.b e = null;
    private static final SparseIntArray f = new SparseIntArray();
    private final XFrameLayout g;
    private long h;

    static {
        f.put(aht.c.loading_tips_view, 1);
        f.put(aht.c.rv_list, 2);
    }

    public ajt(f fVar, View view) {
        this(fVar, view, a(fVar, view, 3, e, f));
    }

    private ajt(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MineLoadingTipsView) objArr[1], (ListRecyclerView) objArr[2]);
        this.h = -1L;
        this.g = (XFrameLayout) objArr[0];
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
