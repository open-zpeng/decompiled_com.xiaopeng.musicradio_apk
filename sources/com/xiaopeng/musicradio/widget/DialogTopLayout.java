package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.t;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes2.dex */
public class DialogTopLayout extends FrameLayout implements bal, ThemeWatcher.OnThemeSwitchListener {
    private TextView a;
    private XTextView b;
    private View c;
    private ImageView d;
    private XLinearLayout e;
    private View.OnClickListener f;
    private a g;
    private String h;
    private boolean i;
    private String j;
    private String k;
    private int l;
    private int m;
    private ProgressBar n;
    private boolean o;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    public DialogTopLayout(Context context) {
        super(context);
        this.i = false;
        this.j = "";
        this.k = "";
        this.o = true;
        d();
    }

    public DialogTopLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.j = "";
        this.k = "";
        this.o = true;
        d();
    }

    public DialogTopLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.j = "";
        this.k = "";
        this.o = true;
        d();
    }

    private void d() {
        View inflate = LayoutInflater.from(getContext()).inflate(f.g.layout_dialog_top_layout, this);
        this.a = (TextView) inflate.findViewById(f.C0131f.dialog_title);
        this.c = inflate.findViewById(f.C0131f.dialog_back);
        this.b = (XTextView) inflate.findViewById(f.C0131f.dialog_sub);
        this.d = (ImageView) inflate.findViewById(f.C0131f.dialog_sub_icon);
        this.e = (XLinearLayout) inflate.findViewById(f.C0131f.dialog_right_layout);
        this.n = (ProgressBar) inflate.findViewById(f.C0131f.dialog_sub_loading);
        this.b.setVuiLabel("");
        VuiEngine.getInstance(getContext()).setVuiStatfulButtonClick(this.b);
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.b);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.widget.DialogTopLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogTopLayout.this.a(view);
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.widget.DialogTopLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DialogTopLayout.this.g == null || !ShakeUtil.canExecute(DialogTopLayout.this.e.getId())) {
                    return;
                }
                DialogTopLayout.this.g.a(DialogTopLayout.this.c());
            }
        });
        this.j = getContext().getResources().getString(f.h.delete);
        this.k = getContext().getResources().getString(f.h.complete);
        this.m = f.e.ic_32_delete;
        this.l = f.e.ic_32_finish;
        applyTheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        View.OnClickListener onClickListener = this.f;
        if (onClickListener != null) {
            if (view != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.xiaopeng.musicradio.widget.lifecycle.a) {
                if (ShakeUtil.canExecute(f.C0131f.dialog_back)) {
                    ((com.xiaopeng.musicradio.widget.lifecycle.a) parent).a();
                    return;
                }
                return;
            }
        }
    }

    public void a(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public boolean a() {
        return this.i;
    }

    public void b() {
        int a2 = bak.a(f.c.dialog_sub, f.c.x_theme_text_01);
        if (this.i) {
            this.b.setText(this.k);
            if (this.o) {
                this.d.setImageDrawable(t.a(bak.b(this.l), a2));
            } else {
                this.d.setImageResource(this.l);
            }
            VuiUtils.setStatefulButtonAttr(this.b, 0, new String[]{getContext().getResources().getString(f.h.delete), getContext().getResources().getString(f.h.complete)}, null);
        } else {
            this.b.setText(this.j);
            this.d.setImageDrawable(t.a(bak.b(this.m), a2));
            VuiUtils.setStatefulButtonAttr(this.b, 1, new String[]{getContext().getResources().getString(f.h.delete), getContext().getResources().getString(f.h.complete)}, null);
        }
        if (TextUtils.isEmpty(this.h) || this.b == null) {
            return;
        }
        VuiEngine.getInstance(getContext()).updateScene(this.h, this.b);
    }

    public void a(String str, String str2) {
        this.j = str;
        this.k = str2;
    }

    public void a(int i, int i2) {
        this.m = i;
        this.l = i2;
    }

    public void setEnableColorFilter(boolean z) {
        this.o = z;
    }

    public boolean c() {
        this.i = !this.i;
        b();
        return this.i;
    }

    public void setEditMode(boolean z) {
        this.i = z;
        b();
    }

    public void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setSceneId(String str) {
        this.h = str;
    }

    public void setTitle(int i) {
        this.a.setText(i);
    }

    public void setSubIconRes(int i) {
        this.d.setImageResource(i);
    }

    @Override // defpackage.bal
    public void applyTheme() {
        this.e.setBackgroundResource(f.e.x_btn_ghost_large_positive_selector);
        this.c.invalidate();
        b();
    }

    @Override // com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
        applyTheme();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        baj.a().a((ThemeWatcher.OnThemeSwitchListener) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        baj.a().b((ThemeWatcher.OnThemeSwitchListener) this);
    }

    public void setCloseListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public void setOnEditModeChange(a aVar) {
        this.g = aVar;
    }

    public void setIsLoading(boolean z) {
        if (z) {
            this.n.setVisibility(0);
            this.e.setClickable(false);
            this.d.setVisibility(8);
            return;
        }
        this.n.setVisibility(8);
        this.e.setClickable(true);
        this.d.setVisibility(0);
    }

    public XLinearLayout getmRightLayout() {
        return this.e;
    }
}
