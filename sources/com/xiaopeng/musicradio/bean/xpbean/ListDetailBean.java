package com.xiaopeng.musicradio.bean.xpbean;

import androidx.annotation.Keep;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class ListDetailBean extends BaseBean {
    private List<MusicSongBean> data;

    public List<MusicSongBean> getData() {
        return this.data;
    }

    public void setData(List<MusicSongBean> list) {
        this.data = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListDetailBean{data=");
        List<MusicSongBean> list = this.data;
        sb.append(list != null ? String.valueOf(list.size()) : "null");
        sb.append('}');
        return sb.toString();
    }
}
