package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class ReadingCategoryListBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            private int id;
            private String name;

            public int getId() {
                return this.id;
            }

            public void setId(int i) {
                this.id = i;
            }

            public String getName() {
                return this.name;
            }

            public void setName(String str) {
                this.name = str;
            }
        }
    }
}
