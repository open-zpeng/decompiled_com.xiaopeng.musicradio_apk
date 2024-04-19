package defpackage;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.d;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* compiled from: GradientFillParser.java */
/* renamed from: qz  reason: default package */
/* loaded from: classes3.dex */
class qz {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static po a(JsonReader jsonReader, d dVar) {
        char c;
        boolean z;
        String str = null;
        pq pqVar = null;
        Path.FillType fillType = null;
        oz ozVar = null;
        pa paVar = null;
        pc pcVar = null;
        pc pcVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 101) {
                if (nextName.equals("e")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 103) {
                if (nextName.equals("g")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 114:
                        if (nextName.equals("r")) {
                            c = 6;
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
                    jsonReader.beginObject();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode2 = nextName2.hashCode();
                        if (hashCode2 != 107) {
                            if (hashCode2 == 112 && nextName2.equals(TtmlNode.TAG_P)) {
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
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new po(str, pqVar, fillType, ozVar, paVar, pcVar, pcVar2, null, null);
    }
}
