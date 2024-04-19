package com.xiaopeng.speech.protocol.node.message.bean;

import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.common.bean.BaseBean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class IndexBean extends BaseBean {
    private int index;

    public static final IndexBean a(String str) {
        IndexBean indexBean = new IndexBean();
        try {
            indexBean.index = new JSONObject(str).optInt(Constants.INDEX);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return indexBean;
    }

    public int a() {
        return this.index;
    }

    public String toString() {
        return "IndexBean{index='" + this.index + "'}";
    }
}
