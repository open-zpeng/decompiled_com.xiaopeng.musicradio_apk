package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
/* loaded from: classes2.dex */
public class PlayControlView extends XFrameLayout {
    private XImageView a;
    private int b;

    public PlayControlView(Context context) {
        super(context);
        a();
    }

    public PlayControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PlayControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setBackgroundResource(f.e.bg_playcontrol);
        LayoutInflater.from(getContext()).inflate(f.g.layout_play_control_view, this);
        this.a = (XImageView) findViewById(f.C0131f.control_state);
    }

    public void setPlayState(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        switch (i) {
            case 1:
            case 2:
                this.a.setImageResource(f.e.ic_btn_stop);
                return;
            default:
                this.a.setImageResource(f.e.ic_btn_playall);
                return;
        }
    }
}
