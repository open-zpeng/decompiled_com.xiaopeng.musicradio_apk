package defpackage;

import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: StreamType.java */
/* renamed from: bgz  reason: default package */
/* loaded from: classes2.dex */
public class bgz {
    public String a;

    public static bgz a(String str) {
        bgz bgzVar = new bgz();
        try {
            bgzVar.a = new JSONObject(str).optString(VuiConstants.ELEMENT_TYPE);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bgzVar;
    }
}
