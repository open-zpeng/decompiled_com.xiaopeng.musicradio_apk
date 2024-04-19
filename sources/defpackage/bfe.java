package defpackage;

import com.xiaopeng.speech.vui.VuiEngineImpl;
/* compiled from: UnitySpeechEngine.java */
/* renamed from: bfe  reason: default package */
/* loaded from: classes2.dex */
public class bfe {
    private static VuiEngineImpl a = null;
    private static String b = "UnitySpeechEngine";

    public static void a(String str, String str2) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.dispatchVuiEvent(str, str2);
        }
    }

    public static String b(String str, String str2) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            return vuiEngineImpl.getElementState(str, str2);
        }
        return null;
    }

    public static void c(String str, String str2) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.onVuiQuery(str, str2);
        }
    }
}
