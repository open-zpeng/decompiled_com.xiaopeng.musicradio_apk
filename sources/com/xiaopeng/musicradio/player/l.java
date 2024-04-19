package com.xiaopeng.musicradio.player;

import android.os.Bundle;
/* compiled from: PlayerCallback.java */
/* loaded from: classes2.dex */
public interface l {
    void loadingChange(String str, boolean z);

    void onDownloaded(String str, String str2, long j);

    void onPlayError(String str, int i);

    void onPlayPosition(String str, int i, int i2);

    void onSetData(String str, Bundle bundle);

    void onTimeLineChange(String str);

    void playState(String str, int i);
}
