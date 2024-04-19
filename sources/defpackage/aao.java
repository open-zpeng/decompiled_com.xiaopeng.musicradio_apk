package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
/* compiled from: OverScrollDecorator.java */
/* renamed from: aao  reason: default package */
/* loaded from: classes2.dex */
public class aao extends aam {
    private float c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Handler h;

    static /* synthetic */ int a(aao aaoVar) {
        int i = aaoVar.d;
        aaoVar.d = i + 1;
        return i;
    }

    public aao(TwinklingRefreshLayout.a aVar, aan aanVar) {
        super(aVar, aanVar);
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = new Handler() { // from class: aao.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int n = aao.this.b.n();
                switch (message.what) {
                    case 0:
                        aao.this.d = -1;
                        break;
                    case 1:
                        break;
                    case 2:
                        aao.this.d = 60;
                        return;
                    default:
                        return;
                }
                aao.a(aao.this);
                View k = aao.this.b.k();
                if (aao.this.b.E()) {
                    if (aao.this.c < 3000.0f) {
                        if (aao.this.c <= -3000.0f && aas.b(k, n)) {
                            aao.this.b.b().b(aao.this.c, aao.this.d);
                            aao.this.c = 0.0f;
                            aao.this.d = 60;
                        }
                    } else if (aas.a(k, n)) {
                        aao.this.b.b().a(aao.this.c, aao.this.d);
                        aao.this.c = 0.0f;
                        aao.this.d = 60;
                    }
                }
                if (aao.this.d < 60) {
                    aao.this.h.sendEmptyMessageDelayed(1, 10L);
                }
            }
        };
    }

    @Override // defpackage.aan
    public boolean a(MotionEvent motionEvent) {
        return this.a != null && this.a.a(motionEvent);
    }

    @Override // defpackage.aan
    public boolean b(MotionEvent motionEvent) {
        return this.a != null && this.a.b(motionEvent);
    }

    @Override // defpackage.aan
    public boolean c(MotionEvent motionEvent) {
        return this.a != null && this.a.c(motionEvent);
    }

    @Override // defpackage.aan
    public void d(MotionEvent motionEvent) {
        if (this.a != null) {
            this.a.d(motionEvent);
        }
        this.e = aas.a(this.b.k(), this.b.n());
        this.f = aas.b(this.b.k(), this.b.n());
    }

    @Override // defpackage.aan
    public void a(MotionEvent motionEvent, boolean z) {
        if (this.a != null) {
            this.a.a(motionEvent, this.g && z);
        }
        this.g = false;
    }

    @Override // defpackage.aan
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        if (this.a != null) {
            this.a.a(motionEvent, motionEvent2, f, f2, f3, f4);
        }
    }

    @Override // defpackage.aan
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a != null) {
            this.a.a(motionEvent, motionEvent2, f, f2);
        }
        if (this.b.z()) {
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            if (y >= (-this.b.n()) || !this.f) {
                if (y <= this.b.n() || !this.e) {
                    this.c = f2;
                    if (Math.abs(this.c) >= 3000.0f) {
                        this.h.sendEmptyMessage(0);
                        this.g = true;
                        return;
                    }
                    this.c = 0.0f;
                    this.d = 60;
                }
            }
        }
    }
}
