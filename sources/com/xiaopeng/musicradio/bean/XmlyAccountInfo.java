package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class XmlyAccountInfo implements Serializable {
    public String age;
    public String avatarUrl;
    public String city;
    public String gender;
    public String id;
    public String nickName;
    public String openId;
    public String userTitle;
    public boolean vip;
    public long vipExpireTime;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String str) {
        this.age = str;
    }

    public String getUserTitle() {
        return this.userTitle;
    }

    public void setUserTitle(String str) {
        this.userTitle = str;
    }

    public long getVipExpireTime() {
        return this.vipExpireTime;
    }

    public void setVipExpireTime(long j) {
        this.vipExpireTime = j;
    }

    public void setVip(boolean z) {
        this.vip = z;
    }

    public boolean isVip() {
        return this.vip;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public String getVipEndTime() {
        return isVip() ? bdk.a(this.vipExpireTime) : "";
    }

    public String toString() {
        return "XmlyAccountInfo{id='" + this.id + "', nickName='" + this.nickName + "', avatarUrl='" + this.avatarUrl + "', city='" + this.city + "', gender='" + this.gender + "', age='" + this.age + "', userTitle='" + this.userTitle + "', vipExpireTime=" + this.vipExpireTime + ", vip=" + this.vip + ", openId='" + this.openId + "'}";
    }
}
