package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.widget.recyclerview.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: RdTracksSelectPageAdapter.java */
/* renamed from: awq  reason: default package */
/* loaded from: classes2.dex */
public class awq extends f<a> {
    protected f.a a;
    private final String b = "RdTracksSelectPageAdapter";
    private List<String> c = new ArrayList();
    private int d = 0;
    private Context e;

    public awq(Context context) {
        this.e = context;
    }

    public void a(List<String> list) {
        this.c.clear();
        this.c.addAll(list);
        d();
    }

    public void e(int i) {
        LogUtils.i("RdTracksSelectPageAdapter", "setCurPages nPos=" + i + ", mList size=" + this.c.size());
        if (i < this.c.size()) {
            this.d = i;
        }
        d();
    }

    @Override // com.xiaopeng.musicradio.widget.recyclerview.f
    public void a(f.a aVar) {
        this.a = aVar;
    }

    public String f(int i) {
        if (i < 0 || i >= this.c.size()) {
            return this.c.get(0);
        }
        return this.c.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        this.e = viewGroup.getContext();
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_rd_track_select_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(a aVar, final int i) {
        if (i >= this.c.size()) {
            return;
        }
        aVar.r.setText(this.c.get(i));
        if (this.d == i) {
            aVar.r.setSelected(true);
        } else {
            aVar.r.setSelected(false);
        }
        String[] split = this.c.get(i).split("~");
        aVar.r.setVuiPosition(i);
        XTextView xTextView = aVar.r;
        xTextView.setVuiElementId(aVar.r.getId() + "_" + i);
        aVar.r.setVuiElementType(bih.BUTTON);
        aVar.r.setVuiLabel("");
        aVar.r.enableViewVuiMode(true);
        aVar.r.setVuiMode(bij.NORMAL);
        VuiEngine.getInstance(this.e).setVuiLabelUnSupportText(aVar.r);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("valueType", "numRange");
            jSONObject.put(VuiConstants.PROPS_MINVALUE, split[0]);
            jSONObject.put(VuiConstants.PROPS_MAXVALUE, split[1]);
            aVar.r.setVuiProps(jSONObject);
        } catch (JSONException unused) {
        }
        aVar.r.setOnClickListener(new View.OnClickListener() { // from class: awq.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (awq.this.a != null) {
                    awq.this.a.a(0, i);
                }
            }
        });
    }

    /* compiled from: RdTracksSelectPageAdapter.java */
    /* renamed from: awq$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.v {
        private XTextView r;

        public a(View view) {
            super(view);
            this.r = (XTextView) view.findViewById(b.d.page_item);
        }
    }
}
