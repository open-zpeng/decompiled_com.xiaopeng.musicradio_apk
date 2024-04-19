package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xiaopeng.musicradio.widget.AVLoadingIndicatorView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import defpackage.aht;
/* loaded from: classes.dex */
public class ItemPlayStatusLayout extends XRelativeLayout {
    private ImageView a;
    private AVLoadingIndicatorView b;

    public ItemPlayStatusLayout(Context context) {
        this(context, null);
    }

    public ItemPlayStatusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemPlayStatusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(aht.d.item_play_status_layout, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(aht.c.iv_loading);
        this.b = (AVLoadingIndicatorView) findViewById(aht.c.iv_play_state);
    }

    public Pair<Boolean, Boolean> a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return b(i);
            default:
                return b(-1);
        }
    }

    public Pair<Boolean, Boolean> b(int i) {
        int i2 = 8;
        boolean z = true;
        boolean z2 = false;
        switch (i) {
            case 1:
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(4);
                    z2 = true;
                } else {
                    i2 = 0;
                }
                this.b.e();
                break;
            case 2:
                this.b.setVisibility(0);
                this.b.a();
                i2 = 0;
                break;
            case 3:
                this.b.setVisibility(0);
                this.b.e();
                i2 = 0;
                z = false;
                break;
            default:
                this.b.setVisibility(4);
                this.b.e();
                z = false;
                break;
        }
        if (getVisibility() != i2) {
            setVisibility(i2);
        }
        return new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2));
    }
}
