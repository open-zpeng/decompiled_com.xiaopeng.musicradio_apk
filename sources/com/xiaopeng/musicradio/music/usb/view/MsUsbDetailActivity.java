package com.xiaopeng.musicradio.music.usb.view;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity;
import com.xiaopeng.musicradio.music.usb.presenter.MsUsbDetailPresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.y;
import java.util.ArrayList;
@Route(path = "/music/activity/usb_detail")
/* loaded from: classes.dex */
public class MsUsbDetailActivity extends MsMusicDetailActivity {
    private RelativeLayout u;
    private LinearLayout v;

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicUsbDetail";
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void r() {
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void u() {
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        this.j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_usb_detail;
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        super.g();
        this.u = (RelativeLayout) findViewById(b.d.tips_layout);
        this.v = (LinearLayout) findViewById(b.d.left_content);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void a() {
        if (getIntent() != null) {
            this.o = Long.valueOf(getIntent().getLongExtra("detail_id", 0L));
            this.m = getIntent().getStringExtra("detail_title");
            this.n = getIntent().getStringExtra("detail_LOGO");
            ((MsMusicDetailPresenter) this.b).a(this.o.longValue());
            ((MsMusicDetailPresenter) this.b).c();
            this.f.setTitle(this.m);
            this.q = ant.a().a(this.o.longValue());
            y.b(this, this.n, b.c.usb_260, this.h);
        }
        this.f.setTitle(ListSignBean.USB_MUSIC_TITLE);
        this.o = Long.valueOf((long) ListSignBean.USB_MUSIC_ID);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void v() {
        this.l = new aty(this);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    /* renamed from: q */
    public MsUsbDetailPresenter t() {
        return new MsUsbDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        super.b(str);
        b(0);
        this.v.setVisibility(8);
        this.r.setVisibility(8);
        this.u.setVisibility(0);
        this.g.setLoadingText(b.f.common_tips_loading);
        this.g.a();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.music.main.view.a
    public void a(ArrayList<MusicInfo> arrayList) {
        if (arrayList.size() > 0) {
            y.b(this, "", b.c.usb_260, this.h);
        }
        this.v.setVisibility(0);
        this.r.setVisibility(0);
        super.a(arrayList);
        this.g.setLoadingText(b.f.common_tips_loading);
        this.g.a();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        super.r_();
        this.v.setVisibility(8);
        this.r.setVisibility(8);
        this.u.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public ListSignBean s() {
        return ad.a((long) ListSignBean.USB_MUSIC_ID, ListSignBean.USB_MUSIC_TITLE);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.music.main.view.a
    public void a(double d) {
        if (d < 0.0d) {
            this.g.setLoadingText(b.f.usb_loading_tips_timeout);
        } else if (d < 10.0d) {
            this.g.setLoadingText(b.f.usb_loading_tips_less_than_10_sec);
        } else if (d < 60.0d) {
            this.g.setLoadingText(b.f.usb_loading_tips_between_10_and_60_sec);
        } else {
            this.g.setLoadingText(b.f.usb_loading_tips_large_than_60_sec);
        }
        this.g.a();
    }
}
