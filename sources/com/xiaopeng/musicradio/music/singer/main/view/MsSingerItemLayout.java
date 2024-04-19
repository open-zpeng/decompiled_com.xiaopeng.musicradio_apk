package com.xiaopeng.musicradio.music.singer.main.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.main.presenter.MsSingerItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MsSingerItemLayout extends BaseFrameLayout<a, MsSingerItemPresenter> implements a {
    private Context c;
    private MusicCircleImageView d;
    private XImageView e;
    private XFrameLayout f;
    private XTextView g;
    private XFrameLayout h;
    private long i;
    private XFrameLayout j;
    private XTextView k;
    private int l;
    private boolean m;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    public MsSingerItemLayout(Context context) {
        super(context);
        this.l = 1;
        this.m = false;
        this.c = context;
    }

    public MsSingerItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 1;
        this.m = false;
        this.c = context;
    }

    public MsSingerItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 1;
        this.m = false;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsSingerItemPresenter a() {
        return new MsSingerItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_item_singer_single_list;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (MusicCircleImageView) findViewById(b.d.item_logo);
        this.e = (XImageView) findViewById(b.d.play_icon);
        this.f = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.h = (XFrameLayout) findViewById(b.d.item_layout);
        this.g = (XTextView) findViewById(b.d.radio_title);
        this.j = (XFrameLayout) findViewById(b.d.item_view);
        this.k = (XTextView) findViewById(b.d.tv_speech_num);
    }

    public void setData(final SingerResultBean.DataBean.ArtistGroupsBean.ListBean listBean) {
        boolean z;
        this.i = listBean.getId();
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.singer.main.view.MsSingerItemLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atf.a().a(au.f(listBean.getId(), listBean.getName()).toJson());
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.singer.main.view.MsSingerItemLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.j();
                sp.a().a("/music/activity/fav_singer_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", listBean.getId()).withString("detail_LOGO", listBean.getLogo()).withString("detail_title", listBean.getName()).navigation();
            }
        });
        this.g.setText(listBean.getName());
        y.b(this.d.getContext(), listBean.getLogo(), b.c.pic_covers_music_220, this.d);
        if (aei.a().c() == 0 && g()) {
            int playState = apk.i().getPlayState();
            z = playState == 2;
            setStatus(playState);
        } else {
            setStatus(0);
            z = false;
        }
        int position = listBean.getPosition();
        XFrameLayout xFrameLayout = this.j;
        xFrameLayout.setVuiPosition(position);
        VuiEngine.getInstance(this.c).setVuiElementTag(this.j, "ms_single_singer_list_item_" + this.j.getId() + "_" + position);
        xFrameLayout.setVuiLabel(String.format(this.f.getContext().getResources().getString(b.f.vui_play_position), listBean.getName(), Integer.valueOf(this.l + position), Integer.valueOf(this.l + position)));
        this.h.setVuiPosition(position);
        VuiEngine.getInstance(this.c).setVuiElementTag(this.h, "ms_single_singer_list_item_" + this.h.getId() + "_" + position);
        this.h.setVuiElementId(this.h.getId() + "_" + position);
        this.h.setVuiLayoutLoadable(true);
        this.f.setVuiPosition(position);
        VuiEngine.getInstance(this.c).setVuiElementTag(this.f, "ms_single_singer_list_item_" + this.f.getId() + "_" + position);
        com.xiaopeng.musicradio.vui.c.a(this.c, this.f, z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", VuiEngine.getInstance(getContext()).getVuiElementTag(this.h));
            xFrameLayout.setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        this.k.setText(String.valueOf(this.l + position));
        this.k.setVisibility(h.a().b() ? 0 : 8);
    }

    private void setStatus(int i) {
        boolean z;
        switch (i) {
            case 1:
                this.e.setImageResource(b.c.ic_btn_stop);
                z = false;
                break;
            case 2:
                z = true;
                this.e.setImageResource(b.c.ic_btn_stop);
                break;
            case 3:
                this.e.setImageResource(b.c.ic_btn_playall);
                z = false;
                break;
            default:
                this.e.setImageResource(b.c.ic_btn_playall);
                z = false;
                break;
        }
        if (this.m != z) {
            com.xiaopeng.musicradio.vui.c.a(getContext(), this.f, z);
            VuiEngine.getInstance(getContext()).updateScene("MusicSinger", this.f);
            this.m = z;
        }
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.a
    public void a(boolean z) {
        if (z) {
            if (aei.a().c() == 0) {
                if (g()) {
                    setStatus(apk.i().getPlayState());
                    return;
                } else {
                    setStatus(0);
                    return;
                }
            }
            setStatus(0);
            return;
        }
        setStatus(0);
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.a
    public void e() {
        XTextView xTextView = this.k;
        if (xTextView != null) {
            xTextView.setVisibility(h.a().b() ? 0 : 8);
        }
    }

    private boolean g() {
        String x = apk.i().x();
        if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_ARTIST_RADIO)) {
            if (x.contains(ListSignBean.COLLECTID_PREFIX + this.i + ListSignBean.COLLECTID_SUFFIX)) {
                return true;
            }
        }
        return false;
    }
}
