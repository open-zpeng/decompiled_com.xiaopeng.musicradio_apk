package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: BaseAnimatableValue.java */
/* renamed from: pk  reason: default package */
/* loaded from: classes3.dex */
abstract class pk<V, O> implements pj<V, O> {
    final List<sd<V>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pk(V v) {
        this(Collections.singletonList(new sd(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pk(List<sd<V>> list) {
        this.a = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
