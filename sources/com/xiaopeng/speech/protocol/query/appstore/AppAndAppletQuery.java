package com.xiaopeng.speech.protocol.query.appstore;

import android.text.TextUtils;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AppAndAppletQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int b(String str, String str2) {
        return ((a) this.b).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int c(String str, String str2) {
        return ((a) this.b).b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int d(String str, String str2) {
        return ((a) this.b).c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int e(String str, String str2) {
        return ((a) this.b).d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int f(String str, String str2) {
        return ((a) this.b).e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int g(String str, String str2) {
        return ((a) this.b).f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int h(String str, String str2) {
        return ((a) this.b).a(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int i(String str, String str2) {
        return ((a) this.b).b(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int j(String str, String str2) {
        return ((a) this.b).c(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int k(String str, String str2) {
        return ((a) this.b).d(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int l(String str, String str2) {
        String str3 = null;
        try {
            if (!TextUtils.isEmpty(str2)) {
                str3 = new JSONObject(str2).optString(VuiConstants.ELEMENT_TYPE);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return ((a) this.b).e(str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean m(String str, String str2) {
        return ((a) this.b).g();
    }
}
