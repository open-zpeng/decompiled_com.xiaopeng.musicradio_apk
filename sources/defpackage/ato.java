package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.List;
/* compiled from: MsHotSingerAdapter.java */
/* renamed from: ato  reason: default package */
/* loaded from: classes2.dex */
public class ato extends aes<SingerResultBean.DataBean.ArtistGroupsBean.ListBean, RecyclerView.v> {
    private int f;
    private Context g;
    private int[] h;
    private int i;
    private boolean j;

    @Override // defpackage.aep
    protected int f() {
        return 15;
    }

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public ato(Context context) {
        super(context, b.e.music_item_singer_single_list);
        this.f = -1;
        this.h = new int[]{b.c.img_small_no_1, b.c.img_small_no_2, b.c.img_small_no_3};
        this.i = 1;
        this.j = false;
        this.g = context;
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
            aVar.y.setVisibility(h.a().b() ? 0 : 8);
            y.b(aVar.s.getContext(), g(i).getLogo(), b.c.pic_covers_music_220, aVar.s);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:3|(2:9|(11:11|12|13|(2:16|17)(1:33)|20|21|22|23|(1:25)|26|27))|35|12|13|(0)(0)|20|21|22|23|(0)|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c9  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.recyclerview.widget.RecyclerView.v r11, int r12) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ato.a(androidx.recyclerview.widget.RecyclerView$v, int):void");
    }

    /* compiled from: MsHotSingerAdapter.java */
    /* renamed from: ato$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private aep<RecyclerView.v>.e A;
        private MusicCircleImageView s;
        private XImageView t;
        private XFrameLayout u;
        private XTextView v;
        private XFrameLayout w;
        private XImageView x;
        private XTextView y;
        private aep<RecyclerView.v>.e z;

        a(View view) {
            super(view);
            this.s = (MusicCircleImageView) this.a.findViewById(b.d.item_logo);
            this.t = (XImageView) this.a.findViewById(b.d.play_icon);
            this.u = (XFrameLayout) this.a.findViewById(b.d.play_item_layout);
            this.w = (XFrameLayout) this.a.findViewById(b.d.item_layout);
            this.v = (XTextView) this.a.findViewById(b.d.radio_title);
            this.x = (XImageView) this.a.findViewById(b.d.hot_img);
            this.y = (XTextView) this.a.findViewById(b.d.tv_speech_num);
            this.z = new aep.e();
            this.A = new aep.e();
            this.u.setOnClickListener(this.z);
            this.w.setOnClickListener(this.A);
        }
    }

    private void a(int i, a aVar) {
        boolean z;
        switch (i) {
            case 1:
                aVar.t.setImageResource(b.c.ic_btn_stop);
                z = false;
                break;
            case 2:
                z = true;
                aVar.t.setImageResource(b.c.ic_btn_stop);
                break;
            case 3:
                aVar.t.setImageResource(b.c.ic_btn_playall);
                z = false;
                break;
            default:
                aVar.t.setImageResource(b.c.ic_btn_playall);
                z = false;
                break;
        }
        if (this.j != z) {
            c.a(aVar.u.getContext(), aVar.u, z);
            VuiEngine.getInstance(aVar.u.getContext()).updateScene("MusicSinger", aVar.u);
            this.j = z;
        }
    }

    public int l() {
        return this.f;
    }

    public void f(int i) {
        this.f = i;
    }

    public List<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> o() {
        return n();
    }
}
