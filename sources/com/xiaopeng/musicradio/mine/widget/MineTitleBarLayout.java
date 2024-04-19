package com.xiaopeng.musicradio.mine.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XRelativeLayout;
import defpackage.aht;
/* loaded from: classes.dex */
public class MineTitleBarLayout extends XRelativeLayout {
    private com.xiaopeng.musicradio.commonui.vui.a a;
    private View b;
    private TextView c;
    private XButton d;
    private XImageView e;
    private XButton f;
    private XImageView g;
    private int h;
    private a i;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public MineTitleBarLayout(Context context) {
        this(context, null);
    }

    public MineTitleBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MineTitleBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(aht.d.mine_title_bar_layout, (ViewGroup) this, true);
        this.b = findViewById(aht.c.btn_back);
        this.c = (TextView) findViewById(aht.c.tv_title);
        this.d = (XButton) findViewById(aht.c.tv_title_btn);
        this.e = (XImageView) findViewById(aht.c.iv_title_btn_img);
        this.f = (XButton) findViewById(aht.c.tv_title_edit_btn);
        this.g = (XImageView) findViewById(aht.c.iv_title_edit_btn_img);
        this.a = amf.a(getContext());
        if (this.a == null) {
            LogUtils.e("MineTitleBarLayout", "findActivity() return null");
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtils.e("MineTitleBarLayout", "finish:" + MineTitleBarLayout.this.a + ListSignBean.COLLECTID_SUFFIX + MineTitleBarLayout.this.h);
                if (MineTitleBarLayout.this.h == 0) {
                    if (MineTitleBarLayout.this.a == null || MineTitleBarLayout.this.a.isFinishing()) {
                        return;
                    }
                    MineTitleBarLayout.this.a.finish();
                    return;
                }
                MineTitleBarLayout.this.setMode(0);
            }
        });
        setVuiElementType(bih.UNKNOWN);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setTitle(int i) {
        this.c.setText(getContext().getString(i));
    }

    public void a(int i, int i2, boolean z) {
        this.d.setText(i2);
        this.e.setImageResource(i);
        if (z) {
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MineTitleBarLayout.this.setMode(0);
                }
            });
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.widget.MineTitleBarLayout.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (MineTitleBarLayout.this.h != 1) {
                        MineTitleBarLayout.this.h = 1;
                        MineTitleBarLayout.this.c();
                        MineTitleBarLayout.this.e();
                    }
                }
            });
            return;
        }
        this.d.setOnClickListener(null);
    }

    public void a() {
        if (TextUtils.isEmpty(this.d.getText())) {
            return;
        }
        d();
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        amk.a((View) this.d, true);
        amk.a(this.a.m(), this);
    }

    public void b() {
        a(true);
    }

    public void a(boolean z) {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        if (z) {
            amk.a((View) this.d, false);
            amk.a(this.a.m(), this);
        }
    }

    public void c() {
        b();
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        amk.a((View) this.f, true);
        amk.a(this.a.m(), this);
    }

    public void d() {
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        amk.a((View) this.f, false);
        amk.a(this.a.m(), this);
    }

    public void setTitleBtnEnable(boolean z) {
        boolean isEnabled = this.d.isEnabled();
        this.d.setEnabled(z);
        this.e.setEnabled(z);
        if (isEnabled != z) {
            amk.a(this.d, z);
            amk.a(this.a.m(), this);
        }
    }

    public TextView getTitleBtn() {
        return this.d;
    }

    public void setMode(int i) {
        a(i, true);
    }

    public void a(int i, boolean z) {
        if (this.h != i) {
            this.h = i;
            e();
            if (i == 0) {
                if (z) {
                    a();
                } else {
                    d();
                }
            }
        }
    }

    public int getMode() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(this.h);
        }
    }

    public void setOnModeChangedListener(a aVar) {
        this.i = aVar;
    }
}
