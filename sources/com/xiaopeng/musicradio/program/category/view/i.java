package com.xiaopeng.musicradio.program.category.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.xui.widget.XLoading;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: RdDetailXHeaderView.java */
/* loaded from: classes2.dex */
public class i extends LinearLayout implements com.lcodecore.tkrefreshlayout.b {
    private XLoading a;
    private XTextView b;

    @Override // com.lcodecore.tkrefreshlayout.b
    public View getView() {
        return this;
    }

    public i(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setOrientation(0);
        setGravity(17);
        this.a = new XLoading(context);
        this.a.setType(1);
        addView(this.a, new LinearLayout.LayoutParams(72, 72));
        this.b = new XTextView(context);
        this.b.setText("加载中");
        this.b.setVisibility(0);
        this.b.setTextColor(context.getColor(b.a.x_theme_text_02));
        this.b.setTextSize(1, getResources().getDimension(b.C0158b.x_font_body_02_size));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = 10;
        addView(this.b, layoutParams);
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a(float f, float f2, float f3) {
        if (this.a.getVisibility() != 0) {
            this.a.setVisibility(0);
        }
        hq.b((View) this.a, 1.0f);
        hq.c((View) this.a, 1.0f);
        this.b.setVisibility(0);
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void b(float f, float f2, float f3) {
        this.b.setVisibility(0);
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a(float f, float f2) {
        this.a.setVisibility(0);
        hq.b((View) this.a, 1.0f);
        hq.c((View) this.a, 1.0f);
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a(final com.lcodecore.tkrefreshlayout.c cVar) {
        this.a.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.xiaopeng.musicradio.program.category.view.i.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                i.this.a();
                cVar.a();
            }
        });
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.setTextColor(getContext().getColor(b.a.x_theme_text_02));
    }

    @Override // com.lcodecore.tkrefreshlayout.b
    public void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        hq.b((View) this.a, 0.0f);
        hq.c((View) this.a, 0.0f);
        hq.a((View) this.a, 1.0f);
    }
}
