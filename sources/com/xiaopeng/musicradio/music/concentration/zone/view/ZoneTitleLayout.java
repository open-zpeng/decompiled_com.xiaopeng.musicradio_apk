package com.xiaopeng.musicradio.music.concentration.zone.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.presenter.MsZoneTitlePresenter;
/* loaded from: classes.dex */
public class ZoneTitleLayout extends BaseFrameLayout<d, MsZoneTitlePresenter> implements d {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public ZoneTitleLayout(Context context) {
        super(context);
    }

    public ZoneTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZoneTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public MsZoneTitlePresenter a() {
        return new MsZoneTitlePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_zone_title;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }
}
