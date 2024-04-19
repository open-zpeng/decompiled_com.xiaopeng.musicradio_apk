package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.speech.actor.Actor;
/* compiled from: IActorBridge.java */
/* renamed from: beq  reason: default package */
/* loaded from: classes2.dex */
public interface beq extends IInterface {
    void a(Actor actor);

    /* compiled from: IActorBridge.java */
    /* renamed from: beq$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements beq {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.xiaopeng.speech.IActorBridge");
        }

        public static beq a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaopeng.speech.IActorBridge");
            if (queryLocalInterface != null && (queryLocalInterface instanceof beq)) {
                return (beq) queryLocalInterface;
            }
            return new C0060a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.xiaopeng.speech.IActorBridge");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.xiaopeng.speech.IActorBridge");
            a(parcel.readInt() != 0 ? Actor.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        /* compiled from: IActorBridge.java */
        /* renamed from: beq$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0060a implements beq {
            private IBinder a;

            C0060a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.beq
            public void a(Actor actor) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.IActorBridge");
                    if (actor != null) {
                        obtain.writeInt(1);
                        actor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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
