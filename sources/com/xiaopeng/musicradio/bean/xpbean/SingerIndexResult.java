package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class SingerIndexResult extends BaseBean {
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
        private List<SingerType> singerAreaBoList;
        private List<SingerType> singerTypeBoList;

        public List<SingerType> getSingerTypeBoList() {
            return this.singerTypeBoList;
        }

        public void setSingerTypeBoList(List<SingerType> list) {
            this.singerTypeBoList = list;
        }

        public List<SingerType> getSingerAreaBoList() {
            return this.singerAreaBoList;
        }

        public void setSingerAreaBoList(List<SingerType> list) {
            this.singerAreaBoList = list;
        }
    }
}
