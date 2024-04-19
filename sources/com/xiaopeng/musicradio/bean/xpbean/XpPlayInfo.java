package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class XpPlayInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int categoryId;
    private List<MusicRadioItem> collectList;
    private String name;

    public List<MusicRadioItem> getCollectList() {
        return this.collectList;
    }

    public void setCollectList(List<MusicRadioItem> list) {
        this.collectList = list;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
