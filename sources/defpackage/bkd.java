package defpackage;

import android.annotation.TargetApi;
import android.net.LinkProperties;
import org.chromium.base.annotations.DoNotInline;
/* compiled from: ApiHelperForP.java */
@DoNotInline
@TargetApi(28)
/* renamed from: bkd  reason: default package */
/* loaded from: classes3.dex */
public final class bkd {
    public static boolean a(LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }

    public static String b(LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }
}
