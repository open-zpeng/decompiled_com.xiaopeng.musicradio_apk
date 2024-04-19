package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import defpackage.beo;
import java.util.List;
/* compiled from: NrCategoryAdapter.java */
/* renamed from: aue  reason: default package */
/* loaded from: classes2.dex */
public class aue extends aes<NetRadioTagInfo, RecyclerView.v> {
    @Override // defpackage.aep
    protected int f() {
        return 15;
    }

    public aue(Context context) {
        super(context, beo.d.netradio_item_categorytab);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i, List list) {
        String cover;
        if (list.isEmpty()) {
            a(vVar, i);
        } else if (g(i) != null) {
            a aVar = (a) vVar;
            aVar.u.setVisibility(h.a().b() ? 0 : 8);
            NetRadioTagInfo g = g(i);
            if (baj.a().d()) {
                cover = g.getNightCover();
            } else {
                cover = g.getCover();
            }
            y.a(cover, beo.b.category_default, aVar.t);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        String cover;
        a aVar = (a) vVar;
        if (g(i) != null) {
            aVar.s.setText(g(i).getName());
            if (baj.a().d()) {
                cover = g(i).getNightCover();
            } else {
                cover = g(i).getCover();
            }
            y.a(cover, beo.b.category_default, aVar.t);
            aVar.v.a(i);
            int i2 = i + 1;
            ((VuiView) aVar.a).setVuiLabel(String.format(aVar.u.getContext().getResources().getString(beo.e.vui_play_position), g(i).getName(), Integer.valueOf(i2), Integer.valueOf(i2)));
            ((VuiView) aVar.a).setVuiPosition(i);
            ((VuiView) aVar.a).setVuiElementId(aVar.a.getId() + "_" + i);
            aVar.u.setText(String.valueOf(i2));
            aVar.u.setVisibility(h.a().b() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NrCategoryAdapter.java */
    /* renamed from: aue$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private XTextView s;
        private XImageView t;
        private XTextView u;
        private aep<RecyclerView.v>.e v;

        a(View view) {
            super(view);
            this.s = (XTextView) this.a.findViewById(beo.c.category_title);
            this.t = (XImageView) this.a.findViewById(beo.c.category_logo);
            this.u = (XTextView) this.a.findViewById(beo.c.tv_speech_num);
            this.v = new aep.e();
            this.a.setOnClickListener(this.v);
        }
    }
}
