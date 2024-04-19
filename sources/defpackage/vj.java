package defpackage;

import android.annotation.TargetApi;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
/* compiled from: UtExtendTrustManager.java */
@TargetApi(24)
/* renamed from: vj  reason: default package */
/* loaded from: classes3.dex */
class vj extends X509ExtendedTrustManager {
    private static TrustManager[] a;

    vj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized TrustManager[] a() {
        TrustManager[] trustManagerArr;
        synchronized (vj.class) {
            if (a == null) {
                a = new TrustManager[]{new vj()};
            }
            trustManagerArr = a;
        }
        return trustManagerArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        uw.a("UtExtendTrustManager", "checkClientTrusted1");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        uw.a("UtExtendTrustManager", "checkServerTrusted1");
        if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            if (trustManagerFactory == null || trustManagerFactory.getTrustManagers() == null) {
                return;
            }
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                try {
                    ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                } catch (CertificateException e) {
                    for (Throwable th = e; th != null; th = th.getCause()) {
                        if ((th instanceof CertificateExpiredException) || (th instanceof CertificateNotYetValidException)) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        } catch (KeyStoreException e2) {
            throw new CertificateException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new CertificateException(e3);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        uw.a("UtExtendTrustManager", "checkClientTrusted2");
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        try {
            x509CertificateArr[0].checkValidity();
        } catch (Exception unused) {
            throw new CertificateException("Certificate not valid or trusted.");
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        uw.a("UtExtendTrustManager", "checkServerTrusted2");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        uw.a("UtExtendTrustManager", "checkClientTrusted3");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        uw.a("UtExtendTrustManager", "checkServerTrusted3");
    }
}
