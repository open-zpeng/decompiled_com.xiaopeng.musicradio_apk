package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.lib.apirouter.server.TransactTranslator;
/* compiled from: ApiRouterOverallService_Stub.java */
/* renamed from: abz  reason: default package */
/* loaded from: classes2.dex */
public class abz extends Binder implements IInterface {
    public bfg a = new bfg();
    public aby b = new aby();

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("com.xiaopeng.speech.apirouter.ApiRouterOverallService");
            return true;
        }
        switch (i) {
            case 0:
                parcel.enforceInterface("com.xiaopeng.speech.apirouter.ApiRouterOverallService");
                Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    this.a.a((String) TransactTranslator.read(uri.getQueryParameter("event"), "java.lang.String"), (String) TransactTranslator.read(uri.getQueryParameter("data"), "java.lang.String"));
                    parcel2.writeNoException();
                    TransactTranslator.reply(parcel2, null);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    parcel2.writeException(new IllegalStateException(e.getMessage()));
                    return true;
                }
            case 1:
                parcel.enforceInterface("com.xiaopeng.speech.apirouter.ApiRouterOverallService");
                Uri uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    this.a.a((String) TransactTranslator.read(uri2.getQueryParameter("event"), "java.lang.String"), (String) TransactTranslator.read(uri2.getQueryParameter("data"), "java.lang.String"), (String) TransactTranslator.read(uri2.getQueryParameter("callback"), "java.lang.String"));
                    parcel2.writeNoException();
                    TransactTranslator.reply(parcel2, null);
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    parcel2.writeException(new IllegalStateException(e2.getMessage()));
                    return true;
                }
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
