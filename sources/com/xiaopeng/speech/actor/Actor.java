package com.xiaopeng.speech.actor;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaopeng.speech.actorapi.AvatarActor;
import com.xiaopeng.speech.actorapi.DataActor;
import com.xiaopeng.speech.actorapi.DialogActor;
import com.xiaopeng.speech.actorapi.ResultActor;
import com.xiaopeng.speech.actorapi.ShowActor;
import com.xiaopeng.speech.actorapi.SupportActor;
import com.xiaopeng.speech.actorapi.TextActor;
import com.xiaopeng.speech.actorapi.ValueActor;
import com.xiaopeng.speech.common.util.c;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class Actor implements Parcelable {
    protected String a;
    public static Map<String, Class<? extends Actor>> sActorMap = new HashMap<String, Class<? extends Actor>>() { // from class: com.xiaopeng.speech.actor.Actor.1
        {
            put(AvatarActor.NAME, AvatarActor.class);
            put(DialogActor.NAME, DialogActor.class);
            put(ResultActor.NAME, ResultActor.class);
            put(TextActor.NAME, TextActor.class);
            put(ShowActor.NAME, ShowActor.class);
            put(SupportActor.NAME, SupportActor.class);
            put(DataActor.NAME, DataActor.class);
            put(ValueActor.NAME, ValueActor.class);
        }
    };
    public static final Parcelable.Creator<Actor> CREATOR = new Parcelable.Creator<Actor>() { // from class: com.xiaopeng.speech.actor.Actor.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Actor createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            try {
                return Actor.sActorMap.get(readString).getConstructor(String.class, Parcel.class).newInstance(readString, parcel);
            } catch (Exception e) {
                c.a(this, "createFromParcel error:", e);
                return new Actor(readString, parcel);
            }
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Actor[] newArray(int i) {
            return new Actor[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Actor() {
    }

    public Actor(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Actor(String str, Parcel parcel) {
        this.a = str;
    }
}
