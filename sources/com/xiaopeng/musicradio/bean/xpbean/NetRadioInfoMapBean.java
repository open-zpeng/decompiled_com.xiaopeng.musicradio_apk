package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import java.util.HashMap;
/* loaded from: classes.dex */
public class NetRadioInfoMapBean extends BaseBean {
    private static final long serialVersionUID = 1;
    private HashMap<String, NetRadioInfo> data;

    public HashMap<String, NetRadioInfo> getData() {
        return this.data;
    }

    public void setData(HashMap<String, NetRadioInfo> hashMap) {
        this.data = hashMap;
    }
}
