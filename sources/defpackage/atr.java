package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.MusicArtistBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import org.json.JSONObject;
/* compiled from: SeleteSingerAdapter.java */
/* renamed from: atr  reason: default package */
/* loaded from: classes2.dex */
public class atr extends aes<MusicArtistBean, RecyclerView.v> {
    private int f;
    private Context g;
    private int h;
    private boolean i;

    @Override // defpackage.aep
    protected int f() {
        return 15;
    }

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public atr(Context context) {
        super(context, b.e.music_item_selete_single_list);
        this.f = -1;
        this.h = 1;
        this.i = false;
        this.g = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        a aVar = (a) vVar;
        MusicArtistBean g = g(i);
        if (g != null) {
            aVar.t.setText(g.getName());
            aVar.w.a(i);
            aVar.w.b(1);
            y.b(aVar.s.getContext(), g.getLogo(), b.c.pic_covers_music_220, aVar.s);
            VuiView vuiView = (VuiView) aVar.a;
            vuiView.setVuiPosition(i);
            VuiEngine vuiEngine = VuiEngine.getInstance(this.g);
            View view = aVar.a;
            vuiEngine.setVuiElementTag(view, "ms_songsinger_list_item_" + i);
            vuiView.setVuiLabel(String.format(aVar.u.getContext().getResources().getString(b.f.vui_play_position), g.getName(), Integer.valueOf(this.h + i), Integer.valueOf(this.h + i)));
            aVar.u.setVuiPosition(i);
            XFrameLayout xFrameLayout = aVar.u;
            xFrameLayout.setVuiElementId(aVar.u.getId() + "_" + i);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("defaultExecElementId", aVar.u.getId() + "_" + i);
                vuiView.setVuiProps(jSONObject);
            } catch (Exception unused) {
            }
            aVar.v.setVisibility(8);
        }
    }

    /* compiled from: SeleteSingerAdapter.java */
    /* renamed from: atr$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private MusicCircleImageView s;
        private XTextView t;
        private XFrameLayout u;
        private XTextView v;
        private aep<RecyclerView.v>.e w;

        a(View view) {
            super(view);
            this.s = (MusicCircleImageView) this.a.findViewById(b.d.item_logo);
            this.u = (XFrameLayout) this.a.findViewById(b.d.item_layout);
            this.t = (XTextView) this.a.findViewById(b.d.radio_title);
            this.v = (XTextView) this.a.findViewById(b.d.tv_speech_num);
            this.w = new aep.e();
            this.u.setOnClickListener(this.w);
        }
    }
}
