package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.xui.widget.XImageView;
/* loaded from: classes.dex */
public class BtMusicSmallPlayerSubView extends com.xiaopeng.musicradio.widget.mvpbase.c<c, com.xiaopeng.musicradio.music.player.presenter.a> implements c {
    private XImageView mLoveImg;
    private FrameLayout mLoveLayout;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setView() {
    }

    public BtMusicSmallPlayerSubView(Context context) {
        super(context);
    }

    public BtMusicSmallPlayerSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BtMusicSmallPlayerSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public com.xiaopeng.musicradio.music.player.presenter.a createPresenter() {
        return new com.xiaopeng.musicradio.music.player.presenter.a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void findView() {
        this.mLoveImg = (XImageView) findViewById(b.d.img_bt_love);
        this.mLoveLayout = (FrameLayout) findViewById(b.d.layout_love);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    protected void setListener() {
        this.mLoveLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.BtMusicSmallPlayerSubView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((com.xiaopeng.musicradio.music.player.presenter.a) BtMusicSmallPlayerSubView.this.mPresenter).d();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.c
    public int getContentViewId() {
        return b.e.layout_small_bt_music_player;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.c
    public void updateLove(boolean z, boolean z2) {
        this.mLoveImg.setSelected(z);
        this.mLoveImg.setEnabled(z2);
        enableLove(z2);
    }

    private void enableLove(boolean z) {
        this.mLoveLayout.setClickable(z);
        this.mLoveLayout.setEnabled(z);
        if (z) {
            this.mLoveImg.setAlpha(1.0f);
        } else {
            this.mLoveImg.setAlpha(0.16f);
        }
    }
}
