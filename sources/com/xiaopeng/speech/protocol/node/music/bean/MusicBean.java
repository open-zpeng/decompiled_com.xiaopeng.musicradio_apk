package com.xiaopeng.speech.protocol.node.music.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaopeng.speech.common.bean.BaseBean;
/* loaded from: classes2.dex */
public class MusicBean extends BaseBean {
    public static final Parcelable.Creator<MusicBean> CREATOR = new Parcelable.Creator<MusicBean>() { // from class: com.xiaopeng.speech.protocol.node.music.bean.MusicBean.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MusicBean createFromParcel(Parcel parcel) {
            return new MusicBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MusicBean[] newArray(int i) {
            return new MusicBean[i];
        }
    };
    private String extData;
    private String keyWord;
    private int listed;
    private String metaDataList;
    private String metadata;
    private String page;
    private String params;
    private int searchType;
    private String source;
    private String tracks;

    public MusicBean() {
    }

    protected MusicBean(Parcel parcel) {
        super(parcel);
        this.params = parcel.readString();
        this.tracks = parcel.readString();
        this.page = parcel.readString();
        this.metadata = parcel.readString();
        this.keyWord = parcel.readString();
        this.source = parcel.readString();
        this.searchType = parcel.readInt();
        this.listed = parcel.readInt();
        this.extData = parcel.readString();
        this.metaDataList = parcel.readString();
    }

    @Override // com.xiaopeng.speech.common.bean.BaseBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.params);
        parcel.writeString(this.tracks);
        parcel.writeString(this.page);
        parcel.writeString(this.metadata);
        parcel.writeString(this.keyWord);
        parcel.writeString(this.source);
        parcel.writeInt(this.searchType);
        parcel.writeInt(this.listed);
        parcel.writeString(this.extData);
        parcel.writeString(this.metaDataList);
    }

    public String toString() {
        return "MusicBean{params='" + this.params + "', tracks='" + this.tracks + "', page='" + this.page + "', metadata='" + this.metadata + "', keyWord='" + this.keyWord + "', source='" + this.source + "', searchType=" + this.searchType + ", listed=" + this.listed + ", extData=" + this.extData + '}';
    }
}
