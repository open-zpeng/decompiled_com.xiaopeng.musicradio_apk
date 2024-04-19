package com.xiaopeng.musicradio.search.widget.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes2.dex */
public class PlayAllButton extends XFrameLayout {
    private int a;
    private XTextView b;
    private XImageView c;

    public PlayAllButton(Context context) {
        super(context);
        a();
    }

    public PlayAllButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PlayAllButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(a.e.widget_play_all_btn, this);
        this.c = (XImageView) findViewById(a.d.left_iv);
        this.b = (XTextView) findViewById(a.d.btn_txt);
        b();
    }

    public void setButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    private void b() {
        int i = this.a;
        if (i == 2) {
            this.b.setText(a.f.play_all_btn_pause);
            this.c.setImageResource(a.c.ic_btn_playall_text_color);
        } else if (i == 3) {
            this.b.setText(a.f.play_all_btn_resume);
            this.c.setImageResource(a.c.ic_btn_stop_text_color);
        } else {
            this.b.setText(a.f.play_all_btn_default);
            this.c.setImageResource(a.c.ic_btn_playall_text_color);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.setImageTintList(ColorStateList.valueOf(getContext().getColor(a.C0165a.x_theme_text_01)));
    }

    public void setPlayState(int i) {
        this.a = i;
        b();
    }
}
