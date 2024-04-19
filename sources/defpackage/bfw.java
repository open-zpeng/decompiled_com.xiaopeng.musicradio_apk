package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: ISpeechConfigCallback.java */
/* renamed from: bfw  reason: default package */
/* loaded from: classes2.dex */
public interface bfw extends IInterface {
    void a(int i, String str);

    /* compiled from: ISpeechConfigCallback.java */
    /* renamed from: bfw$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements bfw {
        public static bfw a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaopeng.speech.coreapi.ISpeechConfigCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof bfw)) {
                return (bfw) queryLocalInterface;
            }
            return new C0076a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.xiaopeng.speech.coreapi.ISpeechConfigCallback");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.xiaopeng.speech.coreapi.ISpeechConfigCallback");
            a(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* compiled from: ISpeechConfigCallback.java */
        /* renamed from: bfw$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0076a implements bfw {
            private IBinder a;

            C0076a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.bfw
            public void a(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.coreapi.ISpeechConfigCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
