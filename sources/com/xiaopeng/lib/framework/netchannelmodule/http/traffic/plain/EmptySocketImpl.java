package com.xiaopeng.lib.framework.netchannelmodule.http.traffic.plain;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;
/* loaded from: classes.dex */
public class EmptySocketImpl extends SocketImpl {
    @Override // java.net.SocketImpl
    protected void accept(SocketImpl socketImpl) {
    }

    @Override // java.net.SocketImpl
    protected int available() {
        return 0;
    }

    @Override // java.net.SocketImpl
    protected void bind(InetAddress inetAddress, int i) {
    }

    @Override // java.net.SocketImpl
    protected void close() {
    }

    @Override // java.net.SocketImpl
    protected void connect(String str, int i) {
    }

    @Override // java.net.SocketImpl
    protected void connect(InetAddress inetAddress, int i) {
    }

    @Override // java.net.SocketImpl
    protected void connect(SocketAddress socketAddress, int i) {
    }

    @Override // java.net.SocketImpl
    protected void create(boolean z) {
    }

    @Override // java.net.SocketImpl
    protected InputStream getInputStream() {
        return null;
    }

    @Override // java.net.SocketOptions
    public Object getOption(int i) {
        return null;
    }

    @Override // java.net.SocketImpl
    protected OutputStream getOutputStream() {
        return null;
    }

    @Override // java.net.SocketImpl
    protected void listen(int i) {
    }

    @Override // java.net.SocketImpl
    protected void sendUrgentData(int i) {
    }

    @Override // java.net.SocketOptions
    public void setOption(int i, Object obj) {
    }
}
