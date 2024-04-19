package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
/* loaded from: classes2.dex */
public class MarqueeTextView extends bec {
    private Handler a;
    private boolean b;
    private CharSequence c;

    public MarqueeTextView(Context context) {
        super(context);
        this.a = new Handler();
        this.b = true;
        a();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Handler();
        this.b = true;
        a();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Handler();
        this.b = true;
        a();
    }

    private void a() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setSelected(true);
        setFocusable(false);
        setFocusableInTouchMode(false);
        CharSequence text = getText();
        if (text == null || text.length() <= 0) {
            return;
        }
        setText(text);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return !this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.z, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getText() == null || getText().equals(this.c)) {
            return;
        }
        this.c = getText();
        setText(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = true;
        this.a.removeCallbacksAndMessages(null);
    }
}
