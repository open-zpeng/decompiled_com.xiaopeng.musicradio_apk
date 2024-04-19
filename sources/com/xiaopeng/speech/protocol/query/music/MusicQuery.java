package com.xiaopeng.speech.protocol.query.music;

import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MusicQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String b(String str, String str2) {
        return ((a) this.b).b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String c(String str, String str2) {
        return ((a) this.b).c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String d(String str, String str2) {
        return ((a) this.b).d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public String e(String str, String str2) {
        return ((a) this.b).e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int f(String str, String str2) {
        return ((a) this.b).f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean g(String str, String str2) {
        return ((a) this.b).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean h(String str, String str2) {
        return ((a) this.b).m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean i(String str, String str2) {
        int i;
        try {
            i = new JSONObject(str2).optInt(VuiConstants.ELEMENT_TYPE);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        return ((a) this.b).a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean j(String str, String str2) {
        return ((a) this.b).h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean k(String str, String str2) {
        int i;
        try {
            i = new JSONObject(str2).optInt(VuiConstants.ELEMENT_TYPE);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        return ((a) this.b).b(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean l(String str, String str2) {
        return ((a) this.b).l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean m(String str, String str2) {
        return ((a) this.b).i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean n(String str, String str2) {
        return ((a) this.b).j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int o(String str, String str2) {
        return ((a) this.b).k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean p(String str, String str2) {
        return ((a) this.b).n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean q(String str, String str2) {
        return ((a) this.b).o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean r(String str, String str2) {
        return ((a) this.b).p();
    }
}
