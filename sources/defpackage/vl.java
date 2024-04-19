package defpackage;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Build;
import android.text.TextUtils;
import com.lzy.okgo.cookie.SerializableCookie;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: UtSslSocketFactory.java */
/* renamed from: vl  reason: default package */
/* loaded from: classes3.dex */
class vl extends SSLSocketFactory {
    private Method a = null;
    private String b;

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return null;
    }

    public vl(String str) {
        this.b = str;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        uw.a("UtSslSocketFactory", "bizHost", this.b, SerializableCookie.HOST, str, "port", Integer.valueOf(i), "autoClose", Boolean.valueOf(z));
        if (TextUtils.isEmpty(this.b)) {
            throw new IOException("SDK set empty bizHost");
        }
        uw.a("UtSslSocketFactory", "customized createSocket. host: " + this.b);
        try {
            SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(10000, new SSLSessionCache(uc.c()));
            if (Build.VERSION.SDK_INT < 24) {
                sSLCertificateSocketFactory.setTrustManagers(vm.a());
            } else {
                sSLCertificateSocketFactory.setTrustManagers(vj.a());
            }
            SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.b, i, z);
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
            if (Build.VERSION.SDK_INT < 17) {
                try {
                    if (this.a == null) {
                        this.a = sSLSocket.getClass().getMethod("setHostname", String.class);
                        this.a.setAccessible(true);
                    }
                    this.a.invoke(sSLSocket, this.b);
                } catch (Exception unused) {
                }
            } else {
                sSLCertificateSocketFactory.setUseSessionTickets(sSLSocket, true);
                sSLCertificateSocketFactory.setHostname(sSLSocket, this.b);
            }
            sSLSocket.startHandshake();
            return sSLSocket;
        } catch (Throwable th) {
            throw new IOException("createSocket exception: " + th);
        }
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.b) || !(obj instanceof vl)) {
            return false;
        }
        String str = ((vl) obj).b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.equals(str);
    }

    public String a() {
        return this.b;
    }
}
