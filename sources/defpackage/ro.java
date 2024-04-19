package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
/* compiled from: RepeaterParser.java */
/* renamed from: ro  reason: default package */
/* loaded from: classes3.dex */
class ro {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static pv a(JsonReader jsonReader, d dVar) {
        String str = null;
        oy oyVar = null;
        oy oyVar2 = null;
        pi piVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3519) {
                        if (hashCode == 3710 && nextName.equals("tr")) {
                            c = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals("o")) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    oyVar = qq.a(jsonReader, dVar, false);
                    break;
                case 2:
                    oyVar2 = qq.a(jsonReader, dVar, false);
                    break;
                case 3:
                    piVar = qp.a(jsonReader, dVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new pv(str, oyVar, oyVar2, piVar);
    }
}
