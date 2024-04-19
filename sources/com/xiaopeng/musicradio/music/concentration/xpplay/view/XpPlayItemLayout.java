package com.xiaopeng.musicradio.music.concentration.xpplay.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout;
import com.xiaopeng.musicradio.music.concentration.xpplay.presenter.MsXpPlayItemPresenter;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class XpPlayItemLayout extends BaseFrameLayout<b, MsXpPlayItemPresenter> implements b {
    private Context c;
    private XTextView d;
    private MsRmItemLayout e;
    private MsRmItemLayout f;
    private MsRmItemLayout g;
    private ArrayList<MsRmItemLayout> h;
    private int i;
    private XFrameLayout j;
    private acv k;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.xpplay.view.b
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.xpplay.view.b
    public void e() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public XpPlayItemLayout(Context context) {
        super(context);
        this.h = new ArrayList<>();
        this.i = 12;
        this.c = context;
    }

    public XpPlayItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList<>();
        this.i = 12;
        this.c = context;
        this.k = acv.a(context, attributeSet);
    }

    public XpPlayItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList<>();
        this.i = 12;
        this.c = context;
        this.k = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsXpPlayItemPresenter a() {
        return new MsXpPlayItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_xp_play_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.j = (XFrameLayout) findViewById(b.d.root_layout);
        this.d = (XTextView) findViewById(b.d.name);
        this.e = (MsRmItemLayout) findViewById(b.d.rm_item_one);
        this.f = (MsRmItemLayout) findViewById(b.d.rm_item_tow);
        this.g = (MsRmItemLayout) findViewById(b.d.rm_item_three);
        this.h.add(this.e);
        this.h.add(this.f);
        this.h.add(this.g);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        g();
    }

    public void a(int i, String str, List<MusicRadioItem> list) {
        this.d.setText(str);
        int size = list.size() < 3 ? list.size() : 3;
        for (int i2 = 0; i2 < size; i2++) {
            this.h.get(i2).a(list.get(i2), this.i + i2);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        g();
    }

    private void g() {
        this.j.setBackground(getContext().getDrawable(b.c.img_listentogether));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k.a(this, configuration);
        if (acs.b(configuration)) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k.b(this);
    }
}
