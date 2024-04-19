package com.xiaopeng.musicradio.bean.blue;

import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.utils.be;
import java.util.UUID;
/* loaded from: classes.dex */
public class BtMusicBean extends BaseInfo {
    private String song = "";
    private String singer = "";
    private String logo = "";
    private int duration = 0;
    private String lrcContent = "";
    private String uuid = UUID.randomUUID().toString();

    public String getLrcContent() {
        return this.lrcContent;
    }

    public void setLrcContent(String str) {
        this.lrcContent = str;
    }

    public String getSong() {
        return this.song;
    }

    public void setSong(String str) {
        this.song = str;
    }

    public String getSinger() {
        return this.singer;
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void refreshUuid() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String toString() {
        return "BtMusicBean{song='" + this.song + "', singer='" + this.singer + "', logo='" + this.logo + "', duration=" + this.duration + ", uuid=" + this.uuid + '}';
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof BtMusicBean) && be.a(this.uuid, ((BtMusicBean) obj).uuid);
    }
}
