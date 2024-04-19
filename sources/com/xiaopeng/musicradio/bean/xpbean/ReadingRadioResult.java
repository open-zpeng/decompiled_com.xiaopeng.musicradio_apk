package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class ReadingRadioResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 5;
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            private static final long serialVersionUID = 9;
            private String group;
            private List<RecommendReadingRadioBean> list;

            public String getGroup() {
                return this.group;
            }

            public void setGroup(String str) {
                this.group = str;
            }

            public List<RecommendReadingRadioBean> getList() {
                return this.list;
            }

            public void setList(List<RecommendReadingRadioBean> list) {
                this.list = list;
            }
        }
    }
}
