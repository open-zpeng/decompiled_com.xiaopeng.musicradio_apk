package com.xiaopeng.speech.actorapi;

import android.os.Parcel;
import com.xiaopeng.speech.actor.Actor;
import com.xiaopeng.speech.common.bean.Value;
/* loaded from: classes2.dex */
public class ValueActor extends Actor {
    public static final String NAME = "ValueActor";
    protected String b;
    protected Value c;

    public ValueActor(String str) {
        super(NAME);
        this.b = "";
        this.b = str;
    }

    public ValueActor(String str, Parcel parcel) {
        super(str, parcel);
        this.b = "";
        this.b = parcel.readString();
        this.c = (Value) parcel.readParcelable(Value.class.getClassLoader());
    }

    @Override // com.xiaopeng.speech.actor.Actor, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
    }
}
