package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class RecommendRadioResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 1;
        private List<RecommendRadioBean> list;

        public List<RecommendRadioBean> getList() {
            return this.list;
        }

        public void setList(List<RecommendRadioBean> list) {
            this.list = list;
        }
    }
}
