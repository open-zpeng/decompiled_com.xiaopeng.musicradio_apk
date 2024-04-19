package com.xiaopeng.speech.actorapi;

import android.os.Parcel;
import com.xiaopeng.speech.actor.Actor;
/* loaded from: classes2.dex */
public class ResultActor extends Actor {
    public static final String NAME = "ResultActor";
    protected String b;
    protected String c;

    public ResultActor(String str) {
        super(NAME);
        this.b = "";
        this.b = str;
    }

    public ResultActor(String str, Parcel parcel) {
        super(str, parcel);
        this.b = "";
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // com.xiaopeng.speech.actor.Actor, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(a());
        parcel.writeString(this.c);
    }

    public String a() {
        return this.b;
    }

    public ResultActor a(bhs bhsVar) {
        return a(bhsVar.toString());
    }

    public ResultActor a(String str) {
        this.c = str;
        return this;
    }
}
