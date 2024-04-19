package com.xiaopeng.speech.protocol.node.camera;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.protocol.bean.c;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class CameraNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void c(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void d(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c(z);
            }
        }
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
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void g(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void h(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void i(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void j(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void k(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void l(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void m(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void n(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void o(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void p(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void q(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void r(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).e(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void s(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void t(String str, String str2) {
        c a = c.a(str2);
        Object[] a2 = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a2 != null) {
            for (Object obj : a2) {
                ((a) obj).a(a, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void u(String str, String str2) {
        c a = c.a(str2);
        Object[] a2 = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a2 != null) {
            for (Object obj : a2) {
                ((a) obj).b(a, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void v(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).f(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void w(String str, String str2) {
        Object[] a = this.b.a();
        boolean z = true;
        try {
            z = new JSONObject(str2).optBoolean("isTTS", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).g(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void x(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void y(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void z(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void A(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void B(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void C(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).r();
            }
        }
    }
}
