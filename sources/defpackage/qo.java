package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
/* compiled from: AnimatableTextPropertiesParser.java */
/* renamed from: qo  reason: default package */
/* loaded from: classes3.dex */
public class qo {
    public static ph a(JsonReader jsonReader, d dVar) {
        jsonReader.beginObject();
        ph phVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 97 && nextName.equals("a")) {
                c = 0;
            }
            if (c == 0) {
                phVar = b(jsonReader, dVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return phVar == null ? new ph(null, null, null, null) : phVar;
    }

    private static ph b(JsonReader jsonReader, d dVar) {
        jsonReader.beginObject();
        ox oxVar = null;
        ox oxVar2 = null;
        oy oyVar = null;
        oy oyVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 116) {
                if (hashCode != 3261) {
                    if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName.equals("sw")) {
                            c = 2;
                        }
                    } else if (nextName.equals("sc")) {
                        c = 1;
                    }
                } else if (nextName.equals("fc")) {
                    c = 0;
                }
            } else if (nextName.equals("t")) {
                c = 3;
            }
            switch (c) {
                case 0:
                    oxVar = qq.g(jsonReader, dVar);
                    break;
                case 1:
                    oxVar2 = qq.g(jsonReader, dVar);
                    break;
                case 2:
                    oyVar = qq.a(jsonReader, dVar);
                    break;
                case 3:
                    oyVar2 = qq.a(jsonReader, dVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new ph(oxVar, oxVar2, oyVar, oyVar2);
    }
}
