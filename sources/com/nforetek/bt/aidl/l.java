package com.nforetek.bt.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.nforetek.bt.aidl.a;
import com.nforetek.bt.aidl.b;
import com.nforetek.bt.aidl.c;
import com.nforetek.bt.aidl.d;
import com.nforetek.bt.aidl.e;
import com.nforetek.bt.aidl.f;
import com.nforetek.bt.aidl.g;
import com.nforetek.bt.aidl.h;
import com.nforetek.bt.aidl.i;
import com.nforetek.bt.aidl.j;
import com.nforetek.bt.aidl.k;
import com.xiaopeng.speech.protocol.node.navi.bean.NaviPreferenceBean;
import java.util.List;
/* compiled from: UiCommand.java */
/* loaded from: classes.dex */
public interface l extends IInterface {
    void A(String str);

    boolean A();

    boolean B();

    boolean B(String str);

    boolean C();

    boolean C(String str);

    void D(String str);

    boolean D();

    int E(String str);

    boolean E();

    int F(String str);

    boolean F();

    boolean G();

    boolean G(String str);

    void H(String str);

    boolean H();

    boolean I();

    boolean I(String str);

    boolean J();

    boolean J(String str);

    boolean K();

    boolean K(String str);

    boolean L();

    boolean L(String str);

    String M();

    boolean M(String str);

    int N(String str);

    boolean N();

    boolean O();

    boolean O(String str);

    boolean P();

    boolean P(String str);

    String Q();

    boolean Q(String str);

    String R();

    boolean S();

    int T();

    boolean U();

    boolean V();

    boolean W();

    int X();

    int Y();

    int Z();

    String a();

    List<ParcelUuid> a(ParcelUuid parcelUuid);

    List<ParcelUuid> a(ParcelUuid parcelUuid, ParcelUuid parcelUuid2);

    void a(int i, int i2);

    void a(String str, String str2);

    void a(String str, String str2, int i);

    void a(String str, byte[] bArr);

    boolean a(byte b);

    boolean a(byte b, byte b2);

    boolean a(byte b, int i, long j);

    boolean a(byte b, long j);

    boolean a(float f);

    boolean a(int i);

    boolean a(int i, int i2, int i3, int i4);

    boolean a(int i, long j, byte b);

    boolean a(int i, ParcelUuid parcelUuid);

    boolean a(ParcelUuid parcelUuid, int i);

    boolean a(ParcelUuid parcelUuid, int i, int i2);

    boolean a(com.nforetek.bt.aidl.a aVar);

    boolean a(b bVar);

    boolean a(c cVar);

    boolean a(d dVar);

    boolean a(e eVar);

    boolean a(f fVar);

    boolean a(g gVar);

    boolean a(h hVar);

    boolean a(i iVar);

    boolean a(j jVar);

    boolean a(k kVar);

    boolean a(String str);

    boolean a(String str, int i, int i2);

    boolean a(String str, int i, int i2, int i3, int i4);

    boolean a(String str, int i, int i2, int i3, byte[] bArr);

    boolean a(String str, int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, boolean z, byte[] bArr);

    boolean a(String str, int i, String str2);

    boolean a(String str, int i, String str2, int i2);

    boolean a(String str, int i, String str2, boolean z);

    boolean a(String str, int i, boolean z, int i2, int i3, int i4, String str2, String str3, String str4, String str5, int i5, int i6);

    boolean a(String str, String str2, String str3);

    boolean a(String str, boolean z);

    boolean a(boolean z);

    String aA();

    void aB();

    void aC();

    int aD();

    boolean aE();

    String aF();

    void aG();

    void aH();

    String aI();

    boolean aJ();

    String aK();

    void aL();

    boolean aM();

    int aN();

    boolean aO();

    boolean aP();

    List<ParcelUuid> aQ();

    boolean aR();

    boolean aS();

    boolean aT();

    boolean aU();

    boolean aV();

    List<UsbBluetoothDevice> aW();

    String aX();

    String aY();

    String aZ();

    int aa();

    int ab();

    String ac();

    int ad();

    boolean ae();

    String af();

    int ag();

    int ah();

    List<NfHfpClientCall> ai();

    boolean aj();

    int ak();

    boolean al();

    boolean am();

    boolean an();

    boolean ao();

    boolean ap();

    boolean aq();

    boolean ar();

    String as();

    String at();

    void au();

    void av();

    boolean aw();

    boolean ax();

    int ay();

    boolean az();

    boolean b();

    boolean b(byte b);

    boolean b(byte b, int i, long j);

    boolean b(int i);

    boolean b(int i, int i2);

    boolean b(int i, ParcelUuid parcelUuid);

    boolean b(com.nforetek.bt.aidl.a aVar);

    boolean b(b bVar);

    boolean b(c cVar);

    boolean b(d dVar);

    boolean b(e eVar);

    boolean b(f fVar);

    boolean b(g gVar);

    boolean b(h hVar);

    boolean b(i iVar);

    boolean b(j jVar);

    boolean b(k kVar);

    boolean b(String str);

    boolean b(String str, int i, int i2);

    boolean b(String str, int i, int i2, int i3, int i4);

    boolean b(boolean z);

    int ba();

    void c(boolean z);

    boolean c();

    boolean c(byte b);

    boolean c(byte b, int i, long j);

    boolean c(int i);

    boolean c(String str);

    boolean c(String str, int i, int i2);

    boolean c(String str, int i, int i2, int i3, int i4);

    boolean d();

    boolean d(byte b);

    boolean d(int i);

    boolean d(String str);

    boolean d(boolean z);

    boolean e();

    boolean e(int i);

    boolean e(String str);

    boolean e(boolean z);

    boolean f();

    boolean f(int i);

    boolean f(String str);

    boolean f(boolean z);

    boolean g();

    boolean g(int i);

    boolean g(String str);

    boolean h();

    boolean h(int i);

    boolean h(String str);

    int i(int i);

    boolean i();

    boolean i(String str);

    String j(String str);

    boolean j();

    int k();

    boolean k(String str);

    int l(String str);

    boolean l();

    int m(String str);

    String m();

    void n();

    boolean n(String str);

    void o();

    boolean o(String str);

    int p();

    boolean p(String str);

    int q();

    boolean q(String str);

    boolean r();

    boolean r(String str);

    String s();

    void s(String str);

    void t(String str);

    boolean t();

    boolean u();

    boolean u(String str);

    boolean v();

    boolean v(String str);

    boolean w();

    boolean w(String str);

    boolean x();

    boolean x(String str);

    boolean y();

    boolean y(String str);

    boolean z();

    boolean z(String str);

    /* compiled from: UiCommand.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements l {
        public static l a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.nforetek.bt.aidl.UiCommand");
            if (queryLocalInterface != null && (queryLocalInterface instanceof l)) {
                return (l) queryLocalInterface;
            }
            return new C0119a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.nforetek.bt.aidl.UiCommand");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String a = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean d = d();
                    parcel2.writeNoException();
                    parcel2.writeInt(d ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean e = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(e ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean f = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(f ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean g = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(g ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean h = h();
                    parcel2.writeNoException();
                    parcel2.writeInt(h ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean i3 = i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3 ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean j = j();
                    parcel2.writeNoException();
                    parcel2.writeInt(j ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a2 = a(a.AbstractBinderC0107a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a2 ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b2 = b(a.AbstractBinderC0107a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b2 ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int k = k();
                    parcel2.writeNoException();
                    parcel2.writeInt(k);
                    return true;
                case 14:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean l = l();
                    parcel2.writeNoException();
                    parcel2.writeInt(l ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String m = m();
                    parcel2.writeNoException();
                    parcel2.writeString(m);
                    return true;
                case 16:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a3 = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a3 ? 1 : 0);
                    return true;
                case 17:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b3 = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(b3 ? 1 : 0);
                    return true;
                case 18:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    n();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    o();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a4 = a(parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeInt(a4 ? 1 : 0);
                    return true;
                case 21:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a5 = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a5 ? 1 : 0);
                    return true;
                case 22:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int p = p();
                    parcel2.writeNoException();
                    parcel2.writeInt(p);
                    return true;
                case 23:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a6 = a(b.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a6 ? 1 : 0);
                    return true;
                case 24:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b4 = b(b.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b4 ? 1 : 0);
                    return true;
                case 25:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int q = q();
                    parcel2.writeNoException();
                    parcel2.writeInt(q);
                    return true;
                case 26:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean r = r();
                    parcel2.writeNoException();
                    parcel2.writeInt(r ? 1 : 0);
                    return true;
                case 27:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String s = s();
                    parcel2.writeNoException();
                    parcel2.writeString(s);
                    return true;
                case 28:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c2 = c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(c2 ? 1 : 0);
                    return true;
                case 29:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean d2 = d(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(d2 ? 1 : 0);
                    return true;
                case 30:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean e2 = e(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(e2 ? 1 : 0);
                    return true;
                case 31:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean f2 = f(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(f2 ? 1 : 0);
                    return true;
                case 32:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean t = t();
                    parcel2.writeNoException();
                    parcel2.writeInt(t ? 1 : 0);
                    return true;
                case 33:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean u = u();
                    parcel2.writeNoException();
                    parcel2.writeInt(u ? 1 : 0);
                    return true;
                case 34:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean v = v();
                    parcel2.writeNoException();
                    parcel2.writeInt(v ? 1 : 0);
                    return true;
                case 35:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean w = w();
                    parcel2.writeNoException();
                    parcel2.writeInt(w ? 1 : 0);
                    return true;
                case 36:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean x = x();
                    parcel2.writeNoException();
                    parcel2.writeInt(x ? 1 : 0);
                    return true;
                case 37:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean y = y();
                    parcel2.writeNoException();
                    parcel2.writeInt(y ? 1 : 0);
                    return true;
                case 38:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean z = z();
                    parcel2.writeNoException();
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean A = A();
                    parcel2.writeNoException();
                    parcel2.writeInt(A ? 1 : 0);
                    return true;
                case 40:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean B = B();
                    parcel2.writeNoException();
                    parcel2.writeInt(B ? 1 : 0);
                    return true;
                case 41:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean C = C();
                    parcel2.writeNoException();
                    parcel2.writeInt(C ? 1 : 0);
                    return true;
                case 42:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean D = D();
                    parcel2.writeNoException();
                    parcel2.writeInt(D ? 1 : 0);
                    return true;
                case 43:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean E = E();
                    parcel2.writeNoException();
                    parcel2.writeInt(E ? 1 : 0);
                    return true;
                case 44:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean F = F();
                    parcel2.writeNoException();
                    parcel2.writeInt(F ? 1 : 0);
                    return true;
                case 45:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a7 = a(parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(a7 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean G = G();
                    parcel2.writeNoException();
                    parcel2.writeInt(G ? 1 : 0);
                    return true;
                case 47:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a8 = a(parcel.readByte(), parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(a8 ? 1 : 0);
                    return true;
                case 48:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean H = H();
                    parcel2.writeNoException();
                    parcel2.writeInt(H ? 1 : 0);
                    return true;
                case 49:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean I = I();
                    parcel2.writeNoException();
                    parcel2.writeInt(I ? 1 : 0);
                    return true;
                case 50:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a9 = a(parcel.readByte(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(a9 ? 1 : 0);
                    return true;
                case 51:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b5 = b(parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(b5 ? 1 : 0);
                    return true;
                case 52:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean J2 = J();
                    parcel2.writeNoException();
                    parcel2.writeInt(J2 ? 1 : 0);
                    return true;
                case 53:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean K = K();
                    parcel2.writeNoException();
                    parcel2.writeInt(K ? 1 : 0);
                    return true;
                case 54:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean L = L();
                    parcel2.writeNoException();
                    parcel2.writeInt(L ? 1 : 0);
                    return true;
                case 55:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b6 = b(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(b6 ? 1 : 0);
                    return true;
                case 56:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c3 = c(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(c3 ? 1 : 0);
                    return true;
                case 57:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c4 = c(parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(c4 ? 1 : 0);
                    return true;
                case 58:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a10 = a(parcel.readInt(), parcel.readLong(), parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(a10 ? 1 : 0);
                    return true;
                case 59:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a11 = a(parcel.readByte(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(a11 ? 1 : 0);
                    return true;
                case 60:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b7 = b(parcel.readByte(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(b7 ? 1 : 0);
                    return true;
                case 61:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean g2 = g(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(g2 ? 1 : 0);
                    return true;
                case 62:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c5 = c(parcel.readByte(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(c5 ? 1 : 0);
                    return true;
                case 63:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean d3 = d(parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(d3 ? 1 : 0);
                    return true;
                case 64:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a12 = a(c.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a12 ? 1 : 0);
                    return true;
                case 65:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b8 = b(c.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b8 ? 1 : 0);
                    return true;
                case 66:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String M = M();
                    parcel2.writeNoException();
                    parcel2.writeString(M);
                    return true;
                case 67:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a13 = a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a13 ? 1 : 0);
                    return true;
                case 68:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean d4 = d(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(d4 ? 1 : 0);
                    return true;
                case 69:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean N = N();
                    parcel2.writeNoException();
                    parcel2.writeInt(N ? 1 : 0);
                    return true;
                case 70:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean O = O();
                    parcel2.writeNoException();
                    parcel2.writeInt(O ? 1 : 0);
                    return true;
                case 71:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean h2 = h(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(h2 ? 1 : 0);
                    return true;
                case 72:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean i4 = i(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i4 ? 1 : 0);
                    return true;
                case 73:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean P = P();
                    parcel2.writeNoException();
                    parcel2.writeInt(P ? 1 : 0);
                    return true;
                case 74:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String Q = Q();
                    parcel2.writeNoException();
                    parcel2.writeString(Q);
                    return true;
                case 75:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String j2 = j(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(j2);
                    return true;
                case 76:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String R = R();
                    parcel2.writeNoException();
                    parcel2.writeString(R);
                    return true;
                case 77:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean k2 = k(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(k2 ? 1 : 0);
                    return true;
                case 78:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean S = S();
                    parcel2.writeNoException();
                    parcel2.writeInt(S ? 1 : 0);
                    return true;
                case 79:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int T = T();
                    parcel2.writeNoException();
                    parcel2.writeInt(T);
                    return true;
                case 80:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean U = U();
                    parcel2.writeNoException();
                    parcel2.writeInt(U ? 1 : 0);
                    return true;
                case 81:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean V = V();
                    parcel2.writeNoException();
                    parcel2.writeInt(V ? 1 : 0);
                    return true;
                case 82:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean W = W();
                    parcel2.writeNoException();
                    parcel2.writeInt(W ? 1 : 0);
                    return true;
                case 83:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int l2 = l(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(l2);
                    return true;
                case 84:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int X = X();
                    parcel2.writeNoException();
                    parcel2.writeInt(X);
                    return true;
                case 85:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int m2 = m(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(m2);
                    return true;
                case 86:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean e3 = e(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(e3 ? 1 : 0);
                    return true;
                case 87:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int Y = Y();
                    parcel2.writeNoException();
                    parcel2.writeInt(Y);
                    return true;
                case 88:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    a(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 89:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int Z = Z();
                    parcel2.writeNoException();
                    parcel2.writeInt(Z);
                    return true;
                case 90:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int aa = aa();
                    parcel2.writeNoException();
                    parcel2.writeInt(aa);
                    return true;
                case 91:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ab = ab();
                    parcel2.writeNoException();
                    parcel2.writeInt(ab);
                    return true;
                case 92:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String ac = ac();
                    parcel2.writeNoException();
                    parcel2.writeString(ac);
                    return true;
                case 93:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a14 = a(e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a14 ? 1 : 0);
                    return true;
                case 94:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b9 = b(e.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b9 ? 1 : 0);
                    return true;
                case 95:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ad = ad();
                    parcel2.writeNoException();
                    parcel2.writeInt(ad);
                    return true;
                case 96:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean ae = ae();
                    parcel2.writeNoException();
                    parcel2.writeInt(ae ? 1 : 0);
                    return true;
                case 97:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String af = af();
                    parcel2.writeNoException();
                    parcel2.writeString(af);
                    return true;
                case 98:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ag = ag();
                    parcel2.writeNoException();
                    parcel2.writeInt(ag);
                    return true;
                case 99:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean n = n(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(n ? 1 : 0);
                    return true;
                case 100:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean o = o(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(o ? 1 : 0);
                    return true;
                case 101:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ah = ah();
                    parcel2.writeNoException();
                    parcel2.writeInt(ah);
                    return true;
                case 102:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    List<NfHfpClientCall> ai = ai();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(ai);
                    return true;
                case 103:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aj = aj();
                    parcel2.writeNoException();
                    parcel2.writeInt(aj ? 1 : 0);
                    return true;
                case 104:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ak = ak();
                    parcel2.writeNoException();
                    parcel2.writeInt(ak);
                    return true;
                case 105:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean al = al();
                    parcel2.writeNoException();
                    parcel2.writeInt(al ? 1 : 0);
                    return true;
                case 106:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean am = am();
                    parcel2.writeNoException();
                    parcel2.writeInt(am ? 1 : 0);
                    return true;
                case 107:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean p2 = p(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(p2 ? 1 : 0);
                    return true;
                case 108:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean an = an();
                    parcel2.writeNoException();
                    parcel2.writeInt(an ? 1 : 0);
                    return true;
                case 109:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean q2 = q(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(q2 ? 1 : 0);
                    return true;
                case 110:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean f3 = f(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(f3 ? 1 : 0);
                    return true;
                case 111:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean ao = ao();
                    parcel2.writeNoException();
                    parcel2.writeInt(ao ? 1 : 0);
                    return true;
                case 112:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean ap = ap();
                    parcel2.writeNoException();
                    parcel2.writeInt(ap ? 1 : 0);
                    return true;
                case 113:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean r2 = r(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(r2 ? 1 : 0);
                    return true;
                case 114:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aq = aq();
                    parcel2.writeNoException();
                    parcel2.writeInt(aq ? 1 : 0);
                    return true;
                case 115:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean ar = ar();
                    parcel2.writeNoException();
                    parcel2.writeInt(ar ? 1 : 0);
                    return true;
                case 116:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String as = as();
                    parcel2.writeNoException();
                    parcel2.writeString(as);
                    return true;
                case 117:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String at = at();
                    parcel2.writeNoException();
                    parcel2.writeString(at);
                    return true;
                case 118:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b10 = b(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(b10 ? 1 : 0);
                    return true;
                case 119:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    au();
                    parcel2.writeNoException();
                    return true;
                case 120:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    av();
                    parcel2.writeNoException();
                    return true;
                case 121:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aw = aw();
                    parcel2.writeNoException();
                    parcel2.writeInt(aw ? 1 : 0);
                    return true;
                case 122:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    c(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 123:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean ax = ax();
                    parcel2.writeNoException();
                    parcel2.writeInt(ax ? 1 : 0);
                    return true;
                case 124:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a15 = a(i.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a15 ? 1 : 0);
                    return true;
                case 125:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b11 = b(i.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b11 ? 1 : 0);
                    return true;
                case 126:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ay = ay();
                    parcel2.writeNoException();
                    parcel2.writeInt(ay);
                    return true;
                case 127:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean az = az();
                    parcel2.writeNoException();
                    parcel2.writeInt(az ? 1 : 0);
                    return true;
                case 128:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aA = aA();
                    parcel2.writeNoException();
                    parcel2.writeString(aA);
                    return true;
                case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a16 = a(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a16 ? 1 : 0);
                    return true;
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a17 = a(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a17 ? 1 : 0);
                    return true;
                case 131:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b12 = b(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(b12 ? 1 : 0);
                    return true;
                case Opcodes.IINC /* 132 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b13 = b(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(b13 ? 1 : 0);
                    return true;
                case 133:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c6 = c(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(c6 ? 1 : 0);
                    return true;
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean c7 = c(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(c7 ? 1 : 0);
                    return true;
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 136:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    a(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 137:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    s(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    t(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 139:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    aB();
                    parcel2.writeNoException();
                    return true;
                case 140:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean u2 = u(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(u2 ? 1 : 0);
                    return true;
                case 141:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean g3 = g(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(g3 ? 1 : 0);
                    return true;
                case 142:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a18 = a(j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a18 ? 1 : 0);
                    return true;
                case 143:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b14 = b(j.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b14 ? 1 : 0);
                    return true;
                case 144:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean v2 = v(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(v2 ? 1 : 0);
                    return true;
                case Opcodes.I2B /* 145 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean w2 = w(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(w2 ? 1 : 0);
                    return true;
                case Opcodes.I2C /* 146 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    aC();
                    parcel2.writeNoException();
                    return true;
                case Opcodes.I2S /* 147 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean x2 = x(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(x2 ? 1 : 0);
                    return true;
                case Opcodes.LCMP /* 148 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    a(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case Opcodes.FCMPL /* 149 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a19 = a(f.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a19 ? 1 : 0);
                    return true;
                case 150:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b15 = b(f.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b15 ? 1 : 0);
                    return true;
                case Opcodes.DCMPL /* 151 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int aD = aD();
                    parcel2.writeNoException();
                    parcel2.writeInt(aD);
                    return true;
                case Opcodes.DCMPG /* 152 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aE = aE();
                    parcel2.writeNoException();
                    parcel2.writeInt(aE ? 1 : 0);
                    return true;
                case Opcodes.IFEQ /* 153 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aF = aF();
                    parcel2.writeNoException();
                    parcel2.writeString(aF);
                    return true;
                case Opcodes.IFNE /* 154 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean y2 = y(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(y2 ? 1 : 0);
                    return true;
                case Opcodes.IFLT /* 155 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean z2 = z(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(z2 ? 1 : 0);
                    return true;
                case 156:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a20 = a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a20 ? 1 : 0);
                    return true;
                case Opcodes.IFGT /* 157 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b16 = b(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(b16 ? 1 : 0);
                    return true;
                case Opcodes.IFLE /* 158 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a21 = a(g.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a21 ? 1 : 0);
                    return true;
                case Opcodes.IF_ICMPEQ /* 159 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b17 = b(g.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b17 ? 1 : 0);
                    return true;
                case Opcodes.IF_ICMPNE /* 160 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a22 = a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a22 ? 1 : 0);
                    return true;
                case Opcodes.IF_ICMPLT /* 161 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a23 = a(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a23 ? 1 : 0);
                    return true;
                case Opcodes.IF_ICMPGE /* 162 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a24 = a(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a24 ? 1 : 0);
                    return true;
                case Opcodes.IF_ICMPGT /* 163 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    A(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case Opcodes.IF_ICMPLE /* 164 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean B2 = B(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(B2 ? 1 : 0);
                    return true;
                case Opcodes.IF_ACMPEQ /* 165 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean C2 = C(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(C2 ? 1 : 0);
                    return true;
                case Opcodes.IF_ACMPNE /* 166 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    aG();
                    parcel2.writeNoException();
                    return true;
                case Opcodes.GOTO /* 167 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    D(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case Opcodes.JSR /* 168 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    aH();
                    parcel2.writeNoException();
                    return true;
                case Opcodes.RET /* 169 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int E2 = E(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(E2);
                    return true;
                case 170:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int F2 = F(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(F2);
                    return true;
                case 171:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a25 = a(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a25 ? 1 : 0);
                    return true;
                case Opcodes.IRETURN /* 172 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a26 = a(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a26 ? 1 : 0);
                    return true;
                case 173:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a27 = a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a27 ? 1 : 0);
                    return true;
                case 174:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean h3 = h(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(h3 ? 1 : 0);
                    return true;
                case 175:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a28 = a(h.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a28 ? 1 : 0);
                    return true;
                case Opcodes.ARETURN /* 176 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b18 = b(h.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b18 ? 1 : 0);
                    return true;
                case Opcodes.RETURN /* 177 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean G2 = G(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(G2 ? 1 : 0);
                    return true;
                case Opcodes.GETSTATIC /* 178 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aI = aI();
                    parcel2.writeNoException();
                    parcel2.writeString(aI);
                    return true;
                case Opcodes.PUTSTATIC /* 179 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean d5 = d(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(d5 ? 1 : 0);
                    return true;
                case Opcodes.GETFIELD /* 180 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aJ = aJ();
                    parcel2.writeNoException();
                    parcel2.writeInt(aJ ? 1 : 0);
                    return true;
                case Opcodes.PUTFIELD /* 181 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    H(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case Opcodes.INVOKEVIRTUAL /* 182 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aK = aK();
                    parcel2.writeNoException();
                    parcel2.writeString(aK);
                    return true;
                case Opcodes.INVOKESPECIAL /* 183 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    aL();
                    parcel2.writeNoException();
                    return true;
                case Opcodes.INVOKESTATIC /* 184 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aM = aM();
                    parcel2.writeNoException();
                    parcel2.writeInt(aM ? 1 : 0);
                    return true;
                case Opcodes.INVOKEINTERFACE /* 185 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a29 = a(d.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a29 ? 1 : 0);
                    return true;
                case 186:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b19 = b(d.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b19 ? 1 : 0);
                    return true;
                case Opcodes.NEW /* 187 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int aN = aN();
                    parcel2.writeNoException();
                    parcel2.writeInt(aN);
                    return true;
                case TsExtractor.TS_PACKET_SIZE /* 188 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean I2 = I(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(I2 ? 1 : 0);
                    return true;
                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a30 = a(parcel.readInt(), parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(a30 ? 1 : 0);
                    return true;
                case 190:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a31 = a(parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a31 ? 1 : 0);
                    return true;
                case 191:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a32 = a(parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(a32 ? 1 : 0);
                    return true;
                case 192:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aO = aO();
                    parcel2.writeNoException();
                    parcel2.writeInt(aO ? 1 : 0);
                    return true;
                case Opcodes.INSTANCEOF /* 193 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b20 = b(parcel.readInt(), parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(b20 ? 1 : 0);
                    return true;
                case 194:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aP = aP();
                    parcel2.writeNoException();
                    parcel2.writeInt(aP ? 1 : 0);
                    return true;
                case 195:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean e4 = e(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(e4 ? 1 : 0);
                    return true;
                case 196:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a33 = a(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(a33 ? 1 : 0);
                    return true;
                case 197:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a34 = a(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(a34 ? 1 : 0);
                    return true;
                case Opcodes.IFNULL /* 198 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    List<ParcelUuid> aQ = aQ();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(aQ);
                    return true;
                case Opcodes.IFNONNULL /* 199 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    List<ParcelUuid> a35 = a(parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(a35);
                    return true;
                case 200:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    List<ParcelUuid> a36 = a(parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(a36);
                    return true;
                case 201:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean a37 = a(k.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a37 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_TUNNEL /* 202 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean b21 = b(k.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(b21 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_AVOID_TUNNEL /* 203 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aR = aR();
                    parcel2.writeNoException();
                    parcel2.writeInt(aR ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_FERRIES /* 204 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aS = aS();
                    parcel2.writeNoException();
                    parcel2.writeInt(aS ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_AVOID_FERRIES /* 205 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean J3 = J(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(J3 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_CARPOOL /* 206 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aT = aT();
                    parcel2.writeNoException();
                    parcel2.writeInt(aT ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_AVOID_CARPOOL /* 207 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean K2 = K(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(K2 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_HIGHWAY /* 208 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean f4 = f(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(f4 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_AVOID_HIGHWAY /* 209 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aU = aU();
                    parcel2.writeNoException();
                    parcel2.writeInt(aU ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_UNPAVED /* 210 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean aV = aV();
                    parcel2.writeNoException();
                    parcel2.writeInt(aV ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_AVOID_UNPAVED /* 211 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean L2 = L(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(L2 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_COUNTRY_BORDER /* 212 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean M2 = M(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(M2 ? 1 : 0);
                    return true;
                case NaviPreferenceBean.PATH_PREF_AVOID_COUNTRY_BORDER /* 213 */:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int N2 = N(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(N2);
                    return true;
                case 214:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean O2 = O(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(O2 ? 1 : 0);
                    return true;
                case 215:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    List<UsbBluetoothDevice> aW = aW();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(aW);
                    return true;
                case 216:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aX = aX();
                    parcel2.writeNoException();
                    parcel2.writeString(aX);
                    return true;
                case 217:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean P2 = P(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(P2 ? 1 : 0);
                    return true;
                case 218:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aY = aY();
                    parcel2.writeNoException();
                    parcel2.writeString(aY);
                    return true;
                case 219:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    String aZ = aZ();
                    parcel2.writeNoException();
                    parcel2.writeString(aZ);
                    return true;
                case 220:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int ba = ba();
                    parcel2.writeNoException();
                    parcel2.writeInt(ba);
                    return true;
                case 221:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    int i5 = i(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i5);
                    return true;
                case 222:
                    parcel.enforceInterface("com.nforetek.bt.aidl.UiCommand");
                    boolean Q2 = Q(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(Q2 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: UiCommand.java */
        /* renamed from: com.nforetek.bt.aidl.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0119a implements l {
            private IBinder a;

            C0119a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.nforetek.bt.aidl.l
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(com.nforetek.bt.aidl.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(com.nforetek.bt.aidl.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeFloat(f);
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean d(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean e(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean f(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean w() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean x() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean y() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean A() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean B() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean C() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean D() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean E() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean F() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    this.a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean G() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(byte b, byte b2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    obtain.writeByte(b2);
                    this.a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean H() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean I() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(byte b, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    obtain.writeLong(j);
                    this.a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    this.a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean J() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean K() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean L() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    this.a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(int i, long j, byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeByte(b);
                    this.a.transact(58, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(byte b, int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(byte b, int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean g(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c(byte b, int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.a.transact(62, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean d(byte b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeByte(b);
                    this.a.transact(63, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(c cVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.a.transact(64, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(c cVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    this.a.transact(65, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String M() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(66, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(67, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(68, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean N() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(69, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean O() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(70, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean h(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean i(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(72, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean P() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(73, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String Q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(74, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String j(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(75, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String R() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(76, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean k(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(77, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean S() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(78, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int T() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(79, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean U() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(80, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean V() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean W() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(82, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int l(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(83, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int X() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(84, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int m(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(85, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean e(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(86, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int Y() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(87, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void a(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(88, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int Z() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(89, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int aa() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(90, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ab() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String ac() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(92, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(93, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(94, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ad() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(95, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean ae() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(96, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String af() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(97, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ag() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(98, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean n(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(99, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean o(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(100, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ah() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public List<NfHfpClientCall> ai() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(102, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(NfHfpClientCall.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aj() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(103, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ak() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(104, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean al() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(105, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean am() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(106, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean p(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(107, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean an() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(108, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean q(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(109, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean f(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(110, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean ao() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(111, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean ap() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(112, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean r(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(113, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aq() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(114, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean ar() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(115, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String as() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(116, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String at() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(117, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(118, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void au() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(119, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void av() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(120, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aw() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(121, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void c(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(122, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean ax() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(123, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(i iVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.a.transact(124, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(i iVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.a.transact(125, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ay() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(126, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean az() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(127, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aA() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(128, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(TsExtractor.TS_STREAM_TYPE_AC3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.a.transact(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(131, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(String str, int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.a.transact(Opcodes.IINC, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(133, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean c(String str, int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.a.transact(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void a(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(TsExtractor.TS_STREAM_TYPE_E_AC3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void a(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.a.transact(136, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void s(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(137, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void t(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(TsExtractor.TS_STREAM_TYPE_DTS, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void aB() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(139, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean u(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(140, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean g(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(141, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.a.transact(142, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.a.transact(143, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean v(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(144, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean w(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.I2B, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void aC() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.I2C, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean x(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.I2S, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void a(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.a.transact(Opcodes.LCMP, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.a.transact(Opcodes.FCMPL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.a.transact(150, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int aD() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.DCMPL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aE() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.DCMPG, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aF() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.IFEQ, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean y(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.IFNE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean z(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.IFLT, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.a.transact(156, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(Opcodes.IFGT, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.a.transact(Opcodes.IFLE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.a.transact(Opcodes.IF_ICMPEQ, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, String str2, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    this.a.transact(Opcodes.IF_ICMPNE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, boolean z, int i2, int i3, int i4, String str2, String str3, String str4, String str5, int i5, int i6) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    this.a.transact(Opcodes.IF_ICMPLT, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(Opcodes.IF_ICMPGE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void A(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.IF_ICMPGT, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean B(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.IF_ICMPLE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean C(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.IF_ACMPEQ, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void aG() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.IF_ACMPNE, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void D(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.GOTO, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void aH() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.JSR, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int E(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.RET, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int F(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(170, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.a.transact(171, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.a.transact(Opcodes.IRETURN, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, String str2, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(173, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean h(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(174, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.a.transact(175, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.a.transact(Opcodes.ARETURN, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean G(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.RETURN, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aI() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.GETSTATIC, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean d(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(Opcodes.PUTSTATIC, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aJ() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.GETFIELD, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void H(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(Opcodes.PUTFIELD, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aK() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.INVOKEVIRTUAL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public void aL() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.INVOKESPECIAL, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aM() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.INVOKESTATIC, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.a.transact(Opcodes.INVOKEINTERFACE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.a.transact(186, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int aN() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.NEW, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean I(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(TsExtractor.TS_PACKET_SIZE, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(int i, ParcelUuid parcelUuid) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(PsExtractor.PRIVATE_STREAM_1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(ParcelUuid parcelUuid, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(190, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(ParcelUuid parcelUuid, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.a.transact(191, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aO() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(192, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(int i, ParcelUuid parcelUuid) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(Opcodes.INSTANCEOF, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aP() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(194, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean e(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(195, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, int i2, int i3, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeByteArray(bArr);
                    this.a.transact(196, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(String str, int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, boolean z, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelUuid2 != null) {
                        obtain.writeInt(1);
                        parcelUuid2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeByteArray(bArr);
                    this.a.transact(197, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public List<ParcelUuid> aQ() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(Opcodes.IFNULL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ParcelUuid.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public List<ParcelUuid> a(ParcelUuid parcelUuid) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(Opcodes.IFNONNULL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ParcelUuid.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public List<ParcelUuid> a(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelUuid2 != null) {
                        obtain.writeInt(1);
                        parcelUuid2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(200, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ParcelUuid.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean a(k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    this.a.transact(201, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean b(k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_TUNNEL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aR() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(NaviPreferenceBean.PATH_PREF_AVOID_TUNNEL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aS() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(NaviPreferenceBean.PATH_PREF_FERRIES, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean J(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_AVOID_FERRIES, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aT() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(NaviPreferenceBean.PATH_PREF_CARPOOL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean K(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_AVOID_CARPOOL, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean f(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(z ? 1 : 0);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_HIGHWAY, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aU() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(NaviPreferenceBean.PATH_PREF_AVOID_HIGHWAY, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean aV() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(NaviPreferenceBean.PATH_PREF_UNPAVED, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean L(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_AVOID_UNPAVED, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean M(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_COUNTRY_BORDER, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int N(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(NaviPreferenceBean.PATH_PREF_AVOID_COUNTRY_BORDER, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean O(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(214, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public List<UsbBluetoothDevice> aW() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(215, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(UsbBluetoothDevice.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aX() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(216, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean P(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(217, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aY() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(218, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public String aZ() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(219, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int ba() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    this.a.transact(220, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public int i(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeInt(i);
                    this.a.transact(221, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.nforetek.bt.aidl.l
            public boolean Q(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.nforetek.bt.aidl.UiCommand");
                    obtain.writeString(str);
                    this.a.transact(222, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
