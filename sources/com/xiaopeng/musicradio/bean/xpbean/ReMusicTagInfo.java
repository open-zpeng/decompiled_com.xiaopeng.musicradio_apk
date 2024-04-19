package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ReMusicTagInfo implements Serializable {
    private static final long serialVersionUID = 44;
    private String id;
    private String name;
    private boolean select;
    private int type = 1;
    private int sort = 1;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean isSelect() {
        return this.select;
    }

    public void setSelect(boolean z) {
        this.select = z;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getSort() {
        return this.sort;
    }

    public void setSort(int i) {
        this.sort = i;
    }

    public boolean equals(Object obj) {
        ReMusicTagInfo reMusicTagInfo = (ReMusicTagInfo) obj;
        if (reMusicTagInfo.id.equals(this.id) && reMusicTagInfo.name.equals(this.name)) {
            return true;
        }
        return super.equals(obj);
    }

    public String toString() {
        return "ReMusicTagInfo{id='" + this.id + "', name='" + this.name + "', select=" + this.select + ", type=" + this.type + ", sort=" + this.sort + '}';
    }
}
