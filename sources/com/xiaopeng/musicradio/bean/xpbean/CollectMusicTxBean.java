package com.xiaopeng.musicradio.bean.xpbean;
/* loaded from: classes.dex */
public class CollectMusicTxBean {
    private String collectId;
    private String collectInfo;
    private int collectType;
    private long ts;

    public CollectMusicTxBean(int i, String str, long j) {
        this.collectType = i;
        this.collectId = str;
        this.ts = j;
    }

    public String getCollectId() {
        return this.collectId;
    }

    public void setCollectId(String str) {
        this.collectId = str;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long j) {
        this.ts = j;
    }

    public int getCollectType() {
        return this.collectType;
    }

    public void setCollectType(int i) {
        this.collectType = i;
    }

    public String getCollectInfo() {
        return this.collectInfo;
    }

    public void setCollectInfo(String str) {
        this.collectInfo = str;
    }
}
