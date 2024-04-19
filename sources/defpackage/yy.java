package defpackage;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: ImmutableSet.java */
/* renamed from: yy  reason: default package */
/* loaded from: classes3.dex */
public abstract class yy<E> extends yu<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    @RetainedWith
    @NullableDecl
    @LazyInit
    private transient yv<E> asList;

    @Override // defpackage.yu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract zo<E> iterator();

    boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        int max = Math.max(i, 2);
        if (max < CUTOFF) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * DESIRED_LOAD_FACTOR < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        yj.a(max < 1073741824, "collection too large");
        return 1073741824;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yy) && g() && ((yy) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zm.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zm.a(this);
    }

    @Override // defpackage.yu
    public yv<E> e() {
        yv<E> yvVar = this.asList;
        if (yvVar == null) {
            yv<E> h = h();
            this.asList = h;
            return h;
        }
        return yvVar;
    }

    yv<E> h() {
        return yv.b(toArray());
    }
}
