package defpackage;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.HashMap;
/* compiled from: SearchIntentUtils.java */
/* renamed from: azy  reason: default package */
/* loaded from: classes2.dex */
public class azy {
    public static void a(Context context) {
        try {
            sp.a().a("/search/activity/main").navigation(context);
            HashMap hashMap = new HashMap();
            hashMap.put(VuiConstants.ELEMENT_TYPE, "search");
            bci.e(hashMap);
        } catch (Exception e) {
            LogUtils.e("SearchIntentUtils", "openSearchActivity", e);
        }
    }
}
