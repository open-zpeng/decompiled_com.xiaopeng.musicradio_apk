package com.xiaopeng.musicradio.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.speech.common.util.DontProguardClass;
@DontProguardClass
/* loaded from: classes.dex */
public class CollectRadioBean {
    @SerializedName("radioId")
    private String radioId;

    public CollectRadioBean() {
    }

    public CollectRadioBean(String str) {
        this.radioId = str;
    }

    public String getRadioId() {
        return this.radioId;
    }

    public void setRadioId(String str) {
        this.radioId = str;
    }
}
