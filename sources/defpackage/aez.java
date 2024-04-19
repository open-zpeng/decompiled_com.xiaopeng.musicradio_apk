package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.base.a;
/* compiled from: BaseActivityUtils.java */
/* renamed from: aez  reason: default package */
/* loaded from: classes2.dex */
public class aez {
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

    public static com.xiaopeng.musicradio.commonui.widget.a b(Context context) {
        a a = a(context);
        if (a != null) {
            return a.c();
        }
        LogUtils.e("MusicBaseActivity", "BaseActivity is no found");
        return null;
    }

    public static View a(ViewGroup viewGroup, int i, String str) {
        Context context = viewGroup.getContext();
        com.xiaopeng.musicradio.commonui.widget.a b = b(context);
        View a = b != null ? b.a(i, str) : null;
        if (a == null) {
            a = LayoutInflater.from(context).inflate(i, viewGroup, false);
        }
        if (b != null) {
            b.a(i);
        }
        return a;
    }
}
