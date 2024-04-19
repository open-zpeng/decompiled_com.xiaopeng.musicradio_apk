package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import androidx.appcompat.widget.k;
/* compiled from: FontScaleEditText.java */
/* renamed from: bdz  reason: default package */
/* loaded from: classes2.dex */
public class bdz extends k {
    private bea a;

    public bdz(Context context, AttributeSet attributeSet) {
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
