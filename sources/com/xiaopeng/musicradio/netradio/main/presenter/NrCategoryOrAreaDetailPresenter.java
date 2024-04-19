package com.xiaopeng.musicradio.netradio.main.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListBean;
import com.xiaopeng.musicradio.netradio.main.view.b;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrCategoryOrAreaDetailPresenter extends BaseDealNetValidPresenter<b> {
    protected int b;
    protected boolean c;
    protected long d;
    List<NetRadioInfo> e;
    List<NetRadioInfo> f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;

    public NrCategoryOrAreaDetailPresenter(String str, int i) {
        this.g = "1";
        this.h = 0;
        this.i = false;
        this.j = false;
        this.b = IInputController.KEYCODE_KNOB_WIND_SPD_UP;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = str;
        this.h = i;
        if (str.equals("1")) {
            c();
            Log.d("NRAllRadioPresenter", "area_string: 全国电台二级界面 默认加载北京地区数据");
        }
    }

    public NrCategoryOrAreaDetailPresenter() {
        this.g = "1";
        this.h = 0;
        this.i = false;
        this.j = false;
        this.b = IInputController.KEYCODE_KNOB_WIND_SPD_UP;
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NRAllRadioPresenter", "onCreateView");
        if (this.j) {
            d();
        }
    }

    public void c() {
        int i = this.h;
        if (i == -1000 || i == -2000 || i == -3000) {
            if (a() != null) {
                a().b("");
                return;
            }
            return;
        }
        Log.i("NRAllRadioPresenter", "GetCategoryData" + this.h);
        b(this.g);
    }

    private void b(String str) {
        if (a() != null) {
            a().r_();
            this.d = System.currentTimeMillis();
            this.c = true;
        }
        Log.d("GetAreaData", "loadData: " + str);
        if (TextUtils.equals(str, "1")) {
            g();
        } else if (TextUtils.equals(str, "2")) {
            h();
        }
    }

    private void g() {
        ara.a().b(this.h, 1, 200, new avc<NetRadioInfoListBean>() { // from class: com.xiaopeng.musicradio.netradio.main.presenter.NrCategoryOrAreaDetailPresenter.1
            @Override // defpackage.avc
            public void a(NetRadioInfoListBean netRadioInfoListBean) {
                NrCategoryOrAreaDetailPresenter.this.a(netRadioInfoListBean, "getAreasNetRadio");
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (NrCategoryOrAreaDetailPresenter.this.a() != null) {
                    NrCategoryOrAreaDetailPresenter.this.a().a(str);
                }
            }
        });
    }

    private void h() {
        ara.a().a(this.h, 1, 200, new avc<NetRadioInfoListBean>() { // from class: com.xiaopeng.musicradio.netradio.main.presenter.NrCategoryOrAreaDetailPresenter.2
            @Override // defpackage.avc
            public void a(NetRadioInfoListBean netRadioInfoListBean) {
                NrCategoryOrAreaDetailPresenter.this.a(netRadioInfoListBean, "getCategoryNetRadio");
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (NrCategoryOrAreaDetailPresenter.this.a() != null) {
                    NrCategoryOrAreaDetailPresenter.this.a().a(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final NetRadioInfoListBean netRadioInfoListBean, final String str) {
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            if (currentTimeMillis > this.b) {
                b(netRadioInfoListBean, str);
                return;
            } else {
                ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.main.presenter.NrCategoryOrAreaDetailPresenter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        NrCategoryOrAreaDetailPresenter nrCategoryOrAreaDetailPresenter = NrCategoryOrAreaDetailPresenter.this;
                        nrCategoryOrAreaDetailPresenter.c = false;
                        nrCategoryOrAreaDetailPresenter.b(netRadioInfoListBean, str);
                    }
                }, this.b - currentTimeMillis);
                return;
            }
        }
        b(netRadioInfoListBean, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NetRadioInfoListBean netRadioInfoListBean, String str) {
        if (netRadioInfoListBean.getData() != null && netRadioInfoListBean.getData().getList() != null && netRadioInfoListBean.getData().getList().size() > 0) {
            ArrayList arrayList = new ArrayList();
            List<NetRadioInfo> list = netRadioInfoListBean.getData().getList();
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
            if (a() != null) {
                if ("getCategoryNetRadio".equals(str)) {
                    this.f.clear();
                    this.f.addAll(list);
                    Log.d("GetCategoryData Factory", "分类电台信息: " + list.size() + ",,,," + this.h);
                    StringBuilder sb = new StringBuilder();
                    sb.append("分类电台信息: ");
                    sb.append(z.a(list));
                    Log.d("GetCategoryData Factory", sb.toString());
                } else if ("getAreasNetRadio".equals(str)) {
                    this.e.clear();
                    this.e.addAll(list);
                    Log.d("GetAreaData Factory", "地域电台信息: " + list.size() + ",,,," + this.h);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("地域电台信息: ");
                    sb2.append(z.a(list));
                    Log.d("GetAreaData Factory", sb2.toString());
                }
                a().a(list);
                f();
            }
            this.j = true;
        } else if (a() != null) {
            a().b("");
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(a.a) || this.j) {
            return;
        }
        b(this.g);
    }

    public void d() {
        f();
        if (a() != null) {
            a().a(this.i);
        }
    }

    public void f() {
        if (aei.a().c() == 6) {
            NetRadioProgramInfo d = aps.i().d();
            if ((d != null ? d.getParentInfo() : null) != null) {
                if (this.i) {
                    return;
                }
                this.i = true;
                return;
            }
            this.i = false;
            return;
        }
        this.i = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (!this.i || a() == null) {
            return;
        }
        a().a(this.i);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        d();
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(int i) {
        this.h = i;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        if (a() != null) {
            a().O_();
        }
    }
}
