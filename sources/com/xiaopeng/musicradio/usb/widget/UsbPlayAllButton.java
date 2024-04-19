package com.xiaopeng.musicradio.usb.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.xiaopeng.musicradio.usb.a;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes2.dex */
public class UsbPlayAllButton extends XLinearLayout {
    private int a;
    private XTextView b;
    private XImageView c;
    private XTextView d;

    public UsbPlayAllButton(Context context) {
        super(context);
        a();
    }

    public UsbPlayAllButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public UsbPlayAllButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(a.c.usb_play_all_btn, this);
        this.c = (XImageView) findViewById(a.b.left_iv);
        this.b = (XTextView) findViewById(a.b.btn_txt);
        this.d = (XTextView) findViewById(a.b.count_txt);
        b();
    }

    public void setButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    private void b() {
        int i = this.a;
        if (i == 2 || i == 1) {
            this.b.setText(a.d.play_all_btn_pause);
            this.c.setImageResource(a.C0175a.ic_btn_stop_black);
        } else if (i == 3) {
            this.b.setText(a.d.play_all_btn_resume);
            this.c.setImageResource(a.C0175a.ic_btn_playall_black);
        } else {
            this.b.setText(a.d.play_all_btn_default);
            this.c.setImageResource(a.C0175a.ic_btn_playall_black);
        }
    }

    public void setPlayState(int i) {
        this.a = i;
        b();
    }

    public void setCountText(int i) {
        XTextView xTextView = this.d;
        xTextView.setText("（" + i + "首）");
    }

    public String getPlayText() {
        return this.b.getText().toString();
    }
}
