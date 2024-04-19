package com.xiaopeng.musicradio.playercomponent.big.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerCommonPresenter;
import com.xiaopeng.musicradio.utils.n;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.avp;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class PlayerCommonLayout extends BaseFrameLayout<c, PlayerCommonPresenter> implements c {
    private ImageView c;
    private XTextView d;
    private XTextView e;
    private XImageView f;
    private XImageView g;
    private XImageView h;
    private SeekBar i;
    private TextView j;
    private TextView k;
    private TextView l;
    private XImageView m;
    private View.OnClickListener n;
    private XConstraintLayout o;
    private XImageView p;
    private View q;
    private String r;
    private boolean s;

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void b(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void h() {
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void i() {
    }

    public PlayerCommonLayout(Context context) {
        super(context);
    }

    public PlayerCommonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayerCommonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public PlayerCommonPresenter a() {
        return new PlayerCommonPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.o = (XConstraintLayout) findViewById(avp.b.layout_info);
        this.c = (ImageView) findViewById(avp.b.img_cover);
        this.d = (XTextView) findViewById(avp.b.tv_title);
        this.e = (XTextView) findViewById(avp.b.tv_sub_title);
        this.f = (XImageView) findViewById(avp.b.btn_pre);
        this.h = (XImageView) findViewById(avp.b.btn_play);
        this.g = (XImageView) findViewById(avp.b.btn_next);
        this.i = (SeekBar) findViewById(avp.b.progress_bar_h);
        this.j = (TextView) findViewById(avp.b.tv_start);
        this.k = (TextView) findViewById(avp.b.tv_end);
        this.l = (TextView) findViewById(avp.b.tv_song_placeholder);
        this.m = (XImageView) findViewById(avp.b.img_play_list);
        this.q = findViewById(avp.b.view_touch_change);
        this.p = (XImageView) findViewById(avp.b.title_label);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.o.enableViewVuiMode(true);
        d(false);
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.h);
    }

    private void d(boolean z) {
        this.i.setClickable(z);
        this.i.setEnabled(z);
        if (z) {
            this.i.setAlpha(1.0f);
            this.j.setAlpha(1.0f);
            this.k.setAlpha(1.0f);
        } else if (this.l.getVisibility() == 0) {
            this.i.setAlpha(0.16f);
            this.j.setAlpha(0.16f);
            this.k.setAlpha(0.16f);
        }
    }

    public void a(int i, boolean z) {
        this.p.setOnClickListener(null);
        if (i == 0) {
            this.p.setVisibility(8);
            this.p.setImageDrawable(null);
        } else if (i == 1) {
            this.p.setVisibility(0);
            this.p.setImageResource(avp.a.ic_player_label_vip_ximalaya);
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ((bdn) com.xiaopeng.musicradio.service.c.a().b(bdn.class)).startVipBuy(2);
                }
            });
        } else if (i == 2) {
            this.p.setVisibility(0);
            if (z && aqh.a().e()) {
                this.p.setImageResource(avp.a.ic_player_label_paid);
            } else {
                this.p.setImageResource(avp.a.ic_player_label_payment);
            }
        } else {
            this.p.setVisibility(8);
            this.p.setImageDrawable(null);
        }
    }

    public void setSceneId(String str) {
        this.r = str;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((PlayerCommonPresenter) PlayerCommonLayout.this.b).c();
                awd.j();
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((PlayerCommonPresenter) PlayerCommonLayout.this.b).e();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((PlayerCommonPresenter) PlayerCommonLayout.this.b).d();
                awd.j();
            }
        });
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlayerCommonLayout.this.r();
            }
        });
        this.i.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    PlayerCommonLayout.this.a(i, seekBar.getMax());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.i("PlayerCommonLayout", "onStartTrackingTouch: ======");
                PlayerCommonLayout.this.s = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                ((PlayerCommonPresenter) PlayerCommonLayout.this.b).a(seekBar.getProgress());
                PlayerCommonLayout.this.s = false;
                Log.i("PlayerCommonLayout", "onStopTrackingTouch: ======");
            }
        });
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.PlayerCommonLayout.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlayerCommonLayout.this.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.n != null) {
            XImageView xImageView = this.m;
            xImageView.setSelected(!xImageView.isSelected());
            if (this.m.isSelected()) {
                n();
            } else {
                m();
            }
            this.n.onClick(this.m);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return avp.c.layout_player_common;
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(int i, int i2, int i3) {
        if (this.s) {
            Log.i("PlayerCommonLayout", "refreshPos: draging======");
            return;
        }
        if (i >= 0 && i2 >= i) {
            this.i.setMax(i2);
            this.i.setProgress(i);
            this.i.setSecondaryProgress(i3);
            this.j.setText(n.a(i));
            this.k.setText(n.a(i2));
        } else {
            this.i.setProgress(i2);
            this.i.setSecondaryProgress(i2);
            this.j.setText(n.a(i2));
            this.k.setText(n.a(i2));
        }
        if (i2 == 0) {
            d(false);
        } else {
            d(true);
        }
        a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        this.j.setText(n.a(i));
        this.k.setText(n.a(i2));
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(Drawable drawable) {
        if (drawable != null) {
            this.c.setImageResource(0);
            this.c.setImageDrawable(drawable);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(int i) {
        this.c.setImageResource(i);
    }

    public void a(String str, String str2) {
        e(true);
        this.l.setVisibility(8);
        this.d.setText(str);
        this.e.setText(str2);
    }

    public void f() {
        this.l.setVisibility(0);
        this.d.setText("");
        this.e.setText("");
        b(-1);
        c(false);
        e(false);
        d(false);
        this.p.setImageDrawable(null);
    }

    private void e(boolean z) {
        this.m.setClickable(z);
        this.m.setEnabled(z);
        if (z) {
            this.m.setAlpha(1.0f);
        } else {
            this.m.setAlpha(0.15f);
        }
    }

    public void c(boolean z) {
        this.f.setEnabled(z);
        this.f.setClickable(z);
        this.h.setEnabled(z);
        this.h.setClickable(z);
        this.g.setEnabled(z);
        this.g.setClickable(z);
        if (z) {
            this.f.setAlpha(1.0f);
            this.h.setAlpha(1.0f);
            this.g.setAlpha(1.0f);
            return;
        }
        this.f.setAlpha(0.15f);
        this.h.setAlpha(0.15f);
        this.g.setAlpha(0.15f);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void b(int i) {
        switch (i) {
            case 1:
                this.h.setImageResource(avp.a.ic_120_stop);
                VuiUtils.setStatefulButtonAttr(this.h, 0, new String[]{getContext().getString(avp.d.vui_label_play), getContext().getString(avp.d.vui_label_stop)}, null);
                break;
            case 2:
                this.h.setImageResource(avp.a.ic_120_stop);
                VuiUtils.setStatefulButtonAttr(this.h, 0, new String[]{getContext().getString(avp.d.vui_label_play), getContext().getString(avp.d.vui_label_stop)}, null);
                break;
            case 3:
                this.h.setImageResource(avp.a.ic_120_play);
                VuiUtils.setStatefulButtonAttr(this.h, 1, new String[]{getContext().getString(avp.d.vui_label_play), getContext().getString(avp.d.vui_label_stop)}, null);
                break;
            default:
                this.h.setImageResource(avp.a.ic_120_play);
                VuiUtils.setStatefulButtonAttr(this.h, 1, new String[]{getContext().getString(avp.d.vui_label_play), getContext().getString(avp.d.vui_label_stop)}, null);
                break;
        }
        if (TextUtils.isEmpty(this.r)) {
            return;
        }
        VuiEngine.getInstance(getContext()).updateScene(this.r, this.h);
    }

    public void setPlayListClickListener(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void g() {
        this.m.callOnClick();
    }

    public void j() {
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.l.setText(avp.d.player_music_default);
    }

    public void k() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.l.setVisibility(8);
        this.l.setText("");
    }

    public void l() {
        this.c.setVisibility(0);
    }

    public void m() {
        this.o.setVisibility(0);
        this.q.setVisibility(8);
    }

    public void n() {
        this.o.setVisibility(8);
        this.q.setVisibility(0);
    }

    public void o() {
        this.j.setVisibility(0);
        this.k.setVisibility(0);
        this.i.setVisibility(0);
    }

    public void p() {
        this.j.setVisibility(8);
        this.k.setVisibility(8);
        this.i.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void a(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
        if (z || !this.m.isSelected()) {
            return;
        }
        r();
    }

    public boolean q() {
        return this.m.isSelected();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (acs.b(configuration)) {
            this.i.setProgressDrawable(getResources().getDrawable(avp.a.bg_progress_v3));
            this.i.setThumb(getResources().getDrawable(avp.a.bg_seek_thumb_selector));
            this.i.setThumbOffset(35);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.c
    public void V_() {
        if (this.m.isSelected()) {
            return;
        }
        r();
    }

    public List<View> getUpdateViews() {
        return Arrays.asList(this.o);
    }
}
