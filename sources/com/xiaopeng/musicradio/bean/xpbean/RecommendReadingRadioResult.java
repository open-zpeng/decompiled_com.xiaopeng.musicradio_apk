package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class RecommendReadingRadioResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<RecommendReadingRadioBean> list;

        public List<RecommendReadingRadioBean> getList() {
            return this.list;
        }

        public void setList(List<RecommendReadingRadioBean> list) {
            this.list = list;
        }
    }
}
