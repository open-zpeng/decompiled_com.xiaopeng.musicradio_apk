package com.xiaopeng.speech.protocol.query.speech;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.aiassistantmodule.sensor.ContextSensor;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SpeechSensorQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int b(String str, String str2) {
        return ((a) this.b).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean c(String str, String str2) {
        String str3 = "";
        try {
            str3 = new JSONObject(str2).optString(ContextSensor.DATA_PACKAGE);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return ((a) this.b).a(str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean d(String str, String str2) {
        return ((a) this.b).b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean e(String str, String str2) {
        return ((a) this.b).c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int f(String str, String str2) {
        return ((a) this.b).d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String g(String str, String str2) {
        return ((a) this.b).e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int h(String str, String str2) {
        return ((a) this.b).f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int i(String str, String str2) {
        return ((a) this.b).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int j(String str, String str2) {
        return ((a) this.b).h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean k(String str, String str2) {
        c.a("SpeechUiQuery", "enter appIsInstalled , event = " + str + ", data = " + str2);
        try {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            return ((a) this.b).b(new JSONObject(str2).optString(VuiConstants.SCENE_PACKAGE_NAME, ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean l(String str, String str2) {
        return ((a) this.b).i();
    }
}
