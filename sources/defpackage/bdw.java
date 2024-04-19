package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.Button;
/* compiled from: FontScaleButton.java */
/* renamed from: bdw  reason: default package */
/* loaded from: classes2.dex */
public class bdw extends Button {
    private bea a;

    public bdw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        if (this.a == null) {
            this.a = new bea(this, getResources().getDisplayMetrics().scaledDensity);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.a();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.a.a(i, f);
    }
}
