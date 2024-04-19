package com.xiaopeng.musicradio.program.common.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.musicradio.widget.PlayControlView;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes2.dex */
public class CommonTitleAlbumItemView extends XLinearLayout {
    private PlayControlView a;
    private MusicCircleImageView b;
    private XImageView c;
    private XTextView d;
    private XTextView e;
    private String f;
    private XImageView g;
    private String h;

    public CommonTitleAlbumItemView(Context context) {
        super(context);
        this.h = "CommonTitleAlbumItemView";
        c();
    }

    public CommonTitleAlbumItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = "CommonTitleAlbumItemView";
        c();
    }

    public CommonTitleAlbumItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = "CommonTitleAlbumItemView";
        c();
    }

    private void c() {
        LayoutInflater.from(getContext()).inflate(b.e.item_common_title_album_view, this);
        this.a = (PlayControlView) findViewById(b.d.play_state);
        this.b = (MusicCircleImageView) findViewById(b.d.album_logo);
        this.c = (XImageView) findViewById(b.d.rank_img);
        this.d = (XTextView) findViewById(b.d.rank_title);
        this.e = (XTextView) findViewById(b.d.tv_speech_num);
        this.g = (XImageView) findViewById(b.d.top_right_label);
    }

    public void a(int i) {
        this.a.setPlayState(i);
    }

    private void b(int i) {
        int visibility = this.c.getVisibility();
        switch (i) {
            case 0:
                if (visibility == 8) {
                    this.c.setVisibility(0);
                }
                this.c.setImageResource(b.c.img_small_no1);
                return;
            case 1:
                if (visibility == 8) {
                    this.c.setVisibility(0);
                }
                this.c.setImageResource(b.c.img_small_no2);
                return;
            case 2:
                if (visibility == 8) {
                    this.c.setVisibility(0);
                }
                this.c.setImageResource(b.c.img_small_no3);
                return;
            default:
                if (visibility == 0) {
                    this.c.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public void a(int i, boolean z) {
        if (i == 0) {
            this.g.setVisibility(8);
            this.g.setImageDrawable(null);
        } else if (i == 1) {
            this.g.setImageResource(b.c.ic_xmly_cover_label_vip);
            this.g.setVisibility(0);
        } else if (i == 2) {
            this.g.setImageResource(b.c.ic_xmly_cover_label_payment);
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
            this.g.setImageDrawable(null);
        }
    }

    public void a(String str, String str2, int i, int i2, boolean z) {
        b(i);
        this.d.setText(str);
        this.f = str2;
        if (!z) {
            y.b(getContext(), str2, b.c.pic_program_default_220, this.b);
            this.b.setTag(b.d.album_logo, str2);
        } else {
            Object tag = this.b.getTag(b.d.album_logo);
            if (tag != null) {
                String str3 = (String) tag;
                if (!str3.equalsIgnoreCase(str2)) {
                    String str4 = this.h;
                    LogUtils.d(str4, "tag url:" + str3 + " not equals to albumurl:" + str2 + " for title :" + str);
                    y.b(getContext(), str2, b.c.pic_program_default_220, this.b);
                    this.b.setTag(b.d.album_logo, str2);
                }
            } else {
                String str5 = this.h;
                LogUtils.d(str5, "maybe init state,missing tag for title:" + str + " & url:" + str2);
            }
            String str6 = (String) this.b.getTag(b.e.dialog_xmly_qr_login);
        }
        this.e.setText(String.valueOf(i2));
        b();
    }

    public void a() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        y.b(getContext(), this.f, b.c.pic_program_default_220, this.b);
        this.b.setTag(b.d.album_logo, this.f);
    }

    public void b() {
        if (h.a().b() && this.e.getVisibility() == 8) {
            this.e.setVisibility(0);
        } else if (h.a().b() || this.e.getVisibility() != 0) {
        } else {
            this.e.setVisibility(8);
        }
    }

    public void setPlayListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public PlayControlView getPlayControlView() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XLinearLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }
}
