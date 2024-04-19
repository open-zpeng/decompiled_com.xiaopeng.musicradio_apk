package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: hz  reason: default package */
/* loaded from: classes3.dex */
public final class hz extends ClickableSpan {
    private final int a;
    private final ib b;
    private final int c;

    public hz(int i, ib ibVar, int i2) {
        this.a = i;
        this.b = ibVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a(this.c, bundle);
    }
}
