package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.xui.theme.XThemeManager;
import com.xiaopeng.xui.widget.XRelativeLayout;
import defpackage.aht;
/* loaded from: classes.dex */
public class MusicListLogoView extends XRelativeLayout {
    private ImageView a;
    private TextView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private int f;
    private String g;

    public MusicListLogoView(Context context) {
        super(context);
    }

    public MusicListLogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicListLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(aht.d.mine_music_list_logo_view, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(aht.c.iv_logo);
        this.b = (TextView) findViewById(aht.c.play_all_text_view);
        this.c = (ImageView) findViewById(aht.c.play_all_text_view_img);
        this.d = (TextView) findViewById(aht.c.tv_source);
        this.e = (TextView) findViewById(aht.c.tv_description);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.widget.MusicListLogoView.1
            @Override // java.lang.Runnable
            public void run() {
                MusicListLogoView.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.a.setImageResource(aht.b.pic_covers_music_220);
    }

    public void setTvSourceVisibility(int i) {
        this.d.setVisibility(i);
    }

    public void setPlayAllLayoutVisibility(int i) {
        this.b.setVisibility(i);
        this.c.setVisibility(i);
    }

    public void setIvLogoVisibility(int i) {
        this.a.setVisibility(i);
    }

    public void setLogo(String str) {
        this.g = str;
        y.a(str, aht.b.pic_covers_music_220, this.a);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    public void setImageResource(int i) {
        this.a.setImageResource(i);
    }

    public boolean a(gn<Integer, Integer> gnVar) {
        boolean z = true;
        switch (gnVar.b.intValue()) {
            case 1:
            case 2:
                this.b.setSelected(true);
                this.c.setSelected(true);
                break;
            default:
                this.b.setSelected(false);
                this.c.setSelected(false);
                z = false;
                break;
        }
        this.f = gnVar.a.intValue();
        this.b.setText(gnVar.a.intValue());
        com.xiaopeng.musicradio.commonui.vui.a a = amf.a(getContext());
        amk.a(this.b, gnVar.a.intValue(), "ms_play_all");
        if (a != null) {
            amk.a(a.m(), this.b);
        }
        return z;
    }

    public int getPlayAllText() {
        return this.f;
    }

    public void setDescriptionText(int i) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public void setDescriptionText(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XRelativeLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!XThemeManager.isThemeChanged(configuration) || TextUtils.isEmpty(this.g)) {
            return;
        }
        y.a(this.g, aht.b.pic_covers_music_220, this.a);
    }
}
