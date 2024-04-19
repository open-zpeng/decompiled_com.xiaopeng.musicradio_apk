package com.xiaopeng.musicradio.music.concentration.recommend.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MsRmItemLayout extends BaseFrameLayout<c, MsRmItemPresenter> implements c {
    public XFrameLayout c;
    private Context d;
    private MusicCircleImageView e;
    private XImageView f;
    private XFrameLayout g;
    private XTextView h;
    private XTextView i;
    private XFrameLayout j;
    private long k;
    private String l;
    private int m;
    private boolean n;
    private acv o;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
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

    public MsRmItemLayout(Context context) {
        super(context);
        this.m = 1;
        this.n = false;
        this.d = context;
    }

    public MsRmItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 1;
        this.n = false;
        this.d = context;
        this.o = acv.a(context, attributeSet);
    }

    public MsRmItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 1;
        this.n = false;
        this.d = context;
        this.o = acv.a(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsRmItemPresenter a() {
        return new MsRmItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_rm_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (MusicCircleImageView) findViewById(b.d.item_logo);
        this.f = (XImageView) findViewById(b.d.play_icon);
        this.g = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.c = (XFrameLayout) findViewById(b.d.item_layout);
        this.h = (XTextView) findViewById(b.d.radio_title);
        this.j = (XFrameLayout) findViewById(b.d.root_view);
        this.i = (XTextView) findViewById(b.d.tv_speech_num);
    }

    public void a(final MusicRadioItem musicRadioItem, int i) {
        boolean z;
        int i2 = this.m + i;
        this.h.setText(musicRadioItem.getName());
        this.k = musicRadioItem.getId();
        this.l = musicRadioItem.getLogoUrl();
        y.b(this.e.getContext(), musicRadioItem.getLogoUrl(), b.c.pic_covers_music_220, this.e);
        if ((aei.a().c() != 0 || TextUtils.isEmpty(apk.i().x())) ? false : g()) {
            int playState = apk.i().getPlayState();
            musicRadioItem.setPlayState(playState);
            switch (playState) {
                case 1:
                case 3:
                    setStatus(playState);
                    z = false;
                    break;
                case 2:
                    setStatus(playState);
                    z = true;
                    break;
                default:
                    setStatus(0);
                    z = false;
                    break;
            }
        } else {
            musicRadioItem.setPlayState(-1);
            setStatus(0);
            z = false;
        }
        XFrameLayout xFrameLayout = this.j;
        xFrameLayout.setVuiPosition(i2);
        VuiEngine.getInstance(this.d).setVuiElementTag(this.j, "ms_rm_list_item_" + i2);
        xFrameLayout.setVuiLabel(String.format(this.i.getContext().getResources().getString(b.f.vui_play_position), musicRadioItem.getName(), Integer.valueOf(i2), Integer.valueOf(i2)));
        this.c.setVuiPosition(i2);
        this.c.setVuiElementId(this.c.getId() + "_" + i2);
        this.g.setVuiPosition(i2);
        this.n = z;
        VuiEngine.getInstance(this.d).setVuiElementTag(this.g, "ms_rm_list_play_" + i2);
        com.xiaopeng.musicradio.vui.c.a(this.d, this.g, z);
        this.g.setVuiLayoutLoadable(true);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", this.c.getId() + "_" + i2);
            xFrameLayout.setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        this.i.setText(String.valueOf(i2));
        this.i.setVisibility(h.a().b() ? 0 : 8);
        setOpenDetailListener(musicRadioItem);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (apk.i().y()) {
                    return;
                }
                atv.c();
                atf.a().a(au.b(musicRadioItem.getId(), musicRadioItem.getTitle()).toJson());
                ams.a().a(musicRadioItem);
            }
        });
    }

    public void setOpenDetailListener(final MusicRadioItem musicRadioItem) {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmItemLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.c();
                atz.a(musicRadioItem.getId(), musicRadioItem.getLogoUrl(), musicRadioItem.getName(), musicRadioItem.getDescription());
            }
        });
    }

    private void setStatus(int i) {
        switch (i) {
            case 1:
                this.f.setImageResource(b.c.ic_btn_stop);
                return;
            case 2:
                this.f.setImageResource(b.c.ic_btn_stop);
                return;
            case 3:
                this.f.setImageResource(b.c.ic_btn_playall);
                return;
            default:
                this.f.setImageResource(b.c.ic_btn_playall);
                return;
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.c
    public void a(boolean z) {
        if (z) {
            if (aei.a().c() == 0) {
                if (g()) {
                    int playState = apk.i().getPlayState();
                    r0 = playState == 2;
                    setStatus(playState);
                } else {
                    setStatus(0);
                }
            } else {
                setStatus(0);
            }
        } else {
            setStatus(0);
        }
        if (this.n != r0) {
            com.xiaopeng.musicradio.vui.c.a(getContext(), this.g, r0);
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.g);
            this.n = r0;
        }
    }

    public boolean g() {
        String x = apk.i().x();
        if (TextUtils.isEmpty(x) || !x.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(this.k);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return x.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.c
    public void e() {
        this.i.setVisibility(h.a().b() ? 0 : 8);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        i();
    }

    private void i() {
        if (!TextUtils.isEmpty(this.l)) {
            y.b(this.e.getContext(), this.l, b.c.pic_covers_music_220, this.e);
        }
        this.i.setVisibility(h.a().b() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.a(this, configuration);
        if (acs.b(configuration)) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.b(this);
    }
}
