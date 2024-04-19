package defpackage;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.datalist.g;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.y;
import defpackage.aht;
/* compiled from: NetradioViewHolder.java */
/* renamed from: aiy  reason: default package */
/* loaded from: classes2.dex */
public class aiy extends g<akg> {
    private boolean y;

    public aiy(akg akgVar, boolean z) {
        super(akgVar, false);
        this.y = z;
        akgVar.c.setOnClickListener(this);
        akgVar.d.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        super.c(i);
        NetRadioInfo netRadioInfo = (NetRadioInfo) D();
        ((akg) this.t).k.setText(netRadioInfo.getName());
        y.a(netRadioInfo.getPicUrl(), aht.b.pic_netradio_cover_180, ((akg) this.t).f);
        boolean a = a(netRadioInfo);
        if (this.y && this.w.r()) {
            ((akg) this.t).i.setVisibility(8);
            ((akg) this.t).h.setSelected(true);
            ((akg) this.t).k.setAlpha(0.36f);
            ((akg) this.t).c.setVisibility(0);
            ((akg) this.t).g.setSelected(false);
            ((akg) this.t).d.setVisibility(8);
            this.a.setOnClickListener(null);
            ((akg) this.t).e.setOnClickListener(null);
            amo.b(((akg) this.t).j, aht.c.iv_logo_bg);
        } else {
            ((akg) this.t).i.setVisibility(0);
            ((akg) this.t).h.setSelected(false);
            ((akg) this.t).k.setAlpha(1.0f);
            ((akg) this.t).c.setVisibility(8);
            ((akg) this.t).g.setSelected(a);
            ((akg) this.t).d.setVisibility(0);
            this.a.setOnClickListener(this);
            ((akg) this.t).e.setOnClickListener(this);
            amo.a(((akg) this.t).j, aht.c.iv_logo_bg);
        }
        int i2 = i + 1;
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            i2 += a("SPEECH_NUM_OFFSET", 0);
        }
        ((akg) this.t).j.setText(String.valueOf(i2));
        G();
        amk.a(this.a, i, i2, netRadioInfo.getName(), "nr_item_");
        amk.a(this.a, big.CLICK);
        amk.a(((akg) this.t).e, i, (String) null, a, "nr_play_");
        if (this.y) {
            amk.c(((akg) this.t).c, true);
            amk.a(((akg) this.t).c, i, this.r.getString(aht.e.delete), "nr_del_");
        }
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            return;
        }
        amk.b(this.a);
    }

    public void G() {
        ((akg) this.t).j.setVisibility(h.a().b() ? 0 : 8);
    }

    private boolean a(NetRadioInfo netRadioInfo) {
        int i = -1;
        if (amm.b(netRadioInfo)) {
            this.w.f(this.u);
            i = amm.b();
        } else if (this.w.m() == this.u) {
            this.w.a(-1, false);
        }
        return ((akg) this.t).d.a(i);
    }
}
