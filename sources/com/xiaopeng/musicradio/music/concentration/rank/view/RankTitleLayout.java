package com.xiaopeng.musicradio.music.concentration.rank.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.rank.presenter.RankTitlePresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XConstraintLayout;
import defpackage.agh;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class RankTitleLayout extends BaseFrameLayout<b, RankTitlePresenter> implements b {
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

    public RankTitleLayout(Context context) {
        super(context);
    }

    public RankTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RankTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public RankTitlePresenter a() {
        return new RankTitlePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XConstraintLayout) findViewById(b.d.rank_root_layout);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", "" + this.c.getId());
            ((XConstraintLayout) findViewById(b.d.rank_root_layout)).setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.rank.view.RankTitleLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                atv.l();
                u.c(new agh.b(0, "rank", ""));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_rank_title;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }
}
