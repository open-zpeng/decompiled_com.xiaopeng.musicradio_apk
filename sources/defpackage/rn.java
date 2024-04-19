package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* compiled from: RectangleShapeParser.java */
/* renamed from: rn  reason: default package */
/* loaded from: classes3.dex */
class rn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static pu a(JsonReader jsonReader, d dVar) {
        String str = null;
        pj<PointF, PointF> pjVar = null;
        pc pcVar = null;
        oy oyVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    switch (hashCode) {
                        case 114:
                            if (nextName.equals("r")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 115:
                            if (nextName.equals("s")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals(TtmlNode.TAG_P)) {
                c = 1;
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
                    oyVar = qq.a(jsonReader, dVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new pu(str, pjVar, pcVar, oyVar);
    }
}
