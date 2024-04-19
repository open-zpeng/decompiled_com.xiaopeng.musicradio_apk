package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
/* compiled from: PointFParser.java */
/* renamed from: rl  reason: default package */
/* loaded from: classes3.dex */
public class rl implements rw<PointF> {
    public static final rl a = new rl();

    private rl() {
    }

    @Override // defpackage.rw
    /* renamed from: a */
    public PointF b(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return rc.b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return rc.b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
    }
}
