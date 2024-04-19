package defpackage;

import java.util.Map;
/* compiled from: UTAdapter.java */
/* renamed from: vh  reason: default package */
/* loaded from: classes3.dex */
public class vh {
    public static void a(Map<String, String> map) {
        Object a;
        try {
            Object a2 = vc.a("com.ut.mini.UTAnalytics", "getInstance");
            if (a2 == null || (a = vc.a(a2, "getDefaultTracker")) == null) {
                return;
            }
            vc.a(a, "send", new Object[]{map}, Map.class);
        } catch (Exception unused) {
        }
    }
}
