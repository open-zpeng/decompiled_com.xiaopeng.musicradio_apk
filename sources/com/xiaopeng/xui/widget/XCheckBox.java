package com.xiaopeng.xui.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bip;
/* loaded from: classes2.dex */
public class XCheckBox extends XCompoundButton {
    public XCheckBox(Context context) {
        this(context, null);
    }

    public XCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XCheckBox(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, bip.k.XCheckBox);
    }

    public XCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setClickable(true);
    }
}
