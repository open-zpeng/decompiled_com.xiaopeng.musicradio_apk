package com.xiaopeng.musicradio.view.mymusic;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.base.BaseLinearLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.w;
/* loaded from: classes2.dex */
public class MusicListItemLabelView extends BaseLinearLayout {
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private Integer g;
    private Integer h;
    private Integer i;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
    }

    public MusicListItemLabelView(Context context) {
        super(context);
    }

    public MusicListItemLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicListItemLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected BasePresenter a() {
        return new MusicListItemLabelPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.c = (ImageView) findViewById(f.C0131f.iv_label_vip);
        this.d = (ImageView) findViewById(f.C0131f.iv_label_sq);
        this.e = (ImageView) findViewById(f.C0131f.iv_label_surprise);
        this.f = (ImageView) findViewById(f.C0131f.iv_label_bt);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return f.g.layout_music_list_item_labels;
    }

    public void setMusicInfo(MusicInfo musicInfo) {
        boolean z;
        if (musicInfo.isNeedVip()) {
            this.c.setVisibility(0);
            this.c.setImageResource(f.e.ic_main_list_song_label_vip);
            a(this.c);
            z = true;
        } else {
            this.c.setVisibility(8);
            z = false;
        }
        if (5 == musicInfo.getMusicFrom()) {
            this.e.setVisibility(0);
            this.e.setImageResource(f.e.ic_main_list_song_label_surprise);
            a(this.e);
            z = true;
        } else {
            this.e.setVisibility(8);
        }
        if (20 == musicInfo.getMusicFrom() || 20 == musicInfo.getOldMusicFrom()) {
            this.f.setVisibility(0);
            this.f.setImageResource(f.e.ic_main_list_song_label_bt);
            a(this.f);
            z = true;
        } else {
            this.f.setVisibility(8);
        }
        if (musicInfo.isSupportSQ()) {
            if (w.f() == 1 || aqh.a().f()) {
                this.d.setVisibility(0);
                this.d.setImageResource(f.e.ic_label_sq);
                a(this.d);
                z = true;
            } else {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setVisibility(8);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (z) {
            if (this.f.getVisibility() == 0) {
                marginLayoutParams.rightMargin = 15;
            } else {
                marginLayoutParams.rightMargin = 4;
            }
            b(this.c);
            b(this.d);
            b(this.e);
            b(this.f);
            e();
            return;
        }
        marginLayoutParams.rightMargin = 0;
    }

    public void a(boolean z, int i, boolean z2) {
        if (z) {
            this.c.setVisibility(0);
            this.c.setImageResource(f.e.ic_main_list_song_label_vip);
        } else {
            this.c.setVisibility(8);
        }
        if (5 == i) {
            this.e.setVisibility(0);
            this.e.setImageResource(f.e.ic_main_list_song_label_surprise);
        } else {
            this.e.setVisibility(8);
        }
        if (20 == i) {
            this.f.setVisibility(0);
            this.f.setImageResource(f.e.ic_main_list_song_label_bt);
        } else {
            this.f.setVisibility(8);
        }
        if (z2) {
            this.d.setVisibility(0);
            this.d.setImageResource(f.e.ic_label_sq);
        } else {
            this.d.setVisibility(8);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (this.f.getVisibility() == 0) {
            marginLayoutParams.rightMargin = 15;
        } else {
            marginLayoutParams.rightMargin = 4;
        }
    }

    private void a(ImageView imageView) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        Drawable drawable = imageView.getDrawable();
        Integer num = this.g;
        if (num == null || marginLayoutParams == null || drawable == null) {
            return;
        }
        marginLayoutParams.height = num.intValue();
        if (this.g.intValue() == drawable.getIntrinsicHeight()) {
            marginLayoutParams.width = drawable.getIntrinsicWidth();
        } else {
            marginLayoutParams.width = (drawable.getIntrinsicWidth() * this.g.intValue()) / Math.max(1, drawable.getIntrinsicHeight());
        }
    }

    private void b(ImageView imageView) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        if (this.i == null || imageView.getVisibility() != 0 || marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = this.i.intValue();
    }

    private void e() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        Integer num = this.h;
        if (num == null || marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = num.intValue();
    }

    public void setHeight(Integer num) {
        this.g = num;
    }

    public void setMarginRight(Integer num) {
        this.h = num;
    }

    public void setLabelMarginRight(Integer num) {
        this.i = num;
    }
}
