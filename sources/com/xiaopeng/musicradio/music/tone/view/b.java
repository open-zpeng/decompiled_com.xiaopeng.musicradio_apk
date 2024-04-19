package com.xiaopeng.musicradio.music.tone.view;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
/* compiled from: ISingleSongQualityView.java */
/* loaded from: classes.dex */
public interface b {
    void onDismiss();

    void onRefreshCurMusicInfo(MusicInfo musicInfo);

    void onRefreshSelected(int i);
}
