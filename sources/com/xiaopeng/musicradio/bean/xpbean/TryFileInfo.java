package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class TryFileInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int fileSize;
    private String playUrl;
    private int tryBegin;
    private int tryEnd;

    public int getTryBegin() {
        return this.tryBegin;
    }

    public void setTryBegin(int i) {
        this.tryBegin = i;
    }

    public int getTryEnd() {
        return this.tryEnd;
    }

    public void setTryEnd(int i) {
        this.tryEnd = i;
    }

    public int getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(int i) {
        this.fileSize = i;
    }

    public String getPlayUrl() {
        return this.playUrl;
    }

    public void setPlayUrl(String str) {
        this.playUrl = str;
    }
}
