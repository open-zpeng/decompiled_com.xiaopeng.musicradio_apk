package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class NetRadioInfoListBean extends BaseBean {
    private static final long serialVersionUID = 1;
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
        private List<NetRadioInfo> list;
        private PageBean page;
        private boolean usingProvinceRadio;

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public List<NetRadioInfo> getList() {
            return this.list;
        }

        public void setList(List<NetRadioInfo> list) {
            this.list = list;
        }

        public boolean isUsingProvinceRadio() {
            return this.usingProvinceRadio;
        }

        public void setUsingProvinceRadio(boolean z) {
            this.usingProvinceRadio = z;
        }

        /* loaded from: classes.dex */
        public static class PageBean implements Serializable {
            private static final long serialVersionUID = 1;
            private int page;
            private int pageSize;
            private int total;
            private int totalPage;

            public int getTotal() {
                return this.total;
            }

            public void setTotal(int i) {
                this.total = i;
            }

            public int getTotalPage() {
                return this.totalPage;
            }

            public void setTotalPage(int i) {
                this.totalPage = i;
            }

            public int getPage() {
                return this.page;
            }

            public void setPage(int i) {
                this.page = i;
            }

            public int getPageSize() {
                return this.pageSize;
            }

            public void setPageSize(int i) {
                this.pageSize = i;
            }
        }
    }
}
