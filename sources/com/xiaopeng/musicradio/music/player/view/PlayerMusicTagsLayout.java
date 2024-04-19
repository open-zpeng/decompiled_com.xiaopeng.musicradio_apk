package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.presenter.MusicTagsPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
/* loaded from: classes.dex */
public class PlayerMusicTagsLayout extends BaseFrameLayout<i, MusicTagsPresenter> implements i {
    private int c;
    private FrameLayout d;
    private TextView e;
    private ImageView f;
    private ImageView g;
    private atw h;
    private atd i;
    private FrameLayout j;
    private FrameLayout k;
    private int l;

    public PlayerMusicTagsLayout(Context context) {
        super(context);
        this.l = 260;
    }

    public PlayerMusicTagsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 260;
        a(context, attributeSet);
    }

    public PlayerMusicTagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 260;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.h.MusicTagsLayout);
        this.c = obtainStyledAttributes.getLayoutDimension(b.h.MusicTagsLayout_tagMaxWidth, this.c);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public MusicTagsPresenter a() {
        return new MusicTagsPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.e = (TextView) findViewById(b.d.tv_singer);
        this.d = (FrameLayout) findViewById(b.d.singer_layout);
        this.g = (ImageView) findViewById(b.d.tv_label_song_quality);
        this.f = (ImageView) findViewById(b.d.tv_label_vip);
        this.j = (FrameLayout) findViewById(b.d.layout_vip);
        this.k = (FrameLayout) findViewById(b.d.layout_quality);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicInfo d = apk.i().d();
                if (d != null) {
                    String str = "";
                    if (!TextUtils.isEmpty(d.getSingerIds())) {
                        str = d.getSingerIds();
                    } else if (d.getArtistId() > 0) {
                        str = d.getArtistId() + "";
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String[] split = str.split(ListSignBean.COLLECTID_SUFFIX);
                    if (split != null && split.length > 1) {
                        new atu(com.xiaopeng.musicradio.a.a, d.getSingerIds()).show();
                    } else if (split == null || split.length != 1) {
                    } else {
                        atv.j();
                        sp.a().a("/music/activity/fav_singer_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", d.getArtistId()).withString("detail_LOGO", be.e(d.getArtistLogo())).withString("detail_title", be.e(d.getSinger())).navigation();
                    }
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    PlayerMusicTagsLayout.this.k();
                    amu.a().c();
                    awd.d();
                }
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    bcg.a(PlayerMusicTagsLayout.this.getContext(), PlayerMusicTagsLayout.this.getResources().getString(b.f.vip_from_label));
                    awd.g();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.layout_player_music_tags;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void a(String str) {
        this.e.setText(str);
        if (TextUtils.isEmpty(str)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
        if (au.b()) {
            this.e.setCompoundDrawables(null, null, null, null);
        } else {
            Drawable drawable = getResources().getDrawable(b.c.ic_24_next);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.e.setCompoundDrawables(null, null, drawable, null);
        }
        this.d.setVisibility(0);
        if (aei.a().c() == 0 && !((MusicTagsPresenter) this.b).c()) {
            this.k.setVisibility(0);
            g();
        } else {
            this.k.setVisibility(8);
        }
        l();
        m();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void f() {
        this.e.setText("");
        this.d.setVisibility(8);
        this.k.setVisibility(8);
        this.j.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void g() {
        MusicInfo u = apk.i().u();
        if (u != null && u.isNeedVip()) {
            this.j.setVisibility(0);
            this.f.setImageResource(b.c.ic_player_label_vip_qq);
        } else {
            this.j.setVisibility(8);
        }
        if (u != null) {
            this.k.setVisibility(0);
            if (u == null || u.getMusicFrom() == 61 || ((MusicTagsPresenter) this.b).c()) {
                return;
            }
            int quality = u.getQuality() == 0 ? 1 : u.getQuality();
            if (quality == 1) {
                this.g.setImageResource(b.c.ic_player_label_standard_qq);
                return;
            } else if (quality == 2) {
                this.g.setImageResource(b.c.ic_player_label_hq_qq);
                return;
            } else if (quality == 3) {
                this.g.setImageResource(b.c.ic_player_label_sq_qq);
                return;
            } else {
                this.g.setVisibility(8);
                return;
            }
        }
        this.k.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void h() {
        FrameLayout frameLayout = this.k;
        if (frameLayout == null || !frameLayout.isShown()) {
            return;
        }
        if (this.i == null) {
            this.i = new atd(getContext());
        }
        if (!this.i.isShowing()) {
            this.i.showAsDropDown(this.k, -100, 10);
            amu.a().d();
        }
        this.i.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlayerMusicTagsLayout.this.k();
                amu.a().c();
                PlayerMusicTagsLayout.this.i.dismiss();
            }
        });
        this.i.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.5
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                PlayerMusicTagsLayout.this.i = null;
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void i() {
        atd atdVar = this.i;
        if (atdVar == null || !atdVar.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void j() {
        atw atwVar = this.h;
        if (atwVar == null || !atwVar.isShowing()) {
            return;
        }
        this.h.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            if (this.h == null) {
                this.h = new atw(getContext());
                this.h.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.6
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        PlayerMusicTagsLayout.this.h = null;
                    }
                });
            }
            this.h.a(d);
            if (this.h.isShowing()) {
                return;
            }
            this.h.show();
        }
    }

    private void l() {
        if (aei.a().c() == 0 && apk.i().u() != null && apk.i().u().isNeedVip()) {
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
    }

    private void m() {
        if (this.c != 0) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.PlayerMusicTagsLayout.7
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (PlayerMusicTagsLayout.this.k.getVisibility() == 0) {
                        i = PlayerMusicTagsLayout.this.k.getWidth();
                        i2 = ((ViewGroup.MarginLayoutParams) PlayerMusicTagsLayout.this.k.getLayoutParams()).leftMargin;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    if (PlayerMusicTagsLayout.this.j.getVisibility() == 0) {
                        i4 = PlayerMusicTagsLayout.this.j.getWidth();
                        i3 = ((ViewGroup.MarginLayoutParams) PlayerMusicTagsLayout.this.j.getLayoutParams()).leftMargin;
                    } else {
                        i3 = 0;
                    }
                    int i5 = ((((PlayerMusicTagsLayout.this.c - i) - i4) - i2) - i3) - 260;
                    if (i5 > PlayerMusicTagsLayout.this.l) {
                        i5 = PlayerMusicTagsLayout.this.l;
                    }
                    PlayerMusicTagsLayout.this.e.setMaxWidth(i5);
                }
            });
        }
    }
}
