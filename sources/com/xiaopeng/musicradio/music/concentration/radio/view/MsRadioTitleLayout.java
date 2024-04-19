package com.xiaopeng.musicradio.music.concentration.radio.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.radio.presenter.MsRadioTitlePresenter;
import com.xiaopeng.musicradio.vui.c;
import com.xiaopeng.xui.widget.XLinearLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsRadioTitleLayout extends BaseFrameLayout<a, MsRadioTitlePresenter> implements a {
    private XLinearLayout c;
    private aru d;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.radio.view.a
    public void a(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
    }

    @Override // com.xiaopeng.musicradio.music.concentration.radio.view.a
    public void e() {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
    }

    public MsRadioTitleLayout(Context context) {
        super(context);
    }

    public MsRadioTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsRadioTitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsRadioTitlePresenter a() {
        return new MsRadioTitlePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (XLinearLayout) findViewById(b.d.change);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        c.a(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.radio.view.MsRadioTitleLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Handler handler;
                if (!ShakeUtil.canExecute(view.getId()) || (handler = MsRadioTitleLayout.this.getHandler()) == null) {
                    return;
                }
                handler.postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.radio.view.MsRadioTitleLayout.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MsRadioTitlePresenter) MsRadioTitleLayout.this.b).g();
                        MsRadioTitleLayout.this.d.s();
                    }
                }, 50L);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_radio_title;
    }

    @Override // com.xiaopeng.musicradio.music.concentration.radio.view.a
    public void a(ArrayList<MusicRadioItem> arrayList) {
        if (arrayList.size() > 0) {
            this.c.setVisibility(0);
            this.d.h(arrayList);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
    }

    public void setFragment(aru aruVar) {
        this.d = aruVar;
    }
}
