package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
/* compiled from: ShapePathParser.java */
/* renamed from: rt  reason: default package */
/* loaded from: classes3.dex */
class rt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static pz a(JsonReader jsonReader, d dVar) {
        char c;
        String str = null;
        int i = 0;
        pe peVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 3432) {
                if (nextName.equals("ks")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                if (hashCode == 104415 && nextName.equals("ind")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    i = jsonReader.nextInt();
                    break;
                case 2:
                    peVar = qq.e(jsonReader, dVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new pz(str, i, peVar);
    }
}
