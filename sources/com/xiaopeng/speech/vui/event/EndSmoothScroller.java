package com.xiaopeng.speech.vui.event;

import android.content.Context;
import androidx.recyclerview.widget.j;
/* loaded from: classes2.dex */
public class EndSmoothScroller extends j {
    @Override // androidx.recyclerview.widget.j
    protected int getHorizontalSnapPreference() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.j
    protected int getVerticalSnapPreference() {
        return 1;
    }

    public EndSmoothScroller(Context context) {
        super(context);
    }
}
