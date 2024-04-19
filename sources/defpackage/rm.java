package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import defpackage.pt;
/* compiled from: PolystarShapeParser.java */
/* renamed from: rm  reason: default package */
/* loaded from: classes3.dex */
class rm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static pt a(JsonReader jsonReader, d dVar) {
        String str = null;
        pt.a aVar = null;
        oy oyVar = null;
        pj<PointF, PointF> pjVar = null;
        oy oyVar2 = null;
        oy oyVar3 = null;
        oy oyVar4 = null;
        oy oyVar5 = null;
        oy oyVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = pt.a.a(jsonReader.nextInt());
                    break;
                case 2:
                    oyVar = qq.a(jsonReader, dVar, false);
                    break;
                case 3:
                    pjVar = qn.b(jsonReader, dVar);
                    break;
                case 4:
                    oyVar2 = qq.a(jsonReader, dVar, false);
                    break;
                case 5:
                    oyVar4 = qq.a(jsonReader, dVar);
                    break;
                case 6:
                    oyVar6 = qq.a(jsonReader, dVar, false);
                    break;
                case 7:
                    oyVar3 = qq.a(jsonReader, dVar);
                    break;
                case '\b':
                    oyVar5 = qq.a(jsonReader, dVar, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new pt(str, aVar, oyVar, pjVar, oyVar2, oyVar3, oyVar4, oyVar5, oyVar6);
    }
}
