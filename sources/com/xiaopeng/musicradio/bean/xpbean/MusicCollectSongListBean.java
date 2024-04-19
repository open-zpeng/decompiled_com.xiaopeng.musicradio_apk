package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.common.PageBean;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MusicCollectSongListBean extends BaseBean {
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
        private List<MusicSongBean> list;
        private PageBean page;

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public List<MusicSongBean> getList() {
            return this.list;
        }

        public void setList(List<MusicSongBean> list) {
            this.list = list;
        }
    }
}
