package defpackage;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
/* compiled from: ImmutableSetMultimap.java */
/* renamed from: yz  reason: default package */
/* loaded from: classes3.dex */
public class yz<K, V> extends yx<K, V> implements zl<K, V> {
    private static final long serialVersionUID = 0;
    private final transient yy<V> emptySet;
    @MonotonicNonNullDecl
    private transient yy<Map.Entry<K, V>> entries;
    @RetainedWith
    @LazyInit
    @MonotonicNonNullDecl
    private transient yz<V, K> inverse;
}
