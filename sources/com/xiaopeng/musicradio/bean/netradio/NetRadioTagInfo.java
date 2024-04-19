package com.xiaopeng.musicradio.bean.netradio;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.io.Serializable;
/* loaded from: classes.dex */
public class NetRadioTagInfo implements Serializable {
    private static final long serialVersionUID = 1;
    @SerializedName("bizVal")
    private int mBizVal;
    @SerializedName("code")
    private int mCode;
    @SerializedName("cover")
    private String mCover;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("nightCover")
    private String mNightCover;
    @SerializedName("select")
    private boolean mSelect;
    @SerializedName("sort")
    private int mSort;
    @SerializedName(VuiConstants.ELEMENT_TYPE)
    private int mType;

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public int getBizVal() {
        return this.mBizVal;
    }

    public void setBizVal(int i) {
        this.mBizVal = i;
    }

    public int getType() {
        return this.mType;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public int getCode() {
        return this.mCode;
    }

    public void setCode(int i) {
        this.mCode = i;
    }

    public boolean isSelect() {
        return this.mSelect;
    }

    public void setSelect(boolean z) {
        this.mSelect = z;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public int getSort() {
        return this.mSort;
    }

    public void setSort(int i) {
        this.mSort = i;
    }

    public String getCover() {
        return this.mCover;
    }

    public void setCover(String str) {
        this.mCover = str;
    }

    public String getNightCover() {
        return this.mNightCover;
    }

    public void setNightCover(String str) {
        this.mNightCover = str;
    }

    public boolean equals(Object obj) {
        if (((NetRadioTagInfo) obj).mName.equals(this.mName)) {
            return true;
        }
        return super.equals(obj);
    }
}
