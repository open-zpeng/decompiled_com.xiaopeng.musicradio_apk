package com.xiaopeng.musicradio.program.choice.view.rank;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.base.BaseLinearLayout;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.presenter.rank.RankLayoutPresenter;
import com.xiaopeng.musicradio.program.common.view.CommonTitleAlbumItemView;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.speech.vui.VuiEngine;
/* loaded from: classes2.dex */
public class RankLayout extends BaseLinearLayout<a, RankLayoutPresenter> implements a {
    private static String c = "RankLayout";
    private CommonTitleAlbumItemView d;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
    }

    public RankLayout(Context context) {
        super(context);
    }

    public RankLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RankLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    /* renamed from: g */
    public RankLayoutPresenter a() {
        return new RankLayoutPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.d = (CommonTitleAlbumItemView) findViewById(b.d.rank_item);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        e();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return b.e.layout_rank;
    }

    public void a(String str, RdAlbumBean rdAlbumBean, int i, int i2, int i3) {
        ((RankLayoutPresenter) this.b).a(rdAlbumBean);
        if (rdAlbumBean == null) {
            this.d.setVisibility(8);
            this.d.setVuiMode(bij.DISABLED);
            return;
        }
        if (this.d.getVisibility() == 8) {
            this.d.setVisibility(0);
        }
        this.d.a(rdAlbumBean.getTitle(), rdAlbumBean.getBestSizeLogo(), i2, i3, true);
        this.d.a(rdAlbumBean.getPaymentType(), rdAlbumBean.isAuthorized());
        this.d.setTag(b.e.item_rank_album, Integer.valueOf(i2));
        if (((RankLayoutPresenter) this.b).b(rdAlbumBean.getId())) {
            this.d.a(2);
        } else {
            this.d.a(3);
        }
        this.d.setVuiMode(bij.NORMAL);
        this.d.setVuiPosition(i2);
        VuiEngine vuiEngine = VuiEngine.getInstance(getContext());
        CommonTitleAlbumItemView commonTitleAlbumItemView = this.d;
        vuiEngine.setVuiElementTag(commonTitleAlbumItemView, "program_main_rank_list_item_" + i2 + "_rankid_" + i);
        this.d.setVuiLabel(String.format(getContext().getResources().getString(b.f.vui_play_position), c.a(rdAlbumBean.getTitle()), Integer.valueOf(i3), Integer.valueOf(i3)));
        this.d.setVuiAction(big.CLICK.a());
        this.d.setVuiLayoutLoadable(true);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.rank.a
    public void a(int i) {
        this.d.a(i);
        c.a(getContext(), this.d.getPlayControlView(), i == 2);
        VuiEngine.getInstance(getContext()).updateScene("MainProgramEditorChoice", this.d.getPlayControlView());
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.rank.a
    public void e() {
        this.d.b();
    }

    public void setItemClickListener(e.c cVar) {
        this.d.setOnClickListener(cVar);
    }

    public void setItemPlayListener(e.c cVar) {
        this.d.setPlayListener(cVar);
    }

    @Override // com.xiaopeng.musicradio.program.choice.view.rank.a
    public void f() {
        this.d.a();
    }
}
