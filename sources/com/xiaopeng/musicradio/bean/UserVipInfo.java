package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class UserVipInfo implements Serializable {
    public long eightEndTime;
    public boolean eightFlag;
    public long eightStartTime;
    public long greenVipEndTime;
    public boolean greenVipFlag;
    public long greenVipStartTime;
    public int songQuality;
    public long superGreenVipEndTime;
    public boolean superGreenVipFlag;
    public long superGreenVipStartTime;
    public long twelveEndTime;
    public boolean twelveFlag;
    public long twelveStartTime;
    private List<VipDetail> vipDetailDto;
    private UserVipInfo vipInfo;
    public boolean yearGreenVipFlag;

    public boolean isGreenVipFlag() {
        return this.greenVipFlag;
    }

    public void setGreenVipFlag(boolean z) {
        this.greenVipFlag = z;
    }

    public boolean isYearGreenVipFlag() {
        return this.yearGreenVipFlag;
    }

    public void setYearGreenVipFlag(boolean z) {
        this.yearGreenVipFlag = z;
    }

    public boolean isSuperGreenVipFlag() {
        return this.superGreenVipFlag;
    }

    public void setSuperGreenVipFlag(boolean z) {
        this.superGreenVipFlag = z;
    }

    public boolean isEightFlag() {
        return this.eightFlag;
    }

    public void setEightFlag(boolean z) {
        this.eightFlag = z;
    }

    public boolean isTwelveFlag() {
        return this.twelveFlag;
    }

    public void setTwelveFlag(boolean z) {
        this.twelveFlag = z;
    }

    public long getGreenVipStartTime() {
        return this.greenVipStartTime;
    }

    public void setGreenVipStartTime(long j) {
        this.greenVipStartTime = j;
    }

    public long getGreenVipEndTime() {
        return this.greenVipEndTime;
    }

    public void setGreenVipEndTime(long j) {
        this.greenVipEndTime = j;
    }

    public long getSuperGreenVipStartTime() {
        return this.superGreenVipStartTime;
    }

    public void setSuperGreenVipStartTime(long j) {
        this.superGreenVipStartTime = j;
    }

    public long getSuperGreenVipEndTime() {
        return this.superGreenVipEndTime;
    }

    public void setSuperGreenVipEndTime(long j) {
        this.superGreenVipEndTime = j;
    }

    public long getEightStartTime() {
        return this.eightStartTime;
    }

    public void setEightStartTime(long j) {
        this.eightStartTime = j;
    }

    public long getEightEndTime() {
        return this.eightEndTime;
    }

    public void setEightEndTime(long j) {
        this.eightEndTime = j;
    }

    public long getTwelveStartTime() {
        return this.twelveStartTime;
    }

    public void setTwelveStartTime(long j) {
        this.twelveStartTime = j;
    }

    public long getTwelveEndTime() {
        return this.twelveEndTime;
    }

    public void setTwelveEndTime(long j) {
        this.twelveEndTime = j;
    }

    public int getSongQuality() {
        return this.songQuality;
    }

    public void setSongQuality(int i) {
        this.songQuality = i;
    }

    public boolean isVip() {
        return this.superGreenVipFlag || this.greenVipFlag || this.eightFlag;
    }

    public String getVipEndTime() {
        if (this.superGreenVipFlag) {
            return bdk.a(this.superGreenVipEndTime);
        }
        if (this.greenVipFlag) {
            return bdk.a(this.greenVipEndTime);
        }
        return this.eightFlag ? bdk.a(this.eightEndTime) : "";
    }

    public List<VipDetail> getVipDetailDto() {
        return this.vipDetailDto;
    }

    public void setVipDetailDto(List<VipDetail> list) {
        this.vipDetailDto = list;
    }

    public UserVipInfo getVipInfo() {
        return this.vipInfo;
    }

    public void setVipInfo(UserVipInfo userVipInfo) {
        this.vipInfo = userVipInfo;
    }

    public boolean isGreenVip() {
        return this.superGreenVipFlag || this.greenVipFlag;
    }

    public String toString() {
        return "UserVipInfo{greenVipFlag=" + this.greenVipFlag + ", yearGreenVipFlag=" + this.yearGreenVipFlag + ", superGreenVipFlag=" + this.superGreenVipFlag + ", eightFlag=" + this.eightFlag + ", twelveFlag=" + this.twelveFlag + ", greenVipStartTime='" + this.greenVipStartTime + "', greenVipEndTime='" + this.greenVipEndTime + "', superGreenVipStartTime='" + this.superGreenVipStartTime + "', superGreenVipEndTime='" + this.superGreenVipEndTime + "', eightStartTime='" + this.eightStartTime + "', eightEndTime='" + this.eightEndTime + "', twelveStartTime='" + this.twelveStartTime + "', twelveEndTime='" + this.twelveEndTime + "', songQuality='" + this.songQuality + "'}";
    }
}
