package com.xiaopeng.musicradio.program.category.view;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import com.xiaopeng.musicradio.program.category.presenter.ReadingCategoriesPresenterU3d;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.utils.be;
import java.util.List;
/* compiled from: ReadingCategoriesViewProxy.java */
/* loaded from: classes2.dex */
public class j extends aeu<e, ReadingCategoriesPresenterU3d> implements e {
    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void onNetworkValid() {
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void updateList() {
    }

    @Override // defpackage.aeu, defpackage.aev
    public void f() {
        super.f();
    }

    public j(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public ReadingCategoriesPresenterU3d g() {
        return new ReadingCategoriesPresenterU3d();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void showCategories(List<ReadingCategoryListBeanV3.DataBean.ListBean> list) {
        a(list, 0);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("ReadingCategoriesViewProxy_", "byte monoMessage" + str + "value--" + bArr);
        super.a(str, bArr);
        if ("loadCategories".equalsIgnoreCase(str)) {
            ((ReadingCategoriesPresenterU3d) this.c).c();
        }
    }

    @Override // com.xiaopeng.musicradio.program.category.view.e
    public void setLoadingState(int i) {
        c_("ShowLoadingTip", String.valueOf(i));
        if (i == 2) {
            a((List<ReadingCategoryListBeanV3.DataBean.ListBean>) null, 1);
        } else if (i == 3) {
            a((List<ReadingCategoryListBeanV3.DataBean.ListBean>) null, 2);
        }
    }

    private void a(List<ReadingCategoryListBeanV3.DataBean.ListBean> list, int i) {
        Log.i("ReadingCategoriesViewProxy_", "msgId:ReadingCategoriesViewProxy_program_categories_datalist--" + list);
        Netprogram.CategoryBeanList.a a = Netprogram.CategoryBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (ReadingCategoryListBeanV3.DataBean.ListBean listBean : list) {
                a.a(Netprogram.CategoryBean.newBuilder().a(listBean.getId()).b(be.e(listBean.getName())).a(be.e(listBean.getLogo())).build());
            }
        }
        a("ReadingCategoriesViewProxy_program_categories_datalist", (AbstractMessageLite) a.build());
    }
}
