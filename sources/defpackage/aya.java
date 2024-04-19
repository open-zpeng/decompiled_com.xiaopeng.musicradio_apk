package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aye;
/* compiled from: SearchAlbumAdapter.java */
/* renamed from: aya  reason: default package */
/* loaded from: classes2.dex */
public class aya extends aye<MusicAlbumBean> {
    public aya(Context context, axz axzVar) {
        super(context, axzVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        if (f(i) || !(vVar instanceof aye.a)) {
            return;
        }
        aye.a aVar = (aye.a) vVar;
        final MusicAlbumBean g = g(i);
        if (g != null) {
            y.c(this.f, g.getLogo(), a.c.pic_covers_music_220, aVar.r);
            aVar.s.setText(be.a(g.getHighlightName()) ? g.getName() : g.getHighlightName());
            if (this.g.a(g.getId(), g.getName())) {
                aVar.t.setPlayState(2);
                z = true;
            } else {
                aVar.t.setPlayState(3);
                z = false;
            }
            aVar.t.setOnClickListener(new View.OnClickListener() { // from class: aya.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (aya.this.g != null) {
                        aya.this.g.b(g.getId(), g.getName());
                    }
                }
            });
            aVar.v.setVisibility(h.a().b() ? 0 : 8);
            int i2 = i + 1;
            aVar.v.setText(String.valueOf(i2));
            aVar.a.setOnClickListener(new View.OnClickListener() { // from class: aya.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (aya.this.g != null) {
                        aya.this.g.b(g.getId(), g.getLogo(), g.getName());
                    }
                }
            });
            VuiEngine.getInstance(this.f).setVuiElementTag(aVar.a, aVar.a.getId() + "_" + i);
            aVar.u.setVuiLabel(String.format(aVar.a.getResources().getString(a.f.vui_play_position), c.a(g.getName()), Integer.valueOf(i2), Integer.valueOf(i2)));
            aVar.u.setVuiAction(big.CLICK.a());
            c.a(this.f, aVar.t, z);
        }
    }
}
