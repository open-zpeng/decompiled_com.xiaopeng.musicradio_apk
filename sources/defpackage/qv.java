package defpackage;

import android.util.JsonReader;
/* compiled from: FloatParser.java */
/* renamed from: qv  reason: default package */
/* loaded from: classes3.dex */
public class qv implements rw<Float> {
    public static final qv a = new qv();

    private qv() {
    }

    @Override // defpackage.rw
    /* renamed from: a */
    public Float b(JsonReader jsonReader, float f) {
        return Float.valueOf(rc.b(jsonReader) * f);
    }
}
