package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.presenter.BtNoConnectPresenter;
import com.xiaopeng.xui.widget.XButton;
import com.xiaopeng.xui.widget.XTextView;
/* loaded from: classes.dex */
public class BtNoConnectLayout extends BaseFrameLayout<d, BtNoConnectPresenter> implements d {
    private XButton c;
    private XTextView d;
    private XTextView e;
    private boolean f;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
    }

    public BtNoConnectLayout(Context context) {
        super(context);
    }

    public BtNoConnectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BtNoConnectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public BtNoConnectPresenter a() {
        return new BtNoConnectPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XButton) findViewById(b.d.btn_bt_connect);
        this.d = (XTextView) findViewById(b.d.tv_bt_connect_no_sub_title);
        this.e = (XTextView) findViewById(b.d.tv_bt_connect_no_title);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.player.view.BtNoConnectLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((BtNoConnectPresenter) BtNoConnectLayout.this.b).c();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.layout_bt_no_connect;
    }

    public void a(boolean z) {
        this.f = z;
        if (z) {
            this.d.setText(b.f.bt_phone_music_play_tip);
            this.c.setVisibility(8);
            return;
        }
        this.d.setText(b.f.bt_connect_no_sub_title);
        this.c.setVisibility(0);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.d
    public void a(int i) {
        if (i == 4 || i == 3) {
            this.d.setText(b.f.bt_phone_music_connecting_tips);
            this.c.setVisibility(8);
            return;
        }
        a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.setTextColor(getResources().getColor(b.a.text_02));
        this.e.setTextColor(getResources().getColor(b.a.color_0f1520));
    }
}
