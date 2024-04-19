package com.xiaopeng.musicradio.search.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class SearchResultServiceBean implements Parcelable {
    public static final Parcelable.Creator<SearchResultServiceBean> CREATOR = new Parcelable.Creator<SearchResultServiceBean>() { // from class: com.xiaopeng.musicradio.search.api.bean.SearchResultServiceBean.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SearchResultServiceBean createFromParcel(Parcel parcel) {
            return new SearchResultServiceBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SearchResultServiceBean[] newArray(int i) {
            return new SearchResultServiceBean[i];
        }
    };
    public static final int SEARCH_TYPE_MUSIC = 1;
    public static final int SEARCH_TYPE_READING = 2;
    public static final int SEARCH_TYPE_UNKNOWN = 0;
    private long albumId;
    private String albumLogoUrl;
    private String description;
    private boolean isLove;
    private int musicFrom;
    private boolean needVip;
    private long playCount;
    private int playState;
    private int searchType;
    private String songHash;
    private boolean supportSQ;
    private String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SearchResultServiceBean() {
    }

    public SearchResultServiceBean(Parcel parcel) {
        this.searchType = parcel.readInt();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.playCount = parcel.readLong();
        this.albumLogoUrl = parcel.readString();
        this.albumId = parcel.readLong();
        this.songHash = parcel.readString();
        this.isLove = parcel.readInt() > 0;
        this.playState = parcel.readInt();
        this.needVip = parcel.readInt() > 0;
        this.musicFrom = parcel.readInt();
        this.supportSQ = parcel.readInt() > 0;
    }

    public void a(int i) {
        this.playState = i;
    }

    public void a(boolean z) {
        this.isLove = z;
    }

    public void a(String str) {
        this.songHash = str;
    }

    public void a(long j) {
        this.albumId = j;
    }

    public void b(String str) {
        this.albumLogoUrl = str;
    }

    public void b(int i) {
        this.searchType = i;
    }

    public void c(String str) {
        this.title = str;
    }

    public void d(String str) {
        this.description = str;
    }

    public void b(long j) {
        this.playCount = j;
    }

    public void c(int i) {
        this.musicFrom = i;
    }

    public void b(boolean z) {
        this.supportSQ = z;
    }

    public void c(boolean z) {
        this.needVip = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.searchType);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeLong(this.playCount);
        parcel.writeString(this.albumLogoUrl);
        parcel.writeLong(this.albumId);
        parcel.writeString(this.songHash);
        parcel.writeInt(this.isLove ? 1 : 0);
        parcel.writeInt(this.playState);
        parcel.writeInt(this.needVip ? 1 : 0);
        parcel.writeInt(this.musicFrom);
        parcel.writeInt(this.supportSQ ? 1 : 0);
    }

    public String toString() {
        return String.format("SearchResultServiceBean[searchType:%d,title:%s, desc:%s, playCount:%d, album:%s, albumId:%d, songHash:%s,playstate:%d", Integer.valueOf(this.searchType), this.title, this.description, Long.valueOf(this.playCount), this.albumLogoUrl, Long.valueOf(this.albumId), this.songHash, Integer.valueOf(this.playState));
    }
}
