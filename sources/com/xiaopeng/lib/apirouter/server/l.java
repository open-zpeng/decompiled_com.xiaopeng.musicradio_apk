package com.xiaopeng.lib.apirouter.server;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.musicradio.NapaObserver;
/* compiled from: NapaObserver_Stub.java */
/* loaded from: classes.dex */
public class l extends Binder implements IInterface {
    public NapaObserver a = new NapaObserver();
    public k b = new k();

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 0) {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaopeng.musicradio.NapaObserver");
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface("com.xiaopeng.musicradio.NapaObserver");
        Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
        try {
            byte[] a = abu.a(parcel);
            this.a.sendMessage((String) TransactTranslator.read(uri.getQueryParameter("proxyName"), "java.lang.String"), (String) TransactTranslator.read(uri.getQueryParameter("method"), "java.lang.String"), a);
            parcel2.writeNoException();
            TransactTranslator.reply(parcel2, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            parcel2.writeException(new IllegalStateException(e.getMessage()));
            return true;
        }
    }
}
