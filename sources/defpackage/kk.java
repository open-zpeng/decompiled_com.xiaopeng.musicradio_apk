package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* compiled from: ViewOverlayApi18.java */
/* renamed from: kk  reason: default package */
/* loaded from: classes3.dex */
class kk implements kl {
    private final ViewOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kk(View view) {
        this.a = view.getOverlay();
    }

    @Override // defpackage.kl
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.kl
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
