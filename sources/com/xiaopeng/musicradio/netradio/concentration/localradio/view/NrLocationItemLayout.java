package com.xiaopeng.musicradio.netradio.concentration.localradio.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationItemPresenter;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.xui.widget.XImageView;
import defpackage.beo;
/* loaded from: classes.dex */
public class NrLocationItemLayout extends BaseFrameLayout<Object, NrLocationItemPresenter> {
    private Context c;
    private XImageView d;
    private String e;
    private acv f;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    public NrLocationItemLayout(Context context) {
        super(context);
        this.c = context;
    }

    public NrLocationItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        this.f = acv.a(context, attributeSet);
    }

    public NrLocationItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
        this.f = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public NrLocationItemPresenter a() {
        return new NrLocationItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return beo.d.nr_layout_location_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (XImageView) findViewById(beo.c.iv);
    }

    public void setData(String str) {
        this.e = str;
        y.a(getContext(), this.e, beo.b.pic_netradio_cover_cicle_190, this.d, new auq(getContext(), 360));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f.a(this, configuration);
        f();
    }

    private void f() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        y.a(getContext(), this.e, beo.b.pic_netradio_cover_cicle_190, this.d, new auq(getContext(), 360));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b(this);
    }
}
