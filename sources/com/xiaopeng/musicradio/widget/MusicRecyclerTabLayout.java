package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
/* loaded from: classes2.dex */
public class MusicRecyclerTabLayout extends f {
    private acv A;
    private g B;

    public MusicRecyclerTabLayout(Context context) {
        super(context);
        setOverScrollMode(2);
    }

    public MusicRecyclerTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = acv.a(context, attributeSet);
        setOverScrollMode(2);
    }

    public MusicRecyclerTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = acv.a(context, attributeSet);
        setOverScrollMode(2);
    }

    public void setUpWithViewPager(NoScrollViewPager noScrollViewPager) {
        this.B = new g(noScrollViewPager);
        setAdapter(this.B);
        a(noScrollViewPager.getCurrentItem());
    }

    @Override // com.xiaopeng.musicradio.widget.f
    public void a(int i) {
        this.B.c.setCurrentItem(i);
        scrollToPosition(i);
        g gVar = this.B;
        if (gVar != null) {
            gVar.f(i);
            this.B.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRecyclerView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        g gVar;
        super.onConfigurationChanged(configuration);
        this.A.a(this, configuration);
        if (!acs.b(configuration) || (gVar = this.B) == null) {
            return;
        }
        gVar.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView, com.xiaopeng.xui.widget.XRecyclerView, com.xiaopeng.xui.vui.VuiRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.a((View) this);
        g gVar = this.B;
        if (gVar == null || gVar.c == null) {
            return;
        }
        a(this.B.c.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.f, com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView, com.xiaopeng.xui.widget.XRecyclerView, com.xiaopeng.xui.vui.VuiRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.b(this);
    }
}
