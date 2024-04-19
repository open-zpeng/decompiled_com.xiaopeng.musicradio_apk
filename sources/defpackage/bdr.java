package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.bdm;
/* compiled from: LayoutWebViewFailBindingImpl.java */
/* renamed from: bdr  reason: default package */
/* loaded from: classes2.dex */
public class bdr extends bdq {
    private static final ViewDataBinding.b h = null;
    private static final SparseIntArray i = new SparseIntArray();
    private long j;

    static {
        i.put(bdm.c.iv_fail, 1);
        i.put(bdm.c.tv_fail, 2);
        i.put(bdm.c.tv_fail_desc, 3);
        i.put(bdm.c.btn_refresh, 4);
    }

    public bdr(f fVar, View view) {
        this(fVar, view, a(fVar, view, 5, h, i));
    }

    private bdr(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XButton) objArr[4], (XLinearLayout) objArr[0], (XImageView) objArr[1], (XTextView) objArr[2], (XTextView) objArr[3]);
        this.j = -1L;
        this.d.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.j = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.j != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.j;
            this.j = 0L;
        }
    }
}
