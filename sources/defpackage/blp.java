package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: SSLNetworkModule.java */
/* renamed from: blp  reason: default package */
/* loaded from: classes3.dex */
public class blp extends blq {
    private static final String b = "blp";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b);
    private String[] d;
    private int e;
    private HostnameVerifier f;
    private String g;
    private int h;

    public blp(SSLSocketFactory sSLSocketFactory, String str, int i, String str2) {
        super(sSLSocketFactory, str, i, str2);
        this.g = str;
        this.h = i;
        c.setResourceName(str2);
    }

    public void a(String[] strArr) {
        this.d = strArr;
        if (this.a == null || strArr == null) {
            return;
        }
        if (c.isLoggable(5)) {
            String str = "";
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    str = String.valueOf(str) + ListSignBean.COLLECTID_SUFFIX;
                }
                str = String.valueOf(str) + strArr[i];
            }
            c.fine(b, "setEnabledCiphers", "260", new Object[]{str});
        }
        ((SSLSocket) this.a).setEnabledCipherSuites(strArr);
    }

    public void a(int i) {
        super.b(i);
        this.e = i;
    }

    public void a(HostnameVerifier hostnameVerifier) {
        this.f = hostnameVerifier;
    }

    @Override // defpackage.blq, defpackage.bln
    public void a() {
        super.a();
        a(this.d);
        int soTimeout = this.a.getSoTimeout();
        this.a.setSoTimeout(this.e * 1000);
        ((SSLSocket) this.a).startHandshake();
        if (this.f != null) {
            this.f.verify(this.g, ((SSLSocket) this.a).getSession());
        }
        this.a.setSoTimeout(soTimeout);
    }

    @Override // defpackage.blq, defpackage.bln
    public String e() {
        return "ssl://" + this.g + ":" + this.h;
    }
}
