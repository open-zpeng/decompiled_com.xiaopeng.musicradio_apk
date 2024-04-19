package com.xiaopeng.musicradio.music.concentration.singer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.singer.presenter.SingerTitlePresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import defpackage.agh;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SingerTitleLayout extends BaseFrameLayout<b, SingerTitlePresenter> implements b {
    private XConstraintLayout c;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public SingerTitleLayout(Context context) {
        super(context);
    }

    public SingerTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SingerTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public SingerTitlePresenter a() {
        return new SingerTitlePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XConstraintLayout) findViewById(b.d.singer_root_layout);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", "" + this.c.getId());
            ((XConstraintLayout) findViewById(b.d.singer_root_layout)).setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.singer.view.SingerTitleLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.m();
                u.c(new agh.b(0, "singer", ""));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_singer_title;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }
}
