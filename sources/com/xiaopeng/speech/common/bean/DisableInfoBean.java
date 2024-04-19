package com.xiaopeng.speech.common.bean;

import android.os.IBinder;
/* loaded from: classes2.dex */
public class DisableInfoBean extends BaseBean {
    private IBinder binder;
    private String byWho;
    private String info;
    private int notifyType;
    private int type;

    public DisableInfoBean(IBinder iBinder, int i, String str, String str2, int i2) {
        this.binder = iBinder;
        this.type = i;
        this.byWho = str;
        this.info = str2;
        this.notifyType = i2;
    }

    public IBinder a() {
        return this.binder;
    }

    public int b() {
        return this.type;
    }

    public String c() {
        return this.byWho;
    }

    public String d() {
        return this.info;
    }

    public int e() {
        return this.notifyType;
    }

    public String toString() {
        return "DisableInfoBean{binder=" + this.binder + ", type=" + this.type + ", byWho='" + this.byWho + "', info='" + this.info + "', notifyType=" + this.notifyType + '}';
    }
}
