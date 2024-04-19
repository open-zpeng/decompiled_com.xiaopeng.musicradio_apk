package defpackage;

import java.util.HashMap;
/* compiled from: DataLogContext.java */
/* renamed from: abg  reason: default package */
/* loaded from: classes2.dex */
public class abg {
    private static boolean a;
    private static a b;
    private static String c;

    /* compiled from: DataLogContext.java */
    /* renamed from: abg$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(HashMap<String, Object> hashMap);

        void b(HashMap<String, Object> hashMap);
    }

    public static boolean a() {
        return a;
    }

    public static void a(boolean z) {
        a = z;
    }

    public static a b() {
        return b;
    }

    public static void a(a aVar) {
        b = aVar;
    }

    public static String c() {
        String str = c;
        return str != null ? str : "";
    }

    public static void a(String str) {
        c = str;
    }
}
