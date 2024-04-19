package defpackage;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import org.chromium.base.annotations.DoNotInline;
/* compiled from: ApiHelperForM.java */
@DoNotInline
@TargetApi(23)
/* renamed from: bkc  reason: default package */
/* loaded from: classes3.dex */
public final class bkc {
    public static Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    public static long a(Network network) {
        return network.getNetworkHandle();
    }

    public static Network b(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager, Network network) {
        return connectivityManager.getNetworkInfo(network);
    }
}
