package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* compiled from: AnimatableTransformParser.java */
/* renamed from: qp  reason: default package */
/* loaded from: classes3.dex */
public class qp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static pi a(JsonReader jsonReader, d dVar) {
        pb pbVar;
        char c;
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        pb pbVar2 = null;
        pd pdVar = null;
        pa paVar = null;
        pj<PointF, PointF> pjVar = null;
        oy oyVar = null;
        oy oyVar2 = null;
        oy oyVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 97:
                    if (nextName.equals("a")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 112:
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3242:
                    if (nextName.equals("eo")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3656:
                    if (nextName.equals("rz")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3676:
                    if (nextName.equals("so")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            pbVar2 = qn.a(jsonReader, dVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    pjVar = qn.b(jsonReader, dVar);
                    continue;
                case 2:
                    pdVar = qq.d(jsonReader, dVar);
                    continue;
                case 3:
                    dVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    paVar = qq.b(jsonReader, dVar);
                    continue;
                case 6:
                    oyVar2 = qq.a(jsonReader, dVar, false);
                    continue;
                case 7:
                    oyVar3 = qq.a(jsonReader, dVar, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            oyVar = qq.a(jsonReader, dVar, false);
        }
        if (z) {
            jsonReader.endObject();
        }
        if (pbVar2 == null) {
            Log.w("LOTTIE", "Layer has no transform property. You may be using an unsupported layer type such as a camera.");
            pbVar = new pb();
        } else {
            pbVar = pbVar2;
        }
        return new pi(pbVar, pjVar, pdVar == null ? new pd(new sg(1.0f, 1.0f)) : pdVar, oyVar, paVar == null ? new pa() : paVar, oyVar2, oyVar3);
    }
}
