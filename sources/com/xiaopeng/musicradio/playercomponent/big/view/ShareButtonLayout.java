package com.xiaopeng.musicradio.playercomponent.big.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.commonui.base.BaseLinearLayout;
import com.xiaopeng.musicradio.playercomponent.big.presenter.ShareButtonPresenter;
import com.xiaopeng.xui.widget.XImageView;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.avp;
/* loaded from: classes2.dex */
public class ShareButtonLayout extends BaseLinearLayout<Object, ShareButtonPresenter> {
    private XLinearLayout c;
    private XImageView d;
    private XTextView e;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void c() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ShareButtonLayout(Context context) {
        super(context);
    }

    public ShareButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShareButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    /* renamed from: e */
    public ShareButtonPresenter a() {
        return new ShareButtonPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void b() {
        this.c = (XLinearLayout) findViewById(avp.b.view_share);
        this.d = (XImageView) findViewById(avp.b.iv_share);
        this.e = (XTextView) findViewById(avp.b.tv_share);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    public int getContentViewId() {
        return avp.c.layout_player_share_btn;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseLinearLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.playercomponent.big.view.ShareButtonLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ShakeUtil.canExecute(ShareButtonLayout.this.c.getId())) {
                    ((ShareButtonPresenter) ShareButtonLayout.this.b).c();
                }
            }
        });
    }
}
