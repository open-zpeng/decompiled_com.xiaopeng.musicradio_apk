package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import defpackage.acs;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: ThemeParser.java */
/* renamed from: act  reason: default package */
/* loaded from: classes2.dex */
public class act {
    public static synchronized List<acu> a(Context context, String str) {
        synchronized (act.class) {
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        return a(context, context.getAssets().open(str));
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public static synchronized List<acu> a(Context context, InputStream inputStream) {
        ArrayList arrayList;
        acu acuVar;
        synchronized (act.class) {
            arrayList = new ArrayList();
            if (inputStream != null) {
                try {
                    XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                    newPullParser.setInput(inputStream, "utf-8");
                    acu acuVar2 = null;
                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                        String name = newPullParser.getName();
                        if (!TextUtils.isEmpty(name)) {
                            switch (eventType) {
                                case 2:
                                    if (!"view".equals(name.toLowerCase())) {
                                        break;
                                    } else {
                                        String attributeValue = newPullParser.getAttributeValue(null, "id");
                                        String attributeValue2 = newPullParser.getAttributeValue(null, "root");
                                        String attributeValue3 = newPullParser.getAttributeValue(null, "attr");
                                        String attributeValue4 = newPullParser.getAttributeValue(null, "value");
                                        if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(attributeValue3) || TextUtils.isEmpty(attributeValue4)) {
                                            acuVar = null;
                                        } else {
                                            acu acuVar3 = new acu();
                                            acuVar3.a = attributeValue;
                                            acuVar3.c = attributeValue2;
                                            acuVar3.b = attributeValue3;
                                            acuVar3.d = attributeValue4;
                                            acuVar = a(context, acuVar3);
                                        }
                                        acuVar2 = acuVar;
                                        continue;
                                    }
                                    break;
                                case 3:
                                    if (acuVar2 != null) {
                                        arrayList.add(acuVar2);
                                    }
                                    acuVar2 = null;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    private static acu a(Context context, acu acuVar) {
        if (context == null || acuVar == null) {
            return null;
        }
        try {
            Resources resources = context.getResources();
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(acuVar.a)) {
                acuVar.e = resources.getIdentifier(acuVar.a, "id", packageName);
            }
            if (!TextUtils.isEmpty(acuVar.b)) {
                acuVar.f = acuVar.b;
            }
            if (!TextUtils.isEmpty(acuVar.c)) {
                acuVar.h = resources.getIdentifier(acuVar.c, "id", packageName);
            }
            if (!TextUtils.isEmpty(acuVar.d) && acuVar.d.startsWith("@") && acuVar.d.contains("/")) {
                String substring = acuVar.d.substring(1, acuVar.d.indexOf("/"));
                int identifier = resources.getIdentifier(acuVar.d.substring(acuVar.d.indexOf("/") + 1), substring, packageName);
                acuVar.g = acs.c.a(substring);
                acuVar.i = Integer.valueOf(identifier);
            }
            return acuVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
