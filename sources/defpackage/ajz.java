package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: FragmentMinePlaylistBindingImpl.java */
/* renamed from: ajz  reason: default package */
/* loaded from: classes2.dex */
public class ajz extends ajy {
    private static final ViewDataBinding.b h = null;
    private static final SparseIntArray i = new SparseIntArray();
    private final XRelativeLayout j;
    private long k;

    static {
        i.put(aht.c.rl_category_title, 1);
        i.put(aht.c.tv_category_title, 2);
        i.put(aht.c.btn_import, 3);
        i.put(aht.c.loading_tips_view, 4);
        i.put(aht.c.rv_list, 5);
    }

    public ajz(f fVar, View view) {
        this(fVar, view, a(fVar, view, 6, h, i));
    }

    private ajz(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XTextView) objArr[3], (MineLoadingTipsView) objArr[4], (RelativeLayout) objArr[1], (ListRecyclerView) objArr[5], (XTextView) objArr[2]);
        this.k = -1L;
        this.j = (XRelativeLayout) objArr[0];
        this.j.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.k = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.k != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.k;
            this.k = 0L;
        }
    }
}
