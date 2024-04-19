package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
import defpackage.qa;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeStrokeParser.java */
/* renamed from: ru  reason: default package */
/* loaded from: classes3.dex */
public class ru {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static qa a(JsonReader jsonReader, d dVar) {
        char c;
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        oy oyVar = null;
        ox oxVar = null;
        pa paVar = null;
        oy oyVar2 = null;
        qa.a aVar = null;
        qa.b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 119) {
                if (nextName.equals("w")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3447) {
                if (nextName.equals("lc")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 3454) {
                if (nextName.equals("lj")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 3487) {
                if (nextName.equals("ml")) {
                    c = 6;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 99:
                        if (nextName.equals("c")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 100:
                        if (nextName.equals("d")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
            } else {
                if (nextName.equals("nm")) {
                    c = 0;
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
                    oyVar2 = qq.a(jsonReader, dVar);
                    break;
                case 3:
                    paVar = qq.b(jsonReader, dVar);
                    break;
                case 4:
                    aVar = qa.a.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    bVar = qa.b.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        oy oyVar3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode2 = nextName2.hashCode();
                            if (hashCode2 != 110) {
                                if (hashCode2 == 118 && nextName2.equals("v")) {
                                    c3 = 1;
                                }
                                c3 = 65535;
                            } else {
                                if (nextName2.equals("n")) {
                                    c3 = 0;
                                }
                                c3 = 65535;
                            }
                            switch (c3) {
                                case 0:
                                    str2 = jsonReader.nextString();
                                    break;
                                case 1:
                                    oyVar3 = qq.a(jsonReader, dVar);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                        jsonReader.endObject();
                        int hashCode3 = str2.hashCode();
                        if (hashCode3 == 100) {
                            if (str2.equals("d")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        } else if (hashCode3 != 103) {
                            if (hashCode3 == 111 && str2.equals("o")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        }
                        switch (c2) {
                            case 0:
                                oyVar = oyVar3;
                                break;
                            case 1:
                            case 2:
                                arrayList.add(oyVar3);
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new qa(str, oyVar, arrayList, oxVar, paVar, oyVar2, aVar, bVar, f);
    }
}
