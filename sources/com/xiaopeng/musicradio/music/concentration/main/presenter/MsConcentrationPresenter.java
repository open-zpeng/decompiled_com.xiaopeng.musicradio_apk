package com.xiaopeng.musicradio.music.concentration.main.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayInfo;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.agc;
import defpackage.age;
import defpackage.agh;
import defpackage.amp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MsConcentrationPresenter extends BaseDealNetValidPresenter<art> implements amp.a, amp.b {
    private static final Map<String, Integer> b = new HashMap();
    private n<Boolean> e;
    private long f;
    private int c = 1;
    private boolean d = false;
    private ArrayList<MusicRadioItem> g = new ArrayList<>();
    private ArrayList<MusicRadioItem> h = new ArrayList<>();
    private int i = 10;
    private boolean j = false;
    private ArrayList<MusicRadioItem> k = new ArrayList<>();
    private ArrayList<MusicRadioItem> l = new ArrayList<>();

    static {
        b.put("daily", 0);
        b.put("concentration", 1);
        b.put("plisten", 15);
        b.put(TtmlNode.TAG_REGION, 35);
        b.put("radio", 39);
    }

    @Override // defpackage.amp.a
    public void p_() {
        Log.i("MsConcentrationPresente", "msconcentration--onDataFetch");
        this.e.a((n<Boolean>) true);
    }

    @Override // defpackage.amp.b
    public void q_() {
        Log.i("MsConcentrationPresente", "msconcentration--onErrorRetry");
        this.e.a((n<Boolean>) true);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsConcentrationPresente", "onCreateView mHasLoadAll" + this.d);
        u.a(this);
        if (iVar != null) {
            c();
            this.f = amp.a().b();
            amp.a().a(this);
            if (this.e == null) {
                this.e = new n<>();
            }
            this.e.a(iVar, new o<Boolean>() { // from class: com.xiaopeng.musicradio.music.concentration.main.presenter.MsConcentrationPresenter.1
                @Override // androidx.lifecycle.o
                public void a(Boolean bool) {
                    if (bool == null || !bool.booleanValue() || !MsConcentrationPresenter.this.d || MsConcentrationPresenter.this.f == amp.a().b()) {
                        return;
                    }
                    Log.i("MsConcentrationPresente", "msconcentration--observe--onChanged");
                    MsConcentrationPresenter.this.c();
                }
            });
        }
        if (!this.d || a() == null) {
            return;
        }
        a().w_();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        Log.i("MsConcentrationPresente", "onDestroy");
        this.e.a(iVar);
        amp.a().b(this);
        this.f = amp.a().b();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onSwitchElement(agh.a aVar) {
        Integer num;
        Log.i("MsConcentrationPresente", "onSwitchElement: " + aVar.b());
        if (TextUtils.isEmpty(aVar.b()) || (num = b.get(aVar.b())) == null || a() == null || aVar.a() != 0) {
            return;
        }
        u.d(aVar);
        a().e_(num.intValue());
    }

    public void c() {
        if (this.d) {
            if (this.f != amp.a().b()) {
                d();
                return;
            }
            return;
        }
        if (a() != null) {
            a().a();
        }
        d();
    }

    private void d() {
        Log.i("MsConcentrationPresente", "loadConcentrationData: start");
        aqw.a().a(new aqv() { // from class: com.xiaopeng.musicradio.music.concentration.main.presenter.MsConcentrationPresenter.2
            @Override // defpackage.aqv
            public void a(List<MusicRadioItem> list, List<MusicRadioItem> list2, XpPlayInfo xpPlayInfo, List<MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean> list3, List<MusicRadioItem> list4) {
                art a = MsConcentrationPresenter.this.a();
                if (a != null) {
                    Log.i("MsConcentrationPresente", "setQQConcentration: success");
                    a.v_();
                    a.a(list);
                    a.b(list2);
                    a.a(xpPlayInfo.getCategoryId(), xpPlayInfo.getName(), xpPlayInfo.getCollectList());
                    a.c(list3);
                    a.d(list4);
                }
            }

            @Override // defpackage.aqv
            public void a() {
                Log.i("MsConcentrationPresente", "loadConcentrationData: get result fail");
                art a = MsConcentrationPresenter.this.a();
                if (a != null) {
                    a.a("");
                }
            }
        }, "100823", 1, 1, this.c);
    }

    public void a(boolean z) {
        this.d = z;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (a() != null) {
            a().w_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicInfo(age.c cVar) {
        if (a() != null) {
            a().w_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void RmChange(agc.c cVar) {
        if (a() != null) {
            a().a(cVar.a());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void RadioChange(agc.a aVar) {
        if (a() != null) {
            a().d(aVar.a());
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (this.d) {
            return;
        }
        c();
    }
}
