package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: IMusicMineService.java */
/* renamed from: ard  reason: default package */
/* loaded from: classes2.dex */
public interface ard {
    void fetchCollectedAlbum();

    void fetchCollectedAlbum(int i);

    void fetchCustomAlbumIfRequire();

    <T> T getBlueMusicList(int i);

    <T> T getCollectedAlbumList(Object obj);

    <T> T getCollectedMusicList(Object obj);

    <T> T getDetailPlayList(long j, Object obj);

    <T> T getHistoryAlbumList(Object obj);

    <T> T getHistoryMusicList(int i);

    String getListSign(Object obj);

    <T> T getMobileAlbumList(int i);

    int getPlayState();

    <T> T getPlayingMusic();

    <T> T getUserAlbumList(Object obj);

    boolean isCollectedAlbum(Object obj);

    boolean isCollectedMusic(Object obj);

    boolean isNewMatchedBlue(Object obj);

    void play(Object obj, ari ariVar);

    void play(List list, Object obj, String str);

    void playMusicInfo(Object obj, String str);

    <T> T removeBlueMusic(Object obj);

    <T> T removeHistoryAlbum(Object obj);

    <T> T removeHistoryMusic(Object obj);

    <T> T setCollectedAlbum(Object obj, boolean z);

    <T> T setCollectedMusic(Object obj, boolean z);

    void startDetail(Context context, Object obj, String str);
}
