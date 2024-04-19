package defpackage;

import android.text.TextUtils;
import android.webkit.WebResourceError;
/* compiled from: WebViewUtils.java */
/* renamed from: bds  reason: default package */
/* loaded from: classes2.dex */
public class bds {
    public static boolean a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return "net::ERR_NAME_NOT_RESOLVED".equals(charSequence);
    }

    public static boolean a(WebResourceError webResourceError) {
        if (webResourceError != null) {
            return a(webResourceError.getDescription());
        }
        return false;
    }
}
