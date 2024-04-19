package defpackage;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
/* compiled from: LoggerFactory.java */
/* renamed from: bnb  reason: default package */
/* loaded from: classes3.dex */
public class bnb {
    private static final String a = "bnb";
    private static String b;
    private static String c = bmz.class.getName();

    public static bna a(String str, String str2) {
        String str3 = b;
        if (str3 == null) {
            str3 = c;
        }
        bna a2 = a(str3, ResourceBundle.getBundle(str), str2, null);
        if (a2 != null) {
            return a2;
        }
        throw new MissingResourceException("Error locating the logging class", a, str2);
    }

    private static bna a(String str, ResourceBundle resourceBundle, String str2, String str3) {
        try {
            Class<?> cls = Class.forName(str);
            if (cls != null) {
                try {
                    bna bnaVar = (bna) cls.newInstance();
                    bnaVar.initialise(resourceBundle, str2, str3);
                    return bnaVar;
                } catch (ExceptionInInitializerError unused) {
                    return null;
                } catch (IllegalAccessException unused2) {
                    return null;
                } catch (InstantiationException unused3) {
                    return null;
                } catch (SecurityException unused4) {
                    return null;
                }
            }
            return null;
        } catch (ClassNotFoundException unused5) {
            return null;
        } catch (NoClassDefFoundError unused6) {
            return null;
        }
    }

    public static void a(String str) {
        b = str;
    }
}
