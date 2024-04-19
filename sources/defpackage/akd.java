package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.commonui.widget.ThemeBgXImageView;
import com.xiaopeng.musicradio.mine.widget.ItemPlayStatusLayout;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XCheckBox;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aht;
/* compiled from: MineMusicItemLayoutBindingImpl.java */
/* renamed from: akd  reason: default package */
/* loaded from: classes2.dex */
public class akd extends akc {
    private static final ViewDataBinding.b q = null;
    private static final SparseIntArray r = new SparseIntArray();
    private final XRelativeLayout s;
    private long t;

    static {
        r.put(aht.c.iv_click_view, 1);
        r.put(aht.c.tv_index_bg, 2);
        r.put(aht.c.tv_index, 3);
        r.put(aht.c.tv_local, 4);
        r.put(aht.c.iv_icon, 5);
        r.put(aht.c.iv_loading, 6);
        r.put(aht.c.iv_logo, 7);
        r.put(aht.c.iv_logo_shadow, 8);
        r.put(aht.c.ll_music_info, 9);
        r.put(aht.c.tv_title, 10);
        r.put(aht.c.music_label, 11);
        r.put(aht.c.tv_sub_title, 12);
        r.put(aht.c.cb_select, 13);
        r.put(aht.c.item_play_status_layout, 14);
    }

    public akd(f fVar, View view) {
        this(fVar, view, a(fVar, view, 15, q, r));
    }

    private akd(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XCheckBox) objArr[13], (ItemPlayStatusLayout) objArr[14], (ThemeBgXImageView) objArr[1], (XImageView) objArr[5], (XLoading) objArr[6], (MusicCircleImageView) objArr[7], (XImageView) objArr[8], (LinearLayout) objArr[9], (MusicListItemLabelView) objArr[11], (XTextView) objArr[3], (XImageView) objArr[2], (XTextView) objArr[4], (XTextView) objArr[12], (XTextView) objArr[10]);
        this.t = -1L;
        this.s = (XRelativeLayout) objArr[0];
        this.s.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.t = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.t != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.t;
            this.t = 0L;
        }
    }
}
