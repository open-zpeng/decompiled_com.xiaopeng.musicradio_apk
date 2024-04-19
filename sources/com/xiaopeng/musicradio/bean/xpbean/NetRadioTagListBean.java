package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import java.util.List;
/* loaded from: classes.dex */
public class NetRadioTagListBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<NetRadioTagInfo> list;

        public List<NetRadioTagInfo> getList() {
            return this.list;
        }

        public void setList(List<NetRadioTagInfo> list) {
            this.list = list;
        }
    }
}
