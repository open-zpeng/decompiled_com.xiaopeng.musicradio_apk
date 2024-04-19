package com.xiaopeng.lib.apirouter.server;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaopeng.musicradio.MusicVuiObserver;
import com.xiaopeng.speech.vui.constants.VuiConstants;
/* compiled from: MusicVuiObserver_Stub.java */
/* loaded from: classes.dex */
public class j extends Binder implements IInterface {
    public MusicVuiObserver a = new MusicVuiObserver();
    public i b = new i();

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("com.xiaopeng.musicradio.MusicVuiObserver");
            return true;
        }
        switch (i) {
            case 0:
                parcel.enforceInterface("com.xiaopeng.musicradio.MusicVuiObserver");
                Uri uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    String elementState = this.a.getElementState((String) TransactTranslator.read(uri.getQueryParameter(VuiConstants.SCENE_ID), "java.lang.String"), (String) TransactTranslator.read(uri.getQueryParameter("elementId"), "java.lang.String"));
                    parcel2.writeNoException();
                    TransactTranslator.reply(parcel2, elementState);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    parcel2.writeException(new IllegalStateException(e.getMessage()));
                    return true;
                }
            case 1:
                parcel.enforceInterface("com.xiaopeng.musicradio.MusicVuiObserver");
                Uri uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                try {
                    this.a.onEvent((String) TransactTranslator.read(uri2.getQueryParameter("event"), "java.lang.String"), (String) TransactTranslator.read(uri2.getQueryParameter("data"), "java.lang.String"));
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
