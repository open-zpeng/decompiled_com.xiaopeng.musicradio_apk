package com.xiaopeng.speech.protocol.node.changba.bean;

import com.xiaopeng.speech.common.bean.BaseBean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ChangbaBean extends BaseBean {
    private String artist;
    private String song;

    public static ChangbaBean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ChangbaBean changbaBean = new ChangbaBean();
            changbaBean.b(jSONObject.optString("artist"));
            changbaBean.c(jSONObject.optString("song"));
            return changbaBean;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void b(String str) {
        this.artist = str;
    }

    public void c(String str) {
        this.song = str;
    }

    public String toString() {
        return "ChangbaBean{artist='" + this.artist + "', song='" + this.song + "'}";
    }
}
