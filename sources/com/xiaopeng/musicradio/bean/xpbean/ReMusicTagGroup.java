package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ReMusicTagGroup implements Serializable {
    private static final long serialVersionUID = 45;
    private String description;
    private ArrayList<ReMusicTagInfo> labelInfoBos;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public ArrayList<ReMusicTagInfo> getLabelInfoBos() {
        return this.labelInfoBos;
    }

    public void setLabelInfoBos(ArrayList<ReMusicTagInfo> arrayList) {
        this.labelInfoBos = arrayList;
    }
}
