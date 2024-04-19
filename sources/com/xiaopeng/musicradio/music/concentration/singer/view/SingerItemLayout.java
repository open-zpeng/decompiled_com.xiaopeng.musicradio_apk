package com.xiaopeng.musicradio.music.concentration.singer.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.singer.presenter.SingerItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SingerItemLayout extends BaseFrameLayout<a, SingerItemPresenter> implements a {
    private Context c;
    private MusicCircleImageView d;
    private XImageView e;
    private XFrameLayout f;
    private XTextView g;
    private XFrameLayout h;
    private long i;
    private XFrameLayout j;
    private XTextView k;
    private String l;
    private int[] m;
    private XImageView n;
    private final int o;
    private final int p;
    private final int q;
    private int r;
    private boolean s;

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

    public SingerItemLayout(Context context) {
        super(context);
        this.m = new int[]{b.c.img_small_no_1, b.c.img_small_no_2, b.c.img_small_no_3};
        this.o = 0;
        this.p = 1;
        this.q = 2;
        this.r = 16;
        this.s = false;
        this.c = context;
    }

    public SingerItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new int[]{b.c.img_small_no_1, b.c.img_small_no_2, b.c.img_small_no_3};
        this.o = 0;
        this.p = 1;
        this.q = 2;
        this.r = 16;
        this.s = false;
        this.c = context;
    }

    public SingerItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new int[]{b.c.img_small_no_1, b.c.img_small_no_2, b.c.img_small_no_3};
        this.o = 0;
        this.p = 1;
        this.q = 2;
        this.r = 16;
        this.s = false;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public SingerItemPresenter a() {
        return new SingerItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_singer_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.n = (XImageView) findViewById(b.d.hot_img);
        this.d = (MusicCircleImageView) findViewById(b.d.item_logo);
        this.e = (XImageView) findViewById(b.d.play_icon);
        this.f = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.h = (XFrameLayout) findViewById(b.d.item_layout);
        this.g = (XTextView) findViewById(b.d.radio_title);
        this.j = (XFrameLayout) findViewById(b.d.item_view);
        this.k = (XTextView) findViewById(b.d.tv_speech_num);
    }

    public void a(final MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean listBean, int i) {
        boolean z;
        this.i = listBean.getId();
        this.l = listBean.getLogo();
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.n.setVisibility(0);
                this.n.setImageResource(this.m[i]);
                break;
            default:
                this.n.setVisibility(8);
                this.n.setImageDrawable(null);
                break;
        }
        int i2 = this.r + i;
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.singer.view.SingerItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atf.a().a(au.f(listBean.getId(), listBean.getName()).toJson());
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.singer.view.SingerItemLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sp.a().a("/music/activity/fav_singer_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", listBean.getId()).withString("detail_LOGO", listBean.getLogo()).withString("detail_title", listBean.getName()).navigation();
            }
        });
        this.g.setText(listBean.getName());
        y.b(this.d.getContext(), listBean.getLogo(), b.c.pic_covers_music_220, this.d);
        if (aei.a().c() == 0 && i()) {
            int playState = apk.i().getPlayState();
            z = playState == 2;
            setStatus(playState);
        } else {
            setStatus(0);
            z = false;
        }
        this.j.setVuiLabel(String.format(getContext().getResources().getString(b.f.vui_play_position), listBean.getName(), Integer.valueOf(i2), Integer.valueOf(i2)));
        this.j.setVuiPosition(i2);
        this.j.setVuiAction(big.CLICK.a());
        this.j.setVuiElementId(this.j.getId() + "_" + i2);
        this.s = z;
        this.f.setVuiPosition(i2);
        VuiEngine.getInstance(this.c).setVuiElementTag(this.f, "ms_single_singer_list_item_" + i2);
        c.a(this.c, this.f, z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", this.h.getId() + "_" + i2);
            this.j.setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        this.k.setText(String.valueOf(i2));
        this.k.setVisibility(h.a().b() ? 0 : 8);
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

    @Override // com.xiaopeng.musicradio.music.concentration.singer.view.a
    public void a(boolean z) {
        if (z) {
            if (aei.a().c() == 0) {
                if (i()) {
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
        if (this.s != r0) {
            c.a(getContext(), this.f, r0);
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.f);
            this.s = r0;
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.singer.view.a
    public void e() {
        this.k.setVisibility(h.a().b() ? 0 : 8);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        g();
    }

    private void g() {
        if (!TextUtils.isEmpty(this.l)) {
            y.b(this.d.getContext(), this.l, b.c.pic_covers_music_220, this.d);
        }
        this.k.setVisibility(h.a().b() ? 0 : 8);
    }

    private boolean i() {
        String x = apk.i().x();
        if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_ARTIST_RADIO)) {
            if (x.contains(ListSignBean.COLLECTID_PREFIX + this.i + ListSignBean.COLLECTID_SUFFIX)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g();
    }
}
