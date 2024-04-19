package defpackage;

import android.graphics.Typeface;
/* compiled from: CancelableFontCallback.java */
/* renamed from: wy  reason: default package */
/* loaded from: classes3.dex */
public final class wy extends xd {
    private final Typeface a;
    private final a b;
    private boolean c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: wy$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public wy(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // defpackage.xd
    public void a(Typeface typeface, boolean z) {
        a(typeface);
    }

    @Override // defpackage.xd
    public void a(int i) {
        a(this.a);
    }

    public void a() {
        this.c = true;
    }

    private void a(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
