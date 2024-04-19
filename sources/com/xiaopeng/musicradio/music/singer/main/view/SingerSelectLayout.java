package com.xiaopeng.musicradio.music.singer.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.q;
import com.xiaopeng.musicradio.bean.xpbean.SingerType;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.List;
/* loaded from: classes.dex */
public class SingerSelectLayout extends BaseFrameLayout implements View.OnClickListener {
    private Context c;
    private GridLayoutManager d;
    private GridLayoutManager e;
    private atn f;
    private atm g;
    private BaseRecycleView h;
    private BaseRecycleView i;
    private a j;

    /* loaded from: classes.dex */
    public interface a {
        void c(String str);

        void d(String str);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected BasePresenter a() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public SingerSelectLayout(Context context) {
        super(context);
        this.c = context;
    }

    public SingerSelectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    public SingerSelectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = context;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_singer_select_qq;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.h = (BaseRecycleView) findViewById(b.d.singer_type_rv);
        this.i = (BaseRecycleView) findViewById(b.d.singer_area_rv);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.f = new atn(this.c);
        this.g = new atm(this.c);
        h hVar = new h(7, 0, false);
        hVar.a(10);
        this.h.addItemDecoration(hVar);
        this.i.addItemDecoration(hVar);
        this.d = new GridLayoutManager(this.c, 7);
        this.e = new GridLayoutManager(this.c, 7);
        this.h.setHasFixedSize(true);
        this.h.setLayoutManager(this.d);
        ((q) this.h.getItemAnimator()).a(false);
        this.i.setHasFixedSize(true);
        this.i.setLayoutManager(this.e);
        ((q) this.i.getItemAnimator()).a(false);
        this.h.setAdapter(this.f);
        this.i.setAdapter(this.g);
        this.h.initVuiAttr("MusicSinger", VuiEngine.getInstance(getContext()), false, true, true);
        this.i.initVuiAttr("MusicSinger", VuiEngine.getInstance(getContext()), false, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.f.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.singer.main.view.SingerSelectLayout.1
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                SingerType g = SingerSelectLayout.this.f.g(i2);
                if (g != null) {
                    SingerSelectLayout.this.j.c(g.getTypeCode());
                }
            }
        });
        this.g.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.singer.main.view.SingerSelectLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                SingerType g = SingerSelectLayout.this.g.g(i2);
                if (g != null) {
                    SingerSelectLayout.this.j.d(g.getAreaCode());
                }
            }
        });
    }

    public void setAreaData(List<SingerType> list) {
        this.g.a(list);
        this.g.d();
    }

    public void setTypeData(List<SingerType> list) {
        this.f.a(list);
        this.f.d();
    }

    public void setStateChange(a aVar) {
        this.j = aVar;
    }
}
