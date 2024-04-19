package com.xiaopeng.musicradio.search.result.mix.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.nex3z.flowlayout.FlowLayout;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.widget.view.PlayAllButton;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.List;
/* loaded from: classes2.dex */
public class MixItemLayout extends XConstraintLayout {
    private XTextView a;
    private FlowLayout b;
    private PlayAllButton c;

    public MixItemLayout(Context context) {
        super(context);
        a();
    }

    public MixItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MixItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(a.e.item_mix_container, this);
        this.a = (XTextView) findViewById(a.d.title);
        this.b = (FlowLayout) findViewById(a.d.container_layout);
        this.c = (PlayAllButton) findViewById(a.d.play_all);
    }

    public void a(int i, int i2, int i3) {
        this.b.setMaxRows(i);
        this.b.setRowSpacing(i3);
        this.b.setChildSpacing(i2);
    }

    public void a(List<View> list, int i, int i2) {
        this.b.removeAllViews();
        for (View view : list) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i);
            this.b.addView(view, layoutParams);
        }
    }

    public void setPlayAllListener(View.OnClickListener onClickListener) {
        this.c.setButtonClickListener(onClickListener);
        this.c.setVisibility(0);
        this.c.setVuiMode(bij.NORMAL);
        VuiEngine.getInstance(getContext()).updateScene("SearchResultMix", this.c);
    }

    public FlowLayout getContainerLayout() {
        return this.b;
    }

    public void setTitle(int i) {
        this.a.setText(i);
    }
}
