package com.xiaopeng.musicradio.vui;

import android.content.Context;
import android.view.View;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.vui.VuiView;
import org.json.JSONObject;
/* compiled from: VuiManager.java */
/* loaded from: classes2.dex */
public class c {
    public static final String[] a = {be.a(f.h.vui_label_play), be.a(f.h.vui_label_stop)};

    public static void a(Context context, View view, boolean z) {
        a(context, view, z, a);
    }

    public static void a(Context context, View view, boolean z, String[] strArr) {
        int i = !z ? 1 : 0;
        VuiUtils.setStatefulButtonAttr(view, i, strArr, big.SETVALUE.a() + "|" + big.CLICK.a());
        VuiEngine.getInstance(context).setVuiStatfulButtonClick(view);
    }

    public static void a(VuiView vuiView, String str) {
        try {
            JSONObject vuiProps = vuiView.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put("defaultExecElementId", str);
            vuiView.setVuiProps(vuiProps);
        } catch (Exception unused) {
        }
    }

    public static void a(VuiView vuiView) {
        try {
            JSONObject vuiProps = vuiView.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put(VuiConstants.PROPS_VOICECONTROL, true);
            vuiView.setVuiProps(vuiProps);
        } catch (Exception unused) {
        }
    }

    public static void b(VuiView vuiView) {
        try {
            JSONObject vuiProps = vuiView.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put("hasHeader", true);
            vuiView.setVuiProps(vuiProps);
        } catch (Exception unused) {
        }
    }

    public static void c(VuiView vuiView) {
        try {
            JSONObject vuiProps = vuiView.getVuiProps();
            if (vuiProps == null) {
                vuiProps = new JSONObject();
            }
            vuiProps.put(VuiConstants.PROPS_FEEDBACK, true);
            vuiView.setVuiProps(vuiProps);
        } catch (Exception unused) {
        }
    }

    public static String a(String str) {
        return str == null ? "" : str.replace("|", " ");
    }
}
