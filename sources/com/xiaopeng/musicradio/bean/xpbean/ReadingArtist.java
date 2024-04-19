package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* loaded from: classes.dex */
public class ReadingArtist implements Serializable {
    @SerializedName("id")
    private int mId;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("name")
    private String mName;

    public String getName() {
        return this.mName;
    }

    public String getLogo() {
        return this.mLogo;
    }

    public int getId() {
        return this.mId;
    }
}
