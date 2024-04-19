package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aye;
/* compiled from: SearchProgramAdapter.java */
/* renamed from: ayd  reason: default package */
/* loaded from: classes2.dex */
public class ayd extends aye<RdAlbumBean> {
    public ayd(Context context, axz axzVar) {
        super(context, axzVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        if (f(i) || !(vVar instanceof aye.a)) {
            return;
        }
        aye.a aVar = (aye.a) vVar;
        final RdAlbumBean g = g(i);
        if (g != null) {
            y.c(this.f, g.getMediumLogo(), a.c.pic_program_default_220, aVar.r);
            aVar.s.setText(be.a(g.getHighlightTitle()) ? g.getTitle() : g.getHighlightTitle());
            if (this.g.a(g.getId())) {
                aVar.t.setPlayState(2);
                z = true;
            } else {
                aVar.t.setPlayState(3);
                z = false;
            }
            aVar.v.setVisibility(h.a().b() ? 0 : 8);
            int i2 = i + 1;
            aVar.v.setText(String.valueOf(i2));
            aVar.t.setOnClickListener(new View.OnClickListener() { // from class: ayd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ayd.this.g != null) {
                        ayd.this.g.a(g);
                    }
                }
            });
            if (g.getPaymentType() == 0) {
                aVar.w.setImageDrawable(null);
            } else if (g.getPaymentType() == 1) {
                aVar.w.setImageResource(a.c.ic_xmly_cover_label_vip);
            } else if (g.getPaymentType() == 2) {
                aVar.w.setImageResource(a.c.ic_xmly_cover_label_payment);
            } else {
                aVar.w.setImageDrawable(null);
            }
            aVar.a.setOnClickListener(new View.OnClickListener() { // from class: ayd.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ayd.this.g != null) {
                        ayd.this.g.b(g);
                    }
                }
            });
            aVar.u.setVuiPosition(i);
            VuiEngine.getInstance(this.f).setVuiElementTag(aVar.a, aVar.a.getId() + "_" + i);
            aVar.u.setVuiLabel(String.format(aVar.a.getResources().getString(a.f.vui_play_position), c.a(g.getTitle()), Integer.valueOf(i2), Integer.valueOf(i2)));
            aVar.u.setVuiAction(big.CLICK.a());
            c.a(this.f, aVar.t, z);
        }
    }
}
