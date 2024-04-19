package com.xiaopeng.musicradio.program.choice.view.rank;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.base.BaseLinearLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.rank.RankTitleLayoutPresenter;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.VuiView;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes2.dex */
public class RankTitleLayout extends BaseLinearLayout<a, RankTitleLayoutPresenter> {
    private XTextView c;
    private String d;
    private int e;
    private View f;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
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
    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    /* renamed from: e */
    public RankTitleLayoutPresenter a() {
        return new RankTitleLayoutPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.c = (XTextView) findViewById(b.d.rank_title);
        this.f = findViewById(b.d.rank_root);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return b.e.layout_rank_title;
    }

    public void a(String str, int i, int i2) {
        this.c.setText(str);
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.c);
        ((VuiView) this.f).setVuiLabel(str);
        this.d = str;
        this.e = i;
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        XTextView xTextView = this.c;
        vuiEngine.setVuiElementTag(xTextView, this.c.getId() + "_rankid_" + i);
        VuiEngine vuiEngine2 = VuiEngine.getInstance(getContext());
        View view = this.f;
        vuiEngine2.setVuiElementTag(view, this.f.getId() + "_rankid_" + i);
        c.a((VuiView) this.f, VuiEngine.getInstance(getContext()).getVuiElementTag(this.c));
    }
}
