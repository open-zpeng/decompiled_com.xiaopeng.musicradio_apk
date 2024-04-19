package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class RecommendRadioResultV2 extends BaseBean {
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
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            private static final long serialVersionUID = 1;
            private List<RecommendRadioBeanV2> list;
            private int type;

            public int getType() {
                return this.type;
            }

            public void setType(int i) {
                this.type = i;
            }

            public List<RecommendRadioBeanV2> getList() {
                return this.list;
            }

            public void setList(List<RecommendRadioBeanV2> list) {
                this.list = list;
            }
        }
    }
}
