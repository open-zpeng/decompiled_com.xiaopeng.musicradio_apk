package com.xiaopeng.musicradio.bean.netradio;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class NetRadioTagGroup {
    private String description;
    private ArrayList<NetRadioTagInfo> labelInfoBos;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public ArrayList<NetRadioTagInfo> getLabelInfoBos() {
        return this.labelInfoBos;
    }

    public void setLabelInfoBos(ArrayList<NetRadioTagInfo> arrayList) {
        this.labelInfoBos = arrayList;
    }
}
