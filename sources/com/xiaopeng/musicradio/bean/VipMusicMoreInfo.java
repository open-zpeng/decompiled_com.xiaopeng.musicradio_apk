package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class VipMusicMoreInfo extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private long id;
        private List<ModuleBean> moduleList;
        private String name;
        private String nightPicUrl;
        private String picUrl;

        public long getId() {
            return this.id;
        }

        public void setId(long j) {
            this.id = j;
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

        public String getNightPicUrl() {
            return this.nightPicUrl;
        }

        public void setNightPicUrl(String str) {
            this.nightPicUrl = str;
        }

        public List<ModuleBean> getModuleList() {
            return this.moduleList;
        }

        public void setModuleList(List<ModuleBean> list) {
            this.moduleList = list;
        }

        public String toString() {
            return "DataBean{id=" + this.id + ", name='" + this.name + "', picUrl='" + this.picUrl + "', nightPicUrl='" + this.nightPicUrl + "', moduleList=" + this.moduleList + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class ModuleBean implements Serializable {
        private List<ModuleBean> childList = new ArrayList();
        private CollectInfo collectInfo;
        private int isShowAll;
        private long moduleId;
        private String name;
        private int type;
        private long zoneId;

        public long getZoneId() {
            return this.zoneId;
        }

        public void setZoneId(long j) {
            this.zoneId = j;
        }

        public long getModuleId() {
            return this.moduleId;
        }

        public void setModuleId(long j) {
            this.moduleId = j;
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

        public int getIsShowAll() {
            return this.isShowAll;
        }

        public void setIsShowAll(int i) {
            this.isShowAll = i;
        }

        public CollectInfo getCollectInfo() {
            return this.collectInfo;
        }

        public void setCollectInfo(CollectInfo collectInfo) {
            this.collectInfo = collectInfo;
        }

        public List<ModuleBean> getChildList() {
            return this.childList;
        }

        public void setChildList(List<ModuleBean> list) {
            this.childList = list;
        }

        public String toString() {
            return "ModuleBean{zoneId=" + this.zoneId + ", moduleId=" + this.moduleId + ", name='" + this.name + "', type=" + this.type + ", isShowAll=" + this.isShowAll + ", collectInfo=" + this.collectInfo + ", childList=" + this.childList + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class CollectInfo implements Serializable {
        private List<CollectBean> collectList = new ArrayList();
        private int collectSize;

        public int getCollectSize() {
            return this.collectSize;
        }

        public void setCollectSize(int i) {
            this.collectSize = i;
        }

        public List<CollectBean> getCollectList() {
            return this.collectList;
        }

        public void setCollectList(List<CollectBean> list) {
            this.collectList = list;
        }

        public String toString() {
            return "CollectInfo{collectSize=" + this.collectSize + ", collectList=" + this.collectList + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class CollectBean implements Serializable {
        private MusicRadioItem collect;
        private int isLock;

        public MusicRadioItem getCollect() {
            return this.collect;
        }

        public void setCollect(MusicRadioItem musicRadioItem) {
            this.collect = musicRadioItem;
        }

        public int isLock() {
            return this.isLock;
        }

        public void setLock(int i) {
            this.isLock = i;
        }
    }
}
