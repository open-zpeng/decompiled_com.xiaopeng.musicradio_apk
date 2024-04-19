package com.xiaopeng.speech.protocol.query.charge;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ChargeSpeechVuiQuery extends bfd<com.xiaopeng.speech.protocol.query.speech.vui.a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (jSONObject2.has("value")) {
                    return jSONObject2.optJSONObject("value").optJSONObject("SetCheck").optBoolean("value", false);
                }
                if (jSONObject2.has("values")) {
                    return jSONObject2.optJSONObject("values").optJSONObject("SetCheck").optBoolean("value", false);
                }
                return false;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean c(String str, String str2) {
        int optInt;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int optInt2 = jSONObject.optInt(Constants.INDEX, 0);
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), jSONObject.optString("elementId", ""));
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                JSONObject jSONObject3 = null;
                if (jSONObject2.has("value")) {
                    jSONObject3 = jSONObject2.optJSONObject("value");
                } else if (jSONObject2.has("values")) {
                    jSONObject3 = jSONObject2.optJSONObject("values");
                }
                if (jSONObject3 != null) {
                    if (jSONObject3.has("SetValue")) {
                        optInt = jSONObject3.optJSONObject("SetValue").optInt("value", 0);
                    } else {
                        optInt = jSONObject3.has("SelectTab") ? jSONObject3.optJSONObject("SelectTab").optInt("value", 0) : 0;
                    }
                    return optInt == optInt2;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int d(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (TextUtils.isEmpty(a)) {
                return 0;
            }
            JSONObject jSONObject2 = new JSONObject(a);
            double d = 0.0d;
            if (jSONObject2.has("value")) {
                d = jSONObject2.optJSONObject("value").optJSONObject("SetValue").optDouble("value", 0.0d);
            } else if (jSONObject2.has("values")) {
                d = jSONObject2.optJSONObject("values").optJSONObject("SetValue").optDouble("value", 0.0d);
            }
            return (int) d;
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
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (jSONObject2.has("value")) {
                    return jSONObject2.optJSONObject("value").optJSONObject("SetCheck").optBoolean("value", false);
                }
                if (jSONObject2.has("values")) {
                    return jSONObject2.optJSONObject("values").optJSONObject("SetCheck").optBoolean("value", false);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String f(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (jSONObject2.has("value")) {
                    return jSONObject2.optJSONObject("value").optJSONObject("SetValue").optString("value", null);
                }
                if (jSONObject2.has("values")) {
                    return jSONObject2.optJSONObject("values").optJSONObject("SetValue").optString("value", null);
                }
                return null;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean g(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (TextUtils.isEmpty(a)) {
                return false;
            }
            return new JSONObject(a).optBoolean(VuiConstants.ELEMENT_ENABLED, true);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    @com.xiaopeng.speech.annotation.QueryAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r7 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L89
            r0.<init>(r8)     // Catch: org.json.JSONException -> L89
            java.lang.String r8 = "elementId"
            java.lang.String r1 = ""
            java.lang.String r8 = r0.optString(r8, r1)     // Catch: org.json.JSONException -> L89
            java.lang.String r1 = "sceneId"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: org.json.JSONException -> L89
            java.lang.String r2 = "direction"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.optString(r2, r3)     // Catch: org.json.JSONException -> L89
            T r2 = r6.b     // Catch: org.json.JSONException -> L89
            com.xiaopeng.speech.protocol.query.speech.vui.a r2 = (com.xiaopeng.speech.protocol.query.speech.vui.a) r2     // Catch: org.json.JSONException -> L89
            java.lang.String r8 = r2.a(r1, r8)     // Catch: org.json.JSONException -> L89
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: org.json.JSONException -> L89
            if (r1 != 0) goto L8d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L89
            r1.<init>(r8)     // Catch: org.json.JSONException -> L89
            r8 = 0
            r2 = -1
            int r3 = r0.hashCode()     // Catch: org.json.JSONException -> L89
            r4 = 3739(0xe9b, float:5.24E-42)
            r5 = 1
            if (r3 == r4) goto L6a
            r4 = 3089570(0x2f24a2, float:4.32941E-39)
            if (r3 == r4) goto L60
            r4 = 3317767(0x32a007, float:4.649182E-39)
            if (r3 == r4) goto L56
            r4 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r3 == r4) goto L4c
            goto L74
        L4c:
            java.lang.String r3 = "right"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L89
            if (r0 == 0) goto L74
            r0 = 2
            goto L75
        L56:
            java.lang.String r3 = "left"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L89
            if (r0 == 0) goto L74
            r0 = r7
            goto L75
        L60:
            java.lang.String r3 = "down"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L89
            if (r0 == 0) goto L74
            r0 = 3
            goto L75
        L6a:
            java.lang.String r3 = "up"
            boolean r0 = r0.equals(r3)     // Catch: org.json.JSONException -> L89
            if (r0 == 0) goto L74
            r0 = r5
            goto L75
        L74:
            r0 = r2
        L75:
            switch(r0) {
                case 0: goto L82;
                case 1: goto L7f;
                case 2: goto L7c;
                case 3: goto L79;
                default: goto L78;
            }     // Catch: org.json.JSONException -> L89
        L78:
            goto L84
        L79:
            java.lang.String r8 = "canScrollDown"
            goto L84
        L7c:
            java.lang.String r8 = "canScrollRight"
            goto L84
        L7f:
            java.lang.String r8 = "canScrollUp"
            goto L84
        L82:
            java.lang.String r8 = "canScrollLeft"
        L84:
            boolean r7 = r1.optBoolean(r8, r5)     // Catch: org.json.JSONException -> L89
            return r7
        L89:
            r8 = move-exception
            r8.printStackTrace()
        L8d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.protocol.query.charge.ChargeSpeechVuiQuery.h(java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean i(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (jSONObject2.has("value")) {
                    return jSONObject2.optJSONObject("value").optJSONObject("SetCheck").optBoolean("value", false);
                }
                if (jSONObject2.has("values")) {
                    return jSONObject2.optJSONObject("values").optJSONObject("SetCheck").optBoolean("value", false);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean j(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("elementId", "");
            String a = ((com.xiaopeng.speech.protocol.query.speech.vui.a) this.b).a(jSONObject.optString(VuiConstants.SCENE_ID, ""), optString);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject2 = new JSONObject(a);
                if (jSONObject2.has("value")) {
                    return jSONObject2.optJSONObject("value").optJSONObject("SetCheck").optBoolean("value", false);
                }
                if (jSONObject2.has("values")) {
                    return jSONObject2.optJSONObject("values").optJSONObject("SetCheck").optBoolean("value", false);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
