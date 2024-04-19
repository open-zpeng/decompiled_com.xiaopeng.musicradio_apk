package com.xiaopeng.musicradio.bean.db;
/* loaded from: classes.dex */
public class SearchHistoryBean {
    private Long id;
    String key;
    String keyPinYin;
    long sysUid;
    Long updateTs;

    public SearchHistoryBean() {
    }

    public SearchHistoryBean(Long l, String str, String str2, Long l2, long j) {
        this.id = l;
        this.key = str;
        this.keyPinYin = str2;
        this.updateTs = l2;
        this.sysUid = j;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getKeyPinYin() {
        return this.keyPinYin;
    }

    public void setKeyPinYin(String str) {
        this.keyPinYin = str;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public long getSysUid() {
        return this.sysUid;
    }

    public void setSysUid(long j) {
        this.sysUid = j;
    }

    public Long getUpdateTs() {
        return this.updateTs;
    }

    public void setUpdateTs(Long l) {
        this.updateTs = l;
    }

    public String toString() {
        return "SearchHistoryBean{id=" + this.id + ", key='" + this.key + "', keyPinYin='" + this.keyPinYin + "'}";
    }
}
