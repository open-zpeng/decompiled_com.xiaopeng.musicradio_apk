package defpackage;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import com.xiaopeng.musicradio.utils.bl;
/* compiled from: SearchDialogUtils.java */
/* renamed from: azx  reason: default package */
/* loaded from: classes2.dex */
public class azx {
    public static void a(Context context, bl blVar) {
        ayh ayhVar = new ayh(context);
        Window window = ayhVar.getWindow();
        if (window != null) {
            window.setType(2038);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.height = -2;
                attributes.width = -2;
                attributes.gravity = 17;
            }
        }
        ayhVar.show();
    }

    public static void a(Context context, String str) {
        ayh ayhVar = new ayh(context);
        ayhVar.a(str);
        Window window = ayhVar.getWindow();
        if (window != null) {
            window.setType(2038);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.height = -2;
                attributes.width = -2;
                attributes.gravity = 17;
            }
        }
        ayhVar.show();
    }
}
