package com.xiaopeng.speech.protocol.node.app;

import android.text.TextUtils;
import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AppNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        String str3 = "";
        try {
            str3 = new JSONObject(str2).optString("appName");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void c(String str, String str2) {
        String str3 = "";
        try {
            str3 = new JSONObject(str2).optString("appName");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b(str, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[LOOP:0: B:20:0x003c->B:22:0x003f, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:19:0x003a, B:22:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d A[ORIG_RETURN, RETURN] */
    @com.xiaopeng.speech.annotation.SpeechAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.xiaopeng.speech.common.util.d<T> r4 = r3.b
            java.lang.Object[] r4 = r4.a()
            r0 = 0
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.io.UnsupportedEncodingException -> L2f org.json.JSONException -> L35
            r2.<init>(r5)     // Catch: java.io.UnsupportedEncodingException -> L2f org.json.JSONException -> L35
            java.lang.String r5 = "pageUrl"
            java.lang.String r5 = r2.optString(r5)     // Catch: java.io.UnsupportedEncodingException -> L2b org.json.JSONException -> L2d
            java.lang.String r1 = "isDui"
            boolean r1 = r2.optBoolean(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L2b org.json.JSONException -> L2d
            if (r1 == 0) goto L25
            java.lang.String r5 = r3.a(r5)     // Catch: java.io.UnsupportedEncodingException -> L2b org.json.JSONException -> L2d
            java.lang.String r1 = "utf-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r1)     // Catch: java.io.UnsupportedEncodingException -> L2b org.json.JSONException -> L2d
        L25:
            java.lang.String r1 = "pageUrl"
            r2.putOpt(r1, r5)     // Catch: java.io.UnsupportedEncodingException -> L2b org.json.JSONException -> L2d
            goto L3a
        L2b:
            r5 = move-exception
            goto L31
        L2d:
            r5 = move-exception
            goto L37
        L2f:
            r5 = move-exception
            r2 = r1
        L31:
            r5.printStackTrace()
            goto L3a
        L35:
            r5 = move-exception
            r2 = r1
        L37:
            r5.printStackTrace()
        L3a:
            if (r4 == 0) goto L4d
        L3c:
            int r5 = r4.length
            if (r0 >= r5) goto L4d
            r5 = r4[r0]
            com.xiaopeng.speech.protocol.node.app.a r5 = (com.xiaopeng.speech.protocol.node.app.a) r5
            java.lang.String r1 = r2.toString()
            r5.a(r1)
            int r0 = r0 + 1
            goto L3c
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.protocol.node.app.AppNode.d(java.lang.String, java.lang.String):void");
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("$")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            if (substring.equals("$")) {
                sb.append("&");
            } else {
                sb.append(substring);
            }
            i = i2;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void e(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void f(String str, String str2) {
        String str3 = "";
        try {
            str3 = new JSONObject(str2).optString("appName");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c(str, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void g(String str, String str2) {
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        try {
            JSONObject jSONObject = new JSONObject(str2);
            str3 = jSONObject.optString("skill");
            str4 = jSONObject.optString("task");
            str5 = jSONObject.optString("intent");
            str6 = jSONObject.optString("slots");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str3, str4, str5, str6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void h(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void i(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void j(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void k(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void l(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void m(String str, String str2) {
        Object[] a = this.b.a();
        String str3 = "";
        String str4 = "";
        String str5 = "";
        try {
            JSONObject jSONObject = new JSONObject(str2);
            str3 = jSONObject.optString(VuiConstants.SCENE_PACKAGE_NAME);
            str4 = jSONObject.optString("action");
            str5 = jSONObject.optString("extraData");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str3, str4, str5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void n(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void o(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b(str2);
            }
        }
    }
}
