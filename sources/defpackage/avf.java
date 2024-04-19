package defpackage;

import android.os.Bundle;
import defpackage.ave;
/* compiled from: CachePolicy.java */
/* renamed from: avf  reason: default package */
/* loaded from: classes2.dex */
public class avf implements ave.a {
    Bundle a;

    public avf(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.ave.a
    public Bundle a() {
        return this.a;
    }

    @Override // defpackage.ave.a
    public void b() {
        avg.a(a());
    }
}
