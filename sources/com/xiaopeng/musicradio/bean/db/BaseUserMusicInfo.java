package com.xiaopeng.musicradio.bean.db;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.BaseInfo;
/* loaded from: classes.dex */
public abstract class BaseUserMusicInfo extends BaseInfo {
    public abstract String getHash();

    public abstract String getLogo();

    public abstract int getMusicFrom();

    public abstract int getPlayState();

    public abstract String getSinger();

    public abstract String getSong();

    public abstract long getTs();

    public abstract String getUid();

    public abstract void setHash(String str);

    public abstract void setLogo(String str);

    public abstract void setMusicFrom(int i);

    public abstract int setPlayState(int i);

    public abstract void setSinger(String str);

    public abstract void setSong(String str);

    public abstract void setTs(long j);

    public abstract void setUid(String str);

    public boolean enableLove() {
        return !TextUtils.isEmpty(getHash());
    }
}
