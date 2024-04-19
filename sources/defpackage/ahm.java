package defpackage;

import android.view.View;
import com.xiaopeng.xui.vui.VuiView;
import java.util.Arrays;
import java.util.List;
/* compiled from: LoginVuiUtils.java */
/* renamed from: ahm  reason: default package */
/* loaded from: classes2.dex */
public class ahm {
    public static void a(String str, View view) {
        afd.a(str, view);
    }

    public static void a(View view, bih bihVar) {
        if (view instanceof VuiView) {
            VuiView vuiView = (VuiView) view;
            vuiView.enableViewVuiMode(true);
            vuiView.setVuiElementType(bihVar);
        }
    }

    public static List<String> a() {
        return Arrays.asList("MainMineLocalLeft", "MainLocalTop");
    }
}
