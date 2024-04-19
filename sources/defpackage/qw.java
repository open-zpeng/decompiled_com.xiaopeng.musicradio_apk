package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontCharacterParser.java */
/* renamed from: qw  reason: default package */
/* loaded from: classes3.dex */
public class qw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static os a(JsonReader jsonReader, d dVar) {
        char c;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -1866931350) {
                if (nextName.equals("fFamily")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 119) {
                if (nextName.equals("w")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3173) {
                if (nextName.equals("ch")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 3076010) {
                if (nextName.equals("data")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode != 3530753) {
                if (hashCode == 109780401 && nextName.equals(TtmlNode.TAG_STYLE)) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (nextName.equals("size")) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    c2 = jsonReader.nextString().charAt(0);
                    break;
                case 1:
                    d = jsonReader.nextDouble();
                    break;
                case 2:
                    d2 = jsonReader.nextDouble();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    str2 = jsonReader.nextString();
                    break;
                case 5:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((py) qt.a(jsonReader, dVar));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new os(arrayList, c2, d, d2, str, str2);
    }
}
