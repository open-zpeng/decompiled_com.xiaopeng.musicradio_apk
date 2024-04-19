package com.xiaopeng.musicradio.netradio.concentration.localradio.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationRadioPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.vip.view.VipSaleBanner;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.gallery.XmGallery;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.beo;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NrLocationRadioLayout extends BaseFrameLayout<a, NrLocationRadioPresenter> implements View.OnClickListener, a {
    public LoadingTipsView c;
    private Context d;
    private XmGallery e;
    private auk f;
    private XTextView g;
    private XTextView h;
    private XImageView i;
    private XFrameLayout j;
    private XRelativeLayout k;
    private XImageView l;
    private XImageView m;
    private XImageView n;
    private boolean o;
    private AlphaAnimation p;
    private AlphaAnimation q;
    private boolean r;
    private View s;
    private View t;
    private View u;
    private XRelativeLayout v;
    private XRelativeLayout w;
    private acv x;
    private VipSaleBanner y;

    public NrLocationRadioLayout(Context context) {
        super(context);
        this.o = false;
        this.r = false;
        this.d = context;
    }

    public NrLocationRadioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = false;
        this.r = false;
        this.d = context;
        this.x = acv.a(context, attributeSet);
    }

    public NrLocationRadioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = false;
        this.r = false;
        this.d = context;
        this.x = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public NrLocationRadioPresenter a() {
        return new NrLocationRadioPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (LoadingTipsView) findViewById(beo.c.location_loading);
        this.e = (XmGallery) findViewById(beo.c.location_xpgallery);
        this.g = (XTextView) findViewById(beo.c.rd_title);
        this.h = (XTextView) findViewById(beo.c.rd_program);
        this.i = (XImageView) findViewById(beo.c.play_icon);
        this.j = (XFrameLayout) findViewById(beo.c.play_item_layout);
        this.k = (XRelativeLayout) findViewById(beo.c.content_layout);
        this.l = (XImageView) findViewById(beo.c.play_layout);
        this.m = (XImageView) findViewById(beo.c.select_bg_one);
        this.n = (XImageView) findViewById(beo.c.select_bg_two);
        this.s = findViewById(beo.c.slect_radio_shpae);
        this.t = findViewById(beo.c.left_click);
        this.u = findViewById(beo.c.right_click);
        this.v = (XRelativeLayout) findViewById(beo.c.fm_left);
        this.w = (XRelativeLayout) findViewById(beo.c.fm_right);
        this.y = (VipSaleBanner) findViewById(beo.c.vipsale_banner);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c.setAutoClickLoadingEnable(false);
        this.f = new auk();
        i();
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        XFrameLayout xFrameLayout = this.j;
        vuiEngine.setVuiElementTag(xFrameLayout, "nr_local_" + this.j.getId());
        c.a(getContext(), this.j, false);
        this.j.setVuiLayoutLoadable(true);
        this.j.setVuiPriority(bik.LEVEL2);
        this.k.setVuiElementType(bih.UNKNOWN);
        this.y.setVipSaleType(9);
    }

    private void i() {
        this.p = new AlphaAnimation(1.0f, 0.0f);
        this.q = new AlphaAnimation(0.0f, 1.0f);
        this.p.setDuration(100L);
        this.p.setFillAfter(true);
        this.q.setDuration(100L);
        this.q.setFillAfter(true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.e.setOnGalleryPageSelectListener(new XmGallery.a() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.1
            @Override // com.xiaopeng.musicradio.widget.gallery.XmGallery.a
            public void a(int i) {
                ((NrLocationRadioPresenter) NrLocationRadioLayout.this.b).a(i);
            }

            @Override // com.xiaopeng.musicradio.widget.gallery.XmGallery.a
            public void b(int i) {
                ArrayList<NetRadioInfo> a;
                ((NrLocationRadioPresenter) NrLocationRadioLayout.this.b).a(i);
                NrLocationRadioLayout.this.setRdData(i);
                ArrayList<NetRadioInfo> a2 = NrLocationRadioLayout.this.f.a();
                if (a2 != null && a2.size() > 0 && i >= 0 && i < a2.size()) {
                    NetRadioProgramInfo d = aps.i().d();
                    NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
                    int playState = aps.i().getPlayState();
                    if (parentInfo != null && parentInfo.getId() == a2.get(i).getId() && (playState == 2 || playState == 1)) {
                        return;
                    }
                    if (aei.a().c() == 6 && ((playState == 2 || playState == 1) && (a = NrLocationRadioLayout.this.f.a()) != null && a.size() > 0 && a.contains(parentInfo))) {
                        aup.a();
                        aps.i().a(a2.get(i));
                    }
                }
                if (i == 0 || i == 1) {
                    NrLocationRadioLayout.this.t.setVisibility(0);
                } else {
                    NrLocationRadioLayout.this.t.setVisibility(8);
                }
                if (a2 == null || (i != a2.size() - 1 && i != a2.size() - 2)) {
                    NrLocationRadioLayout.this.u.setVisibility(8);
                } else {
                    NrLocationRadioLayout.this.u.setVisibility(0);
                }
            }

            @Override // com.xiaopeng.musicradio.widget.gallery.XmGallery.a
            public void c(int i) {
                switch (i) {
                    case 0:
                        NrLocationRadioLayout nrLocationRadioLayout = NrLocationRadioLayout.this;
                        nrLocationRadioLayout.b(nrLocationRadioLayout.m);
                        NrLocationRadioLayout nrLocationRadioLayout2 = NrLocationRadioLayout.this;
                        nrLocationRadioLayout2.b(nrLocationRadioLayout2.n);
                        return;
                    case 1:
                        NrLocationRadioLayout nrLocationRadioLayout3 = NrLocationRadioLayout.this;
                        nrLocationRadioLayout3.a(nrLocationRadioLayout3.m);
                        NrLocationRadioLayout nrLocationRadioLayout4 = NrLocationRadioLayout.this;
                        nrLocationRadioLayout4.a(nrLocationRadioLayout4.n);
                        return;
                    default:
                        return;
                }
            }

            @Override // com.xiaopeng.musicradio.widget.gallery.XmGallery.a
            public void a() {
                NrLocationRadioLayout nrLocationRadioLayout = NrLocationRadioLayout.this;
                nrLocationRadioLayout.a(nrLocationRadioLayout.m);
                NrLocationRadioLayout nrLocationRadioLayout2 = NrLocationRadioLayout.this;
                nrLocationRadioLayout2.a(nrLocationRadioLayout2.n);
            }

            @Override // com.xiaopeng.musicradio.widget.gallery.XmGallery.a
            public void b() {
                NrLocationRadioLayout nrLocationRadioLayout = NrLocationRadioLayout.this;
                nrLocationRadioLayout.b(nrLocationRadioLayout.m);
                NrLocationRadioLayout nrLocationRadioLayout2 = NrLocationRadioLayout.this;
                nrLocationRadioLayout2.b(nrLocationRadioLayout2.n);
            }

            @Override // com.xiaopeng.musicradio.widget.gallery.XmGallery.a
            public void c() {
                NrLocationRadioLayout.this.l();
                NrLocationRadioLayout.this.k();
            }
        });
        this.j.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.u.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return beo.d.netradio_layout_locationradio;
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void a(ArrayList<NetRadioInfo> arrayList, int i, boolean z) {
        a(0);
        this.k.setVisibility(0);
        if (this.f.getCount() <= 0 || z) {
            this.f.a(arrayList, true);
            arrayList.clear();
            this.e.setAdapter(this.f);
            this.e.a(i, true);
            ((NrLocationRadioPresenter) this.b).a(i);
            setRdData(i);
            ((NrLocationRadioPresenter) this.b).i();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.k.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.k.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.k.setVisibility(8);
        a(3);
    }

    public void a(int i) {
        this.c.setState(i);
        if (i == 1) {
            this.c.setClickable(false);
        } else {
            this.c.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRdData(int i) {
        ArrayList<NetRadioInfo> a = this.f.a();
        if (a == null || a.size() <= 0 || i < 0 || i >= a.size()) {
            return;
        }
        NetRadioInfo netRadioInfo = a.get(i);
        this.g.setText(netRadioInfo.getName());
        this.j.setVuiLabel(netRadioInfo.getName());
        VuiEngine.getInstance(getContext()).updateScene("MainNetRadioConcentration", this.j);
        NetRadioProgramInfo playingInfo = netRadioInfo.getPlayingInfo();
        if (playingInfo == null || playingInfo.getName() == null || TextUtils.equals(playingInfo.getName(), be.a(beo.e.netradio_live))) {
            this.h.setText(be.a(beo.e.netradio_live_no_program));
            return;
        }
        NetRadioProgramInfo d = aps.i().d();
        NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
        XTextView xTextView = this.h;
        xTextView.setText(be.a(beo.e.netradio_play_live) + ":  " + playingInfo.getName());
        if (parentInfo == null || netRadioInfo == null || d == null || !parentInfo.equals(netRadioInfo) || aps.i().m() != 2) {
            return;
        }
        XTextView xTextView2 = this.h;
        xTextView2.setText(be.a(beo.e.netradio_play_back) + ":  " + d.getName());
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void a(boolean z) {
        if (z) {
            j();
        } else {
            this.i.setImageResource(beo.b.ic_btn_playall);
        }
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void L_() {
        M_();
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.localradio.view.a
    public void M_() {
        j();
        ArrayList<NetRadioInfo> a = this.f.a();
        this.i.setImageResource(beo.b.ic_btn_playall);
        if (aei.a().c() == 6) {
            NetRadioProgramInfo d = aps.i().d();
            NetRadioInfo parentInfo = d != null ? d.getParentInfo() : null;
            if (a.contains(parentInfo)) {
                int indexOf = a.indexOf(parentInfo);
                ((NrLocationRadioPresenter) this.b).a(indexOf);
                this.e.a(indexOf, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j() {
        /*
            r5 = this;
            aps r0 = defpackage.aps.i()
            com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo r0 = r0.d()
            r1 = 1
            if (r0 == 0) goto L6f
            com.xiaopeng.musicradio.bean.netradio.NetRadioInfo r0 = r0.getParentInfo()
            Presenter extends com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter<UIInterface> r2 = r5.b
            com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationRadioPresenter r2 = (com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationRadioPresenter) r2
            int r2 = r2.h()
            auk r3 = r5.f
            java.util.ArrayList r3 = r3.a()
            auk r4 = r5.f
            if (r4 == 0) goto L6f
            if (r2 < 0) goto L6f
            int r4 = r3.size()
            if (r2 >= r4) goto L6f
            java.lang.Object r2 = r3.get(r2)
            com.xiaopeng.musicradio.bean.netradio.NetRadioInfo r2 = (com.xiaopeng.musicradio.bean.netradio.NetRadioInfo) r2
            int r3 = r3.size()
            if (r3 != 0) goto L36
            return
        L36:
            int r0 = r0.getId()
            int r2 = r2.getId()
            if (r0 != r2) goto L6f
            aps r0 = defpackage.aps.i()
            int r0 = r0.getPlayState()
            if (r0 != r1) goto L52
            com.xiaopeng.xui.widget.XImageView r0 = r5.i
            int r1 = defpackage.beo.b.ic_btn_stop
            r0.setImageResource(r1)
            goto L6f
        L52:
            r2 = 2
            if (r0 != r2) goto L5d
            com.xiaopeng.xui.widget.XImageView r0 = r5.i
            int r2 = defpackage.beo.b.ic_btn_stop
            r0.setImageResource(r2)
            goto L70
        L5d:
            r1 = 3
            if (r0 != r1) goto L68
            com.xiaopeng.xui.widget.XImageView r0 = r5.i
            int r1 = defpackage.beo.b.ic_btn_playall
            r0.setImageResource(r1)
            goto L6f
        L68:
            com.xiaopeng.xui.widget.XImageView r0 = r5.i
            int r1 = defpackage.beo.b.ic_btn_playall
            r0.setImageResource(r1)
        L6f:
            r1 = 0
        L70:
            boolean r0 = r5.r
            if (r0 == r1) goto L8e
            android.content.Context r0 = r5.getContext()
            com.xiaopeng.xui.widget.XFrameLayout r2 = r5.j
            com.xiaopeng.musicradio.vui.c.a(r0, r2, r1)
            android.content.Context r0 = r5.getContext()
            com.xiaopeng.speech.vui.VuiEngine r0 = com.xiaopeng.speech.vui.VuiEngine.getInstance(r0)
            java.lang.String r2 = "MainNetRadioConcentration"
            com.xiaopeng.xui.widget.XFrameLayout r3 = r5.j
            r0.updateScene(r2, r3)
            r5.r = r1
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.j():void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (ShakeUtil.canExecute(id)) {
            if (id == beo.c.play_layout || id == beo.c.play_item_layout) {
                if (this.f.getCount() > 0) {
                    l();
                }
            } else if (id == beo.c.location_loading) {
                int state = this.c.getState();
                if (state == 2 || state == 3) {
                    ((NrLocationRadioPresenter) this.b).d();
                    r_();
                }
            } else if (id == beo.c.left_click || id == beo.c.right_click) {
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        a(this.m);
        a(this.n);
        Handler handler = getHandler();
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    NrLocationRadioLayout nrLocationRadioLayout = NrLocationRadioLayout.this;
                    nrLocationRadioLayout.b(nrLocationRadioLayout.m);
                    NrLocationRadioLayout nrLocationRadioLayout2 = NrLocationRadioLayout.this;
                    nrLocationRadioLayout2.b(nrLocationRadioLayout2.n);
                }
            }, 110L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int h = ((NrLocationRadioPresenter) this.b).h();
        ArrayList<NetRadioInfo> a = this.f.a();
        if (this.f == null || h < 0 || h >= a.size()) {
            return;
        }
        aup.a();
        ((NrLocationRadioPresenter) this.b).a(a.get(h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final View view) {
        this.s.setVisibility(8);
        if (this.o || view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
        view.clearAnimation();
        view.setAnimation(this.p);
        this.p.setAnimationListener(new Animation.AnimationListener() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                NrLocationRadioLayout.this.o = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                NrLocationRadioLayout.this.o = false;
            }
        });
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.4
            @Override // java.lang.Runnable
            public void run() {
                if (view.getVisibility() == 0) {
                    view.setVisibility(8);
                }
                NrLocationRadioLayout.this.o = false;
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final View view) {
        this.s.setVisibility(0);
        if (this.o || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        view.clearAnimation();
        view.setAnimation(this.q);
        this.q.setAnimationListener(new Animation.AnimationListener() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                NrLocationRadioLayout.this.o = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                NrLocationRadioLayout.this.o = false;
            }
        });
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.view.NrLocationRadioLayout.6
            @Override // java.lang.Runnable
            public void run() {
                if (view.getVisibility() == 8) {
                    view.setVisibility(0);
                }
                NrLocationRadioLayout.this.o = false;
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.x.a(this, configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x.b(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }
}
