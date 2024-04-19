package com.xiaopeng.musicradio.program.category.presenter;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.agg;
import defpackage.amp;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ReadingCategoriesPresenterNew.java */
/* loaded from: classes2.dex */
public class a extends e<com.xiaopeng.musicradio.program.category.view.e> implements amp.a {
    private List<ReadingCategoryListBeanV3.DataBean.ListBean> b;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void B_() {
        super.B_();
        u.a(this);
        amp.a().a(this);
        List<ReadingCategoryListBeanV3.DataBean.ListBean> list = this.b;
        if (list == null || list.size() == 0) {
            h();
        } else if (j() != null) {
            j().showCategories(this.b);
            j().setLoadingState(0);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void g() {
        super.g();
        amp.a().b(this);
    }

    public void h() {
        if (j() != null) {
            j().setLoadingState(1);
        }
        axp.a().a(true, new avc<ReadingCategoryListBeanV3>() { // from class: com.xiaopeng.musicradio.program.category.presenter.a.1
            @Override // defpackage.avc
            public void a(ReadingCategoryListBeanV3 readingCategoryListBeanV3) {
                if (readingCategoryListBeanV3 != null && readingCategoryListBeanV3.getData() != null) {
                    a.this.b = readingCategoryListBeanV3.getData().getList();
                    if (a.this.j() != null) {
                        a.this.j().showCategories(readingCategoryListBeanV3.getData().getList());
                        a.this.j().setLoadingState(0);
                    }
                } else if (a.this.j() != null) {
                    a.this.j().setLoadingState(2);
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (a.this.j() != null) {
                    a.this.j().setLoadingState(2);
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (j() == null || !com.xiaopeng.musicradio.model.car.a.a().f()) {
            return;
        }
        j().onNetworkValid();
    }

    @Override // defpackage.amp.a
    public void p_() {
        h();
        LogUtils.d("ReadingCategPNew", "onPowerChange loadCategories");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (j() != null) {
            j().updateList();
        }
    }
}
