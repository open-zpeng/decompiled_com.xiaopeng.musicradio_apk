package defpackage;

import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.HttpHeaders;
import com.xiaopeng.lib.framework.aiassistantmodule.sensor.ContextSensor;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: MqttAsyncClient.java */
/* renamed from: bkm  reason: default package */
/* loaded from: classes3.dex */
public class bkm implements bki {
    private static final String a = "bkm";
    private static final bna c = bnb.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a);
    private static int l = 1000;
    private static Object n = new Object();
    protected bla b;
    private String d;
    private String e;
    private Hashtable f;
    private bkp g;
    private bkn h;
    private bkq i;
    private Object j;
    private Timer k;
    private boolean m = false;
    private ScheduledExecutorService o;

    protected static boolean a(char c2) {
        return c2 >= 55296 && c2 <= 56319;
    }

    public bkm(String str, String str2, bkp bkpVar, bkw bkwVar, ScheduledExecutorService scheduledExecutorService) {
        c.setResourceName(str2);
        if (str2 == null) {
            throw new IllegalArgumentException("Null clientId");
        }
        int i = 0;
        int i2 = 0;
        while (i < str2.length() - 1) {
            if (a(str2.charAt(i))) {
                i++;
            }
            i2++;
            i++;
        }
        if (i2 > 65535) {
            throw new IllegalArgumentException("ClientId longer than 65535 characters");
        }
        bkq.b(str);
        this.e = str;
        this.d = str2;
        this.g = bkpVar;
        if (this.g == null) {
            this.g = new bnc();
        }
        this.o = scheduledExecutorService;
        if (this.o == null) {
            this.o = Executors.newScheduledThreadPool(10);
        }
        c.fine(a, "MqttAsyncClient", "101", new Object[]{str2, str, bkpVar});
        this.g.open(str2, str);
        this.b = new bla(this, this.g, bkwVar, this.o);
        this.g.close();
        this.f = new Hashtable();
    }

    protected bln[] a(String str, bkq bkqVar) {
        c.fine(a, "createNetworkModules", "116", new Object[]{str});
        String[] m = bkqVar.m();
        if (m == null) {
            m = new String[]{str};
        } else if (m.length == 0) {
            m = new String[]{str};
        }
        bln[] blnVarArr = new bln[m.length];
        for (int i = 0; i < m.length; i++) {
            blnVarArr[i] = b(m[i], bkqVar);
        }
        c.fine(a, "createNetworkModules", "108");
        return blnVarArr;
    }

    private bln b(String str, bkq bkqVar) {
        bls blsVar;
        String[] n2;
        SocketFactory socketFactory;
        bls blsVar2;
        String[] n3;
        c.fine(a, "createNetworkModule", "115", new Object[]{str});
        SocketFactory g = bkqVar.g();
        int b2 = bkq.b(str);
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null && str.contains("_")) {
                try {
                    Field declaredField = URI.class.getDeclaredField(SerializableCookie.HOST);
                    declaredField.setAccessible(true);
                    declaredField.set(uri, a(str.substring(uri.getScheme().length() + 3)));
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
                    throw bli.a(e.getCause());
                }
            }
            String host = uri.getHost();
            int port = uri.getPort();
            switch (b2) {
                case 0:
                    if (port == -1) {
                        port = 1883;
                    }
                    if (g == null) {
                        g = SocketFactory.getDefault();
                    } else if (g instanceof SSLSocketFactory) {
                        throw bli.a(32105);
                    }
                    blq blqVar = new blq(g, host, port, this.d);
                    blqVar.b(bkqVar.f());
                    return blqVar;
                case 1:
                    if (port == -1) {
                        port = 8883;
                    }
                    if (g == null) {
                        blsVar = new bls();
                        Properties j = bkqVar.j();
                        if (j != null) {
                            blsVar.a(j, (String) null);
                        }
                        g = blsVar.o(null);
                    } else if (!(g instanceof SSLSocketFactory)) {
                        throw bli.a(32105);
                    } else {
                        blsVar = null;
                    }
                    blp blpVar = new blp((SSLSocketFactory) g, host, port, this.d);
                    blp blpVar2 = blpVar;
                    blpVar2.a(bkqVar.f());
                    blpVar2.a(bkqVar.k());
                    if (blsVar != null && (n2 = blsVar.n(null)) != null) {
                        blpVar2.a(n2);
                    }
                    return blpVar;
                case 2:
                default:
                    c.fine(a, "createNetworkModule", "119", new Object[]{str});
                    return null;
                case 3:
                    int i = port == -1 ? 80 : port;
                    if (g == null) {
                        socketFactory = SocketFactory.getDefault();
                    } else if (g instanceof SSLSocketFactory) {
                        throw bli.a(32105);
                    } else {
                        socketFactory = g;
                    }
                    blz blzVar = new blz(socketFactory, str, host, i, this.d);
                    blzVar.b(bkqVar.f());
                    return blzVar;
                case 4:
                    int i2 = port == -1 ? 443 : port;
                    if (g == null) {
                        bls blsVar3 = new bls();
                        Properties j2 = bkqVar.j();
                        if (j2 != null) {
                            blsVar3.a(j2, (String) null);
                        }
                        blsVar2 = blsVar3;
                        g = blsVar3.o(null);
                    } else if (!(g instanceof SSLSocketFactory)) {
                        throw bli.a(32105);
                    } else {
                        blsVar2 = null;
                    }
                    bmb bmbVar = new bmb((SSLSocketFactory) g, str, host, i2, this.d);
                    bmbVar.a(bkqVar.f());
                    if (blsVar2 != null && (n3 = blsVar2.n(null)) != null) {
                        bmbVar.a(n3);
                    }
                    return bmbVar;
            }
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("Malformed URI: " + str + ", " + e2.getMessage());
        }
    }

    private String a(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            indexOf = str.indexOf(47);
        }
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    public bkl a(bkq bkqVar, Object obj, bkh bkhVar) {
        if (this.b.a()) {
            throw bli.a(32100);
        }
        if (this.b.b()) {
            throw new bks(32110);
        }
        if (this.b.d()) {
            throw new bks(32102);
        }
        if (this.b.e()) {
            throw new bks(32111);
        }
        bkq bkqVar2 = bkqVar == null ? new bkq() : bkqVar;
        this.i = bkqVar2;
        this.j = obj;
        boolean n2 = bkqVar2.n();
        bna bnaVar = c;
        String str = a;
        Object[] objArr = new Object[8];
        objArr[0] = Boolean.valueOf(bkqVar2.l());
        objArr[1] = new Integer(bkqVar2.f());
        objArr[2] = new Integer(bkqVar2.c());
        objArr[3] = bkqVar2.b();
        objArr[4] = bkqVar2.a() == null ? "[null]" : "[notnull]";
        objArr[5] = bkqVar2.i() == null ? "[null]" : "[notnull]";
        objArr[6] = obj;
        objArr[7] = bkhVar;
        bnaVar.fine(str, "connect", "103", objArr);
        this.b.a(a(this.e, bkqVar2));
        this.b.a((bko) new b(n2));
        bky bkyVar = new bky(b());
        blg blgVar = new blg(this, this.g, this.b, bkqVar2, bkyVar, obj, bkhVar, this.m);
        bkyVar.a((bkh) blgVar);
        bkyVar.a(this);
        bkn bknVar = this.h;
        if (bknVar instanceof bko) {
            blgVar.a((bko) bknVar);
        }
        this.b.a(0);
        blgVar.a();
        return bkyVar;
    }

    public bkl a(Object obj, bkh bkhVar) {
        return a(30000L, obj, bkhVar);
    }

    public bkl a(long j, Object obj, bkh bkhVar) {
        c.fine(a, "disconnect", "104", new Object[]{new Long(j), obj, bkhVar});
        bky bkyVar = new bky(b());
        bkyVar.a(bkhVar);
        bkyVar.a(obj);
        try {
            this.b.a(new bmg(), j, bkyVar);
            c.fine(a, "disconnect", "108");
            return bkyVar;
        } catch (bks e) {
            c.fine(a, "disconnect", "105", null, e);
            throw e;
        }
    }

    public void a(long j, long j2, boolean z) {
        this.b.a(j, j2, z);
    }

    public boolean a() {
        return this.b.a();
    }

    @Override // defpackage.bki
    public String b() {
        return this.d;
    }

    @Override // defpackage.bki
    public String c() {
        return this.e;
    }

    public bkl a(String str, int i, Object obj, bkh bkhVar) {
        return a(new String[]{str}, new int[]{i}, obj, bkhVar);
    }

    public bkl a(String[] strArr, int[] iArr, Object obj, bkh bkhVar) {
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException();
        }
        for (String str : strArr) {
            this.b.a(str);
        }
        if (c.isLoggable(5)) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < strArr.length; i++) {
                if (i > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append("topic=");
                stringBuffer.append(strArr[i]);
                stringBuffer.append(" qos=");
                stringBuffer.append(iArr[i]);
                bkz.a(strArr[i], true);
            }
            c.fine(a, ContextSensor.CMD_SUBSCRIBE, "106", new Object[]{stringBuffer.toString(), obj, bkhVar});
        }
        bky bkyVar = new bky(b());
        bkyVar.a(bkhVar);
        bkyVar.a(obj);
        bkyVar.a.a(strArr);
        this.b.b(new bmt(strArr, iArr), bkyVar);
        c.fine(a, ContextSensor.CMD_SUBSCRIBE, "109");
        return bkyVar;
    }

    public void a(bkn bknVar) {
        this.h = bknVar;
        this.b.a(bknVar);
    }

    public bkj a(String str, bkt bktVar, Object obj, bkh bkhVar) {
        c.fine(a, "publish", "111", new Object[]{str, obj, bkhVar});
        bkz.a(str, false);
        bkr bkrVar = new bkr(b());
        bkrVar.a(bkhVar);
        bkrVar.a(obj);
        bkrVar.a(bktVar);
        bkrVar.a.a(new String[]{str});
        this.b.b(new bmq(str, bktVar), bkrVar);
        c.fine(a, "publish", "112");
        return bkrVar;
    }

    public void d() {
        c.fine(a, "reconnect", "500", new Object[]{this.d});
        if (this.b.a()) {
            throw bli.a(32100);
        }
        if (this.b.b()) {
            throw new bks(32110);
        }
        if (this.b.d()) {
            throw new bks(32102);
        }
        if (this.b.e()) {
            throw new bks(32111);
        }
        k();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        c.fine(a, "attemptReconnect", "500", new Object[]{this.d});
        try {
            a(this.i, this.j, new a("attemptReconnect"));
        } catch (bkx e) {
            c.fine(a, "attemptReconnect", "804", null, e);
        } catch (bks e2) {
            c.fine(a, "attemptReconnect", "804", null, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        c.fine(a, "startReconnectCycle", "503", new Object[]{this.d, new Long(l)});
        this.k = new Timer("MQTT Reconnect: " + this.d);
        this.k.schedule(new c(this, null), (long) l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        c.fine(a, "stopReconnectCycle", "504", new Object[]{this.d});
        synchronized (n) {
            if (this.i.n()) {
                if (this.k != null) {
                    this.k.cancel();
                    this.k = null;
                }
                l = 1000;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MqttAsyncClient.java */
    /* renamed from: bkm$c */
    /* loaded from: classes3.dex */
    public class c extends TimerTask {
        private c() {
        }

        /* synthetic */ c(bkm bkmVar, c cVar) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            bkm.c.fine(bkm.a, "ReconnectTask.run", "506");
            bkm.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MqttAsyncClient.java */
    /* renamed from: bkm$b */
    /* loaded from: classes3.dex */
    public class b implements bko {
        final boolean a;

        @Override // defpackage.bko
        public void connectComplete(boolean z, String str) {
        }

        @Override // defpackage.bkn
        public void deliveryComplete(bkj bkjVar) {
        }

        @Override // defpackage.bkn
        public void messageArrived(String str, bkt bktVar) {
        }

        b(boolean z) {
            this.a = z;
        }

        @Override // defpackage.bkn
        public void connectionLost(Throwable th) {
            if (this.a) {
                bkm.this.b.b(true);
                bkm.this.m = true;
                bkm.this.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MqttAsyncClient.java */
    /* renamed from: bkm$a */
    /* loaded from: classes3.dex */
    public class a implements bkh {
        final String a;

        a(String str) {
            this.a = str;
        }

        @Override // defpackage.bkh
        public void onSuccess(bkl bklVar) {
            bkm.c.fine(bkm.a, this.a, "501", new Object[]{bklVar.c().b()});
            bkm.this.b.b(false);
            bkm.this.k();
        }

        @Override // defpackage.bkh
        public void onFailure(bkl bklVar, Throwable th) {
            bkm.c.fine(bkm.a, this.a, "502", new Object[]{bklVar.c().b()});
            if (bkm.l < 128000) {
                bkm.l *= 2;
            }
            a(bkm.l);
        }

        private void a(int i) {
            bkm.c.fine(bkm.a, String.valueOf(this.a) + ":rescheduleReconnectCycle", "505", new Object[]{bkm.this.d, String.valueOf(bkm.l)});
            synchronized (bkm.n) {
                if (bkm.this.i.n()) {
                    if (bkm.this.k != null) {
                        bkm.this.k.schedule(new c(bkm.this, null), i);
                    } else {
                        bkm.l = i;
                        bkm.this.j();
                    }
                }
            }
        }
    }

    public void a(bkg bkgVar) {
        this.b.a(new blh(bkgVar));
    }

    public void a(boolean z) {
        c.fine(a, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE, "113");
        this.b.a(z);
        c.fine(a, HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE, "114");
    }
}
