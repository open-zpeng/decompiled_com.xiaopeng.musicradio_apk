package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.widget.XFrameLayout;
import com.xiaopeng.xui.widget.XLinearLayout;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class DialogLeftLayout extends XFrameLayout {
    protected XLinearLayout a;
    protected MusicCircleImageView b;
    protected PlayAllLogoLayout c;
    protected ViewGroup d;
    private FrameLayout e;

    public DialogLeftLayout(Context context) {
        super(context, null);
    }

    public DialogLeftLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(f.g.layout_dialog_left_part, this);
        this.a = (XLinearLayout) inflate.findViewById(f.C0131f.left_layout);
        this.b = (MusicCircleImageView) inflate.findViewById(f.C0131f.left_img);
        this.c = (PlayAllLogoLayout) inflate.findViewById(f.C0131f.left_playall);
        this.d = (ViewGroup) inflate.findViewById(f.C0131f.left_sub_content);
        this.e = (FrameLayout) inflate.findViewById(f.C0131f.image_layout);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VuiConstants.PROPS_VOICECONTROL, true);
            this.a.setVuiProps(jSONObject);
        } catch (JSONException e) {
            LogUtils.e("DialogLeftLayout", e.getMessage());
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.DialogLeftLayout);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(f.j.DialogLeftLayout_sub_layout, 0);
            if (resourceId != 0) {
                LayoutInflater.from(getContext()).inflate(resourceId, this.d);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    public ViewGroup getSubLayout() {
        return this.d;
    }

    public ImageView getLeftImg() {
        return this.b;
    }

    public FrameLayout getImageLayout() {
        return this.e;
    }

    public void setPlayAllListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setLoading(boolean z) {
        if (z) {
            this.c.setState(1);
        } else {
            this.c.setState(0);
        }
    }

    public void setPlayallEnabled(boolean z) {
        this.c.setEnabled(z);
    }

    public void setPlayallSelected(boolean z) {
        this.c.setSelected(z);
    }

    public PlayAllLogoLayout getPlayAllLayout() {
        return this.c;
    }
}
