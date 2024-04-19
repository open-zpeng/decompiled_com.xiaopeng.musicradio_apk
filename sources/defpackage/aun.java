package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.utils.aa;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import defpackage.beo;
import java.util.List;
/* compiled from: NrRadioAdapter.java */
/* renamed from: aun  reason: default package */
/* loaded from: classes2.dex */
public class aun extends aes<NetRadioInfo, RecyclerView.v> {
    private Context f;
    private int g;
    private String h;
    private String i;
    private int[] j;
    private String k;
    private boolean l;

    @Override // defpackage.aep
    protected int f() {
        return 36;
    }

    public aun(Context context) {
        super(context, beo.d.netradio_item_radio_list);
        this.g = -1;
        this.j = new int[]{beo.b.shape_rd_item_bg_one, beo.b.shape_rd_item_bg_tow, beo.b.shape_rd_item_bg_three, beo.b.shape_rd_item_bg_four, beo.b.shape_rd_item_bg_five, beo.b.shape_rd_item_bg_six, beo.b.shape_rd_item_bg_seven, beo.b.shape_rd_item_bg_eight};
        this.l = false;
        this.h = be.a(beo.e.netradio_live);
        this.i = be.a(beo.e.netradio_live_no_program);
        this.f = context;
    }

    public aun(Context context, int i, int i2, aep.b bVar) {
        super(context, i, i2, bVar);
        this.g = -1;
        this.j = new int[]{beo.b.shape_rd_item_bg_one, beo.b.shape_rd_item_bg_tow, beo.b.shape_rd_item_bg_three, beo.b.shape_rd_item_bg_four, beo.b.shape_rd_item_bg_five, beo.b.shape_rd_item_bg_six, beo.b.shape_rd_item_bg_seven, beo.b.shape_rd_item_bg_eight};
        this.l = false;
        this.h = be.a(beo.e.netradio_live);
        this.i = be.a(beo.e.netradio_live_no_program);
        this.f = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i, List list) {
        if (list.isEmpty()) {
            a(vVar, i);
        } else if (g(i) != null) {
            a aVar = (a) vVar;
            aVar.z.setVisibility(h.a().b() ? 0 : 8);
            y.b(aVar.u.getContext(), g(i).getPicUrl(), beo.b.pic_netradio_cover_240, aVar.u);
            a(aVar, i);
            aa.a(beo.b.img_fm_bg, aVar.B);
            aa.a(beo.b.ic_fm_playing, (ImageView) aVar.C);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        a aVar = (a) vVar;
        NetRadioInfo g = g(i);
        if (g != null) {
            a(aVar, i);
            aVar.A.a(i);
            aVar.s.setText(g.getName());
            if (g.getPlayingInfo() != null) {
                if (TextUtils.equals(g.getPlayingInfo().getName(), this.h)) {
                    aVar.t.setText(this.i);
                } else {
                    aVar.t.setText(g.getPlayingInfo().getName());
                }
            }
            y.b(aVar.u.getContext(), g.getPicUrl(), beo.b.pic_netradio_cover_240, aVar.u);
            aa.a(beo.b.img_fm_bg, aVar.B);
            aa.a(beo.b.ic_fm_playing, (ImageView) aVar.C);
            NetRadioProgramInfo d = aps.i().d();
            NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
            if (aei.a().c() == 6 && parentInfo != null && parentInfo.getId() == g.getId()) {
                this.g = i;
                int playState = aps.i().getPlayState();
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
                a(0, aVar);
                z = false;
            }
            int i2 = i + 1;
            aVar.v.setVuiLabel(String.format(aVar.z.getContext().getResources().getString(beo.e.vui_play_position), g.getName(), Integer.valueOf(i2), Integer.valueOf(i2)));
            aVar.v.setVuiPosition(i);
            aVar.v.setVuiElementId(aVar.v.getId() + "_" + i);
            c.a(this.f, aVar.v, z);
            aVar.z.setText(String.valueOf(i2));
            aVar.z.setVisibility(h.a().b() ? 0 : 8);
        }
    }

    private void a(a aVar, int i) {
        aVar.w.setImageResource(this.j[i % this.j.length]);
        if (acs.d(aVar.u.getContext())) {
            aVar.u.setBorderColor(aVar.u.getContext().getResources().getColor(beo.a.radio_mask_color));
        } else {
            aVar.u.setBorderColor(aVar.u.getContext().getResources().getColor(beo.a.transparent));
        }
    }

    private void a(int i, a aVar) {
        switch (i) {
            case 1:
                aVar.y.setBackgroundResource(beo.b.ic_btn_stop);
                return;
            case 2:
                aVar.y.setBackgroundResource(beo.b.ic_btn_stop);
                return;
            case 3:
                aVar.y.setBackgroundResource(beo.b.ic_btn_playall);
                return;
            default:
                aVar.y.setBackgroundResource(beo.b.ic_btn_playall);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NrRadioAdapter.java */
    /* renamed from: aun$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private aep<RecyclerView.v>.e A;
        private XFrameLayout B;
        private XImageView C;
        private XTextView s;
        private XTextView t;
        private MusicCircleImageView u;
        private XFrameLayout v;
        private XImageView w;
        private XFrameLayout x;
        private XImageView y;
        private XTextView z;

        a(View view) {
            super(view);
            this.s = (XTextView) view.findViewById(beo.c.rd_title);
            this.t = (XTextView) view.findViewById(beo.c.rd_program);
            this.u = (MusicCircleImageView) view.findViewById(beo.c.rd_logo);
            this.v = (XFrameLayout) view.findViewById(beo.c.item_layout);
            this.w = (XImageView) view.findViewById(beo.c.item_bg);
            this.B = (XFrameLayout) view.findViewById(beo.c.fm_bg);
            this.x = (XFrameLayout) view.findViewById(beo.c.rd_play_mask);
            this.y = (XImageView) view.findViewById(beo.c.rd_play_icon);
            this.z = (XTextView) view.findViewById(beo.c.tv_speech_num);
            this.C = (XImageView) view.findViewById(beo.c.img_play_fm);
            this.A = new aep.e();
            this.v.setOnClickListener(this.A);
        }
    }

    public int l() {
        return this.g;
    }

    public void f(int i) {
        this.g = i;
    }

    public List<NetRadioInfo> o() {
        return n();
    }

    public void a(String str) {
        this.k = str;
    }
}
