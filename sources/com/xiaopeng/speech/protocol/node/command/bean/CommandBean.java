package com.xiaopeng.speech.protocol.node.command.bean;

import com.xiaopeng.speech.common.bean.BaseBean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class CommandBean extends BaseBean {
    private String json;
    private String packagename;

    public static CommandBean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            CommandBean commandBean = new CommandBean();
            commandBean.b(jSONObject.optString("packagename"));
            commandBean.c(jSONObject.optString("json"));
            return commandBean;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void b(String str) {
        this.packagename = str;
    }

    public void c(String str) {
        this.json = str;
    }

    public String toString() {
        return "CommandBean{packagename='" + this.packagename + "', json='" + this.json + "'}";
    }
}
