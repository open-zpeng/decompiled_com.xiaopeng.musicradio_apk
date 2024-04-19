package com.xiaopeng.musicradio.program.category.view;

import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import java.util.List;
/* compiled from: IReadingCategoriesViewNew.java */
/* loaded from: classes2.dex */
public interface e {
    void onNetworkValid();

    void setLoadingState(int i);

    void showCategories(List<ReadingCategoryListBeanV3.DataBean.ListBean> list);

    void updateList();
}
