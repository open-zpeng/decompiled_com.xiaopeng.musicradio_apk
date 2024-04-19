package com.xiaopeng.speech.protocol.node.context;

import android.text.TextUtils;
import com.lzy.okgo.cookie.SerializableCookie;
import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.protocol.bean.d;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ContextNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void c(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void d(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void e(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void f(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).e(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void g(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).f(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void h(String str, String str2) {
        Object[] a;
        try {
            d a2 = d.a(new JSONObject(str2));
            if (a2 == null || (a = this.b.a()) == null) {
                return;
            }
            for (Object obj : a) {
                ((a) obj).a(a2.a, a2.b);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void i(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).g(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void j(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).h(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void k(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).i(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void l(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).j(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void m(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).k(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void n(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).l(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void o(String str, String str2) {
        Object[] a;
        try {
            d a2 = d.a(new JSONObject(str2));
            if (a2 == null || (a = this.b.a()) == null) {
                return;
            }
            for (Object obj : a) {
                c.b("onWidgetScroll", "onWidgetScroll data:" + str2);
                ((a) obj).b(a2.a, a2.b);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void p(String str, String str2) {
        Object[] a;
        try {
            d a2 = d.a(new JSONObject(str2));
            if (a2 == null || (a = this.b.a()) == null) {
                return;
            }
            for (int i = 0; i < a.length; i++) {
                c.b("onWidgetListSelect", "onWidgetListSelect data:" + str2);
                if (TextUtils.isEmpty(a2.c)) {
                    ((a) a[i]).c(a2.a, a2.b);
                } else {
                    ((a) a[i]).a(a2.a, a2.b, a2.c);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void q(String str, String str2) {
        try {
            Object[] a = this.b.a();
            if (a != null) {
                for (Object obj : a) {
                    String str3 = null;
                    String str4 = "force";
                    if (str2 != null) {
                        JSONObject jSONObject = new JSONObject(str2);
                        String optString = jSONObject.optString("widgetId");
                        str4 = jSONObject.optString("cancel");
                        str3 = optString;
                    }
                    ((a) obj).a(str3, str4);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void r(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void s(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void t(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void u(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void v(String str, String str2) {
        Object[] a;
        try {
            d a2 = d.a(new JSONObject(str2));
            if (a2 == null || (a = this.b.a()) == null) {
                return;
            }
            for (Object obj : a) {
                ((a) obj).d(a2.a, a2.b);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void w(String str, String str2) {
        String str3;
        try {
            Object[] a = this.b.a();
            String str4 = "";
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject(str2);
                str3 = jSONObject.optString(SerializableCookie.DOMAIN);
                str4 = jSONObject.optString("scriptId");
            } else {
                str3 = "";
            }
            if (a == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return;
            }
            for (Object obj : a) {
                ((a) obj).b(str3, str4);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void x(String str, String str2) {
        String str3;
        try {
            Object[] a = this.b.a();
            String str4 = "";
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject(str2);
                str3 = jSONObject.optString("status");
                str4 = jSONObject.optString("scriptId");
            } else {
                str3 = "";
            }
            if (a == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return;
            }
            for (Object obj : a) {
                ((a) obj).c(str4, str3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void y(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void z(String str, String str2) {
        try {
            Object[] a = this.b.a();
            if (a == null || str2 == null) {
                return;
            }
            d a2 = d.a(new JSONObject(str2));
            for (Object obj : a) {
                ((a) obj).d(a2.a, a2.c);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void A(String str, String str2) {
        try {
            Object[] a = this.b.a();
            if (a == null || str2 == null) {
                return;
            }
            d a2 = d.a(new JSONObject(str2));
            for (Object obj : a) {
                ((a) obj).e(a2.a, a2.c);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void B(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).f();
            }
        }
    }
}
