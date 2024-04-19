package com.xiaopeng.musicradio.program.category.view;

import android.content.Context;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.ReadingCategoryListBeanV3;
import com.xiaopeng.musicradio.program.category.presenter.CategoryListPresenter;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netprogram;
import com.xiaopeng.musicradio.utils.be;
import java.util.List;
/* compiled from: CategoryListViewProxy.java */
/* loaded from: classes2.dex */
public class b extends aeu<c, CategoryListPresenter> implements c {
    @Override // com.xiaopeng.musicradio.program.category.view.c
    public void a_(long j) {
    }

    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public CategoryListPresenter g() {
        return new CategoryListPresenter();
    }

    @Override // com.xiaopeng.musicradio.program.category.view.c
    public void a(List<RdAlbumBean> list, int i, boolean z) {
        if (i == 1) {
            a(list, 0);
        } else if (z) {
        } else {
            b(list, 0);
        }
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void a(boolean z, int i, int i2) {
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        Log.i("CategoryListViewProxy_", "byte monoMessage" + str + "value--" + bArr);
        super.a(str, bArr);
        if ("requestList".equalsIgnoreCase(str)) {
            try {
                Netprogram.CategoryBean parseFrom = Netprogram.CategoryBean.parseFrom(bArr);
                Log.d("CategoryListViewProxy_", "byte monoMessage info: " + parseFrom);
                ReadingCategoryListBeanV3.DataBean.ListBean listBean = new ReadingCategoryListBeanV3.DataBean.ListBean();
                listBean.setId(parseFrom.getId());
                listBean.setLogo(be.e(parseFrom.getLogo()));
                listBean.setName(be.e(parseFrom.getName()));
                ((CategoryListPresenter) this.c).a(listBean.getId());
                ((CategoryListPresenter) this.c).c();
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        } else if ("playRdAlbum".equalsIgnoreCase(str)) {
            RdAlbumBean g = bhx.g(bArr);
            if (g != null) {
                ((CategoryListPresenter) this.c).b(g);
            }
        } else if ("loadNextPage".equalsIgnoreCase(str)) {
            ((CategoryListPresenter) this.c).d();
        }
    }

    private void a(List<RdAlbumBean> list, int i) {
        Log.i("CategoryListViewProxy_", "msgId:CategoryListViewProxy_program_category_init_datalist--" + list);
        a("CategoryListViewProxy_program_category_init_datalist", list, i);
    }

    private void b(List<RdAlbumBean> list, int i) {
        Log.i("CategoryListViewProxy_", "msgId:CategoryListViewProxy_program_category_more_datalist--" + list);
        a("CategoryListViewProxy_program_category_more_datalist", list, i);
    }

    private void a(String str, List<RdAlbumBean> list, int i) {
        Netprogram.AlbumBeanList.a a = Netprogram.AlbumBeanList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RdAlbumBean rdAlbumBean : list) {
                a.a(bhw.a(rdAlbumBean));
            }
        }
        a("CategoryListViewProxy_program_category_more_datalist", (AbstractMessageLite) a.build());
    }

    private void a(boolean z) {
        Log.i("CategoryListViewProxy_", "msgId:CategoryListViewProxy_program_category_hasmore--" + z);
        a("CategoryListViewProxy_program_category_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void X_() {
        a(3);
        b((List<RdAlbumBean>) null, 2);
    }

    @Override // com.xiaopeng.musicradio.program.common.view.b
    public void a(String str, int i) {
        if (i == 1) {
            a(2);
            a((List<RdAlbumBean>) null, 1);
            return;
        }
        a(0);
        b((List<RdAlbumBean>) null, 1);
    }

    private void a(int i) {
        Log.i("CategoryListViewProxy_", "ShowLoadingTip" + i);
    }
}
