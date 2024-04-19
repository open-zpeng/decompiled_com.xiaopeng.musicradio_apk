package com.xiaopeng.speech.protocol.node.record.bean;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class RecordErrReason implements Parcelable {
    public static final Parcelable.Creator<RecordErrReason> CREATOR = new Parcelable.Creator<RecordErrReason>() { // from class: com.xiaopeng.speech.protocol.node.record.bean.RecordErrReason.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RecordErrReason createFromParcel(Parcel parcel) {
            return new RecordErrReason(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RecordErrReason[] newArray(int i) {
            return new RecordErrReason[i];
        }
    };
    public String msg;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static RecordErrReason a(String str) {
        RecordErrReason recordErrReason = new RecordErrReason();
        try {
            recordErrReason.msg = new JSONObject(str).optString("msg");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return recordErrReason;
    }

    public RecordErrReason() {
    }

    protected RecordErrReason(Parcel parcel) {
        this.msg = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.msg);
    }
}
