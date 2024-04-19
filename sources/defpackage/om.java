package defpackage;

import java.util.Collections;
/* compiled from: ValueCallbackKeyframeAnimation.java */
/* renamed from: om  reason: default package */
/* loaded from: classes3.dex */
public class om<K, A> extends nx<K, A> {
    private final se<A> c;

    @Override // defpackage.nx
    float d() {
        return 1.0f;
    }

    public om(sf<A> sfVar) {
        super(Collections.emptyList());
        this.c = new se<>();
        a(sfVar);
    }

    @Override // defpackage.nx
    public void b() {
        if (this.b != null) {
            super.b();
        }
    }

    @Override // defpackage.nx
    public A e() {
        return this.b.a(0.0f, 0.0f, null, null, f(), f(), f());
    }

    @Override // defpackage.nx
    A a(sd<K> sdVar, float f) {
        return e();
    }
}
