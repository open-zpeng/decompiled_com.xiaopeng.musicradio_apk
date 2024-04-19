package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.d;
import java.util.ArrayList;
/* compiled from: AnimatablePathValueParser.java */
/* renamed from: qn  reason: default package */
/* loaded from: classes3.dex */
public class qn {
    public static pb a(JsonReader jsonReader, d dVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(rj.a(jsonReader, dVar));
            }
            jsonReader.endArray();
            re.a(arrayList);
        } else {
            arrayList.add(new sd(rc.b(jsonReader, sc.a())));
        }
        return new pb(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static pj<PointF, PointF> b(JsonReader jsonReader, d dVar) {
        char c;
        jsonReader.beginObject();
        pb pbVar = null;
        oy oyVar = null;
        oy oyVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                switch (hashCode) {
                    case 120:
                        if (nextName.equals("x")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 121:
                        if (nextName.equals("y")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
            } else {
                if (nextName.equals("k")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    pbVar = a(jsonReader, dVar);
                    break;
                case 1:
                    if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        z = true;
                        break;
                    } else {
                        oyVar = qq.a(jsonReader, dVar);
                        break;
                    }
                case 2:
                    if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        z = true;
                        break;
                    } else {
                        oyVar2 = qq.a(jsonReader, dVar);
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            dVar.a("Lottie doesn't support expressions.");
        }
        return pbVar != null ? pbVar : new pf(oyVar, oyVar2);
    }
}
