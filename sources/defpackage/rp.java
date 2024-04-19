package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
/* compiled from: ScaleXYParser.java */
/* renamed from: rp  reason: default package */
/* loaded from: classes3.dex */
public class rp implements rw<sg> {
    public static final rp a = new rp();

    private rp() {
    }

    @Override // defpackage.rw
    /* renamed from: a */
    public sg b(JsonReader jsonReader, float f) {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new sg((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
