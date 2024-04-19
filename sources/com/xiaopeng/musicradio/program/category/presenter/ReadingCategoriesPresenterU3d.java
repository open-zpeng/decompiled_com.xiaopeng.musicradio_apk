package com.xiaopeng.musicradio.program.category.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.program.category.view.e;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ReadingCategoriesPresenterU3d extends BasePresenter<e> {
    private List<ReadingCategoryListBeanV3.DataBean.ListBean> b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        if (iVar != null) {
            List<ReadingCategoryListBeanV3.DataBean.ListBean> list = this.b;
            if (list == null || list.size() == 0) {
                c();
            } else if (a() != null) {
                a().showCategories(this.b);
                a().setLoadingState(0);
            }
        }
    }

    public void c() {
        if (a() != null) {
            a().setLoadingState(1);
        }
        axp.a().a(true, new avc<ReadingCategoryListBeanV3>() { // from class: com.xiaopeng.musicradio.program.category.presenter.ReadingCategoriesPresenterU3d.1
            @Override // defpackage.avc
            public void a(ReadingCategoryListBeanV3 readingCategoryListBeanV3) {
                if (readingCategoryListBeanV3 != null && readingCategoryListBeanV3.getData() != null) {
                    ReadingCategoriesPresenterU3d.this.b = readingCategoryListBeanV3.getData().getList();
                    if (ReadingCategoriesPresenterU3d.this.a() != null) {
                        ReadingCategoriesPresenterU3d.this.a().showCategories(readingCategoryListBeanV3.getData().getList());
                        ReadingCategoriesPresenterU3d.this.a().setLoadingState(0);
                    }
                } else if (ReadingCategoriesPresenterU3d.this.a() != null) {
                    ReadingCategoriesPresenterU3d.this.a().setLoadingState(3);
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (ReadingCategoriesPresenterU3d.this.a() != null) {
                    ReadingCategoriesPresenterU3d.this.a().setLoadingState(2);
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (a() != null) {
            a().onNetworkValid();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        LogUtils.d("ReadingCategPNew", "onPowerChange isOn:" + sVar.a());
        if (sVar.a()) {
            c();
            LogUtils.d("ReadingCategPNew", "onPowerChange loadCategories");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().updateList();
        }
    }
}
