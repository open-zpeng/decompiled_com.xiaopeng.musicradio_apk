package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.musicradio.widget.e;
import com.xiaopeng.musicradio.widget.recyclerview.EmptyRecyclerView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.drawable.XLoadingDrawable;
import com.xiaopeng.xui.view.XView;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XLoading;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: RdAlbumDetailAdapter.java */
/* renamed from: awp  reason: default package */
/* loaded from: classes2.dex */
public class awp extends e<FMAlbumTracksBean.DataBean.ListBean, a> {
    public static int a = 0;
    public static int b = 1;
    public static int c = 2;
    public static int d = 4;
    private int k;
    private int l;
    private int m;
    private Context n;
    private TextView o;
    private XLoading p;

    @Override // com.xiaopeng.musicradio.widget.e
    protected View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public awp(Context context, boolean z, boolean z2) {
        super(new ArrayList(), z, z2);
        this.k = 0;
        this.l = -1;
        this.m = 1;
        this.n = context;
    }

    private void l() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (T t : this.e) {
            if (hashSet.add(Integer.valueOf(t.getId()))) {
                arrayList.add(t);
            }
        }
        this.e.clear();
        this.e.addAll(arrayList);
    }

    public void a(List<FMAlbumTracksBean.DataBean.ListBean> list) {
        this.e.addAll(list);
        l();
        d();
    }

    public void b(List<FMAlbumTracksBean.DataBean.ListBean> list) {
        this.e.clear();
        a(list);
    }

    public void c(List<FMAlbumTracksBean.DataBean.ListBean> list) {
        this.e.addAll(0, list);
        l();
        d();
    }

    public List<FMAlbumTracksBean.DataBean.ListBean> f() {
        return this.e;
    }

    public void b(boolean z) {
        this.e.clear();
        if (z) {
            d();
        }
    }

    public void g() {
        b(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void a(RecyclerView.v vVar, int i) {
        if (vVar instanceof a) {
            a((a) vVar, i);
        } else if (vVar instanceof e.a) {
            TextView textView = this.o;
            if (textView != null) {
                int i2 = this.k;
                if (i2 == a) {
                    textView.setText("加载中");
                    this.p.setVisibility(0);
                } else if (i2 == b) {
                    textView.setText("点击加载更多");
                    this.p.setVisibility(8);
                } else if (i2 == c) {
                    textView.setText("");
                    this.p.setVisibility(8);
                } else if (i2 == d) {
                    textView.setText("当前无网络，点击重试");
                    this.p.setVisibility(8);
                }
                if (this.e.size() <= 6) {
                    this.o.setVisibility(8);
                    this.p.setVisibility(8);
                    return;
                }
                this.o.setVisibility(0);
            }
        } else {
            boolean z = vVar instanceof e.b;
        }
    }

    /* compiled from: RdAlbumDetailAdapter.java */
    /* renamed from: awp$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.v {
        private XFrameLayout A;
        private XImageView B;
        private XImageView C;
        private TextView s;
        private TextView t;
        private XLinearLayout u;
        private AVLoadingIndicatorView v;
        private ViewGroup w;
        private TextView x;
        private XLoading y;
        private XView z;

        public a(View view) {
            super(view);
            this.s = (TextView) view.findViewById(b.d.tv_track_id);
            this.t = (TextView) view.findViewById(b.d.tv_track_name);
            this.u = (XLinearLayout) view.findViewById(b.d.track_item_sub_layout);
            this.v = (AVLoadingIndicatorView) view.findViewById(b.d.iv_play_list_state);
            this.w = (ViewGroup) view.findViewById(b.d.track_content_layout);
            this.x = (TextView) view.findViewById(b.d.tv_track_update_time);
            this.y = (XLoading) view.findViewById(b.d.lottie_loading);
            this.z = (XView) view.findViewById(b.d.iv_selected_view);
            this.A = (XFrameLayout) view.findViewById(b.d.track_item);
            this.B = (XImageView) view.findViewById(b.d.tv_index_bg);
            this.C = (XImageView) view.findViewById(b.d.label_payment);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.e
    /* renamed from: a */
    public a d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(LayoutInflater.from(this.n).inflate(b.e.item_album_tracklist_new, viewGroup, false));
    }

    @Override // com.xiaopeng.musicradio.widget.e
    protected View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(b.e.item_tracks_foot_view, viewGroup, false);
        this.o = (TextView) inflate.findViewById(b.d.tv_track_foot);
        this.p = (XLoading) inflate.findViewById(b.d.foot_loading);
        VuiEngine.getInstance(viewGroup.getContext()).setVuiLabelUnSupportText(this.o);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: awp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (awp.this.g != null) {
                    awp.this.g.a(11, -1);
                }
            }
        });
        return inflate;
    }

    private void a(final a aVar, final int i) {
        boolean z;
        FMAlbumTracksBean.DataBean.ListBean listBean = (FMAlbumTracksBean.DataBean.ListBean) this.e.get(i);
        aVar.t.setText(listBean.getTitle());
        aVar.s.setText(String.valueOf(listBean.getOrderNum()));
        aVar.x.setText(bg.i(listBean.getCreateTime() > 0 ? listBean.getCreateTime() : listBean.getUpdateTime()));
        aVar.w.setBackground(null);
        aVar.w.setOnClickListener(null);
        aVar.w.setTouchDelegate(null);
        aVar.w.setClickable(false);
        new XLoadingDrawable().setType(0);
        aVar.u.setOnClickListener(new View.OnClickListener() { // from class: awp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!ShakeUtil.canExecute(aVar.u.getId()) || awp.this.g == null) {
                    return;
                }
                awp.this.g.a(0, i);
                if (awp.this.j instanceof EmptyRecyclerView) {
                    ((EmptyRecyclerView) awp.this.j).b(800);
                }
            }
        });
        aVar.B.setVisibility(h.a().b() ? 0 : 8);
        if (h.a().b()) {
            aVar.B.setVisibility(0);
            aVar.s.setTextColor(aVar.s.getContext().getColorStateList(b.a.music_index_color));
        } else {
            aVar.B.setVisibility(8);
            aVar.s.setTextColor(aVar.s.getContext().getColorStateList(b.a.x_theme_text_01));
        }
        if (listBean.getPaymentType() == 0) {
            aVar.C.setVisibility(8);
            TextView textView = aVar.t;
            Context context = this.n;
            textView.setMaxWidth(acq.a(context, context.getResources().getDimension(b.C0158b.xmly_payment_type_default)));
        } else if (listBean.getPaymentType() == 1) {
            aVar.C.setVisibility(0);
            aVar.C.setImageResource(b.c.ic_label_vip_ximalaya);
            TextView textView2 = aVar.t;
            Context context2 = this.n;
            textView2.setMaxWidth(acq.a(context2, context2.getResources().getDimension(b.C0158b.xmly_payment_type_pay_or_vip)));
        } else if (listBean.getPaymentType() == 2) {
            aVar.C.setVisibility(0);
            TextView textView3 = aVar.t;
            Context context3 = this.n;
            textView3.setMaxWidth(acq.a(context3, context3.getResources().getDimension(b.C0158b.xmly_payment_type_pay_or_vip)));
            if (!listBean.isAuthorized() || !aqh.a().e()) {
                aVar.C.setImageResource(b.c.ic_label_payment_ximalaya);
            } else {
                aVar.C.setImageResource(b.c.ic_label_paid_ximalaya);
            }
        } else {
            TextView textView4 = aVar.t;
            Context context4 = this.n;
            textView4.setMaxWidth(acq.a(context4, context4.getResources().getDimension(b.C0158b.xmly_payment_type_default)));
            aVar.C.setVisibility(8);
        }
        if (i == this.l) {
            aVar.z.setSelected(true);
            aVar.s.setSelected(true);
            aVar.B.setSelected(true);
            int i2 = this.m;
            if (i2 != -1 && i2 != 4) {
                if (1 == i2) {
                    aVar.v.c();
                    aVar.y.setVisibility(0);
                    z = true;
                } else if (2 == i2) {
                    aVar.v.a();
                    aVar.y.setVisibility(8);
                    z = true;
                } else if (3 == i2 || 5 == i2) {
                    aVar.v.e();
                    aVar.v.setVisibility(0);
                    aVar.y.setVisibility(8);
                }
                aVar.u.setVuiPosition(listBean.getOrderNum());
                aVar.u.setVuiLabel(String.format(aVar.A.getContext().getString(b.f.vui_play_position), c.a(listBean.getTitle()), Integer.valueOf(listBean.getOrderNum()), Integer.valueOf(listBean.getOrderNum())));
                aVar.u.setVuiElementId(aVar.A.getId() + "_" + listBean.getOrderNum());
                c.a(aVar.u.getContext(), aVar.u, z);
                VuiEngine.getInstance(aVar.u.getContext()).setExecuteVirtualTag(aVar.u);
            }
            if (w.a()) {
                aVar.u.setBackground(null);
            }
            aVar.t.setTextColor(aVar.t.getResources().getColor(b.a.color_19181D));
            aVar.v.c();
            aVar.y.setVisibility(8);
        } else {
            if (w.a()) {
                aVar.u.setBackground(null);
                aVar.w.setOnClickListener(new View.OnClickListener() { // from class: awp.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (!ShakeUtil.canExecute(aVar.w.getId()) || awp.this.g == null) {
                            return;
                        }
                        awp.this.g.a(0, i);
                    }
                });
            }
            aVar.s.setSelected(false);
            aVar.B.setSelected(false);
            aVar.v.c();
            aVar.z.setSelected(false);
            aVar.y.setVisibility(8);
        }
        z = false;
        aVar.u.setVuiPosition(listBean.getOrderNum());
        aVar.u.setVuiLabel(String.format(aVar.A.getContext().getString(b.f.vui_play_position), c.a(listBean.getTitle()), Integer.valueOf(listBean.getOrderNum()), Integer.valueOf(listBean.getOrderNum())));
        aVar.u.setVuiElementId(aVar.A.getId() + "_" + listBean.getOrderNum());
        c.a(aVar.u.getContext(), aVar.u, z);
        VuiEngine.getInstance(aVar.u.getContext()).setExecuteVirtualTag(aVar.u);
    }

    public void e(int i) {
        this.k = i;
        d();
    }

    public int h() {
        return this.l;
    }

    public void e(int i, int i2) {
        this.l = i2;
        this.m = i;
        if (i != a) {
            d();
        }
        if (this.j instanceof EmptyRecyclerView) {
            ((EmptyRecyclerView) this.j).b();
        }
    }

    public void a(long j, boolean z) {
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FMAlbumTracksBean.DataBean.ListBean listBean = (FMAlbumTracksBean.DataBean.ListBean) it.next();
            if (listBean.getId() == j) {
                listBean.setAuthorized(z);
                break;
            }
        }
        d();
    }

    public int i() {
        return this.k;
    }
}
