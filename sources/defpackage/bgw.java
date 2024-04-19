package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: UserBookValue.java */
/* renamed from: bgw  reason: default package */
/* loaded from: classes2.dex */
public class bgw {
    private String a;

    public static bgw a(String str) {
        bgw bgwVar = new bgw();
        try {
            String optString = new JSONObject(str).optString("keyword");
            if (!TextUtils.isEmpty(optString)) {
                bgwVar.a = optString;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bgwVar;
    }
}
