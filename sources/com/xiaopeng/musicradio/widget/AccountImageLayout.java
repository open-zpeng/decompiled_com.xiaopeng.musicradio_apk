package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.speech.vui.VuiEngine;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class AccountImageLayout extends BaseFrameLayout {
    private Context c;
    private LinearLayoutManager d;
    private a e;
    private BaseRecycleView f;
    private ArrayList<String> g;

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected BasePresenter a() {
        return null;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
    }

    public AccountImageLayout(Context context) {
        super(context);
        this.g = new ArrayList<>();
        this.c = context;
    }

    public AccountImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList<>();
        this.c = context;
    }

    public AccountImageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new ArrayList<>();
        this.c = context;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return f.g.layout_account_image;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.f = (BaseRecycleView) findViewById(f.C0131f.select_rv);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new a(this.c);
        this.d = new LinearLayoutManager(this.c);
        this.d.b(0);
        this.f.setLayoutManager(this.d);
        this.f.setAdapter(this.e);
        this.f.initVuiAttr("MusicSinger", VuiEngine.getInstance(getContext()), false, true, true);
        this.e.d();
    }

    public void setData(ArrayList<String> arrayList) {
        this.g.clear();
        this.g.addAll(arrayList);
        this.e.a(this.g);
        this.e.d();
    }
}
