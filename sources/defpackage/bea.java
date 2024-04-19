package defpackage;

import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: FontScaleHelper.java */
/* renamed from: bea  reason: default package */
/* loaded from: classes2.dex */
class bea {
    private int a = Integer.MIN_VALUE;
    private float b = Float.MIN_VALUE;
    private float c;
    private final WeakReference<TextView> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bea(TextView textView, float f) {
        this.d = new WeakReference<>(textView);
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        TextView textView = this.d.get();
        if (textView == null) {
            return;
        }
        float f = textView.getResources().getDisplayMetrics().scaledDensity;
        if (f == this.c) {
            return;
        }
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            float f2 = this.b;
            if (f2 != Float.MIN_VALUE) {
                textView.setTextSize(i, f2);
                this.c = f;
            }
        }
        textView.setTextSize(2, textView.getTextSize() / this.c);
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f) {
        this.a = i;
        this.b = f;
    }
}
