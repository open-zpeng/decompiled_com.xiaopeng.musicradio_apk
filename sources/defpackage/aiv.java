package defpackage;

import android.view.ViewGroup;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.g;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.y;
import defpackage.aht;
/* compiled from: AlbumViewHolder.java */
/* renamed from: aiv  reason: default package */
/* loaded from: classes2.dex */
public class aiv extends g<aka> {
    private boolean A;
    private boolean y;
    private boolean z;

    public aiv(aka akaVar, boolean z) {
        this(akaVar, z, false, false);
    }

    public aiv(aka akaVar, boolean z, boolean z2, boolean z3) {
        super(akaVar, true);
        this.y = z;
        this.z = z2;
        this.A = z3;
        if (z) {
            akaVar.c.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) akaVar.f.getLayoutParams()).topMargin = akaVar.f().getResources().getDimensionPixelSize(aht.a.mine_album_edit_logo_margin_top);
        }
        akaVar.c.setOnClickListener(this);
        akaVar.e.setOnClickListener(this);
        akaVar.d.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        super.c(i);
        MusicRadioItem musicRadioItem = (MusicRadioItem) D();
        ((aka) this.t).j.setText(musicRadioItem.getTitle());
        y.a(musicRadioItem.getLogoUrl(), aht.b.pic_covers_music_220, ((aka) this.t).f);
        boolean a = a(musicRadioItem);
        if (this.A) {
            ((aka) this.t).e.setVisibility(8);
        } else {
            ((aka) this.t).e.setVisibility(0);
        }
        if (this.y && this.w.r()) {
            ((aka) this.t).h.setVisibility(8);
            ((aka) this.t).g.setSelected(true);
            ((aka) this.t).j.setAlpha(0.36f);
            ((aka) this.t).c.setVisibility(0);
            ((aka) this.t).e.setVisibility(8);
            ((aka) this.t).f().setOnClickListener(null);
            if (this.z) {
                ((aka) this.t).d.setVisibility(0);
            } else {
                ((aka) this.t).d.setVisibility(8);
            }
            amo.b(((aka) this.t).i, aht.c.iv_logo);
        } else {
            ((aka) this.t).h.setVisibility(0);
            ((aka) this.t).d.setVisibility(8);
            ((aka) this.t).g.setSelected(false);
            ((aka) this.t).j.setAlpha(1.0f);
            if (this.y) {
                ((aka) this.t).c.setVisibility(4);
            }
            ((aka) this.t).e.setVisibility(0);
            ((aka) this.t).f().setOnClickListener(this);
            amo.a(((aka) this.t).i, aht.c.iv_logo);
        }
        int i2 = i + 1;
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            i2 += a("SPEECH_NUM_OFFSET", 0);
        }
        ((aka) this.t).i.setText(String.valueOf(i2));
        G();
        amk.a(this.a, i, i2, musicRadioItem.getTitle(), "alb_item_");
        if (!this.A) {
            amk.a(((aka) this.t).e, i, (String) null, a, "alb_play_");
        }
        amk.a(this.a, big.CLICK);
        if (this.y) {
            amk.c(((aka) this.t).c, true);
            amk.a(((aka) this.t).c, i, this.r.getString(aht.e.delete), "alb_del_");
        }
        if (this.z) {
            amk.c(((aka) this.t).d, true);
            amk.a(((aka) this.t).d, i, this.r.getString(aht.e.playlist_custom_rename), "alb_rename_");
        }
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            return;
        }
        amk.b(this.a);
    }

    public void G() {
        ((aka) this.t).i.setVisibility(h.a().b() ? 0 : 8);
    }

    private boolean a(MusicRadioItem musicRadioItem) {
        int i = -1;
        if (aml.b(musicRadioItem)) {
            this.w.f(this.u);
            i = aml.b();
        } else if (this.w.m() == this.u) {
            this.w.a(-1, false);
        }
        return ((aka) this.t).e.a(i);
    }
}
