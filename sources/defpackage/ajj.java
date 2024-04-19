package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout;
import com.xiaopeng.musicradio.mine.widget.MusicListLogoView;
import com.xiaopeng.musicradio.widget.ClickableLoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.ListRecyclerView;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import defpackage.aht;
/* compiled from: ActivityCustomDetailListBindingImpl.java */
/* renamed from: ajj  reason: default package */
/* loaded from: classes2.dex */
public class ajj extends aji {
    private static final ViewDataBinding.b j = null;
    private static final SparseIntArray k = new SparseIntArray();
    private final XRelativeLayout l;
    private long m;

    static {
        k.put(aht.c.title_bar, 1);
        k.put(aht.c.logo_view, 2);
        k.put(aht.c.loading_tips_view, 3);
        k.put(aht.c.rv_list, 4);
        k.put(aht.c.rl_edit_bar, 5);
        k.put(aht.c.tv_delete_btn, 6);
        k.put(aht.c.iv_delete_btn_img, 7);
    }

    public ajj(f fVar, View view) {
        this(fVar, view, a(fVar, view, 8, j, k));
    }

    private ajj(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XImageView) objArr[7], (ClickableLoadingTipsView) objArr[3], (MusicListLogoView) objArr[2], (XRelativeLayout) objArr[5], (ListRecyclerView) objArr[4], (MineTitleBarLayout) objArr[1], (XButton) objArr[6]);
        this.m = -1L;
        this.l = (XRelativeLayout) objArr[0];
        this.l.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.m = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.m != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j2 = this.m;
            this.m = 0L;
        }
    }
}
