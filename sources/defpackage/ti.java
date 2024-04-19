package defpackage;

import android.content.Context;
import com.alibaba.mtl.appmonitor.f;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ExceptionEventBuilder.java */
/* renamed from: ti  reason: default package */
/* loaded from: classes3.dex */
public class ti {
    public static void a(Context context, Throwable th) {
        if (th != null) {
            try {
                tg tgVar = (tg) tj.a().a(tg.class, new Object[0]);
                tgVar.b = te.ALARM.a();
                HashMap hashMap = new HashMap();
                hashMap.put("meta", f.a());
                tm tmVar = (tm) tj.a().a(tm.class, new Object[0]);
                tmVar.put(b(context, th));
                hashMap.put("data", tmVar);
                tgVar.f.put(te.ALARM.d(), new JSONObject(hashMap).toString());
                tgVar.c = "APPMONITOR";
                tgVar.d = "sdk-exception";
                ub.a(tgVar);
                tj.a().a((tj) tmVar);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void a(Throwable th) {
        a(null, th);
    }

    private static JSONObject b(Context context, Throwable th) {
        JSONObject jSONObject = (JSONObject) tj.a().a(tn.class, new Object[0]);
        if (context != null) {
            try {
                jSONObject.put("pname", up.b(context));
            } catch (Exception unused) {
            }
        }
        jSONObject.put("page", "APPMONITOR");
        jSONObject.put("monitorPoint", "sdk-exception");
        jSONObject.put("arg", th.getClass().getSimpleName());
        jSONObject.put("successCount", 0);
        jSONObject.put("failCount", 1);
        ArrayList arrayList = new ArrayList();
        String b = b(th);
        if (b != null) {
            JSONObject jSONObject2 = (JSONObject) tj.a().a(tn.class, new Object[0]);
            jSONObject2.put("errorCode", b);
            jSONObject2.put("errorCount", 1);
            arrayList.add(jSONObject2);
        }
        jSONObject.put("errors", arrayList);
        return jSONObject;
    }

    private static String b(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
            }
        }
        String sb2 = sb.toString();
        return ua.b(sb2) ? th.toString() : sb2;
    }
}
