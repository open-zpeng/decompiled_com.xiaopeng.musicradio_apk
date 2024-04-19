package com.nforetek.bt.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: UiCallbackAvrcp.java */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void a();

    void a(byte b);

    void a(byte b, byte[] bArr);

    void a(int i);

    void a(int i, int i2);

    void a(int i, int i2, byte b);

    void a(int i, long j);

    void a(long j);

    void a(long j, long j2, byte b);

    void a(String str, int i, int i2);

    void a(String str, String str2, String str3);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    void a(int[] iArr, String[] strArr);

    void a(String[] strArr, int i, long j);

    void b();

    void b(byte b);

    void b(int i, long j);

    void b(long j);

    void b(byte[] bArr);

    void b(byte[] bArr, byte[] bArr2);

    void b(int[] iArr, String[] strArr);

    void c();

    void c(byte b);

    void c(int i, long j);

    void c(long j);

    void d();

    void d(byte b);

    void e();

    void e(byte b);

    void f();

    void f(byte b);

    void g();

    void g(byte b);

    void h();

    void i();

    /* compiled from: UiCallbackAvrcp.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.nforetek.bt.aidl.UiCallbackAvrcp");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0109a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.nforetek.bt.aidl.UiCallbackAvrcp");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readByte(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.createIntArray(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readLong(), parcel.readLong(), parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    c(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    c();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    d(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    e(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b(parcel.createByteArray(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    f();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    f(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    g();
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.createStringArray(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    c(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    b(parcel.createIntArray(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    h();
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    c(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    i();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    g(parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readInt(), parcel.readInt(), parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    a(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: UiCallbackAvrcp.java */
        /* renamed from: com.nforetek.bt.aidl.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0109a implements b {
            private IBinder a;

            C0109a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.nforetek.bt.aidl.b
            public void a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
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

            @Override // com.nforetek.bt.aidl.b
            public void a(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByteArray(bArr);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByteArray(bArr);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(byte b, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    obtain.writeByteArray(bArr);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(byte[] bArr, byte[] bArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(int[] iArr, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeIntArray(iArr);
                    obtain.writeStringArray(strArr);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(long j, long j2, byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    obtain.writeByte(b);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void c(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeLong(j);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeLong(j);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void d(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void e(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b(byte[] bArr, byte[] bArr2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeInt(i);
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void f(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(String[] strArr, int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b(int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void c(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeLong(j);
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void b(int[] iArr, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeIntArray(iArr);
                    obtain.writeStringArray(strArr);
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void c(int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void g(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeByte(b);
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(int i, int i2, byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeByte(b);
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.b
            public void a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCallbackAvrcp");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
