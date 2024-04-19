package com.xiaopeng.musicradio.program.choice.view.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import androidx.viewpager.widget.ViewPager;
import com.to.aboomy.banner.HolderCreator;
import com.to.aboomy.banner.IndicatorView;
import com.to.aboomy.banner.OnPageItemClickListener;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.commonui.base.BaseLinearLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.banner.ChoiceBannerPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.ax;
import com.xiaopeng.musicradio.utils.bo;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vip.view.VipSaleBanner;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.ago;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class ChoiceBannerLayout extends BaseLinearLayout<c, ChoiceBannerPresenter> implements c {
    private static String c = "ChoiceBannerLayout";
    private int d;
    private ProgramBanner e;
    private LinearLayout f;
    private ConstraintLayout g;
    private MusicCircleImageView h;
    private XTextView i;
    private XTextView j;
    private PlayControlView k;
    private LoadingTipsView l;
    private List<TodayNewsCardBean.DataBean.ListBean> m;
    private FrameLayout n;
    private int o;
    private VipSaleBanner p;
    private boolean q;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
    }

    public ChoiceBannerLayout(Context context) {
        super(context);
        this.d = -1;
        this.o = -1;
        this.q = false;
    }

    public ChoiceBannerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.o = -1;
        this.q = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    /* renamed from: e */
    public ChoiceBannerPresenter a() {
        return new ChoiceBannerPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public void onResume(i iVar) {
        List<TodayNewsCardBean.DataBean.ListBean> list;
        super.onResume(iVar);
        int i = this.o;
        if (i <= -1 || (list = this.m) == null || i >= list.size()) {
            return;
        }
        ((ChoiceBannerPresenter) this.b).c(this.o);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.e = (ProgramBanner) findViewById(b.d.banner);
        this.f = (LinearLayout) findViewById(b.d.no_reading_history_layout);
        this.g = (ConstraintLayout) findViewById(b.d.reading_history_layout);
        this.h = (MusicCircleImageView) findViewById(b.d.album_logo);
        this.j = (XTextView) findViewById(b.d.album_percentage);
        this.i = (XTextView) findViewById(b.d.album_title);
        this.k = (PlayControlView) findViewById(b.d.history_play_control);
        this.l = (LoadingTipsView) findViewById(b.d.loading_tips);
        this.n = (FrameLayout) findViewById(b.d.banner_root);
        this.p = (VipSaleBanner) findViewById(b.d.vipsale_banner);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
        this.e.setIndicator(a(b.a.banner_indicator, b.a.banner_indicator_selected)).setHolderCreator(new a()).setAutoPlay(false).setOnPageClickListener(new OnPageItemClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.2
            @Override // com.to.aboomy.banner.OnPageItemClickListener
            public void onPageItemClick(View view, int i) {
                ((ChoiceBannerPresenter) ChoiceBannerLayout.this.b).a(i);
                ((ChoiceBannerPresenter) ChoiceBannerLayout.this.b).g();
            }
        }).setOuterPageChangeListener(new ViewPager.f() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.1
            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageSelected(int i) {
                ChoiceBannerLayout.this.o = i;
                ((ChoiceBannerPresenter) ChoiceBannerLayout.this.b).c(i);
                ChoiceBannerLayout.this.b(i);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((ChoiceBannerPresenter) ChoiceBannerLayout.this.b).d();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((ChoiceBannerPresenter) ChoiceBannerLayout.this.b).e();
            }
        });
        this.n.setOutlineProvider(new ViewOutlineProvider() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.5
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 20.0f);
            }
        });
        this.n.setClipToOutline(true);
        this.e.setPageMargin(0, 20);
        this.p.setVipSaleType(2);
    }

    private IndicatorView a(int i, int i2) {
        return new IndicatorView(getContext()).setIndicatorColor(bak.a(i, baj.a().d())).setIndicatorStyle(1).setIndicatorSelectedRatio(2.0f).setIndicatorRadius(4.0f).setIndicatorSelectorColor(bak.a(i2, baj.a().d()));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return b.e.layout_banner_view;
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void a(List<TodayNewsCardBean.DataBean.ListBean> list, boolean z) {
        String str = c;
        LogUtils.i(str, "updateBannerData:" + z);
        List<TodayNewsCardBean.DataBean.ListBean> list2 = this.m;
        if (list2 == null || list2.size() <= 0 || z || this.d != baj.a().c()) {
            this.d = baj.a().c();
            this.e.setPages(list, this.e.getCurrentPager());
            this.m = list;
            postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.6
                @Override // java.lang.Runnable
                public void run() {
                    ChoiceBannerLayout.this.b(0);
                }
            }, 400L);
        }
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void a(String str, String str2, String str3, boolean z) {
        if (this.f.getVisibility() == 0) {
            this.f.setVisibility(8);
        }
        if (this.g.getVisibility() == 8) {
            this.g.setVisibility(0);
        }
        this.i.setText(str);
        this.j.setText(str2);
        y.c(getContext(), str3, b.c.pic_program_default_220, this.h);
        this.q = z;
        com.xiaopeng.musicradio.vui.c.a(getContext(), this.k, z);
        VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", Arrays.asList(this.f, this.g, this.k));
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void ag_() {
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", Arrays.asList(this.f, this.g));
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void a(int i) {
        this.k.setPlayState(i);
        boolean z = i == 2;
        if (this.q != z) {
            com.xiaopeng.musicradio.vui.c.a(getContext(), this.k, z);
            this.q = z;
            VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XLinearLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g();
        ((ChoiceBannerPresenter) this.b).f();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void setLoadingState(int i) {
        List<TodayNewsCardBean.DataBean.ListBean> list = this.m;
        if (list == null || list.size() == 0) {
            this.l.setState(i);
            if (i == 2) {
                this.l.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.ChoiceBannerLayout.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ((ChoiceBannerPresenter) ChoiceBannerLayout.this.b).c();
                        u.c(new ago.e(1));
                    }
                });
                return;
            } else {
                this.l.setOnClickListener(null);
                return;
            }
        }
        String str = c;
        LogUtils.d(str, "setLoadingState :" + i + " ignore, as there's data in the banner");
        this.l.setState(0);
        this.l.setOnClickListener(null);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.c
    public void h() {
        if (this.e != null) {
            g();
            aw.a(this.e.getViewPager(), "setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, new Object[]{Integer.valueOf(this.e.getCurrentPager() + (this.e.getNeedPage() / 2)), true, true});
        }
    }

    private void g() {
        if (this.m != null) {
            IndicatorView a2 = a(b.a.banner_indicator, b.a.banner_indicator_selected);
            a2.initIndicatorCount(this.m.size());
            a2.onPageScrolled(this.e.getCurrentPager(), 0.0f, 0);
            this.e.setIndicator(a2);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements HolderCreator {
        public a() {
        }

        @Override // com.to.aboomy.banner.HolderCreator
        public View createView(Context context, int i, Object obj) {
            View a = bo.a().a(ax.a.READING_BANNER_HOLDER_CREATOR);
            if (a != null) {
                Log.d(ChoiceBannerLayout.c, "BannerHolderCreator get view from cache.");
            } else {
                a = View.inflate(context, b.e.item_banner_wrapper, null);
                Log.d(ChoiceBannerLayout.c, "BannerHolderCreator get view by create.");
                bo.a().b(ax.a.READING_BANNER_HOLDER_CREATOR);
            }
            BannerItemLayout bannerItemLayout = (BannerItemLayout) a.findViewById(b.d.banner_item_root);
            bannerItemLayout.setPagerIndex(i);
            if (obj instanceof TodayNewsCardBean.DataBean.ListBean) {
                bannerItemLayout.a((TodayNewsCardBean.DataBean.ListBean) obj);
                bannerItemLayout.setBanner(ChoiceBannerLayout.this.e);
            }
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        List<TodayNewsCardBean.DataBean.ListBean> list = this.m;
        if (list == null || list.size() <= i) {
            return;
        }
        TodayNewsCardBean.DataBean.ListBean listBean = this.m.get(i);
        this.e.a(listBean, ((ChoiceBannerPresenter) this.b).e(listBean.getCardId()), i);
    }
}
