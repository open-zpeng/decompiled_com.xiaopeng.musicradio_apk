package com.xiaopeng.musicradio.music.concentration.xpplay.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.xpplay.presenter.MsXpPlayTitlePresenter;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class XpPlayTitleLayout extends BaseFrameLayout<c, MsXpPlayTitlePresenter> implements c {
    private XConstraintLayout c;
    private int d;
    private String e;

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

    public XpPlayTitleLayout(Context context) {
        super(context);
        this.d = 0;
    }

    public XpPlayTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    public XpPlayTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public MsXpPlayTitlePresenter a() {
        return new MsXpPlayTitlePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XConstraintLayout) findViewById(b.d.xp_play_root_layout);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", "" + this.c.getId());
            ((XConstraintLayout) findViewById(b.d.xp_play_root_layout)).setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.xpplay.view.XpPlayTitleLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (XpPlayTitleLayout.this.d > 0) {
                    atv.k();
                    sp.a().a("/music/activity/xp_play").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withInt("rm_category_id", XpPlayTitleLayout.this.d).withString("rm_category_name", XpPlayTitleLayout.this.e).navigation();
                }
            }
        });
    }

    public void a(int i, String str) {
        this.d = i;
        this.e = str;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_xp_play_title;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }
}
