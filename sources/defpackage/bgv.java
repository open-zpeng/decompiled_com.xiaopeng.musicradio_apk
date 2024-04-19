package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: SeatValue.java */
/* renamed from: bgv  reason: default package */
/* loaded from: classes2.dex */
public class bgv {
    private int a;
    private int b;
    private int c;

    public static bgv a(String str) {
        bgv bgvVar = new bgv();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("xtarget");
            String optString2 = jSONObject.optString("vtarget");
            String optString3 = jSONObject.optString("htarget");
            int parseInt = !TextUtils.isEmpty(optString) ? Integer.parseInt(optString) : -1;
            int parseInt2 = !TextUtils.isEmpty(optString2) ? Integer.parseInt(optString2) : -1;
            int parseInt3 = TextUtils.isEmpty(optString3) ? -1 : Integer.parseInt(optString3);
            bgvVar.a = parseInt;
            bgvVar.b = parseInt2;
            bgvVar.c = parseInt3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bgvVar;
    }

    public String toString() {
        return "SeatValue{xValue=" + this.a + ", yValue=" + this.b + ", zValue=" + this.c + '}';
    }
}
