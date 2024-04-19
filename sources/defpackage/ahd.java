package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.xiaopeng.musicradio.vip.view.VipSaleBanner;
import com.xiaopeng.musicradio.widget.AccountImageLayout;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.agy;
/* compiled from: FragmentLoginManagerBindingImpl.java */
/* renamed from: ahd  reason: default package */
/* loaded from: classes2.dex */
public class ahd extends ahc {
    private static final ViewDataBinding.b C = null;
    private static final SparseIntArray D = new SparseIntArray();
    private long E;

    static {
        D.put(agy.b.vipsale_banner, 1);
        D.put(agy.b.ll_qq_account, 2);
        D.put(agy.b.iv_qq_logo, 3);
        D.put(agy.b.tv_qq_name, 4);
        D.put(agy.b.iv_qq_logo_big, 5);
        D.put(agy.b.iv_qq_avatar, 6);
        D.put(agy.b.tv_qq_no_login, 7);
        D.put(agy.b.tv_qq_nick_name, 8);
        D.put(agy.b.qq_image_layout, 9);
        D.put(agy.b.tv_qq_vip_tips, 10);
        D.put(agy.b.btn_vip_buying, 11);
        D.put(agy.b.btn_logout, 12);
        D.put(agy.b.btn_login_wx, 13);
        D.put(agy.b.btn_login_qq, 14);
        D.put(agy.b.ll_xmly_account, 15);
        D.put(agy.b.iv_xmly_logo, 16);
        D.put(agy.b.tv_xmly_name, 17);
        D.put(agy.b.iv_xmly_logo_big, 18);
        D.put(agy.b.iv_xmly_avatar, 19);
        D.put(agy.b.tv_xmly_no_login, 20);
        D.put(agy.b.tv_xmly_nick_name, 21);
        D.put(agy.b.tv_xmly_vip_tips, 22);
        D.put(agy.b.btn_xmly_vip_buying, 23);
        D.put(agy.b.btn_xmly_logout, 24);
        D.put(agy.b.btn_xmly_login, 25);
    }

    public ahd(f fVar, View view) {
        this(fVar, view, a(fVar, view, 26, C, D));
    }

    private ahd(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (XButton) objArr[14], (XButton) objArr[13], (XButton) objArr[12], (XTextView) objArr[11], (XButton) objArr[25], (XButton) objArr[24], (XTextView) objArr[23], (MusicCircleImageView) objArr[6], (XImageView) objArr[3], (XImageView) objArr[5], (MusicCircleImageView) objArr[19], (XImageView) objArr[16], (XImageView) objArr[18], (XRelativeLayout) objArr[2], (XRelativeLayout) objArr[15], (AccountImageLayout) objArr[9], (XRelativeLayout) objArr[0], (XTextView) objArr[4], (XTextView) objArr[8], (XTextView) objArr[7], (XTextView) objArr[10], (XTextView) objArr[17], (XTextView) objArr[21], (XTextView) objArr[20], (XTextView) objArr[22], (VipSaleBanner) objArr[1]);
        this.E = -1L;
        this.s.setTag(null);
        a(view);
        d();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void d() {
        synchronized (this) {
            this.E = 1L;
        }
        g();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean e() {
        synchronized (this) {
            return this.E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void c() {
        synchronized (this) {
            long j = this.E;
            this.E = 0L;
        }
    }
}
