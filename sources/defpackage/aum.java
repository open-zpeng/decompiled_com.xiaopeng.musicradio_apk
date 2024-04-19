package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.netradio.concentration.main.presenter.NrConcentrationPresenter;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import defpackage.beo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: NrConcentrationFragment.java */
@Route(path = "/netradio/fragment/concentration")
/* renamed from: aum  reason: default package */
/* loaded from: classes2.dex */
public class aum extends b<aul, NrConcentrationPresenter> implements aul {
    private e d;
    private BaseRecycleView e;
    private List<Object> f;
    private ArrayList<biv> g = new ArrayList<>();
    private LinearLayoutManager h;
    private LoadingTipsView i;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainNetRadioConcentration";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return beo.d.netradio_fragment_concentration;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = (BaseRecycleView) a(beo.c.netradio_rv_list);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.h = new LinearLayoutManager(getContext());
        this.e.setLayoutManager(this.h);
        this.e.addItemDecoration(new j(0, 0, 0));
        this.f = new ArrayList();
        this.d = new e();
        auh auhVar = new auh();
        aug augVar = new aug();
        this.g.add(auhVar);
        this.g.add(augVar);
        this.d.a(auj.class, auhVar);
        this.d.a(aui.class, augVar);
        this.f.add(new auj());
        this.f.add(new aui());
        this.d.a(this.f);
        this.e.setAdapter(this.d);
        this.e.initVuiAttr("MainNetRadioConcentration", VuiEngine.getInstance(getContext()), true, false);
        this.e.setVuiLayoutLoadable(false);
        this.e.setVuiAction(big.SCROLLBYY.a());
        this.i = (LoadingTipsView) a(beo.c.loading);
        this.i.setAutoClickLoadingEnable(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: aum.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (aum.this.i.getState() == 2) {
                    ((NrConcentrationPresenter) aum.this.b).c();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public NrConcentrationPresenter ao_() {
        return new NrConcentrationPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainNetRadioLocalLeft", "MainLocalTop");
    }

    @Override // defpackage.aul
    public void N_() {
        Log.i("NrConcentrationFragment", "showData");
        if (this.e.getVisibility() == 0) {
            return;
        }
        this.e.setVisibility(0);
        b(0);
    }

    @Override // defpackage.aul
    public void a() {
        Log.i("NrConcentrationFragment", "showLoadingView");
        this.e.setVisibility(4);
        b(1);
    }

    @Override // defpackage.aul
    public void a(String str) {
        Log.i("NrConcentrationFragment", "showErrorView");
        this.e.setVisibility(4);
        b(2);
    }

    public void b(int i) {
        if (this.i.getState() == i) {
            return;
        }
        this.i.setState(i);
        if (i == 1) {
            this.i.setClickable(false);
        } else {
            this.i.setClickable(true);
        }
    }
}
