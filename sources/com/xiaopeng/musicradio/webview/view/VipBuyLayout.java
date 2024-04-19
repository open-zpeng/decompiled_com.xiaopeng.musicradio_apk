package com.xiaopeng.musicradio.webview.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.xiaopeng.musicradio.bean.UserBuyUrl;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.webview.presenter.VipBuyPresenter;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XImageView;
import defpackage.bdm;
/* loaded from: classes2.dex */
public class VipBuyLayout extends BaseFrameLayout<a, VipBuyPresenter> implements a {
    private LoadingTipsView c;
    private XImageButton d;
    private int e;
    private XImageView f;
    private String g;
    private String h;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public VipBuyLayout(Context context) {
        super(context);
        this.g = "";
        this.h = "";
    }

    public VipBuyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = "";
        this.h = "";
    }

    public VipBuyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = "";
        this.h = "";
    }

    public void a(int i, String str) {
        ((VipBuyPresenter) this.b).onCreate(null);
        this.e = i;
        if (TextUtils.isEmpty(str)) {
            ((VipBuyPresenter) this.b).a(i);
        } else {
            b(str);
        }
    }

    private void b(String str) {
        Glide.with(this.f.getContext()).load(str).into((RequestBuilder<Drawable>) new SimpleTarget<Drawable>() { // from class: com.xiaopeng.musicradio.webview.view.VipBuyLayout.1
            @Override // com.bumptech.glide.request.target.Target
            /* renamed from: a */
            public void onResourceReady(Drawable drawable, Transition transition) {
                VipBuyLayout.this.f.setVisibility(0);
                VipBuyLayout.this.a(0);
                VipBuyLayout.this.f.setImageDrawable(drawable);
            }

            @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
            public void onStart() {
                super.onStart();
                VipBuyLayout.this.a(1);
                VipBuyLayout.this.f.setVisibility(8);
            }

            @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                super.onLoadFailed(drawable);
                VipBuyLayout.this.a(2);
                VipBuyLayout.this.f.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public VipBuyPresenter a() {
        return new VipBuyPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return bdm.d.vip_buy_layout;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.f = (XImageView) findViewById(bdm.c.buy_img);
        this.d = (XImageButton) findViewById(bdm.c.cancle_btn);
        this.c = (LoadingTipsView) findViewById(bdm.c.loading_item);
        this.c.setAutoClickLoadingEnable(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.webview.view.VipBuyLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VipBuyLayout.this.c.getState() == 3 || VipBuyLayout.this.c.getState() == 2) {
                    if (TextUtils.isEmpty(VipBuyLayout.this.g) || TextUtils.isEmpty(VipBuyLayout.this.h)) {
                        ((VipBuyPresenter) VipBuyLayout.this.b).a(VipBuyLayout.this.e);
                        return;
                    }
                    VipBuyLayout vipBuyLayout = VipBuyLayout.this;
                    vipBuyLayout.a(vipBuyLayout.g, VipBuyLayout.this.h);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.c.setState(i);
        if (i == 1 || i == 3) {
            this.c.setClickable(false);
        } else {
            this.c.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    @Override // com.xiaopeng.musicradio.webview.view.a
    public void a(String str, String str2) {
        this.g = str;
        this.h = str2;
        if (baj.a().d()) {
            b(this.h);
        } else {
            b(this.g);
        }
    }

    @Override // com.xiaopeng.musicradio.webview.view.a
    public void e() {
        a(1);
    }

    @Override // com.xiaopeng.musicradio.webview.view.a
    public void a(String str) {
        a(2);
    }

    @Override // com.xiaopeng.musicradio.webview.view.a
    public void a(UserBuyUrl userBuyUrl) {
        a(0);
    }

    public void setCancleListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void g() {
        ((VipBuyPresenter) this.b).onDestroy(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(this.g, this.h);
    }
}
