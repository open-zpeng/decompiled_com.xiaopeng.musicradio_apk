package com.xiaopeng.musicradio.music.concentration.recommend.view;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.q;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmPresenter;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XLinearLayout;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.aep;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MsRmLayout extends BaseFrameLayout<e, MsRmPresenter> implements bic, e {
    private ase c;
    private BaseRecycleView d;
    private GridLayoutManager e;
    private LoadingTipsView f;
    private XLinearLayout g;
    private XLinearLayout h;
    private XTextView i;

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
    public MsRmPresenter a() {
        return new MsRmPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.i = (XTextView) findViewById(b.d.recommend_music_tips);
        this.d = (BaseRecycleView) findViewById(b.d.ms_selection_rm_rv);
        this.f = (LoadingTipsView) findViewById(b.d.ms_selection_rm_loading_item);
        this.f.setAutoClickLoadingEnable(false);
        a(1);
        this.g = (XLinearLayout) findViewById(b.d.change);
        this.h = (XLinearLayout) findViewById(b.d.title_layout);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("defaultExecElementId", "" + this.h.getId());
            ((XLinearLayout) findViewById(b.d.rm_root_layout)).setVuiProps(jSONObject);
        } catch (Exception unused) {
        }
        this.h.setVuiLabel("");
        VuiEngine.getInstance(getContext()).setVuiLabelUnSupportText(this.h);
        this.d.initVuiAttr("MainMusicConcentration", VuiEngine.getInstance(getContext()), false, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c = new ase(getContext(), 1);
        this.d.setItemAnimator(new androidx.recyclerview.widget.e());
        h hVar = new h(5, 45, false);
        hVar.a(50);
        this.d.addItemDecoration(hVar);
        this.d.addItemDecoration(new j(0, 35));
        this.e = new GridLayoutManager(getContext(), 5);
        this.d.setLayoutManager(this.e);
        this.d.setHasFixedSize(true);
        this.d.setItemViewCacheSize(0);
        ((q) this.d.getItemAnimator()).a(false);
        this.d.setAdapter(this.c);
        com.xiaopeng.musicradio.vui.c.a(this.g);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MsRmPresenter) MsRmLayout.this.b).i();
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MsRmLayout.this.a(1);
                MsRmLayout.this.g();
            }
        });
        this.c.a(new aep.c() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmLayout.3
            @Override // defpackage.aep.c
            public void a(int i, int i2) {
                MusicRadioItem g = MsRmLayout.this.c.g(i2);
                if (g == null) {
                    return;
                }
                switch (i) {
                    case 0:
                        if (apk.i().y()) {
                            return;
                        }
                        atf.a().a(au.b(g.getId(), g.getTitle()).toJson());
                        ams.a().a(g);
                        return;
                    case 1:
                        atz.a(g.getId(), g.getLogoUrl(), g.getName(), g.getDescription());
                        return;
                    default:
                        return;
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sp.a().a("/music/activity/rm_category").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).navigation();
            }
        });
    }

    public void g() {
        ((MsRmPresenter) this.b).d();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.ms_layout_selection_rm;
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

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.e
    public void a(ArrayList<MusicRadioItem> arrayList) {
        if (arrayList.size() > 0) {
            a(0);
            this.d.setVisibility(0);
            this.g.setVisibility(0);
            this.i.setVisibility(0);
            if (this.c.a() != arrayList.size()) {
                this.c.a((List) arrayList, true);
            } else {
                this.c.a((List) arrayList, false);
                this.c.a(0, arrayList.size());
            }
            arrayList.clear();
            return;
        }
        a(3);
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.e
    public void a(boolean z) {
        ListSignBean listSignBean;
        if (z) {
            int o = this.c.o();
            if (o != -1) {
                this.c.c(o);
            }
            String x = apk.i().x();
            if (TextUtils.isEmpty(x) || (listSignBean = (ListSignBean) z.a(x, (Class<Object>) ListSignBean.class)) == null) {
                return;
            }
            long collectId = listSignBean.getCollectId();
            List<MusicRadioItem> p = this.c.p();
            for (int i = 0; i < p.size(); i++) {
                if (TextUtils.equals(listSignBean.getPrefix(), ListSignBean.LISTSIGN_RECOMMEN_MUSIC) && collectId == p.get(i).getId()) {
                    this.c.c(i);
                }
            }
            return;
        }
        int o2 = this.c.o();
        if (o2 != -1) {
            this.c.c(o2);
            this.c.h(-1);
        }
    }

    @Override // com.xiaopeng.musicradio.music.concentration.recommend.view.e
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
            this.d.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.view.MsRmLayout.5
                @Override // java.lang.Runnable
                public void run() {
                    if (MsRmLayout.this.c == null || MsRmLayout.this.c.a() <= 0) {
                        return;
                    }
                    MsRmLayout.this.c.a(0, MsRmLayout.this.c.a(), "payload");
                }
            });
            return;
        }
        ase aseVar = this.c;
        if (aseVar == null || aseVar.a() <= 0) {
            return;
        }
        ase aseVar2 = this.c;
        aseVar2.a(0, aseVar2.a(), "payload");
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
}
