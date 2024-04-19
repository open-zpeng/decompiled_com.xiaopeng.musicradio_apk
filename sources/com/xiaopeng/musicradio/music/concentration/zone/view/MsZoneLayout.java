package com.xiaopeng.musicradio.music.concentration.zone.view;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMainZoneResult;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.zone.presenter.MsZonePresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.aep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public class MsZoneLayout extends BaseFrameLayout<b, MsZonePresenter> implements bic, b {
    private asq c;
    private BaseRecycleView d;
    private GridLayoutManager e;
    private LoadingTipsView f;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsZonePresenter a() {
        return new MsZonePresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.d = (BaseRecycleView) findViewById(b.d.ms_selection_zone_rv);
        this.f = (LoadingTipsView) findViewById(b.d.ms_selection_zone_loading_item);
        this.f.setAutoClickLoadingEnable(false);
        a(1);
        this.d.initVuiAttr("MainMusicConcentration", VuiEngine.getInstance(getContext()), false, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c = new asq(getContext());
        this.d.setItemAnimator(new e());
        h hVar = new h(3, 60, false);
        hVar.c(35);
        this.d.addItemDecoration(hVar);
        this.e = new GridLayoutManager(getContext(), 3);
        this.d.setLayoutManager(this.e);
        this.d.setHasFixedSize(true);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.c);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsZoneLayout.this.a(1);
                MsZoneLayout.this.g();
            }
        });
        this.c.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneLayout.2
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                if (apk.i().y()) {
                    return;
                }
                VipMusicMainZoneResult.DataBean.ListBean g = MsZoneLayout.this.c.g(i2);
                switch (i) {
                    case 0:
                        MsZoneLayout.this.a(g);
                        return;
                    case 1:
                        Postcard addFlags = sp.a().a("/music/activity/zone_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW);
                        addFlags.withString("zone_id", g.getId() + "").withString("zone_name", g.getName()).withInt("zone_position", i2).navigation();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public void g() {
        ((MsZonePresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_selection_zone;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.d.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.d.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.d.setVisibility(8);
        a(3);
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.view.b
    public void a(ArrayList<VipMusicMainZoneResult.DataBean.ListBean> arrayList) {
        if (arrayList.size() > 0) {
            a(0);
            this.d.setVisibility(0);
            this.c.a((List) arrayList, true);
            return;
        }
        a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.f.setState(i);
        if (i == 1) {
            this.f.setClickable(false);
        } else {
            this.f.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.view.b
    public void a(boolean z) {
        if (z) {
            int l = this.c.l();
            if (l != -1) {
                this.c.c(l);
            }
            ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    String x = apk.i().x();
                    if (TextUtils.isEmpty(x) || ((ListSignBean) z.a(x, (Class<Object>) ListSignBean.class)) == null) {
                        return;
                    }
                    List<VipMusicMainZoneResult.DataBean.ListBean> o = MsZoneLayout.this.c.o();
                    for (final int i = 0; i < o.size(); i++) {
                        VipMusicMainZoneResult.DataBean.ListBean listBean = o.get(i);
                        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean> moduleList = listBean.getModuleList();
                        if (moduleList != null && moduleList.size() > 0) {
                            List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> collectList = listBean.getModuleList().get(0).getCollectInfo().getCollectList();
                            ArrayList arrayList = new ArrayList();
                            for (VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean collectListBean : collectList) {
                                arrayList.add(Long.valueOf(collectListBean.getCollect().getId()));
                            }
                            if (MsZoneLayout.this.b(arrayList)) {
                                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneLayout.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        MsZoneLayout.this.c.c(i);
                                    }
                                });
                            }
                        }
                    }
                }
            });
            return;
        }
        int l2 = this.c.l();
        if (l2 != -1) {
            this.c.c(l2);
            this.c.f(-1);
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.zone.view.b
    public void e() {
        this.c.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        i();
    }

    private void i() {
        if (this.d.isComputingLayout()) {
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.zone.view.MsZoneLayout.4
                @Override // java.lang.Runnable
                public void run() {
                    if (MsZoneLayout.this.c == null || MsZoneLayout.this.c.a() <= 0) {
                        return;
                    }
                    MsZoneLayout.this.c.a(0, MsZoneLayout.this.c.a(), "payload");
                }
            });
            return;
        }
        asq asqVar = this.c;
        if (asqVar == null || asqVar.a() <= 0) {
            return;
        }
        asq asqVar2 = this.c;
        asqVar2.a(0, asqVar2.a(), "payload");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<Long> arrayList) {
        String x = apk.i().x();
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
                if (x.contains(ListSignBean.COLLECTID_PREFIX + next + ListSignBean.COLLECTID_SUFFIX)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VipMusicMainZoneResult.DataBean.ListBean listBean) {
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean> moduleList = listBean.getModuleList();
        if (moduleList == null || moduleList.size() <= 0) {
            return;
        }
        List<VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean> collectList = moduleList.get(0).getCollectInfo().getCollectList();
        if (collectList == null || collectList.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (collectList != null) {
            for (VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean collectListBean : collectList) {
                arrayList.add(Long.valueOf(collectListBean.getCollect().getId()));
            }
        }
        String x = apk.i().x();
        MusicRadioItem musicRadioItem = null;
        int i = -1;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long longValue = ((Long) arrayList.get(i2)).longValue();
            if (!TextUtils.isEmpty(x) && x.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
                if (x.contains(ListSignBean.COLLECTID_PREFIX + longValue + ListSignBean.COLLECTID_SUFFIX)) {
                    i = i2;
                }
            }
        }
        if (i != -1) {
            VipMusicMainZoneResult.DataBean.ListBean.ModuleListBean.CollectInfoBean.CollectListBean collectListBean2 = collectList.get(i);
            if (collectListBean2 != null) {
                musicRadioItem = collectListBean2.getCollect();
                atf.a().a(au.b(collectListBean2.getCollect().getId(), collectListBean2.getCollect().getName()).toJson());
            }
        } else {
            int nextInt = new Random().nextInt(arrayList.size());
            if (collectList.get(nextInt) == null || (musicRadioItem = collectList.get(nextInt).getCollect()) == null) {
                return;
            }
            atf.a().a(au.b(musicRadioItem.getId(), musicRadioItem.getName()).toJson());
        }
        musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
        musicRadioItem.setTitle(musicRadioItem.getName());
        ams.a().a(musicRadioItem);
    }
}
