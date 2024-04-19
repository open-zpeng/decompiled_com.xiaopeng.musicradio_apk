package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class SingerType implements Serializable {
    private static final long serialVersionUID = 1;
    private String areaCode;
    private String areaName;
    private String typeCode;
    private String typeName;

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String str) {
        this.typeName = str;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setTypeCode(String str) {
        this.typeCode = str;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String str) {
        this.areaName = str;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String str) {
        this.areaCode = str;
    }
}
