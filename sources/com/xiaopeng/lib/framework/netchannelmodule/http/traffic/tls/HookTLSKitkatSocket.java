package com.xiaopeng.lib.framework.netchannelmodule.http.traffic.tls;

import com.xiaopeng.lib.framework.netchannelmodule.http.statistic.SocketCounter;
import com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingInputStream;
import com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingOutputStream;
import com.xiaopeng.lib.framework.netchannelmodule.http.traffic.ICollector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class HookTLSKitkatSocket {
    private static Constructor mInputConstruct;
    private static Field mInputField;
    private static Constructor mOutputConstruct;
    private static Field mOutputField;

    public static Socket createSocket(Socket socket, final String str) {
        if (socket instanceof SSLSocket) {
            if (mInputConstruct == null || mOutputConstruct == null) {
                mInputConstruct = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl$SSLInputStream").getDeclaredConstructors()[0];
                mOutputConstruct = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl$SSLOutputStream").getDeclaredConstructors()[0];
                mInputField = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl").getDeclaredField("is");
                mOutputField = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl").getDeclaredField("os");
                mInputConstruct.setAccessible(true);
                mOutputConstruct.setAccessible(true);
                mInputField.setAccessible(true);
                mOutputField.setAccessible(true);
            }
            SSLSocket sSLSocket = (SSLSocket) socket;
            ICollector iCollector = new ICollector() { // from class: com.xiaopeng.lib.framework.netchannelmodule.http.traffic.tls.HookTLSKitkatSocket.1
                @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.ICollector
                public String getDomain() {
                    return str;
                }
            };
            KitKatTLSInputStream kitKatTLSInputStream = new KitKatTLSInputStream(iCollector, sSLSocket);
            KitKatTLSOutputStream kitKatTLSOutputStream = new KitKatTLSOutputStream(iCollector, sSLSocket);
            kitKatTLSInputStream.setStatisticCounter(SocketCounter.getInstance());
            kitKatTLSOutputStream.setStatisticCounter(SocketCounter.getInstance());
            mInputField.set(socket, kitKatTLSInputStream);
            mOutputField.set(socket, kitKatTLSOutputStream);
            return sSLSocket;
        }
        return socket;
    }

    /* loaded from: classes.dex */
    private static class KitKatTLSInputStream extends CountingInputStream {
        private SSLSocket socket;

        public KitKatTLSInputStream(ICollector iCollector, SSLSocket sSLSocket) {
            super(iCollector, null);
            this.socket = sSLSocket;
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            checkInputStream();
            increaseSuccess();
            return super.read(bArr, i, i2);
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read() {
            checkInputStream();
            increaseSuccess();
            return super.read();
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingInputStream, java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            checkInputStream();
            increaseSuccess();
            return super.read(bArr);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            checkInputStream();
            return super.available();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            checkInputStream();
            super.reset();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            checkInputStream();
            return super.skip(j);
        }

        public void checkInputStream() {
            if (this.in == null) {
                try {
                    this.in = (InputStream) HookTLSKitkatSocket.mInputConstruct.newInstance(this.socket);
                } catch (Exception e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    throw new IOException(e);
                }
            }
        }

        public void increaseSuccess() {
            this.mCounter.increaseSucceedWithSize(this.mCollector.getDomain(), 0L);
        }
    }

    /* loaded from: classes.dex */
    private static class KitKatTLSOutputStream extends CountingOutputStream {
        private SSLSocket socket;

        public KitKatTLSOutputStream(ICollector iCollector, SSLSocket sSLSocket) {
            super(iCollector, null);
            this.socket = sSLSocket;
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) {
            checkInputStream();
            increaseSuccess();
            super.write(i);
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            checkInputStream();
            increaseSuccess();
            super.write(bArr);
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            checkInputStream();
            increaseSuccess();
            super.write(bArr, i, i2);
        }

        @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public void flush() {
            checkInputStream();
            super.flush();
        }

        public void checkInputStream() {
            if (this.out == null) {
                try {
                    this.out = (OutputStream) HookTLSKitkatSocket.mOutputConstruct.newInstance(this.socket);
                } catch (Exception e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    throw new IOException(e);
                }
            }
        }

        public void increaseSuccess() {
            this.mCounter.increaseSucceedWithSize(this.mCollector.getDomain(), 0L);
        }
    }
}
