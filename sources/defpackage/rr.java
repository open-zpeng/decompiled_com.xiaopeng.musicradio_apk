package defpackage;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.d;
/* compiled from: ShapeFillParser.java */
/* renamed from: rr  reason: default package */
/* loaded from: classes3.dex */
class rr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static px a(JsonReader jsonReader, d dVar) {
        char c;
        boolean z = false;
        String str = null;
        ox oxVar = null;
        pa paVar = null;
        int i = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -396065730) {
                if (nextName.equals("fillEnabled")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 99) {
                if (nextName.equals("c")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 114) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("r")) {
                    c = 4;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    oxVar = qq.g(jsonReader, dVar);
                    break;
                case 2:
                    paVar = qq.b(jsonReader, dVar);
                    break;
                case 3:
                    z = jsonReader.nextBoolean();
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new px(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, oxVar, paVar);
    }
}
