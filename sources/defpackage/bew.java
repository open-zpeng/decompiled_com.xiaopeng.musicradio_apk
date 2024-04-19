package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.beq;
import defpackage.ber;
import defpackage.bet;
import defpackage.bev;
import defpackage.bex;
import defpackage.bey;
import defpackage.bfl;
import defpackage.bfq;
import defpackage.bfr;
import defpackage.bfs;
import defpackage.bfu;
import defpackage.bfv;
import defpackage.bfx;
import defpackage.bfz;
import defpackage.bga;
import defpackage.bgb;
/* compiled from: ISpeechEngine.java */
/* renamed from: bew  reason: default package */
/* loaded from: classes2.dex */
public interface bew extends IInterface {
    beq a();

    bfx b();

    bfz c();

    bgb d();

    bfr e();

    bfs f();

    bex g();

    bev h();

    bfq i();

    bet j();

    bfv k();

    bey l();

    bfl m();

    bfu n();

    ber o();

    bga p();

    /* compiled from: ISpeechEngine.java */
    /* renamed from: bew$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements bew {
        public static bew a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaopeng.speech.ISpeechEngine");
            if (queryLocalInterface != null && (queryLocalInterface instanceof bew)) {
                return (bew) queryLocalInterface;
            }
            return new C0065a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaopeng.speech.ISpeechEngine");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    beq a = a();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfx b = b();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfz c = c();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(c != null ? c.asBinder() : null);
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bgb d = d();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(d != null ? d.asBinder() : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfr e = e();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(e != null ? e.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfs f = f();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(f != null ? f.asBinder() : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bex g = g();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(g != null ? g.asBinder() : null);
                    return true;
                case 8:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bev h = h();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(h != null ? h.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfq i3 = i();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(i3 != null ? i3.asBinder() : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bet j = j();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(j != null ? j.asBinder() : null);
                    return true;
                case 11:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfv k = k();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(k != null ? k.asBinder() : null);
                    return true;
                case 12:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bey l = l();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(l != null ? l.asBinder() : null);
                    return true;
                case 13:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfl m = m();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(m != null ? m.asBinder() : null);
                    return true;
                case 14:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bfu n = n();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(n != null ? n.asBinder() : null);
                    return true;
                case 15:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    ber o = o();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(o != null ? o.asBinder() : null);
                    return true;
                case 16:
                    parcel.enforceInterface("com.xiaopeng.speech.ISpeechEngine");
                    bga p = p();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(p != null ? p.asBinder() : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ISpeechEngine.java */
        /* renamed from: bew$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0065a implements bew {
            private IBinder a;

            C0065a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.bew
            public beq a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return beq.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfx b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfx.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfz c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfz.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bgb d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return bgb.a.i(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfr e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfr.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfs f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfs.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bex g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return bex.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bev h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return bev.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfq i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfq.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bet j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return bet.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfv k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfv.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bey l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return bey.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfl m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfl.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bfu n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return bfu.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public ber o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return ber.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // defpackage.bew
            public bga p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.xiaopeng.speech.ISpeechEngine");
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return bga.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
