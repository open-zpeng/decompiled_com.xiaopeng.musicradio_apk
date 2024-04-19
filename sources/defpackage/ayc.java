package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: SearchNetRadioAdapter.java */
/* renamed from: ayc  reason: default package */
/* loaded from: classes2.dex */
public class ayc extends axy<NetRadioInfo, a> {
    public ayc(Context context, axz axzVar) {
        super(context, a.e.item_search_netradio_layout, axzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axy
    /* renamed from: b */
    public a a(View view) {
        return new a(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        if (f(i) || !(vVar instanceof a)) {
            return;
        }
        a aVar = (a) vVar;
        final NetRadioInfo g = g(i);
        if (g != null) {
            y.c(this.f, g.getPicUrl(), a.c.pic_netradio_cover_240, aVar.r);
            aVar.s.setText(be.a(g.getHighlightName()) ? g.getName() : g.getHighlightName());
            if (this.g.k_(g.getId())) {
                aVar.t.setPlayState(2);
                z = true;
            } else {
                aVar.t.setPlayState(3);
                z = false;
            }
            aVar.u.setVisibility(h.a().b() ? 0 : 8);
            int i2 = i + 1;
            aVar.u.setText(String.valueOf(i2));
            aVar.t.setOnClickListener(new View.OnClickListener() { // from class: ayc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ayc.this.g != null) {
                        ayc.this.g.a(g);
                    }
                }
            });
            VuiView vuiView = (VuiView) aVar.a;
            vuiView.setVuiPosition(i);
            VuiEngine.getInstance(this.f).setVuiElementTag(aVar.a, aVar.a.getId() + "_" + i);
            aVar.t.setVuiLabel(String.format(aVar.a.getResources().getString(a.f.vui_play_position), g.getName(), Integer.valueOf(i2), Integer.valueOf(i2)));
            vuiView.setVuiAction(big.CLICK.a());
            c.a(this.f, aVar.t, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchNetRadioAdapter.java */
    /* renamed from: ayc$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        protected MusicCircleImageView r;
        protected XTextView s;
        protected PlayControlView t;
        protected XTextView u;

        public a(View view) {
            super(view);
            this.r = (MusicCircleImageView) view.findViewById(a.d.iv_logo);
            this.s = (XTextView) view.findViewById(a.d.tv_title);
            this.t = (PlayControlView) view.findViewById(a.d.item_play_status_layout);
            this.u = (XTextView) view.findViewById(a.d.tv_speech_num);
        }
    }
}
