package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* compiled from: ViewGroupOverlayApi18.java */
/* renamed from: kf  reason: default package */
/* loaded from: classes3.dex */
class kf implements kg {
    private final ViewGroupOverlay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kf(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // defpackage.kl
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // defpackage.kl
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // defpackage.kg
    public void a(View view) {
        this.a.add(view);
    }

    @Override // defpackage.kg
    public void b(View view) {
        this.a.remove(view);
    }
}
