package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.xiaopeng.musicradio.utils.ba;
/* compiled from: CleanLeakUtils.java */
/* renamed from: afa  reason: default package */
/* loaded from: classes2.dex */
public class afa {
    public static void a(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        ba.a(inputMethodManager);
    }
}
