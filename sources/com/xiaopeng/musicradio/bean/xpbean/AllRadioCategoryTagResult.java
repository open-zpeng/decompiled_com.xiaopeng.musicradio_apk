package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.netradio.NetRadioTagGroup;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class AllRadioCategoryTagResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<NetRadioTagGroup> list;

        public List<NetRadioTagGroup> getList() {
            return this.list;
        }

        public void setList(List<NetRadioTagGroup> list) {
            this.list = list;
        }
    }
}
