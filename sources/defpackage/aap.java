package defpackage;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
/* compiled from: RefreshProcessor.java */
/* renamed from: aap  reason: default package */
/* loaded from: classes2.dex */
public class aap implements aan {
    protected TwinklingRefreshLayout.a a;
    private float b;
    private float c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private MotionEvent h;

    @Override // defpackage.aan
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // defpackage.aan
    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.aan
    public boolean c(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.aan
    public void d(MotionEvent motionEvent) {
    }

    public aap(TwinklingRefreshLayout.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("The coprocessor can not be null.");
        }
        this.a = aVar;
    }

    @Override // defpackage.aan
    public boolean a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.g = false;
                this.d = false;
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                if (this.a.c()) {
                    if (!this.a.H()) {
                        this.a.e(false);
                    }
                    if (!this.a.I()) {
                        this.a.f(false);
                    }
                }
                this.a.a(motionEvent);
                return true;
            case 1:
            case 3:
                if (this.d) {
                    if (this.a.W()) {
                        this.e = true;
                    } else if (this.a.X()) {
                        this.f = true;
                    }
                    this.d = false;
                    return true;
                }
                break;
            case 2:
                this.h = motionEvent;
                float x = motionEvent.getX() - this.b;
                float y = motionEvent.getY() - this.c;
                if (!this.d && Math.abs(x) <= Math.abs(y) && Math.abs(y) > this.a.n()) {
                    if (y > 0.0f && aas.a(this.a.k(), this.a.n()) && this.a.A()) {
                        this.a.U();
                        this.b = motionEvent.getX();
                        this.c = motionEvent.getY();
                        a();
                        this.d = true;
                        return true;
                    } else if (y < 0.0f && aas.b(this.a.k(), this.a.n()) && this.a.B()) {
                        this.a.V();
                        this.b = motionEvent.getX();
                        this.c = motionEvent.getY();
                        this.d = true;
                        a();
                        return true;
                    }
                }
                if (this.d) {
                    if (this.a.F() || this.a.G()) {
                        return this.a.a(motionEvent);
                    }
                    if (!this.a.Y() && this.a.W()) {
                        if (y < (-this.a.n()) || !aas.a(this.a.k(), this.a.n())) {
                            this.a.a(motionEvent);
                        }
                        y = Math.max(0.0f, Math.min(this.a.f() * 2.0f, y));
                        this.a.b().a(y);
                    } else if (!this.a.Z() && this.a.X()) {
                        if (y > this.a.n() || !aas.b(this.a.k(), this.a.n())) {
                            this.a.a(motionEvent);
                        }
                        y = Math.min(0.0f, Math.max((-this.a.h()) * 2, y));
                        this.a.b().b(Math.abs(y));
                    }
                    if (y == 0.0f && !this.g) {
                        this.g = true;
                        b();
                    }
                    return true;
                }
                break;
        }
        return this.a.a(motionEvent);
    }

    private void a() {
        MotionEvent motionEvent = this.h;
        if (motionEvent == null) {
            return;
        }
        this.a.a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ViewConfiguration.getLongPressTimeout(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    private void b() {
        MotionEvent motionEvent = this.h;
        this.a.a(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    @Override // defpackage.aan
    public void a(MotionEvent motionEvent, boolean z) {
        if (!z && this.e) {
            this.a.b().a();
        }
        if (!z && this.f) {
            this.a.b().b();
        }
        this.e = false;
        this.f = false;
    }

    @Override // defpackage.aan
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        int n = this.a.n();
        if (this.a.F() && f2 >= n && !this.a.J()) {
            this.a.b().a((int) f4);
        }
        if (!this.a.G() || f2 > (-n)) {
            return;
        }
        this.a.b().b((int) f4);
    }
}
