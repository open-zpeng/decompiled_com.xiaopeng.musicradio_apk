package com.xiaopeng.speech.actorapi;

import android.os.Parcel;
/* loaded from: classes2.dex */
public class SupportActor extends ResultActor {
    public static final String NAME = "SupportActor";
    public static final String TTS_DEFAULT_NOT_SUPPORT = "暂不支持此功能";
    public static final String TTS_DEFAULT_SUPPORT = "好的";

    public SupportActor(String str) {
        super(str);
        this.a = NAME;
    }

    public SupportActor(String str, Parcel parcel) {
        super(str, parcel);
    }

    public SupportActor a(bht bhtVar) {
        return (SupportActor) super.a((bhs) bhtVar);
    }

    @Override // com.xiaopeng.speech.actorapi.ResultActor
    /* renamed from: b */
    public SupportActor a(String str) {
        return (SupportActor) super.a(str);
    }
}
