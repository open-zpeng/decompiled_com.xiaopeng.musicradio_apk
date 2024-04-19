package com.xiaopeng.xui.vui;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.xui.Xui;
import com.xiaopeng.xui.utils.XLogUtils;
import com.xiaopeng.xui.utils.XuiUtils;
import com.xiaopeng.xui.vui.utils.VuiCommonUtils;
import com.xiaopeng.xui.vui.utils.VuiViewUtils;
import defpackage.bip;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public interface VuiView extends bhz {
    public static final SparseArray<XAttr> msMap = new SparseArray<>();

    default void initVui(View view, AttributeSet attributeSet) {
        if (!Xui.isVuiEnable() || view == null || attributeSet == null) {
            return;
        }
        XAttr xAttr = new XAttr();
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, bip.l.vui);
        xAttr.vuiAction = obtainStyledAttributes.getString(bip.l.vui_vuiAction);
        xAttr.vuiElementType = VuiCommonUtils.getElementType(obtainStyledAttributes.getInteger(bip.l.vui_vuiElementType, -1));
        if (xAttr.vuiElementType == bih.UNKNOWN) {
            xAttr.vuiElementType = VuiViewUtils.getElementType(view);
        }
        xAttr.vuiPosition = Integer.valueOf(obtainStyledAttributes.getInteger(bip.l.vui_vuiPosition, -1));
        xAttr.vuiFatherElementId = obtainStyledAttributes.getString(bip.l.vui_vuiFatherElementId);
        xAttr.vuiLabel = obtainStyledAttributes.getString(bip.l.vui_vuiLabel);
        xAttr.vuiFatherLabel = obtainStyledAttributes.getString(bip.l.vui_vuiFatherLabel);
        xAttr.vuiElementId = obtainStyledAttributes.getString(bip.l.vui_vuiElementId);
        xAttr.vuiLayoutLoadable = obtainStyledAttributes.getBoolean(bip.l.vui_vuiLayoutLoadable, false);
        xAttr.vuiMode = VuiCommonUtils.getVuiMode(obtainStyledAttributes.getInteger(bip.l.vui_vuiMode, 4));
        xAttr.vuiBizId = obtainStyledAttributes.getString(bip.l.vui_vuiBizId);
        xAttr.vuiPriority = VuiCommonUtils.getViewLeveByPriority(obtainStyledAttributes.getInt(bip.l.vui_vuiPriority, 2));
        xAttr.vuiFeedbackType = VuiCommonUtils.getFeedbackType(obtainStyledAttributes.getInteger(bip.l.vui_vuiFeedbackType, 1));
        xAttr.vuiDisableHitEffect = obtainStyledAttributes.getBoolean(bip.l.vui_vuiDisableHitEffect, false);
        xAttr.vuiEnableViewVuiMode = obtainStyledAttributes.getBoolean(bip.l.vui_vuiEnableViewVuiMode, false);
        obtainStyledAttributes.recycle();
        xAttr.mVuiVisibility = view.getVisibility();
        xAttr.mVuiSelected = view.isSelected();
        synchronized (msMap) {
            msMap.put(hashCode(), xAttr);
        }
    }

    default XAttr checkVuiExit() {
        XAttr xAttr;
        synchronized (msMap) {
            xAttr = msMap.get(hashCode());
        }
        if (xAttr == null) {
            logD("xAttr is null");
            xAttr = new XAttr();
            if (xAttr.vuiElementType == bih.UNKNOWN) {
                xAttr.vuiElementType = VuiViewUtils.getElementType(this);
            }
            synchronized (msMap) {
                msMap.put(hashCode(), xAttr);
            }
        }
        return xAttr;
    }

    @Override // defpackage.bhz
    default boolean isVuiLayoutLoadable() {
        return checkVuiExit().vuiLayoutLoadable;
    }

    default void setVuiLayoutLoadable(boolean z) {
        checkVuiExit().vuiLayoutLoadable = z;
    }

    @Override // defpackage.bhz
    default bik getVuiPriority() {
        return checkVuiExit().vuiPriority;
    }

    @Override // defpackage.bhz
    default void setVuiPriority(bik bikVar) {
        checkVuiExit().vuiPriority = bikVar;
    }

    @Override // defpackage.bhz
    default String getVuiAction() {
        return checkVuiExit().vuiAction;
    }

    @Override // defpackage.bhz
    default void setVuiAction(String str) {
        checkVuiExit().vuiAction = str;
    }

    @Override // defpackage.bhz
    default bih getVuiElementType() {
        return checkVuiExit().vuiElementType;
    }

    @Override // defpackage.bhz
    default void setVuiElementType(bih bihVar) {
        checkVuiExit().vuiElementType = bihVar;
    }

    @Override // defpackage.bhz
    default String getVuiFatherElementId() {
        return checkVuiExit().vuiFatherElementId;
    }

    default void setVuiFatherElementId(String str) {
        checkVuiExit().vuiFatherElementId = str;
    }

    @Override // defpackage.bhz
    default String getVuiFatherLabel() {
        return checkVuiExit().vuiFatherLabel;
    }

    default void setVuiFatherLabel(String str) {
        checkVuiExit().vuiFatherLabel = str;
    }

    @Override // defpackage.bhz
    default String getVuiLabel() {
        return checkVuiExit().vuiLabel;
    }

    @Override // defpackage.bhz
    default void setVuiLabel(String str) {
        checkVuiExit().vuiLabel = str;
        if (isVuiLayoutLoadable() && (this instanceof View)) {
            updateVui((View) this);
        }
    }

    @Override // defpackage.bhz
    default String getVuiElementId() {
        return checkVuiExit().vuiElementId;
    }

    @Override // defpackage.bhz
    default void setVuiElementId(String str) {
        checkVuiExit().vuiElementId = str;
    }

    @Override // defpackage.bhz
    default void setVuiPosition(int i) {
        checkVuiExit().vuiPosition = Integer.valueOf(i);
    }

    @Override // defpackage.bhz
    default int getVuiPosition() {
        return checkVuiExit().vuiPosition.intValue();
    }

    default void releaseVui() {
        synchronized (msMap) {
            msMap.remove(hashCode());
        }
    }

    default bii getVuiFeedbackType() {
        return checkVuiExit().vuiFeedbackType;
    }

    default void setVuiFeedbackType(bii biiVar) {
        checkVuiExit().vuiFeedbackType = biiVar;
    }

    @Override // defpackage.bhz
    default boolean isPerformVuiAction() {
        return checkVuiExit().performVuiAction;
    }

    @Override // defpackage.bhz
    default void setPerformVuiAction(boolean z) {
        checkVuiExit().performVuiAction = z;
    }

    @Override // defpackage.bhz
    default void setVuiProps(JSONObject jSONObject) {
        checkVuiExit().vuiProps = jSONObject;
    }

    @Override // defpackage.bhz
    default JSONObject getVuiProps() {
        return checkVuiExit().vuiProps;
    }

    @Override // defpackage.bhz
    default bij getVuiMode() {
        return checkVuiExit().vuiMode;
    }

    default void setVuiMode(bij bijVar) {
        checkVuiExit().vuiMode = bijVar;
    }

    default void setVuiBizId(String str) {
        checkVuiExit().vuiBizId = str;
    }

    @Override // defpackage.bhz
    default String getVuiBizId() {
        return checkVuiExit().vuiBizId;
    }

    default void setVuiDisableHitEffect(boolean z) {
        checkVuiExit().vuiDisableHitEffect = z;
    }

    default boolean getVuiDisableHitEffect() {
        XAttr checkVuiExit = checkVuiExit();
        if (checkVuiExit.vuiDisableHitEffect || !(big.SCROLLBYY.a().equals(checkVuiExit.vuiAction) || big.SCROLLBYX.a().equals(checkVuiExit.vuiAction))) {
            return checkVuiExit.vuiDisableHitEffect;
        }
        return true;
    }

    default void enableViewVuiMode(boolean z) {
        checkVuiExit().vuiEnableViewVuiMode = z;
    }

    @Override // defpackage.bhz
    default boolean isVuiModeEnabled() {
        return checkVuiExit().vuiEnableViewVuiMode;
    }

    default void setVuiValue(Object obj) {
        checkVuiExit().vuiValue = obj;
    }

    @Override // defpackage.bhz
    default void setVuiValue(Object obj, View view) {
        checkVuiExit().vuiValue = obj;
        if (!bih.STATEFULBUTTON.a().equals(getVuiElementType().a()) || view == null) {
            return;
        }
        updateVui(view);
    }

    @Override // defpackage.bhz
    default Object getVuiValue() {
        return checkVuiExit().vuiValue;
    }

    @Override // defpackage.bhz
    default void setVuiElementChangedListener(bib bibVar) {
        checkVuiExit().mVuiElementChangedListener = new WeakReference(bibVar);
    }

    @Override // defpackage.bhz
    default bib getVuiElementChangedListener() {
        XAttr checkVuiExit = checkVuiExit();
        if (checkVuiExit.mVuiElementChangedListener != null) {
            synchronized (msMap) {
                if (checkVuiExit.mVuiElementChangedListener != null) {
                    return (bib) checkVuiExit.mVuiElementChangedListener.get();
                }
                return null;
            }
        }
        return null;
    }

    default void setVuiVisibility(View view, int i) {
        XAttr checkVuiExit = checkVuiExit();
        if (checkVuiExit.mVuiVisibility != i) {
            if (XLogUtils.isLogLevelEnabled(2)) {
                logD("setVuiVisibility; xAttr.mVuiVisibility : " + XuiUtils.formatVisibility(checkVuiExit.mVuiVisibility) + ",visibility " + XuiUtils.formatVisibility(i));
            }
            checkVuiExit.mVuiVisibility = i;
            try {
                JSONObject vuiProps = getVuiProps();
                if (vuiProps != null && vuiProps.has(VuiConstants.PROPS_VOICECONTROL)) {
                    if (vuiProps.getBoolean(VuiConstants.PROPS_VOICECONTROL)) {
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            updateVui(view);
        }
    }

    default void setVuiSelected(View view, boolean z) {
        XAttr checkVuiExit = checkVuiExit();
        if (checkVuiExit.mVuiSelected != z) {
            checkVuiExit.mVuiSelected = z;
            String a = getVuiElementType().a();
            if (bih.CHECKBOX.a().equals(a) || bih.SWITCH.a().equals(a) || bih.RADIOBUTTON.a().equals(a)) {
                updateVui(view);
            }
        }
    }

    default void updateVui(View view) {
        updateVui(view, bil.UPDATE_VIEW_ATTRIBUTE);
    }

    default void updateVui(View view, bil bilVar) {
        bib vuiElementChangedListener = getVuiElementChangedListener();
        if (vuiElementChangedListener != null) {
            VuiViewUtils.updateVui(vuiElementChangedListener, view, bilVar);
        } else if (XLogUtils.isLogLevelEnabled(2)) {
            logD("listener is null");
        }
    }

    default void logD(String str) {
        XLogUtils.d("xpui", "%s %s hashCode:%s", getClass().getSimpleName(), str, Integer.valueOf(hashCode()));
    }

    default void logI(String str) {
        XLogUtils.i("xpui", "%s %s hashCode:%s", getClass().getSimpleName(), str, Integer.valueOf(hashCode()));
    }

    /* loaded from: classes2.dex */
    public static class XAttr {
        private volatile WeakReference<bib> mVuiElementChangedListener;
        private int mVuiVisibility;
        private boolean performVuiAction;
        private String vuiAction;
        private String vuiBizId;
        private boolean vuiDisableHitEffect;
        private String vuiElementId;
        private String vuiFatherElementId;
        private String vuiFatherLabel;
        private bii vuiFeedbackType;
        private String vuiLabel;
        private boolean vuiLayoutLoadable;
        private Object vuiValue;
        private boolean mVuiSelected = false;
        private bih vuiElementType = VuiCommonUtils.getElementType(-1);
        private Integer vuiPosition = -1;
        private bij vuiMode = bij.NORMAL;
        private boolean vuiEnableViewVuiMode = false;
        private bik vuiPriority = VuiCommonUtils.getViewLeveByPriority(2);
        private JSONObject vuiProps = null;

        XAttr() {
        }
    }
}
