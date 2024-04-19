package com.xiaopeng.musicradio.netradio.concentration.allradio.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioTagInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioTagListBean;
import com.xiaopeng.musicradio.netradio.concentration.allradio.view.a;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.beo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class NrAllRadioActPresenter extends BaseDealNetValidPresenter<a> {
    private ArrayList<NetRadioTagInfo> b = new ArrayList<>();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NrAllRadioActPresenter", "onCreate");
        if (iVar != null) {
            c();
        }
    }

    public void c() {
        if (a() != null) {
            a().r_();
        }
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioActPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                List<NetRadioTagInfo> b = z.b(ay.a("SP_PROVINCE"), NetRadioTagInfo.class);
                if (b != null && b.size() > 0) {
                    NrAllRadioActPresenter.this.b.clear();
                    for (NetRadioTagInfo netRadioTagInfo : b) {
                        if (netRadioTagInfo.getBizVal() != 0) {
                            NrAllRadioActPresenter.this.b.add(netRadioTagInfo);
                        }
                    }
                    ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioActPresenter.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (NrAllRadioActPresenter.this.a() != null) {
                                NrAllRadioActPresenter.this.a().a(NrAllRadioActPresenter.this.b);
                            }
                        }
                    });
                    return;
                }
                ara.a().a(new avc<NetRadioTagListBean>() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioActPresenter.1.2
                    @Override // defpackage.avc
                    public void a(NetRadioTagListBean netRadioTagListBean) {
                        NrAllRadioActPresenter.this.b.clear();
                        if (netRadioTagListBean.getData() != null && netRadioTagListBean.getData().getList() != null && netRadioTagListBean.getData().getList().size() > 0) {
                            for (NetRadioTagInfo netRadioTagInfo2 : netRadioTagListBean.getData().getList()) {
                                if (netRadioTagInfo2.getType() == 2 && netRadioTagInfo2.getBizVal() != 0) {
                                    NrAllRadioActPresenter.this.b.add(netRadioTagInfo2);
                                }
                            }
                            NetRadioTagInfo netRadioTagInfo3 = new NetRadioTagInfo();
                            netRadioTagInfo3.setBizVal(-1000);
                            netRadioTagInfo3.setName(be.a(beo.e.hongkong));
                            NetRadioTagInfo netRadioTagInfo4 = new NetRadioTagInfo();
                            netRadioTagInfo4.setBizVal(-2000);
                            netRadioTagInfo4.setName(be.a(beo.e.macao));
                            NetRadioTagInfo netRadioTagInfo5 = new NetRadioTagInfo();
                            netRadioTagInfo5.setBizVal(-3000);
                            netRadioTagInfo5.setName(be.a(beo.e.taiwan));
                            NrAllRadioActPresenter.this.b.add(netRadioTagInfo3);
                            NrAllRadioActPresenter.this.b.add(netRadioTagInfo4);
                            NrAllRadioActPresenter.this.b.add(netRadioTagInfo5);
                            if (NrAllRadioActPresenter.this.a() != null) {
                                NrAllRadioActPresenter.this.a().a(NrAllRadioActPresenter.this.b);
                                ay.b("SP_LOVE_NETRADIO_TAG", "");
                                ay.a("SP_PROVINCE", z.a(NrAllRadioActPresenter.this.b));
                            }
                        } else if (NrAllRadioActPresenter.this.a() != null) {
                            NrAllRadioActPresenter.this.a().a("");
                        }
                    }

                    @Override // defpackage.avc
                    public void a(int i, String str) {
                        if (NrAllRadioActPresenter.this.a() != null) {
                            NrAllRadioActPresenter.this.a().a(str);
                        }
                    }
                });
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && this.b.size() == 0) {
            c();
        }
    }
}
