package com.xiaopeng.musicradio.vui;

import android.content.Context;
import android.util.AttributeSet;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.speech.vui.VuiEngine;
@Deprecated
/* loaded from: classes2.dex */
public class VuiRecyclerView extends BaseRecycleView {
    public void setNeedUpdate(boolean z) {
    }

    public VuiRecyclerView(Context context) {
        super(context);
        b();
    }

    public VuiRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public VuiRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        setVuiLayoutLoadable(true);
        setVuiMode(bij.NORMAL);
    }

    public void a(String str) {
        initVuiAttr(str, VuiEngine.getInstance(getContext()));
    }
}
