package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewGroupOverlayApi14.java */
/* renamed from: ke  reason: default package */
/* loaded from: classes3.dex */
public class ke extends kj implements kg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ke(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ke a(ViewGroup viewGroup) {
        return (ke) kj.d(viewGroup);
    }

    @Override // defpackage.kg
    public void a(View view) {
        this.a.a(view);
    }

    @Override // defpackage.kg
    public void b(View view) {
        this.a.b(view);
    }
}
