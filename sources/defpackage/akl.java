package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.AlbumPlayStatusButton;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: PlaylistBlueViewBindingImpl.java */
/* renamed from: akl  reason: default package */
/* loaded from: classes2.dex */
public class akl extends akk {
    private static final ViewDataBinding.b j = null;
    private static final SparseIntArray k = new SparseIntArray();
    private final RelativeLayout l;
    private long m;

    static {
        k.put(aht.c.tv_category_title, 1);
        k.put(aht.c.rl_category_item, 2);
        k.put(aht.c.fl_blue_logo, 3);
        k.put(aht.c.logo_1, 4);
        k.put(aht.c.logo_2, 5);
        k.put(aht.c.logo_3, 6);
        k.put(aht.c.item_play_status_layout, 7);
    }

    public akl(f fVar, View view) {
        this(fVar, view, a(fVar, view, 8, j, k));
    }

    private akl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XFrameLayout) objArr[3], (AlbumPlayStatusButton) objArr[7], (XImageView) objArr[4], (XImageView) objArr[5], (XImageView) objArr[6], (XRelativeLayout) objArr[2], (XTextView) objArr[1]);
        this.m = -1L;
        this.l = (RelativeLayout) objArr[0];
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
