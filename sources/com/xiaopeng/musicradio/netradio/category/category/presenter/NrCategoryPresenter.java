package com.xiaopeng.musicradio.netradio.category.category.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioTagListBean;
import com.xiaopeng.musicradio.netradio.category.category.view.b;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrCategoryPresenter extends BaseDealNetValidPresenter<b> {
    private boolean b = false;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NRCategoryPresenter", "onCreate");
        if (iVar == null || this.b) {
            return;
        }
        c();
    }

    public void c() {
        if (a() != null) {
            a().r_();
        }
        ara.a().a(new avc<NetRadioTagListBean>() { // from class: com.xiaopeng.musicradio.netradio.category.category.presenter.NrCategoryPresenter.1
            @Override // defpackage.avc
            public void a(NetRadioTagListBean netRadioTagListBean) {
                ArrayList arrayList = new ArrayList();
                if (netRadioTagListBean.getData() != null && netRadioTagListBean.getData() != null && netRadioTagListBean.getData().getList().size() > 0) {
                    List<NetRadioTagInfo> list = netRadioTagListBean.getData().getList();
                    for (NetRadioTagInfo netRadioTagInfo : list) {
                        if (netRadioTagInfo.getType() != 1 && netRadioTagInfo.getBizVal() != 0) {
                            arrayList.add(netRadioTagInfo);
                        }
                    }
                    list.removeAll(arrayList);
                    if (NrCategoryPresenter.this.a() != null) {
                        NrCategoryPresenter.this.a().a(list);
                    }
                    NrCategoryPresenter.this.b = true;
                } else if (NrCategoryPresenter.this.a() != null) {
                    NrCategoryPresenter.this.a().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (NrCategoryPresenter.this.a() != null) {
                    NrCategoryPresenter.this.a().a(str);
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(a.a) || this.b) {
            return;
        }
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        if (a() != null) {
            a().K_();
        }
    }
}
