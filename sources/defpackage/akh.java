package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.mine.widget.AlbumPlayStatusButton;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineNetradioItemLayoutBindingImpl.java */
/* renamed from: akh  reason: default package */
/* loaded from: classes2.dex */
public class akh extends akg {
    private static final ViewDataBinding.b l = null;
    private static final SparseIntArray m = new SparseIntArray();
    private final XRelativeLayout n;
    private long o;

    static {
        m.put(aht.c.iv_logo_bg, 1);
        m.put(aht.c.iv_logo, 2);
        m.put(aht.c.iv_logo_shadow, 3);
        m.put(aht.c.iv_click_view, 4);
        m.put(aht.c.iv_ripple, 5);
        m.put(aht.c.tv_title, 6);
        m.put(aht.c.item_play_status_layout, 7);
        m.put(aht.c.btn_delete, 8);
        m.put(aht.c.tv_speech_num, 9);
    }

    public akh(f fVar, View view) {
        this(fVar, view, a(fVar, view, 10, l, m));
    }

    private akh(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XImageButton) objArr[8], (AlbumPlayStatusButton) objArr[7], (XFrameLayout) objArr[4], (MusicCircleImageView) objArr[2], (XImageView) objArr[1], (XImageView) objArr[3], (XImageView) objArr[5], (XTextView) objArr[9], (XTextView) objArr[6]);
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
