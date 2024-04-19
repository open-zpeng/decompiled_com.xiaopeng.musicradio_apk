package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import com.xiaopeng.musicradio.bean.ListSignBean;
/* compiled from: Caton.java */
/* renamed from: ack  reason: default package */
/* loaded from: classes2.dex */
public class ack {
    static c a = c.LOOPER;
    private static volatile ack b;

    /* compiled from: Caton.java */
    /* renamed from: ack$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(String[] strArr, boolean z, long... jArr);
    }

    private ack(Context context, long j, long j2, c cVar, boolean z, b bVar) {
        long min = Math.min(Math.max(j, 200L), 400L);
        long min2 = Math.min(Math.max(j2, 200L), 400L);
        acm.b = z;
        acm.a = min;
        acj acjVar = new acj(context, new ach(min2), bVar);
        if (cVar == c.LOOPER) {
            new aco(acjVar);
        } else if (cVar == c.FRAME) {
            if (Build.VERSION.SDK_INT >= 16) {
                Choreographer.getInstance().postFrameCallback(new acn(context, acjVar));
                return;
            }
            new aco(acjVar);
        }
    }

    public static void a(a aVar) {
        if (b == null) {
            synchronized (ack.class) {
                if (b == null) {
                    b = aVar.a();
                }
            }
        }
    }

    /* compiled from: Caton.java */
    /* renamed from: ack$a */
    /* loaded from: classes2.dex */
    public static class a {
        private Context c;
        private b f;
        private long a = ListSignBean.USB_MUSIC_ID;
        private long b = 1000;
        private c d = ack.a;
        private boolean e = true;

        public a(Context context) {
            this.c = context;
        }

        public a a(long j) {
            this.a = j;
            return this;
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a a(c cVar) {
            this.d = cVar;
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public a a(b bVar) {
            this.f = bVar;
            return this;
        }

        ack a() {
            return new ack(this.c, this.a, this.b, this.d, this.e, this.f);
        }
    }

    /* compiled from: Caton.java */
    /* renamed from: ack$c */
    /* loaded from: classes2.dex */
    public enum c {
        LOOPER(0),
        FRAME(1);
        
        int a;

        c(int i) {
            this.a = i;
        }
    }
}
