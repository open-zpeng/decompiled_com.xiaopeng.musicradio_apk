package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.databinding.m;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.bdm;
/* compiled from: ActivityWebViewBindingImpl.java */
/* renamed from: bdp  reason: default package */
/* loaded from: classes2.dex */
public class bdp extends bdo {
    private static final ViewDataBinding.b k = null;
    private static final SparseIntArray l = new SparseIntArray();
    private final XFrameLayout m;
    private long n;

    static {
        l.put(bdm.c.window_container, 1);
        l.put(bdm.c.web_view, 2);
        l.put(bdm.c.web_view_overlay, 3);
        l.put(bdm.c.fl_loading, 4);
        l.put(bdm.c.loading, 5);
        l.put(bdm.c.layout_h5_fail, 6);
        l.put(bdm.c.btn_back, 7);
        l.put(bdm.c.tv_title, 8);
    }

    public bdp(f fVar, View view) {
        this(fVar, view, a(fVar, view, 9, k, l));
    }

    private bdp(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XImageButton) objArr[7], (XFrameLayout) objArr[4], new m((ViewStub) objArr[6]), (XLoading) objArr[5], (XTextView) objArr[8], (WebView) objArr[2], (XImageView) objArr[3], (XFrameLayout) objArr[1]);
        this.n = -1L;
        this.e.a(this);
        this.m = (XFrameLayout) objArr[0];
        this.m.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.n = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.n != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.n;
            this.n = 0L;
        }
        if (this.e.a() != null) {
            a(this.e.a());
        }
    }
}
