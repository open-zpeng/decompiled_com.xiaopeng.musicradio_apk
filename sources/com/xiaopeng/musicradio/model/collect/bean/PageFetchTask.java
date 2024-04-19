package com.xiaopeng.musicradio.model.collect.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
@Keep
/* loaded from: classes.dex */
public class PageFetchTask implements Serializable {
    @SerializedName("openId")
    public String openId;
    @SerializedName("page")
    public int page;
    @SerializedName("totalPage")
    public int totalPage;

    public PageFetchTask(String str, int i, int i2) {
        this.openId = str;
        this.page = i;
        this.totalPage = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.openId, ((PageFetchTask) obj).openId);
    }

    public int hashCode() {
        return Objects.hash(this.openId);
    }

    public String toString() {
        return "PageFetchTask{openId='" + this.openId + "', page=" + this.page + ", totalPage=" + this.totalPage + '}';
    }
}
