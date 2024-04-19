package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class RecommentMusicResult extends BaseBean {
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
        private List<MusicRadioItem> list;
        private PageBean page;

        public List<MusicRadioItem> getList() {
            return this.list;
        }

        public void setList(List<MusicRadioItem> list) {
            this.list = list;
        }

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }
    }
}
