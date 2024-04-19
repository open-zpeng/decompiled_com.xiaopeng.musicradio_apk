package com.nforetek.bt.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: UiCallbackHid.java */
/* loaded from: classes.dex */
public interface f extends IInterface {
    void a();

    void a(String str, int i, int i2, int i3);

    /* compiled from: UiCallbackHid.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements f {
        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.nforetek.bt.aidl.UiCallbackHid");
            if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                return (f) queryLocalInterface;
            }
            return new C0113a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.nforetek.bt.aidl.UiCallbackHid");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackHid");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackHid");
                    a(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: UiCallbackHid.java */
        /* renamed from: com.nforetek.bt.aidl.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0113a implements f {
            private IBinder a;

            C0113a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.nforetek.bt.aidl.f
            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackHid");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.f
            public void a(String str, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackHid");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
