package com.xiaopeng.musicradio.bean.netradio;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.BaseInfo;
import java.util.Objects;
/* loaded from: classes.dex */
public class NetRadioProgramInfo extends BaseInfo implements Cloneable {
    private static final long serialVersionUID = 1;
    private String dayOfWeek;
    private String endTime;
    private int id;
    private transient NetRadioInfo mParentInfo;
    private String name;
    private String playUrl;
    private String startTime;
    private long time;
    private int type = -1;

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getName() {
        String str = this.name;
        return (str == null || TextUtils.isEmpty(str)) ? "正在直播" : this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPlayUrl() {
        return this.playUrl;
    }

    public void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public NetRadioInfo getParentInfo() {
        return this.mParentInfo;
    }

    public void setParentInfo(NetRadioInfo netRadioInfo) {
        this.mParentInfo = netRadioInfo;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(String str) {
        this.dayOfWeek = str;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetRadioProgramInfo netRadioProgramInfo = (NetRadioProgramInfo) obj;
        return this.id == netRadioProgramInfo.id && Objects.equals(this.playUrl, netRadioProgramInfo.playUrl);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), this.playUrl);
    }

    public String toString() {
        return "NetRadioProgramInfo{id=" + this.id + ", name='" + this.name + "', playUrl='" + this.playUrl + "', startTime='" + this.startTime + "', endTime='" + this.endTime + "', mParentInfo=" + this.mParentInfo + ", tyep='" + this.type + "'}";
    }

    @Override // com.xiaopeng.musicradio.bean.BaseInfo
    public NetRadioProgramInfo clone() {
        NetRadioProgramInfo netRadioProgramInfo;
        try {
            netRadioProgramInfo = (NetRadioProgramInfo) super.clone();
        } catch (CloneNotSupportedException unused) {
            netRadioProgramInfo = null;
        }
        if (netRadioProgramInfo == null) {
            NetRadioProgramInfo netRadioProgramInfo2 = new NetRadioProgramInfo();
            netRadioProgramInfo2.setId(this.id);
            netRadioProgramInfo2.setDayOfWeek(this.dayOfWeek);
            netRadioProgramInfo2.setEndTime(this.endTime);
            netRadioProgramInfo2.setName(this.name);
            netRadioProgramInfo2.setPlayUrl(this.playUrl);
            netRadioProgramInfo2.setStartTime(this.startTime);
            netRadioProgramInfo2.setTime(this.time);
            netRadioProgramInfo2.setType(this.type);
            netRadioProgramInfo2.setParentInfo(this.mParentInfo);
            return netRadioProgramInfo2;
        }
        return netRadioProgramInfo;
    }
}
