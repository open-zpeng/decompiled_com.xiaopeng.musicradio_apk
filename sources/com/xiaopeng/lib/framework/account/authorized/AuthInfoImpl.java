package com.xiaopeng.lib.framework.account.authorized;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AuthInfoImpl implements Parcelable, IAuthInfo {
    public static final Parcelable.Creator<AuthInfoImpl> CREATOR = new Parcelable.Creator<AuthInfoImpl>() { // from class: com.xiaopeng.lib.framework.account.authorized.AuthInfoImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthInfoImpl createFromParcel(Parcel parcel) {
            return new AuthInfoImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthInfoImpl[] newArray(int i) {
            return new AuthInfoImpl[i];
        }
    };
    private String authCode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AuthInfoImpl() {
    }

    public AuthInfoImpl(JSONObject jSONObject) {
        this.authCode = jSONObject.getString("code");
    }

    public AuthInfoImpl(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo
    public String getAuthCode() {
        return this.authCode;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IAuthInfo
    public void setAuthCode(String str) {
        this.authCode = str;
    }

    public void readFromParcel(Parcel parcel) {
        this.authCode = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authCode);
    }

    public String toString() {
        return "AuthInfoImpl;{ authCode=" + this.authCode + " }";
    }
}
