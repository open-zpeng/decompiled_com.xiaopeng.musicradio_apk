package com.nforetek.bt.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
/* loaded from: classes.dex */
public class UsbBluetoothDevice implements Parcelable {
    public static final Parcelable.Creator<UsbBluetoothDevice> CREATOR = new Parcelable.Creator<UsbBluetoothDevice>() { // from class: com.nforetek.bt.aidl.UsbBluetoothDevice.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UsbBluetoothDevice createFromParcel(Parcel parcel) {
            return new UsbBluetoothDevice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UsbBluetoothDevice[] newArray(int i) {
            return new UsbBluetoothDevice[i];
        }
    };
    private String mAddress;
    private String mName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected UsbBluetoothDevice(Parcel parcel) {
        this.mAddress = parcel.readStringNoHelper();
        this.mName = parcel.readStringNoHelper();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringNoHelper(this.mAddress);
        parcel.writeStringNoHelper(this.mName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mAddress.equals(((UsbBluetoothDevice) obj).mAddress);
    }

    public int hashCode() {
        return Objects.hash(this.mAddress);
    }
}
