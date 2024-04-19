package com.xiaopeng.speech.vui.utils;

import android.view.View;
import java.util.Map;
/* loaded from: classes2.dex */
public class XpVuiUtils {
    public static void setValueAttribute(View view, bin binVar) {
        VuiUtils.setValueAttribute(view, binVar);
    }

    public static void addScrollProps(bin binVar, View view) {
        VuiUtils.addScrollProps(binVar, view);
    }

    public static void addProps(bin binVar, Map<String, Boolean> map) {
        VuiUtils.addProps(binVar, map);
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2, String str3) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, str3);
    }

    public static bin generateCommonVuiElement(int i, bih bihVar, String str, String str2) {
        return VuiUtils.generateCommonVuiElement("" + i, bihVar, str, str2);
    }

    public static bin generateCommonVuiElement(int i, bih bihVar, String str) {
        return VuiUtils.generateCommonVuiElement("" + i, bihVar, str, (String) null);
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, (String) null);
    }

    public static bin generateCommonVuiElement(String str, bih bihVar, String str2, boolean z) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, null, z, bik.LEVEL3);
    }

    public static bin generateLayoutLoadableVuiElement(String str, bih bihVar, String str2) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, null, true, bik.LEVEL3);
    }

    public static bin generateLayoutLoadableVuiElement(String str, bih bihVar, String str2, String str3) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, str3, true, bik.LEVEL3);
    }

    public static bin generatePriorityVuiElement(String str, bih bihVar, String str2, bik bikVar) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, null, false, bikVar);
    }

    public static bin generateVideoVuiElement(String str, bih bihVar, String str2, String str3) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, str3, false, bik.LEVEL2, VuiUtils.LIST_VEDIO_TYPE);
    }

    public static bin generatePriorityVuiElement(String str, bih bihVar, String str2, String str3, bik bikVar) {
        return VuiUtils.generateCommonVuiElement(str, bihVar, str2, str3, false, bikVar);
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, int i2) {
        String a = big.SETVALUE.a();
        return VuiUtils.generateStatefulButtonElement(i, strArr, a, "" + i2, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str) {
        return VuiUtils.generateStatefulButtonElement(i, strArr, big.SETVALUE.a(), str, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str, String str2) {
        return VuiUtils.generateStatefulButtonElement(i, strArr, str, str2, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str, int i2) {
        return VuiUtils.generateStatefulButtonElement(i, strArr, str, "" + i2, "");
    }

    public static bin generateStatefulButtonElement(int i, String[] strArr, String str, String str2, String str3) {
        return VuiUtils.generateStatefulButtonElement(i, strArr, str, str2, str3);
    }

    public static <T> T getValueByName(bin binVar, String str) {
        return (T) VuiUtils.getValueByName(binVar, str);
    }
}
