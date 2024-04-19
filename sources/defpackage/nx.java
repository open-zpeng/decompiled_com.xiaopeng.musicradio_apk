package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseKeyframeAnimation.java */
/* renamed from: nx  reason: default package */
/* loaded from: classes3.dex */
public abstract class nx<K, A> {
    protected sf<A> b;
    private final List<? extends sd<K>> d;
    private sd<K> f;
    final List<a> a = new ArrayList();
    private boolean c = false;
    private float e = 0.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: nx$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    abstract A a(sd<K> sdVar, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public nx(List<? extends sd<K>> list) {
        this.d = list;
    }

    public void a() {
        this.c = true;
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void a(float f) {
        if (f < i()) {
            f = i();
        } else if (f > d()) {
            f = d();
        }
        if (f == this.e) {
            return;
        }
        this.e = f;
        b();
    }

    public void b() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    private sd<K> g() {
        List<? extends sd<K>> list;
        sd<K> sdVar = this.f;
        if (sdVar != null && sdVar.a(this.e)) {
            return this.f;
        }
        sd<K> sdVar2 = this.d.get(list.size() - 1);
        if (this.e < sdVar2.b()) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                sdVar2 = this.d.get(size);
                if (sdVar2.a(this.e)) {
                    break;
                }
            }
        }
        this.f = sdVar2;
        return sdVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        if (this.c) {
            return 0.0f;
        }
        sd<K> g = g();
        if (g.d()) {
            return 0.0f;
        }
        return (this.e - g.b()) / (g.c() - g.b());
    }

    private float h() {
        sd<K> g = g();
        if (g.d()) {
            return 0.0f;
        }
        return g.c.getInterpolation(c());
    }

    private float i() {
        if (this.d.isEmpty()) {
            return 0.0f;
        }
        return this.d.get(0).b();
    }

    float d() {
        if (this.d.isEmpty()) {
            return 1.0f;
        }
        List<? extends sd<K>> list = this.d;
        return list.get(list.size() - 1).c();
    }

    public A e() {
        return a(g(), h());
    }

    public float f() {
        return this.e;
    }

    public void a(sf<A> sfVar) {
        sf<A> sfVar2 = this.b;
        if (sfVar2 != null) {
            sfVar2.a((nx<?, ?>) null);
        }
        this.b = sfVar;
        if (sfVar != null) {
            sfVar.a((nx<?, ?>) this);
        }
    }
}
