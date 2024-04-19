package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: TCPNetworkModule.java */
/* renamed from: blq  reason: default package */
/* loaded from: classes3.dex */
public class blq implements bln {
    private static final String b = "blq";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b);
    protected Socket a;
    private SocketFactory d;
    private String e;
    private int f;
    private int g;

    public blq(SocketFactory socketFactory, String str, int i, String str2) {
        c.setResourceName(str2);
        this.d = socketFactory;
        this.e = str;
        this.f = i;
    }

    @Override // defpackage.bln
    public void a() {
        try {
            c.fine(b, "start", "252", new Object[]{this.e, new Integer(this.f), new Long(this.g * 1000)});
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.e, this.f);
            if (this.d instanceof SSLSocketFactory) {
                Socket socket = new Socket();
                socket.connect(inetSocketAddress, this.g * 1000);
                this.a = ((SSLSocketFactory) this.d).createSocket(socket, this.e, this.f, true);
                return;
            }
            this.a = this.d.createSocket();
            this.a.connect(inetSocketAddress, this.g * 1000);
        } catch (ConnectException e) {
            c.fine(b, "start", "250", null, e);
            throw new bks(32103, e);
        }
    }

    @Override // defpackage.bln
    public InputStream b() {
        return this.a.getInputStream();
    }

    @Override // defpackage.bln
    public OutputStream c() {
        return this.a.getOutputStream();
    }

    @Override // defpackage.bln
    public void d() {
        Socket socket = this.a;
        if (socket != null) {
            socket.shutdownInput();
            this.a.close();
        }
    }

    public void b(int i) {
        this.g = i;
    }

    @Override // defpackage.bln
    public String e() {
        return "tcp://" + this.e + ":" + this.f;
    }
}
