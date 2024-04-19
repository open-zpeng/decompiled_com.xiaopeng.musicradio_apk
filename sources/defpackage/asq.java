package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMainZoneResult;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MsZoneListAdapter.java */
/* renamed from: asq  reason: default package */
/* loaded from: classes2.dex */
public class asq extends aes<VipMusicMainZoneResult.DataBean.ListBean, a> {
    private int f;
    private int[] g;
    private int h;

    @Override // defpackage.aep
    protected int f() {
        return 3;
    }

    public asq(Context context) {
        super(context, b.e.music_item_selection_zone_list);
        this.f = -1;
        this.g = new int[]{b.c.img_vip_collection, b.c.img_children_collection, b.c.img_vehicle_collection};
        this.h = 16;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* renamed from: c */
    public a a(ViewGroup viewGroup, int i) {
        return new a(h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(a aVar, int i, List list) {
        if (list.isEmpty()) {
            a(aVar, i);
            return;
        }
        aVar.z.setVisibility(h.a().b() ? 0 : 8);
        VipMusicMainZoneResult.DataBean.ListBean g = g(i);
        if (g == null) {
            return;
        }
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean> moduleList = g.getModuleList();
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> list2 = null;
        if (moduleList != null && moduleList.size() > 0) {
            list2 = moduleList.get(0).getCollectInfo().getCollectList();
        }
        if (list2 == null || list2.size() <= 3) {
            return;
        }
        y.b(aVar.v.getContext(), list2.get(0).getCollect().getLogo(), b.c.pic_covers_music_220, aVar.v);
        y.b(aVar.w.getContext(), list2.get(1).getCollect().getLogo(), b.c.pic_covers_music_220, aVar.w);
        y.b(aVar.x.getContext(), list2.get(2).getCollect().getLogo(), b.c.pic_covers_music_220, aVar.x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(a aVar, int i) {
        boolean z;
        VipMusicMainZoneResult.DataBean.ListBean g = g(i);
        if (g != null) {
            List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean> moduleList = g.getModuleList();
            List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> list = null;
            if (moduleList != null && moduleList.size() > 0) {
                list = moduleList.get(0).getCollectInfo().getCollectList();
            }
            b(aVar, i);
            aVar.A.a(i);
            aVar.A.b(0);
            aVar.B.a(i);
            aVar.B.b(1);
            aVar.u.setText(g.getName());
            ArrayList<Long> arrayList = new ArrayList<>();
            if (list != null && list.size() > 3) {
                y.b(aVar.v.getContext(), list.get(0).getCollect().getLogo(), b.c.pic_covers_music_220, aVar.v);
                y.b(aVar.w.getContext(), list.get(1).getCollect().getLogo(), b.c.pic_covers_music_220, aVar.w);
                y.b(aVar.x.getContext(), list.get(2).getCollect().getLogo(), b.c.pic_covers_music_220, aVar.x);
                for (VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean collectListBean : list) {
                    arrayList.add(Long.valueOf(collectListBean.getCollect().getId()));
                }
            }
            if (aei.a().c() == 0 && a(arrayList)) {
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
            ((VuiView) aVar.a).setVuiLabel(String.format(aVar.t.getContext().getResources().getString(b.f.vui_play_position), g.getName(), Integer.valueOf(this.h + i), Integer.valueOf(this.h + i)));
            ((VuiView) aVar.a).setVuiPosition(i);
            ((VuiView) aVar.a).setVuiAction(big.CLICK.a());
            ((VuiView) aVar.a).setVuiElementId(aVar.a.getId() + "_" + i);
            aVar.t.setVuiPosition(i);
            VuiEngine.getInstance(aVar.t.getContext()).setVuiElementTag(aVar.t, "ms_zone_itm_play_" + i);
            c.a(aVar.t.getContext(), aVar.t, z);
            aVar.z.setText(String.valueOf(this.h + i));
            aVar.z.setVisibility(h.a().b() ? 0 : 8);
        }
    }

    private void b(a aVar, int i) {
        aVar.y.setImageResource(this.g[i % this.g.length]);
    }

    private void a(int i, a aVar) {
        switch (i) {
            case 1:
                aVar.s.setBackgroundResource(b.c.ic_btn_stop);
                return;
            case 2:
                aVar.s.setBackgroundResource(b.c.ic_btn_stop);
                return;
            case 3:
                aVar.s.setBackgroundResource(b.c.ic_btn_playall);
                return;
            default:
                aVar.s.setBackgroundResource(b.c.ic_btn_playall);
                return;
        }
    }

    /* compiled from: MsZoneListAdapter.java */
    /* renamed from: asq$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private aep<a>.e A;
        private aep<a>.e B;
        private XImageView s;
        private XFrameLayout t;
        private XTextView u;
        private XImageView v;
        private XImageView w;
        private XImageView x;
        private XImageView y;
        private XTextView z;

        public a(View view) {
            super(view);
            this.s = (XImageView) this.a.findViewById(b.d.play_icon);
            this.t = (XFrameLayout) this.a.findViewById(b.d.play_item_layout);
            this.u = (XTextView) this.a.findViewById(b.d.zone_title);
            this.v = (XImageView) this.a.findViewById(b.d.collect_one);
            this.w = (XImageView) this.a.findViewById(b.d.collect_two);
            this.x = (XImageView) this.a.findViewById(b.d.collect_three);
            this.y = (XImageView) this.a.findViewById(b.d.item_bg);
            this.z = (XTextView) this.a.findViewById(b.d.tv_speech_num);
            this.A = new aep.e();
            this.B = new aep.e();
            this.t.setOnClickListener(this.A);
            this.a.setOnClickListener(this.B);
        }
    }

    public int l() {
        return this.f;
    }

    public void f(int i) {
        this.f = i;
    }

    public List<VipMusicMainZoneResult.DataBean.ListBean> o() {
        return n();
    }

    private boolean a(ArrayList<Long> arrayList) {
        String x = apk.i().x();
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
                if (x.contains(ListSignBean.COLLECTID_PREFIX + next + ListSignBean.COLLECTID_SUFFIX)) {
                    return true;
                }
            }
        }
        return false;
    }
}
