package defpackage;

import android.view.View;
import android.view.WindowId;
/* compiled from: WindowIdApi18.java */
/* renamed from: kv  reason: default package */
/* loaded from: classes3.dex */
class kv implements kw {
    private final WindowId a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kv(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof kv) && ((kv) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
