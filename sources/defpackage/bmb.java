package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: WebSocketSecureNetworkModule.java */
/* renamed from: bmb  reason: default package */
/* loaded from: classes3.dex */
public class bmb extends blp {
    private static final String b = "bmb";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b);
    private PipedInputStream d;
    private bma e;
    private String f;
    private String g;
    private int h;
    private ByteArrayOutputStream i;

    public bmb(SSLSocketFactory sSLSocketFactory, String str, String str2, int i, String str3) {
        super(sSLSocketFactory, str2, i, str3);
        this.i = new blv(this);
        this.f = str;
        this.g = str2;
        this.h = i;
        this.d = new PipedInputStream();
        c.setResourceName(str3);
    }

    @Override // defpackage.blp, defpackage.blq, defpackage.bln
    public void a() {
        super.a();
        new bly(super.b(), super.c(), this.f, this.g, this.h).a();
        this.e = new bma(g(), this.d);
        this.e.a("WssSocketReceiver");
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
        return this.d;
    }

    @Override // defpackage.blq, defpackage.bln
    public OutputStream c() {
        return this.i;
    }

    @Override // defpackage.blq, defpackage.bln
    public void d() {
        f().write(new blx((byte) 8, true, "1000".getBytes()).c());
        f().flush();
        bma bmaVar = this.e;
        if (bmaVar != null) {
            bmaVar.a();
        }
        super.d();
    }

    @Override // defpackage.blp, defpackage.blq, defpackage.bln
    public String e() {
        return "wss://" + this.g + ":" + this.h;
    }
}
