package com.xiaopeng.musicradio.program.choice.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.to.aboomy.banner.Banner;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.vui.VuiView;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ProgramBanner extends Banner implements VuiView {
    private TodayNewsCardBean.DataBean.ListBean a;
    private boolean b;

    @Override // com.xiaopeng.xui.vui.VuiView
    public void enableViewVuiMode(boolean z) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public String getVuiBizId() {
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public boolean getVuiDisableHitEffect() {
        return false;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public String getVuiFatherElementId() {
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public String getVuiFatherLabel() {
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public bii getVuiFeedbackType() {
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public String getVuiLabel() {
        return "";
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public int getVuiPosition() {
        return -1;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public boolean isPerformVuiAction() {
        return false;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public boolean isVuiLayoutLoadable() {
        return true;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public boolean isVuiModeEnabled() {
        return false;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setPerformVuiAction(boolean z) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiAction(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiBizId(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiDisableHitEffect(boolean z) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiElementId(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiElementType(bih bihVar) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiFatherElementId(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiFatherLabel(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiFeedbackType(bii biiVar) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiLabel(String str) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiLayoutLoadable(boolean z) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView
    public void setVuiMode(bij bijVar) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiPosition(int i) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiPriority(bik bikVar) {
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public void setVuiProps(JSONObject jSONObject) {
    }

    public ProgramBanner(Context context) {
        super(context);
        this.a = null;
        this.b = false;
    }

    public ProgramBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.b = false;
    }

    public ProgramBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
        this.b = false;
    }

    public int getNeedPage() {
        Object b = aw.b(this, "needPage");
        if (b instanceof Integer) {
            return ((Integer) b).intValue();
        }
        return -1;
    }

    public ViewPager getViewPager() {
        Object b = aw.b(this, "viewPager");
        if (b instanceof ViewPager) {
            return (ViewPager) b;
        }
        return null;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public bik getVuiPriority() {
        return bik.LEVEL3;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public String getVuiAction() {
        return big.SCROLLBYX.a();
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public bih getVuiElementType() {
        return bih.VIEWPAGER;
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public String getVuiElementId() {
        return "" + getId();
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public JSONObject getVuiProps() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VuiConstants.PROPS_SCROLLLEFT, true);
            jSONObject.put(VuiConstants.PROPS_SCROLLRIGHT, true);
            jSONObject.put("extraPage", getNeedPage());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.xiaopeng.xui.vui.VuiView, defpackage.bhz
    public bij getVuiMode() {
        return bij.NORMAL;
    }

    public void a(TodayNewsCardBean.DataBean.ListBean listBean, boolean z, int i) {
        this.a = listBean;
        ViewPager viewPager = getViewPager();
        if (viewPager != null) {
            for (int i2 = 0; i2 < viewPager.getChildCount(); i2++) {
                View childAt = viewPager.getChildAt(i2);
                if (childAt instanceof BannerItemLayout) {
                    BannerItemLayout bannerItemLayout = (BannerItemLayout) childAt;
                    if (bannerItemLayout.getPagerIndex() == i) {
                        bannerItemLayout.setVuiMode(bij.NORMAL);
                        ((VuiView) bannerItemLayout.findViewById(b.d.play_state)).setVuiMode(bij.NORMAL);
                    } else {
                        bannerItemLayout.setVuiMode(bij.DISABLED);
                        ((VuiView) bannerItemLayout.findViewById(b.d.play_state)).setVuiMode(bij.DISABLED);
                    }
                }
            }
        }
        VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", this);
    }
}
