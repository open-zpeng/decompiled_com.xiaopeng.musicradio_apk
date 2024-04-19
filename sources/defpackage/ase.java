package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.List;
import org.json.JSONObject;
/* compiled from: MsRmListAdapter.java */
/* renamed from: ase  reason: default package */
/* loaded from: classes2.dex */
public class ase extends aes<MusicRadioItem, RecyclerView.v> {
    private Context f;
    private int g;
    private int h;

    @Override // defpackage.aep
    protected int f() {
        return 15;
    }

    public ase(Context context, int i) {
        super(context, b.e.music_item_recommend_list);
        this.g = -1;
        this.h = 0;
        this.f = context;
        this.h = i;
    }

    public ase(Context context, int i, int i2, aep.b bVar, int i3) {
        super(context, i, i2, bVar);
        this.g = -1;
        this.h = 0;
        this.f = context;
        this.h = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i, List list) {
        if (list.isEmpty()) {
            a(vVar, i);
        } else if (vVar instanceof a) {
            MusicRadioItem g = g(i);
            a aVar = (a) vVar;
            aVar.x.setVisibility(h.a().b() ? 0 : 8);
            y.b(aVar.s.getContext(), g.getLogoUrl(), b.c.pic_covers_music_220, aVar.s);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        if (vVar instanceof a) {
            a aVar = (a) vVar;
            MusicRadioItem g = g(i);
            if (g != null) {
                aVar.y.a(i);
                aVar.y.b(0);
                aVar.z.a(i);
                aVar.z.b(1);
                aVar.v.setText(g.getName());
                y.b(aVar.s.getContext(), g.getLogoUrl(), b.c.pic_covers_music_220, aVar.s);
                long id = g.getId();
                int c = aei.a().c();
                String x = apk.i().x();
                if ((c != 0 || TextUtils.isEmpty(x)) ? false : a(x, id)) {
                    this.g = i;
                    int playState = apk.i().getPlayState();
                    g.setPlayState(playState);
                    switch (playState) {
                        case 1:
                        case 3:
                            a(playState, aVar);
                            z = false;
                            break;
                        case 2:
                            a(playState, aVar);
                            z = true;
                            break;
                        default:
                            a(0, aVar);
                            z = false;
                            break;
                    }
                } else {
                    g.setPlayState(-1);
                    a(0, aVar);
                    z = false;
                }
                VuiView vuiView = (VuiView) aVar.a;
                vuiView.setVuiPosition(i);
                VuiEngine.getInstance(this.f).setVuiElementTag(aVar.a, "ms_rm_list_item_" + (this.h + i));
                vuiView.setVuiLabel(String.format(aVar.x.getContext().getResources().getString(b.f.vui_play_position), g.getName(), Integer.valueOf(this.h + i), Integer.valueOf(this.h + i)));
                aVar.w.setVuiPosition(i);
                aVar.w.setVuiElementId(aVar.w.getId() + "_" + (this.h + i));
                aVar.w.setTag(aVar.w.getId() + "_" + (this.h + i));
                aVar.u.setVuiPosition(i);
                VuiEngine.getInstance(this.f).setVuiElementTag(aVar.u, "ms_rm_list_play_" + (this.h + i));
                c.a(this.f, aVar.u, z);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("defaultExecElementId", aVar.w.getId() + "_" + (this.h + i));
                    vuiView.setVuiProps(jSONObject);
                } catch (Exception unused) {
                }
                aVar.x.setText(String.valueOf(this.h + i));
                aVar.x.setVisibility(h.a().b() ? 0 : 8);
            }
        }
    }

    public boolean a(String str, long j) {
        if (TextUtils.isEmpty(str) || !str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(j);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return str.contains(sb.toString());
    }

    /* compiled from: MsRmListAdapter.java */
    /* renamed from: ase$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private MusicCircleImageView s;
        private XImageView t;
        private XFrameLayout u;
        private XTextView v;
        private XFrameLayout w;
        private XTextView x;
        private aep<RecyclerView.v>.e y;
        private aep<RecyclerView.v>.e z;

        public a(View view) {
            super(view);
            this.s = (MusicCircleImageView) this.a.findViewById(b.d.item_logo);
            this.t = (XImageView) this.a.findViewById(b.d.play_icon);
            this.u = (XFrameLayout) this.a.findViewById(b.d.play_item_layout);
            this.w = (XFrameLayout) this.a.findViewById(b.d.item_layout);
            this.v = (XTextView) this.a.findViewById(b.d.radio_title);
            this.x = (XTextView) this.a.findViewById(b.d.tv_speech_num);
            this.y = new aep.e();
            this.z = new aep.e();
            this.u.setOnClickListener(this.y);
            this.w.setOnClickListener(this.z);
        }
    }

    private void a(int i, a aVar) {
        switch (i) {
            case 1:
                aVar.t.setImageResource(b.c.ic_btn_stop);
                return;
            case 2:
                aVar.t.setImageResource(b.c.ic_btn_stop);
                return;
            case 3:
                aVar.t.setImageResource(b.c.ic_btn_playall);
                return;
            default:
                aVar.t.setImageResource(b.c.ic_btn_playall);
                return;
        }
    }

    public int o() {
        return this.g;
    }

    public void h(int i) {
        this.g = i;
    }

    public List<MusicRadioItem> p() {
        return n();
    }

    public void i(int i) {
        this.h = i;
    }
}
