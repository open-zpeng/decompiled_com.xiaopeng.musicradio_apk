package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class HotRadioResult extends BaseBean {
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
            private int listenNum;
            private int radioId;
            private String radioName;
            private String radioPic;

            public int getListenNum() {
                return this.listenNum;
            }

            public void setListenNum(int i) {
                this.listenNum = i;
            }

            public int getRadioId() {
                return this.radioId;
            }

            public void setRadioId(int i) {
                this.radioId = i;
            }

            public String getRadioName() {
                return this.radioName;
            }

            public void setRadioName(String str) {
                this.radioName = str;
            }

            public String getRadioPic() {
                return this.radioPic;
            }

            public void setRadioPic(String str) {
                this.radioPic = str;
            }
        }
    }
}
