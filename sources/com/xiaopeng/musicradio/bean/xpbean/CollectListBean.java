package com.xiaopeng.musicradio.bean.xpbean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class CollectListBean extends BaseBean {
    public List<DataBean> data;

    public List<DataBean> getData() {
        return this.data;
    }

    public void setData(List<DataBean> list) {
        this.data = list;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private int collectType;
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public int getCollectType() {
            return this.collectType;
        }

        public void setCollectType(int i) {
            this.collectType = i;
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            public long createTime;
            public String creatorName;
            public String creatorPic;
            public String description;
            public long favNum;
            public long id;
            public long listenNum;
            public String logo;
            public long modifyTime;
            public String name;

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

            public String getDescription() {
                return this.description;
            }

            public void setDescription(String str) {
                this.description = str;
            }

            public String getCreatorName() {
                return this.creatorName;
            }

            public void setCreatorName(String str) {
                this.creatorName = str;
            }

            public String getCreatorPic() {
                return this.creatorPic;
            }

            public void setCreatorPic(String str) {
                this.creatorPic = str;
            }

            public long getListenNum() {
                return this.listenNum;
            }

            public void setListenNum(long j) {
                this.listenNum = j;
            }

            public long getFavNum() {
                return this.favNum;
            }

            public void setFavNum(long j) {
                this.favNum = j;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public void setCreateTime(long j) {
                this.createTime = j;
            }

            public long getModifyTime() {
                return this.modifyTime;
            }

            public void setModifyTime(long j) {
                this.modifyTime = j;
            }
        }
    }
}
