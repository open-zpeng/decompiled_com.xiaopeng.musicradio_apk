package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import defpackage.aht;
/* compiled from: ActivityAlbumListBindingImpl.java */
/* renamed from: ajf  reason: default package */
/* loaded from: classes2.dex */
public class ajf extends aje {
    private static final ViewDataBinding.b f = null;
    private static final SparseIntArray g = new SparseIntArray();
    private final XRelativeLayout h;
    private long i;

    static {
        g.put(aht.c.loading_tips_view, 1);
        g.put(aht.c.rv_list, 2);
        g.put(aht.c.title_bar, 3);
    }

    public ajf(f fVar, View view) {
        this(fVar, view, a(fVar, view, 4, f, g));
    }

    private ajf(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ClickableLoadingTipsView) objArr[1], (ListRecyclerView) objArr[2], (MineTitleBarLayout) objArr[3]);
        this.i = -1L;
        this.h = (XRelativeLayout) objArr[0];
        this.h.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.i = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.i != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.i;
            this.i = 0L;
        }
    }
}
