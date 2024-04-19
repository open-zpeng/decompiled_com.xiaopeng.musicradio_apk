package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class NetScheduleListBean extends BaseBean {
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
        public static class PageBean implements Serializable {
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
        public static class ListBean implements Serializable {
            private String backPlayUrl;
            private String endTime;
            private String kind;
            private int radioId;
            private RelatedProgramBean relatedProgram;
            private String startTime;

            public int getRadioId() {
                return this.radioId;
            }

            public void setRadioId(int i) {
                this.radioId = i;
            }

            public String getStartTime() {
                return this.startTime;
            }

            public void setStartTime(String str) {
                this.startTime = str;
            }

            public String getEndTime() {
                return this.endTime;
            }

            public void setEndTime(String str) {
                this.endTime = str;
            }

            public String getKind() {
                return this.kind;
            }

            public void setKind(String str) {
                this.kind = str;
            }

            public String getBackPlayUrl() {
                return this.backPlayUrl;
            }

            public void setBackPlayUrl(String str) {
                this.backPlayUrl = str;
            }

            public RelatedProgramBean getRelatedProgram() {
                return this.relatedProgram;
            }

            public void setRelatedProgram(RelatedProgramBean relatedProgramBean) {
                this.relatedProgram = relatedProgramBean;
            }

            /* loaded from: classes.dex */
            public static class RelatedProgramBean implements Serializable {
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
}
