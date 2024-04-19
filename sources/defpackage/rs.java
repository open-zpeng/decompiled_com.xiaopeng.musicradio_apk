package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeGroupParser.java */
/* renamed from: rs  reason: default package */
/* loaded from: classes3.dex */
public class rs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static py a(JsonReader jsonReader, d dVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3371) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("it")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        pm a = qt.a(jsonReader, dVar);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new py(str, arrayList);
    }
}
