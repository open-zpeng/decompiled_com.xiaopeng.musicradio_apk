package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class UserAccountInfo implements Serializable {
    public String buyVipUrl;
    public String headImgUrl;
    public String nickName;
    public String openId;
    public UserVipInfo vipInfo;

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public String getHeadImgUrl() {
        return this.headImgUrl;
    }

    public void setHeadImgUrl(String str) {
        this.headImgUrl = str;
    }

    public String getBuyVipUrl() {
        return this.buyVipUrl;
    }

    public void setBuyVipUrl(String str) {
        this.buyVipUrl = str;
    }

    public UserVipInfo getVipInfo() {
        return this.vipInfo;
    }

    public void setVipInfo(UserVipInfo userVipInfo) {
        this.vipInfo = userVipInfo;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public boolean isVip() {
        UserVipInfo vipInfo = getVipInfo();
        if (vipInfo != null) {
            return vipInfo.isVip();
        }
        return false;
    }

    public String toString() {
        return "UserAccountInfo{nickName='" + this.nickName + "', headImgUrl='" + this.headImgUrl + "', buyVipUrl='" + this.buyVipUrl + "', vipInfo=" + this.vipInfo + '}';
    }
}
