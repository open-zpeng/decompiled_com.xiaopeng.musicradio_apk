package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.xui.widget.XImageButton;
import defpackage.aht;
/* loaded from: classes.dex */
public class AlbumPlayStatusButton extends XImageButton {
    public AlbumPlayStatusButton(Context context) {
        this(context, null);
    }

    public AlbumPlayStatusButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumPlayStatusButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setTag(aht.c.tag_play, true);
    }

    public boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
                setImageResource(aht.b.ic_btn_stop);
                return true;
            default:
                setImageResource(aht.b.ic_btn_playall);
                return false;
        }
    }
}
