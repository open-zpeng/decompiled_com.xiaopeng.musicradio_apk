package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: NapaService.java */
/* renamed from: aex  reason: default package */
/* loaded from: classes2.dex */
public class aex {
    private Handler c;
    private boolean d;
    private long f;
    private HashMap<String, aev> a = new HashMap<>();
    private aey b = new aey();
    private ConcurrentLinkedQueue<b> e = new ConcurrentLinkedQueue<>();

    /* compiled from: NapaService.java */
    /* renamed from: aex$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aex a = new aex();
    }

    public static aex a() {
        return a.a;
    }

    public aex() {
        HandlerThread handlerThread = new HandlerThread("NapaService");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public void a(final String str, final byte[] bArr) {
        final long c = c();
        ban.a(new Runnable() { // from class: aex.1
            @Override // java.lang.Runnable
            public void run() {
                aex.this.a(str, bArr, c);
            }
        });
    }

    public void b(final String str, final byte[] bArr) {
        final long c = c();
        this.c.post(new Runnable() { // from class: aex.4
            @Override // java.lang.Runnable
            public void run() {
                aex.this.a(str, bArr, c);
            }
        });
    }

    private long c() {
        this.f++;
        if (this.f >= 9223372036854775707L) {
            this.f = 0L;
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, byte[] bArr, long j) {
        try {
            Uri.Builder builder = new Uri.Builder();
            builder.authority("com.xiaopeng.napa.NapaObserver").path("sendMessageToUnity").appendQueryParameter(Constants.MSG_ID, str).appendQueryParameter("seqId", String.valueOf(j));
            Uri build = builder.build();
            if (bArr == null) {
                bArr = "".getBytes();
            }
            abt.a(build, bArr);
        } catch (RemoteException e) {
            Log.e("NapaService", "sendMessageToUnity: " + e.getMessage() + " msgId = " + str);
        }
    }

    public void a(aew aewVar) {
        this.b.a(aewVar);
    }

    public aev a(String str, boolean z, boolean z2) {
        final aev aevVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.a) {
            aevVar = this.a.get(str);
            if (z && aevVar == null && (aevVar = this.b.a(str)) != null) {
                if (z2) {
                    ban.g(new Runnable() { // from class: aex.5
                        @Override // java.lang.Runnable
                        public void run() {
                            aevVar.d();
                            aevVar.e();
                            aevVar.f();
                        }
                    });
                }
                this.a.put(str, aevVar);
            }
        }
        return aevVar;
    }

    public void a(String str, final String str2, final byte[] bArr) {
        final aev a2 = a(str, true, true);
        StringBuilder sb = new StringBuilder();
        sb.append("sendMessage:");
        sb.append(str);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(str2);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(bArr);
        sb.append(ListSignBean.COLLECTID_SUFFIX);
        sb.append(a2 != null);
        Log.i("NapaService", sb.toString());
        if (a2 != null) {
            ban.g(new Runnable() { // from class: aex.2
                @Override // java.lang.Runnable
                public void run() {
                    a2.a(str2, bArr);
                }
            });
        } else if (this.d) {
        } else {
            this.e.offer(new b(str, str2, bArr));
        }
    }

    public void b() {
        this.d = true;
        ban.d(new Runnable() { // from class: aex.3
            @Override // java.lang.Runnable
            public void run() {
                b bVar = (b) aex.this.e.poll();
                while (bVar != null) {
                    aex.this.a(bVar.a, bVar.b, bVar.c);
                    bVar = (b) aex.this.e.poll();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NapaService.java */
    /* renamed from: aex$b */
    /* loaded from: classes2.dex */
    public static class b {
        String a;
        String b;
        byte[] c;

        public b(String str, String str2, byte[] bArr) {
            this.a = str;
            this.b = str2;
            this.c = bArr;
        }
    }
}
