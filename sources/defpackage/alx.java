package defpackage;

import android.view.ViewGroup;
import com.xiaopeng.musicradio.datalist.g;
import com.xiaopeng.musicradio.model.dui.h;
import defpackage.aht;
/* compiled from: PlaylistUserViewHolder.java */
/* renamed from: alx  reason: default package */
/* loaded from: classes2.dex */
public class alx extends g<akm> {
    private boolean y;

    public alx(akm akmVar, boolean z) {
        super(akmVar, true);
        this.y = z;
        if (z) {
            ((ViewGroup.MarginLayoutParams) akmVar.c.getLayoutParams()).topMargin = akmVar.f().getResources().getDimensionPixelSize(aht.a.mine_album_edit_logo_margin_top);
        }
        amk.a(this.a, this.u, String.format(this.r.getResources().getString(aht.e.vui_play_position), this.r.getString(aht.e.title_add_playlist), 1, 1), "title_add_playlist");
    }

    @Override // com.xiaopeng.musicradio.datalist.g
    public void c(int i) {
        super.c(i);
        G();
        if (this.y && this.w.r()) {
            ((akm) this.t).d.setVisibility(8);
            ((akm) this.t).c.setImageAlpha(127);
            ((akm) this.t).g.setAlpha(0.36f);
        } else {
            ((akm) this.t).d.setVisibility(0);
            ((akm) this.t).c.setImageAlpha(255);
            ((akm) this.t).g.setAlpha(1.0f);
        }
        if ("FROM_MAIN".equals(a("FROM_MAIN"))) {
            return;
        }
        amk.b(this.a);
    }

    public void G() {
        ((akm) this.t).f.setVisibility(h.a().b() ? 0 : 8);
    }
}
