package defpackage;

import android.os.IBinder;
/* compiled from: WindowIdApi14.java */
/* renamed from: ku  reason: default package */
/* loaded from: classes3.dex */
class ku implements kw {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ku(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ku) && ((ku) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
