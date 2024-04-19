package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.drawable.XLoadingDrawable;
import com.xiaopeng.xui.widget.XFrameLayout;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PlayAllLogoLayout extends XFrameLayout {
    protected TextView a;
    protected LottieAnimationView b;
    private XFrameLayout c;
    private int d;

    public PlayAllLogoLayout(Context context) {
        super(context, null);
        this.d = 0;
    }

    public PlayAllLogoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        LayoutInflater.from(context).inflate(getLayoutId(), (ViewGroup) this, true);
        this.c = (XFrameLayout) findViewById(f.C0131f.layout);
        this.a = (TextView) findViewById(f.C0131f.text);
        this.b = (LottieAnimationView) findViewById(f.C0131f.lottie_loading);
        XLoadingDrawable xLoadingDrawable = new XLoadingDrawable();
        xLoadingDrawable.setType(0);
        xLoadingDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        this.b.setBackground(xLoadingDrawable);
        this.a.setCompoundDrawablesWithIntrinsicBounds(f.e.play_all_logo_selector_32, 0, 0, 0);
        TextView textView = this.a;
        textView.setCompoundDrawableTintList(textView.getTextColors());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VuiConstants.PROPS_VOICECONTROL, true);
            this.c.setVuiProps(jSONObject);
        } catch (JSONException e) {
            LogUtils.e("PlayAllLogoLayout", e.getMessage());
        }
        this.c.setVuiPriority(bik.LEVEL2);
    }

    protected int getLayoutId() {
        return f.g.layout_playall;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
        this.a.setEnabled(z);
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    public void setText(int i) {
        setText(getContext().getString(i));
    }

    public TextView getText() {
        return this.a;
    }

    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.c.setSelected(z);
        this.a.setSelected(z);
    }

    public void setState(int i) {
        this.d = i;
        if (i == 0) {
            setClickable(true);
            this.a.setCompoundDrawablesWithIntrinsicBounds(f.e.play_all_logo_selector_32, 0, 0, 0);
            this.b.setVisibility(8);
            this.b.d();
            return;
        }
        this.a.setText(f.h.loading);
        this.a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        setClickable(false);
        this.b.setVisibility(0);
        this.b.b();
    }

    public FrameLayout getLayout() {
        return this.c;
    }

    public void a(String str, String[] strArr, int i, boolean z) {
        VuiUtils.setStatefulButtonAttr(this.c, i, strArr, null);
        if (z) {
            VuiEngine.getInstance(getContext()).updateScene(str, this.c);
        } else {
            this.c.setVuiLabel("");
        }
    }

    public void a() {
        try {
            JSONObject vuiProps = this.c.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put(VuiConstants.PROPS_FEEDBACK, true);
            this.c.setVuiProps(vuiProps);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b.c()) {
            this.b.d();
        }
    }
}
