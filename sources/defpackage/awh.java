package defpackage;

import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
/* compiled from: IProgramService.java */
/* renamed from: awh  reason: default package */
/* loaded from: classes2.dex */
public interface awh {
    boolean favMusicOrNot(boolean z);

    String getListSign();

    String getLogo4TodayNews(long j);

    awk getPlayingInfo();

    boolean isCanCollected();

    void openGuessLike();

    void openProgramHistory();

    void pause();

    void playReading(RdAlbumBean rdAlbumBean);

    void updateAlbumInfo4TodayNews(long j);
}
