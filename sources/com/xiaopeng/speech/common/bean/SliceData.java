package com.xiaopeng.speech.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class SliceData implements Parcelable {
    public static final Parcelable.Creator<SliceData> CREATOR = new Parcelable.Creator<SliceData>() { // from class: com.xiaopeng.speech.common.bean.SliceData.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SliceData createFromParcel(Parcel parcel) {
            return new SliceData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SliceData[] newArray(int i) {
            return new SliceData[i];
        }
    };
    private byte[] data;
    private int totalLength;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected SliceData(Parcel parcel) {
        this.data = parcel.readBlob();
        this.totalLength = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBlob(this.data);
        parcel.writeInt(this.totalLength);
    }

    public String toString() {
        return "SliceData{data=" + Arrays.toString(this.data) + ", totalLength=" + this.totalLength + '}';
    }
}
