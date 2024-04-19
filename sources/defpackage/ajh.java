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
/* compiled from: ActivityCollectedMusicListBindingImpl.java */
/* renamed from: ajh  reason: default package */
/* loaded from: classes2.dex */
public class ajh extends ajg {
    private static final ViewDataBinding.b k = null;
    private static final SparseIntArray l = new SparseIntArray();
    private final XRelativeLayout m;
    private long n;

    static {
        l.put(aht.c.loading_tips_view, 1);
        l.put(aht.c.title_bar, 2);
        l.put(aht.c.logo_view, 3);
        l.put(aht.c.rv_list, 4);
        l.put(aht.c.rl_edit_bar, 5);
        l.put(aht.c.tv_delete_btn, 6);
        l.put(aht.c.iv_delete_btn_img, 7);
        l.put(aht.c.tv_playlist_btn, 8);
    }

    public ajh(f fVar, View view) {
        this(fVar, view, a(fVar, view, 9, k, l));
    }

    private ajh(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XImageView) objArr[7], (ClickableLoadingTipsView) objArr[1], (MusicListLogoView) objArr[3], (XRelativeLayout) objArr[5], (ListRecyclerView) objArr[4], (MineTitleBarLayout) objArr[2], (XButton) objArr[6], (XButton) objArr[8]);
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
