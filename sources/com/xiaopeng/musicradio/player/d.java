package com.xiaopeng.musicradio.player;

import android.os.Bundle;
/* compiled from: IPlayerOperation.java */
/* loaded from: classes2.dex */
public interface d {
    int getCurrentPosition();

    int getDuration();

    int getPlaybackState();

    int getSecondPosition();

    int getSessionId();

    float getVolume();

    boolean isIdle();

    boolean isPlaying();

    void pause();

    void prepareData(String str);

    void prepareData(String str, boolean z);

    void prepareData(String str, boolean z, boolean z2);

    void prepareData(String str, boolean z, boolean z2, boolean z3);

    void release();

    void reset();

    void seekTo(int i);

    void setData(Bundle bundle);

    void setPlaySpeed(float f);

    void setVolume(float f, float f2);

    void start();

    void startSeek();

    void stop();
}
