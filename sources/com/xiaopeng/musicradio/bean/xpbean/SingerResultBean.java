package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class SingerResultBean extends BaseBean {
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
        private List<ArtistGroupsBean> artistGroups;

        public List<ArtistGroupsBean> getArtistGroups() {
            return this.artistGroups;
        }

        public void setArtistGroups(List<ArtistGroupsBean> list) {
            this.artistGroups = list;
        }

        /* loaded from: classes.dex */
        public static class ArtistGroupsBean implements Serializable {
            private static final long serialVersionUID = 1;
            private List<ListBean> list;
            private String title;

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public List<ListBean> getList() {
                return this.list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            /* loaded from: classes.dex */
            public static class ListBean implements Serializable {
                private static final long serialVersionUID = 1;
                private long id;
                private String logo;
                private String name;
                private int position;

                public long getId() {
                    return this.id;
                }

                public void setId(long j) {
                    this.id = j;
                }

                public String getLogo() {
                    return this.logo;
                }

                public void setLogo(String str) {
                    this.logo = str;
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String str) {
                    this.name = str;
                }

                public int getPosition() {
                    return this.position;
                }

                public void setPosition(int i) {
                    this.position = i;
                }
            }
        }
    }
}
