package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import java.util.List;
/* loaded from: classes.dex */
public class NetCollectListBean extends BaseBean {
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
        private PageBean page;

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class PageBean {
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

        /* loaded from: classes.dex */
        public static class ListBean {
            private String bizId;
            private long createTime;
            private NetRadioInfo radioDto;
            private int uid;

            public int getUid() {
                return this.uid;
            }

            public void setUid(int i) {
                this.uid = i;
            }

            public String getBizId() {
                return this.bizId;
            }

            public void setBizId(String str) {
                this.bizId = str;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public void setCreateTime(long j) {
                this.createTime = j;
            }

            public NetRadioInfo getRadioDto() {
                return this.radioDto;
            }

            public void setRadioDto(NetRadioInfo netRadioInfo) {
                this.radioDto = netRadioInfo;
            }
        }
    }
}
