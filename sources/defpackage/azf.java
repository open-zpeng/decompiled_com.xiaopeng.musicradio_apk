package defpackage;

import android.content.res.Configuration;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.netradio.presenter.SearchResultNetRadioPresenter;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
/* compiled from: SearchResultNetradioFragment.java */
@Route(path = "/search/fragment/result/netradio")
/* renamed from: azf  reason: default package */
/* loaded from: classes2.dex */
public class azf extends azt<azc, SearchResultNetRadioPresenter> implements azc {
    private ayc h;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // defpackage.azt
    protected int ar_() {
        return 30;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultNetRadio";
    }

    @Override // defpackage.azt
    protected void a() {
        ((SearchResultNetRadioPresenter) this.b).g();
    }

    @Override // defpackage.azt
    protected int r() {
        return a.f.tab_search_net_radio;
    }

    @Override // defpackage.azt
    protected axy s() {
        return this.h;
    }

    @Override // defpackage.azt, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        super.g();
        this.h = new ayc(getContext(), this);
        this.f.setAdapter(this.h);
        this.e.a(new GridLayoutManager.c() { // from class: azf.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                if (azf.this.h.f(i)) {
                    return azf.this.e.c();
                }
                return 1;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y();
    }

    private void y() {
        ban.d(new Runnable() { // from class: azf.2
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList<NetRadioInfo> arrayList = new ArrayList();
                arrayList.addAll(azf.this.h.n());
                for (NetRadioInfo netRadioInfo : arrayList) {
                    netRadioInfo.setHighlightName(be.a(bak.c(a.C0165a.x_theme_primary_normal), netRadioInfo.getName(), ayi.a().c()));
                }
                ban.g(new Runnable() { // from class: azf.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        azf.this.h.a(arrayList);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: w */
    public SearchResultNetRadioPresenter ao_() {
        return new SearchResultNetRadioPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        if (i == 1) {
            this.h.a(dataBean.getRadioList());
            if (dataBean.getRadioList() == null || dataBean.getRadioList().size() == 0) {
                B();
            }
        } else {
            this.h.c(dataBean.getRadioList());
        }
        y();
    }

    @Override // defpackage.azo
    public boolean u() {
        return this.h.a() > 1;
    }

    @Override // defpackage.azo
    public void v() {
        this.h.a(new ArrayList());
    }
}
