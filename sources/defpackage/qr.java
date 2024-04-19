package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* compiled from: CircleShapeParser.java */
/* renamed from: qr  reason: default package */
/* loaded from: classes3.dex */
class qr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static pl a(JsonReader jsonReader, d dVar, int i) {
        char c;
        String str = null;
        boolean z = i == 3;
        pj<PointF, PointF> pjVar = null;
        pc pcVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 100) {
                if (nextName.equals("d")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 112) {
                if (nextName.equals(TtmlNode.TAG_P)) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 115) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("s")) {
                    c = 2;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    pjVar = qn.b(jsonReader, dVar);
                    break;
                case 2:
                    pcVar = qq.c(jsonReader, dVar);
                    break;
                case 3:
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new pl(str, pjVar, pcVar, z);
    }
}
