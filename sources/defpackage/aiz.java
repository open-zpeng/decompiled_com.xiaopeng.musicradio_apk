package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.g;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.y;
import defpackage.aht;
/* compiled from: ProgramViewHolder.java */
/* renamed from: aiz  reason: default package */
/* loaded from: classes2.dex */
public class aiz extends g<aki> {
    private boolean y;

    public aiz(aki akiVar, boolean z) {
        super(akiVar, true);
        this.y = z;
        if (z) {
            akiVar.c.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) akiVar.e.getLayoutParams()).topMargin = akiVar.f().getResources().getDimensionPixelSize(aht.a.mine_album_edit_logo_margin_top);
        }
        akiVar.c.setOnClickListener(this);
        akiVar.d.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        super.c(i);
        RdAlbumBean rdAlbumBean = (RdAlbumBean) D();
        ((aki) this.t).j.setText(rdAlbumBean.getTitle());
        y.a(b(rdAlbumBean), aht.b.pic_program_default_220, ((aki) this.t).e);
        boolean a = a(rdAlbumBean);
        if (this.y && this.w.r()) {
            ((aki) this.t).g.setVisibility(8);
            ((aki) this.t).f.setSelected(true);
            ((aki) this.t).j.setAlpha(0.36f);
            ((aki) this.t).c.setVisibility(0);
            ((aki) this.t).d.setVisibility(8);
            ((aki) this.t).f().setOnClickListener(null);
            amo.b(((aki) this.t).i, aht.c.iv_logo);
        } else {
            ((aki) this.t).g.setVisibility(0);
            ((aki) this.t).f.setSelected(false);
            ((aki) this.t).j.setAlpha(1.0f);
            ((aki) this.t).c.setVisibility(8);
            ((aki) this.t).d.setVisibility(0);
            ((aki) this.t).f().setOnClickListener(this);
            amo.a(((aki) this.t).i, aht.c.iv_logo);
        }
        if (rdAlbumBean.getPaymentType() == 0) {
            ((aki) this.t).h.setImageDrawable(null);
        } else if (rdAlbumBean.getPaymentType() == 1) {
            ((aki) this.t).h.setImageResource(aht.b.ic_xmly_cover_label_vip);
        } else if (rdAlbumBean.getPaymentType() == 2) {
            ((aki) this.t).h.setImageResource(aht.b.ic_xmly_cover_label_payment);
        } else {
            ((aki) this.t).h.setImageDrawable(null);
        }
        int i2 = i + 1;
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            i2 += a("SPEECH_NUM_OFFSET", 0);
        }
        ((aki) this.t).i.setText(String.valueOf(i2));
        G();
        amk.a(this.a, i, i2, rdAlbumBean.getTitle(), "pro_item_");
        amk.a(((aki) this.t).d, i, (String) null, a, "pro_play_");
        amk.a(this.a, big.CLICK);
        if (this.y) {
            amk.c(((aki) this.t).c, true);
            amk.a(((aki) this.t).c, i, this.r.getString(aht.e.delete), "pro_del_");
        }
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            return;
        }
        amk.b(this.a);
    }

    public void G() {
        ((aki) this.t).i.setVisibility(h.a().b() ? 0 : 8);
    }

    private boolean a(RdAlbumBean rdAlbumBean) {
        int i = -1;
        if (amn.b(rdAlbumBean)) {
            this.w.f(this.u);
            i = amn.b();
        } else if (this.w.m() == this.u) {
            this.w.a(-1, false);
        }
        return ((aki) this.t).d.a(i);
    }

    private String b(RdAlbumBean rdAlbumBean) {
        String mediumLogo = rdAlbumBean.getMediumLogo();
        if (TextUtils.isEmpty(mediumLogo)) {
            mediumLogo = rdAlbumBean.getLargeLogo();
        }
        return TextUtils.isEmpty(mediumLogo) ? rdAlbumBean.getSmallLogo() : mediumLogo;
    }
}
