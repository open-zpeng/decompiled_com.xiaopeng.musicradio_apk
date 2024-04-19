package com.xiaopeng.musicradio.netradio.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.xui.widget.XImageView;
import defpackage.beo;
/* loaded from: classes2.dex */
public class NetRadioSmallPlayerSubView extends com.xiaopeng.musicradio.widget.mvpbase.c<c, com.xiaopeng.musicradio.netradio.player.presenter.a> implements c {
    private XImageView mLoveImg;
    private FrameLayout mLoveLayout;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setView() {
    }

    public NetRadioSmallPlayerSubView(Context context) {
        super(context);
    }

    public NetRadioSmallPlayerSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NetRadioSmallPlayerSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public com.xiaopeng.musicradio.netradio.player.presenter.a createPresenter() {
        return new com.xiaopeng.musicradio.netradio.player.presenter.a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void findView() {
        this.mLoveImg = (XImageView) findViewById(beo.c.img_netradio_love);
        this.mLoveLayout = (FrameLayout) findViewById(beo.c.layout_love);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setListener() {
        this.mLoveLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.player.view.NetRadioSmallPlayerSubView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecuteLong(beo.c.layout_love, 1000)) {
                    ((com.xiaopeng.musicradio.netradio.player.presenter.a) NetRadioSmallPlayerSubView.this.mPresenter).f();
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public int getContentViewId() {
        return beo.d.layout_small_netradio_player;
    }

    @Override // com.xiaopeng.musicradio.netradio.player.view.c
    public void updateLove(boolean z) {
        this.mLoveImg.setSelected(z);
    }
}
