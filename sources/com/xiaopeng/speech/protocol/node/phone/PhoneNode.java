package com.xiaopeng.speech.protocol.node.phone;

import android.text.TextUtils;
import com.xiaopeng.speech.actorapi.ResultActor;
import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.common.bean.Value;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.protocol.node.phone.bean.PhoneBean;
import com.xiaopeng.speech.protocol.node.phone.bean.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PhoneNode extends bfc<a> {
    private volatile String d;
    private volatile String e;
    private List<PhoneBean> f;
    private volatile int g;

    @SpeechAnnotation
    public void b(String str, String str2) {
        Value a = bfb.b().h().a("phone.get.bluetooth.status", (String) null);
        Value a2 = bfb.b().h().a("phone.get.contact.sync.status", (String) null);
        bhr bhrVar = new bhr();
        bhrVar.a("联系人");
        bhrVar.b(SkillStatisticsBean.PAGE_PHONE);
        bhrVar.b("deviceId", this.d);
        if (a != null) {
            bhrVar.b("phone_bluetooth", String.valueOf(a.a()));
        }
        if (a2 != null) {
            bhrVar.b("phone_sync", String.valueOf(a2.b()));
        }
        bfb.b().c().a(new ResultActor("native://phone.query.bluetooth.sync").a(bhrVar));
    }

    @SpeechAnnotation
    public void c(String str, String str2) {
        PhoneBean b = PhoneBean.b(str2);
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str, b);
            }
        }
    }

    @SpeechAnnotation
    public void d(String str, String str2) {
        JSONArray optJSONArray;
        try {
            this.e = str2;
            JSONObject jSONObject = new JSONObject(str2);
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("content") && (optJSONArray = jSONObject.optJSONArray("content")) != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        a.C0184a c0184a = new a.C0184a();
                        c0184a.c(optJSONObject.optString("title"));
                        if (optJSONObject.has("subTitle") && !TextUtils.isEmpty(optJSONObject.optString("subTitle"))) {
                            c0184a.a(optJSONObject.optString("subTitle"));
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("extra");
                        if (optJSONObject2 != null) {
                            c0184a.b(optJSONObject2.optString("id"));
                        }
                        arrayList.add(c0184a);
                    }
                }
            }
            Object[] a = this.b.a();
            if (a != null) {
                for (Object obj : a) {
                    ((a) obj).a(arrayList);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    @com.xiaopeng.speech.annotation.SpeechAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r7 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3b
            r0.<init>(r8)     // Catch: org.json.JSONException -> L3b
            java.lang.String r8 = "phone"
            java.lang.String r8 = r0.optString(r8)     // Catch: org.json.JSONException -> L3b
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: org.json.JSONException -> L3b
            if (r1 != 0) goto L17
            com.xiaopeng.speech.protocol.node.phone.bean.PhoneBean r7 = com.xiaopeng.speech.protocol.node.phone.bean.PhoneBean.b(r8)     // Catch: org.json.JSONException -> L3b
            goto L43
        L17:
            com.xiaopeng.speech.protocol.node.phone.bean.PhoneBean r8 = new com.xiaopeng.speech.protocol.node.phone.bean.PhoneBean     // Catch: org.json.JSONException -> L3b
            r8.<init>()     // Catch: org.json.JSONException -> L3b
            java.lang.String r7 = "name"
            java.lang.String r7 = r0.optString(r7)     // Catch: org.json.JSONException -> L39
            r8.c(r7)     // Catch: org.json.JSONException -> L39
            java.lang.String r7 = "number"
            java.lang.String r7 = r0.optString(r7)     // Catch: org.json.JSONException -> L39
            r8.d(r7)     // Catch: org.json.JSONException -> L39
            java.lang.String r7 = "id"
            java.lang.String r7 = r0.optString(r7)     // Catch: org.json.JSONException -> L39
            r8.a(r7)     // Catch: org.json.JSONException -> L39
            r7 = r8
            goto L43
        L39:
            r7 = move-exception
            goto L3f
        L3b:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L3f:
            r7.printStackTrace()
            r7 = r8
        L43:
            if (r7 != 0) goto L4b
            java.lang.String r7 = "phoneBean == null"
            com.xiaopeng.speech.common.util.c.c(r6, r7)
            return
        L4b:
            com.xiaopeng.speech.common.util.d<T> r8 = r6.b
            java.lang.Object[] r8 = r8.a()
            if (r8 == 0) goto L6d
            r0 = 0
        L54:
            int r1 = r8.length
            if (r0 >= r1) goto L6d
            r1 = r8[r0]
            com.xiaopeng.speech.protocol.node.phone.a r1 = (com.xiaopeng.speech.protocol.node.phone.a) r1
            java.lang.String r2 = r7.b()
            java.lang.String r3 = r7.c()
            java.lang.String r4 = r7.a()
            r1.a(r2, r3, r4)
            int r0 = r0 + 1
            goto L54
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.speech.protocol.node.phone.PhoneNode.e(java.lang.String, java.lang.String):void");
    }

    @SpeechAnnotation
    public void f(String str, String str2) {
        PhoneBean phoneBean;
        int optInt;
        try {
            optInt = new JSONObject(str2).optInt("select_num");
        } catch (JSONException e) {
            e.printStackTrace();
            phoneBean = null;
        }
        if (this.f != null && this.f.size() > 0) {
            if (optInt > 0 && optInt <= this.f.size()) {
                phoneBean = this.f.get(optInt - 1);
                if (phoneBean == null) {
                    c.c(this, "phoneBean == null");
                    return;
                }
                Object[] a = this.b.a();
                if (a != null) {
                    for (Object obj : a) {
                        ((a) obj).a(phoneBean.b(), phoneBean.c(), phoneBean.a());
                        bfb.b().d().c("好的，正在呼叫 " + phoneBean.b());
                    }
                    return;
                }
                return;
            }
            bfb.b().d().c("您的选择已经超出当前列表范围了哦");
            c.c(this, "select_num is  == " + optInt);
            return;
        }
        c.c(this, "phoneBeanList == null");
    }

    @SpeechAnnotation
    public void g(String str, String str2) {
        bfb.b().g().b(true);
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).e();
            }
        }
    }

    @SpeechAnnotation
    public void h(String str, String str2) {
        bfb.b().g().b(true);
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).f();
            }
        }
    }

    @SpeechAnnotation
    public void i(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a();
            }
        }
    }

    @SpeechAnnotation
    public void j(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b();
            }
        }
    }

    @SpeechAnnotation
    public void k(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c();
            }
        }
    }

    @SpeechAnnotation
    public void l(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d();
            }
        }
    }

    @SpeechAnnotation
    public void m(String str, String str2) {
        String str3 = "";
        try {
            str3 = new JSONObject(str2).optString("number");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str3);
            }
        }
    }

    @SpeechAnnotation
    public void n(String str, String str2) {
        String str3 = "";
        try {
            str3 = new JSONObject(str2).optString("number");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b(str3);
            }
        }
    }

    @SpeechAnnotation
    public void o(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).g();
            }
        }
    }

    @SpeechAnnotation
    public void p(String str, String str2) {
        Object[] a = this.b.a();
        this.g = Integer.valueOf(str2).intValue();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(this.g);
            }
        }
    }
}
