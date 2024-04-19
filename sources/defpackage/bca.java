package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.utils.y;
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
/* compiled from: SongListAdapter.java */
/* renamed from: bca  reason: default package */
/* loaded from: classes2.dex */
public class bca extends aes<MusicInfo, RecyclerView.v> {
    private int f;
    private long g;
    private int h;

    @Override // defpackage.aep
    protected int f() {
        return 20;
    }

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public bca(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar);
        this.f = -1;
        this.g = 0L;
        this.h = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.v a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i, List list) {
        if (list.isEmpty()) {
            a(vVar, i);
            return;
        }
        a aVar = (a) vVar;
        MusicInfo musicInfo = (MusicInfo) list.get(0);
        aVar.u.setText(musicInfo.getSong());
        aVar.v.setText(musicInfo.getSinger());
        if (TextUtils.isEmpty(musicInfo.getSinger())) {
            aVar.v.setVisibility(8);
            return;
        }
        aVar.v.setVisibility(0);
        aVar.v.setText(musicInfo.getSinger());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        boolean z2;
        if (vVar instanceof a) {
            a aVar = (a) vVar;
            MusicInfo g = g(i);
            if (g != null) {
                y.b(aVar.t.getContext(), g.getLogo(), a.C0175a.pic_covers_music_list_220, aVar.t);
                XTextView xTextView = aVar.r;
                StringBuilder sb = new StringBuilder();
                int i2 = i + 1;
                sb.append(i2);
                sb.append("");
                xTextView.setText(sb.toString());
                aVar.u.setText(g.getSong());
                aVar.v.setText(g.getSinger());
                if (TextUtils.isEmpty(g.getSinger())) {
                    aVar.v.setVisibility(8);
                } else {
                    aVar.v.setVisibility(0);
                    aVar.v.setText(g.getSinger());
                }
                arf arfVar = (arf) c.a().b(arf.class);
                arh playingInfo = arfVar.getPlayingInfo();
                int c = aei.a().c();
                String listSign = arfVar.getListSign();
                if (c == 0) {
                    z = (TextUtils.isEmpty(listSign) || playingInfo == null || !TextUtils.equals(playingInfo.a(), g.getHash())) ? false : true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f = i;
                    int playState = aei.a().c(aei.a().c()).getPlayState();
                    switch (playState) {
                        case 1:
                        case 3:
                            a(playState, aVar, g);
                            a(true, aVar);
                            z2 = false;
                            break;
                        case 2:
                            a(playState, aVar, g);
                            a(true, aVar);
                            z2 = true;
                            break;
                        default:
                            a(0, aVar, g);
                            a(false, aVar);
                            z2 = false;
                            break;
                    }
                } else {
                    a(0, aVar, g);
                    a(false, aVar);
                    z2 = false;
                }
                aVar.D.a(i);
                aVar.D.b(0);
                aVar.w.setVuiPosition(i);
                aVar.w.setVuiElementId(aVar.w.getId() + "_" + i);
                aVar.w.setTag(aVar.w.getId() + "_" + i);
                aVar.A.setVuiPosition(i);
                aVar.A.setVuiElementId(aVar.A.getId() + "_" + i);
                aVar.A.setTag(aVar.A.getId() + "_" + i);
                aVar.w.setVuiLabel(String.format(aVar.w.getContext().getString(a.d.vui_play_position), g.getSong(), Integer.valueOf(i2), Integer.valueOf(i2)));
                com.xiaopeng.musicradio.vui.c.a(aVar.A.getContext(), aVar.A, z2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("defaultExecElementId", aVar.A.getId() + "_" + i);
                    aVar.w.setVuiProps(jSONObject);
                } catch (Exception unused) {
                }
                VuiEngine.getInstance(aVar.w.getContext()).setExecuteVirtualTag(aVar.w);
            }
        }
    }

    protected void a(int i, a aVar, MusicInfo musicInfo) {
        switch (i) {
            case 1:
                aVar.x.b();
                aVar.y.setVisibility(0);
                aVar.z.setVisibility(0);
                aVar.B.setSelected(true);
                return;
            case 2:
                aVar.x.a();
                aVar.y.setVisibility(8);
                aVar.z.setVisibility(0);
                aVar.B.setSelected(true);
                return;
            case 3:
                aVar.x.setVisibility(0);
                aVar.x.e();
                aVar.y.setVisibility(8);
                aVar.z.setVisibility(0);
                aVar.B.setSelected(true);
                return;
            default:
                aVar.x.b();
                aVar.y.setVisibility(8);
                aVar.z.setVisibility(8);
                aVar.B.setSelected(false);
                return;
        }
    }

    private void a(boolean z, a aVar) {
        aVar.s.setVisibility(h.a().b() ? 0 : 8);
        aVar.r.setSelected(false);
        aVar.s.setSelected(false);
        if (z) {
            aVar.s.setSelected(true);
            if (h.a().b()) {
                aVar.r.setSelected(true);
            }
        }
    }

    /* compiled from: SongListAdapter.java */
    /* renamed from: bca$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        XView A;
        XView B;
        private aep<RecyclerView.v>.e D;
        public XTextView r;
        public XImageView s;
        public MusicCircleImageView t;
        public XTextView u;
        public XTextView v;
        public XConstraintLayout w;
        public AVLoadingIndicatorView x;
        public XLoading y;
        public XView z;

        protected a(View view) {
            super(view);
            this.r = (XTextView) this.a.findViewById(a.b.tv_index);
            this.s = (XImageView) this.a.findViewById(a.b.tv_index_bg);
            this.t = (MusicCircleImageView) this.a.findViewById(a.b.ms_logo);
            this.u = (XTextView) this.a.findViewById(a.b.ms_song);
            this.v = (XTextView) this.a.findViewById(a.b.ms_singer);
            this.w = (XConstraintLayout) this.a.findViewById(a.b.root_layout);
            this.x = (AVLoadingIndicatorView) this.a.findViewById(a.b.iv_play_list_state);
            this.y = (XLoading) this.a.findViewById(a.b.lottie_loading);
            this.z = (XView) this.a.findViewById(a.b.view_album_mask);
            this.B = (XView) this.a.findViewById(a.b.iv_selected_view);
            this.A = (XView) this.a.findViewById(a.b.view_item_vui);
            this.D = new aep.e();
            this.w.setOnClickListener(this.D);
        }
    }

    public List<MusicInfo> l() {
        return n();
    }
}
