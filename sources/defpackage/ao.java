package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* renamed from: ao  reason: default package */
/* loaded from: classes2.dex */
public class ao {
    hv b;
    private Interpolator d;
    private boolean e;
    private long c = -1;
    private final hw f = new hw() { // from class: ao.1
        private boolean b = false;
        private int c = 0;

        @Override // defpackage.hw, defpackage.hv
        public void a(View view) {
            if (this.b) {
                return;
            }
            this.b = true;
            if (ao.this.b != null) {
                ao.this.b.a(null);
            }
        }

        void a() {
            this.c = 0;
            this.b = false;
            ao.this.b();
        }

        @Override // defpackage.hw, defpackage.hv
        public void b(View view) {
            int i = this.c + 1;
            this.c = i;
            if (i == ao.this.a.size()) {
                if (ao.this.b != null) {
                    ao.this.b.b(null);
                }
                a();
            }
        }
    };
    final ArrayList<hu> a = new ArrayList<>();

    public ao a(hu huVar) {
        if (!this.e) {
            this.a.add(huVar);
        }
        return this;
    }

    public ao a(hu huVar, hu huVar2) {
        this.a.add(huVar);
        huVar2.b(huVar.a());
        this.a.add(huVar2);
        return this;
    }

    public void a() {
        if (this.e) {
            return;
        }
        Iterator<hu> it = this.a.iterator();
        while (it.hasNext()) {
            hu next = it.next();
            long j = this.c;
            if (j >= 0) {
                next.a(j);
            }
            Interpolator interpolator = this.d;
            if (interpolator != null) {
                next.a(interpolator);
            }
            if (this.b != null) {
                next.a(this.f);
            }
            next.c();
        }
        this.e = true;
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (this.e) {
            Iterator<hu> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public ao a(long j) {
        if (!this.e) {
            this.c = j;
        }
        return this;
    }

    public ao a(Interpolator interpolator) {
        if (!this.e) {
            this.d = interpolator;
        }
        return this;
    }

    public ao a(hv hvVar) {
        if (!this.e) {
            this.b = hvVar;
        }
        return this;
    }
}
