package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class ReCollectLabelsResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<ReMusicTagInfo> list;

        public List<ReMusicTagInfo> getList() {
            return this.list;
        }

        public void setList(List<ReMusicTagInfo> list) {
            this.list = list;
        }
    }
}
