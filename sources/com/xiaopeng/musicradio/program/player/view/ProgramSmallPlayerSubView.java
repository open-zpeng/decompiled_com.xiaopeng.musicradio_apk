package com.xiaopeng.musicradio.program.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.xui.widget.XImageView;
/* loaded from: classes2.dex */
public class ProgramSmallPlayerSubView extends com.xiaopeng.musicradio.widget.mvpbase.c<c, com.xiaopeng.musicradio.program.player.presenter.a> implements c {
    private XImageView mLoveImg;
    private FrameLayout mLoveLayout;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setView() {
    }

    public ProgramSmallPlayerSubView(Context context) {
        super(context);
    }

    public ProgramSmallPlayerSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProgramSmallPlayerSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public com.xiaopeng.musicradio.program.player.presenter.a createPresenter() {
        return new com.xiaopeng.musicradio.program.player.presenter.a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void findView() {
        this.mLoveImg = (XImageView) findViewById(b.d.img_program_love);
        this.mLoveLayout = (FrameLayout) findViewById(b.d.layout_love);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setListener() {
        this.mLoveLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.program.player.view.ProgramSmallPlayerSubView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(b.d.layout_love, 1000)) {
                    ((com.xiaopeng.musicradio.program.player.presenter.a) ProgramSmallPlayerSubView.this.mPresenter).h();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public int getContentViewId() {
        return b.e.layout_small_program_player;
    }

    @Override // com.xiaopeng.musicradio.program.player.view.c
    public void updateLove(boolean z) {
        this.mLoveImg.setSelected(z);
        ProgramBean r = axn.i().r();
        if (r != null && r.getCardId() == 0) {
            this.mLoveImg.setAlpha(1.0f);
            setListener();
            return;
        }
        this.mLoveLayout.setOnClickListener(null);
        this.mLoveImg.setSelected(false);
        this.mLoveImg.setAlpha(0.15f);
    }
}
