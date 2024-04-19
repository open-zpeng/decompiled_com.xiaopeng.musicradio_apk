package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.commonui.widget.ThemeBgXImageView;
import com.xiaopeng.musicradio.mine.widget.ItemPlayStatusLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineMusicItemMainLayoutBindingImpl.java */
/* renamed from: akf  reason: default package */
/* loaded from: classes2.dex */
public class akf extends ake {
    private static final ViewDataBinding.b l = null;
    private static final SparseIntArray m = new SparseIntArray();
    private final XRelativeLayout n;
    private long o;

    static {
        m.put(aht.c.iv_click_view, 1);
        m.put(aht.c.tv_index_bg, 2);
        m.put(aht.c.tv_index, 3);
        m.put(aht.c.tv_local, 4);
        m.put(aht.c.iv_icon, 5);
        m.put(aht.c.iv_loading, 6);
        m.put(aht.c.item_play_status_layout, 7);
        m.put(aht.c.tv_title, 8);
        m.put(aht.c.tv_sub_title, 9);
    }

    public akf(f fVar, View view) {
        this(fVar, view, a(fVar, view, 10, l, m));
    }

    private akf(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ItemPlayStatusLayout) objArr[7], (ThemeBgXImageView) objArr[1], (XImageView) objArr[5], (XLoading) objArr[6], (XTextView) objArr[3], (XImageView) objArr[2], (XTextView) objArr[4], (XTextView) objArr[9], (XTextView) objArr[8]);
        this.o = -1L;
        this.n = (XRelativeLayout) objArr[0];
        this.n.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.o = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.o != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.o;
            this.o = 0L;
        }
    }
}
