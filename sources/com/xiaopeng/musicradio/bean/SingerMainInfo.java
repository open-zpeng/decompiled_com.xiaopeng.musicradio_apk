package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SingerMainInfo {
    private boolean mIsTitle;
    private String mLetter;
    private ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> mSingerBeans;
    private String mTitle;

    public String getmTitle() {
        return this.mTitle;
    }

    public void setmTitle(String str) {
        this.mTitle = str;
    }

    public ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> getmSingerBeans() {
        return this.mSingerBeans;
    }

    public void setmSingerBeans(ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> arrayList) {
        this.mSingerBeans = arrayList;
    }

    public boolean ismIsTitle() {
        return this.mIsTitle;
    }

    public void setmIsTitle(boolean z) {
        this.mIsTitle = z;
    }

    public String getmLetter() {
        return this.mLetter;
    }

    public void setmLetter(String str) {
        this.mLetter = str;
    }
}
