package com.xiaopeng.musicradio.music.concentration.radio.view;

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
import com.xiaopeng.musicradio.music.concentration.radio.presenter.MsRadioItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsRadioItemLayout extends BaseFrameLayout<b, MsRadioItemPresenter> implements b {
    private Context c;
    private MusicCircleImageView d;
    private XImageView e;
    private XFrameLayout f;
    private XTextView g;
    private XFrameLayout h;
    private XTextView i;
    private XFrameLayout j;
    private long k;
    private String l;
    private int m;
    private boolean n;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.radio.view.b
    public void a(ArrayList<MusicRadioItem> arrayList) {
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

    public MsRadioItemLayout(Context context) {
        super(context);
        this.m = 28;
        this.n = false;
        this.c = context;
    }

    public MsRadioItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 28;
        this.n = false;
        this.c = context;
    }

    public MsRadioItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 28;
        this.n = false;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsRadioItemPresenter a() {
        return new MsRadioItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_radio_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (MusicCircleImageView) findViewById(b.d.item_logo);
        this.e = (XImageView) findViewById(b.d.play_icon);
        this.f = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.h = (XFrameLayout) findViewById(b.d.item_layout);
        this.g = (XTextView) findViewById(b.d.radio_title);
        this.i = (XTextView) findViewById(b.d.tv_speech_num);
        this.j = (XFrameLayout) findViewById(b.d.root_view);
    }

    public void a(final MusicRadioItem musicRadioItem, int i) {
        boolean z;
        int i2 = this.m + i;
        this.g.setText(musicRadioItem.getName());
        this.k = musicRadioItem.getId();
        this.l = musicRadioItem.getLogoUrl();
        y.b(this.d.getContext(), musicRadioItem.getLogoUrl(), b.c.pic_covers_music_220, this.d);
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
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.radio.view.MsRadioItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsRadioItemLayout.this.a(musicRadioItem);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.radio.view.MsRadioItemLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsRadioItemLayout.this.a(musicRadioItem);
            }
        });
        this.h.setVuiPosition(i2);
        VuiEngine.getInstance(this.c).setVuiElementTag(this.h, "ms_radio_list_item_" + i2);
        XFrameLayout xFrameLayout = this.h;
        xFrameLayout.setVuiLabel(String.format(xFrameLayout.getContext().getResources().getString(b.f.vui_play_position), musicRadioItem.getName(), Integer.valueOf(i2), Integer.valueOf(i2)));
        this.h.setVuiLayoutLoadable(true);
        c.a(this.c, this.h, z);
        this.n = z;
        this.i.setText(String.valueOf(i2));
        this.i.setVisibility(h.a().b() ? 0 : 8);
    }

    private void setStatus(int i) {
        switch (i) {
            case 1:
                this.e.setImageResource(b.c.ic_btn_stop);
                return;
            case 2:
                this.e.setImageResource(b.c.ic_btn_stop);
                return;
            case 3:
                this.e.setImageResource(b.c.ic_btn_playall);
                return;
            default:
                this.e.setImageResource(b.c.ic_btn_playall);
                return;
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.radio.view.b
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
            c.a(getContext(), this.h, r0);
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.h);
            this.n = r0;
        }
    }

    public boolean g() {
        String x = apk.i().x();
        if (TextUtils.isEmpty(x) || !x.contains(ListSignBean.LISTSIGN_TAGS)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(this.k);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return x.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.concentration.radio.view.b
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
            y.b(this.d.getContext(), this.l, b.c.pic_covers_music_220, this.d);
        }
        this.i.setVisibility(h.a().b() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MusicRadioItem musicRadioItem) {
        if (apk.i().y() || musicRadioItem == null) {
            return;
        }
        atv.h();
        atf.a().a(au.a(musicRadioItem.getId(), musicRadioItem.getTitle(), musicRadioItem.getRankType()).toJson());
        ams.a().a(musicRadioItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i();
    }
}
