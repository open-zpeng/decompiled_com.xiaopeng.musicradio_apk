package defpackage;

import java.util.Enumeration;
import java.util.Properties;
/* compiled from: Debug.java */
/* renamed from: bng  reason: default package */
/* loaded from: classes3.dex */
public class bng {
    private static final String a = bla.class.getName();
    private static final bna b = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private static final String c = System.getProperty("line.separator", "\n");

    public static String a(Properties properties, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration<?> propertyNames = properties.propertyNames();
        stringBuffer.append(String.valueOf(c) + "============== " + str + " ==============" + c);
        while (propertyNames.hasMoreElements()) {
            String str2 = (String) propertyNames.nextElement();
            stringBuffer.append(String.valueOf(a(str2, 28, ' ')) + ":  " + properties.get(str2) + c);
        }
        stringBuffer.append("==========================================" + c);
        return stringBuffer.toString();
    }

    public static String a(String str, int i, char c2) {
        if (str.length() >= i) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(str);
        int length = i - str.length();
        while (true) {
            length--;
            if (length >= 0) {
                stringBuffer.append(c2);
            } else {
                return stringBuffer.toString();
            }
        }
    }
}
