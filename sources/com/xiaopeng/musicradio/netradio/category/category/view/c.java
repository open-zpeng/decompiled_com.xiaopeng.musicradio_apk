package com.xiaopeng.musicradio.netradio.category.category.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.netradio.category.category.presenter.NrCategoryPresenter;
import com.xiaopeng.musicradio.proto.Netradio;
import java.util.List;
/* compiled from: NrCategoryViewProxy.java */
/* loaded from: classes.dex */
public class c extends aeu<b, NrCategoryPresenter> implements b {
    @Override // com.xiaopeng.musicradio.netradio.category.category.view.b
    public void K_() {
    }

    public c(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public NrCategoryPresenter g() {
        Log.d("NrCategoryViewProxy_", "createPresenter: create P");
        return new NrCategoryPresenter();
    }

    @Override // com.xiaopeng.musicradio.netradio.category.category.view.b
    public void a(List<NetRadioTagInfo> list) {
        Log.d("NrCategoryViewProxy_", "getData: " + list.size());
        a(list, 0);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("NrCategoryViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "requestCategoryRadioList")) {
            ((NrCategoryPresenter) this.c).c();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        a((List<NetRadioTagInfo>) null, 1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        a((List<NetRadioTagInfo>) null, 2);
    }

    private void a(int i) {
        Log.i("getCateData", "ShowLoadingTip" + i);
    }

    public void a(List<NetRadioTagInfo> list, int i) {
        Log.i("NrCategoryViewProxy_", "msgId:NrCategoryViewProxy_radio_category_getdatalist" + list);
        Netradio.RadioTagList.a a = Netradio.RadioTagList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (NetRadioTagInfo netRadioTagInfo : list) {
                a.a(bhw.a(netRadioTagInfo));
            }
        }
        a("NrCategoryViewProxy_radio_category_getdatalist", (AbstractMessageLite) a.build());
    }
}
