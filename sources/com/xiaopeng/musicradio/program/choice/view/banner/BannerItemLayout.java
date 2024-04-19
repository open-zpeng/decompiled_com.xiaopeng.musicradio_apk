package com.xiaopeng.musicradio.program.choice.view.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.banner.BannerItemPresenter;
import com.xiaopeng.musicradio.program.choice.view.banner.VerticalBannerTitle;
import com.xiaopeng.musicradio.utils.n;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class BannerItemLayout extends BaseConstraintLayout<b, BannerItemPresenter> implements VerticalBannerTitle.a, b {
    private MusicCircleImageView b;
    private PlayControlView c;
    private VerticalBannerTitle d;
    private XTextView e;
    private MusicCircleImageView f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private String l;
    private ProgramBanner m;
    private String n;
    private TodayNewsCardBean.DataBean.ListBean o;
    private boolean p;
    private boolean q;

    public BannerItemLayout(Context context) {
        super(context);
        this.g = "#0da5c8d9";
        this.h = "#f8caca";
        this.i = "#511B1B";
        this.j = "#43231F";
        this.l = null;
        this.m = null;
        this.n = null;
        this.p = false;
        this.q = false;
    }

    public BannerItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = "#0da5c8d9";
        this.h = "#f8caca";
        this.i = "#511B1B";
        this.j = "#43231F";
        this.l = null;
        this.m = null;
        this.n = null;
        this.p = false;
        this.q = false;
    }

    public BannerItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = "#0da5c8d9";
        this.h = "#f8caca";
        this.i = "#511B1B";
        this.j = "#43231F";
        this.l = null;
        this.m = null;
        this.n = null;
        this.p = false;
        this.q = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    /* renamed from: e */
    public BannerItemPresenter a() {
        return new BannerItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    protected void b() {
        this.b = (MusicCircleImageView) findViewById(b.d.album_logo);
        this.c = (PlayControlView) findViewById(b.d.play_state);
        this.d = (VerticalBannerTitle) findViewById(b.d.title_scroller);
        this.e = (XTextView) findViewById(b.d.date);
        this.f = (MusicCircleImageView) findViewById(b.d.bg_iv);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout, com.xiaopeng.xui.widget.XConstraintLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.p) {
            this.d.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout, com.xiaopeng.xui.widget.XConstraintLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    protected void c() {
        this.d.setCallback(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    public void onPause(i iVar) {
        super.onPause(iVar);
        VerticalBannerTitle verticalBannerTitle = this.d;
        if (verticalBannerTitle != null) {
            verticalBannerTitle.b();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    public void onResume(i iVar) {
        VerticalBannerTitle verticalBannerTitle;
        super.onResume(iVar);
        if (!this.p || (verticalBannerTitle = this.d) == null) {
            return;
        }
        verticalBannerTitle.a();
    }

    public void setPagerIndex(int i) {
        this.k = i;
        ((BannerItemPresenter) this.a).a(i);
    }

    public int getPagerIndex() {
        return this.k;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.choice.view.banner.BannerItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecute(b.d.play_state)) {
                    ((BannerItemPresenter) BannerItemLayout.this.a).c();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseConstraintLayout
    public int getContentViewId() {
        return b.e.item_banner;
    }

    public void f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setShape(0);
        gradientDrawable.setSize((int) getResources().getDimension(b.C0158b.banner_width), (int) getResources().getDimension(b.C0158b.banner_height));
        if (!baj.a().d()) {
            gradientDrawable.setColors(new int[]{Color.parseColor(this.g), Color.parseColor(this.h)});
        } else {
            gradientDrawable.setColors(new int[]{Color.parseColor(this.i), Color.parseColor(this.j)});
        }
        this.f.setImageDrawable(gradientDrawable);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.b
    public void g() {
        this.p = true;
        this.d.a();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.b
    public void h() {
        this.p = false;
        this.d.b();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.b
    public void i() {
        if (this.o != null) {
            y.b(getContext(), baj.a().d() ? this.o.getImage1().getCoverUrlNight() : this.o.getImage1().getCoverUrl(), b.c.pic_program_default_220, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XConstraintLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f();
    }

    public void a(TodayNewsCardBean.DataBean.ListBean listBean) {
        this.o = listBean;
        y.c(getContext(), baj.a().d() ? listBean.getImage1().getCoverUrlNight() : listBean.getImage1().getCoverUrl(), b.c.pic_program_default_220, this.b);
        if (listBean.getImage1() != null) {
            if (!TextUtils.isEmpty(listBean.getImage1().getStartColorDaytime()) && b(listBean.getImage1().getStartColorDaytime())) {
                this.g = listBean.getImage1().getStartColorDaytime();
            }
            if (!TextUtils.isEmpty(listBean.getImage1().getEndColorDaytime()) && b(listBean.getImage1().getEndColorDaytime())) {
                this.h = listBean.getImage1().getEndColorDaytime();
            }
            if (!TextUtils.isEmpty(listBean.getImage1().getStartColorNight()) && b(listBean.getImage1().getStartColorNight())) {
                this.i = listBean.getImage1().getStartColorNight();
            }
            if (!TextUtils.isEmpty(listBean.getImage1().getEndColorNight()) && b(listBean.getImage1().getEndColorNight())) {
                this.j = listBean.getImage1().getEndColorNight();
            }
        }
        f();
        ArrayList arrayList = new ArrayList();
        if (listBean.getTrackInfoBos() != null && listBean.getTrackInfoBos().size() > 0) {
            for (TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean trackInfoBosBean : listBean.getTrackInfoBos()) {
                if (!TextUtils.isEmpty(trackInfoBosBean.getTitle())) {
                    arrayList.add(new aws(trackInfoBosBean.getTitle(), trackInfoBosBean.getUpdateTime()));
                }
            }
        }
        this.d.setTextList(arrayList);
        this.d.setAnimTime(300L);
        this.d.setTextStillTime(20000L);
        if (((BannerItemPresenter) this.a).e(listBean.getCardId())) {
            this.c.setPlayState(2);
        } else {
            this.c.setPlayState(3);
        }
        ((BannerItemPresenter) this.a).a(listBean);
        setVuiPosition(this.k);
        this.n = listBean.getCardTitle();
        if (arrayList.size() >= 1) {
            this.l = ((aws) arrayList.get(0)).a();
        }
        setVuiLabel(getShowVuiLabel());
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        vuiEngine.setVuiElementTag(this, "program_banner_" + this.k);
        setVuiAction(big.CLICK.a());
        this.c.setVuiPosition(this.k);
        VuiEngine vuiEngine2 = VuiEngine.getInstance(getContext());
        PlayControlView playControlView = this.c;
        vuiEngine2.setVuiElementTag(playControlView, "program_banner_" + this.c.getId() + "_" + this.k);
        this.q = ((BannerItemPresenter) this.a).e(listBean.getCardId());
        com.xiaopeng.musicradio.vui.c.a(getContext(), this.c, this.q);
    }

    private boolean b(String str) {
        return Pattern.compile("^#(([0-9a-f]{6})|([0-9a-f]{8}))$", 2).matcher(str).matches();
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.b
    public void a(int i) {
        this.c.setPlayState(i);
        boolean z = i == 2;
        if (this.q != z) {
            com.xiaopeng.musicradio.vui.c.a(getContext(), this.c, z);
            this.q = z;
            if (this.m == null || !getVuiMode().equals(bij.NORMAL)) {
                return;
            }
            VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", this.m);
        }
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.VerticalBannerTitle.a
    public void a(long j) {
        this.e.setText(n.a("MM-dd", Long.valueOf(j)));
        this.e.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.banner.VerticalBannerTitle.a
    public void a(String str) {
        this.l = str;
        if (this.m == null || !getVuiMode().equals(bij.NORMAL)) {
            return;
        }
        setVuiLabel(getShowVuiLabel());
        VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", this.m);
    }

    public void setBanner(ProgramBanner programBanner) {
        this.m = programBanner;
    }

    private String getShowVuiLabel() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.n)) {
            sb.append(this.n);
        }
        if (!TextUtils.isEmpty(this.l)) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(this.l);
        }
        return sb.toString();
    }
}
