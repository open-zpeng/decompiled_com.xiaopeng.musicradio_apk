package com.xiaopeng.speech.protocol.query.speech.vui;

import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SpeechVuiQuery extends bfd<b> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).a(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean c(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).a(jSONObject.optInt(Constants.INDEX, 0), jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).b(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean e(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).c(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String f(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).d(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean g(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).e(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean h(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).a(jSONObject.optString(VuiConstants.EVENT_VALUE_DIRECTION, ""), jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean e() {
        return ((b) this.b).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean i(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).f(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean j(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return ((b) this.b).g(jSONObject.optString("elementId", ""), jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, ""), jSONObject.optString("packageVersion", ""));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String k(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONArray optJSONArray = jSONObject.optJSONArray(VuiConstants.SCENE_ELEMENTS);
            String optString = jSONObject.optString(VuiConstants.SCENE_ID, "");
            String optString2 = jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME, "");
            String optString3 = jSONObject.optString(VuiConstants.SCENE_APP_VERSION, "");
            String optString4 = jSONObject.optString(Constants.MSG_ID);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.MSG_ID, optString4);
            jSONObject2.put(VuiConstants.SCENE_ID, optString);
            jSONObject2.put(VuiConstants.SCENE_ELEMENTS, optJSONArray);
            return ((b) this.b).h(optString2, optString, String.valueOf(jSONObject2), optString3);
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean l(String str, String str2) {
        try {
            JSONArray optJSONArray = new JSONObject(str2).optJSONArray("sceneIds");
            String[] strArr = null;
            if (optJSONArray != null) {
                strArr = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    strArr[i] = optJSONArray.optString(i);
                }
            }
            return ((b) this.b).a(strArr);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
