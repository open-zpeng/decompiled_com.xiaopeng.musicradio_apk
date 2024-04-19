package com.xiaopeng.musicradio.music.player;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.presenter.MusicTagsPresenter;
import com.xiaopeng.musicradio.music.player.view.i;
/* loaded from: classes.dex */
public class MusicTagsLayout extends BaseFrameLayout<i, MusicTagsPresenter> implements i {
    private int c;
    private FrameLayout d;
    private TextView e;
    private ImageView f;
    private ImageView g;
    private atw h;
    private atd i;
    private int j;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public MusicTagsLayout(Context context) {
        super(context);
        this.j = 260;
    }

    public MusicTagsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 260;
        a(context, attributeSet);
    }

    public MusicTagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 260;
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
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.MusicTagsLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    MusicTagsLayout.this.k();
                    amu.a().c();
                    awd.d();
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.MusicTagsLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(view.getId())) {
                    bcg.a(MusicTagsLayout.this.getContext(), MusicTagsLayout.this.getResources().getString(b.f.vip_from_label));
                    awd.g();
                }
            }
        });
    }

    public void setTouch(boolean z) {
        this.g.setClickable(z);
        this.f.setClickable(z);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.layout_music_tags;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void a(String str) {
        this.e.setText(str);
        this.d.setVisibility(0);
        if (aei.a().c() == 0 && !((MusicTagsPresenter) this.b).c()) {
            this.g.setVisibility(0);
            g();
        } else {
            this.g.setVisibility(8);
        }
        l();
        m();
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void f() {
        this.e.setText("");
        this.d.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void g() {
        MusicInfo u = apk.i().u();
        if (u != null && u.isNeedVip()) {
            this.f.setVisibility(0);
            this.f.setImageResource(f.e.ic_main_list_song_label_vip);
        } else {
            this.f.setVisibility(8);
        }
        if (u != null) {
            this.g.setVisibility(0);
            if (u == null || u.getMusicFrom() == 61 || ((MusicTagsPresenter) this.b).c()) {
                return;
            }
            int quality = u.getQuality() == 0 ? 1 : u.getQuality();
            if (quality == 1) {
                this.g.setImageResource(f.e.ic_label_ss);
                return;
            } else if (quality == 2) {
                this.g.setImageResource(f.e.ic_label_hq);
                return;
            } else if (quality == 3) {
                this.g.setImageResource(f.e.ic_label_sq);
                return;
            } else {
                this.g.setVisibility(8);
                return;
            }
        }
        this.g.setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.i
    public void h() {
        ImageView imageView = this.g;
        if (imageView == null || !imageView.isShown()) {
            return;
        }
        if (this.i == null) {
            this.i = new atd(getContext());
        }
        if (!this.i.isShowing()) {
            this.i.showAsDropDown(this.g, -100, 10);
            amu.a().d();
        }
        this.i.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.MusicTagsLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MusicTagsLayout.this.k();
                amu.a().c();
                MusicTagsLayout.this.i.dismiss();
            }
        });
        this.i.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.xiaopeng.musicradio.music.player.MusicTagsLayout.4
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                MusicTagsLayout.this.i = null;
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
                this.h.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.music.player.MusicTagsLayout.5
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface dialogInterface) {
                        MusicTagsLayout.this.h = null;
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
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    private void m() {
        if (this.c != 0) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.MusicTagsLayout.6
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (MusicTagsLayout.this.g.getVisibility() == 0) {
                        i = MusicTagsLayout.this.g.getWidth();
                        i2 = ((ViewGroup.MarginLayoutParams) MusicTagsLayout.this.g.getLayoutParams()).leftMargin;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    if (MusicTagsLayout.this.f.getVisibility() == 0) {
                        i4 = MusicTagsLayout.this.f.getWidth();
                        i3 = ((ViewGroup.MarginLayoutParams) MusicTagsLayout.this.f.getLayoutParams()).leftMargin;
                    } else {
                        i3 = 0;
                    }
                    int i5 = ((((MusicTagsLayout.this.c - i) - i4) - i2) - i3) - 260;
                    if (i5 > MusicTagsLayout.this.j) {
                        i5 = MusicTagsLayout.this.j;
                    }
                    MusicTagsLayout.this.e.setMaxWidth(i5);
                }
            });
        }
    }
}
