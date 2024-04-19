package com.xiaopeng.musicradio.netradio.concentration.allradio.view;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioActPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aeo;
import defpackage.beo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Route(path = "/xpnetradio/activity/allradio")
/* loaded from: classes.dex */
public class NrAllRadioActivity extends com.xiaopeng.musicradio.commonui.vui.a<a, NrAllRadioActPresenter> implements a {
    private DialogTopLayout f;
    private MusicRecyclerTabLayout g;
    private NoScrollViewPager h;
    private LoadingTipsView i;
    private LinearLayout j;
    private aeo k;
    private XTextView l;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "AllRadioCategoryDetail";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public NrAllRadioActPresenter e() {
        return new NrAllRadioActPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return beo.d.netradio_activity_allradio;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(beo.c.allradio_act_top_title);
        this.g = (MusicRecyclerTabLayout) findViewById(beo.c.allradio_act_tab);
        this.h = (NoScrollViewPager) findViewById(beo.c.allradio_act_viewpager);
        this.i = (LoadingTipsView) findViewById(beo.c.allradio_act_loadingview);
        this.i.setAutoClickLoadingEnable(false);
        this.j = (LinearLayout) findViewById(beo.c.allradio_act_layout);
        this.l = (XTextView) findViewById(beo.c.allradio_count);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.f.setTitle(be.a(beo.e.netradio_allradio_title));
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.view.NrAllRadioActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NrAllRadioActivity.this.finish();
            }
        });
        this.f.a(false);
        XTextView xTextView = this.l;
        xTextView.setText(be.a(beo.e.allradio_title1) + ay.c("SP_NET_RADIO_ALLCOUNT", "807") + be.a(beo.e.allradio_title2));
        this.g.initVuiAttr(m(), VuiEngine.getInstance(this), true, true);
        this.g.setVuiLabel(be.a(beo.e.vui_left));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.view.NrAllRadioActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((NrAllRadioActPresenter) NrAllRadioActivity.this.b).c();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.j.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.j.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.j.setVisibility(8);
        a(3);
    }

    @Override // com.xiaopeng.musicradio.netradio.concentration.allradio.view.a
    public void a(ArrayList<NetRadioTagInfo> arrayList) {
        a(0);
        this.j.setVisibility(0);
        new ArrayList().addAll(arrayList);
        aw.a((Object) this.h, "mOffscreenPageLimit", (Object) 0);
        this.k = new aeo(getSupportFragmentManager());
        ArrayList arrayList2 = new ArrayList();
        Iterator<NetRadioTagInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            NetRadioTagInfo next = it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("radio_id", next.getBizVal());
            arrayList2.add(new aeo.a("/netradio/fragment/allradio_detail", next.getName(), bundle));
        }
        this.k.a((List<aeo.a>) arrayList2);
        this.h.setAdapter(this.k);
        this.g.setUpWithViewPager(this.h);
    }

    public void a(int i) {
        this.i.setState(i);
        if (i == 1) {
            this.i.setClickable(false);
        } else {
            this.i.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        baj.a().b();
    }
}
