package com.xiaopeng.musicradio.bean;
/* loaded from: classes.dex */
public class VipDetail {
    public static final int VIP_1 = 1;
    public static final int VIP_2 = 2;
    public static final int VIP_3 = 3;
    private long expireTime;
    private String logo;
    private String text;
    private Integer vipType;

    public Integer getVipType() {
        return this.vipType;
    }

    public void setVipType(Integer num) {
        this.vipType = num;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        return "VipDetail{vipType=" + this.vipType + ", expireTime=" + this.expireTime + ", logo='" + this.logo + "', text='" + this.text + "'}";
    }
}
