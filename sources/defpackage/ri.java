package defpackage;

import android.util.JsonReader;
import defpackage.ps;
/* compiled from: MergePathsParser.java */
/* renamed from: ri  reason: default package */
/* loaded from: classes3.dex */
class ri {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ps a(JsonReader jsonReader) {
        String str = null;
        ps.a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("mm")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = ps.a.a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new ps(str, aVar);
    }
}
