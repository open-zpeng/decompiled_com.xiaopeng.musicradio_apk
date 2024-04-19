package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aye;
/* compiled from: SearchCollectionAdapter.java */
/* renamed from: ayb  reason: default package */
/* loaded from: classes2.dex */
public class ayb extends aye<MixSearchResultBean.CollectBean> {
    public ayb(Context context, axz axzVar) {
        super(context, axzVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        final MixSearchResultBean.CollectBean g = g(i);
        if (g == null || f(i) || !(vVar instanceof aye.a)) {
            return;
        }
        aye.a aVar = (aye.a) vVar;
        y.c(this.f, g.getLogo(), a.c.pic_covers_music_220, aVar.r);
        aVar.s.setText(be.a(g.getHighlightName()) ? g.getName() : g.getHighlightName());
        if (this.g.c(g.getId(), g.getName())) {
            aVar.t.setPlayState(2);
        } else {
            aVar.t.setPlayState(3);
        }
        aVar.t.setOnClickListener(new View.OnClickListener() { // from class: ayb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ayb.this.g != null) {
                    ayb.this.g.a(g.getId(), g.getName(), g.getLogo());
                }
            }
        });
        aVar.v.setVisibility(h.a().b() ? 0 : 8);
        int i2 = i + 1;
        aVar.v.setText(String.valueOf(i2));
        aVar.a.setOnClickListener(new View.OnClickListener() { // from class: ayb.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ayb.this.g != null) {
                    ayb.this.g.c(g.getId(), g.getLogo(), g.getName());
                }
            }
        });
        aVar.u.setVuiPosition(i);
        VuiEngine vuiEngine = VuiEngine.getInstance(this.f);
        View view = aVar.a;
        vuiEngine.setVuiElementTag(view, aVar.a.getId() + "_" + i);
        aVar.u.setVuiLabel(String.format(aVar.a.getResources().getString(a.f.vui_play_position), c.a(g.getName()), Integer.valueOf(i2), Integer.valueOf(i2)));
        aVar.u.setVuiAction(big.CLICK.a());
        c.a(this.f, aVar.t, false);
    }
}
