package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: IWindowEngine.java */
/* renamed from: bey  reason: default package */
/* loaded from: classes2.dex */
public interface bey extends IInterface {
    void a(int i, int i2);

    void a(int i, boolean z);

    boolean a(int i);

    int b();

    void b(int i);

    void c(int i);

    void d(int i);

    /* compiled from: IWindowEngine.java */
    /* renamed from: bey$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements bey {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.xiaopeng.speech.IWindowEngine");
        }

        public static bey a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaopeng.speech.IWindowEngine");
            if (queryLocalInterface != null && (queryLocalInterface instanceof bey)) {
                return (bey) queryLocalInterface;
            }
            return new C0067a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaopeng.speech.IWindowEngine");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    int b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    boolean a = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    b(parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    c(parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    d(parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    a(parcel.readInt(), parcel.readInt());
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaopeng.speech.IWindowEngine");
                    a(parcel.readInt(), parcel.readInt() != 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: IWindowEngine.java */
        /* renamed from: bey$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0067a implements bey {
            private IBinder a;

            C0067a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.bey
            public int b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bey
            public boolean a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bey
            public void b(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    obtain.writeInt(i);
                    this.a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // defpackage.bey
            public void c(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    obtain.writeInt(i);
                    this.a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // defpackage.bey
            public void d(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    obtain.writeInt(i);
                    this.a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // defpackage.bey
            public void a(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // defpackage.bey
            public void a(int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IWindowEngine");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
