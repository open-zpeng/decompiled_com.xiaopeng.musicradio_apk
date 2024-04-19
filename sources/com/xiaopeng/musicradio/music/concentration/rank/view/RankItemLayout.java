package com.xiaopeng.musicradio.music.concentration.rank.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.rank.presenter.RankItemPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
import java.util.List;
/* loaded from: classes.dex */
public class RankItemLayout extends BaseFrameLayout<a, RankItemPresenter> implements View.OnClickListener, a {
    private Context c;
    private MusicCircleImageView d;
    private MusicCircleImageView e;
    private XImageView f;
    private XFrameLayout g;
    private XTextView h;
    private XTextView i;
    private XTextView j;
    private XTextView k;
    private XFrameLayout l;
    private XFrameLayout m;
    private XFrameLayout n;
    private XTextView o;
    private long p;
    private String q;
    private StringBuffer r;
    private MusicRadioItem s;
    private int t;
    private boolean u;

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

    public RankItemLayout(Context context) {
        super(context);
        this.t = 24;
        this.u = false;
        this.c = context;
    }

    public RankItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = 24;
        this.u = false;
        this.c = context;
    }

    public RankItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = 24;
        this.u = false;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public RankItemPresenter a() {
        return new RankItemPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_rank_item;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (MusicCircleImageView) findViewById(b.d.item_logo_bg);
        this.e = (MusicCircleImageView) findViewById(b.d.item_logo);
        this.f = (XImageView) findViewById(b.d.play_icon);
        this.g = (XFrameLayout) findViewById(b.d.play_item_layout);
        this.h = (XTextView) findViewById(b.d.rank_title);
        this.i = (XTextView) findViewById(b.d.song_one);
        this.j = (XTextView) findViewById(b.d.song_tow);
        this.k = (XTextView) findViewById(b.d.song_three);
        this.l = (XFrameLayout) findViewById(b.d.img_play_layout);
        this.m = (XFrameLayout) findViewById(b.d.root_play_layout);
        this.n = (XFrameLayout) findViewById(b.d.rank_root);
        this.o = (XTextView) findViewById(b.d.tv_speech_num);
    }

    public void a(MusicRadioItem musicRadioItem, int i) {
        int i2 = this.t + i;
        this.s = musicRadioItem;
        this.q = musicRadioItem.getImgUrl();
        this.h.setText(musicRadioItem.getRankName());
        this.p = musicRadioItem.getId();
        i();
        this.i.setText(c(musicRadioItem.getSongInfos().get(0).getSongName()));
        this.j.setText(c(musicRadioItem.getSongInfos().get(1).getSongName()));
        this.k.setText(c(musicRadioItem.getSongInfos().get(2).getSongName()));
        j();
        b(musicRadioItem, i2);
        this.o.setText(String.valueOf(i2));
        this.o.setVisibility(h.a().b() ? 0 : 8);
        this.g.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
    }

    private void i() {
        if (this.s == null) {
            return;
        }
        List<MusicRadioItem.SongInfo> a = atj.a().a(this.s.getId());
        if (a == null) {
            a = this.s.getSongInfos();
        }
        if (a != null) {
            if (a.size() >= 3) {
                this.i.setText(c(a.get(0).getSongName()));
                this.j.setText(c(a.get(1).getSongName()));
                this.k.setText(c(a.get(2).getSongName()));
            } else if (a.size() == 2) {
                this.i.setText(c(a.get(0).getSongName()));
                this.j.setText(c(a.get(1).getSongName()));
            } else if (a.size() == 1) {
                this.i.setText(c(a.get(0).getSongName()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.xiaopeng.musicradio.bean.db.MusicRadioItem r8, int r9) {
        /*
            r7 = this;
            long r0 = r8.getId()
            aei r2 = defpackage.aei.a()
            int r2 = r2.c()
            apk r3 = defpackage.apk.i()
            java.lang.String r3 = r3.x()
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L44
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "listsign_rank_music"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "\"collectId\":"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L44
            r0 = r4
            goto L45
        L44:
            r0 = r5
        L45:
            if (r0 == 0) goto L5e
            apk r0 = defpackage.apk.i()
            int r0 = r0.getPlayState()
            r8.setPlayState(r0)
            switch(r0) {
                case 1: goto L5a;
                case 2: goto L59;
                case 3: goto L5a;
                default: goto L55;
            }
        L55:
            r7.setStatus(r5)
            goto L65
        L59:
            r5 = r4
        L5a:
            r7.setStatus(r0)
            goto L65
        L5e:
            r0 = -1
            r8.setPlayState(r0)
            r7.setStatus(r5)
        L65:
            r7.a(r9, r8, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.musicradio.music.concentration.rank.view.RankItemLayout.b(com.xiaopeng.musicradio.bean.db.MusicRadioItem, int):void");
    }

    private void a(int i, MusicRadioItem musicRadioItem, boolean z) {
        if (this.r == null) {
            this.r = new StringBuffer();
        }
        this.r.setLength(0);
        StringBuffer stringBuffer = this.r;
        stringBuffer.append(musicRadioItem.getRankName());
        stringBuffer.append("|");
        stringBuffer.append(c(musicRadioItem.getSongInfos().get(0).getSongName()));
        stringBuffer.append("|");
        stringBuffer.append(c(musicRadioItem.getSongInfos().get(2).getSongName()));
        this.n.setVuiLabel(String.format(this.o.getContext().getResources().getString(b.f.vui_play_position), this.r.toString(), Integer.valueOf(i), Integer.valueOf(i)));
        this.n.setVuiPosition(i);
        XFrameLayout xFrameLayout = this.n;
        xFrameLayout.setVuiElementId(this.n.getId() + "_" + i);
        this.m.setVuiPosition(i);
        this.m.setVuiElementType(bih.BUTTON);
        XFrameLayout xFrameLayout2 = this.m;
        xFrameLayout2.setVuiElementId(this.m.getId() + "_" + i);
        this.g.setVuiPosition(i);
        XFrameLayout xFrameLayout3 = this.g;
        xFrameLayout3.setVuiElementId(this.g.getId() + "_" + i);
        this.u = z;
        c.a(this.g.getContext(), this.g, z);
        XFrameLayout xFrameLayout4 = this.n;
        c.a(xFrameLayout4, this.m.getId() + "_" + i);
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

    @Override // com.xiaopeng.musicradio.music.concentration.rank.view.a
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
        if (this.u != r0) {
            c.a(getContext(), this.g, r0);
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.g);
            this.u = r0;
        }
    }

    public boolean g() {
        String x = apk.i().x();
        if (TextUtils.isEmpty(x) || !x.contains(ListSignBean.LISTSIGN_RANK_MUSIC)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ListSignBean.COLLECTID_PREFIX);
        sb.append(this.p);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        return x.contains(sb.toString());
    }

    @Override // com.xiaopeng.musicradio.music.concentration.rank.view.a
    public void e() {
        this.o.setVisibility(h.a().b() ? 0 : 8);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        j();
        i();
    }

    private void j() {
        if (this.s == null) {
            return;
        }
        String b = atj.a().b(this.s.getId());
        if (TextUtils.isEmpty(b)) {
            b = this.s.getImgUrl();
        }
        y.b(this.e.getContext(), b, b.c.pic_covers_music_220, this.e);
        this.o.setVisibility(h.a().b() ? 0 : 8);
    }

    private String c(String str) {
        if (str.contains(" - ")) {
            String[] split = str.split(" - ");
            if (split.length > 1) {
                return split[1];
            }
        }
        return c.a(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (this.s != null) {
            if (id == b.d.play_item_layout) {
                atv.i();
                atf.a().a(au.b(this.s.getId(), this.s.getTitle(), this.s.getRankType()).toJson());
                ams.a().a(this.s);
            } else if (id == b.d.root_play_layout || id == b.d.img_play_layout) {
                sp.a().a("/music/activity/fav_rank_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", this.s.getRankId()).withString("detail_LOGO", this.s.getImgUrl()).withString("detail_title", this.s.getRankName()).withInt("detail_type", this.s.getRankType()).withLong("detail_showTime", this.s.getShowTime()).navigation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
    }
}
