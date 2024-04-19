package com.nforetek.bt.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: UiCallbackA2dp.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void a();

    void a(String str, int i, int i2);

    /* compiled from: UiCallbackA2dp.java */
    /* renamed from: com.nforetek.bt.aidl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0107a extends Binder implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public AbstractBinderC0107a() {
            attachInterface(this, "com.nforetek.bt.aidl.UiCallbackA2dp");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.nforetek.bt.aidl.UiCallbackA2dp");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0108a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.nforetek.bt.aidl.UiCallbackA2dp");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackA2dp");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackA2dp");
                    a(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: UiCallbackA2dp.java */
        /* renamed from: com.nforetek.bt.aidl.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0108a implements a {
            private IBinder a;

            C0108a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.nforetek.bt.aidl.a
            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackA2dp");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.a
            public void a(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackA2dp");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
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
