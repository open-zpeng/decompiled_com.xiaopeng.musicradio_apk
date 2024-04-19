package defpackage;

import android.util.SparseArray;
/* compiled from: PlayerUIHelper.java */
/* renamed from: avu  reason: default package */
/* loaded from: classes2.dex */
public class avu {
    private SparseArray<String> a = new SparseArray<>();

    /* compiled from: PlayerUIHelper.java */
    /* renamed from: avu$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final avu a = new avu();
    }

    public static avu a() {
        return a.a;
    }

    public void a(int i, String str) {
        this.a.put(i, str);
    }

    public String a(int i) {
        return this.a.get(i);
    }
}
