package com.xiaopeng.musicradio.bean.netradio;

import android.text.SpannableStringBuilder;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.List;
/* loaded from: classes.dex */
public class NetRadioInfo extends BaseInfo {
    private static final long serialVersionUID = 1;
    private String areaCode;
    private transient long cacheTime;
    private double hz;
    private int id;
    private transient SpannableStringBuilder mHighlightName;
    private String name;
    private boolean off;
    private String offMsg;
    private long offTime;
    private String picUrl;
    private int playCount;
    private String playUrl;
    private NetRadioProgramInfo playingInfo;
    private List<NetRadioProgramInfo> programInfos;
    private long updateTime;

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String str) {
        this.picUrl = str;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public double getHz() {
        return this.hz;
    }

    public void setHz(double d) {
        this.hz = d;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String str) {
        this.areaCode = str;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public NetRadioProgramInfo getPlayingInfo() {
        NetRadioProgramInfo netRadioProgramInfo = this.playingInfo;
        if (netRadioProgramInfo != null) {
            netRadioProgramInfo.setType(2);
            this.playingInfo.setParentInfo(this);
            this.playingInfo.setPlayUrl(getPlayUrl());
        }
        return this.playingInfo;
    }

    public void setPlayingInfoRaw(NetRadioProgramInfo netRadioProgramInfo) {
        this.playingInfo = netRadioProgramInfo;
    }

    public void setPlayingInfo(NetRadioProgramInfo netRadioProgramInfo) {
        this.playingInfo = netRadioProgramInfo;
        if (netRadioProgramInfo != null) {
            netRadioProgramInfo.setType(2);
            netRadioProgramInfo.setParentInfo(this);
        }
    }

    public List<NetRadioProgramInfo> getProgramInfos() {
        List<NetRadioProgramInfo> list = this.programInfos;
        if (list != null) {
            for (NetRadioProgramInfo netRadioProgramInfo : list) {
                netRadioProgramInfo.setParentInfo(this);
            }
        }
        return this.programInfos;
    }

    public void setProgramInfosRaw(List<NetRadioProgramInfo> list) {
        this.programInfos = list;
    }

    public void setProgramInfos(List<NetRadioProgramInfo> list) {
        this.programInfos = list;
        if (list != null) {
            for (NetRadioProgramInfo netRadioProgramInfo : list) {
                netRadioProgramInfo.setParentInfo(this);
            }
        }
    }

    public String getPlayUrl() {
        return this.playUrl;
    }

    public void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (((NetRadioInfo) obj).id == this.id) {
            return true;
        }
        return super.equals(obj);
    }

    public SpannableStringBuilder getHighlightName() {
        return this.mHighlightName;
    }

    public void setHighlightName(SpannableStringBuilder spannableStringBuilder) {
        this.mHighlightName = spannableStringBuilder;
    }

    public String toString() {
        return "NetRadioInfo{id=" + this.id + ", name='" + this.name + "', picUrl='" + this.picUrl + "', updateTime=" + this.updateTime + ", hz=" + this.hz + ", areaCode=" + this.areaCode + ", playCount=" + this.playCount + ", playUrl='" + this.playUrl + "', playUrl='" + this.playUrl + "', programInfos='" + getProgramInfoIdListString() + "'}";
    }

    private String getProgramInfoIdListString() {
        if (this.programInfos != null) {
            StringBuilder sb = new StringBuilder();
            for (NetRadioProgramInfo netRadioProgramInfo : this.programInfos) {
                sb.append(ListSignBean.COLLECTID_SUFFIX);
                sb.append(netRadioProgramInfo.getId());
                sb.append("-");
                sb.append(netRadioProgramInfo.getName());
            }
            return sb.toString();
        }
        return "";
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public boolean isOff() {
        return this.off;
    }

    public void setOff(boolean z) {
        this.off = z;
    }

    public long getOffTime() {
        return this.offTime;
    }

    public void setOffTime(long j) {
        this.offTime = j;
    }

    public String getOffMsg() {
        return this.offMsg;
    }

    public void setOffMsg(String str) {
        this.offMsg = str;
    }
}
