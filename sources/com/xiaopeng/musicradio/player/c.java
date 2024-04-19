package com.xiaopeng.musicradio.player;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: IPlayerClientInterface.java */
/* loaded from: classes2.dex */
public interface c extends IInterface {
    void a(int i, String str);

    void a(int i, String str, int i2);

    void a(int i, String str, int i2, int i3);

    void a(int i, String str, Bundle bundle);

    void a(int i, String str, String str2, long j);

    void a(int i, String str, boolean z);

    void b(int i, String str, int i2);

    /* compiled from: IPlayerClientInterface.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.xiaopeng.musicradio.player.IPlayerClientInterface");
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                return (c) queryLocalInterface;
            }
            return new C0154a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    a(parcel.readInt(), parcel.readString(), parcel.readInt());
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    b(parcel.readInt(), parcel.readString(), parcel.readInt());
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    a(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    a(parcel.readInt(), parcel.readString());
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: IPlayerClientInterface.java */
        /* renamed from: com.xiaopeng.musicradio.player.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0154a implements c {
            private IBinder a;

            C0154a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void a(int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void b(int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void a(int i, String str, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void a(int i, String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void a(int i, String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void a(int i, String str, String str2, long j) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j);
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.xiaopeng.musicradio.player.c
            public void a(int i, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.musicradio.player.IPlayerClientInterface");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
