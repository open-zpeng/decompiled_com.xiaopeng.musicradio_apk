package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.reading.HeadSpeechHistoryRecord;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsChannelBean;
import com.xiaopeng.musicradio.bean.xpbean.XmArtistBean;
/* compiled from: ProgramInfoTransferUtil.java */
/* loaded from: classes2.dex */
public class aq {
    public static ProgramBean a(FMAlbumTracksBean.DataBean.ListBean listBean, RdAlbumBean rdAlbumBean) {
        if (listBean == null) {
            return null;
        }
        ProgramBean programBean = new ProgramBean();
        programBean.setIntro(rdAlbumBean.getIntro());
        programBean.setFromSource(rdAlbumBean.getFromSource());
        programBean.setPlayCount(rdAlbumBean.getPlayCount());
        programBean.setShortIntro(rdAlbumBean.getShortIntro());
        programBean.setAlbumLogo(rdAlbumBean.getMediumLogo());
        programBean.setTrackId(listBean.getId());
        programBean.setTitle(listBean.getTitle());
        programBean.setSmallLogo(listBean.getSmallLogo());
        programBean.setMediumLogo(listBean.getMediumLogo());
        programBean.setLargeLogo(listBean.getLargeLogo());
        programBean.setArtistId(listBean.getArtist().getId());
        programBean.setListenUrl(listBean.getListenUrl());
        programBean.setArtistName(listBean.getArtist().getName());
        programBean.setDuration(listBean.getDuration());
        programBean.setUpdateTime(listBean.getUpdateTime());
        programBean.setCreateTime(listBean.getCreateTime());
        programBean.setAlbumId(listBean.getAlbumId());
        programBean.setAlbumName(rdAlbumBean.getTitle());
        programBean.setOrderNum(listBean.getOrderNum());
        programBean.setCategoryName(rdAlbumBean.getCategoryName());
        programBean.setAlbumPaymentType(rdAlbumBean.getPaymentType());
        programBean.setAlbumAuthorized(rdAlbumBean.isAuthorized());
        programBean.setPaymentType(listBean.getPaymentType());
        programBean.setAuthorized(listBean.isAuthorized());
        programBean.setCardId(rdAlbumBean.getCardId());
        return programBean;
    }

    public static ProgramBean a(FMAlbumTracksBean.DataBean.ListBean listBean, String str, RdAlbumBean rdAlbumBean) {
        if (listBean == null) {
            return null;
        }
        ProgramBean programBean = new ProgramBean();
        programBean.setTrackId(listBean.getId());
        programBean.setTitle(listBean.getTitle());
        programBean.setSmallLogo(listBean.getSmallLogo());
        programBean.setMediumLogo(listBean.getMediumLogo());
        programBean.setLargeLogo(listBean.getLargeLogo());
        programBean.setArtistId(listBean.getArtist().getId());
        programBean.setListenUrl(listBean.getListenUrl());
        programBean.setArtistName(listBean.getArtist().getName());
        programBean.setDuration(listBean.getDuration());
        programBean.setUpdateTime(listBean.getUpdateTime());
        programBean.setCreateTime(listBean.getCreateTime());
        programBean.setAlbumId(listBean.getAlbumId());
        programBean.setAlbumName(listBean.getArtist().getName());
        programBean.setOrderNum(listBean.getOrderNum());
        if (rdAlbumBean != null) {
            programBean.setAlbumId(rdAlbumBean.getId());
            programBean.setFromSource(rdAlbumBean.getFromSource());
            programBean.setAlbumLogo(rdAlbumBean.getMediumLogo());
            programBean.setShortIntro(rdAlbumBean.getShortIntro());
            programBean.setPlayCount(rdAlbumBean.getPlayCount());
            programBean.setIntro(rdAlbumBean.getIntro());
            programBean.setAlbumPaymentType(rdAlbumBean.getPaymentType());
            programBean.setAlbumAuthorized(rdAlbumBean.isAuthorized());
        }
        return programBean;
    }

    public static ReadLoveInfo a(ProgramBean programBean) {
        ReadLoveInfo readLoveInfo = new ReadLoveInfo();
        if (programBean.getOriginalAlbumId() > 0) {
            readLoveInfo.setAlbumId(programBean.getOriginalAlbumId());
        } else {
            readLoveInfo.setAlbumId(programBean.getAlbumId());
        }
        readLoveInfo.setAlbumName(programBean.getAlbumName());
        readLoveInfo.setArtistId(programBean.getArtistId());
        readLoveInfo.setArtist(programBean.getArtistName());
        readLoveInfo.setTs(System.currentTimeMillis());
        readLoveInfo.setLogo(programBean.getSmallLogo());
        readLoveInfo.setMediumLogo(programBean.getAlbumLogo());
        readLoveInfo.setLargeLogo(programBean.getLargeLogo());
        readLoveInfo.setUpdateTime(programBean.getUpdateTime());
        readLoveInfo.setUid(aqh.a().c());
        readLoveInfo.setShortIntro(programBean.getShortIntro());
        readLoveInfo.setIntro(programBean.getIntro());
        readLoveInfo.setPlayCount(programBean.getPlayCount());
        readLoveInfo.setPaymentType(programBean.getAlbumPaymentType());
        readLoveInfo.setAuthorized(programBean.isAlbumAuthorized());
        return readLoveInfo;
    }

    public static ReadHistoryInfo a(ProgramBean programBean, int i, @ReadingInfo.SORT String str) {
        ReadHistoryInfo readHistoryInfo = new ReadHistoryInfo();
        readHistoryInfo.setIntro(programBean.getIntro());
        readHistoryInfo.setPlayCount(programBean.getPlayCount());
        readHistoryInfo.setShortIntro(programBean.getShortIntro());
        readHistoryInfo.setCardId(programBean.getCardId());
        readHistoryInfo.setChannelId(programBean.getChannelId());
        readHistoryInfo.setAuthorized(programBean.isAlbumAuthorized());
        readHistoryInfo.setPaymentType(programBean.getAlbumPaymentType());
        readHistoryInfo.setTrackAuthorized(programBean.isAuthorized());
        readHistoryInfo.setTrackPaymentType(programBean.getPaymentType());
        if (programBean.getOriginalAlbumId() > 0) {
            readHistoryInfo.setAlbumId(programBean.getOriginalAlbumId());
        } else {
            readHistoryInfo.setAlbumId(programBean.getAlbumId());
        }
        readHistoryInfo.setAlbumName(programBean.getAlbumName());
        readHistoryInfo.setArtistId(programBean.getArtistId());
        readHistoryInfo.setArtist(programBean.getArtistName());
        readHistoryInfo.setTs(System.currentTimeMillis());
        if (TextUtils.isEmpty(programBean.getAlbumLogo())) {
            readHistoryInfo.setLogo(programBean.getSmallLogo());
            readHistoryInfo.setMediumLogo(programBean.getMediumLogo());
            readHistoryInfo.setLargeLogo(programBean.getLargeLogo());
        } else {
            readHistoryInfo.setLogo(programBean.getAlbumLogo());
            readHistoryInfo.setMediumLogo(programBean.getAlbumLogo());
            readHistoryInfo.setLargeLogo(programBean.getAlbumLogo());
        }
        readHistoryInfo.setTrackId(programBean.getTrackId());
        readHistoryInfo.setTrackTitle(programBean.getTitle());
        readHistoryInfo.setSeek(i);
        readHistoryInfo.setUid(aqh.a().c());
        readHistoryInfo.setUpdateTime(programBean.getUpdateTime());
        readHistoryInfo.setSort(str);
        readHistoryInfo.setDuration(programBean.getDuration());
        readHistoryInfo.setOrderNum(programBean.getOrderNum());
        readHistoryInfo.setPaymentType(programBean.getAlbumPaymentType());
        readHistoryInfo.setAuthorized(programBean.isAlbumAuthorized());
        readHistoryInfo.setTrackPaymentType(programBean.getPaymentType());
        if (aqh.a().e()) {
            readHistoryInfo.setTrackAuthorized(programBean.isAuthorized());
        } else {
            readHistoryInfo.setTrackAuthorized(false);
        }
        return readHistoryInfo;
    }

    public static RdAlbumBean a(ReadHistoryInfo readHistoryInfo) {
        if (readHistoryInfo == null) {
            return null;
        }
        RdAlbumBean rdAlbumBean = new RdAlbumBean();
        rdAlbumBean.setId(readHistoryInfo.getAlbumId());
        rdAlbumBean.setUpdateTime(readHistoryInfo.getUpdateTime());
        rdAlbumBean.setChannelId(readHistoryInfo.getChannelId());
        rdAlbumBean.setLargeLogo(readHistoryInfo.getLargeLogo());
        rdAlbumBean.setMediumLogo(readHistoryInfo.getMediumLogo());
        rdAlbumBean.setSmallLogo(readHistoryInfo.getLogo());
        rdAlbumBean.setTitle(readHistoryInfo.getAlbumName());
        XmArtistBean xmArtistBean = new XmArtistBean();
        xmArtistBean.setId(readHistoryInfo.getArtistId());
        xmArtistBean.setName(readHistoryInfo.getArtist());
        rdAlbumBean.setArtist(xmArtistBean);
        rdAlbumBean.setIntro(readHistoryInfo.getIntro());
        rdAlbumBean.setShortIntro(readHistoryInfo.getShortIntro());
        rdAlbumBean.setPlayCount(readHistoryInfo.getPlayCount());
        rdAlbumBean.setCategoryName(readHistoryInfo.getCategoryName());
        rdAlbumBean.setPaymentType(readHistoryInfo.getPaymentType());
        rdAlbumBean.setAuthorized(readHistoryInfo.isAuthorized());
        if (readHistoryInfo.getCardId() > 0) {
            rdAlbumBean.setCardId(readHistoryInfo.getCardId());
        }
        return rdAlbumBean;
    }

    public static RdAlbumBean b(ProgramBean programBean) {
        if (programBean == null) {
            return null;
        }
        RdAlbumBean rdAlbumBean = new RdAlbumBean();
        rdAlbumBean.setId(programBean.getAlbumId());
        rdAlbumBean.setUpdateTime(programBean.getUpdateTime());
        if (TextUtils.isEmpty(programBean.getAlbumLogo())) {
            rdAlbumBean.setSmallLogo(programBean.getSmallLogo());
            rdAlbumBean.setMediumLogo(programBean.getMediumLogo());
            rdAlbumBean.setLargeLogo(programBean.getLargeLogo());
        } else {
            rdAlbumBean.setSmallLogo(programBean.getAlbumLogo());
            rdAlbumBean.setMediumLogo(programBean.getAlbumLogo());
            rdAlbumBean.setLargeLogo(programBean.getAlbumLogo());
        }
        rdAlbumBean.setTitle(programBean.getAlbumName());
        XmArtistBean xmArtistBean = new XmArtistBean();
        xmArtistBean.setId(programBean.getArtistId());
        xmArtistBean.setName(programBean.getArtistName());
        rdAlbumBean.setArtist(xmArtistBean);
        rdAlbumBean.setPlayCount(programBean.getPlayCount());
        rdAlbumBean.setShortIntro(programBean.getShortIntro());
        rdAlbumBean.setIntro(programBean.getIntro());
        rdAlbumBean.setAuthorized(programBean.isAlbumAuthorized());
        rdAlbumBean.setPaymentType(programBean.getAlbumPaymentType());
        rdAlbumBean.setSubscribe(programBean.isAuthorized());
        rdAlbumBean.setFromSource(programBean.getFromSource());
        rdAlbumBean.setCategoryName(programBean.getCategoryName());
        rdAlbumBean.setCardId(programBean.getCardId());
        return rdAlbumBean;
    }

    public static RdAlbumBean a(ReadLoveInfo readLoveInfo) {
        RdAlbumBean rdAlbumBean = new RdAlbumBean();
        rdAlbumBean.setId(readLoveInfo.getAlbumId());
        rdAlbumBean.setUpdateTime(readLoveInfo.getUpdateTime());
        rdAlbumBean.setLargeLogo(readLoveInfo.getLargeLogo());
        rdAlbumBean.setMediumLogo(readLoveInfo.getMediumLogo());
        rdAlbumBean.setSmallLogo(readLoveInfo.getLogo());
        rdAlbumBean.setTitle(readLoveInfo.getAlbumName());
        XmArtistBean xmArtistBean = new XmArtistBean();
        xmArtistBean.setId(readLoveInfo.getArtistId());
        xmArtistBean.setName(readLoveInfo.getArtist());
        rdAlbumBean.setArtist(xmArtistBean);
        rdAlbumBean.setPlayCount(readLoveInfo.getPlayCount());
        rdAlbumBean.setShortIntro(readLoveInfo.getShortIntro());
        rdAlbumBean.setIntro(readLoveInfo.getIntro());
        rdAlbumBean.setAuthorized(readLoveInfo.getAuthorized());
        rdAlbumBean.setPaymentType(readLoveInfo.getPaymentType());
        rdAlbumBean.setCategoryName(readLoveInfo.getCategoryName());
        return rdAlbumBean;
    }

    public static HeadSpeechHistoryRecord a(ProgramBean programBean, int i, int i2) {
        HeadSpeechHistoryRecord headSpeechHistoryRecord = new HeadSpeechHistoryRecord();
        headSpeechHistoryRecord.setAlbumId(programBean.getAlbumId());
        headSpeechHistoryRecord.setTrackId(programBean.getTrackId());
        headSpeechHistoryRecord.setChannelId(programBean.getChannelId());
        headSpeechHistoryRecord.setCardId(programBean.getCardId());
        headSpeechHistoryRecord.setTotalPage(i2);
        headSpeechHistoryRecord.setSeek(i);
        return headSpeechHistoryRecord;
    }

    public static ReadLoveInfo a(RdAlbumBean rdAlbumBean, long j) {
        ReadLoveInfo readLoveInfo = new ReadLoveInfo();
        readLoveInfo.setTs(j);
        readLoveInfo.setAlbumId(rdAlbumBean.getId());
        readLoveInfo.setAlbumName(rdAlbumBean.getTitle());
        readLoveInfo.setArtist(rdAlbumBean.getArtist().getName());
        readLoveInfo.setLogo(rdAlbumBean.getSmallLogo());
        readLoveInfo.setMediumLogo(rdAlbumBean.getMediumLogo());
        readLoveInfo.setLargeLogo(rdAlbumBean.getLargeLogo());
        readLoveInfo.setUpdateTime(rdAlbumBean.getUpdateTime());
        readLoveInfo.setArtistId(rdAlbumBean.getArtist().getId());
        readLoveInfo.setUid(aqh.a().c());
        readLoveInfo.setPlayCount(rdAlbumBean.getPlayCount());
        readLoveInfo.setShortIntro(rdAlbumBean.getShortIntro());
        readLoveInfo.setIntro(rdAlbumBean.getIntro());
        readLoveInfo.setAuthorized(rdAlbumBean.isAuthorized());
        readLoveInfo.setPaymentType(rdAlbumBean.getPaymentType());
        readLoveInfo.setCategoryName(rdAlbumBean.getCategoryName());
        return readLoveInfo;
    }

    public static ReadLoveInfo b(ReadHistoryInfo readHistoryInfo) {
        ReadLoveInfo readLoveInfo = new ReadLoveInfo();
        readLoveInfo.setTs(System.currentTimeMillis());
        readLoveInfo.setAlbumId(readHistoryInfo.getAlbumId());
        readLoveInfo.setAlbumName(readHistoryInfo.getAlbumName());
        readLoveInfo.setArtist(readHistoryInfo.getArtist());
        readLoveInfo.setLogo(readHistoryInfo.getLogo());
        readLoveInfo.setUpdateTime(readHistoryInfo.getUpdateTime());
        readLoveInfo.setMediumLogo(readHistoryInfo.getMediumLogo());
        readLoveInfo.setLargeLogo(readHistoryInfo.getLargeLogo());
        readLoveInfo.setArtistId(readHistoryInfo.getArtistId());
        readLoveInfo.setUid(aqh.a().c());
        readLoveInfo.setIntro(readHistoryInfo.getIntro());
        readLoveInfo.setShortIntro(readHistoryInfo.getShortIntro());
        readLoveInfo.setPlayCount(readHistoryInfo.getPlayCount());
        readLoveInfo.setPaymentType(readHistoryInfo.getPaymentType());
        readLoveInfo.setAuthorized(readHistoryInfo.isAuthorized());
        return readLoveInfo;
    }

    public static awk c(ProgramBean programBean) {
        if (programBean == null) {
            return null;
        }
        awk awkVar = new awk();
        awkVar.e(programBean.getAlbumId());
        awkVar.d(programBean.getAlbumLogo());
        awkVar.c(programBean.getArtistId());
        awkVar.l(programBean.getAlbumName());
        awkVar.c(programBean.getCategoryName());
        awkVar.b(programBean.getDuration());
        awkVar.b(programBean.getFromSource());
        awkVar.f(programBean.getIntro());
        awkVar.j(programBean.getLargeLogo());
        awkVar.k(programBean.getMediumLogo());
        awkVar.g(programBean.getListenUrl());
        awkVar.c(programBean.getOrderNum());
        awkVar.a(programBean.getPlayCount());
        awkVar.a(programBean.getPosition());
        awkVar.e(programBean.getShortIntro());
        awkVar.i(programBean.getSmallLogo());
        awkVar.h(programBean.getTitle());
        awkVar.b(programBean.getTrackId());
        awkVar.a(programBean.getType());
        awkVar.d(programBean.getUpdateTime());
        return awkVar;
    }

    public static ProgramBean a(TodayNewsChannelBean.DataBean.TrackInfoBosItem trackInfoBosItem, int i, String str) {
        if (trackInfoBosItem == null) {
            return null;
        }
        ProgramBean programBean = new ProgramBean();
        programBean.setTrackId(trackInfoBosItem.getId());
        programBean.setTitle(trackInfoBosItem.getTitle());
        programBean.setSmallLogo(trackInfoBosItem.getSmallLogo());
        programBean.setMediumLogo(trackInfoBosItem.getMediumLogo());
        programBean.setLargeLogo(trackInfoBosItem.getLargeLogo());
        programBean.setArtistId(trackInfoBosItem.getArtist().getId());
        programBean.setListenUrl(trackInfoBosItem.getListenUrl());
        programBean.setArtistName(trackInfoBosItem.getArtist().getName());
        programBean.setDuration(trackInfoBosItem.getDuration());
        programBean.setUpdateTime(trackInfoBosItem.getUpdateTime());
        try {
            programBean.setAlbumId(Long.parseLong(str));
        } catch (Exception unused) {
        }
        programBean.setOriginalAlbumId(trackInfoBosItem.getOriginAlbumId());
        programBean.setAlbumName(trackInfoBosItem.getArtist().getName());
        programBean.setOrderNum(trackInfoBosItem.getOrderNum());
        programBean.setAlbumLogo(trackInfoBosItem.getMediumLogo());
        programBean.setChannelId(i);
        return programBean;
    }

    public static ProgramBean a(TodayNewsCardBean.DataBean.ListBean.TrackInfoBosBean trackInfoBosBean, TodayNewsCardBean.DataBean.ListBean listBean) {
        if (trackInfoBosBean == null) {
            return null;
        }
        ProgramBean programBean = new ProgramBean();
        programBean.setTrackId(trackInfoBosBean.getId());
        programBean.setTitle(trackInfoBosBean.getTitle());
        programBean.setSmallLogo(listBean.getImage1().getCoverUrl());
        programBean.setMediumLogo(listBean.getImage1().getCoverUrl());
        programBean.setLargeLogo(listBean.getImage1().getCoverUrl());
        programBean.setArtistId(trackInfoBosBean.getArtist().getId());
        programBean.setListenUrl(trackInfoBosBean.getListenUrl());
        programBean.setArtistName(listBean.getCardTitle());
        programBean.setDuration(trackInfoBosBean.getDuration());
        programBean.setUpdateTime(trackInfoBosBean.getUpdateTime());
        programBean.setCreateTime(trackInfoBosBean.getCreateTime());
        programBean.setAlbumId(listBean.getCardId());
        programBean.setOriginalAlbumId(listBean.getCardId());
        programBean.setAlbumName(listBean.getCardTitle());
        programBean.setOrderNum(trackInfoBosBean.getOrderNum());
        programBean.setAlbumLogo(listBean.getImage1().getCoverUrl());
        programBean.setCardId(listBean.getCardId());
        return programBean;
    }

    public static ProgramBean a(FMAlbumTracksBean.DataBean.ListBean listBean, TodayNewsCardBean.DataBean.ListBean listBean2) {
        if (listBean == null) {
            return null;
        }
        ProgramBean programBean = new ProgramBean();
        programBean.setTrackId(listBean.getId());
        programBean.setTitle(listBean.getTitle());
        programBean.setSmallLogo(listBean2.getImage1().getCoverUrl());
        programBean.setMediumLogo(listBean2.getImage1().getCoverUrl());
        programBean.setLargeLogo(listBean2.getImage1().getCoverUrl());
        programBean.setArtistId(listBean.getArtist().getId());
        programBean.setListenUrl(listBean.getListenUrl());
        programBean.setArtistName(listBean2.getCardTitle());
        programBean.setDuration(listBean.getDuration());
        programBean.setUpdateTime(listBean.getUpdateTime());
        programBean.setCreateTime(listBean.getCreateTime());
        programBean.setAlbumId(listBean2.getCardId());
        programBean.setOriginalAlbumId(listBean2.getCardId());
        programBean.setAlbumName(listBean2.getCardTitle());
        programBean.setOrderNum(listBean.getOrderNum());
        programBean.setAlbumLogo(listBean2.getImage1().getCoverUrl());
        programBean.setCardId(listBean2.getCardId());
        return programBean;
    }
}
