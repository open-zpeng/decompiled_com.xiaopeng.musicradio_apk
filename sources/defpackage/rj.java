package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.d;
/* compiled from: PathKeyframeParser.java */
/* renamed from: rj  reason: default package */
/* loaded from: classes3.dex */
class rj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static oe a(JsonReader jsonReader, d dVar) {
        return new oe(dVar, rd.a(jsonReader, dVar, sc.a(), rk.a, jsonReader.peek() == JsonToken.BEGIN_OBJECT));
    }
}
