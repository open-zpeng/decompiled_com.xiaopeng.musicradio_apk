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
/* compiled from: SingerListAdapter.java */
/* renamed from: bbx  reason: default package */
/* loaded from: classes2.dex */
public class bbx extends aes<baz, RecyclerView.v> {
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

    public bbx(Context context) {
        super(context, a.c.usb_singer_detail_item);
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
        baz g = g(i);
        if (g != null) {
            aVar.v.setText(g.b());
            aVar.w.setText(g.c().size() + be.a(a.d.song));
            aVar.z.a(i);
            aVar.z.b(0);
            aVar.A.a(i);
            aVar.A.b(1);
            String a2 = g.a();
            Object tag = aVar.s.getTag(a.b.image_url);
            if (tag != null && (tag instanceof String) && !TextUtils.equals(a2, (String) aVar.s.getTag(a.b.image_url))) {
                aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
            }
            if (this.i) {
                aVar.s.setTag(a.b.image_url, a2);
                aVar.s.setImageResource(0);
                y.b(aVar.s.getContext(), g.a(), a.C0175a.pic_covers_music_220, aVar.s);
            } else {
                aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
            }
            int c = aei.a().c();
            String x = apk.i().x();
            if (c == 0 && !TextUtils.isEmpty(x) && x.contains(ListSignBean.USB_SINGER_PREFIX) && x.contains(bce.a(g.b()))) {
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
            VuiEngine.getInstance(this.g).setVuiElementTag(aVar.a, "ms_hotsinger_list_item_" + i + 1);
            vuiView.setVuiLabel(String.format(aVar.u.getContext().getResources().getString(a.d.vui_play_position), g.b(), Integer.valueOf(i2), Integer.valueOf(i2)));
            aVar.x.setVuiPosition(i2);
            aVar.x.setVuiElementId(aVar.x.getId() + "_" + i + 1);
            aVar.u.setVuiPosition(i2);
            VuiEngine.getInstance(this.g).setVuiElementTag(aVar.u, "ms_hotsinger_list_play_" + i + 1);
            c.a(this.g, aVar.u, z);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("defaultExecElementId", aVar.x.getId() + "_" + i + 1);
                vuiView.setVuiProps(jSONObject);
            } catch (Exception unused) {
            }
            aVar.y.setText(String.valueOf(i2));
            aVar.y.setVisibility(h.a().b() ? 0 : 8);
            return;
        }
        aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
    }

    /* compiled from: SingerListAdapter.java */
    /* renamed from: bbx$a */
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

        a(View view) {
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

    public List<baz> o() {
        return n();
    }

    @Override // defpackage.aep, androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar) {
        super.a((bbx) vVar);
        a aVar = (a) vVar;
        Glide.with(aVar.s.getContext()).clear(aVar.s);
        aVar.s.setImageResource(a.C0175a.pic_covers_music_220);
    }

    public void c(boolean z) {
        this.i = z;
    }
}
