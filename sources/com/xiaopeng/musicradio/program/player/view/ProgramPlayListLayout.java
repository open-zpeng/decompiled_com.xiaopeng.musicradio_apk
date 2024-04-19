package com.xiaopeng.musicradio.program.player.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.category.view.i;
import com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.o;
import com.xiaopeng.musicradio.utils.t;
import com.xiaopeng.musicradio.vui.VuiRecyclerView;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.f;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.musicradio.widget.refresh.RefreshLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ProgramPlayListLayout extends BaseFrameLayout<a, ProgramPlayListPresenter> implements a {
    public static final String[] c = {com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_reverseorder), com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_normalorder)};
    public static final String[] d = {com.xiaopeng.musicradio.a.a.getString(b.f.tracks_selectpage_state), com.xiaopeng.musicradio.a.a.getResources().getString(b.f.tracks_selectList_state)};
    private VuiRecyclerView e;
    private BaseRecycleView f;
    private awp g;
    private awq h;
    private XTextView i;
    private XTextView j;
    private RefreshLayout k;
    private XLinearLayout l;
    private XImageView m;
    private XLinearLayout n;
    private XImageView o;
    private int p;
    private int q;
    private XImageView r;
    private LoadingTipsView s;
    private boolean t;
    private int u;
    private boolean v;
    private Runnable w;

    public ProgramPlayListLayout(Context context) {
        super(context);
        this.p = b.c.ic_down;
        this.q = b.c.ic_sort_unnor;
        this.v = true;
        this.w = new Runnable() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ProgramPlayListLayout.this.q();
            }
        };
    }

    public ProgramPlayListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = b.c.ic_down;
        this.q = b.c.ic_sort_unnor;
        this.v = true;
        this.w = new Runnable() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ProgramPlayListLayout.this.q();
            }
        };
    }

    public ProgramPlayListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = b.c.ic_down;
        this.q = b.c.ic_sort_unnor;
        this.v = true;
        this.w = new Runnable() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ProgramPlayListLayout.this.q();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public ProgramPlayListPresenter a() {
        return new ProgramPlayListPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (VuiRecyclerView) findViewById(b.d.rv_tracks_list);
        this.i = (XTextView) findViewById(b.d.tv_album_sort);
        this.f = (BaseRecycleView) findViewById(b.d.rv_select_list);
        this.j = (XTextView) findViewById(b.d.tv_album_select);
        this.k = (RefreshLayout) findViewById(b.d.swipe_refresh);
        this.l = (XLinearLayout) findViewById(b.d.ll_selectpage);
        this.n = (XLinearLayout) findViewById(b.d.ll_sort);
        this.m = (XImageView) findViewById(b.d.ic_selectpage_sort_unnor);
        this.o = (XImageView) findViewById(b.d.allow_selectpage);
        this.r = (XImageView) findViewById(b.d.logo_selectpage);
        this.s = (LoadingTipsView) findViewById(b.d.frm_loading);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.g = new awp(getContext(), false, true);
        this.h = new awq(getContext());
        this.e.setAdapter(this.g);
        this.f.setAdapter(this.h);
        this.e.addItemDecoration(new j(o.a(getContext(), 12.0f), 0));
        this.f.setLayoutManager(new GridLayoutManager(getContext(), 3));
        h hVar = new h(3, o.a(getContext(), 40.0f), false);
        hVar.a(o.a(getContext(), 40.0f));
        hVar.c(100);
        this.f.addItemDecoration(hVar);
        j();
        c(false);
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.n);
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.l);
        VuiUtils.setStatefulButtonAttr(this.l, 1, d, null);
        this.e.a("PlayerMainProgram");
        this.f.initVuiAttr("PlayerMainProgram", VuiEngine.getInstance(com.xiaopeng.musicradio.a.a()), true, true);
        m();
        enableViewVuiMode(true);
        this.s.setState(0);
    }

    private void j() {
        this.k.setHeaderView(new i(getContext()));
        this.k.setOverScrollRefreshShow(false);
        this.k.setEnableOverScroll(false);
        this.k.setTargetView(this.e);
        this.k.setEnableLoadmore(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        final ProgramBean r = axn.i().r();
        this.e.setLayoutManager(new LinearLayoutManager(getContext()) { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean h() {
                if (ProgramPlayListLayout.this.k != null) {
                    return !ProgramPlayListLayout.this.k.a();
                }
                return true;
            }
        });
        this.k.setOnRefreshListener(new com.lcodecore.tkrefreshlayout.g() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.4
            @Override // com.lcodecore.tkrefreshlayout.g, com.lcodecore.tkrefreshlayout.e
            public void onRefresh(TwinklingRefreshLayout twinklingRefreshLayout) {
                super.onRefresh(twinklingRefreshLayout);
                if (((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).j()) {
                    ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).c(false);
                    return;
                }
                ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).b(1);
                ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).a(false);
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProgramPlayListLayout.this.k.finishRefreshing();
                ProgramPlayListLayout.this.o();
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProgramPlayListLayout.this.k.finishRefreshing();
                if (ProgramPlayListLayout.this.k.getVisibility() == 0) {
                    ProgramPlayListLayout.this.b(true);
                } else {
                    ProgramPlayListLayout.this.b(false);
                }
            }
        });
        this.e.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.7
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int s = ((LinearLayoutManager) ProgramPlayListLayout.this.e.getLayoutManager()).s();
                if (ProgramPlayListLayout.this.g.a() <= 1 || s == -1) {
                    return;
                }
                if (s != ProgramPlayListLayout.this.g.a() - 1) {
                    ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).b(((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).a(ProgramPlayListLayout.this.g.f().get(s).getOrderNum()));
                    String f = ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).f();
                    if (ProgramPlayListLayout.this.t) {
                        ProgramPlayListLayout.this.j.setText(f);
                    }
                } else if (r.getCardId() > 0) {
                    ProgramPlayListLayout.this.g.e(awp.c);
                } else if (((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).i()) {
                    ProgramPlayListLayout.this.g.e(awp.a);
                    ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).c(true);
                    ProgramPlayListLayout.this.t = true;
                } else {
                    ProgramPlayListLayout.this.g.e(awp.c);
                }
            }
        });
        this.h.a(new f.a() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.8
            @Override // com.xiaopeng.musicradio.widget.recyclerview.f.a
            public void a(int i, int i2) {
                if (ShakeUtil.canExecute(ProgramPlayListLayout.this.f.getId())) {
                    String f = ProgramPlayListLayout.this.h.f(i2);
                    if (TextUtils.isEmpty(f)) {
                        return;
                    }
                    ProgramPlayListLayout.this.t = true;
                    ProgramPlayListLayout.this.b(false);
                    ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).b(i2 + 1);
                    ProgramPlayListLayout.this.j.setText(f);
                    ProgramPlayListLayout.this.g.g();
                    ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).a(true);
                    ProgramPlayListLayout.this.c(false);
                }
            }
        });
        this.g.a(new f.a() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.9
            @Override // com.xiaopeng.musicradio.widget.recyclerview.f.a
            public void a(int i, int i2) {
                ProgramPlayListLayout.this.k.finishRefreshing();
                if (i != 0) {
                    if (i == 11) {
                        int i3 = ProgramPlayListLayout.this.g.i();
                        if (i3 == awp.d) {
                            ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).a(true);
                            ProgramPlayListLayout.this.g.e(awp.a);
                        } else if (i3 == awp.b) {
                            ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).c(true);
                            ProgramPlayListLayout.this.g.e(awp.a);
                        }
                    }
                } else if (i2 < ProgramPlayListLayout.this.g.f().size() && i2 >= 0) {
                    if (i2 == ProgramPlayListLayout.this.g.h() && ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).m()) {
                        ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).o();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    ProgramBean r2 = axn.i().r();
                    RdAlbumBean b = r2 != null ? aq.b(r2) : null;
                    if (b != null) {
                        for (FMAlbumTracksBean.DataBean.ListBean listBean : ProgramPlayListLayout.this.g.f()) {
                            ProgramBean a = aq.a(listBean, b);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                    }
                    if (i2 >= arrayList.size()) {
                        return;
                    }
                    if (((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).d()) {
                        if (ProgramPlayListLayout.this.u == i2) {
                            if (((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).m()) {
                                ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).o();
                                return;
                            } else {
                                ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).n();
                                return;
                            }
                        }
                        ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).a(arrayList, i2);
                        return;
                    }
                    FMAlbumTracksBean.DataBean.ListBean f = ProgramPlayListLayout.this.g.f(i2);
                    if (f.getPaymentType() == 1) {
                        if (((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).d(arrayList, i2)) {
                            ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).b(arrayList, i2);
                        } else if (aqh.a().e()) {
                            ProgramPlayListLayout.this.l();
                        } else {
                            axh.a().a(be.a(b.f.play_vip_no_login_hint), f.getPaymentType());
                        }
                    } else if (f.getPaymentType() == 2) {
                        if (((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).c(arrayList, i2)) {
                            ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).b(arrayList, i2);
                        } else {
                            axh.a().a(be.a(b.f.play_payment_no_login_hint), f.getPaymentType());
                        }
                    } else {
                        ((ProgramPlayListPresenter) ProgramPlayListLayout.this.b).b(arrayList, i2);
                    }
                }
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProgramPlayListLayout.this.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.t = false;
        this.g.g();
        c(false);
        ((ProgramPlayListPresenter) this.b).b(((ProgramPlayListPresenter) this.b).e());
        this.s.setState(1);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.layout_program_play_list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.setImageTintList(getResources().getColorStateList(b.a.rd_detail_middle));
        h();
        postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.11
            @Override // java.lang.Runnable
            public void run() {
                ProgramPlayListLayout.this.m();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtils.d("ProgramPlayListLayout", "showXmlyBuyDialog", new Throwable());
        ((bdn) com.xiaopeng.musicradio.service.c.a().b(bdn.class)).startVipBuy(2);
        ak.a(getContext(), getResources().getString(b.f.vip_bug_toast));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            if (this.f.getVisibility() == 0) {
                return;
            }
            if (((ProgramPlayListPresenter) this.b).k() <= 0) {
                ak.a(getContext(), getResources().getString(b.f.no_page_info));
                return;
            }
            this.k.setVisibility(8);
            this.f.setVisibility(0);
            n();
            this.e.setVisibility(8);
            this.e.updateVuiScene();
            this.l.setSelected(true);
            this.j.setSelected(true);
            this.n.setEnabled(false);
            this.n.setClickable(false);
            this.n.setAlpha(0.16f);
            this.p = b.c.ic_up;
            this.o.setImageResource(b.c.ic_up);
            VuiUtils.setStatefulButtonAttr(this.l, 0, d, null);
        } else if (this.f.getVisibility() != 0) {
            return;
        } else {
            this.k.setVisibility(0);
            this.f.setVisibility(8);
            this.e.setVisibility(0);
            this.e.updateVuiScene();
            this.l.setSelected(false);
            this.j.setSelected(false);
            this.n.setEnabled(true);
            this.n.setClickable(true);
            this.n.setAlpha(1.0f);
            this.p = b.c.ic_down;
            this.o.setImageResource(b.c.ic_down);
            VuiEngine.getInstance(getContext()).updateScene("PlayerMainProgram", this.k);
            VuiUtils.setStatefulButtonAttr(this.l, 1, d, null);
        }
        m();
        VuiEngine.getInstance(getContext()).updateElementAttribute("PlayerMainProgram", this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        int currentTextColor = this.j.getCurrentTextColor();
        this.o.setImageDrawable(t.a(getContext().getDrawable(this.p), currentTextColor));
        this.r.setImageDrawable(t.a(getContext().getDrawable(b.c.ic_selectpage_logo), currentTextColor));
        this.m.setImageDrawable(t.a(getContext().getDrawable(this.q), getContext().getColor(b.a.x_theme_text_01)));
    }

    private void n() {
        this.h.a(((ProgramPlayListPresenter) this.b).g());
        this.h.e(((ProgramPlayListPresenter) this.b).l() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.t = false;
        this.g.g();
        c(false);
        if (TextUtils.equals(((ProgramPlayListPresenter) this.b).e(), "timeAsc")) {
            ((ProgramPlayListPresenter) this.b).a("timeDesc");
            this.g.g();
        } else {
            ((ProgramPlayListPresenter) this.b).a("timeAsc");
            this.g.g();
        }
        this.s.setState(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        this.l.setEnabled(z);
        this.n.setEnabled(z);
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(String str) {
        if ("timeAsc".equals(str)) {
            this.i.setText(b.f.tracklist_reverseorder);
            this.e.setOrderState(false);
            this.m.setImageResource(b.c.ic_sort_normal);
            VuiUtils.setStatefulButtonAttr(this.n, 1, c, null);
        } else {
            this.i.setText(b.f.tracklist_normalorder);
            this.e.setOrderState(true);
            this.m.setImageResource(b.c.ic_sort_unnor);
            VuiUtils.setStatefulButtonAttr(this.n, 0, c, null);
        }
        m();
        VuiEngine.getInstance(getContext()).updateElementAttribute("PlayerMainProgram", this.n);
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(FMAlbumTracksBean fMAlbumTracksBean, int i, int i2) {
        boolean z = true;
        if (i == 1) {
            this.g.b(false);
        }
        this.s.setState(0);
        this.g.a(fMAlbumTracksBean.getData().getList());
        this.k.finishRefreshing();
        this.j.setText(this.t ? ((ProgramPlayListPresenter) this.b).f() : getContext().getString(b.f.tracks_selectpage));
        c(true);
        if (!this.v && i != 1) {
            z = false;
        }
        d(z);
        this.v = false;
        p();
    }

    private void p() {
        List<FMAlbumTracksBean.DataBean.ListBean> f = this.g.f();
        if (f == null || f.size() <= 0) {
            return;
        }
        int size = f.size();
        this.e.enableVuiInvisibleFeature(Math.min(f.get(0).getOrderNum(), f.get(size - 1).getOrderNum()), this.g.f().size() - 1);
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(int i, String str) {
        if (!NetUtils.isNetworkAvailable(getContext()) || i == -1) {
            this.s.setNoResultText(getContext().getString(b.f.common_tips_network_error));
            if (this.g.f().size() > 0) {
                this.s.setState(0);
                ak.a(getContext(), getResources().getString(b.f.common_tips_network_error));
                this.g.e(awp.d);
            } else {
                this.s.setState(2);
                c(true);
            }
        } else {
            this.s.setNoResultText(getContext().getString(b.f.common_tips_no_result));
            if (this.g.j()) {
                this.s.setState(3);
                this.g.d();
                c(false);
            } else {
                this.g.e(awp.d);
                c(true);
            }
        }
        this.s.setClickable(true);
        this.k.finishRefreshing();
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(FMAlbumTracksBean fMAlbumTracksBean) {
        this.g.c(fMAlbumTracksBean.getData().getList());
        this.k.finishRefreshing();
        c(true);
        this.j.setText(((ProgramPlayListPresenter) this.b).f());
        d(false);
        p();
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void al_() {
        c(false);
        if (this.g.j()) {
            this.s.setClickable(false);
            this.s.setState(1);
        }
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void am_() {
        d(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(boolean r9) {
        /*
            r8 = this;
            axn r0 = defpackage.axn.i()
            com.xiaopeng.musicradio.bean.program.ProgramBean r0 = r0.r()
            axn r1 = defpackage.axn.i()
            int r1 = r1.getPlayState()
            awp r2 = r8.g
            java.util.List r2 = r2.f()
            if (r0 == 0) goto L5a
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean$DataBean$ListBean r3 = (com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean.DataBean.ListBean) r3
            int r4 = r3.getId()
            long r4 = (long) r4
            long r6 = r0.getTrackId()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L1c
            r0 = 1
            awp r2 = r8.g
            java.util.List r4 = r2.f()
            int r4 = r4.indexOf(r3)
            r2.e(r1, r4)
            Presenter extends com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter<UIInterface> r1 = r8.b
            com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter r1 = (com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L5b
            awp r1 = r8.g
            java.util.List r1 = r1.f()
            int r1 = r1.indexOf(r3)
            r8.u = r1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 != 0) goto L63
            awp r0 = r8.g
            r1 = -1
            r0.e(r1, r1)
        L63:
            if (r9 == 0) goto L7f
            android.os.Handler r9 = r8.getHandler()
            if (r9 == 0) goto L7f
            android.os.Handler r9 = r8.getHandler()
            java.lang.Runnable r0 = r8.w
            r9.removeCallbacks(r0)
            android.os.Handler r9 = r8.getHandler()
            java.lang.Runnable r0 = r8.w
            r1 = 200(0xc8, double:9.9E-322)
            r9.postDelayed(r0, r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.d(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        int h = this.g.h();
        Log.i("ProgramPlayListLayout", "scrollToPlay: " + h);
        if (h >= 0) {
            this.e.d(h);
            this.e.updateVuiScene();
        }
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(boolean z) {
        this.n.setVisibility(z ? 4 : 0);
        this.l.setVisibility(z ? 4 : 0);
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void h() {
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramPlayListLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ProgramPlayListLayout.this.g.d();
            }
        }, 800L);
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void a(long j, boolean z) {
        this.g.a(j, z);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            q();
        }
    }

    @Override // com.xiaopeng.musicradio.program.player.view.a
    public void i() {
        this.v = true;
        this.g.b(false);
    }
}
