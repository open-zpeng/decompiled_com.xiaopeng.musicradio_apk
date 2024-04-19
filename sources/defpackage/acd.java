package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.lib.apirouter.server.TransactTranslator;
import com.xiaopeng.speech.vui.constants.VuiConstants;
/* compiled from: ApiRouterUnitySceneService_Stub.java */
/* renamed from: acd  reason: default package */
/* loaded from: classes2.dex */
public class acd extends Binder implements IInterface {
    public bfi a = new bfi();
    public acc b = new acc();

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("com.xiaopeng.speech.apirouter.ApiRouterUnitySceneService");
            return true;
        }
        switch (i) {
            case 0:
                parcel.enforceInterface("com.xiaopeng.speech.apirouter.ApiRouterUnitySceneService");
                Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    String b = this.a.b((String) TransactTranslator.read(uri.getQueryParameter(VuiConstants.SCENE_ID), "java.lang.String"), (String) TransactTranslator.read(uri.getQueryParameter("elementId"), "java.lang.String"));
                    parcel2.writeNoException();
                    TransactTranslator.reply(parcel2, b);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    parcel2.writeException(new IllegalStateException(e.getMessage()));
                    return true;
                }
            case 1:
                parcel.enforceInterface("com.xiaopeng.speech.apirouter.ApiRouterUnitySceneService");
                Uri uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    this.a.a((String) TransactTranslator.read(uri2.getQueryParameter("event"), "java.lang.String"), (String) TransactTranslator.read(uri2.getQueryParameter("data"), "java.lang.String"));
                    parcel2.writeNoException();
                    TransactTranslator.reply(parcel2, null);
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    parcel2.writeException(new IllegalStateException(e2.getMessage()));
                    return true;
                }
            case 2:
                parcel.enforceInterface("com.xiaopeng.speech.apirouter.ApiRouterUnitySceneService");
                Uri uri3 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    this.a.c((String) TransactTranslator.read(uri3.getQueryParameter("event"), "java.lang.String"), (String) TransactTranslator.read(uri3.getQueryParameter("data"), "java.lang.String"));
                    parcel2.writeNoException();
                    TransactTranslator.reply(parcel2, null);
                    return true;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    parcel2.writeException(new IllegalStateException(e3.getMessage()));
                    return true;
                }
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
