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
/* compiled from: MineAlbumItemLayoutBindingImpl.java */
/* renamed from: akb  reason: default package */
/* loaded from: classes2.dex */
public class akb extends aka {
    private static final ViewDataBinding.b k = null;
    private static final SparseIntArray l = new SparseIntArray();
    private final XRelativeLayout m;
    private long n;

    static {
        l.put(aht.c.iv_logo, 1);
        l.put(aht.c.iv_logo_shadow, 2);
        l.put(aht.c.iv_ripple, 3);
        l.put(aht.c.tv_title, 4);
        l.put(aht.c.item_play_status_layout, 5);
        l.put(aht.c.btn_delete, 6);
        l.put(aht.c.btn_rename, 7);
        l.put(aht.c.tv_speech_num, 8);
    }

    public akb(f fVar, View view) {
        this(fVar, view, a(fVar, view, 9, k, l));
    }

    private akb(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XImageButton) objArr[6], (XTextView) objArr[7], (AlbumPlayStatusButton) objArr[5], (MusicCircleImageView) objArr[1], (XImageView) objArr[2], (XFrameLayout) objArr[3], (XTextView) objArr[8], (XTextView) objArr[4]);
        this.n = -1L;
        this.m = (XRelativeLayout) objArr[0];
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
    }
}
