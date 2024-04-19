package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLoading;
/* loaded from: classes2.dex */
public class PlayStateWidget extends XFrameLayout {
    private XLoading a;
    private AVLoadingIndicatorView b;
    private XImageView c;
    private int d;

    public PlayStateWidget(Context context) {
        super(context);
        this.d = -1;
        a();
    }

    public PlayStateWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        a();
    }

    public PlayStateWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        a();
    }

    public PlayStateWidget(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = -1;
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(f.g.widget_play_state, this);
        this.a = (XLoading) findViewById(f.C0131f.lottie_loading);
        this.b = (AVLoadingIndicatorView) findViewById(f.C0131f.av_loading);
        this.c = (XImageView) findViewById(f.C0131f.shadow_layer);
    }

    public void a(int i, boolean z) {
        if (!z) {
            this.d = -1;
            this.b.e();
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d = i;
        } else if (this.d == i) {
        } else {
            this.d = i;
            switch (i) {
                case 1:
                    this.c.setVisibility(0);
                    this.b.setVisibility(8);
                    return;
                case 2:
                    this.b.setVisibility(0);
                    this.b.a();
                    this.c.setVisibility(0);
                    return;
                case 3:
                    this.b.setVisibility(0);
                    this.b.e();
                    this.c.setVisibility(0);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = -1;
    }

    public int getPlayState() {
        return this.d;
    }
}
