package com.xiaopeng.musicradio.bean.db;

import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import java.util.List;
/* loaded from: classes.dex */
public class NetRadioHistory {
    private String areaCode;
    private long cacheTime;
    private double hz;
    private long id;
    private String name;
    private String picUrl;
    private int playCount;
    private String playUrl;
    private NetRadioProgramInfo playingInfo;
    private List<NetRadioProgramInfo> programInfos;
    private long updateTime;

    public NetRadioHistory() {
    }

    public NetRadioHistory(long j, String str, String str2, long j2, double d, String str3, int i, String str4, NetRadioProgramInfo netRadioProgramInfo, List<NetRadioProgramInfo> list, long j3) {
        this.id = j;
        this.name = str;
        this.picUrl = str2;
        this.updateTime = j2;
        this.hz = d;
        this.areaCode = str3;
        this.playCount = i;
        this.playUrl = str4;
        this.playingInfo = netRadioProgramInfo;
        this.programInfos = list;
        this.cacheTime = j3;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
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

    public String getPlayUrl() {
        return this.playUrl;
    }

    public void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public NetRadioProgramInfo getPlayingInfo() {
        return this.playingInfo;
    }

    public void setPlayingInfo(NetRadioProgramInfo netRadioProgramInfo) {
        this.playingInfo = netRadioProgramInfo;
    }

    public List<NetRadioProgramInfo> getProgramInfos() {
        return this.programInfos;
    }

    public void setProgramInfos(List<NetRadioProgramInfo> list) {
        this.programInfos = list;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }
}
