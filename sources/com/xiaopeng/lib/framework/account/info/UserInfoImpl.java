package com.xiaopeng.lib.framework.account.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaopeng.lib.framework.account.utils.L;
import com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo;
/* loaded from: classes.dex */
public class UserInfoImpl implements Parcelable, IUserInfo {
    public static final Parcelable.Creator<UserInfoImpl> CREATOR = new Parcelable.Creator<UserInfoImpl>() { // from class: com.xiaopeng.lib.framework.account.info.UserInfoImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserInfoImpl createFromParcel(Parcel parcel) {
            return new UserInfoImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserInfoImpl[] newArray(int i) {
            return new UserInfoImpl[i];
        }
    };
    public static final int GRADE_DRIVER = 4;
    public static final int GRADE_OWNER = 1;
    public static final int GRADE_TEMP = -1;
    public static final int GRADE_TENANT = 3;
    public static final int GRADE_USER = 2;
    private static final String TAG = "UserInfoImpl";
    private String mAvatar;
    private String mUserName;
    private IUserInfo.UserType mUserType = IUserInfo.UserType.TEMP;
    private IUserInfo.InfoType mInfoType = IUserInfo.InfoType.UPDATE;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UserInfoImpl() {
    }

    public UserInfoImpl(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo setUserName(String str) {
        this.mUserName = str;
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public String getUserName() {
        return this.mUserName;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo.UserType getUserType() {
        return this.mUserType;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo setUserType(IUserInfo.UserType userType) {
        this.mUserType = userType;
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo setUserType(int i) {
        if (i == -1) {
            this.mUserType = IUserInfo.UserType.TEMP;
        } else {
            switch (i) {
                case 1:
                    this.mUserType = IUserInfo.UserType.OWNER;
                    break;
                case 2:
                    this.mUserType = IUserInfo.UserType.USER;
                    break;
                case 3:
                    this.mUserType = IUserInfo.UserType.TENANT;
                    break;
                case 4:
                    this.mUserType = IUserInfo.UserType.DRIVER;
                    break;
                default:
                    this.mUserType = IUserInfo.UserType.TEMP;
                    break;
            }
        }
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public String getAvatar() {
        return this.mAvatar;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo setAvatar(String str) {
        this.mAvatar = str;
        return this;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo.InfoType getInfoType() {
        return this.mInfoType;
    }

    @Override // com.xiaopeng.lib.framework.moduleinterface.accountmodule.IUserInfo
    public IUserInfo setInfoType(IUserInfo.InfoType infoType) {
        this.mInfoType = infoType;
        return this;
    }

    public void readFromParcel(Parcel parcel) {
        this.mUserName = parcel.readString();
        int readInt = parcel.readInt();
        this.mAvatar = parcel.readString();
        int readInt2 = parcel.readInt();
        L.v(TAG, "UserInfoImpl type=" + readInt);
        if (readInt >= 0 && readInt < IUserInfo.UserType.values().length) {
            this.mUserType = IUserInfo.UserType.values()[readInt];
        } else {
            L.v(TAG, "UserInfoImpl mUserType is ArrayIndexOutBoundsException");
        }
        if (readInt2 >= 0 && readInt2 < IUserInfo.InfoType.values().length) {
            this.mInfoType = IUserInfo.InfoType.values()[readInt2];
        } else {
            L.v(TAG, "UserInfoImpl mUserType is ArrayIndexOutBoundsException");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        L.v(TAG, "writeToParcel mUserType=" + this.mUserType.ordinal() + ";mInfoType=" + this.mInfoType.ordinal());
        parcel.writeString(this.mUserName);
        parcel.writeInt(this.mUserType.ordinal());
        parcel.writeString(this.mAvatar);
        parcel.writeInt(this.mInfoType.ordinal());
    }

    public String toString() {
        return "UserInfoImpl;{ mUserName=" + this.mUserName + " mUserType=" + this.mUserType + " mAvatar=" + this.mAvatar + " mInfoType=" + this.mInfoType + " }";
    }
}
