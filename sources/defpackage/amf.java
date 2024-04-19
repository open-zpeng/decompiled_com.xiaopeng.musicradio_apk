package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.xiaopeng.musicradio.commonui.vui.a;
/* compiled from: IntentUtils.java */
/* renamed from: amf  reason: default package */
/* loaded from: classes2.dex */
public class amf {
    public static a a(Context context) {
        a aVar = null;
        do {
            if (context instanceof a) {
                aVar = (a) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (aVar != null) {
                break;
            }
        } while (context != null);
        return aVar;
    }
}
