package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.NetRadioCollect;
import com.xiaopeng.musicradio.bean.db.NetRadioHistory;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetScheduleListBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NetRadioInfoTransferUtil.java */
/* loaded from: classes2.dex */
public class an {
    public static NetRadioProgramInfo a(NetScheduleListBean.DataBean.ListBean listBean, NetRadioInfo netRadioInfo) {
        if (listBean == null || listBean.getRelatedProgram() == null || TextUtils.isEmpty(listBean.getBackPlayUrl())) {
            return null;
        }
        NetRadioProgramInfo netRadioProgramInfo = new NetRadioProgramInfo();
        netRadioProgramInfo.setId(listBean.getRelatedProgram().getId());
        netRadioProgramInfo.setName(listBean.getRelatedProgram().getName());
        netRadioProgramInfo.setPlayUrl(listBean.getBackPlayUrl());
        netRadioProgramInfo.setStartTime(listBean.getStartTime());
        netRadioProgramInfo.setEndTime(listBean.getEndTime());
        netRadioProgramInfo.setParentInfo(netRadioInfo);
        return netRadioProgramInfo;
    }

    public static NetRadioInfo a(NetRadioHistory netRadioHistory) {
        NetRadioInfo netRadioInfo = new NetRadioInfo();
        netRadioInfo.setId((int) netRadioHistory.getId());
        netRadioInfo.setAreaCode(netRadioHistory.getAreaCode());
        netRadioInfo.setHz(netRadioHistory.getHz());
        netRadioInfo.setName(netRadioHistory.getName());
        netRadioInfo.setPicUrl(netRadioHistory.getPicUrl());
        netRadioInfo.setPlayCount(netRadioHistory.getPlayCount());
        netRadioInfo.setPlayUrl(netRadioHistory.getPlayUrl());
        netRadioInfo.setUpdateTime(netRadioHistory.getUpdateTime());
        netRadioInfo.setCacheTime(netRadioHistory.getCacheTime());
        a(netRadioInfo, netRadioHistory.getPlayingInfo(), netRadioHistory.getProgramInfos());
        return netRadioInfo;
    }

    public static NetRadioInfo a(NetRadioCollect netRadioCollect) {
        NetRadioInfo netRadioInfo = new NetRadioInfo();
        netRadioInfo.setId((int) netRadioCollect.getId());
        netRadioInfo.setAreaCode(netRadioCollect.getAreaCode());
        netRadioInfo.setHz(netRadioCollect.getHz());
        netRadioInfo.setName(netRadioCollect.getName());
        netRadioInfo.setPicUrl(netRadioCollect.getPicUrl());
        netRadioInfo.setPlayCount(netRadioCollect.getPlayCount());
        netRadioInfo.setPlayUrl(netRadioCollect.getPlayUrl());
        netRadioInfo.setUpdateTime(netRadioCollect.getUpdateTime());
        netRadioInfo.setCacheTime(netRadioCollect.getCacheTime());
        a(netRadioInfo, netRadioCollect.getPlayingInfo(), netRadioCollect.getProgramInfos());
        return netRadioInfo;
    }

    private static void a(NetRadioInfo netRadioInfo, NetRadioProgramInfo netRadioProgramInfo, List<NetRadioProgramInfo> list) {
        NetRadioProgramInfo netRadioProgramInfo2;
        ArrayList arrayList = null;
        if (netRadioProgramInfo != null) {
            netRadioProgramInfo2 = netRadioProgramInfo.clone();
            netRadioProgramInfo2.setType(2);
            netRadioProgramInfo2.setParentInfo(netRadioInfo);
        } else {
            netRadioProgramInfo2 = null;
        }
        netRadioInfo.setPlayingInfoRaw(netRadioProgramInfo2);
        if (list != null) {
            ArrayList<NetRadioProgramInfo> arrayList2 = new ArrayList(list);
            arrayList = new ArrayList(arrayList2.size());
            for (NetRadioProgramInfo netRadioProgramInfo3 : arrayList2) {
                NetRadioProgramInfo clone = netRadioProgramInfo3.clone();
                clone.setParentInfo(netRadioInfo);
                arrayList.add(clone);
            }
        }
        netRadioInfo.setProgramInfosRaw(arrayList);
    }

    public static NetRadioHistory a(NetRadioInfo netRadioInfo) {
        NetRadioHistory netRadioHistory = new NetRadioHistory();
        netRadioHistory.setId(netRadioInfo.getId());
        netRadioHistory.setAreaCode(netRadioInfo.getAreaCode());
        netRadioHistory.setHz(netRadioInfo.getHz());
        netRadioHistory.setName(netRadioInfo.getName());
        netRadioHistory.setPicUrl(netRadioInfo.getPicUrl());
        netRadioHistory.setPlayCount(netRadioInfo.getPlayCount());
        netRadioHistory.setPlayingInfo(netRadioInfo.getPlayingInfo());
        netRadioHistory.setProgramInfos(netRadioInfo.getProgramInfos());
        netRadioHistory.setPlayUrl(netRadioInfo.getPlayUrl());
        netRadioHistory.setUpdateTime(netRadioInfo.getUpdateTime());
        return netRadioHistory;
    }

    public static NetRadioCollect b(NetRadioInfo netRadioInfo) {
        NetRadioCollect netRadioCollect = new NetRadioCollect();
        netRadioCollect.setId(netRadioInfo.getId());
        netRadioCollect.setAreaCode(netRadioInfo.getAreaCode());
        netRadioCollect.setHz(netRadioInfo.getHz());
        netRadioCollect.setName(netRadioInfo.getName());
        netRadioCollect.setPicUrl(netRadioInfo.getPicUrl());
        netRadioCollect.setPlayCount(netRadioInfo.getPlayCount());
        netRadioCollect.setPlayingInfo(netRadioInfo.getPlayingInfo());
        netRadioCollect.setProgramInfos(netRadioInfo.getProgramInfos());
        netRadioCollect.setPlayUrl(netRadioInfo.getPlayUrl());
        netRadioCollect.setUpdateTime(netRadioInfo.getUpdateTime());
        netRadioCollect.setCacheTime(netRadioInfo.getCacheTime());
        return netRadioCollect;
    }
}
