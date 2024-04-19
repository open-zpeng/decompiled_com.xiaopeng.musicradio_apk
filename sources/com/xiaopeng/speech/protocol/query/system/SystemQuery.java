package com.xiaopeng.speech.protocol.query.system;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.xiaopeng.speech.annotation.QueryAnnotation;
import com.xiaopeng.speech.protocol.bean.stats.SceneSwitchStatisticsBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SystemQuery extends bfd<a> {
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
        String str3 = "3";
        try {
            str3 = new JSONObject(str2).optString("stream_type", "3");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        a aVar = (a) this.b;
        if (!bhb.a(str3)) {
            str3 = "3";
        }
        return aVar.a(Integer.valueOf(str3).intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int i(String str, String str2) {
        String str3 = "3";
        try {
            str3 = new JSONObject(str2).optString("stream_type", "3");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        a aVar = (a) this.b;
        if (!bhb.a(str3)) {
            str3 = "3";
        }
        return aVar.b(Integer.valueOf(str3).intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int j(String str, String str2) {
        String str3 = "3";
        try {
            str3 = new JSONObject(str2).optString("stream_type", "3");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        a aVar = (a) this.b;
        if (!bhb.a(str3)) {
            str3 = "3";
        }
        return aVar.c(Integer.valueOf(str3).intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int k(String str, String str2) {
        return ((a) this.b).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int l(String str, String str2) {
        return ((a) this.b).a(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int m(String str, String str2) {
        return ((a) this.b).h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int n(String str, String str2) {
        return ((a) this.b).i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int o(String str, String str2) {
        int i;
        try {
            i = new JSONObject(str2).optInt("mode");
        } catch (JSONException e) {
            e.printStackTrace();
            i = 2;
        }
        return ((a) this.b).d(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int p(String str, String str2) {
        int i;
        try {
            i = new JSONObject(str2).optInt(TtmlNode.TAG_STYLE);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        return ((a) this.b).e(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int q(String str, String str2) {
        return ((a) this.b).l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int r(String str, String str2) {
        int i;
        try {
            i = new JSONObject(str2).optInt(SceneSwitchStatisticsBean.NAME_SCENE);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 1;
        }
        return ((a) this.b).f(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int s(String str, String str2) {
        return ((a) this.b).n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int t(String str, String str2) {
        return ((a) this.b).m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int u(String str, String str2) {
        return ((a) this.b).k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int v(String str, String str2) {
        int i;
        try {
            i = new JSONObject(str2).optInt(VuiConstants.EVENT_VALUE_DIRECTION);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 1;
        }
        return ((a) this.b).g(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int w(String str, String str2) {
        return ((a) this.b).o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int x(String str, String str2) {
        return ((a) this.b).p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int y(String str, String str2) {
        return ((a) this.b).j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @QueryAnnotation
    public int z(String str, String str2) {
        return ((a) this.b).q();
    }
}
