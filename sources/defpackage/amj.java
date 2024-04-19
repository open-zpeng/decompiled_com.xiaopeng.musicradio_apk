package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.commonui.widget.a;
/* compiled from: MinePreLoaderUtils.java */
/* renamed from: amj  reason: default package */
/* loaded from: classes2.dex */
public class amj {
    private static ame a = new ami();

    public static void a(Context context, a aVar, int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            Runnable a2 = a.a(context, aVar, i2);
            if (a2 != null) {
                if (i == i2) {
                    a2.run();
                } else {
                    ban.b(a2, ListSignBean.USB_MUSIC_ID);
                }
            }
        }
    }
}
