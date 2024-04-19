package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import defpackage.qf;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: LayerParser.java */
/* renamed from: rf  reason: default package */
/* loaded from: classes3.dex */
public class rf {
    public static qf a(d dVar) {
        Rect b = dVar.b();
        return new qf(Collections.emptyList(), dVar, "__container", -1L, qf.a.PreComp, -1L, null, Collections.emptyList(), new pi(), 0, 0, 0, 0.0f, 0.0f, b.width(), b.height(), null, null, Collections.emptyList(), qf.b.None, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static qf a(JsonReader jsonReader, d dVar) {
        ArrayList arrayList;
        float f;
        ?? r2;
        char c;
        qf.b bVar = qf.b.None;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        boolean z = false;
        qf.b bVar2 = bVar;
        qf.a aVar = null;
        String str = null;
        pi piVar = null;
        pg pgVar = null;
        ph phVar = null;
        oy oyVar = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        long j = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        long j2 = -1;
        float f4 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f5 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        r2 = 4;
                        break;
                    }
                    r2 = -1;
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        r2 = 11;
                        break;
                    }
                    r2 = -1;
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        r2 = 17;
                        break;
                    }
                    r2 = -1;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        r2 = 12;
                        break;
                    }
                    r2 = -1;
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        r2 = 16;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3177:
                    if (nextName.equals("cl")) {
                        r2 = 21;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        r2 = 13;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        r2 = 18;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        r2 = 8;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        r2 = z;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        r2 = 19;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        r2 = 7;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3669:
                    if (nextName.equals("sh")) {
                        r2 = 6;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        r2 = 14;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        r2 = 15;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        r2 = 5;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        r2 = 20;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3712:
                    if (nextName.equals(TtmlNode.TAG_TT)) {
                        r2 = 9;
                        break;
                    }
                    r2 = -1;
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        r2 = 3;
                        break;
                    }
                    r2 = -1;
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        r2 = 1;
                        break;
                    }
                    r2 = -1;
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        r2 = 2;
                        break;
                    }
                    r2 = -1;
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        r2 = 10;
                        break;
                    }
                    r2 = -1;
                    break;
                default:
                    r2 = -1;
                    break;
            }
            switch (r2) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    j = jsonReader.nextInt();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    if (nextInt < qf.a.Unknown.ordinal()) {
                        aVar = qf.a.values()[nextInt];
                        break;
                    } else {
                        aVar = qf.a.Unknown;
                        break;
                    }
                case 4:
                    j2 = jsonReader.nextInt();
                    break;
                case 5:
                    i = (int) (jsonReader.nextInt() * sc.a());
                    break;
                case 6:
                    i2 = (int) (jsonReader.nextInt() * sc.a());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    piVar = qp.a(jsonReader, dVar);
                    break;
                case 9:
                    bVar2 = qf.b.values()[jsonReader.nextInt()];
                    break;
                case 10:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(rh.a(jsonReader, dVar));
                    }
                    jsonReader.endArray();
                    break;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        pm a = qt.a(jsonReader, dVar);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 12:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != 97) {
                            if (hashCode == 100 && nextName2.equals("d")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (nextName2.equals("a")) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                pgVar = qq.f(jsonReader, dVar);
                                break;
                            case 1:
                                jsonReader.beginArray();
                                if (jsonReader.hasNext()) {
                                    phVar = qo.a(jsonReader, dVar);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 13:
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            if (((nextName3.hashCode() == 3519 && nextName3.equals("nm")) ? (char) 0 : (char) 65535) == 0) {
                                arrayList4.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    dVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    i4 = (int) (jsonReader.nextInt() * sc.a());
                    break;
                case 17:
                    i5 = (int) (jsonReader.nextInt() * sc.a());
                    break;
                case 18:
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    oyVar = qq.a(jsonReader, dVar, z);
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            z = false;
        }
        jsonReader.endObject();
        float f6 = f5 / f4;
        float f7 = f2 / f4;
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList5;
            arrayList.add(new sd(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(f6)));
            f = 0.0f;
        } else {
            arrayList = arrayList5;
            f = 0.0f;
        }
        if (f7 <= f) {
            f7 = dVar.e();
        }
        arrayList.add(new sd(dVar, Float.valueOf(1.0f), Float.valueOf(1.0f), null, f6, Float.valueOf(f7)));
        arrayList.add(new sd(dVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, f7, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            dVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new qf(arrayList3, dVar, str2, j, aVar, j2, str, arrayList2, piVar, i, i2, i3, f4, f3, i4, i5, pgVar, phVar, arrayList, bVar2, oyVar);
    }
}
