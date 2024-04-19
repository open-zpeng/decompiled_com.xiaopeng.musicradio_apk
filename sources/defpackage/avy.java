package defpackage;

import android.util.SparseArray;
/* compiled from: SmallPlayerUIHelper.java */
/* renamed from: avy  reason: default package */
/* loaded from: classes2.dex */
public class avy {
    private SparseArray<awa> a = new SparseArray<>();

    /* compiled from: SmallPlayerUIHelper.java */
    /* renamed from: avy$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final avy a = new avy();
    }

    public static avy a() {
        return a.a;
    }

    public void a(int i, awa awaVar) {
        this.a.put(i, awaVar);
    }

    public awa a(int i) {
        return this.a.get(i);
    }
}
