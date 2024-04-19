package com.xiaopeng.musicradio.datalist;

import java.io.Serializable;
import java.util.Objects;
/* compiled from: ListItem.java */
/* loaded from: classes.dex */
public class o implements Serializable {
    public static final int FLAG_FIRST = 0;
    public static final int FLAG_LAST = 1;
    public static final int FLAG_NORMAL = -1;
    private Object mData;
    private int mFlag;
    private int mIndexOfType;
    private Object mTag;
    private int mType;

    public int a() {
        return this.mType;
    }

    public Object b() {
        return this.mData;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.mType == oVar.mType && (obj2 = this.mData) != null && obj2.equals(oVar.mData);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mData);
    }
}
