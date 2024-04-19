package com.xiaopeng.musicradio.netradio.category.category.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListBean;
import com.xiaopeng.musicradio.netradio.category.category.view.a;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import java.util.ArrayList;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrCategorySubPresenter extends BaseDealNetValidPresenter<a> {
    private ArrayList<NetRadioInfo> b = new ArrayList<>();
    private boolean c = false;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NRAllRadioPresenter", "onCreateView");
        if (this.b.size() > 0) {
            d();
        } else {
            c();
        }
    }

    private void c() {
        if (a() != null) {
            a().r_();
        }
        ara.a().b(0, 1, 200, new avc<NetRadioInfoListBean>() { // from class: com.xiaopeng.musicradio.netradio.category.category.presenter.NrCategorySubPresenter.1
            @Override // defpackage.avc
            public void a(NetRadioInfoListBean netRadioInfoListBean) {
                NrCategorySubPresenter.this.b.clear();
                if (netRadioInfoListBean.getData() != null && netRadioInfoListBean.getData().getList().size() > 0) {
                    for (NetRadioInfo netRadioInfo : netRadioInfoListBean.getData().getList()) {
                        NetRadioProgramInfo playingInfo = netRadioInfo.getPlayingInfo();
                        if (playingInfo != null && netRadioInfo != null && netRadioInfo.getId() >= 0 && !TextUtils.isEmpty(netRadioInfo.getName())) {
                            playingInfo.setPlayUrl(netRadioInfo.getPlayUrl());
                            playingInfo.setParentInfo(netRadioInfo);
                            NrCategorySubPresenter.this.b.add(netRadioInfo);
                        }
                    }
                    if (NrCategorySubPresenter.this.a() != null) {
                        NrCategorySubPresenter.this.a().a(NrCategorySubPresenter.this.b);
                    }
                } else if (NrCategorySubPresenter.this.a() != null) {
                    NrCategorySubPresenter.this.a().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (NrCategorySubPresenter.this.a() != null) {
                    NrCategorySubPresenter.this.a().a(str);
                }
            }
        });
    }

    private void d() {
        if (aei.a().c() == 6) {
            NetRadioProgramInfo d = aps.i().d();
            if ((d != null ? d.getParentInfo() : null) != null) {
                if (!this.c) {
                    this.c = true;
                }
                if (a() != null) {
                    a().a(this.c);
                    return;
                }
                return;
            }
            this.c = false;
            if (a() != null) {
                a().a(this.c);
                return;
            }
            return;
        }
        this.c = false;
        if (a() != null) {
            a().a(this.c);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (!this.c || a() == null) {
            return;
        }
        a().a(this.c);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        d();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && this.b.size() == 0) {
            c();
        }
    }
}
