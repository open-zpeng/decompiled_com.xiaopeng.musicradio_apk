package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import defpackage.qa;
import java.util.ArrayList;
/* compiled from: GradientStrokeParser.java */
/* renamed from: ra  reason: default package */
/* loaded from: classes3.dex */
class ra {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static pp a(JsonReader jsonReader, d dVar) {
        char c;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        pq pqVar = null;
        oz ozVar = null;
        pa paVar = null;
        pc pcVar = null;
        pc pcVar2 = null;
        oy oyVar = null;
        qa.a aVar = null;
        qa.b bVar = null;
        oy oyVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
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
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != 107) {
                            if (hashCode == 112 && nextName2.equals(TtmlNode.TAG_P)) {
                                z = false;
                            }
                            z = true;
                        } else {
                            if (nextName2.equals("k")) {
                                z = true;
                            }
                            z = true;
                        }
                        switch (z) {
                            case false:
                                i = jsonReader.nextInt();
                                break;
                            case true:
                                ozVar = qq.a(jsonReader, dVar, i);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    paVar = qq.b(jsonReader, dVar);
                    break;
                case 3:
                    pqVar = jsonReader.nextInt() == 1 ? pq.Linear : pq.Radial;
                    break;
                case 4:
                    pcVar = qq.c(jsonReader, dVar);
                    break;
                case 5:
                    pcVar2 = qq.c(jsonReader, dVar);
                    break;
                case 6:
                    oyVar = qq.a(jsonReader, dVar);
                    break;
                case 7:
                    aVar = qa.a.values()[jsonReader.nextInt() - 1];
                    break;
                case '\b':
                    bVar = qa.b.values()[jsonReader.nextInt() - 1];
                    break;
                case '\t':
                    f = (float) jsonReader.nextDouble();
                    break;
                case '\n':
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        oy oyVar3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            int hashCode2 = nextName3.hashCode();
                            oy oyVar4 = oyVar2;
                            if (hashCode2 != 110) {
                                if (hashCode2 == 118 && nextName3.equals("v")) {
                                    z2 = true;
                                }
                                z2 = true;
                            } else {
                                if (nextName3.equals("n")) {
                                    z2 = false;
                                }
                                z2 = true;
                            }
                            switch (z2) {
                                case false:
                                    str2 = jsonReader.nextString();
                                    break;
                                case true:
                                    oyVar3 = qq.a(jsonReader, dVar);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                            oyVar2 = oyVar4;
                        }
                        oy oyVar5 = oyVar2;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            oyVar2 = oyVar3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                arrayList.add(oyVar3);
                            }
                            oyVar2 = oyVar5;
                        }
                    }
                    oy oyVar6 = oyVar2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    oyVar2 = oyVar6;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new pp(str, pqVar, ozVar, paVar, pcVar, pcVar2, oyVar, aVar, bVar, f, arrayList, oyVar2);
    }
}
