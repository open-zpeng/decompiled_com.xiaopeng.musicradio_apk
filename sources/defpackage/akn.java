package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: PlaylistUserItemLayoutBindingImpl.java */
/* renamed from: akn  reason: default package */
/* loaded from: classes2.dex */
public class akn extends akm {
    private static final ViewDataBinding.b h = null;
    private static final SparseIntArray i = new SparseIntArray();
    private long j;

    static {
        i.put(aht.c.iv_logo, 1);
        i.put(aht.c.iv_ripple, 2);
        i.put(aht.c.tv_title, 3);
        i.put(aht.c.tv_speech_num, 4);
    }

    public akn(f fVar, View view) {
        this(fVar, view, a(fVar, view, 5, h, i));
    }

    private akn(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XImageView) objArr[1], (XFrameLayout) objArr[2], (XRelativeLayout) objArr[0], (XTextView) objArr[4], (XTextView) objArr[3]);
        this.j = -1L;
        this.e.setTag(null);
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
