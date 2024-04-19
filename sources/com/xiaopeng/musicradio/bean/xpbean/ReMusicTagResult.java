package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class ReMusicTagResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<ReMusicTagGroup> list;

        public List<ReMusicTagGroup> getList() {
            return this.list;
        }

        public void setList(List<ReMusicTagGroup> list) {
            this.list = list;
        }
    }
}
