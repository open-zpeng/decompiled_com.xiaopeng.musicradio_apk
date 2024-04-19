package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: FontScaleTextView.java */
/* renamed from: bec  reason: default package */
/* loaded from: classes2.dex */
public class bec extends XTextView {
    private bea a;

    public bec(Context context) {
        super(context);
        a();
    }

    public bec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public bec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        if (this.a == null) {
            this.a = new bea(this, getResources().getDisplayMetrics().scaledDensity);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XTextView, android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.a();
    }

    @Override // androidx.appcompat.widget.z, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.a.a(i, f);
    }
}
