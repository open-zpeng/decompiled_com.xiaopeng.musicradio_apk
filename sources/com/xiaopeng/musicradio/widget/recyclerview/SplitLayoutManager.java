package com.xiaopeng.musicradio.widget.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
/* loaded from: classes2.dex */
public class SplitLayoutManager extends RecyclerView.LayoutManager {
    private int a;
    private int b;
    private m c;
    private int d;
    private int e;
    private int f;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean e() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        if (K() == 0) {
            a(oVar);
        } else if (A() == 0 && sVar.a()) {
        } else {
            a(oVar);
            this.e = 0;
            this.f = 0;
            this.d = 0;
            f(oVar, sVar);
        }
    }

    private void f(RecyclerView.o oVar, RecyclerView.s sVar) {
        g(oVar, sVar);
        h(oVar, sVar);
    }

    private void g(RecyclerView.o oVar, RecyclerView.s sVar) {
        for (int i = this.e - 1; i >= 0; i--) {
            if (a(i)) {
                View c = oVar.c(i);
                b(c);
                this.e--;
                if (this.a == 1) {
                    p(c);
                    int f = f(c);
                    int g = g(c);
                    int F = F();
                    int b = ((b() * i) + ((b() - g) / 2)) - this.d;
                    a(c, F, b, F + f, b + g);
                } else {
                    p(c);
                    int f2 = f(c);
                    int g2 = g(c);
                    int b2 = ((b() * i) + ((b() - f2) / 2)) - this.d;
                    int G = G();
                    a(c, b2, G, b2 + f2, G + g2);
                }
            }
        }
    }

    private void h(RecyclerView.o oVar, RecyclerView.s sVar) {
        for (int i = this.f; i < K() && a(i); i++) {
            View c = oVar.c(i);
            b(c);
            this.f++;
            if (this.a == 1) {
                p(c);
                int f = f(c);
                int g = g(c);
                int F = F();
                int b = ((b() * i) + ((b() - g) / 2)) - this.d;
                a(c, F, b, F + f, b + g);
            } else {
                p(c);
                int f2 = f(c);
                int g2 = g(c);
                int b2 = ((b() * i) + ((b() - f2) / 2)) - this.d;
                int G = G();
                a(c, b2, G, b2 + f2, G + g2);
            }
        }
    }

    private boolean a(int i) {
        int b = i * b();
        return b >= this.d - b() && b < this.d + this.c.f();
    }

    private void p(View view) {
        int a;
        int a2;
        RecyclerView.i iVar = (RecyclerView.i) view.getLayoutParams();
        int l = l(view) + m(view) + iVar.topMargin + iVar.bottomMargin;
        int n = n(view) + o(view) + iVar.leftMargin + iVar.rightMargin;
        if (this.a == 1) {
            a = a(D(), B(), n, iVar.width, g());
            a2 = a(b(), 1073741824, l, iVar.height, h());
        } else {
            a = a(b(), 1073741824, n, iVar.width, g());
            a2 = a(E(), C(), l, iVar.height, h());
        }
        if (b(view, a, a2, iVar)) {
            view.measure(a, a2);
        }
    }

    boolean b(View view, int i, int i2, RecyclerView.i iVar) {
        return (!view.isLayoutRequested() && L() && b(view.getWidth(), i, iVar.width) && b(view.getHeight(), i2, iVar.height)) ? false : true;
    }

    private static boolean b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    int b() {
        m mVar = this.c;
        if (mVar == null) {
            return 0;
        }
        return mVar.f() / this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int b(int i, RecyclerView.o oVar, RecyclerView.s sVar) {
        int i2;
        if (this.a == 0) {
            return 0;
        }
        int f = (this.c.f() / this.b) * K();
        if (this.d + i > f - this.c.f()) {
            i2 = (f - this.c.f()) - this.d;
        } else {
            int i3 = this.d;
            i2 = i + i3 < 0 ? -i3 : i;
        }
        this.d += i2;
        a(oVar, i);
        l(-i2);
        f(oVar, sVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int a(int i, RecyclerView.o oVar, RecyclerView.s sVar) {
        int i2;
        if (this.a == 1) {
            return 0;
        }
        int f = (this.c.f() / this.b) * K();
        if (this.d + i > f - this.c.f()) {
            i2 = (f - this.c.f()) - this.d;
        } else {
            int i3 = this.d;
            i2 = i + i3 < 0 ? -i3 : i;
        }
        this.d += i2;
        a(oVar, i);
        k(-i2);
        f(oVar, sVar);
        return i2;
    }

    private void a(RecyclerView.o oVar, int i) {
        int A = A();
        if (A == 0 || i == 0) {
            return;
        }
        for (int i2 = A - 1; i2 >= 0; i2--) {
            View j = j(i2);
            if (!a(d(j))) {
                a(j, oVar);
                if (i > 0) {
                    this.e++;
                } else {
                    this.f--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean h() {
        return this.a == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean g() {
        return this.a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.i a() {
        if (this.a == 0) {
            return new RecyclerView.i(-2, -1);
        }
        return new RecyclerView.i(-1, -2);
    }
}
