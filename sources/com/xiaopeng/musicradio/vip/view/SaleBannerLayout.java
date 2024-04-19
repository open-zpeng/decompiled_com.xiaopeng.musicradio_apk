package com.xiaopeng.musicradio.vip.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.xiaopeng.musicradio.bean.VipSaleInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.widget.XFrameLayout;
/* loaded from: classes2.dex */
public class SaleBannerLayout extends XFrameLayout {
    private MusicCircleImageView a;
    private VipSaleInfo b;
    private int c;

    public SaleBannerLayout(Context context) {
        super(context);
        this.c = 0;
        a();
    }

    public SaleBannerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        a();
    }

    public SaleBannerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(f.g.item_salebanner_layout, this);
        this.a = (MusicCircleImageView) findViewById(f.C0131f.image);
    }

    public void a(VipSaleInfo vipSaleInfo, int i) {
        this.b = vipSaleInfo;
        this.c = i;
        int i2 = f.e.pic_defaultcover_banner_read;
        int i3 = this.c;
        if (i3 == 0 || i3 == 1 || i3 == 4) {
            i2 = f.e.pic_defaultcover_banner_music;
        }
        y.b(getContext(), vipSaleInfo.getBannerImg(), i2, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        VipSaleInfo vipSaleInfo = this.b;
        if (vipSaleInfo != null) {
            a(vipSaleInfo, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        VipSaleInfo vipSaleInfo = this.b;
        if (vipSaleInfo != null) {
            a(vipSaleInfo, this.c);
        }
    }
}
