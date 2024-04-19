package com.xiaopeng.musicradio.program.category.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.program.activity.ProgramSubActivity;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter;
import com.xiaopeng.musicradio.utils.ac;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.av;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.o;
import com.xiaopeng.musicradio.utils.t;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.VuiRecyclerView;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.MaxHeightScrollView;
import com.xiaopeng.musicradio.widget.PlayAllLogoNoCoverLayout;
import com.xiaopeng.musicradio.widget.recyclerview.VuiRecyclerViewWithLoading;
import com.xiaopeng.musicradio.widget.recyclerview.f;
import com.xiaopeng.musicradio.widget.refresh.RefreshLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.model.VuiFeedback;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: RdDetailFragment.java */
@Route(path = "/program/fragment/sub/detail")
/* loaded from: classes2.dex */
public class g extends com.xiaopeng.musicradio.widget.d<d, RdDetailPresenter> implements View.OnClickListener, d {
    public static final String[] e = {com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_reverseorder), com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_normalorder)};
    public static final String[] f = {com.xiaopeng.musicradio.a.a.getString(b.f.tracks_selectpage_state), com.xiaopeng.musicradio.a.a.getResources().getString(b.f.tracks_selectList_state)};
    public static final String[] g = {com.xiaopeng.musicradio.a.a.getString(b.f.detail_expand), com.xiaopeng.musicradio.a.a.getResources().getString(b.f.detail_collapse)};
    private XTextView A;
    private RefreshLayout B;
    private XLinearLayout C;
    private XImageView D;
    private XLinearLayout E;
    private DialogTopLayout F;
    private LinearLayout G;
    private PlayAllLogoNoCoverLayout I;
    private boolean L;
    private XImageView N;
    private XTextView O;
    private ConstraintLayout P;
    private MaxHeightScrollView Q;
    private XImageView R;
    private LinearLayout S;
    private XImageView T;
    @Autowired(name = "auto_play")
    protected String h;
    @Autowired(name = "track_id")
    protected String i;
    @Autowired(name = "album_id")
    protected String j;
    @Autowired(name = "album_bean_gson")
    protected String k;
    private boolean n;
    private VuiRecyclerViewWithLoading o;
    private VuiRecyclerView p;
    private awp q;
    private awq r;
    private XImageView s;
    private XImageView t;
    private XTextView u;
    private XTextView v;
    private XTextView w;
    private XTextView x;
    private XTextView y;
    private XLinearLayout z;
    public String[] d = {com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_play_all), com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_play_goon), com.xiaopeng.musicradio.a.a.getString(b.f.vui_label_stop)};
    private boolean H = false;

    /* renamed from: J  reason: collision with root package name */
    private int f157J = b.c.ic_down;
    private int K = b.c.ic_sort_unnor;
    private boolean M = false;
    private String[] U = {be.a(b.f.vui_play_last)};

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SubProgramDetail";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.layout_rd_detail_fragment;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.o = (VuiRecyclerViewWithLoading) a(b.d.rv_tracks_list_detail);
        this.u = (XTextView) a(b.d.tv_album_desc);
        this.v = (XTextView) a(b.d.tv_album_playcount);
        this.w = (XTextView) a(b.d.from);
        this.x = (XTextView) a(b.d.tv_album_sort);
        this.p = (VuiRecyclerView) a(b.d.rv_select_list);
        this.y = (XTextView) a(b.d.tv_album_select);
        this.t = (XImageView) a(b.d.allow_selectpage);
        this.z = (XLinearLayout) a(b.d.ll_album_previous_track);
        this.A = (XTextView) a(b.d.tv_album_previous_track);
        this.B = (RefreshLayout) a(b.d.swipe_refresh);
        this.C = (XLinearLayout) a(b.d.ll_selectpage);
        this.E = (XLinearLayout) a(b.d.ll_sort);
        this.D = (XImageView) a(b.d.ic_selectpage_sort_unnor);
        this.s = (XImageView) a(b.d.logo_selectpage);
        this.F = (DialogTopLayout) a(b.d.rd_title);
        this.G = (LinearLayout) a(b.d.dialog_reading_detail_new_landscape_rl);
        this.I = (PlayAllLogoNoCoverLayout) a(b.d.play_all_layout_top);
        this.N = (XImageView) a(b.d.iv_album_logo);
        this.O = (XTextView) a(b.d.close_full_desc_button);
        this.P = (ConstraintLayout) a(b.d.center_layout);
        this.Q = (MaxHeightScrollView) a(b.d.desc_scrollview);
        this.R = (XImageView) a(b.d.full_desc_arrow);
        this.S = (LinearLayout) a(b.d.full_desc_layout);
        this.T = (XImageView) a(b.d.top_right_label);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.F.a(b.c.ic_reading_detail_subscribe_nor, b.c.ic_32_list_collection_hl);
        this.F.setEnableColorFilter(false);
        this.q = new awp(this.a, false, true);
        this.r = new awq(this.a);
        this.P.getLayoutTransition().enableTransitionType(4);
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.E);
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.C);
        VuiUtils.setStatefulButtonAttr(this.C, 1, f, null);
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.O);
        VuiUtils.setStatefulButtonAttr(this.O, 1, g, null);
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.O);
        this.o.setLayoutManager(new LinearLayoutManager(this.a) { // from class: com.xiaopeng.musicradio.program.category.view.g.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean h() {
                if (g.this.B != null) {
                    return !g.this.B.a();
                }
                return true;
            }
        });
        this.o.setNoRecordTipText(b.f.copyright_restrict_hint);
        this.o.setItemAnimator(null);
        this.o.addItemDecoration(new com.xiaopeng.musicradio.widget.recyclerview.j(o.a(this.a, 12.0f), o.a(this.a, 0.0f)));
        this.o.initVuiAttr(o(), VuiEngine.getInstance(getContext()), true, true);
        this.p.setLayoutManager(new GridLayoutManager(this.a, 3));
        com.xiaopeng.musicradio.widget.recyclerview.h hVar = new com.xiaopeng.musicradio.widget.recyclerview.h(3, o.a(this.a, 55.0f), false);
        hVar.a(o.a(this.a, 40.0f));
        hVar.c(100);
        this.p.addItemDecoration(hVar);
        this.p.initVuiAttr(o(), VuiEngine.getInstance(getContext()), true, true);
        C();
        c(false);
        XLinearLayout xLinearLayout = this.z;
        ac.a(xLinearLayout, xLinearLayout);
        ((RdDetailPresenter) this.b).a(getArguments());
        this.o.setAdapter(this.q);
        this.p.setAdapter(this.r);
        t();
        com.xiaopeng.musicradio.vui.c.a(this.O);
        this.I.a(o(), this.d, 2, false);
        this.I.a();
        com.xiaopeng.musicradio.vui.c.c(this.E);
        this.F.a(getContext().getResources().getString(b.f.album_detail_subscribe), getContext().getResources().getString(b.f.album_detail_subrrible_already));
        this.Q.setScrollEnable(false);
        this.Q.setClickable(false);
        this.D.setImageTintList(ColorStateList.valueOf(this.a.getColor(b.a.x_theme_text_01)));
    }

    private void t() {
        String str = "";
        if (((RdDetailPresenter) this.b).e() != null) {
            if (!TextUtils.isEmpty(((RdDetailPresenter) this.b).e().getLargeLogo())) {
                str = ((RdDetailPresenter) this.b).e().getLargeLogo();
            } else if (!TextUtils.isEmpty(((RdDetailPresenter) this.b).e().getMediumLogo())) {
                str = ((RdDetailPresenter) this.b).e().getMediumLogo();
            } else if (!TextUtils.isEmpty(((RdDetailPresenter) this.b).e().getSmallLogo())) {
                str = ((RdDetailPresenter) this.b).e().getSmallLogo();
            }
        }
        y.d(this.a, str, b.c.pic_program_default_220, this.N);
        this.F.applyTheme();
        this.z.setBackground(bak.b(b.c.reading_last_track_bg));
        awp awpVar = this.q;
        awq awqVar = this.r;
        if (awqVar != null) {
            awqVar.d();
        }
        E();
        e_(((RdDetailPresenter) this.b).f());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t();
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.view.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.q.d();
            }
        }, 500L);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.I.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.category.view.g.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.B.finishRefreshing();
                if (((RdDetailPresenter) g.this.b).w()) {
                    g.this.F();
                } else {
                    g.this.Z_();
                }
            }
        });
        this.F.getmRightLayout().setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.category.view.g.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecute(g.this.F.getId())) {
                    ((RdDetailPresenter) g.this.b).s();
                }
            }
        });
        this.C.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.F.getmRightLayout().setVuiLabel("订阅");
        this.F.getmRightLayout().setVuiElementType(bih.CHECKBOX);
        if (((RdDetailPresenter) this.b).z() > 0) {
            this.B.setEnableRefresh(false);
        } else {
            this.B.setOnRefreshListener(new com.lcodecore.tkrefreshlayout.g() { // from class: com.xiaopeng.musicradio.program.category.view.g.7
                @Override // com.lcodecore.tkrefreshlayout.g, com.lcodecore.tkrefreshlayout.e
                public void onRefresh(TwinklingRefreshLayout twinklingRefreshLayout) {
                    super.onRefresh(twinklingRefreshLayout);
                    if (((RdDetailPresenter) g.this.b).p()) {
                        ((RdDetailPresenter) g.this.b).c(false);
                    } else {
                        g.this.B.finishRefreshing();
                    }
                }
            });
        }
        this.o.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.program.category.view.g.8
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                RecyclerView.LayoutManager layoutManager = g.this.o.getLayoutManager();
                if (layoutManager == null) {
                    throw new RuntimeException("you should call setLayoutManager() first!!");
                }
                if (layoutManager instanceof LinearLayoutManager) {
                    int s = ((LinearLayoutManager) layoutManager).s();
                    if (g.this.q.a() <= 1 || s == -1) {
                        return;
                    }
                    if (((RdDetailPresenter) g.this.b).z() > 0) {
                        g.this.q.e(awp.c);
                    } else if (s == g.this.q.a() - 1) {
                        if (((RdDetailPresenter) g.this.b).o()) {
                            g.this.q.e(awp.a);
                            ((RdDetailPresenter) g.this.b).c(true);
                            g.this.n = true;
                            return;
                        }
                        g.this.q.e(awp.c);
                    } else {
                        ((RdDetailPresenter) g.this.b).a(((RdDetailPresenter) g.this.b).c(g.this.q.f().get(s).getOrderNum()));
                        String k = ((RdDetailPresenter) g.this.b).k();
                        if (g.this.n) {
                            g.this.b(k);
                        }
                    }
                }
            }
        });
        this.r.a(new f.a() { // from class: com.xiaopeng.musicradio.program.category.view.g.9
            @Override // com.xiaopeng.musicradio.widget.recyclerview.f.a
            public void a(int i, int i2) {
                if (ShakeUtil.canExecute(g.this.p.getId())) {
                    String f2 = g.this.r.f(i2);
                    if (TextUtils.isEmpty(f2)) {
                        return;
                    }
                    g.this.n = true;
                    g.this.b(false);
                    ((RdDetailPresenter) g.this.b).a(i2 + 1);
                    g.this.y.setText(f2);
                    g.this.q.g();
                    ((RdDetailPresenter) g.this.b).n();
                    g.this.c(false);
                }
            }
        });
        this.q.a(new f.a() { // from class: com.xiaopeng.musicradio.program.category.view.g.10
            @Override // com.xiaopeng.musicradio.widget.recyclerview.f.a
            public void a(int i, int i2) {
                g.this.B.finishRefreshing();
                if (i != 0) {
                    if (i == 11) {
                        int i3 = g.this.q.i();
                        if (i3 == awp.d) {
                            ((RdDetailPresenter) g.this.b).n();
                            g.this.q.e(awp.a);
                        } else if (i3 == awp.b) {
                            ((RdDetailPresenter) g.this.b).c(true);
                            g.this.q.e(awp.a);
                        }
                    }
                } else if (i2 < g.this.q.f().size() && i2 >= 0) {
                    if (i2 == g.this.q.h() && ((RdDetailPresenter) g.this.b).w()) {
                        ((RdDetailPresenter) g.this.b).r();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (FMAlbumTracksBean.DataBean.ListBean listBean : g.this.q.f()) {
                        ProgramBean a = aq.a(listBean, ((RdDetailPresenter) g.this.b).e());
                        if (g.this.b != null) {
                            a.setChannelId(((RdDetailPresenter) g.this.b).y());
                            a.setCardId(((RdDetailPresenter) g.this.b).z());
                        }
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    FMAlbumTracksBean.DataBean.ListBean f2 = g.this.q.f(i2);
                    if (f2.getPaymentType() == 1) {
                        if (((RdDetailPresenter) g.this.b).c(arrayList, i2)) {
                            ((RdDetailPresenter) g.this.b).d(arrayList, i2);
                        } else if (aqh.a().e()) {
                            g.this.A();
                        } else {
                            axh.a().a(g.this.getString(b.f.play_vip_no_login_hint), f2.getPaymentType());
                        }
                    } else if (f2.getPaymentType() == 2) {
                        if (((RdDetailPresenter) g.this.b).b(arrayList, i2)) {
                            ((RdDetailPresenter) g.this.b).d(arrayList, i2);
                        } else {
                            axh.a().a(g.this.getString(b.f.play_payment_no_login_hint), f2.getPaymentType());
                        }
                    } else {
                        ((RdDetailPresenter) g.this.b).d(arrayList, i2);
                    }
                    if (arrayList.get(i2) != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(VuiConstants.ELEMENT_TYPE, "click");
                        hashMap.put("album", ((RdDetailPresenter) g.this.b).e().getTitle());
                        hashMap.put("program", ((ProgramBean) arrayList.get(i2)).getTitle());
                        bci.i(hashMap);
                    }
                }
            }
        });
        this.o.setOnTipsViewClick(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.category.view.g.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (((RdDetailPresenter) g.this.b).e() != null) {
                    ((RdDetailPresenter) g.this.b).n();
                } else {
                    ((RdDetailPresenter) g.this.b).l();
                }
            }
        });
        this.F.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.category.view.g.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (g.this.getActivity() instanceof ProgramSubActivity) {
                    ((ProgramSubActivity) g.this.getActivity()).u();
                }
            }
        });
        this.O.setOnClickListener(this);
        this.S.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public RdDetailPresenter ao_() {
        return new RdDetailPresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        LogUtils.d("RdDetailFragment", "showXmlyBuyDialog", new Throwable());
        ((bdn) com.xiaopeng.musicradio.service.c.a().b(bdn.class)).startVipBuy(2);
        ak.a(this.a, getResources().getString(b.f.vip_bug_toast));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            if (this.p.getVisibility() == 0) {
                return;
            }
            if (((RdDetailPresenter) this.b).c() <= 0) {
                ak.a(this.a, getResources().getString(b.f.no_page_info));
                e(true);
                return;
            }
            if (this.L) {
                this.z.setVisibility(8);
            }
            this.B.setVisibility(8);
            this.p.setVisibility(0);
            B();
            this.C.setSelected(true);
            this.z.setEnabled(false);
            this.I.setState(0);
            this.f157J = b.c.ic_up;
            this.t.setImageResource(bak.c(this.f157J));
            VuiUtils.setStatefulButtonAttr(this.C, 0, f, null);
            e(false);
            this.I.setAlpha(0.16f);
            this.I.setEnabled(false);
        } else if (this.p.getVisibility() != 0) {
            return;
        } else {
            if (this.L) {
                this.z.setVisibility(0);
            }
            this.B.setVisibility(0);
            this.p.setVisibility(8);
            this.C.setSelected(false);
            this.z.setEnabled(true);
            this.f157J = b.c.ic_down;
            this.t.setImageResource(bak.c(this.f157J));
            e(true);
            this.I.setEnabled(true);
            this.I.setAlpha(1.0f);
            VuiUtils.setStatefulButtonAttr(this.C, 1, f, null);
        }
        VuiEngine.getInstance(getContext()).updateScene(o(), this.C);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.z);
        E();
    }

    private void B() {
        this.r.a(((RdDetailPresenter) this.b).i());
        this.r.e(((RdDetailPresenter) this.b).d() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        E();
        this.C.setEnabled(z);
        this.I.setState(0);
        this.I.setClickable(z);
        if (z) {
            if (this.p.getVisibility() != 0) {
                e(true);
            }
        } else {
            e(false);
        }
        if (((RdDetailPresenter) this.b).z() > 0) {
            this.B.setEnableRefresh(false);
        } else {
            this.B.setEnableRefresh(z);
        }
    }

    private void C() {
        this.B.setHeaderView(new i(this.a));
        this.B.setOverScrollRefreshShow(false);
        this.B.setEnableOverScroll(false);
        this.B.setTargetView(this.o);
        this.B.setEnableLoadmore(false);
    }

    private void D() {
        this.q.g();
        this.n = false;
        c(false);
        if (TextUtils.equals(((RdDetailPresenter) this.b).h(), "timeAsc")) {
            ((RdDetailPresenter) this.b).a("timeDesc");
            this.q.g();
        } else {
            ((RdDetailPresenter) this.b).a("timeAsc");
            this.q.g();
        }
        this.o.setTipsState(1);
    }

    private void E() {
        if (((RdDetailPresenter) this.b).z() > 0) {
            this.D.setVisibility(8);
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            return;
        }
        this.D.setImageTintList(ColorStateList.valueOf(this.a.getColor(b.a.x_theme_text_01)));
        this.s.setImageTintList(this.a.getColorStateList(b.a.rd_detail_middle));
        this.R.setImageTintList(this.a.getColorStateList(b.a.x_primary_color_selector));
        this.t.setImageTintList(this.a.getColorStateList(b.a.rd_detail_middle));
        this.v.setCompoundDrawableTintList(this.a.getColorStateList(b.a.x_theme_text_03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        axn.i().pause();
        awp awpVar = this.q;
        awpVar.e(3, awpVar.h());
    }

    private void a(boolean z, int i, int i2, int i3) {
        this.I.setText(i2);
        this.I.setSelected(z);
        this.I.a(o(), this.d, i3, true);
        this.I.setState(i);
    }

    private void b(int i) {
        boolean z = false;
        if (i == 2) {
            c(true);
            d(false);
            a(true, 0, b.f.tracklist_play_stop, 1);
        } else if (i == 1) {
            c(false);
            d(false);
            a(true, 0, b.f.tracklist_play_stop, 1);
        } else if (i == -1) {
            c(true);
            a(false, 0, b.f.tracklist_play_all, 2);
        } else if ((i == 3 || i == 5) && !this.I.getText().toString().trim().equals(com.xiaopeng.musicradio.a.a.getString(b.f.tracklist_play_all))) {
            c(true);
            a(false, 0, b.f.tracklist_play_goon, 2);
            s();
        } else {
            c(true);
            a(false, 0, b.f.tracklist_play_all, 2);
            s();
        }
        this.z.setVuiLabel(com.xiaopeng.musicradio.a.a.getString(b.f.vui_play_last));
        this.z.setVuiAction(big.CLICK.a());
        this.z.enableViewVuiMode(true);
        Context context = getContext();
        XLinearLayout xLinearLayout = this.z;
        if (i == 1 || i == 2) {
            z = true;
        }
        com.xiaopeng.musicradio.vui.c.a(context, xLinearLayout, z);
        VuiEngine.getInstance(getContext()).updateScene(o(), this.C);
    }

    private boolean G() {
        ProgramBean r;
        boolean z = false;
        if (TextUtils.isEmpty(axn.i().s()) || !axn.i().s().startsWith("reading_album_") || (r = axn.i().r()) == null || ((RdDetailPresenter) this.b).e() == null || r.getAlbumId() != ((RdDetailPresenter) this.b).e().getId()) {
            return false;
        }
        Iterator<FMAlbumTracksBean.DataBean.ListBean> it = this.q.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FMAlbumTracksBean.DataBean.ListBean next = it.next();
            if (next.getId() == r.getTrackId()) {
                ((RdDetailPresenter) this.b).q();
                awp awpVar = this.q;
                awpVar.e(1, awpVar.f().indexOf(next));
                z = true;
                break;
            }
        }
        if (z || r.getAlbumId() != ((RdDetailPresenter) this.b).e().getId()) {
            return z;
        }
        ((RdDetailPresenter) this.b).q();
        return true;
    }

    private void d(boolean z) {
        this.z.setVisibility(z ? 0 : 8);
        if (z) {
            ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).bottomMargin = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).bottomMargin = 40;
        }
        this.L = z;
        VuiEngine.getInstance(getContext()).updateScene(o(), this.z);
    }

    private void H() {
        this.q.e(-1, -1);
        ProgramBean r = axn.i().r();
        b(this.z.getVisibility() == 0 ? 3 : ((RdDetailPresenter) this.b).x());
        if (aei.a().c() == 3 && !TextUtils.isEmpty(axn.i().s())) {
            if ((axn.i().s().startsWith("reading_album_") || axn.i().s().contains("headspeech")) && r != null && r.getAlbumId() == ((RdDetailPresenter) this.b).e().getId()) {
                boolean z = false;
                int playState = axn.i().getPlayState();
                Iterator<FMAlbumTracksBean.DataBean.ListBean> it = this.q.f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FMAlbumTracksBean.DataBean.ListBean next = it.next();
                    if (next.getId() == r.getTrackId()) {
                        z = true;
                        awp awpVar = this.q;
                        awpVar.e(playState, awpVar.f().indexOf(next));
                        break;
                    }
                }
                if (z) {
                    return;
                }
                this.q.e(-1, -1);
            }
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(FMAlbumTracksBean fMAlbumTracksBean) {
        this.o.setTipsState(0);
        if (fMAlbumTracksBean.getData() == null || fMAlbumTracksBean.getData().getList() == null || fMAlbumTracksBean.getData().getList().size() <= 0) {
            a(0, (String) null);
            return;
        }
        this.o.setTipViewClickable(true);
        c(true);
        b(this.n ? ((RdDetailPresenter) this.b).k() : this.a.getString(b.f.tracks_selectpage));
        this.q.a(fMAlbumTracksBean.getData().getList());
        if (((RdDetailPresenter) this.b).o()) {
            this.q.e(awp.b);
        } else {
            this.q.e(awp.c);
        }
        H();
        a(fMAlbumTracksBean, "onUpdateTracks:");
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void b(FMAlbumTracksBean fMAlbumTracksBean) {
        this.o.setTipsState(0);
        if (fMAlbumTracksBean.getData() == null || fMAlbumTracksBean.getData().getList() == null || fMAlbumTracksBean.getData().getList().size() <= 0) {
            a(0, (String) null);
            return;
        }
        this.o.setTipViewClickable(true);
        c(true);
        b(this.n ? ((RdDetailPresenter) this.b).k() : this.a.getString(b.f.tracks_selectpage));
        this.q.b(fMAlbumTracksBean.getData().getList());
        if (((RdDetailPresenter) this.b).o()) {
            this.q.e(awp.b);
        } else {
            this.q.e(awp.c);
        }
        H();
        a(fMAlbumTracksBean, "onUpdateSpecialTracks:");
    }

    private void a(int i, boolean z) {
        if (i == 0) {
            this.T.setImageDrawable(null);
        } else if (i == 1) {
            this.T.setImageResource(b.c.ic_xmly_cover_label_vip);
        } else if (i == 2) {
            this.T.setImageResource(b.c.ic_xmly_cover_label_payment);
        } else {
            this.T.setImageDrawable(null);
        }
    }

    private void a(FMAlbumTracksBean fMAlbumTracksBean, String str) {
        awp awpVar = this.q;
        if (awpVar == null || awpVar.f() == null || this.q.f().size() <= 0) {
            return;
        }
        int min = Math.min(this.q.f().get(0).getOrderNum(), this.q.f().get(this.q.f().size() - 1).getOrderNum());
        LogUtils.d("RdDetailFragment", str + min);
        this.o.enableVuiInvisibleFeature(min, this.q.f().size() + (-1));
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(int i, String str) {
        if (!NetUtils.isNetworkAvailable(this.a) || i == -1) {
            this.o.setNoResultText(this.a.getString(b.f.common_tips_network_error));
            if (this.q.f().size() > 0) {
                this.o.setTipsState(0);
                ak.a(this.a, getResources().getString(b.f.common_tips_network_error));
            } else {
                this.o.setTipsState(2);
            }
        } else {
            this.o.setNoResultText(this.a.getString(b.f.copyright_restrict_hint));
            if (this.q.j()) {
                this.o.setTipsState(3);
                this.q.d();
                c(false);
            } else {
                this.q.e(awp.d);
            }
            c(false);
        }
        this.o.setTipViewClickable(true);
        b(-1);
        this.B.finishRefreshing();
        c(false);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void c(FMAlbumTracksBean fMAlbumTracksBean) {
        this.q.c(fMAlbumTracksBean.getData().getList());
        this.B.finishRefreshing();
        c(true);
        b(((RdDetailPresenter) this.b).k());
        H();
        a(fMAlbumTracksBean, "onUpdateTracksPre:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        LogUtils.i("RdDetailFragment", "selectPage:" + str, new Throwable());
        this.y.setText(str);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void h_(int i) {
        ProgramBean r;
        if (aei.a().c() != 3) {
            b(i);
            this.q.e(-1, -1);
            return;
        }
        LogUtils.i("RdDetailFragment", "state=" + i);
        b(i);
        boolean z = false;
        if ((i == 2 || i == 3 || i == 4 || i == 5 || i == 1) && (r = axn.i().r()) != null) {
            Iterator<FMAlbumTracksBean.DataBean.ListBean> it = this.q.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FMAlbumTracksBean.DataBean.ListBean next = it.next();
                if (next.getId() == r.getTrackId()) {
                    awp awpVar = this.q;
                    awpVar.e(i, awpVar.f().indexOf(next));
                    LogUtils.i("RdDetailFragment", "setPlayState=" + i);
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        this.q.e(-1, -1);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a() {
        c(false);
        if (this.q.j()) {
            this.o.setTipViewClickable(false);
            this.o.setTipsState(1);
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void e_(boolean z) {
        if (isDetached()) {
            return;
        }
        if (((RdDetailPresenter) this.b).z() > 0) {
            this.F.getmRightLayout().setVisibility(8);
            return;
        }
        this.F.setEditMode(z);
        this.F.getmRightLayout().setSelected(z);
        if (!z) {
            t.a(this.a.getDrawable(b.c.ic_32_list_collection_nor), getResources().getColor(b.a.x_theme_text_02));
        }
        VuiEngine.getInstance(getContext()).updateScene(o(), this.F.getmRightLayout());
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(String str) {
        if (((RdDetailPresenter) this.b).z() > 0) {
            this.x.setVisibility(8);
            this.y.setVisibility(8);
            return;
        }
        LogUtils.d("RdDetailFragment", "onUpdateSort:" + str);
        if ("timeAsc".equals(str)) {
            this.x.setText(b.f.tracklist_reverseorder);
            this.K = b.c.ic_sort_normal_selector;
            this.o.setOrderState(false);
            VuiUtils.setStatefulButtonAttr(this.E, 1, e, null);
        } else if ("timeDesc".equals(str)) {
            this.x.setText(b.f.tracklist_normalorder);
            this.o.setOrderState(true);
            this.K = b.c.ic_sort_unnormal_selector;
            VuiUtils.setStatefulButtonAttr(this.E, 0, e, null);
        } else {
            this.o.setOrderState(false);
            this.x.setText("");
        }
        this.D.setImageResource(this.K);
        E();
        VuiEngine.getInstance(getContext()).updateScene(o(), this.E);
    }

    public void s() {
        VuiRecyclerView vuiRecyclerView;
        if (!isDetached() && this.b != 0 && ((RdDetailPresenter) this.b).t() && !((RdDetailPresenter) this.b).w() && (vuiRecyclerView = this.p) != null && vuiRecyclerView.getVisibility() != 0) {
            a(false, 0, b.f.tracklist_play_goon, 2);
            d(true);
            this.A.setText(this.a.getResources().getString(b.f.rd_previous_track_format, ((RdDetailPresenter) this.b).u().getTrackTitle()));
            return;
        }
        d(false);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void Y_() {
        if (this.q.j()) {
            ((RdDetailPresenter) this.b).n();
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void Z_() {
        if (G()) {
            return;
        }
        List<FMAlbumTracksBean.DataBean.ListBean> f2 = this.q.f();
        ArrayList arrayList = new ArrayList();
        for (FMAlbumTracksBean.DataBean.ListBean listBean : f2) {
            ProgramBean a = aq.a(listBean, ((RdDetailPresenter) this.b).e());
            a.setChannelId(((RdDetailPresenter) this.b).y());
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.I.setState(1);
        ((RdDetailPresenter) this.b).a((List<ProgramBean>) arrayList);
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void aa_() {
        if (this.M || isDetached()) {
            return;
        }
        this.M = true;
        if (((RdDetailPresenter) this.b).z() > 0) {
            this.v.setVisibility(4);
            this.F.setTitle(((RdDetailPresenter) this.b).e().getTitle());
            this.F.getmRightLayout().setVisibility(8);
            this.u.setVisibility(4);
            this.x.setVisibility(8);
            this.y.setVisibility(8);
        } else {
            double playCount = ((RdDetailPresenter) this.b).e().getPlayCount();
            if (playCount > 0.0d) {
                this.v.setText(av.a(this.a, playCount));
                this.v.setVisibility(0);
            } else {
                this.v.setVisibility(8);
            }
            String name = ((RdDetailPresenter) this.b).e().getArtist() != null ? ((RdDetailPresenter) this.b).e().getArtist().getName() : "";
            if (TextUtils.isEmpty(name)) {
                this.F.setTitle(((RdDetailPresenter) this.b).e().getTitle());
            } else {
                this.F.setTitle(((RdDetailPresenter) this.b).e().getTitle() + " - " + name);
            }
            e_(((RdDetailPresenter) this.b).f());
            String intro = ((RdDetailPresenter) this.b).e().getIntro();
            if (TextUtils.isEmpty(intro)) {
                intro = ((RdDetailPresenter) this.b).e().getShortIntro();
            }
            if (!TextUtils.isEmpty(intro)) {
                this.u.setText(intro);
                this.u.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaopeng.musicradio.program.category.view.g.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        g.this.u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (g.this.u.getLineCount() > 2) {
                            g.this.S.setVisibility(0);
                            g.this.S.setClickable(true);
                            if (g.this.H) {
                                g.this.Q.setScrollEnable(true);
                            } else {
                                g.this.Q.setScrollEnable(false);
                            }
                        } else {
                            g.this.S.setVisibility(4);
                            g.this.S.setClickable(false);
                            g.this.Q.setScrollEnable(false);
                        }
                        if (g.this.u.getLineCount() > 1) {
                            g.this.v.setTranslationY(0.0f);
                            g.this.w.setTranslationY(0.0f);
                            return;
                        }
                        g.this.v.setTranslationY(-40.0f);
                        g.this.w.setTranslationY(-40.0f);
                    }
                });
            } else {
                this.u.setText(this.a.getString(b.f.reading_desc_null));
                this.v.setTranslationY(-40.0f);
                this.w.setTranslationY(-40.0f);
            }
            a(((RdDetailPresenter) this.b).e().getPaymentType(), ((RdDetailPresenter) this.b).e().isAuthorized());
        }
        ((RdDetailPresenter) this.b).n();
        b(((RdDetailPresenter) this.b).x());
        s();
        t();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(long j) {
        awp awpVar = this.q;
        if (awpVar != null) {
            List<FMAlbumTracksBean.DataBean.ListBean> f2 = awpVar.f();
            for (int i = 0; i < f2.size(); i++) {
                if (f2.get(i).getId() == j) {
                    this.o.scrollToPosition(i);
                    return;
                }
            }
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void ab_() {
        ProgramBean r = axn.i().r();
        if (r != null) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (FMAlbumTracksBean.DataBean.ListBean listBean : this.q.f()) {
                ProgramBean a = aq.a(listBean, ((RdDetailPresenter) this.b).e());
                if (a != null) {
                    if (a.getTrackId() == r.getTrackId()) {
                        i = this.q.f().indexOf(listBean);
                        ((RdDetailPresenter) this.b).a(((RdDetailPresenter) this.b).c(a.getOrderNum()));
                    }
                    arrayList.add(a);
                }
            }
            if (i >= 0) {
                ((RdDetailPresenter) this.b).a(arrayList, i);
            }
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void ac_() {
        this.q.d();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.d
    public void a(long j, boolean z) {
        this.q.a(j, z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (ShakeUtil.canExecute(view.getId())) {
            int id = view.getId();
            if (id == b.d.ll_sort) {
                this.B.finishRefreshing();
                D();
            } else if (id == b.d.ll_selectpage) {
                this.B.finishRefreshing();
                if (this.B.getVisibility() == 0) {
                    b(true);
                    ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).bottomMargin = 40;
                    e(false);
                    return;
                }
                b(false);
                if (this.L) {
                    ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).bottomMargin = 0;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).bottomMargin = 40;
                }
                e(true);
            } else if (id == b.d.play_all_layout) {
                this.B.finishRefreshing();
                if (((RdDetailPresenter) this.b).w()) {
                    F();
                } else {
                    Z_();
                }
            } else if (id == b.d.ll_album_previous_track) {
                this.B.finishRefreshing();
                if (((RdDetailPresenter) this.b).w()) {
                    return;
                }
                Z_();
            } else if (id == b.d.close_full_desc_button || id == b.d.full_desc_layout) {
                if (!this.H) {
                    this.O.setText(b.f.detail_collapse);
                    this.Q.setMaxHeight(IInputController.KEYCODE_KNOB_WIND_SPD_UP);
                    this.Q.setScrollEnable(true);
                    this.R.setRotation(180.0f);
                    this.Q.setFadingEdgeLength(65);
                    i = 0;
                } else {
                    this.O.setText(b.f.detail_expand);
                    this.Q.setMaxHeight(70);
                    this.Q.scrollTo(0, 0);
                    this.R.setRotation(0.0f);
                    this.Q.setFadingEdgeLength(0);
                    this.Q.setScrollEnable(false);
                    i = 1;
                }
                this.Q.requestLayout();
                this.H = !this.H;
                VuiUtils.setStatefulButtonAttr(this.O, i, g, null);
                VuiEngine.getInstance(getContext()).updateScene(o(), Arrays.asList(this.O, this.I));
            }
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null || this.I.getLayout() == null || view.getId() != this.I.getLayout().getId()) {
            return;
        }
        String str = (String) bioVar.getEventValue(bioVar);
        List asList = Arrays.asList(this.d);
        if (str == null || !asList.contains(str)) {
            return;
        }
        int indexOf = asList.indexOf(str);
        if (indexOf == 0 || indexOf == 1) {
            if (!((RdDetailPresenter) this.b).w()) {
                this.B.finishRefreshing();
                Z_();
                VuiFloatingLayerManager.show(view);
                return;
            }
            VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经播放了哦").build());
        } else if (((RdDetailPresenter) this.b).w()) {
            this.B.finishRefreshing();
            F();
            VuiFloatingLayerManager.show(view);
        } else {
            VuiEngine.getInstance(getContext()).vuiFeedback(view, new VuiFeedback.Builder().state(0).content("已经暂停了哦").build());
        }
    }

    private void e(boolean z) {
        this.E.setEnabled(z);
        this.E.setAlpha(z ? 1.0f : 0.16f);
    }
}
