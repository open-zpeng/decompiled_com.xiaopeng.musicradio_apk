package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import java.util.Random;
/* compiled from: UploadEngine.java */
/* renamed from: vs  reason: default package */
/* loaded from: classes3.dex */
public class vs {
    static vs a = new vs();
    protected long b = ud.d();
    private boolean c = false;
    private int d;

    public static vs a() {
        return a;
    }

    public synchronized void b() {
        this.c = true;
        if (vg.a().b(2)) {
            vg.a().a(2);
        }
        e();
        Random random = new Random();
        if (!vt.c()) {
            vg.a().a(2, new vt() { // from class: vs.1
                @Override // defpackage.vt
                public void a() {
                    if (vs.this.c) {
                        uj.k();
                        vs.this.e();
                        uw.a("UploadTask", "mPeriod:", Long.valueOf(vs.this.b));
                        if (vg.a().b(2)) {
                            vg.a().a(2);
                        }
                        if (vt.c()) {
                            return;
                        }
                        vg.a().a(2, this, vs.this.b);
                    }
                }

                @Override // defpackage.vt
                public void b() {
                    vs.this.c();
                }
            }, random.nextInt((int) this.b));
        }
    }

    public void c() {
        if (this.d == 0) {
            this.d = 7000;
        } else {
            this.d = 0;
        }
    }

    public synchronized void d() {
        this.c = false;
        vg.a().a(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e() {
        long d;
        uw.a("UploadEngine", "UTDC.bBackground:", Boolean.valueOf(uc.a), "AppInfoUtil.isForeground(UTDC.getContext()) ", Boolean.valueOf(up.a(uc.c())));
        uc.a = !up.a(uc.c());
        boolean z = uc.a;
        ud.d();
        if (z) {
            d = ud.e() + this.d;
        } else {
            d = ud.d() + this.d;
        }
        this.b = d;
        if (ud.b()) {
            this.b = ListSignBean.USB_MUSIC_ID;
        }
        return this.b;
    }
}
