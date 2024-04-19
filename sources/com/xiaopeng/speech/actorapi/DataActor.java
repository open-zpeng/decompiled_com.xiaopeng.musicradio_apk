package com.xiaopeng.speech.actorapi;

import android.os.Parcel;
import com.xiaopeng.speech.actor.Actor;
/* loaded from: classes2.dex */
public class DataActor extends Actor {
    public static final String NAME = "DataActor";
    protected String b;
    protected String c;
    protected boolean d;

    public DataActor(String str) {
        super(NAME);
        this.b = "";
        this.d = true;
        this.b = str;
    }

    public DataActor(String str, Parcel parcel) {
        super(str, parcel);
        this.b = "";
        this.d = true;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readByte() != 0;
    }

    @Override // com.xiaopeng.speech.actor.Actor, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(a());
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public String a() {
        return this.b;
    }

    public String toString() {
        return "DataActor{mEvent='" + this.b + "', mResultData='" + this.c + "', mIsSupport=" + this.d + '}';
    }
}
