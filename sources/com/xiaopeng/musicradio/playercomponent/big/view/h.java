package com.xiaopeng.musicradio.playercomponent.big.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerSharePresenter;
import com.xiaopeng.musicradio.utils.ba;
import com.xiaopeng.musicradio.widget.MusicCircleImageView;
import com.xiaopeng.xui.utils.XTouchUtils;
import com.xiaopeng.xui.widget.XConstraintLayout;
import com.xiaopeng.xui.widget.XEditText;
import com.xiaopeng.xui.widget.XImageButton;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.avp;
/* compiled from: PlayerShareLayout.java */
/* loaded from: classes2.dex */
public class h extends XConstraintLayout implements d {
    private final String a;
    private final int b;
    private final Context c;
    private MusicCircleImageView d;
    private XTextView e;
    private XTextView f;
    private XTextView g;
    private XTextView h;
    private ViewStub i;
    private XConstraintLayout j;
    private final PlayerSharePresenter k;
    private View l;
    private XEditText m;
    private XTextView n;
    private XImageButton o;
    private XImageButton p;
    private XImageButton q;

    public h(Context context, ViewGroup viewGroup) {
        super(context);
        this.a = "PlayerShareLayout";
        this.b = 100;
        this.c = context;
        this.k = new PlayerSharePresenter();
        this.k.a((d) this);
        View inflate = LayoutInflater.from(context).inflate(avp.c.layout_player_share, viewGroup, false);
        setLayoutParams(new ConstraintLayout.a(-1, -2));
        addView(inflate);
        f();
        g();
    }

    private void f() {
        this.d = (MusicCircleImageView) findViewById(avp.b.iv_cover);
        this.e = (XTextView) findViewById(avp.b.tv_main_title);
        this.f = (XTextView) findViewById(avp.b.tv_sub_title);
        this.g = (XTextView) findViewById(avp.b.tv_share_text);
        this.h = (XTextView) findViewById(avp.b.tv_share_tag);
        this.j = (XConstraintLayout) findViewById(avp.b.layout_share);
        this.i = (ViewStub) findViewById(avp.b.vs_text_editor);
        this.q = (XImageButton) findViewById(avp.b.btn_edit);
    }

    private void g() {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.h.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h.this.d.setVisibility(8);
                h.this.e.setVisibility(8);
                h.this.f.setVisibility(8);
                h.this.j.setVisibility(8);
                h hVar = h.this;
                hVar.l = hVar.i.inflate();
                h.this.h();
                h.this.i();
                h.this.j();
            }
        };
        this.j.setOnClickListener(onClickListener);
        this.q.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        XConstraintLayout xConstraintLayout = (XConstraintLayout) this.l.findViewById(avp.b.sub_text_editor);
        this.m = (XEditText) xConstraintLayout.findViewById(avp.b.et_share_text);
        this.n = (XTextView) xConstraintLayout.findViewById(avp.b.tv_share_text_num);
        this.o = (XImageButton) xConstraintLayout.findViewById(avp.b.btn_clean);
        this.p = (XImageButton) xConstraintLayout.findViewById(avp.b.btn_microphone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.m.setText(this.g.getText());
        this.m.requestFocus();
        this.m.setSingleLine(false);
        ba.a(this.m);
        this.k.f();
        k();
        XTouchUtils.enlargeTouchDelegate(this.o, 26);
        XTouchUtils.enlargeTouchDelegate(this.p, 26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.m.addTextChangedListener(new TextWatcher() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.h.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                h.this.k();
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.h.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h.this.m.setText("");
                h.this.m.setSingleLine(false);
                h.this.k.d();
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.h.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecute(h.this.p.getId())) {
                    h.this.k.c();
                    ba.b(view);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XConstraintLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k.onDestroy(null);
        this.k.h();
    }

    public void setImageWithDrawable(Drawable drawable) {
        if (drawable != null) {
            this.d.setImageResource(0);
            this.d.setImageDrawable(drawable);
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public void c() {
        XEditText xEditText = this.m;
        if (xEditText == null || !xEditText.getText().toString().equals(this.g.getText().toString())) {
            return;
        }
        LogUtils.i("PlayerShareLayout", "mEtShareText == mTvShareText");
        this.m.setText("");
        this.m.setSingleLine(false);
    }

    public void setImageWithId(int i) {
        this.d.setImageResource(i);
    }

    public void a(String str, String str2) {
        this.e.setText(str);
        this.f.setText(str2);
    }

    public void b(String str, String str2) {
        this.h.setText(String.format(getContext().getString(avp.d.sharer_message), str, str2));
    }

    public void setContent(String str) {
        this.g.setText(str);
    }

    public void setDefaultContent(String str) {
        this.g.setText(str);
    }

    public String getContent() {
        XEditText xEditText = this.m;
        if (xEditText == null) {
            return this.g.getText().toString();
        }
        return xEditText.getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.n.setText(String.format(this.c.getResources().getString(avp.d.share_text_num), Integer.valueOf(this.m.getText() == null ? 0 : this.m.getText().length())));
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public void a() {
        XImageButton xImageButton = this.p;
        if (xImageButton == null) {
            return;
        }
        xImageButton.setImageResource(avp.a.ic_microphone);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public void b() {
        XImageButton xImageButton = this.p;
        if (xImageButton == null) {
            return;
        }
        xImageButton.setImageResource(avp.a.animation_infoflow_asr_speaking);
        ((AnimationDrawable) this.p.getDrawable()).start();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public String getEditTextContent() {
        return (this.m.getText() == null || this.m.getText().toString().equals(this.g.getText().toString())) ? "" : this.m.getText().toString();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public void a(final String str) {
        this.m.post(new Runnable() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.h.5
            @Override // java.lang.Runnable
            public void run() {
                if (str.length() < 100) {
                    h.this.m.setText(str);
                    h.this.m.setSelection(str.length());
                    h.this.m.setSingleLine(false);
                    return;
                }
                h.this.m.setText(str.substring(0, 100));
                h.this.m.setSingleLine(false);
                h.this.k.h();
                h.this.k.e();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public void d() {
        XEditText xEditText = this.m;
        if (xEditText == null) {
            return;
        }
        xEditText.setInputType(1);
        this.m.setSingleLine(false);
        if (this.m.getText() != null) {
            XEditText xEditText2 = this.m;
            xEditText2.setSelection(xEditText2.getText().length());
            return;
        }
        this.m.setSelection(0);
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.view.d
    public void e() {
        XEditText xEditText = this.m;
        if (xEditText == null) {
            return;
        }
        xEditText.setInputType(0);
        this.m.setSingleLine(false);
    }

    public EditText getEditText() {
        return this.m;
    }
}
