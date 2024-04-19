package com.xiaopeng.musicradio.music.concentration.zone.view;

import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.presenter.MsZoneDetailActPresenter;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XImageView;
import java.util.ArrayList;
import java.util.List;
@Route(path = "/music/activity/zone_detail")
/* loaded from: classes.dex */
public class MsZoneDetailActivity extends com.xiaopeng.musicradio.commonui.vui.a<a, MsZoneDetailActPresenter> implements a {
    private e f;
    private BaseRecycleView g;
    private LinearLayoutManager h;
    private DialogTopLayout i;
    private LoadingTipsView j;
    private int k;
    private String l;
    private String m;
    private int n;
    private XImageView p;
    private int[] o = {b.c.img_vip_collection_detail, b.c.img_child_collection_detail, b.c.img_vehicle_collection_detail};
    private List<Class<? extends ast>> q = new ArrayList();

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MusicZoneDetail";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public MsZoneDetailActPresenter e() {
        return new MsZoneDetailActPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return b.e.music_activity_zone_detail;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.p = (XImageView) findViewById(b.d.image_top);
        this.i = (DialogTopLayout) findViewById(b.d.zone_top_layout);
        this.g = (BaseRecycleView) findViewById(b.d.zone_detail_rv);
        this.i.a(false);
        this.j = (LoadingTipsView) findViewById(b.d.loadingview);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        r();
        this.h = new LinearLayoutManager(this);
        this.g.setLayoutManager(this.h);
        this.g.addItemDecoration(new j(0, 100, 0));
        this.f = new e();
        this.g.setAdapter(this.f);
        if (getIntent() != null) {
            this.k = getIntent().getIntExtra("zone_type", 0);
            this.l = getIntent().getStringExtra("zone_id");
            this.m = getIntent().getStringExtra("zone_name");
            this.n = getIntent().getIntExtra("zone_position", 0);
            ((MsZoneDetailActPresenter) this.b).b(this.l);
            this.i.setTitle(this.m);
            this.p.setImageResource(this.o[this.n]);
        }
        this.i.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneDetailActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsZoneDetailActivity.this.finish();
            }
        });
        q();
    }

    private void r() {
        this.q.add(asu.class);
        this.q.add(asv.class);
        this.q.add(asw.class);
        this.q.add(asx.class);
        this.q.add(asy.class);
        this.q.add(asz.class);
        this.q.add(ata.class);
        this.q.add(atb.class);
        this.q.add(atc.class);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MsZoneDetailActPresenter) MsZoneDetailActivity.this.b).b(MsZoneDetailActivity.this.l);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.view.a
    public void a(VipMusicMoreInfo vipMusicMoreInfo) {
        this.g.setVisibility(0);
        a(0);
        List<VipMusicMoreInfo.ModuleBean> moduleList = vipMusicMoreInfo.getData().getModuleList();
        if (moduleList == null || moduleList.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (int i2 = 0; i2 < moduleList.size(); i2++) {
            VipMusicMoreInfo.ModuleBean moduleBean = moduleList.get(i2);
            if (moduleBean.getType() == 1) {
                asr asrVar = new asr(i);
                asrVar.a(moduleBean);
                this.f.a(this.q.get(i2), asrVar);
                i += 4;
                try {
                    arrayList.add(this.q.get(i2).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                ass assVar = new ass(i2, i);
                assVar.a(moduleBean);
                this.f.a(this.q.get(i2), assVar);
                if (moduleBean.getCollectInfo() != null && moduleBean.getCollectInfo().getCollectList() != null) {
                    i += moduleBean.getCollectInfo().getCollectList().size();
                }
                try {
                    arrayList.add(this.q.get(i2).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.f.a((List<?>) arrayList);
        this.f.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        baj.a().b();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.g.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.g.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.g.setVisibility(8);
        a(3);
    }

    public void a(int i) {
        this.j.setState(i);
        if (i == 1) {
            this.j.setClickable(false);
        } else {
            this.j.setClickable(true);
        }
    }

    protected void q() {
        this.g.initVuiAttr("MusicZoneDetail", VuiEngine.getInstance(this), true, true);
    }
}
