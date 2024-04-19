package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;
import org.jsoup.nodes.DocumentType;
/* compiled from: SystemConfig.java */
/* renamed from: uh  reason: default package */
/* loaded from: classes3.dex */
public class uh {
    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(DocumentType.SYSTEM_KEY)) {
                uw.a("SystemConfig", "server system config ", str);
                JSONObject optJSONObject = jSONObject.optJSONObject(DocumentType.SYSTEM_KEY);
                if (optJSONObject != null) {
                    try {
                        if (optJSONObject.has("bg_interval")) {
                            ud.c(optJSONObject.getInt("bg_interval") + "");
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        if (optJSONObject.has("fg_interval")) {
                            ud.d(optJSONObject.getInt("fg_interval") + "");
                        }
                    } catch (Throwable unused2) {
                    }
                    uw.a("SystemConfig", "UTDC.bSendToNewLogStore:", Boolean.valueOf(uc.h));
                    uw.a("SystemConfig", "Config.BACKGROUND_PERIOD:", Long.valueOf(ud.e()));
                    uw.a("SystemConfig", "Config.FOREGROUND_PERIOD:", Long.valueOf(ud.d()));
                    try {
                        if (optJSONObject.has("discard")) {
                            int i = optJSONObject.getInt("discard");
                            if (i == 1) {
                                ud.c = true;
                                vs.a().d();
                            } else if (i == 0) {
                                ud.c = false;
                                vs.a().b();
                            }
                        } else if (ud.c) {
                            ud.c = false;
                            vs.a().b();
                        }
                    } catch (Throwable unused3) {
                    }
                    try {
                        if (!optJSONObject.has("cdb") || optJSONObject.getInt("cdb") <= a()) {
                            return;
                        }
                        vg.a().a(new Runnable() { // from class: uh.1
                            @Override // java.lang.Runnable
                            public void run() {
                                un.a().c();
                            }
                        });
                    } catch (Throwable unused4) {
                    }
                }
            }
        } catch (Throwable th) {
            uw.a("SystemConfig", "updateconfig", th);
        }
    }

    public static int a() {
        JSONObject jSONObject;
        String f = ud.f();
        if (TextUtils.isEmpty(f)) {
            return 0;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(f);
            if (jSONObject2.has(DocumentType.SYSTEM_KEY) && (jSONObject = jSONObject2.getJSONObject(DocumentType.SYSTEM_KEY)) != null && jSONObject.has("cdb")) {
                return jSONObject.getInt("cdb");
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
