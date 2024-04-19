package com.xiaopeng.musicradio.vip.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.viewpager.widget.ViewPager;
import com.to.aboomy.banner.Banner;
import com.to.aboomy.banner.HolderCreator;
import com.to.aboomy.banner.IndicatorView;
import com.to.aboomy.banner.OnPageItemClickListener;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.VipSaleInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.vip.presenter.VipSaleBannerPresenter;
import com.xiaopeng.musicradio.web.b;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class VipSaleBanner extends VuiBaseFrameLayout<com.xiaopeng.musicradio.vip.view.a, VipSaleBannerPresenter> implements com.xiaopeng.musicradio.vip.view.a {
    private Banner c;
    private int d;
    private int e;
    private List<VipSaleInfo> f;
    private int g;
    private int h;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    public VipSaleBanner(Context context) {
        super(context);
        this.d = 0;
        this.e = -10;
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
    }

    public VipSaleBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = -10;
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
    }

    public VipSaleBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = -10;
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public VipSaleBannerPresenter a() {
        return new VipSaleBannerPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (Banner) findViewById(f.C0131f.banner);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        IndicatorView a2 = a(f.c.banner_indicator_932D, f.c.bg_white_color);
        a2.setX(this.d);
        a2.setY(this.e);
        this.c.setPageMargin(-20, 20);
        this.c.setIndicator(a2).setHolderCreator(new a()).setAutoPlay(false).setOnPageClickListener(new OnPageItemClickListener() { // from class: com.xiaopeng.musicradio.vip.view.VipSaleBanner.2
            @Override // com.to.aboomy.banner.OnPageItemClickListener
            public void onPageItemClick(View view, int i) {
                VipSaleInfo vipSaleInfo;
                if (!ShakeUtil.canExecuteLong(view.getId()) || (vipSaleInfo = (VipSaleInfo) VipSaleBanner.this.f.get(i)) == null) {
                    return;
                }
                int i2 = VipSaleBanner.this.h;
                if (i2 == 0) {
                    bdj.b(SkillStatisticsBean.PAGE_MUSIC);
                } else if (i2 != 9) {
                    switch (i2) {
                        case 2:
                            bdj.c("read");
                            break;
                        case 3:
                            bdj.a("mine");
                            break;
                    }
                } else {
                    bdj.d("radio");
                }
                Context c = com.xiaopeng.musicradio.utils.a.a().c();
                if (c == null) {
                    c = com.xiaopeng.musicradio.a.a;
                }
                new b(c, vipSaleInfo.getUrl(), VipSaleBanner.this.h).b();
            }
        }).setOuterPageChangeListener(new ViewPager.f() { // from class: com.xiaopeng.musicradio.vip.view.VipSaleBanner.1
            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.f
            public void onPageSelected(int i) {
                VipSaleBanner.this.g = i;
            }
        });
    }

    @Override // com.xiaopeng.musicradio.vip.view.a
    public void aA_() {
        getSaleData();
        LogUtils.i("sunny123", "mData" + this.f.size());
        h();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        LogUtils.i("VipSaleBanner", "onResume" + this.f.size());
        if (this.f.size() > 0) {
            h();
            return;
        }
        getSaleData();
        LogUtils.i("VipSaleBanner", "onResume2" + this.f.size());
        h();
    }

    private void getSaleData() {
        bcu bcuVar = (bcu) c.a().b(bcu.class);
        if (bcuVar != null) {
            int i = this.h;
            if (i == 0) {
                this.f = bcuVar.getQqInfos();
            } else if (i != 9) {
                switch (i) {
                    case 2:
                        this.f = bcuVar.getReadingInfos();
                        return;
                    case 3:
                        this.f = bcuVar.getUserInfos();
                        return;
                    default:
                        return;
                }
            } else {
                this.f = bcuVar.getRadioInfos();
            }
        }
    }

    private void h() {
        if (this.f.size() > 0) {
            this.c.setVisibility(0);
            this.c.setPages(this.f, this.g);
            return;
        }
        this.c.setVisibility(8);
    }

    /* loaded from: classes2.dex */
    public class a implements HolderCreator {
        public a() {
        }

        @Override // com.to.aboomy.banner.HolderCreator
        public View createView(Context context, int i, Object obj) {
            View inflate = View.inflate(context, f.g.item_salebanner_wrapper, null);
            ((SaleBannerLayout) inflate.findViewById(f.C0131f.banner_item_root)).a((VipSaleInfo) VipSaleBanner.this.f.get(i), VipSaleBanner.this.h);
            return inflate;
        }
    }

    private IndicatorView a(int i, int i2) {
        return new IndicatorView(getContext()).setIndicatorColor(bak.a(i, baj.a().d())).setIndicatorStyle(1).setIndicatorSelectedRatio(2.0f).setIndicatorRadius(4.0f).setIndicatorSelectorColor(bak.a(i2, baj.a().d()));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return f.g.layout_vip_sale_banner;
    }

    public void setVipSaleType(int i) {
        this.h = i;
        aA_();
    }
}
