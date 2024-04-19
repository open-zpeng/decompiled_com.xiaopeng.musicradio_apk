package com.xiaopeng.musicradio.vui;

import android.view.View;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.VuiView;
import org.json.JSONObject;
/* compiled from: VuiHelper.java */
/* loaded from: classes2.dex */
public class b {
    public static void a(int i, String str, View view, int i2, View view2, String[] strArr, boolean z) {
        a(i, str, view, i2, view2, strArr, i + 1, z);
    }

    public static void a(int i, String str, View view, int i2, View view2, String[] strArr) {
        a(i, str, view, i2, view2, strArr, i + 1, false);
    }

    public static void a(int i, String str, View view, int i2, View view2, String[] strArr, int i3, boolean z) {
        VuiView vuiView;
        if (view instanceof VuiView) {
            VuiView vuiView2 = (VuiView) view;
            int i4 = 0;
            vuiView2.setVuiLabel(String.format(com.xiaopeng.musicradio.a.a.getString(f.h.vui_play_position), str, Integer.valueOf(i3), Integer.valueOf(i3)));
            vuiView2.setVuiPosition(i);
            vuiView2.setVuiElementId(view.getId() + "_" + i);
            vuiView2.setVuiElementType(bih.GROUP);
            if (i2 != 1 && i2 != 2) {
                i4 = 1;
            }
            if (view2 != null) {
                vuiView = (VuiView) view2;
                vuiView.setVuiPosition(i);
                vuiView.setVuiElementId(view2.getId() + "_" + i);
            } else {
                vuiView = vuiView2;
            }
            if (z) {
                VuiUtils.setStatefulButtonAttr((View) vuiView, i4, strArr, big.SETVALUE.a() + "|" + big.CLICK.a(), true);
            } else {
                VuiUtils.setStatefulButtonAttr((View) vuiView, i4, strArr, big.SETVALUE.a() + "|" + big.CLICK.a());
            }
            VuiEngine vuiEngine = VuiEngine.getInstance(com.xiaopeng.musicradio.a.a);
            if (view2 != null) {
                view = view2;
            }
            vuiEngine.setVuiStatfulButtonClick(view);
            if (view2 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("defaultExecElementId", view2.getId() + "_" + i);
                vuiView2.setVuiProps(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(int i, String str, View view, int i2, View view2) {
        a(i, str, view, i2, view2, new String[]{com.xiaopeng.musicradio.a.a.getString(f.h.vui_label_play), com.xiaopeng.musicradio.a.a.getString(f.h.vui_label_stop)});
    }
}
