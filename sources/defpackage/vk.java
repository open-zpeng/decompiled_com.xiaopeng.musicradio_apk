package defpackage;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
/* compiled from: UtHostnameVerifier.java */
/* renamed from: vk  reason: default package */
/* loaded from: classes3.dex */
class vk implements HostnameVerifier {
    public String a;

    public vk(String str) {
        this.a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.a, sSLSession);
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.a) || !(obj instanceof vk)) {
            return false;
        }
        String str = ((vk) obj).a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.a.equals(str);
    }

    public String a() {
        return this.a;
    }
}
