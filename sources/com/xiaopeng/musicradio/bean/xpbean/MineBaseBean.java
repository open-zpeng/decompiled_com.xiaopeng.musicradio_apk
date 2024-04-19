package com.xiaopeng.musicradio.bean.xpbean;
/* loaded from: classes.dex */
public class MineBaseBean extends BaseBean {
    private int data;

    public MineBaseBean(int i, String str) {
        setCode(i);
        setMsg(str);
    }

    public int getData() {
        return this.data;
    }

    public void setData(int i) {
        this.data = i;
    }
}
