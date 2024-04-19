package com.xiaopeng.musicradio.netradio.concentration.localradio.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.bean.xpbean.NetRadioInfoListV2Bean;
import com.xiaopeng.musicradio.netradio.concentration.localradio.view.a;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import defpackage.agm;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class NrLocationRadioPresenter extends BaseDealNetValidPresenter<a> {
    private NetRadioInfo f;
    private String c = "";
    private int d = 2;
    private boolean e = false;
    private boolean g = false;
    private boolean h = true;
    private boolean i = false;
    List<NetRadioInfo> b = new ArrayList();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("NrLocationRadioPresenter", "onCreateView");
        if (iVar != null) {
            if (a() != null) {
                a().M_();
            }
            String b = apd.a().b();
            if (TextUtils.equals(this.c, b)) {
                this.h = true;
            } else {
                this.i = true;
                this.h = false;
                this.c = b;
            }
            if (this.g && this.h) {
                if (a() != null) {
                    a().L_();
                }
                i();
                return;
            }
            d();
        }
    }

    public void c() {
        String b = apd.a().b();
        if (TextUtils.equals(this.c, b)) {
            this.h = true;
        } else {
            this.i = true;
            this.h = false;
            this.c = b;
        }
        d();
    }

    public void d() {
        b(agm.a);
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationRadioPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                List<NetRadioInfo> a = apr.a().a(1, Long.MAX_VALUE);
                if (a != null && a.size() > 0) {
                    NrLocationRadioPresenter.this.f = a.get(0);
                    if (NrLocationRadioPresenter.this.f.getPlayingInfo() != null) {
                        NrLocationRadioPresenter.this.f.setPlayingInfo(NrLocationRadioPresenter.this.f.getPlayingInfo());
                    }
                }
                NrLocationRadioPresenter.this.f();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        Log.i("NrLocationRadioPresenter", "onDestroy");
        u.b(this);
    }

    public void f() {
        ara.a().b(this.c, new avc<NetRadioInfoListV2Bean>() { // from class: com.xiaopeng.musicradio.netradio.concentration.localradio.presenter.NrLocationRadioPresenter.2
            @Override // defpackage.avc
            public void a(NetRadioInfoListV2Bean netRadioInfoListV2Bean) {
                ArrayList<NetRadioInfo> arrayList = new ArrayList<>();
                if (netRadioInfoListV2Bean.getmData() != null && netRadioInfoListV2Bean.getmData().getmLocalList() != null && netRadioInfoListV2Bean.getmData().getmProvinceList() != null) {
                    List<NetRadioInfo> list = netRadioInfoListV2Bean.getmData().getmProvinceList();
                    List<NetRadioInfo> list2 = netRadioInfoListV2Bean.getmData().getmLocalList();
                    if (NrLocationRadioPresenter.this.f != null) {
                        list.remove(NrLocationRadioPresenter.this.f);
                        list2.remove(NrLocationRadioPresenter.this.f);
                    }
                    int size = list.size();
                    int size2 = list2.size();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (size > 0) {
                        int i = size / 2;
                        arrayList2.addAll(list.subList(0, i));
                        arrayList3.addAll(list.subList(i, size));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (size2 > 0) {
                        int i2 = size2 / 2;
                        arrayList4.addAll(list2.subList(0, i2));
                        arrayList5.addAll(list2.subList(i2, size2));
                    }
                    arrayList.addAll(arrayList2);
                    arrayList.addAll(arrayList4);
                    if (NrLocationRadioPresenter.this.f != null) {
                        arrayList.add(NrLocationRadioPresenter.this.f);
                    }
                    int size3 = arrayList.size();
                    arrayList.addAll(arrayList5);
                    arrayList.addAll(arrayList3);
                    if (size3 < 2) {
                        NrLocationRadioPresenter.this.d = 0;
                    } else {
                        NrLocationRadioPresenter.this.d = size3 - 1;
                    }
                    Log.i("ttss", "mpos--" + NrLocationRadioPresenter.this.d);
                    if (NrLocationRadioPresenter.this.a() != null) {
                        NrLocationRadioPresenter.this.b.clear();
                        NrLocationRadioPresenter.this.b.addAll(arrayList);
                        NrLocationRadioPresenter.this.a().a(arrayList, NrLocationRadioPresenter.this.d, NrLocationRadioPresenter.this.i);
                        NrLocationRadioPresenter.this.i = false;
                        NrLocationRadioPresenter.this.b(agm.b);
                    }
                    NrLocationRadioPresenter.this.g = true;
                    return;
                }
                if (NrLocationRadioPresenter.this.a() != null) {
                    NrLocationRadioPresenter.this.a().a("");
                }
                LogUtils.i("NrLocationRadioPresenter", " response ==> state: things in bean is null ");
                NrLocationRadioPresenter.this.b(agm.c);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (NrLocationRadioPresenter.this.a() != null) {
                    NrLocationRadioPresenter.this.a().a("");
                }
                LogUtils.i("NrLocationRadioPresenter", "Local Radio error ==> code: " + i + ",msg: " + str);
                NrLocationRadioPresenter.this.b(agm.c);
            }
        });
    }

    public List g() {
        return this.b;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) || this.g) {
            return;
        }
        d();
    }

    public void a(int i) {
        this.d = i;
    }

    public int h() {
        return this.d;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (!this.e || a() == null) {
            return;
        }
        a().a(this.e);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void newLocationEvent(agg.q qVar) {
        this.c = apd.a().b();
        this.i = true;
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        i();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().M_();
        }
        i();
    }

    public void i() {
        if (aei.a().c() == 6) {
            NetRadioProgramInfo d = aps.i().d();
            if ((d != null ? d.getParentInfo() : null) != null) {
                if (!this.e) {
                    this.e = true;
                }
                if (a() != null) {
                    a().a(this.e);
                    return;
                }
                return;
            }
            this.e = false;
            if (a() != null) {
                a().a(this.e);
                return;
            }
            return;
        }
        this.e = false;
        if (a() != null) {
            a().a(this.e);
        }
    }

    public void a(NetRadioInfo netRadioInfo) {
        if (netRadioInfo != null) {
            auo.a().a(netRadioInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Log.i("NrLocationRadioPresenter", "LOCAL_RADIO:" + i);
        apt.a().a(agm.d, i);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agm.c cVar) {
        if (cVar.a() == agm.d) {
            d();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        if (sVar == null || !sVar.a() || this.g) {
            return;
        }
        Log.i("NrLocationRadioPresenter", "onPowerChange: has no local data, try to pull data");
        d();
    }
}
