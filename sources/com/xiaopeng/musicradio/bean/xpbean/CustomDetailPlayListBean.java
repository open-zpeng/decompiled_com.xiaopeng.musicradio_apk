package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MineDetailPlayListBean;
import java.util.List;
/* loaded from: classes.dex */
public class CustomDetailPlayListBean extends BaseBean {
    private MineDetailPlayListBean.PageBean mPageBean;
    private List<MusicInfo> musicInfoList;

    public List<MusicInfo> getMusicInfoList() {
        return this.musicInfoList;
    }

    public void setMusicInfoList(List<MusicInfo> list) {
        this.musicInfoList = list;
    }

    public MineDetailPlayListBean.PageBean getPageBean() {
        return this.mPageBean;
    }

    public void setPageBean(MineDetailPlayListBean.PageBean pageBean) {
        this.mPageBean = pageBean;
    }
}
