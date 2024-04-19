package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import javax.net.SocketFactory;
/* compiled from: WebSocketNetworkModule.java */
/* renamed from: blz  reason: default package */
/* loaded from: classes3.dex */
public class blz extends blq {
    private static final String b = "blz";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b);
    private String d;
    private String e;
    private int f;
    private PipedInputStream g;
    private bma h;
    private ByteArrayOutputStream i;

    public blz(SocketFactory socketFactory, String str, String str2, int i, String str3) {
        super(socketFactory, str2, i, str3);
        this.i = new blv(this);
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = new PipedInputStream();
        c.setResourceName(str3);
    }

    @Override // defpackage.blq, defpackage.bln
    public void a() {
        super.a();
        new bly(g(), f(), this.d, this.e, this.f).a();
        this.h = new bma(g(), this.g);
        this.h.a("webSocketReceiver");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OutputStream f() {
        return super.c();
    }

    InputStream g() {
        return super.b();
    }

    @Override // defpackage.blq, defpackage.bln
    public InputStream b() {
        return this.g;
    }

    @Override // defpackage.blq, defpackage.bln
    public OutputStream c() {
        return this.i;
    }

    @Override // defpackage.blq, defpackage.bln
    public void d() {
        f().write(new blx((byte) 8, true, "1000".getBytes()).c());
        f().flush();
        bma bmaVar = this.h;
        if (bmaVar != null) {
            bmaVar.a();
        }
        super.d();
    }

    @Override // defpackage.blq, defpackage.bln
    public String e() {
        return "ws://" + this.e + ":" + this.f;
    }
}
