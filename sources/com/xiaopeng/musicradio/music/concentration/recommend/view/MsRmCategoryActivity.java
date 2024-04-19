package com.xiaopeng.musicradio.music.concentration.recommend.view;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.xpbean.ReMusicTagInfo;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryActPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aeo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Route(path = "/music/activity/rm_category")
/* loaded from: classes.dex */
public class MsRmCategoryActivity extends com.xiaopeng.musicradio.commonui.vui.a<a, MsRmCategoryActPresenter> implements a {
    private DialogTopLayout f;
    private MusicRecyclerTabLayout g;
    private NoScrollViewPager h;
    private LoadingTipsView i;
    private LinearLayout j;
    private aeo k;

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicConcentrationCategory";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public MsRmCategoryActPresenter e() {
        return new MsRmCategoryActPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_rm_category;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.f = (DialogTopLayout) findViewById(b.d.rm_category_act_top_title);
        this.g = (MusicRecyclerTabLayout) findViewById(b.d.rm_category_act_tab);
        this.h = (NoScrollViewPager) findViewById(b.d.rm_category_act_viewpager);
        this.i = (LoadingTipsView) findViewById(b.d.rm_category_act_loadingview);
        this.j = (LinearLayout) findViewById(b.d.rm_category_act_layout);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        this.i.setAutoClickLoadingEnable(false);
        this.f.a(false);
        this.f.setTitle(be.a(b.f.music_main_selection_rm_title));
        this.g.initVuiAttr(m(), VuiEngine.getInstance(this), true, true);
        this.g.setVuiLabel(be.a(b.f.vui_left));
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.f.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsRmCategoryActivity.this.finish();
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmCategoryActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MsRmCategoryActPresenter) MsRmCategoryActivity.this.b).d();
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

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.a
    public void a(ArrayList<ReMusicTagInfo> arrayList) {
        a(0);
        this.j.setVisibility(0);
        aeo aeoVar = this.k;
        if (aeoVar == null || aeoVar.a() <= 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            this.k = new aeo(getSupportFragmentManager());
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ReMusicTagInfo reMusicTagInfo = (ReMusicTagInfo) it.next();
                Bundle bundle = new Bundle();
                bundle.putString("rm_category_id", reMusicTagInfo.getId());
                bundle.putString("rm_category_name", reMusicTagInfo.getName());
                bundle.putInt("rm_category_type", reMusicTagInfo.getType());
                bundle.putInt("rm_category_sort", reMusicTagInfo.getSort());
                arrayList3.add(new aeo.a("/music/activity/rm_category_detail", reMusicTagInfo.getName(), bundle));
            }
            this.k.a((List<aeo.a>) arrayList3);
            this.h.setAdapter(this.k);
            this.g.setUpWithViewPager(this.h);
        }
    }
}
