package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.musicradio.utils.be;
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
/* compiled from: AlbumListAdapter.java */
/* renamed from: bap  reason: default package */
/* loaded from: classes2.dex */
public class bap extends aes<bav, RecyclerView.v> {
    private int f;
    private Context g;
    private boolean h;
    private boolean i;

    @Override // defpackage.aep
    protected int f() {
        return 32;
    }

    @Override // defpackage.aes
    protected boolean m() {
        return false;
    }

    public bap(Context context) {
        super(context, a.c.usb_album_detail_item);
        this.f = -1;
        this.h = false;
        this.i = true;
        this.g = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        boolean z;
        a aVar = (a) vVar;
        bav g = g(i);
        if (g != null) {
            aVar.z.a(i);
            aVar.z.b(0);
            aVar.A.a(i);
            aVar.A.b(1);
            aVar.v.setText(g.c());
            aVar.w.setText(g.d().size() + be.a(a.d.song));
            String b = g.b();
            Object tag = aVar.s.getTag(a.b.image_url);
            if (tag != null && (tag instanceof String) && !TextUtils.equals(b, (String) aVar.s.getTag(a.b.image_url))) {
                aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
            }
            if (this.i) {
                aVar.s.setTag(a.b.image_url, b);
                aVar.s.setImageResource(0);
                y.b(aVar.s.getContext(), g.b(), a.C0175a.pic_covers_music_220, aVar.s);
            } else {
                aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
            }
            g.a();
            int c = aei.a().c();
            String x = apk.i().x();
            if (c == 0 && !TextUtils.isEmpty(x) && x.contains(ListSignBean.USB_ALBUM_PREFIX) && x.contains(bce.a(g.c()))) {
                this.f = i;
                int playState = apk.i().getPlayState();
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
            VuiView vuiView = (VuiView) aVar.a;
            int i2 = i + 1;
            vuiView.setVuiPosition(i2);
            VuiEngine.getInstance(this.g).setVuiElementTag(aVar.a, "ms_rm_list_item_" + i2);
            vuiView.setVuiLabel(String.format(aVar.y.getContext().getResources().getString(a.d.vui_play_position), g.c(), Integer.valueOf(i2), Integer.valueOf(i2)));
            aVar.x.setVuiPosition(i2);
            aVar.x.setVuiElementId(aVar.x.getId() + "_" + i2);
            aVar.x.setTag(aVar.x.getId() + "_" + i2);
            aVar.u.setVuiPosition(i2);
            VuiEngine.getInstance(this.g).setVuiElementTag(aVar.u, "ms_rm_list_play_" + i2);
            c.a(this.g, aVar.u, z);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("defaultExecElementId", aVar.x.getId() + "_" + i2);
                vuiView.setVuiProps(jSONObject);
            } catch (Exception unused) {
            }
            aVar.y.setText(String.valueOf(i2));
            aVar.y.setVisibility(h.a().b() ? 0 : 8);
            return;
        }
        aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
    }

    /* compiled from: AlbumListAdapter.java */
    /* renamed from: bap$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private aep<RecyclerView.v>.e A;
        private MusicCircleImageView s;
        private XImageView t;
        private XFrameLayout u;
        private XTextView v;
        private XTextView w;
        private XFrameLayout x;
        private XTextView y;
        private aep<RecyclerView.v>.e z;

        public a(View view) {
            super(view);
            this.s = (MusicCircleImageView) this.a.findViewById(a.b.item_logo);
            this.t = (XImageView) this.a.findViewById(a.b.play_icon);
            this.u = (XFrameLayout) this.a.findViewById(a.b.play_item_layout);
            this.x = (XFrameLayout) this.a.findViewById(a.b.item_layout);
            this.v = (XTextView) this.a.findViewById(a.b.radio_title);
            this.w = (XTextView) this.a.findViewById(a.b.song_count);
            this.y = (XTextView) this.a.findViewById(a.b.tv_speech_num);
            this.z = new aep.e();
            this.A = new aep.e();
            this.u.setOnClickListener(this.z);
            this.x.setOnClickListener(this.A);
        }
    }

    private void a(int i, a aVar) {
        switch (i) {
            case 1:
                aVar.t.setImageResource(a.C0175a.ic_btn_stop);
                return;
            case 2:
                aVar.t.setImageResource(a.C0175a.ic_btn_stop);
                return;
            case 3:
                aVar.t.setImageResource(a.C0175a.ic_btn_playall);
                return;
            default:
                aVar.t.setImageResource(a.C0175a.ic_btn_playall);
                return;
        }
    }

    public int l() {
        return this.f;
    }

    public List<bav> o() {
        return n();
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar) {
        super.a((bap) vVar);
        a aVar = (a) vVar;
        Glide.with(aVar.s.getContext()).clear(aVar.s);
        aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
    }

    public void c(boolean z) {
        this.i = z;
    }
}
