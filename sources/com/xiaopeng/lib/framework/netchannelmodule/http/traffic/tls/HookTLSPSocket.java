package com.xiaopeng.lib.framework.netchannelmodule.http.traffic.tls;

import com.xiaopeng.lib.framework.netchannelmodule.http.statistic.BaseHttpCounter;
import com.xiaopeng.lib.framework.netchannelmodule.http.statistic.SocketCounter;
import com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingInputStream;
import com.xiaopeng.lib.framework.netchannelmodule.http.traffic.CountingOutputStream;
import com.xiaopeng.lib.framework.netchannelmodule.http.traffic.ICollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class HookTLSPSocket extends SSLSocket {
    private ICollector mCollector;
    private BaseHttpCounter mCounter = SocketCounter.getInstance();
    private SSLSocket mDelegate;
    private CountingInputStream mInputStream;
    private CountingOutputStream mOutputStream;

    public HookTLSPSocket(SSLSocket sSLSocket, final String str) {
        this.mDelegate = sSLSocket;
        this.mCollector = new ICollector() { // from class: com.xiaopeng.lib.framework.netchannelmodule.http.traffic.tls.HookTLSPSocket.1
            @Override // com.xiaopeng.lib.framework.netchannelmodule.http.traffic.ICollector
            public String getDomain() {
                return str;
            }
        };
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return this.mDelegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledCipherSuites() {
        return this.mDelegate.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.mDelegate.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return this.mDelegate.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return this.mDelegate.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        this.mDelegate.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return this.mDelegate.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.mDelegate.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.mDelegate.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() {
        this.mDelegate.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z) {
        this.mDelegate.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return this.mDelegate.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z) {
        this.mDelegate.setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z) {
        this.mDelegate.setWantClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return this.mDelegate.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return this.mDelegate.getWantClientAuth();
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z) {
        this.mDelegate.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return this.mDelegate.getEnableSessionCreation();
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        this.mDelegate.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        this.mDelegate.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLParameters getSSLParameters() {
        return this.mDelegate.getSSLParameters();
    }

    @Override // javax.net.ssl.SSLSocket
    public void setSSLParameters(SSLParameters sSLParameters) {
        this.mDelegate.setSSLParameters(sSLParameters);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.mDelegate.close();
        if (this.mInputStream != null) {
            this.mInputStream.close();
            this.mInputStream = null;
        }
        if (this.mOutputStream != null) {
            this.mOutputStream.close();
            this.mOutputStream = null;
        }
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.mDelegate.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        CountingInputStream countingInputStream = this.mInputStream;
        if (countingInputStream != null) {
            return countingInputStream;
        }
        this.mInputStream = new CountingInputStream(this.mCollector, this.mDelegate.getInputStream()).setStatisticCounter(this.mCounter);
        return this.mInputStream;
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return this.mDelegate.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.mDelegate.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.mDelegate.getLocalPort();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        CountingOutputStream countingOutputStream = this.mOutputStream;
        if (countingOutputStream != null) {
            return countingOutputStream;
        }
        this.mOutputStream = new CountingOutputStream(this.mCollector, this.mDelegate.getOutputStream());
        this.mOutputStream.setStatisticCounter(this.mCounter);
        return this.mOutputStream;
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.mDelegate.getPort();
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return this.mDelegate.getSoLinger();
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        return this.mDelegate.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        return this.mDelegate.getSendBufferSize();
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() {
        return this.mDelegate.getSoTimeout();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return this.mDelegate.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
        this.mDelegate.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
        this.mDelegate.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        this.mDelegate.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
        this.mDelegate.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) {
        this.mDelegate.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
        this.mDelegate.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.mDelegate.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.mDelegate.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.mDelegate.isBound();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.mDelegate.isConnected();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.mDelegate.isClosed();
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.mDelegate.bind(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        this.mDelegate.connect(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        this.mDelegate.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.mDelegate.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.mDelegate.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
        this.mDelegate.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return this.mDelegate.getReuseAddress();
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) {
        this.mDelegate.setOOBInline(z);
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return this.mDelegate.getOOBInline();
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
        this.mDelegate.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return this.mDelegate.getTrafficClass();
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
        this.mDelegate.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.mDelegate.getChannel();
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
        this.mDelegate.setPerformancePreferences(i, i2, i3);
    }
}
