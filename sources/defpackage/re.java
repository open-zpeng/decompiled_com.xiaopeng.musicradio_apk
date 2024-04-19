package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: KeyframesParser.java */
/* renamed from: re  reason: default package */
/* loaded from: classes3.dex */
class re {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<sd<T>> a(JsonReader jsonReader, d dVar, float f, rw<T> rwVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals("k")) {
                c = 0;
            }
            if (c == 0) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(rd.a(jsonReader, dVar, f, rwVar, false));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(rd.a(jsonReader, dVar, f, rwVar, true));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(rd.a(jsonReader, dVar, f, rwVar, false));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }

    public static void a(List<? extends sd<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            i2++;
            list.get(i2).e = Float.valueOf(list.get(i2).d);
        }
        sd<?> sdVar = list.get(i);
        if (sdVar.a == 0) {
            list.remove(sdVar);
        }
    }
}
