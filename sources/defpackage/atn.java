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
/* compiled from: TypeSelectAdapter.java */
/* renamed from: atn  reason: default package */
/* loaded from: classes2.dex */
public class atn extends aes<SingerType, RecyclerView.v> {
    private Context f;
    private int g;

    public atn(Context context) {
        super(context, b.e.singer_select_item_type);
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
        if (g != null && !TextUtils.isEmpty(g.getTypeName())) {
            aVar.s.setText(g.getTypeName());
            if (i == 0) {
                aVar.s.setVuiLabel(aVar.s.getContext().getResources().getString(b.f.second_all));
            } else {
                aVar.s.setVuiLabel(g.getTypeName());
            }
        }
        VuiEngine vuiEngine = VuiEngine.getInstance(this.f);
        View view = aVar.a;
        vuiEngine.setVuiElementTag(view, "ms_typeselect_list_item_" + i);
        aVar.s.setOnClickListener(new View.OnClickListener() { // from class: atn.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                atn.this.a.a(0, i);
                atn.this.g = i;
                atn.this.d();
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
    /* compiled from: TypeSelectAdapter.java */
    /* renamed from: atn$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private XTextView s;

        a(View view) {
            super(view);
            this.s = (XTextView) this.a.findViewById(b.d.type_txt);
        }
    }
}
