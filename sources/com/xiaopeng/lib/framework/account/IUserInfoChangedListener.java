package com.xiaopeng.lib.framework.account;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.lib.framework.account.info.UserInfoImpl;
/* loaded from: classes.dex */
public interface IUserInfoChangedListener extends IInterface {
    void notifyUserInfoChanged(UserInfoImpl userInfoImpl);

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IUserInfoChangedListener {
        private static final String DESCRIPTOR = "com.xiaopeng.lib.framework.account.IUserInfoChangedListener";
        static final int TRANSACTION_notifyUserInfoChanged = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUserInfoChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IUserInfoChangedListener)) {
                return (IUserInfoChangedListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            notifyUserInfoChanged(parcel.readInt() != 0 ? UserInfoImpl.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes.dex */
        private static class Proxy implements IUserInfoChangedListener {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xiaopeng.lib.framework.account.IUserInfoChangedListener
            public void notifyUserInfoChanged(UserInfoImpl userInfoImpl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (userInfoImpl != null) {
                        obtain.writeInt(1);
                        userInfoImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
