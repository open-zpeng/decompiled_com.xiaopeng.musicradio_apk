package defpackage;

import android.util.JsonReader;
/* compiled from: FontParser.java */
/* renamed from: qx  reason: default package */
/* loaded from: classes3.dex */
class qx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static or a(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1866931350) {
                if (hashCode != -1408684838) {
                    if (hashCode != -1294566165) {
                        if (hashCode == 96619537 && nextName.equals("fName")) {
                            c = 1;
                        }
                    } else if (nextName.equals("fStyle")) {
                        c = 2;
                    }
                } else if (nextName.equals("ascent")) {
                    c = 3;
                }
            } else if (nextName.equals("fFamily")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    break;
                case 3:
                    f = (float) jsonReader.nextDouble();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new or(str, str3, str2, f);
    }
}
