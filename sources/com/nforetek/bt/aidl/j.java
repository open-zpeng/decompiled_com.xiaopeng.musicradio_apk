package com.nforetek.bt.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: UiCallbackSpp.java */
/* loaded from: classes.dex */
public interface j extends IInterface {
    void a();

    void a(int i, String[] strArr, String[] strArr2);

    void a(String str);

    void a(String str, int i);

    void a(String str, String str2, int i, int i2);

    void a(String str, byte[] bArr);

    void b(String str, int i);

    /* compiled from: UiCallbackSpp.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements j {
        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.nforetek.bt.aidl.UiCallbackSpp");
            if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                return (j) queryLocalInterface;
            }
            return new C0117a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.nforetek.bt.aidl.UiCallbackSpp");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    a(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    a(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    a(parcel.readInt(), parcel.createStringArray(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    a(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    b(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackSpp");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: UiCallbackSpp.java */
        /* renamed from: com.nforetek.bt.aidl.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0117a implements j {
            private IBinder a;

            C0117a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.nforetek.bt.aidl.j
            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.j
            public void a(String str, String str2, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.j
            public void a(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.j
            public void a(int i, String[] strArr, String[] strArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.j
            public void a(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.j
            public void b(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.j
            public void a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackSpp");
                    obtain.writeString(str);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
