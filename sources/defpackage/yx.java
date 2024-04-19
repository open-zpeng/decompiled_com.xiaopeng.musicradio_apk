package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: ImmutableMultimap.java */
/* renamed from: yx  reason: default package */
/* loaded from: classes3.dex */
public abstract class yx<K, V> extends yo<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient yw<K, ? extends yu<V>> a;

    @Override // defpackage.yn
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.yn
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.yn
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // defpackage.yn, defpackage.zd
    /* renamed from: c */
    public yw<K, Collection<V>> a() {
        return (yw<K, ? extends yu<V>>) this.a;
    }

    @Override // defpackage.yn
    Map<K, Collection<V>> b() {
        throw new AssertionError("should never be called");
    }
}
