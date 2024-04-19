package com.xiaopeng.musicradio.bean.dui;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* loaded from: classes.dex */
public class MusicSearchInfo implements Comparable<MusicSearchInfo> {
    private long creatTime;
    private String logo;
    private String musicFromTitle;
    private List<MusicInfo> musicInfos;
    private int type;

    public String getMusicFromTitle() {
        return this.musicFromTitle;
    }

    public void setMusicFromTitle(String str) {
        this.musicFromTitle = str;
    }

    public List<MusicInfo> getMusicInfos() {
        return this.musicInfos;
    }

    public void setMusicInfos(List<MusicInfo> list) {
        this.musicInfos = list;
    }

    public long getCreatTime() {
        return this.creatTime;
    }

    public void setCreatTime(long j) {
        this.creatTime = j;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(MusicSearchInfo musicSearchInfo) {
        if (musicSearchInfo == null) {
            return -1;
        }
        int i = ((musicSearchInfo.getCreatTime() - this.creatTime) > 0L ? 1 : ((musicSearchInfo.getCreatTime() - this.creatTime) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? 1 : -1;
    }
}
