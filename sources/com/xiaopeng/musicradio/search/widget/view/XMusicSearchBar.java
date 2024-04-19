package com.xiaopeng.musicradio.search.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.musicradio.utils.ba;
import com.xiaopeng.xui.widget.XSearchBar;
/* loaded from: classes2.dex */
public class XMusicSearchBar extends XSearchBar {
    public XMusicSearchBar(Context context) {
        super(context);
    }

    public XMusicSearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XMusicSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public XMusicSearchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XSearchBar, com.xiaopeng.xui.widget.XTextInput
    public void initView() {
        super.initView();
    }

    @Override // com.xiaopeng.xui.widget.XTextInput, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        super.onFocusChange(view, z);
        if (view != getEditText() || z) {
            return;
        }
        ba.b(getEditText());
    }

    @Override // com.xiaopeng.xui.widget.XTextInput, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }
}
