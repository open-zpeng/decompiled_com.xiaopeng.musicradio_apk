package com.xiaopeng.lib.framework.account.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo;
/* loaded from: classes.dex */
public class OTPInfoImpl implements Parcelable, IOTPInfo {
    public static final Parcelable.Creator<OTPInfoImpl> CREATOR = new Parcelable.Creator<OTPInfoImpl>() { // from class: com.xiaopeng.lib.framework.account.otp.OTPInfoImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OTPInfoImpl createFromParcel(Parcel parcel) {
            return new OTPInfoImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OTPInfoImpl[] newArray(int i) {
            return new OTPInfoImpl[i];
        }
    };
    private long mUid = 0;
    private String mOTP = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public OTPInfoImpl() {
    }

    protected OTPInfoImpl(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mUid);
        parcel.writeString(this.mOTP);
    }

    private void readFromParcel(Parcel parcel) {
        this.mUid = parcel.readLong();
        this.mOTP = parcel.readString();
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo
    public long getUid() {
        return this.mUid;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo
    public String getOTP() {
        return this.mOTP;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo
    public void setUid(long j) {
        this.mUid = j;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IOTPInfo
    public void setOTP(String str) {
        this.mOTP = str;
    }

    public String toString() {
        return "OTPInfoImpl { uid=" + this.mUid + "; OTP=" + this.mOTP + "; }";
    }
}
