package com.xiaopeng.speech.protocol.query.charge;

import com.xiaopeng.speech.annotation.QueryAnnotation;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ChargeQuery extends bfd<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean b(String str, String str2) {
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
    public boolean f(String str, String str2) {
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
        return ((a) this.b).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean i(String str, String str2) {
        return ((a) this.b).h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean j(String str, String str2) {
        return ((a) this.b).i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean k(String str, String str2) {
        return ((a) this.b).j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int l(String str, String str2) {
        return ((a) this.b).k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int m(String str, String str2) {
        return ((a) this.b).a(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean n(String str, String str2) {
        return ((a) this.b).l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean o(String str, String str2) {
        return ((a) this.b).m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int p(String str, String str2) {
        return ((a) this.b).n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int q(String str, String str2) {
        return ((a) this.b).o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int r(String str, String str2) {
        return ((a) this.b).p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int s(String str, String str2) {
        return ((a) this.b).q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public boolean t(String str, String str2) {
        int i = 1;
        try {
            i = new JSONObject(str2).optInt("mode", 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return ((a) this.b).a(i);
    }
}
