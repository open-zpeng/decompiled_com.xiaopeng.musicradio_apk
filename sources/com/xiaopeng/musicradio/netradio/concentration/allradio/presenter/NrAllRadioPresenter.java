package com.xiaopeng.musicradio.netradio.concentration.allradio.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListBean;
import com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter;
import com.xiaopeng.musicradio.netradio.main.view.a;
import defpackage.agm;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrAllRadioPresenter extends NrBasePresenter<a> {
    private boolean c = false;
    List<NetRadioInfo> b = new ArrayList();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NrAllRadioPresenter", "onCreateView");
        if (iVar != null) {
            if (this.c) {
                g();
            } else {
                ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioPresenter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NrAllRadioPresenter.this.c();
                    }
                }, 900L);
            }
        }
    }

    @Override // com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter
    public void c() {
        a(agm.a);
        ara.a().b(0, 1, 200, new avc<NetRadioInfoListBean>() { // from class: com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllRadioPresenter.2
            @Override // defpackage.avc
            public void a(NetRadioInfoListBean netRadioInfoListBean) {
                if (netRadioInfoListBean.getData() != null && netRadioInfoListBean.getData().getList() != null && netRadioInfoListBean.getData().getList().size() >= 0) {
                    ArrayList arrayList = new ArrayList();
                    List<NetRadioInfo> list = netRadioInfoListBean.getData().getList();
                    if (netRadioInfoListBean.getData().getList().size() == 0) {
                        LogUtils.i("NrAllRadioPresenter", "getNrAllRadio response list size empty ==> state: " + agm.c);
                        NrAllRadioPresenter.this.a(agm.c);
                        return;
                    }
                    for (NetRadioInfo netRadioInfo : list) {
                        NetRadioProgramInfo playingInfo = netRadioInfo.getPlayingInfo();
                        if (playingInfo == null || netRadioInfo == null || netRadioInfo.getId() == 0 || TextUtils.isEmpty(netRadioInfo.getName())) {
                            arrayList.add(netRadioInfo);
                        } else {
                            playingInfo.setPlayUrl(netRadioInfo.getPlayUrl());
                            playingInfo.setParentInfo(netRadioInfo);
                        }
                    }
                    list.removeAll(arrayList);
                    if (NrAllRadioPresenter.this.a() != null) {
                        NrAllRadioPresenter.this.b.clear();
                        NrAllRadioPresenter.this.b.addAll(list);
                        NrAllRadioPresenter.this.a().a(list);
                        NrAllRadioPresenter.this.h();
                        NrAllRadioPresenter.this.a(agm.b);
                    }
                    NrAllRadioPresenter.this.c = true;
                    return;
                }
                LogUtils.i("NrAllRadioPresenter", "getNrAllRadio response bean or bean data is null ==> state: " + agm.c);
                NrAllRadioPresenter.this.a(agm.c);
                if (NrAllRadioPresenter.this.a() != null) {
                    NrAllRadioPresenter.this.a().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                LogUtils.i("NrAllRadioPresenter", "All Radio error ==> code: " + i + ",msg: " + str);
                NrAllRadioPresenter.this.a(agm.c);
                if (NrAllRadioPresenter.this.a() != null) {
                    NrAllRadioPresenter.this.a().a("");
                }
            }
        });
    }

    public List d() {
        return this.b;
    }

    @Override // com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter, com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) || this.c) {
            return;
        }
        c();
    }

    @Override // com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter
    public void a(boolean z) {
        super.a(z);
        if (a() != null) {
            a().a(z);
        }
    }

    @Override // com.xiaopeng.musicradio.netradio.main.presenter.NrBasePresenter
    public void f() {
        super.f();
        if (a() != null) {
            a().P_();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Log.i("NrAllRadioPresenter", "ALL_RADIO:" + i);
        apt.a().a(agm.e, i);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agm.c cVar) {
        if (cVar.a() == agm.e) {
            c();
        }
    }
}
