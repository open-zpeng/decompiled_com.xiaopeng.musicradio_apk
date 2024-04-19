package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* loaded from: classes.dex */
public class RecommendRadioBean implements Serializable {
    private static final long serialVersionUID = 1;
    @SerializedName("fmId")
    private int mFmId;
    @SerializedName("fmName")
    private String mFmName;
    @SerializedName("fmType")
    private int mFmType;
    @SerializedName("imgUrl")
    private String mImgUrl;

    public int getmFmId() {
        return this.mFmId;
    }

    public void setmFmId(int i) {
        this.mFmId = i;
    }

    public String getmFmName() {
        return this.mFmName;
    }

    public void setmFmName(String str) {
        this.mFmName = str;
    }

    public String getmImgUrl() {
        return this.mImgUrl;
    }

    public void setmImgUrl(String str) {
        this.mImgUrl = str;
    }

    public int getmFmType() {
        return this.mFmType;
    }

    public void setmFmType(int i) {
        this.mFmType = i;
    }
}
