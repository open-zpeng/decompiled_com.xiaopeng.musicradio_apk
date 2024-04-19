package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class VipMusicMainZoneResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 11;
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            private static final long serialVersionUID = 12;
            private int id;
            private int mPosition;
            private List<ModuleListBean> moduleList;
            private String name;
            private String picUrl;

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

            public String getPicUrl() {
                return this.picUrl;
            }

            public void setPicUrl(String str) {
                this.picUrl = str;
            }

            public List<ModuleListBean> getModuleList() {
                return this.moduleList;
            }

            public void setModuleList(List<ModuleListBean> list) {
                this.moduleList = list;
            }

            public int getPosition() {
                return this.mPosition;
            }

            public void setPosition(int i) {
                this.mPosition = i;
            }

            /* loaded from: classes.dex */
            public static class ModuleListBean implements Serializable {
                private static final long serialVersionUID = 13;
                private CollectInfoBean collectInfo;
                private int moduleId;
                private String name;
                private int type;
                private int zoneId;

                public int getZoneId() {
                    return this.zoneId;
                }

                public void setZoneId(int i) {
                    this.zoneId = i;
                }

                public int getModuleId() {
                    return this.moduleId;
                }

                public void setModuleId(int i) {
                    this.moduleId = i;
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String str) {
                    this.name = str;
                }

                public int getType() {
                    return this.type;
                }

                public void setType(int i) {
                    this.type = i;
                }

                public CollectInfoBean getCollectInfo() {
                    return this.collectInfo;
                }

                public void setCollectInfo(CollectInfoBean collectInfoBean) {
                    this.collectInfo = collectInfoBean;
                }

                /* loaded from: classes.dex */
                public static class CollectInfoBean implements Serializable {
                    private static final long serialVersionUID = 14;
                    private List<CollectListBean> collectList;
                    private int collectSize;

                    public int getCollectSize() {
                        return this.collectSize;
                    }

                    public void setCollectSize(int i) {
                        this.collectSize = i;
                    }

                    public List<CollectListBean> getCollectList() {
                        return this.collectList;
                    }

                    public void setCollectList(List<CollectListBean> list) {
                        this.collectList = list;
                    }

                    /* loaded from: classes.dex */
                    public static class CollectListBean implements Serializable {
                        private static final long serialVersionUID = 15;
                        private MusicRadioItem collect;
                        private int isLock;

                        public MusicRadioItem getCollect() {
                            return this.collect;
                        }

                        public void setCollect(MusicRadioItem musicRadioItem) {
                            this.collect = musicRadioItem;
                        }

                        public int getIsLock() {
                            return this.isLock;
                        }

                        public void setIsLock(int i) {
                            this.isLock = i;
                        }
                    }
                }
            }
        }
    }
}
