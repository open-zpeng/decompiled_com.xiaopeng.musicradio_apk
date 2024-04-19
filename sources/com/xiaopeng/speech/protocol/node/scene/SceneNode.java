package com.xiaopeng.speech.protocol.node.scene;

import android.text.TextUtils;
import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SceneNode extends bfc<a> {
    List<String> d;

    @SpeechAnnotation
    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            String optString = new JSONObject(str2).optString(VuiConstants.SCENE_ID);
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            String str3 = null;
            if (optString.contains("-")) {
                str3 = optString.split("-")[0];
            } else if (optString.contains("_")) {
                str3 = optString.split("_")[0];
            }
            if (!TextUtils.isEmpty(str3) && this.d.contains(str3)) {
                h(str, str2);
            }
        } catch (Exception unused) {
        }
    }

    @SpeechAnnotation
    public void c(String str, String str2) {
        h(VuiConstants.DM_START_EVENT, str2);
    }

    @SpeechAnnotation
    public void d(String str, String str2) {
        h(VuiConstants.DM_END_EVENT, str2);
    }

    @SpeechAnnotation
    public void e(String str, String str2) {
        h(VuiConstants.VUI_FEATURE_ENABLE, str2);
    }

    @SpeechAnnotation
    public void f(String str, String str2) {
        h(VuiConstants.VUI_FEATURE_DISABLE, str2);
    }

    @SpeechAnnotation
    public void g(String str, String str2) {
        h(str, str2);
    }

    private void h(String str, String str2) {
        try {
            Object[] a = this.b.a();
            if (a != null) {
                for (Object obj : a) {
                    ((a) obj).a(str, str2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
