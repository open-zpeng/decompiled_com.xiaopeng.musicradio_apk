package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: JsonArray.java */
/* renamed from: mt  reason: default package */
/* loaded from: classes3.dex */
public final class mt extends ne implements Iterable<ne> {
    private final List<ne> a = new ArrayList();

    @Override // defpackage.ne
    public Number a() {
        if (this.a.size() == 1) {
            return this.a.get(0).a();
        }
        throw new IllegalStateException();
    }

    public void a(ne neVar) {
        if (neVar == null) {
            neVar = mv.a;
        }
        this.a.add(neVar);
    }

    @Override // defpackage.ne
    public String b() {
        if (this.a.size() == 1) {
            return this.a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ne
    public double c() {
        if (this.a.size() == 1) {
            return this.a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ne
    public long d() {
        if (this.a.size() == 1) {
            return this.a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ne
    public int e() {
        if (this.a.size() == 1) {
            return this.a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof mt) && ((mt) obj).a.equals(this.a));
    }

    @Override // defpackage.ne
    public boolean f() {
        if (this.a.size() == 1) {
            return this.a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<ne> iterator() {
        return this.a.iterator();
    }
}
