package com.xiaopeng.speech.protocol.node.phone.bean;

import android.text.TextUtils;
import com.xiaopeng.speech.common.bean.BaseBean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PhoneBean extends BaseBean {
    private String address;
    private String id;
    private String name;
    private String number;

    public String a() {
        return this.id;
    }

    public void a(String str) {
        this.id = str;
    }

    public static PhoneBean b(String str) {
        PhoneBean phoneBean = new PhoneBean();
        try {
            JSONObject jSONObject = new JSONObject(str);
            phoneBean.name = jSONObject.optString("联系人");
            if (TextUtils.isEmpty(phoneBean.name)) {
                phoneBean.name = jSONObject.optString("任意联系人");
            }
            phoneBean.number = jSONObject.optString("号码");
            phoneBean.address = jSONObject.optString("归属地");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return phoneBean;
    }

    public String b() {
        return this.name;
    }

    public void c(String str) {
        this.name = str;
    }

    public String c() {
        return this.number;
    }

    public void d(String str) {
        this.number = str;
    }
}
