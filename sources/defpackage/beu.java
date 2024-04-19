package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.speech.common.bean.Value;
/* compiled from: IRemoteDataSensor.java */
/* renamed from: beu  reason: default package */
/* loaded from: classes2.dex */
public interface beu extends IInterface {
    Value a(String str, String str2);

    /* compiled from: IRemoteDataSensor.java */
    /* renamed from: beu$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements beu {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.xiaopeng.speech.IRemoteDataSensor");
        }

        public static beu a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaopeng.speech.IRemoteDataSensor");
            if (queryLocalInterface != null && (queryLocalInterface instanceof beu)) {
                return (beu) queryLocalInterface;
            }
            return new C0063a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.xiaopeng.speech.IRemoteDataSensor");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.xiaopeng.speech.IRemoteDataSensor");
            Value a = a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            if (a != null) {
                parcel2.writeInt(1);
                a.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        /* compiled from: IRemoteDataSensor.java */
        /* renamed from: beu$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0063a implements beu {
            private IBinder a;

            C0063a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.beu
            public Value a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IRemoteDataSensor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Value.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
