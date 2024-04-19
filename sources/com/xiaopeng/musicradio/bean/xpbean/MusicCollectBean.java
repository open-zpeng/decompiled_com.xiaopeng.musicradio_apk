package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicCollectBean implements Serializable {
    public static final int COLLECT_ALBUM_USER = 1;
    private static final long serialVersionUID = 1;
    private long id;
    private int isUserCollect;
    private String logo;
    private String name;
    private int opRecommend;
    private String reason;
    private String reportJson;
    private int songCount;
    private int type;

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

    public int getSongCount() {
        return this.songCount;
    }

    public void setSongCount(int i) {
        this.songCount = i;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public int getOpRecommend() {
        return this.opRecommend;
    }

    public void setOpRecommend(int i) {
        this.opRecommend = i;
    }

    public String getReportJson() {
        return this.reportJson;
    }

    public void setReportJson(String str) {
        this.reportJson = str;
    }

    public int getIsUserCollect() {
        return this.isUserCollect;
    }

    public void setIsUserCollect(int i) {
        this.isUserCollect = i;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
