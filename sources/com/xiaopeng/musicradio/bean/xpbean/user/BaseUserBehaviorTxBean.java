package com.xiaopeng.musicradio.bean.xpbean.user;
/* loaded from: classes.dex */
public class BaseUserBehaviorTxBean {
    public static final int BIZ_TYPE_ARTIST_LOVE = 1;
    public static final int BIZ_TYPE_MUSIC_ALBUM_LOVE = 2;
    public static final int BIZ_TYPE_MUSIC_BLUE = 4;
    public static final int BIZ_TYPE_MUSIC_IMPORT_ALBUM = 3;
    public static final int BIZ_TYPE_MUSIC_LOVE = 1;
    public static final int BIZ_TYPE_MUSIC_SEARCH_ONE = 5;
    public static final int BIZ_TYPE_READ_LOVE = 2;
    private String bizId;
    private int bizType;
    private long ts;

    public BaseUserBehaviorTxBean(int i, String str, long j) {
        this.bizType = i;
        this.bizId = str;
        this.ts = j;
    }

    public int getBizType() {
        return this.bizType;
    }

    public void setBizType(int i) {
        this.bizType = i;
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long j) {
        this.ts = j;
    }
}
