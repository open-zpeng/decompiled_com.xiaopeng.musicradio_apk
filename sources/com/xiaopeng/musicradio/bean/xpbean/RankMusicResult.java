package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class RankMusicResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<MusicRadioItem> list;

        public List<MusicRadioItem> getList() {
            return this.list;
        }

        public void setList(List<MusicRadioItem> list) {
            this.list = list;
        }
    }
}
