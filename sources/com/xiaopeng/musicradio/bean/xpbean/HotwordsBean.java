package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class HotwordsBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean {
            private String word;

            public String getWord() {
                return this.word;
            }

            public void setWord(String str) {
                this.word = str;
            }

            public String toString() {
                return "ListBean{word='" + this.word + "'}";
            }
        }

        public String toString() {
            return "DataBean{list=" + this.list + '}';
        }
    }

    public String toString() {
        return "HotwordsBean{data=" + this.data + '}';
    }
}
