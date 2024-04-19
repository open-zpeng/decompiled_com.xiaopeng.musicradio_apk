package defpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
/* compiled from: SSLSocketFactoryFactory.java */
/* renamed from: bls  reason: default package */
/* loaded from: classes3.dex */
public class bls {
    private static final String[] a = {"com.ibm.ssl.protocol", "com.ibm.ssl.contextProvider", "com.ibm.ssl.keyStore", "com.ibm.ssl.keyStorePassword", "com.ibm.ssl.keyStoreType", "com.ibm.ssl.keyStoreProvider", "com.ibm.ssl.keyManager", "com.ibm.ssl.trustStore", "com.ibm.ssl.trustStorePassword", "com.ibm.ssl.trustStoreType", "com.ibm.ssl.trustStoreProvider", "com.ibm.ssl.trustManager", "com.ibm.ssl.enabledCipherSuites", "com.ibm.ssl.clientAuthentication"};
    private static final byte[] d = {-99, -89, -39, Byte.MIN_VALUE, 5, -72, -119, -100};
    private Properties c;
    private bna e = null;
    private Hashtable b = new Hashtable();

    private boolean p(String str) {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i < strArr.length && !strArr[i].equals(str)) {
                i++;
            }
        }
        return i < a.length;
    }

    private void a(Properties properties) {
        for (String str : properties.keySet()) {
            if (!p(str)) {
                throw new IllegalArgumentException(String.valueOf(str) + " is not a valid IBM SSL property key.");
            }
        }
    }

    public static char[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length / 2];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i + 1;
            cArr[i2] = (char) ((bArr[i] & 255) + ((bArr[i3] & 255) << 8));
            i2++;
            i = i3 + 1;
        }
        return cArr;
    }

    public static byte[] a(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArr = new byte[cArr.length * 2];
        int i = 0;
        for (int i2 = 0; i2 < cArr.length; i2++) {
            int i3 = i + 1;
            bArr[i] = (byte) (cArr[i2] & 255);
            i = i3 + 1;
            bArr[i3] = (byte) ((cArr[i2] >> '\b') & 255);
        }
        return bArr;
    }

    public static String b(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] a2 = a(cArr);
        for (int i = 0; i < a2.length; i++) {
            byte b = a2[i];
            byte[] bArr = d;
            a2[i] = (byte) ((b ^ bArr[i % bArr.length]) & 255);
        }
        return "{xor}" + new String(blt.a(a2));
    }

    public static char[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] a2 = blt.a(str.substring(5));
            for (int i = 0; i < a2.length; i++) {
                byte b = a2[i];
                byte[] bArr = d;
                a2[i] = (byte) ((b ^ bArr[i % bArr.length]) & 255);
            }
            return a(a2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] b(String str) {
        if (str == null) {
            return null;
        }
        Vector vector = new Vector();
        int indexOf = str.indexOf(44);
        int i = 0;
        while (indexOf > -1) {
            vector.add(str.substring(i, indexOf));
            i = indexOf + 1;
            indexOf = str.indexOf(44, i);
        }
        vector.add(str.substring(i));
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    private void b(Properties properties) {
        String property = properties.getProperty("com.ibm.ssl.keyStorePassword");
        if (property != null && !property.startsWith("{xor}")) {
            properties.put("com.ibm.ssl.keyStorePassword", b(property.toCharArray()));
        }
        String property2 = properties.getProperty("com.ibm.ssl.trustStorePassword");
        if (property2 == null || property2.startsWith("{xor}")) {
            return;
        }
        properties.put("com.ibm.ssl.trustStorePassword", b(property2.toCharArray()));
    }

    public void a(Properties properties, String str) {
        a(properties);
        Properties properties2 = new Properties();
        properties2.putAll(properties);
        b(properties2);
        if (str != null) {
            this.b.put(str, properties2);
        } else {
            this.c = properties2;
        }
    }

    private String a(String str, String str2, String str3) {
        String a2 = a(str, str2);
        return (a2 == null && str3 != null) ? System.getProperty(str3) : a2;
    }

    private String a(String str, String str2) {
        String str3 = null;
        Properties properties = str != null ? (Properties) this.b.get(str) : null;
        if (properties == null || (str3 = properties.getProperty(str2)) == null) {
            Properties properties2 = this.c;
            return (properties2 == null || (str3 = properties2.getProperty(str2)) == null) ? str3 : str3;
        }
        return str3;
    }

    public String c(String str) {
        return a(str, "com.ibm.ssl.protocol", null);
    }

    public String d(String str) {
        return a(str, "com.ibm.ssl.contextProvider", null);
    }

    public char[] e(String str) {
        String a2 = a(str, "com.ibm.ssl.keyStorePassword", "javax.net.ssl.keyStorePassword");
        if (a2 != null) {
            if (a2.startsWith("{xor}")) {
                return a(a2);
            }
            return a2.toCharArray();
        }
        return null;
    }

    public String f(String str) {
        return a(str, "com.ibm.ssl.keyStoreType", "javax.net.ssl.keyStoreType");
    }

    public String g(String str) {
        return a(str, "com.ibm.ssl.keyStoreProvider", null);
    }

    public String h(String str) {
        return a(str, "com.ibm.ssl.keyManager", "ssl.KeyManagerFactory.algorithm");
    }

    public String i(String str) {
        return a(str, "com.ibm.ssl.trustStore", "javax.net.ssl.trustStore");
    }

    public char[] j(String str) {
        String a2 = a(str, "com.ibm.ssl.trustStorePassword", "javax.net.ssl.trustStorePassword");
        if (a2 != null) {
            if (a2.startsWith("{xor}")) {
                return a(a2);
            }
            return a2.toCharArray();
        }
        return null;
    }

    public String k(String str) {
        return a(str, "com.ibm.ssl.trustStoreType", null);
    }

    public String l(String str) {
        return a(str, "com.ibm.ssl.trustStoreProvider", null);
    }

    public String m(String str) {
        return a(str, "com.ibm.ssl.trustManager", "ssl.TrustManagerFactory.algorithm");
    }

    public String[] n(String str) {
        return b(a(str, "com.ibm.ssl.enabledCipherSuites", null));
    }

    private SSLContext q(String str) {
        SSLContext sSLContext;
        KeyManager[] keyManagerArr;
        TrustManager[] trustManagerArr;
        SecureRandom secureRandom;
        TrustManagerFactory trustManagerFactory;
        KeyManagerFactory keyManagerFactory;
        String str2 = str;
        String c = c(str);
        if (c == null) {
            c = "TLS";
        }
        bna bnaVar = this.e;
        if (bnaVar != null) {
            Object[] objArr = new Object[2];
            objArr[0] = str2 != null ? str2 : "null (broker defaults)";
            objArr[1] = c;
            bnaVar.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12000", objArr);
        }
        String d2 = d(str);
        try {
            if (d2 == null) {
                sSLContext = SSLContext.getInstance(c);
            } else {
                sSLContext = SSLContext.getInstance(c, d2);
            }
            if (this.e != null) {
                bna bnaVar2 = this.e;
                Object[] objArr2 = new Object[2];
                objArr2[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr2[1] = sSLContext.getProvider().getName();
                bnaVar2.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12001", objArr2);
            }
            String a2 = a(str2, "com.ibm.ssl.keyStore", null);
            if (a2 == null) {
                a2 = a(str2, "com.ibm.ssl.keyStore", "javax.net.ssl.keyStore");
            }
            if (this.e != null) {
                bna bnaVar3 = this.e;
                Object[] objArr3 = new Object[2];
                objArr3[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr3[1] = a2 != null ? a2 : "null";
                bnaVar3.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12004", objArr3);
            }
            char[] e = e(str);
            if (this.e != null) {
                bna bnaVar4 = this.e;
                Object[] objArr4 = new Object[2];
                objArr4[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr4[1] = e != null ? b(e) : "null";
                bnaVar4.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12005", objArr4);
            }
            String f = f(str);
            if (f == null) {
                f = KeyStore.getDefaultType();
            }
            if (this.e != null) {
                bna bnaVar5 = this.e;
                Object[] objArr5 = new Object[2];
                objArr5[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr5[1] = f != null ? f : "null";
                bnaVar5.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12006", objArr5);
            }
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            String g = g(str);
            String h = h(str);
            if (h != null) {
                defaultAlgorithm = h;
            }
            if (a2 == null || f == null || defaultAlgorithm == null) {
                keyManagerArr = null;
            } else {
                try {
                    KeyStore keyStore = KeyStore.getInstance(f);
                    keyStore.load(new FileInputStream(a2), e);
                    if (g != null) {
                        keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm, g);
                    } else {
                        keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
                    }
                    if (this.e != null) {
                        bna bnaVar6 = this.e;
                        Object[] objArr6 = new Object[2];
                        objArr6[0] = str2 != null ? str2 : "null (broker defaults)";
                        if (defaultAlgorithm == null) {
                            defaultAlgorithm = "null";
                        }
                        objArr6[1] = defaultAlgorithm;
                        bnaVar6.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12010", objArr6);
                        bna bnaVar7 = this.e;
                        Object[] objArr7 = new Object[2];
                        objArr7[0] = str2 != null ? str2 : "null (broker defaults)";
                        objArr7[1] = keyManagerFactory.getProvider().getName();
                        bnaVar7.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12009", objArr7);
                    }
                    keyManagerFactory.init(keyStore, e);
                    keyManagerArr = keyManagerFactory.getKeyManagers();
                } catch (FileNotFoundException e2) {
                    throw new bkx(e2);
                } catch (IOException e3) {
                    throw new bkx(e3);
                } catch (KeyStoreException e4) {
                    throw new bkx(e4);
                } catch (UnrecoverableKeyException e5) {
                    throw new bkx(e5);
                } catch (CertificateException e6) {
                    throw new bkx(e6);
                }
            }
            String i = i(str);
            if (this.e != null) {
                bna bnaVar8 = this.e;
                Object[] objArr8 = new Object[2];
                objArr8[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr8[1] = i != null ? i : "null";
                bnaVar8.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12011", objArr8);
            }
            char[] j = j(str);
            if (this.e != null) {
                bna bnaVar9 = this.e;
                Object[] objArr9 = new Object[2];
                objArr9[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr9[1] = j != null ? b(j) : "null";
                bnaVar9.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12012", objArr9);
            }
            String k = k(str);
            if (k == null) {
                k = KeyStore.getDefaultType();
            }
            if (this.e != null) {
                bna bnaVar10 = this.e;
                Object[] objArr10 = new Object[2];
                objArr10[0] = str2 != null ? str2 : "null (broker defaults)";
                objArr10[1] = k != null ? k : "null";
                bnaVar10.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12013", objArr10);
            }
            String defaultAlgorithm2 = TrustManagerFactory.getDefaultAlgorithm();
            String l = l(str);
            String m = m(str);
            if (m != null) {
                defaultAlgorithm2 = m;
            }
            if (i == null || k == null || defaultAlgorithm2 == null) {
                trustManagerArr = null;
                secureRandom = null;
            } else {
                try {
                    KeyStore keyStore2 = KeyStore.getInstance(k);
                    keyStore2.load(new FileInputStream(i), j);
                    if (l != null) {
                        trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm2, l);
                    } else {
                        trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm2);
                    }
                    if (this.e != null) {
                        bna bnaVar11 = this.e;
                        Object[] objArr11 = new Object[2];
                        objArr11[0] = str2 != null ? str2 : "null (broker defaults)";
                        if (defaultAlgorithm2 == null) {
                            defaultAlgorithm2 = "null";
                        }
                        objArr11[1] = defaultAlgorithm2;
                        bnaVar11.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12017", objArr11);
                        bna bnaVar12 = this.e;
                        Object[] objArr12 = new Object[2];
                        if (str2 == null) {
                            str2 = "null (broker defaults)";
                        }
                        objArr12[0] = str2;
                        objArr12[1] = trustManagerFactory.getProvider().getName();
                        bnaVar12.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "getSSLContext", "12016", objArr12);
                    }
                    trustManagerFactory.init(keyStore2);
                    trustManagerArr = trustManagerFactory.getTrustManagers();
                    secureRandom = null;
                } catch (FileNotFoundException e7) {
                    throw new bkx(e7);
                } catch (IOException e8) {
                    throw new bkx(e8);
                } catch (KeyStoreException e9) {
                    throw new bkx(e9);
                } catch (CertificateException e10) {
                    throw new bkx(e10);
                }
            }
            sSLContext.init(keyManagerArr, trustManagerArr, secureRandom);
            return sSLContext;
        } catch (KeyManagementException e11) {
            throw new bkx(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new bkx(e12);
        } catch (NoSuchProviderException e13) {
            throw new bkx(e13);
        }
    }

    public SSLSocketFactory o(String str) {
        SSLContext q = q(str);
        bna bnaVar = this.e;
        if (bnaVar != null) {
            Object[] objArr = new Object[2];
            objArr[0] = str != null ? str : "null (broker defaults)";
            objArr[1] = n(str) != null ? a(str, "com.ibm.ssl.enabledCipherSuites", null) : "null (using platform-enabled cipher suites)";
            bnaVar.fine("org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory", "createSocketFactory", "12020", objArr);
        }
        return q.getSocketFactory();
    }
}
