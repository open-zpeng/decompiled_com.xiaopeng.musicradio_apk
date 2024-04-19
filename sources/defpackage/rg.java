package defpackage;

import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;
import com.airbnb.lottie.g;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import defpackage.qf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LottieCompositionParser.java */
/* renamed from: rg  reason: default package */
/* loaded from: classes3.dex */
public class rg {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d a(JsonReader jsonReader) {
        char c;
        bm<os> bmVar;
        HashMap hashMap;
        float a = sc.a();
        bi<qf> biVar = new bi<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        bm<os> bmVar2 = new bm<>();
        d dVar = new d();
        jsonReader.beginObject();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1408207997:
                    if (nextName.equals("assets")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1109732030:
                    if (nextName.equals("layers")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 118:
                    if (nextName.equals("v")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3276:
                    if (nextName.equals("fr")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 94623709:
                    if (nextName.equals("chars")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 97615364:
                    if (nextName.equals("fonts")) {
                        c = '\b';
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
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    i = jsonReader.nextInt();
                    break;
                case 1:
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    i2 = jsonReader.nextInt();
                    break;
                case 2:
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    f = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    f3 = (float) jsonReader.nextDouble();
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!sc.a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar.a("Lottie only supports bodymovin >= 4.4.0");
                        bmVar = bmVar2;
                        hashMap = hashMap4;
                        break;
                    } else {
                        bmVar = bmVar2;
                        hashMap = hashMap4;
                        break;
                    }
                case 6:
                    a(jsonReader, dVar, arrayList, biVar);
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    break;
                case 7:
                    a(jsonReader, dVar, hashMap2, hashMap3);
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    break;
                case '\b':
                    a(jsonReader, hashMap4);
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    break;
                case '\t':
                    a(jsonReader, dVar, bmVar2);
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    break;
                default:
                    bmVar = bmVar2;
                    hashMap = hashMap4;
                    jsonReader.skipValue();
                    break;
            }
            hashMap4 = hashMap;
            bmVar2 = bmVar;
        }
        jsonReader.endObject();
        dVar.a(new Rect(0, 0, (int) (i * a), (int) (i2 * a)), f, f2, f3, arrayList, biVar, hashMap2, hashMap3, bmVar2, hashMap4);
        return dVar;
    }

    private static void a(JsonReader jsonReader, d dVar, List<qf> list, bi<qf> biVar) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            qf a = rf.a(jsonReader, dVar);
            if (a.k() == qf.a.Image) {
                i++;
            }
            list.add(a);
            biVar.b(a.e(), a);
            if (i > 4) {
                c.b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    private static void a(JsonReader jsonReader, d dVar, Map<String, List<qf>> map, Map<String, g> map2) {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            bi biVar = new bi();
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == -1109732030) {
                    if (nextName.equals("layers")) {
                        c = 1;
                    }
                    c = 65535;
                } else if (hashCode == 104) {
                    if (nextName.equals("h")) {
                        c = 3;
                    }
                    c = 65535;
                } else if (hashCode == 112) {
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c = 4;
                    }
                    c = 65535;
                } else if (hashCode == 117) {
                    if (nextName.equals("u")) {
                        c = 5;
                    }
                    c = 65535;
                } else if (hashCode != 119) {
                    if (hashCode == 3355 && nextName.equals("id")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (nextName.equals("w")) {
                        c = 2;
                    }
                    c = 65535;
                }
                switch (c) {
                    case 0:
                        str = jsonReader.nextString();
                        break;
                    case 1:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            qf a = rf.a(jsonReader, dVar);
                            biVar.b(a.e(), a);
                            arrayList.add(a);
                        }
                        jsonReader.endArray();
                        break;
                    case 2:
                        i = jsonReader.nextInt();
                        break;
                    case 3:
                        i2 = jsonReader.nextInt();
                        break;
                    case 4:
                        str2 = jsonReader.nextString();
                        break;
                    case 5:
                        str3 = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                g gVar = new g(i, i2, str, str2, str3);
                map2.put(gVar.a(), gVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void a(JsonReader jsonReader, Map<String, or> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 3322014 && nextName.equals("list")) {
                c = 0;
            }
            if (c == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    or a = qx.a(jsonReader);
                    map.put(a.b(), a);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void a(JsonReader jsonReader, d dVar, bm<os> bmVar) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            os a = qw.a(jsonReader, dVar);
            bmVar.b(a.hashCode(), a);
        }
        jsonReader.endArray();
    }
}
