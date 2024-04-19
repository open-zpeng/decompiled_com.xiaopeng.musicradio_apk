package defpackage;

import android.text.TextUtils;
import com.xiaopeng.speech.actorapi.SupportActor;
/* compiled from: SpeechUtils.java */
/* renamed from: bgp  reason: default package */
/* loaded from: classes2.dex */
public class bgp {
    public static void a(String str, boolean z) {
        a(str, z, "");
    }

    public static void a(String str, boolean z, String str2) {
        bht bhtVar = new bht();
        bhtVar.a(z);
        bhtVar.a(str2);
        bfb.b().c().a(new SupportActor(str).a(bhtVar));
    }

    public static void a(Class<? extends bfc> cls, bes besVar) {
        bfb.b().j().a(cls, besVar);
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            if (trim.startsWith("{") && trim.endsWith("}")) {
                return true;
            }
            if (trim.startsWith("[") && trim.endsWith("]")) {
                return true;
            }
        }
        return false;
    }
}
