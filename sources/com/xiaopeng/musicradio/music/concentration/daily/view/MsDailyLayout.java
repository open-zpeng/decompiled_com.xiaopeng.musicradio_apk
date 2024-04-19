package com.xiaopeng.musicradio.music.concentration.daily.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.daily.presenter.MsDailyPresenter;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.Date;
/* loaded from: classes.dex */
public class MsDailyLayout extends VuiBaseFrameLayout<a, MsDailyPresenter> implements bic, a {
    private MusicCircleImageView c;
    private MusicCircleImageView d;
    private MusicCircleImageView e;
    private MusicCircleImageView f;
    private XTextView g;
    private XTextView h;
    private XImageView i;
    private XFrameLayout j;
    private ConstraintLayout k;
    private LoadingTipsView l;
    private String m;
    private String n;
    private String o;
    private XLinearLayout p;
    private acv q;
    private boolean r;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public MsDailyLayout(Context context) {
        super(context);
        this.m = "";
        this.n = "";
        this.o = "";
        this.r = false;
    }

    public MsDailyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = "";
        this.n = "";
        this.o = "";
        this.r = false;
        this.q = acv.a(context, attributeSet);
    }

    public MsDailyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = "";
        this.n = "";
        this.o = "";
        this.r = false;
        this.q = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public MsDailyPresenter a() {
        return new MsDailyPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (MusicCircleImageView) findViewById(b.d.item_bg);
        this.d = (MusicCircleImageView) findViewById(b.d.daily_img_two);
        this.e = (MusicCircleImageView) findViewById(b.d.daily_img_three);
        this.f = (MusicCircleImageView) findViewById(b.d.daily_img_one);
        this.g = (XTextView) findViewById(b.d.daily_day);
        this.h = (XTextView) findViewById(b.d.daily_month);
        this.i = (XImageView) findViewById(b.d.play_icon);
        this.j = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.k = (ConstraintLayout) findViewById(b.d.daily_content);
        this.l = (LoadingTipsView) findViewById(b.d.ms_selection_daily_loading_item);
        this.l.setAutoClickLoadingEnable(false);
        this.p = (XLinearLayout) findViewById(b.d.root_item_layout);
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        XFrameLayout xFrameLayout = this.j;
        vuiEngine.setVuiElementTag(xFrameLayout, "ms_daily_play_" + this.j.getId());
        c.a(getContext(), this.j, false);
        c.a((XConstraintLayout) findViewById(b.d.daily_content), "" + this.p.getId());
        setBackground(getContext().getDrawable(b.c.bg_daily_main));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        j();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.daily.view.MsDailyLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MsDailyPresenter) MsDailyLayout.this.b).g();
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.daily.view.MsDailyLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsDailyLayout.this.i();
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.daily.view.MsDailyLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.a();
                sp.a().a("/music/activity/fav_daily_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).navigation();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_selection_daily;
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

    @Override // com.xiaopeng.musicradio.music.concentration.daily.view.a
    public void a(ArrayList<MusicInfo> arrayList) {
        if (arrayList.size() > 3) {
            a(0);
            this.k.setVisibility(0);
            String logo = arrayList.get(0).getLogo();
            String logo2 = arrayList.get(1).getLogo();
            String logo3 = arrayList.get(2).getLogo();
            if (!TextUtils.equals(logo, this.m)) {
                this.m = logo;
                y.a(com.xiaopeng.musicradio.a.a, this.m, 60, b.c.img_blur_810, 800, 800, this.c);
                y.b(this.f.getContext(), this.m, b.c.pic_covers_music_220, this.f);
            }
            if (!TextUtils.equals(logo2, this.n)) {
                this.n = logo2;
                y.b(this.d.getContext(), this.n, b.c.pic_covers_music_220, this.d);
            }
            if (TextUtils.equals(logo3, this.o)) {
                return;
            }
            this.o = logo3;
            y.b(this.e.getContext(), this.o, b.c.pic_covers_music_220, this.e);
            return;
        }
        b("");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        k();
        j();
    }

    private void k() {
        if (!TextUtils.isEmpty(this.m)) {
            y.b(this.f.getContext(), this.m, b.c.pic_covers_music_220, this.f);
        }
        if (!TextUtils.isEmpty(this.n)) {
            y.b(this.d.getContext(), this.n, b.c.pic_covers_music_220, this.d);
        }
        if (TextUtils.isEmpty(this.o)) {
            return;
        }
        y.b(this.e.getContext(), this.o, b.c.pic_covers_music_220, this.e);
    }

    public void i() {
        ((MsDailyPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.music.concentration.daily.view.a
    public void a(boolean z) {
        boolean z2 = false;
        if (z) {
            switch (apk.i().getPlayState()) {
                case 1:
                    this.i.setImageResource(b.c.ic_btn_stop);
                    break;
                case 2:
                    this.i.setImageResource(b.c.ic_btn_stop);
                    z2 = true;
                    break;
                case 3:
                    this.i.setImageResource(b.c.ic_btn_playall);
                    break;
                default:
                    this.i.setImageResource(b.c.ic_btn_playall);
                    break;
            }
        } else {
            this.i.setImageResource(b.c.ic_btn_playall);
        }
        if (this.r != z2) {
            c.a(getContext(), this.j, z2);
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.j);
            this.r = z2;
        }
    }

    public void j() {
        String b = bg.b(new Date(System.currentTimeMillis()));
        String a = bg.a(new Date(System.currentTimeMillis()));
        if (this.g == null || this.h == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(b)) {
            return;
        }
        this.g.setText(a);
        this.h.setText(b);
    }

    private void a(int i) {
        this.l.setState(i);
        if (i == 1) {
            this.l.setClickable(false);
        } else {
            this.l.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.a(this, configuration);
        if (acs.b(configuration)) {
            k();
            if (this.c != null) {
                if (acs.d(getContext())) {
                    this.c.setAlpha(0.6f);
                } else {
                    this.c.setAlpha(0.8f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q.b(this);
    }
}
