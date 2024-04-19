package defpackage;
/* compiled from: IMusicService.java */
/* renamed from: arf  reason: default package */
/* loaded from: classes2.dex */
public interface arf {
    void clearUserData();

    boolean favMusicOrNot(Object obj);

    boolean favMusicOrNot(boolean z);

    String getListSign();

    arg getPlayingBtInfo();

    arh getPlayingInfo();

    boolean isBtConnect();

    boolean isCanCollected();

    boolean isInCall();

    boolean isInCall(boolean z);

    boolean isLove(Object obj);

    boolean isQualityPageOpend();

    void pause();

    void play();

    void playDailyMusic();

    void playHotMusic(String str);

    void playMusic(String str);

    void playMusic(String str, String str2, String str3);

    void playMusicByListSign(String str);

    void querySearchHotSongs(arj arjVar);

    void recordMusicCollect(long j, String str, String str2);

    void resetPlayList();

    void resetUserData();

    void startCollectDetail(long j, String str, String str2, String str3);
}
