package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.view.mymusic.MusicListItemLabelView;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.List;
import org.json.JSONObject;
/* compiled from: MsMusicDetailListAdapter.java */
/* renamed from: ate  reason: default package */
/* loaded from: classes2.dex */
public class ate extends aes<MusicInfo, RecyclerView.v> {
    private int f;
    private long g;
    private int h;

    @Override // defpackage.aep
    protected int f() {
        return 24;
    }

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public ate(Context context, int i) {
        super(context, i);
        this.f = -1;
        this.g = 0L;
        this.h = -1;
    }

    public ate(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar);
        this.f = -1;
        this.g = 0L;
        this.h = -1;
    }

    @Override // defpackage.aep
    public aep.f[] g() {
        return new aep.f[]{new aep.f(1, b.e.item_musiclist_foot_view, 1)};
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.e.item_musiclist_foot_view, viewGroup, false));
        }
        return new b(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i, List list) {
        if (list.isEmpty()) {
            a(vVar, i);
            return;
        }
        MusicInfo g = g(i);
        if (g != null) {
            boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
            g.setHot(booleanValue);
            if (vVar instanceof b) {
                b bVar = (b) vVar;
                if (booleanValue) {
                    bVar.t.setImageResource(b.c.ic_32_list_like_hl);
                    bVar.t.setSelected(true);
                    return;
                }
                bVar.t.setImageResource(b.c.ic_32_list_like_nor);
                bVar.t.setSelected(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        boolean z2;
        if (vVar instanceof a) {
            a aVar = (a) vVar;
            if (aVar.r != null) {
                int i2 = this.h;
                if (i2 == 0) {
                    aVar.r.setVisibility(0);
                    aVar.s.setVisibility(0);
                    aVar.r.setText(b.f.rv_loading);
                } else if (i2 == 1) {
                    aVar.r.setVisibility(4);
                    aVar.s.setVisibility(4);
                } else if (i2 == 2) {
                    aVar.r.setVisibility(4);
                    aVar.s.setVisibility(4);
                } else {
                    aVar.r.setVisibility(4);
                    aVar.s.setVisibility(4);
                }
            }
        } else if (vVar instanceof b) {
            b bVar = (b) vVar;
            MusicInfo g = g(i);
            if (g != null) {
                y.b(bVar.u.getContext(), g.getLogo(), b.c.pic_covers_music_list_220, bVar.u);
                XTextView xTextView = bVar.r;
                StringBuilder sb = new StringBuilder();
                int i3 = i + 1;
                sb.append(i3);
                sb.append("");
                xTextView.setText(sb.toString());
                bVar.v.setText(g.getSong());
                bVar.w.setText(g.getSinger());
                if (TextUtils.isEmpty(g.getSinger())) {
                    bVar.w.setVisibility(8);
                } else {
                    bVar.w.setVisibility(0);
                    bVar.w.setText(g.getSinger());
                }
                bVar.A.setMusicInfo(g);
                MusicInfo u = apk.i().u();
                int c = aei.a().c();
                String x = apk.i().x();
                if (c == 0) {
                    if (!TextUtils.isEmpty(x) && u != null && u.equals(g)) {
                        if (x.contains(ListSignBean.COLLECTID_PREFIX + this.g + ListSignBean.COLLECTID_SUFFIX)) {
                            z = true;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    this.f = i;
                    int playState = apk.i().getPlayState();
                    switch (playState) {
                        case 1:
                        case 3:
                            a(playState, bVar, g);
                            a(true, bVar);
                            z2 = false;
                            break;
                        case 2:
                            a(playState, bVar, g);
                            a(true, bVar);
                            z2 = true;
                            break;
                        default:
                            a(0, bVar, g);
                            a(false, bVar);
                            z2 = false;
                            break;
                    }
                } else {
                    a(0, bVar, g);
                    a(false, bVar);
                    z2 = false;
                }
                bVar.t.setEnabled(g.enableLove());
                if (anv.a().d(g)) {
                    bVar.t.setImageResource(b.c.ic_32_list_like_hl);
                    bVar.t.setSelected(true);
                } else {
                    bVar.t.setImageResource(b.c.ic_32_list_like_nor);
                    bVar.t.setSelected(false);
                }
                bVar.F.a(i);
                bVar.F.b(0);
                bVar.G.a(i);
                bVar.G.b(2);
                bVar.x.setVuiPosition(i);
                bVar.x.setVuiElementId(bVar.x.getId() + "_" + i);
                bVar.x.setTag(bVar.x.getId() + "_" + i);
                bVar.C.setVuiPosition(i);
                bVar.C.setVuiElementId(bVar.C.getId() + "_" + i);
                bVar.C.setTag(bVar.C.getId() + "_" + i);
                bVar.x.setVuiLabel(String.format(bVar.x.getContext().getString(b.f.vui_play_position), g.getSong(), Integer.valueOf(i3), Integer.valueOf(i3)));
                c.a(bVar.C.getContext(), bVar.C, z2);
                bVar.t.setVuiPosition(i);
                bVar.t.setVuiElementId(bVar.t.getId() + "_" + i);
                bVar.t.setTag(bVar.t.getId() + "_" + i);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("defaultExecElementId", bVar.C.getId() + "_" + i);
                    bVar.x.setVuiProps(jSONObject);
                } catch (Exception unused) {
                }
                VuiEngine.getInstance(bVar.x.getContext()).setExecuteVirtualTag(bVar.x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, b bVar, MusicInfo musicInfo) {
        switch (i) {
            case 1:
                bVar.y.b();
                bVar.z.setVisibility(0);
                bVar.B.setVisibility(0);
                bVar.t.setVisibility(8);
                bVar.D.setSelected(true);
                return;
            case 2:
                bVar.y.a();
                bVar.z.setVisibility(8);
                bVar.B.setVisibility(0);
                bVar.t.setVisibility(0);
                bVar.D.setSelected(true);
                return;
            case 3:
                bVar.y.setVisibility(0);
                bVar.y.e();
                bVar.z.setVisibility(8);
                bVar.B.setVisibility(0);
                bVar.t.setVisibility(0);
                bVar.D.setSelected(true);
                return;
            default:
                bVar.y.b();
                bVar.z.setVisibility(8);
                bVar.B.setVisibility(8);
                bVar.t.setVisibility(0);
                bVar.D.setSelected(false);
                return;
        }
    }

    private void a(boolean z, b bVar) {
        bVar.s.setVisibility(h.a().b() ? 0 : 8);
        bVar.r.setSelected(false);
        bVar.s.setSelected(false);
        if (z) {
            bVar.s.setSelected(true);
            if (h.a().b()) {
                bVar.r.setSelected(true);
            }
        }
    }

    /* compiled from: MsMusicDetailListAdapter.java */
    /* renamed from: ate$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.v {
        public MusicListItemLabelView A;
        public XView B;
        XView C;
        XView D;
        private aep<RecyclerView.v>.e F;
        private aep<RecyclerView.v>.e G;
        public XTextView r;
        public XImageView s;
        public XImageView t;
        public MusicCircleImageView u;
        public XTextView v;
        public XTextView w;
        public XConstraintLayout x;
        public AVLoadingIndicatorView y;
        public XLoading z;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(View view) {
            super(view);
            this.r = (XTextView) this.a.findViewById(b.d.tv_index);
            this.s = (XImageView) this.a.findViewById(b.d.tv_index_bg);
            this.t = (XImageView) this.a.findViewById(b.d.ms_love);
            this.u = (MusicCircleImageView) this.a.findViewById(b.d.ms_logo);
            this.v = (XTextView) this.a.findViewById(b.d.ms_song);
            this.w = (XTextView) this.a.findViewById(b.d.ms_singer);
            this.x = (XConstraintLayout) this.a.findViewById(b.d.root_layout);
            this.y = (AVLoadingIndicatorView) this.a.findViewById(b.d.iv_play_list_state);
            this.z = (XLoading) this.a.findViewById(b.d.lottie_loading);
            this.A = (MusicListItemLabelView) this.a.findViewById(b.d.labelView);
            this.B = (XView) this.a.findViewById(b.d.view_album_mask);
            this.D = (XView) this.a.findViewById(b.d.iv_selected_view);
            this.C = (XView) this.a.findViewById(b.d.view_item_vui);
            this.F = new aep.e();
            this.G = new aep.e();
            this.x.setOnClickListener(this.F);
            this.t.setOnClickListener(this.G);
        }
    }

    public int l() {
        return this.f;
    }

    public List<MusicInfo> o() {
        return n();
    }

    public void a(long j) {
        this.g = j;
    }

    /* compiled from: MsMusicDetailListAdapter.java */
    /* renamed from: ate$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        XTextView r;
        XLoading s;

        public a(View view) {
            super(view);
            this.r = (XTextView) view.findViewById(b.d.tv_foot);
            this.s = (XLoading) view.findViewById(b.d.foot_loading);
        }
    }

    public void f(int i) {
        this.h = i;
        d();
    }

    public int p() {
        return this.h;
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public int a(int i) {
        return i + 1 == a() ? 1 : 0;
    }

    @Override // defpackage.aes, androidx.recyclerview.widget.RecyclerView.a
    public int a() {
        if (n() == null) {
            return 0;
        }
        return n().size() + 1;
    }
}
