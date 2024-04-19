package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.SingerType;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XTextView;
import org.json.JSONObject;
/* compiled from: AreaSelectAdapter.java */
/* renamed from: atm  reason: default package */
/* loaded from: classes2.dex */
public class atm extends aes<SingerType, RecyclerView.v> {
    private Context f;
    private int g;

    public atm(Context context) {
        super(context, b.e.singer_select_item_area);
        this.g = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, final int i) {
        a aVar = (a) vVar;
        SingerType g = g(i);
        if (this.g == i) {
            aVar.s.setSelected(true);
        } else {
            aVar.s.setSelected(false);
        }
        if (g != null && !TextUtils.isEmpty(g.getAreaName())) {
            aVar.s.setText(g.getAreaName());
            if (i == 0) {
                aVar.s.setVuiLabel(aVar.s.getContext().getResources().getString(b.f.first_all));
            } else {
                aVar.s.setVuiLabel(g.getAreaName());
            }
        }
        VuiEngine vuiEngine = VuiEngine.getInstance(this.f);
        View view = aVar.a;
        vuiEngine.setVuiElementTag(view, "ms_areaselect_list_item_" + i);
        aVar.s.setOnClickListener(new View.OnClickListener() { // from class: atm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                atm.this.a.a(0, i);
                atm.this.g = i;
                atm.this.d();
            }
        });
        VuiView vuiView = (VuiView) aVar.a;
        vuiView.setVuiPosition(i);
        aVar.s.setVuiPosition(i);
        XTextView xTextView = aVar.s;
        xTextView.setVuiElementId(aVar.s.getId() + "_" + i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", aVar.s.getId() + "_" + i);
            vuiView.setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AreaSelectAdapter.java */
    /* renamed from: atm$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private XTextView s;

        a(View view) {
            super(view);
            this.s = (XTextView) this.a.findViewById(b.d.area_txt);
        }
    }
}
