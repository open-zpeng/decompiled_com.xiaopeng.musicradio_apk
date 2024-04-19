package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
import defpackage.qb;
/* compiled from: ShapeTrimPathParser.java */
/* renamed from: rv  reason: default package */
/* loaded from: classes3.dex */
class rv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static qb a(JsonReader jsonReader, d dVar) {
        String str = null;
        qb.a aVar = null;
        oy oyVar = null;
        oy oyVar2 = null;
        oy oyVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 3;
                            }
                        } else if (nextName.equals("s")) {
                            c = 0;
                        }
                    } else if (nextName.equals("o")) {
                        c = 2;
                    }
                } else if (nextName.equals("m")) {
                    c = 4;
                }
            } else if (nextName.equals("e")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    oyVar = qq.a(jsonReader, dVar, false);
                    break;
                case 1:
                    oyVar2 = qq.a(jsonReader, dVar, false);
                    break;
                case 2:
                    oyVar3 = qq.a(jsonReader, dVar, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    aVar = qb.a.a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new qb(str, aVar, oyVar, oyVar2, oyVar3);
    }
}
