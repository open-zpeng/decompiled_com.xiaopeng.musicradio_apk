package com.xiaopeng.musicradio.bean.db;

import com.google.gson.annotations.Expose;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class ReissueInfo {
    public static final int REISSUE_TYPE_QQ = 1;
    public static final int REISSUE_TYPE_USER = 0;
    public static final int REISSUE_TYPE_XMLY = 2;
    @Expose(deserialize = false, serialize = false)
    private List<ReissueInfo> mergeList;
    private String objectId;
    private int reissueType;
    private String type;
    private String url;
    private String value;

    public ReissueInfo() {
        this.reissueType = 0;
    }

    public ReissueInfo(String str, String str2, String str3, String str4, int i) {
        this.reissueType = 0;
        this.objectId = str;
        this.url = str2;
        this.value = str3;
        this.type = str4;
        this.reissueType = i;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public int getReissueType() {
        return this.reissueType;
    }

    public void setReissueType(int i) {
        this.reissueType = i;
    }

    public List<ReissueInfo> getMergeList() {
        return this.mergeList;
    }

    public void setMergeList(List<ReissueInfo> list) {
        this.mergeList = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.objectId, ((ReissueInfo) obj).objectId);
    }

    public int hashCode() {
        return Objects.hash(this.objectId);
    }

    public String toString() {
        return "ReissueInfo{objectId='" + this.objectId + "', url='" + this.url + "', value='" + this.value + "', type='" + this.type + "', reissueType=" + this.reissueType + '}';
    }
}
