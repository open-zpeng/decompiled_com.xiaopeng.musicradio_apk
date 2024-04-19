package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.xui.Xui;
import com.xiaopeng.xui.view.XViewDelegate;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aho;
import defpackage.yb;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MTabLayout extends yb implements bic, VuiView {
    protected XViewDelegate y;

    private void g() {
    }

    public MTabLayout(Context context) {
        this(context, null);
    }

    public MTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.y = XViewDelegate.create(this, attributeSet);
        initVui(this, attributeSet);
    }

    public MTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
        this.y = XViewDelegate.create(this, attributeSet, i);
        initVui(this, attributeSet);
        f();
    }

    private void f() {
        if (Xui.isVuiEnable()) {
            a(new yb.c() { // from class: com.xiaopeng.musicradio.widget.MTabLayout.1
                @Override // defpackage.yb.b
                public void b(yb.f fVar) {
                }

                @Override // defpackage.yb.b
                public void c(yb.f fVar) {
                }

                @Override // defpackage.yb.b
                public void a(yb.f fVar) {
                    MTabLayout mTabLayout = MTabLayout.this;
                    mTabLayout.updateVui(mTabLayout);
                }
            });
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        XViewDelegate xViewDelegate = this.y;
        if (xViewDelegate != null) {
            xViewDelegate.onConfigurationChanged(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yb, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        XViewDelegate xViewDelegate = this.y;
        if (xViewDelegate != null) {
            xViewDelegate.onAttachedToWindow();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yb, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        XViewDelegate xViewDelegate = this.y;
        if (xViewDelegate != null) {
            xViewDelegate.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setVuiVisibility(this, i);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        setVuiSelected(this, z);
    }

    protected void finalize() {
        super.finalize();
        releaseVui();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.4f);
        }
    }

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        try {
            setVuiValue(Integer.valueOf(getSelectedTabPosition()));
            for (int i = 0; i < getTabCount(); i++) {
                XTextView xTextView = (XTextView) a(i).b.findViewById(aho.c.x_tab_text);
                xTextView.setVuiPosition(i);
                xTextView.setVuiElementId(str + "_" + i);
                JSONObject vuiProps = getVuiProps();
                if (vuiProps == null) {
                    vuiProps = new JSONObject();
                }
                vuiProps.put("isTabLayoutChild", true);
                setVuiProps(vuiProps);
            }
            logD("onBuildVuiElement:" + str);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(final View view, bio bioVar) {
        final Double d;
        logD("tablayout onVuiElementEvent");
        if (view == null || (d = (Double) bioVar.getEventValue(bioVar)) == null) {
            return false;
        }
        post(new Runnable() { // from class: com.xiaopeng.musicradio.widget.-$$Lambda$MTabLayout$O0c3R7G6Kvc9WLSENUnLgfyOj4A
            @Override // java.lang.Runnable
            public final void run() {
                MTabLayout.this.a(d, view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Double d, View view) {
        if (d.intValue() < getTabCount()) {
            VuiFloatingLayerManager.show(a(d.intValue()).b);
        } else {
            VuiFloatingLayerManager.show(view);
        }
        setPerformVuiAction(true);
        c(a(d.intValue()));
        setPerformVuiAction(false);
    }
}
