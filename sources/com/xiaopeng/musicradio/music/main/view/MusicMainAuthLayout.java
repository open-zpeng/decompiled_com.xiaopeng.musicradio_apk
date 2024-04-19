package com.xiaopeng.musicradio.music.main.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.main.presenter.MusicMainAuthPresenter;
import com.xiaopeng.musicradio.utils.aa;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.theme.XThemeManager;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class MusicMainAuthLayout extends VuiBaseFrameLayout<b, MusicMainAuthPresenter> implements b {
    private XLinearLayout c;
    private XLinearLayout d;
    private acv e;
    private XTextView f;
    private XTextView g;
    private XImageView h;
    private boolean i;
    private boolean j;

    @Override // com.xiaopeng.musicradio.music.main.view.b
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public boolean f() {
        return true;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public String getSceneId() {
        return "MusicAuth";
    }

    public MusicMainAuthLayout(Context context) {
        super(context);
        this.i = false;
        this.j = true;
    }

    public MusicMainAuthLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.j = true;
        this.e = acv.a(context, attributeSet);
    }

    public MusicMainAuthLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.j = true;
        this.e = acv.a(context, attributeSet);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        afd.a(getSceneId());
        VuiEngine.getInstance(getContext()).enterScene(getSceneId());
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout, com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onPause(i iVar) {
        super.onPause(iVar);
        afd.b(getSceneId());
        VuiEngine.getInstance(getContext()).exitScene(getSceneId());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_main_auth_mask;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.h = (XImageView) findViewById(b.d.auth_bg);
        this.c = (XLinearLayout) findViewById(b.d.weixin_login);
        this.d = (XLinearLayout) findViewById(b.d.qq_login);
        this.f = (XTextView) findViewById(b.d.weixin_last_login);
        this.g = (XTextView) findViewById(b.d.qq_last_login);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        aa.a(b.c.img_auth_bg, (ImageView) this.h);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.main.view.MusicMainAuthLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                adp.a("MusicMainAuthLayout");
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.main.view.MusicMainAuthLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                adp.b("MusicMainAuthLayout");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public MusicMainAuthPresenter a() {
        return new MusicMainAuthPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public List<String> getSubSceneList() {
        return Arrays.asList("MainLocalTop");
    }

    public void setVuiVisible(int i) {
        if (i == 0) {
            this.j = true;
            VuiEngine.getInstance(getContext()).enterScene(getSceneId());
            return;
        }
        this.j = false;
        VuiEngine.getInstance(getContext()).exitScene(getSceneId());
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.VuiBaseFrameLayout
    public boolean getVuiVisible() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.e.a(this, configuration);
        if (XThemeManager.isThemeChanged(configuration)) {
            y.a(getContext(), b.c.img_auth_bg, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a((View) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout, com.xiaopeng.xui.widget.XFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.b(this);
    }

    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            h();
        }
    }

    private void h() {
        String b = ((aqs) apx.a().b()).b();
        if (TextUtils.equals(b, "qq")) {
            this.g.setVisibility(0);
            this.f.setVisibility(8);
        } else if (TextUtils.equals(b, "wx")) {
            this.g.setVisibility(8);
            this.f.setVisibility(0);
        } else {
            this.g.setVisibility(8);
            this.f.setVisibility(8);
        }
    }
}
