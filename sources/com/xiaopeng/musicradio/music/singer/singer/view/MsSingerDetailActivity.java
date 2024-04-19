package com.xiaopeng.musicradio.music.singer.singer.view;

import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity;
import com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerDetailPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.Arrays;
@Route(path = "/music/activity/singer_detail")
/* loaded from: classes.dex */
public class MsSingerDetailActivity extends MsMusicDetailActivity implements View.OnClickListener {
    private boolean A = false;
    private XRelativeLayout u;
    private XTextView v;
    private XRelativeLayout w;
    private XTextView x;
    private XRelativeLayout y;
    private MsSingerCollectLayout z;

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicSingerDetail";
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void u() {
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        super.g();
        this.u = (XRelativeLayout) findViewById(b.d.single_layout);
        this.v = (XTextView) findViewById(b.d.single_name);
        this.w = (XRelativeLayout) findViewById(b.d.collect_layout);
        this.x = (XTextView) findViewById(b.d.collect_name);
        this.y = (XRelativeLayout) findViewById(b.d.single_content);
        this.z = (MsSingerCollectLayout) findViewById(b.d.collect_content);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        this.j.setVisibility(8);
        b(true);
        this.u.setOnClickListener(this);
        this.w.setOnClickListener(this);
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public void a() {
        if (getIntent() != null) {
            this.o = Long.valueOf(getIntent().getLongExtra("detail_id", 3520L));
            this.m = getIntent().getStringExtra("detail_title");
            this.n = getIntent().getStringExtra("detail_LOGO");
            ((MsMusicDetailPresenter) this.b).a(this.o.longValue());
            ((MsMusicDetailPresenter) this.b).c();
            this.f.setTitle(this.m);
            this.q = ant.a().a(this.o.longValue());
            y.b(this, this.n, b.c.pic_covers_music_220, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity, com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_singer_detail;
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    /* renamed from: q */
    public MsSingerDetailPresenter t() {
        return new MsSingerDetailPresenter();
    }

    @Override // com.xiaopeng.musicradio.music.main.view.MsMusicDetailActivity
    public ListSignBean s() {
        return au.f(this.o.longValue(), this.m);
    }

    private void b(boolean z) {
        if (z) {
            this.u.setSelected(true);
            this.v.setSelected(true);
            this.w.setSelected(false);
            this.x.setSelected(false);
            return;
        }
        this.u.setSelected(false);
        this.v.setSelected(false);
        this.w.setSelected(true);
        this.x.setSelected(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == b.d.single_layout) {
            b(true);
            this.y.setVisibility(0);
            this.z.setVisibility(8);
            VuiEngine.getInstance(this).updateElementAttribute(m(), Arrays.asList(this.y, this.z));
            VuiEngine.getInstance(this).updateScene(m(), Arrays.asList(this.y, this.z));
        } else if (id == b.d.collect_layout) {
            b(false);
            this.y.setVisibility(8);
            this.z.setVisibility(0);
            VuiEngine.getInstance(this).updateElementAttribute(m(), Arrays.asList(this.y, this.z));
            VuiEngine.getInstance(this).updateScene(m(), Arrays.asList(this.y, this.z));
            if (this.A) {
                return;
            }
            this.A = true;
            this.z.setmId(String.valueOf(this.o));
            this.z.g();
        }
    }
}
